package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HFI extends AbstractC65632xz {
    public final INL A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final INQ A03;
    public final C38376GuD A04;
    public final JPq A05;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C39352HZr c39352HZr;
        INL inl;
        int A03 = C0f9.A03(1122242528);
        AbstractC25233BEq.A0v(1, view, obj, obj2);
        if (i != 0) {
            if (i == 1) {
                C41700IdT c41700IdT = C41700IdT.A00;
                UserSession userSession = this.A02;
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselVideoMediaViewBinder.Holder");
                c39352HZr = (C39352HZr) obj;
                INQ inq = this.A03;
                C38376GuD c38376GuD = this.A04;
                JPq jPq = this.A05;
                InterfaceC11380iw interfaceC11380iw = this.A01;
                inl = this.A00;
                c41700IdT.A02(interfaceC11380iw, userSession, (IIE) tag, inq, c38376GuD, jPq, (IKK) obj2, c39352HZr, inl);
            } else {
                IllegalStateException A0U = AbstractC31175DnJ.A0U("Unsupported view type: ", i);
                C0f9.A0A(2103785107, A03);
                throw A0U;
            }
        } else {
            UserSession userSession2 = this.A02;
            Object tag2 = view.getTag();
            C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselPhotoMediaViewBinder.Holder");
            C41068IGl c41068IGl = (C41068IGl) tag2;
            c39352HZr = (C39352HZr) obj;
            IKK ikk = (IKK) obj2;
            C38376GuD c38376GuD2 = this.A04;
            JPq jPq2 = this.A05;
            InterfaceC11380iw interfaceC11380iw2 = this.A01;
            inl = this.A00;
            AbstractC167017dG.A1N(userSession2, c41068IGl);
            AbstractC25234BEr.A1R(c39352HZr, ikk, c38376GuD2, jPq2, interfaceC11380iw2);
            C14360o3.A0B(inl, 7);
            C42797IwZ c42797IwZ = c41068IGl.A02;
            C14360o3.A0B(c42797IwZ, 1);
            C38321qM c38321qM = c39352HZr.A00;
            C41679Id8.A00(interfaceC11380iw2, userSession2, c38321qM, c42797IwZ, c38376GuD2, jPq2, c39352HZr, ikk, inl, new C29901DGp(25, jPq2, c39352HZr, ikk, c42797IwZ));
            C41688IdH.A00(userSession2, c38321qM, c41068IGl, ikk);
        }
        inl.A00(view, c39352HZr.A02);
        C0f9.A0A(-887000719, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C39352HZr c39352HZr = (C39352HZr) obj;
        IKK ikk = (IKK) obj2;
        boolean A1b = AbstractC25233BEq.A1b(anonymousClass306, c39352HZr, ikk);
        int ordinal = c39352HZr.A00.BRp().ordinal();
        if (ordinal != 0) {
            if (ordinal == A1b) {
                anonymousClass306.A7b(A1b ? 1 : 0, c39352HZr, ikk);
                this.A00.A02(c39352HZr, ikk);
                return;
            }
            return;
        }
        anonymousClass306.A7b(0, c39352HZr, ikk);
        this.A00.A01(c39352HZr, ikk);
    }

    public HFI(InterfaceC11380iw interfaceC11380iw, UserSession userSession, INQ inq, C38376GuD c38376GuD, JPq jPq, INL inl) {
        this.A02 = userSession;
        this.A03 = inq;
        this.A04 = c38376GuD;
        this.A00 = inl;
        this.A05 = jPq;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View A0C;
        Object c41068IGl;
        int A03 = C0f9.A03(1685349110);
        C14360o3.A0B(viewGroup, 1);
        if (i != 0) {
            if (i == 1) {
                A0C = AbstractC31173DnH.A0C(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.hero_carousel_media_video, false);
                c41068IGl = new IIE(A0C);
            } else {
                IllegalStateException A0U = AbstractC31175DnJ.A0U("Unsupported view type: ", i);
                C0f9.A0A(-537877282, A03);
                throw A0U;
            }
        } else {
            A0C = AbstractC31173DnH.A0C(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.hero_carousel_media_photo, false);
            c41068IGl = new C41068IGl(A0C);
        }
        A0C.setTag(c41068IGl);
        C0f9.A0A(1587003312, A03);
        return A0C;
    }
}
