package X;

import android.content.Context;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.VNj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68349VNj {
    public static final void A00(ShimmerFrameLayout shimmerFrameLayout, Integer num) {
        C14360o3.A0B(shimmerFrameLayout, 0);
        C84773qR c84773qR = new C84773qR();
        C2FP.A0A();
        Context A0L = AbstractC166997dE.A0L(shimmerFrameLayout);
        float f = 0.06f;
        if (AbstractC72723Nt.A00(A0L)) {
            f = 0.15f;
        }
        c84773qR.A02(f);
        C2FP.A0A();
        float f2 = 0.02f;
        if (AbstractC72723Nt.A00(A0L)) {
            f2 = 0.1f;
        }
        c84773qR.A03(f2);
        shimmerFrameLayout.A04(c84773qR.A01());
        if (num != null) {
            shimmerFrameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new WOH(1, num, shimmerFrameLayout));
        }
    }
}
