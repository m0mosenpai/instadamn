package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.572, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass572 extends C12T {
    public boolean A02;
    public boolean A03;
    public final Handler A04;
    public final Choreographer A05;
    public final AnonymousClass577 A06;
    public static final InterfaceC09390do A0B = AbstractC09440dt.A01(AnonymousClass573.A00);
    public static final ThreadLocal A0A = new ThreadLocal() { // from class: X.574
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ Object initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                AnonymousClass572 anonymousClass572 = new AnonymousClass572(Handler.createAsync(myLooper), choreographer);
                return AnonymousClass190.A02(anonymousClass572, anonymousClass572.A06);
            }
            throw new IllegalStateException("no Looper on this thread");
        }
    };
    public final Object A08 = new Object();
    public final C01U A09 = new C01U();
    public List A01 = new ArrayList();
    public List A00 = new ArrayList();
    public final AnonymousClass575 A07 = new AnonymousClass575(this);

    public static final void A00(AnonymousClass572 anonymousClass572) {
        C01U c01u;
        Runnable runnable;
        boolean z;
        while (true) {
            Object obj = anonymousClass572.A08;
            synchronized (obj) {
                c01u = anonymousClass572.A09;
                runnable = (Runnable) c01u.A0S();
            }
            if (runnable != null) {
                runnable.run();
            } else {
                synchronized (obj) {
                    z = false;
                    if (c01u.isEmpty()) {
                        anonymousClass572.A03 = false;
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
            }
        }
    }

    @Override // X.C12T
    public final void A05(Runnable runnable, C12W c12w) {
        synchronized (this.A08) {
            this.A09.addLast(runnable);
            if (!this.A03) {
                this.A03 = true;
                Handler handler = this.A04;
                AnonymousClass575 anonymousClass575 = this.A07;
                handler.post(anonymousClass575);
                if (!this.A02) {
                    this.A02 = true;
                    this.A05.postFrameCallback(anonymousClass575);
                }
            }
        }
    }

    public AnonymousClass572(Handler handler, Choreographer choreographer) {
        this.A05 = choreographer;
        this.A04 = handler;
        this.A06 = new AnonymousClass576(choreographer, this);
    }
}
