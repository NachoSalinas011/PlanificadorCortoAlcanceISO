/*------------------------- Algoritmo FIFO ------------------------*/
//  Planificador de corto alcance (PCA)
//
// Es el principal planificador del Sistema Operativo, está continuamente 
// funcionando, es quien decide que proceso pasa a ejecutado, usa distintas 
// políticas o algoritmos, brinda cierta equidad.
// v1.2
// Autor: José Victor Ibáñez
/*------------------------- ------------- -------------------------*/

package Test;

import Model.admProcesamiento;
import Model.admTablaProcesos;
import Model.Prioridad;

public class TestSPNRobin {

	public static void main(String[] args) {

		admProcesamiento admP1 = new admProcesamiento(20, 45);

		admP1.agregarProceso("P1", 1, 4, 2, 1, Prioridad.Baja);
		admP1.agregarProceso("P2", 1, 2, 3, 2, Prioridad.Media);
		admP1.agregarProceso("P3", 2, 5, 2, 4, Prioridad.Alta);
		admP1.agregarProceso("P4", 3, 1, 5, 3, Prioridad.Alta);
		admP1.agregarProceso("P5", 3, 7, 1, 2, Prioridad.Media);
		admP1.agregarProceso("P6", 4, 1, 3, 7, Prioridad.Media);
		
		System.out.println("----------- Planificador Shortest Process Next Quantum= 1-----------");
		System.out.println(admP1.mostrarPlanificador(admP1.planificarSPNRobin(3)));
		System.out.println(admP1.mostrarProcesos() + "\n-> hay 1 procesador" + "\n-> E/S Se realiza en paralelo\n");
		
		System.out.println("----------- Resultados -----------");
		admTablaProcesos admTP = new admTablaProcesos(admP1);
		//System.out.println(admTP.mostrarResultados(admP1.planificarFIFO()));
		System.out.println(admTP.mostrarResultados(admP1.planificarSPNRobin(3)));
	}

}
