package X;

import android.os.Handler;

/* renamed from: X.4Ub, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96184Ub {
    public final Handler A00;
    public final C4TX A01;

    public final void A00(final C98154au c98154au) {
        synchronized (c98154au) {
        }
        this.A00.post(new Runnable() { // from class: X.5iN
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (c98154au) {
                }
            }
        });
    }

    public C96184Ub(Handler handler, C4TX c4tx) {
        handler.getClass();
        this.A00 = handler;
        this.A01 = c4tx;
    }
}
