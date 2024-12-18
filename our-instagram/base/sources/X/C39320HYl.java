package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.HYl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39320HYl extends AbstractC39063HHn {
    public final InterfaceC11380iw A00;
    public final C38383GuK A01;
    public final UserSession A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0D = AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.media_list_section, false);
        return AbstractC37300Gc1.A03(AbstractC37303Gc4.A0Q(A0D, new C38425Gv0(A0D)), "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.media.MediaListSectionViewBinder.Holder");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42322Iok.class;
    }

    public C39320HYl(InterfaceC11380iw interfaceC11380iw, C38383GuK c38383GuK, UserSession userSession, C41622IbC c41622IbC) {
        super(c41622IbC);
        this.A02 = userSession;
        this.A00 = interfaceC11380iw;
        this.A01 = c38383GuK;
    }
}
