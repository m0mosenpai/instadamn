package X;

import com.instagram.ui.widget.drawing.gl.GLDrawingView;

/* loaded from: classes11.dex */
public final class W4S {
    public X1v A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public final synchronized void A01(X1v x1v) {
        x1v.A01 = true;
        if (this.A00 == x1v) {
            this.A00 = null;
        }
        notifyAll();
    }

    public static final void A00(W4S w4s) {
        if (!w4s.A04) {
            if (GLDrawingView.A0H >= 131072) {
                w4s.A03 = true;
            }
            w4s.A04 = true;
        }
    }
}
