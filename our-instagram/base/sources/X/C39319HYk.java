package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.HYk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39319HYk extends AbstractC39063HHn {
    public final boolean A00;

    public C39319HYk(C41622IbC c41622IbC) {
        super(c41622IbC);
        this.A00 = true;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0D = AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.link_section_header, false);
        return AbstractC37300Gc1.A03(AbstractC37303Gc4.A0Q(A0D, new C38443GvQ(A0D)), "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.link.LinkSectionHeaderViewBinder.Holder");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42319Ioh.class;
    }
}
