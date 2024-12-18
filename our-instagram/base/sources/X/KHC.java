package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* loaded from: classes8.dex */
public final class KHC extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.trending_prompt_single_card_shimmer_item, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
        return new C44653Jpx((ShimmerFrameLayout) inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C44653Jpx c44653Jpx = (C44653Jpx) c3oo;
        C14360o3.A0B(c44653Jpx, 1);
        c44653Jpx.A00.A02();
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZB.class;
    }
}
