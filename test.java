import javax.swing.JTextArea;
import java.io.*;


public final class TextAreaWriter extends Writer {

	private final JTextArea textArea;

	public TextAreaWriter(final JTextArea textArea) {
		this.textArea = textArea;
	}

    @Override
    public void flush(){ }
    
    @Override
    public void close(){ }

	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		textArea.append(new String(cbuf, off, len));
	}
	
}
