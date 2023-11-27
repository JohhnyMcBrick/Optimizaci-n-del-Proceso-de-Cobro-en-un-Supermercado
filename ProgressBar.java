public class ProgressBar {
    public static void main(String[] args) {
        int total = 100; // Total de iteraciones
        for (int i = 0; i <= total; i++) {
            updateProgressBar(i, total);
            // Simula alguna tarea que lleva tiempo
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void updateProgressBar(int progress, int total) {
        int barLength = 50; // Longitud de la barra de carga
        float percentage = ((float) progress / total) * 100;
        int currentProgress = (int) (barLength * (percentage / 100));

        StringBuilder progressBar = new StringBuilder();
        progressBar.append("Progreso: [");
        for (int i = 0; i < barLength; i++) {
            if (i <= currentProgress - 1) {
                progressBar.append("=");
            } else if (i == currentProgress) {
                progressBar.append(">");
            } else {
                progressBar.append(" ");
            }
        }
        progressBar.append("] " + (int) percentage + "%");
        System.out.print("\r" + progressBar.toString());
    }
}
