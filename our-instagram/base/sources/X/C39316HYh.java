package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.HYh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39316HYh extends AbstractC39063HHn {
    public final C62862tP A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.bloks_section, viewGroup, false);
        C126545np c126545np = new C126545np(AbstractC166997dE.A0L(inflate));
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        viewGroup2.addView(c126545np);
        viewGroup2.setTag(new C38472Gvt(inflate, c126545np));
        return AbstractC37300Gc1.A03(inflate.getTag(), "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.bloks.BloksSectionViewBinder.ViewHolder");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42303IoR.class;
    }

    public C39316HYh(C62862tP c62862tP, C41622IbC c41622IbC) {
        super(c41622IbC);
        this.A00 = c62862tP;
    }
}
