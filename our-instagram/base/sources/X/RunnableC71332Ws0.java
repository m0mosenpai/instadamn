package X;

import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.Ws0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71332Ws0 implements Runnable {
    public final /* synthetic */ LF3 A00;

    public RunnableC71332Ws0(LF3 lf3) {
        this.A00 = lf3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LF3 lf3 = this.A00;
        C65717Tsq c65717Tsq = new C65717Tsq();
        c65717Tsq.A01(1.0f);
        c65717Tsq.A02(10000.0f);
        ConstrainedImageView constrainedImageView = lf3.A0A;
        C65726Tt0 c65726Tt0 = new C65726Tt0(AbstractC65716Tsp.A0G, constrainedImageView);
        c65726Tt0.A01 = c65717Tsq;
        C65726Tt0 c65726Tt02 = new C65726Tt0(AbstractC65716Tsp.A0H, constrainedImageView);
        c65726Tt02.A01 = c65717Tsq;
        c65726Tt0.A09(1.0f);
        c65726Tt02.A09(1.0f);
    }
}
