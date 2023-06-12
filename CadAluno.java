package atividade1;

import java.util.Scanner;

public class Atividade8Java {

    public static void main(String[] args) {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Selecione uma opção:\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("\t1 - Incluir novo aluno.");
            System.out.println("\t2 - Localizar aluno.");
            System.out.println("\t3 - Listar todos alunos.");
            System.out.println("\t4 - Remover aluno e notas.");
            System.out.println("\t5 - Editar alunos e notas.");
            System.out.println("\t6 - Sair\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n********************** INCLUIR **********************");
                    inserir();
                    break;
                case 2:
                    System.out.println("\n********************** LOCALIZAR **********************");
                    break;
                case 3:
                    System.out.println("\n********************** LISTAR **********************");
                    break;
                case 4:
                    System.out.println("\n********************** REMOVER **********************");
                    break;
                case 5:
                    System.out.println("\n********************** EDITAR **********************");
                    break;
                case 6:
                    System.out.println("\n********************** SAIR **********************");
                    System.out.println("\n\t>>> PROGRAMA FINALIZADO! <<<\n\n*****************************************************\n");
                    break;
                default:
                    System.out.println("\n\tOpção invalida!!\n\n");
                    break;
            }
        } while (opcao != 6);
    }
    public static void inserir(){
        System.out.println("\nHello World!\n");
    }
}
//Crie um programa que gerencie os alunos e notas de LP. Devem ser criados vetores
//que armazenem o nome do aluno, a nota1, a nota2 e a nota3. O programa deve ter as
//seguintes opções (selecionadas por meio do comando switch que estará contido
//dentro de um do-while): incluir um aluno com suas notas, localizar um aluno e retornar
//a sua soma de notas, listar todos os alunos e suas notas, remover um aluno e suas
//notas e sair do programa.
