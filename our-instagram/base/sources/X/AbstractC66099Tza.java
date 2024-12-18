package X;

import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.Tza, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66099Tza extends AbstractC66412zI {
    public final boolean A00;

    @Override // X.AbstractC66422zJ
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public void bind(U1B u1b, V5X v5x) {
        C14360o3.A0B(u1b, 1);
        boolean z = this.A00;
        ShimmerFrameLayout shimmerFrameLayout = u1b.A00;
        if (z) {
            shimmerFrameLayout.post(new RunnableC71357WsS(u1b));
        } else {
            shimmerFrameLayout.A02();
        }
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        U1B u1b = (U1B) c3oo;
        C14360o3.A0B(u1b, 0);
        u1b.A00.A03();
    }

    public AbstractC66099Tza(boolean z) {
        this.A00 = z;
    }
}
