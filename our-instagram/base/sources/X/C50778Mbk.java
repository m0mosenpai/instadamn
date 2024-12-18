package X;

import android.view.ScaleGestureDetector;
import android.widget.ImageView;

/* renamed from: X.Mbk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50778Mbk extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final int A00;
    public final Object A01;

    public C50778Mbk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i = this.A00;
        C14360o3.A0B(scaleGestureDetector, 0);
        if (i != 0) {
            O5E o5e = ((ViewOnTouchListenerC51475MoM) this.A01).A02;
            if (o5e != null) {
                OHN A00 = o5e.A00.A00();
                NTQ.A00(A00.A00, scaleGestureDetector.getScaleFactor());
                return true;
            }
            return false;
        }
        K5S k5s = (K5S) this.A01;
        float scaleFactor = k5s.A04 * scaleGestureDetector.getScaleFactor();
        k5s.A04 = scaleFactor;
        k5s.A04 = Math.max(1.0f, Math.min(scaleFactor, 5.0f));
        ImageView imageView = k5s.A0G;
        C14360o3.A0A(imageView);
        imageView.setScaleX(k5s.A04);
        ImageView imageView2 = k5s.A0G;
        C14360o3.A0A(imageView2);
        imageView2.setScaleY(k5s.A04);
        return true;
    }
}
