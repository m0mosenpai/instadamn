package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.2sd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC62382sd {
    public static final InterfaceC09390do A00 = AbstractC09440dt.A01(C62392se.A00);

    public static final int A00(final Context context, final AbstractC018607g abstractC018607g, final C11R c11r, final Integer num) {
        final int andIncrement = AbstractC62402sf.A00.getAndIncrement();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            C0w9.A04("LoaderScheduler", AnonymousClass001.A0R("Tried to initialize loader on non-UI thread for module: ", C26771Rh.A00().A00), 1);
            ((Handler) A00.getValue()).post(new Runnable() { // from class: X.5d3
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC018607g abstractC018607g2 = abstractC018607g;
                    int i = andIncrement;
                    abstractC018607g2.A02(null, new C62412sg(context, abstractC018607g2, c11r, num, i), i);
                }
            });
            return andIncrement;
        }
        abstractC018607g.A02(null, new C62412sg(context, abstractC018607g, c11r, num, andIncrement), andIncrement);
        return andIncrement;
    }
}
