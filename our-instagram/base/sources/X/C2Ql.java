package X;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: X.2Ql, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2Ql {
    public static final String A00(Throwable th) {
        C14360o3.A0B(th, 0);
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String obj = stringWriter.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static final void A01(Throwable th, Throwable th2) {
        C14360o3.A0B(th, 0);
        C14360o3.A0B(th2, 1);
        if (th != th2) {
            AbstractC50732Uu.A00.A01(th, th2);
        }
    }
}
