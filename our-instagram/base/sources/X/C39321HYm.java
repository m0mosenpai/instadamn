package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.HYm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39321HYm extends AbstractC39063HHn {
    public final UserSession A00;
    public final IIY A01;
    public final boolean A02;
    public final InterfaceC11380iw A03;

    public C39321HYm(InterfaceC11380iw interfaceC11380iw, UserSession userSession, IIY iiy, C41622IbC c41622IbC) {
        super(c41622IbC);
        this.A00 = userSession;
        this.A03 = interfaceC11380iw;
        this.A01 = iiy;
        this.A02 = true;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.attributes_section, false);
        return AbstractC37300Gc1.A03(AbstractC37303Gc4.A0Q(A0D, new C38510GwV(A0D)), "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.attributes.AttributesSectionViewBinder.Holder");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42329Ior.class;
    }
}
