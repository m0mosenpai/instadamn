package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes11.dex */
public final class WjE implements InterfaceC72025XFn {
    public static final int[] A06 = new int[2];
    public Runnable A00;
    public final View A01;
    public final C65726Tt0 A02;
    public final C65726Tt0 A03;
    public final C65726Tt0 A04;
    public final C65717Tsq A05;

    public WjE(View view, InterfaceC162347Ow interfaceC162347Ow) {
        C65726Tt0 c65726Tt0;
        C14360o3.A0B(view, 1);
        this.A01 = view;
        C65717Tsq c65717Tsq = new C65717Tsq();
        c65717Tsq.A01(0.5f);
        c65717Tsq.A02(200.0f);
        this.A05 = c65717Tsq;
        C65726Tt0 c65726Tt02 = new C65726Tt0(AbstractC65716Tsp.A0G, view);
        c65726Tt02.A01 = c65717Tsq;
        this.A03 = c65726Tt02;
        C65726Tt0 c65726Tt03 = new C65726Tt0(AbstractC65716Tsp.A0H, view);
        c65726Tt03.A01 = c65717Tsq;
        this.A04 = c65726Tt03;
        if (interfaceC162347Ow != null) {
            c65726Tt0 = new C65726Tt0(new C44443JlA(), interfaceC162347Ow);
            ((AbstractC65716Tsp) c65726Tt0).A00 = 1.1f;
            ((AbstractC65716Tsp) c65726Tt0).A01 = 0.0f;
            C65717Tsq c65717Tsq2 = new C65717Tsq();
            c65717Tsq2.A01(0.5f);
            c65717Tsq2.A02(200.0f);
            c65726Tt0.A01 = c65717Tsq2;
            ((AbstractC65716Tsp) c65726Tt0).A02 = 0.01f;
            c65726Tt0.A03(0.01f * 0.75f);
        } else {
            c65726Tt0 = null;
        }
        this.A02 = c65726Tt0;
    }

    @Override // X.InterfaceC72025XFn
    public final void EM8(MotionEvent motionEvent) {
        Runnable runnable = this.A00;
        if (runnable != null) {
            this.A01.removeCallbacks(runnable);
            this.A00 = null;
        }
        RunnableC71497Wv1 runnableC71497Wv1 = new RunnableC71497Wv1(motionEvent, this);
        this.A01.postDelayed(runnableC71497Wv1, 150L);
        this.A00 = runnableC71497Wv1;
    }

    @Override // X.InterfaceC72025XFn
    public final void Enw() {
        Float f;
        C65717Tsq c65717Tsq;
        C65717Tsq c65717Tsq2;
        Runnable runnable = this.A00;
        Float f2 = null;
        if (runnable != null) {
            this.A01.removeCallbacks(runnable);
            this.A00 = null;
        }
        if (((float) this.A05.A02) != 1.0f) {
            this.A03.A09(1.0f);
            this.A04.A09(1.0f);
        }
        C65726Tt0 c65726Tt0 = this.A02;
        if (c65726Tt0 != null && (c65717Tsq2 = c65726Tt0.A01) != null) {
            f = Float.valueOf((float) c65717Tsq2.A02);
        } else {
            f = null;
        }
        if (!C14360o3.A0I(f, 1.0f)) {
            if (c65726Tt0 != null && (c65717Tsq = c65726Tt0.A01) != null) {
                f2 = Float.valueOf((float) c65717Tsq.A02);
            }
            if (!C14360o3.A0I(f2, Float.POSITIVE_INFINITY) && c65726Tt0 != null) {
                c65726Tt0.A09(1.0f);
            }
        }
    }
}
