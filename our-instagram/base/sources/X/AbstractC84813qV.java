package X;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.3qV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC84813qV extends View {
    private final ShimmerFrameLayout A00(View view) {
        Object parent = view.getParent();
        if (parent == null) {
            return null;
        }
        if (parent instanceof ShimmerFrameLayout) {
            return (ShimmerFrameLayout) parent;
        }
        if (!(parent instanceof View)) {
            return null;
        }
        return A00((View) parent);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        ShimmerFrameLayout A00;
        int A06 = C0f9.A06(156275885);
        super.onAttachedToWindow();
        if (C1KM.A08 && (A00 = A00(this)) != null) {
            C72663Nn.A00.A00(A00);
        }
        C0f9.A0D(-319410261, A06);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ShimmerFrameLayout A00;
        int A06 = C0f9.A06(283001980);
        super.onDetachedFromWindow();
        if (C1KM.A08 && (A00 = A00(this)) != null) {
            C72663Nn.A00.A01(A00);
        }
        C0f9.A0D(-123686011, A06);
    }
}
