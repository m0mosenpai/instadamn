package X;

import java.io.IOException;

/* renamed from: X.1Bt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23311Bt {
    public static boolean A00;
    public static C23311Bt A01;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1Bt, java.lang.Object] */
    public static synchronized C23311Bt A00() {
        C23311Bt c23311Bt;
        synchronized (C23311Bt.class) {
            C23311Bt c23311Bt2 = A01;
            c23311Bt = c23311Bt2;
            if (c23311Bt2 == null) {
                ?? obj = new Object();
                A01 = obj;
                c23311Bt = obj;
            }
        }
        return c23311Bt;
    }

    public final C3JY A01(C26461Qb c26461Qb) {
        C1QW c1qw = c26461Qb.A02;
        if (c1qw.A07 != C05F.A00) {
            C26581Qn c26581Qn = new C26581Qn(c1qw.A09, A00);
            C13080lu A002 = AbstractC13090lv.A00("SyncHttpService.sendRequest");
            try {
                c26461Qb.A01(new C1U0(this, C1C6.A00().A02(c26581Qn, c1qw, c26461Qb.A03)));
                A002.close();
                C13080lu A003 = AbstractC13090lv.A00("SyncHttpService.waitForResponse");
                C26581Qn.A00(c26581Qn);
                IOException iOException = c26581Qn.A09;
                if (iOException == null) {
                    c26581Qn.A00.getClass();
                    C3JY c3jy = c26581Qn.A00;
                    A003.close();
                    return c3jy;
                }
                throw iOException;
            } catch (Throwable th) {
                try {
                    A002.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException("SyncHttpService doesn't support HEAD request.  It will create a deadlock with no response data callback");
    }
}
