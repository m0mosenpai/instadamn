package X;

import com.facebook.shimmer.ShimmerFrameLayout;

/* loaded from: classes9.dex */
public final class POM implements Runnable {
    public final /* synthetic */ N55 A00;

    public POM(N55 n55) {
        this.A00 = n55;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        N55 n55 = this.A00;
        ShimmerFrameLayout shimmerFrameLayout = n55.A0A;
        if (shimmerFrameLayout == null) {
            str = "headerGlassesDeviceNameShimmer";
        } else {
            shimmerFrameLayout.A03();
            ShimmerFrameLayout shimmerFrameLayout2 = n55.A0C;
            if (shimmerFrameLayout2 == null) {
                str = "headerGlassesModelNameShimmer";
            } else {
                shimmerFrameLayout2.A03();
                ShimmerFrameLayout shimmerFrameLayout3 = n55.A0B;
                if (shimmerFrameLayout3 == null) {
                    str = "headerGlassesImageShimmer";
                } else {
                    shimmerFrameLayout3.A03();
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
