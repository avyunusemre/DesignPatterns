package factory;

public class PdfExporter implements FileExporter{
    @Override
    public String export(String content) {
        return "PDF => " + content;
    }
}
