package X;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: X.0LA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LA {
    public static PrintWriter A00;
    public static StringWriter A01;

    static {
        StringWriter stringWriter = new StringWriter(16000);
        A01 = stringWriter;
        A00 = new PrintWriter(stringWriter);
    }

    public static String A01(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        return stringWriter.toString();
    }

    public static String A00(String str, int i) {
        int i2;
        int lastIndexOf;
        int indexOf;
        int length = str.length();
        if (length > i && (lastIndexOf = str.lastIndexOf("\n", (i2 = (i * 3) / 4))) >= 0 && (indexOf = str.indexOf("\n", length - (i - i2))) >= 0) {
            return AnonymousClass001.A0u(str.substring(0, lastIndexOf + 1), "\t", "--------- TRIMMED FOR OVERFLOW ---------", str.substring(indexOf));
        }
        return str;
    }
}
