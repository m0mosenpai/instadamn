package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.HYo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39323HYo extends AbstractC39063HHn {
    public final InterfaceC11380iw A00;
    public final C38383GuK A01;
    public final UserSession A02;
    public final INQ A03;
    public final C38376GuD A04;
    public final JPq A05;
    public final INL A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39323HYo(Context context, InterfaceC11380iw interfaceC11380iw, C38383GuK c38383GuK, UserSession userSession, C57112jm c57112jm, C41702IdW c41702IdW, C41727Idy c41727Idy, INQ inq, JPq jPq, C41622IbC c41622IbC) {
        super(c41622IbC);
        C14360o3.A0B(jPq, 12);
        this.A02 = userSession;
        this.A01 = c38383GuK;
        this.A03 = inq;
        this.A00 = interfaceC11380iw;
        this.A05 = jPq;
        this.A04 = new C38376GuD(context, userSession);
        this.A06 = new INL(userSession, c57112jm, c41702IdW, c41727Idy, jPq, true);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        UserSession userSession = this.A02;
        LayoutInflater A0P = AbstractC25228BEl.A0P(viewGroup);
        boolean A1W = AbstractC167007dF.A1W(userSession);
        View A0D = AbstractC25227BEk.A0D(A0P, viewGroup, R.layout.hero_carousel_section, false);
        A0D.setTag(new C38505GwQ(A0D, A1W));
        return AbstractC37300Gc1.A03(A0D.getTag(), "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselSectionViewBinder.Holder");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return H7G.class;
    }
}
