
#include <stdlib.h>
#include <stdio.h>

    FILE* fptr;

    //iniciando a struct informações
    struct informacoes{
        int CPF, telefone;
        char nome[100];
        char email[100];
    } quantidade[ 6 ];

    //iniciando a função main
    int main() {

        //declarando variáveis
        int i;

        //abrindo o arquivo
        errno_t err = fopen_s(&fptr, "3840038.csv", "w+");
       
        // verificando a abertura do arquivo
        if (err)
            printf_s("Arquivo não foi criado\n");
        else
        {

            printf_s("Arquivo criado com sucesso\n");
            //recebendo informações e escrevendo no arquivo
            fprintf_s(fptr, "nome;cpf;telefone;email\n");
            for (i = 0; i < 6; i++)
            {
                printf("\nDigite os dados para o registro %i\n", i + 1);


                printf("Nome: "); //acredito ser algum detalhe desta interface, mas depois do primeiro laço não executa mais o fgets do nome.
    
                fgets(quantidade[i].nome, 30, stdin);
                fprintf_s(fptr, "%s;", quantidade[i].nome);printf("Email: ");
                fgets(quantidade[i].email, 30, stdin);
                fprintf_s(fptr, "%s;", quantidade[i].email);
                printf("Telefone: ");
                scanf_s("%i", &quantidade[i].telefone);
                fprintf_s(fptr, "%i", quantidade[i].telefone);
                printf("CPF: ");
                scanf_s("%i", &quantidade[i].CPF);
                fprintf_s(fptr, "%i;", quantidade[i].CPF);
            }
            
            //fechando o arquivo
            fclose(fptr);

            errno_t err = fopen_s(&fptr, "3840038.csv", "r+");
            
            //abrindo o arquivo novamente
            if (err)
                printf_s("\n\nArquivo não aberto\n");
            else
            {

                //Lendo o arquivo
                printf_s("\n\nArquivo aberto com sucesso\n");
                for (i = 0; i < 6; i++)
                {
                    printf_s("%s; %i; %i; %s", quantidade[i].nome, quantidade[i].CPF, quantidade[i].telefone, quantidade[i].email);
                }

                //fechando o arquivo
                fclose(fptr);
                
                return 0;
        }
    }
}
    