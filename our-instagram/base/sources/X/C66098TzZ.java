package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.TzZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66098TzZ extends AbstractC66099Tza {
    public final C66094TzV A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        ShimmerFrameLayout A01 = C84733qM.A00.A01(AbstractC166997dE.A0L(viewGroup), viewGroup);
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View childAt = A01.getChildAt(0);
        C14360o3.A0C(childAt, "null cannot be cast to non-null type com.instagram.igds.components.shimmer.placeholder.GridShimmeringPlaceholderView");
        return new U1A(A01, (U19) childAt);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C38124Gpr.class;
    }

    public C66098TzZ(C66094TzV c66094TzV, boolean z) {
        super(z);
        this.A00 = c66094TzV;
    }

    @Override // X.AbstractC66099Tza, X.AbstractC66422zJ
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void bind(U1A u1a, C38124Gpr c38124Gpr) {
        AbstractC167017dG.A1N(c38124Gpr, u1a);
        U19 u19 = u1a.A00;
        u19.setLayoutType(c38124Gpr.A01);
        C66094TzV c66094TzV = this.A00;
        if (c66094TzV != null) {
            C59072n8 A00 = C59062n7.A00(c38124Gpr, C0eB.A00, String.valueOf(c38124Gpr.getKey()));
            A00.A00(c66094TzV.A01);
            c66094TzV.A00.A05(u19, A00.A01());
        }
        super.bind(u1a, c38124Gpr);
    }
}
