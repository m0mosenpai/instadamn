package X;

import android.view.Choreographer;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.6kI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C147326kI {
    public static final int A0B = C147326kI.class.hashCode();
    public float A00;
    public float A01;
    public long A02;
    public long A03;
    public Object A05;
    public Runnable A06;
    public boolean A07;
    public IgProgressImageView A08;
    public final InterfaceC147306kG A09;
    public final ChoreographerFrameCallbackC147346kK A0A = new ChoreographerFrameCallbackC147346kK(this);
    public long A04 = -1;

    public final void A03(IgProgressImageView igProgressImageView, Object obj, long j, boolean z) {
        C14360o3.A0B(igProgressImageView, 1);
        float f = (float) j;
        this.A01 = f;
        this.A08 = igProgressImageView;
        this.A05 = obj;
        this.A09.DLb(obj, f);
        this.A07 = z;
        this.A06 = new Runnable() { // from class: X.6Oa
            @Override // java.lang.Runnable
            public final void run() {
                C147326kI c147326kI = C147326kI.this;
                InterfaceC147306kG interfaceC147306kG = c147326kI.A09;
                Object obj2 = c147326kI.A05;
                if (obj2 != null) {
                    interfaceC147306kG.Dbu(obj2);
                    if (c147326kI.A07) {
                        ChoreographerFrameCallbackC147346kK choreographerFrameCallbackC147346kK = c147326kI.A0A;
                        choreographerFrameCallbackC147346kK.A00.A02 = System.currentTimeMillis();
                        Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC147346kK);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        };
        IgProgressImageView igProgressImageView2 = this.A08;
        if (igProgressImageView2 != null) {
            if (igProgressImageView2.getIgImageView().A0N) {
                Runnable runnable = this.A06;
                if (runnable != null) {
                    runnable.run();
                    this.A06 = null;
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            igProgressImageView.A0A(new C49406Lse(this), A0B);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A04(Object obj, long j) {
        this.A07 = true;
        this.A01 = (float) j;
        this.A05 = obj;
        ChoreographerFrameCallbackC147346kK choreographerFrameCallbackC147346kK = this.A0A;
        choreographerFrameCallbackC147346kK.A00.A02 = System.currentTimeMillis();
        Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC147346kK);
    }

    public final void A00() {
        if (this.A07) {
            this.A07 = false;
            Choreographer.getInstance().removeFrameCallback(this.A0A);
            this.A04 = System.currentTimeMillis();
        }
    }

    public final void A01() {
        Object obj = this.A05;
        if (obj != null && !this.A07) {
            this.A07 = true;
            IgProgressImageView igProgressImageView = this.A08;
            if (igProgressImageView == null || igProgressImageView.getIgImageView().A0N) {
                ChoreographerFrameCallbackC147346kK choreographerFrameCallbackC147346kK = this.A0A;
                choreographerFrameCallbackC147346kK.A00.A02 = System.currentTimeMillis();
                Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC147346kK);
            }
            long j = this.A04;
            if (j > 0) {
                this.A03 += System.currentTimeMillis() - j;
            }
            this.A09.DLc(obj, this.A03 / 1000.0d);
        }
    }

    public C147326kI(InterfaceC147306kG interfaceC147306kG) {
        this.A09 = interfaceC147306kG;
    }

    public final void A02() {
        A00();
        Object obj = this.A05;
        if (obj != null) {
            this.A09.DLd(obj);
        }
        IgProgressImageView igProgressImageView = this.A08;
        if (igProgressImageView != null) {
            igProgressImageView.A06(A0B);
            this.A08 = null;
        }
        this.A00 = 0.0f;
        this.A03 = 0L;
        this.A04 = -1L;
        this.A06 = null;
        this.A05 = null;
    }
}
