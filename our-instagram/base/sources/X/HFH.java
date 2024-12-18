package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HFH extends AbstractC65632xz {
    public final INL A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final INQ A03;
    public final C38376GuD A04;
    public final JPq A05;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(446922080);
        AbstractC167027dH.A13(view, obj, obj2);
        C41610Iaz c41610Iaz = C41610Iaz.A00;
        UserSession userSession = this.A02;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselProductVideoViewBinder.Holder");
        C39349HZo c39349HZo = (C39349HZo) obj;
        INQ inq = this.A03;
        C38376GuD c38376GuD = this.A04;
        JPq jPq = this.A05;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        INL inl = this.A00;
        c41610Iaz.A00(interfaceC11380iw, userSession, (IID) tag, inq, c38376GuD, jPq, (IKK) obj2, c39349HZo, inl);
        inl.A00(view, c39349HZo.A01);
        C0f9.A0A(-130315171, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        IN1 in1 = (IN1) obj;
        IKK ikk = (IKK) obj2;
        C14360o3.A0B(anonymousClass306, 0);
        AbstractC167017dG.A1P(in1, ikk);
        anonymousClass306.A7a(0);
        this.A00.A02(in1, ikk);
    }

    public HFH(InterfaceC11380iw interfaceC11380iw, UserSession userSession, INQ inq, C38376GuD c38376GuD, JPq jPq, INL inl) {
        this.A02 = userSession;
        this.A03 = inq;
        this.A04 = c38376GuD;
        this.A00 = inl;
        this.A05 = jPq;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -92722506);
        View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.hero_carousel_product_video, false);
        A0C.setTag(new IID(A0C));
        C0f9.A0A(843976390, A0G);
        return A0C;
    }
}
