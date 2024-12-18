package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes7.dex */
public final class HIA extends AbstractC66412zI {
    public final Context A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        Context context = this.A00;
        return AbstractC37300Gc1.A03(IS9.A00(context, viewGroup, AbstractC13880nE.A09(context) / (AbstractC13880nE.A0A(context) / 2)).getTag(), "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.shimmer.ProductFeedShimmerViewBinder.Holder");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C33165EkC c33165EkC = (C33165EkC) interfaceC66482zP;
        C38401Guc c38401Guc = (C38401Guc) c3oo;
        AbstractC167017dG.A1N(c33165EkC, c38401Guc);
        IS9.A01(c38401Guc, c33165EkC);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C33165EkC.class;
    }

    public HIA(Context context) {
        this.A00 = context;
    }
}
