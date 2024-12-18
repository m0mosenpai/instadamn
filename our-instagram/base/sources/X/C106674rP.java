package X;

import android.os.Handler;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4rP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106674rP {
    public final C2BY A00;
    public final int A02;
    public final Handler A03;
    public final List A01 = Collections.synchronizedList(new LinkedList());
    public final Runnable A04 = new Runnable() { // from class: X.4rQ
        @Override // java.lang.Runnable
        public final void run() {
            UtW utW;
            try {
                C106674rP c106674rP = C106674rP.this;
                List list = c106674rP.A01;
                if (!list.isEmpty()) {
                    synchronized (list) {
                        utW = new UtW(list);
                        list.clear();
                    }
                    c106674rP.A00.A00(utW);
                }
                C106674rP.A00(c106674rP);
            } catch (Throwable th) {
                C106674rP.A00(C106674rP.this);
                throw th;
            }
        }
    };

    public static void A00(C106674rP c106674rP) {
        c106674rP.A03.postDelayed(c106674rP.A04, TimeUnit.SECONDS.toMillis(c106674rP.A02));
    }

    public C106674rP(Handler handler, C2BY c2by, int i) {
        this.A00 = c2by;
        this.A03 = handler;
        this.A02 = i;
        A00(this);
    }
}
