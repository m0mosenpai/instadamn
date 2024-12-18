package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.8nE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC196848nE {
    public static final C18240vB A00;
    public static final C196868nG A01;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.8nG, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.A02 = new SimpleDateFormat("'IMG'_yyyyMMdd_HHmmss", Locale.US);
        A01 = obj;
        C0o0 A002 = AbstractC14350nz.A00();
        A002.A01 = "RequestDisplayRotation";
        A00 = new C18240vB(A002);
    }

    public static String A00(long j) {
        String format;
        C196868nG c196868nG = A01;
        synchronized (c196868nG) {
            format = c196868nG.A02.format(new Date(j));
            if (j / 1000 == c196868nG.A01 / 1000) {
                int i = c196868nG.A00 + 1;
                c196868nG.A00 = i;
                format = AnonymousClass001.A0b(format, "_", i);
            } else {
                c196868nG.A01 = j;
                c196868nG.A00 = 0;
            }
        }
        return format;
    }
}
