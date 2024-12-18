package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;

/* renamed from: X.7jk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170937jk {
    public BCX A00;
    public BDD A01;
    public BlockingQueue A02;
    public boolean A03;
    public final Handler A04;
    public volatile boolean A05;

    /* JADX WARN: Multi-variable type inference failed */
    public static void A00(C170697jM c170697jM, C170937jk c170937jk, C2VY c2vy, String str, boolean z) {
        if (c170937jk.A01 != null) {
            c170697jM.A8G("component_warmer_tag", str);
            C124005jE ALB = c170937jk.A01.ALB(c170697jM);
            c170937jk.A00.E71(ALB, str);
            if (z) {
                c170937jk.A01.E5a(ALB);
                return;
            } else if (c2vy != 0) {
                ((Handler) c2vy).post(new RunnableC24552Au9(ALB, c170937jk));
                return;
            } else {
                c170937jk.A01.E5q(null, ALB);
                return;
            }
        }
        throw new IllegalStateException("ComponentWarmer: trying to execute prepare but ComponentWarmer is not ready.");
    }

    public final void A01(BDD bdd) {
        boolean z;
        this.A01 = bdd;
        synchronized (this) {
            z = this.A03;
        }
        if (!z) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A03 = true;
                } else {
                    while (!this.A02.isEmpty()) {
                        C170697jM c170697jM = (C170697jM) this.A02.poll();
                        Object AvD = c170697jM.AvD("component_warmer_tag");
                        if (AvD != null) {
                            String str = (String) AvD;
                            if (c170697jM.AvD("component_warmer_prepare_handler") != null) {
                                A00(c170697jM, this, (C2VY) c170697jM.AvD("component_warmer_prepare_handler"), str, false);
                            } else {
                                A00(c170697jM, this, null, str, true);
                            }
                            synchronized (this) {
                                if (this.A02.isEmpty()) {
                                    this.A03 = true;
                                }
                            }
                        }
                    }
                }
            }
            synchronized (this) {
                this.A03 = true;
            }
        }
    }

    public C170937jk(BCX bcx, BDD bdd) {
        this.A04 = new Handler(Looper.getMainLooper());
        C9IB c9ib = new C9IB(this);
        this.A00 = bcx;
        ((C9IA) bcx).A00 = c9ib;
        this.A03 = true;
        A01(bdd);
    }

    public C170937jk() {
        this.A04 = new Handler(Looper.getMainLooper());
        this.A00 = new AYJ(new C9IB(this));
    }
}
