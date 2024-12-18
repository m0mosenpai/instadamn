package X;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.Sbl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63064Sbl {
    public static final int A00(Throwable th) {
        if (th instanceof C64863TXo) {
            return ((C64863TXo) th).A00;
        }
        if (th instanceof REZ) {
            return ((REZ) th).A00;
        }
        return 0;
    }

    public static final String A01(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            return AbstractC166987dD.A19(stringWriter.getBuffer());
        } finally {
            try {
                stringWriter.close();
                printWriter.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A02(AbstractCollection abstractCollection, Iterator it) {
        String str;
        Throwable th = (Throwable) it.next();
        int A00 = A00(th);
        if (!(th instanceof C64863TXo) && !(th instanceof REZ)) {
            if (th == null || (str = th.getMessage()) == null) {
                str = "Unknown error type";
            }
        } else {
            str = ((C64863TXo) th).A02;
        }
        abstractCollection.add(AnonymousClass001.A04(A00, ", ", str));
    }
}
