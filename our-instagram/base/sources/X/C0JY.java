package X;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: X.0JY, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0JY {
    public static String A00(Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
                try {
                    th.printStackTrace(printWriter);
                    printWriter.close();
                    String obj = stringWriter.toString();
                    stringWriter.close();
                    return obj;
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public static void A01(JsonWriter jsonWriter, Throwable th) {
        jsonWriter.beginObject();
        jsonWriter.name("excls").value(th.getClass().getName());
        jsonWriter.name("msg").value(th.getMessage());
        jsonWriter.name("stack");
        jsonWriter.beginArray();
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            jsonWriter.beginObject();
            jsonWriter.name("cls").value(stackTraceElement.getClassName());
            jsonWriter.name("method").value(stackTraceElement.getMethodName());
            jsonWriter.name("ln").value(stackTraceElement.getLineNumber());
            jsonWriter.endObject();
        }
        jsonWriter.endArray();
        Throwable cause = th.getCause();
        if (cause != null) {
            jsonWriter.name("cause");
            A01(jsonWriter, cause);
        }
        jsonWriter.endObject();
    }
}
