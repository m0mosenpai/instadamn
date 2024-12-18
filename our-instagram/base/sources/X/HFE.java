package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* loaded from: classes7.dex */
public final class HFE extends AbstractC65632xz {
    public final JPq A00;
    public final INL A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C38376GuD A04;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        IN1 in1 = (IN1) obj;
        IKK ikk = (IKK) obj2;
        C14360o3.A0B(anonymousClass306, 0);
        AbstractC167017dG.A1P(in1, ikk);
        anonymousClass306.A7a(0);
        this.A01.A01(in1, ikk);
    }

    public HFE(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38376GuD c38376GuD, JPq jPq, INL inl) {
        this.A03 = userSession;
        this.A04 = c38376GuD;
        this.A01 = inl;
        this.A00 = jPq;
        this.A02 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(619748056);
        int A06 = AbstractC167007dF.A06(1, view, obj);
        C14360o3.A0B(obj2, 3);
        UserSession userSession = this.A03;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselSeeAllViewBinder.Holder");
        C38463Gvk c38463Gvk = (C38463Gvk) tag;
        JPq jPq = this.A00;
        INL inl = this.A01;
        C41580IaT c41580IaT = new C41580IaT(userSession, jPq, inl);
        C39353HZs c39353HZs = (C39353HZs) obj;
        IKK ikk = (IKK) obj2;
        C43210J8h c43210J8h = new C43210J8h(18, this, obj2, obj);
        boolean A1T = AbstractC31175DnJ.A1T(1, c39353HZs, ikk);
        c41580IaT.A02.A01(c39353HZs, ikk);
        String str = c39353HZs.A02;
        Integer num = c39353HZs.A01;
        C42332Iou A00 = C41580IaT.A00(c39353HZs, ikk, c43210J8h);
        C14360o3.A0B(num, A06);
        C38376GuD c38376GuD = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C14360o3.A0B(userSession, A1T ? 1 : 0);
        C14360o3.A0B(c38463Gvk, 1);
        AbstractC167007dF.A1F(c38376GuD, 3, interfaceC11380iw);
        C41609Iay.A00.A00(interfaceC11380iw, userSession, c38463Gvk.A02, c38376GuD, A00);
        IgdsMediaButton igdsMediaButton = c38463Gvk.A01;
        igdsMediaButton.setLabel(AbstractC167007dF.A0f(igdsMediaButton.getContext(), num, 2131962374));
        IgImageView igImageView = c38463Gvk.A00;
        ExtendedImageUrl A002 = A00.A00(AbstractC166997dE.A0L(igImageView));
        if (A002 != null) {
            igImageView.setUrl(A002, interfaceC11380iw);
        }
        inl.A00(view, str);
        C0f9.A0A(-2056237136, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -1938070018);
        View A0D = AbstractC25227BEk.A0D(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.hero_carousel_see_all, false);
        A0D.setTag(new C38463Gvk(A0D));
        C0f9.A0A(-2078477812, A0G);
        return A0D;
    }
}
