package es.studium.EjereciciosBoletin1;
import java.io.IOException;
import java.util.Scanner;
public class Preguntas_y_Respuestas {

	private static String questionName = "�C�mo te llamas?";
	private static String questionYears = "�Cu�ntos a�os tienes?";
	private static String questionCurso = "�En qu� curso est�s?";

	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);

		String name = questionNameUsuario(in);

		String years = questionYearsUsuario(in);

		String curso = questionCursoUsuario(in);

		mensaje(name, years, curso);

		in.close();}

	public static String questionCursoUsuario(Scanner in) {
		System.out.println(questionCurso);
		String curso = in.nextLine();
		return curso;
	}

	public static String questionYearsUsuario(Scanner in) {
		System.out.println(questionYears);
		String years = in.nextLine();
		return years;
	}

	public static String questionNameUsuario(Scanner in) {
		System.out.println(questionName);
		String name = in.nextLine();
		return name;
	}

	public static void mensaje(String name, String years, String curso)
	{
		System.out.println("Te llamas " + name + ", tienes " + years + " a�os y est�s en " + curso);
	}



}
