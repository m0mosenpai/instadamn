package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* loaded from: classes7.dex */
public final class HFB extends AbstractC65632xz {
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
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-704456776);
        AbstractC167007dF.A1D(view, 1, obj);
        C14360o3.A0B(obj2, 3);
        UserSession userSession = this.A03;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselARViewBinder.Holder");
        C38474Gvv c38474Gvv = (C38474Gvv) tag;
        JPq jPq = this.A00;
        INL inl = this.A01;
        C41580IaT c41580IaT = new C41580IaT(userSession, jPq, inl);
        C39354HZt c39354HZt = (C39354HZt) obj;
        IKK ikk = (IKK) obj2;
        C57252Pba c57252Pba = new C57252Pba(41, obj, this);
        boolean A1T = AbstractC31175DnJ.A1T(1, c39354HZt, ikk);
        c41580IaT.A02.A01(c39354HZt, ikk);
        String str = c39354HZt.A02;
        String str2 = c39354HZt.A06;
        String str3 = c39354HZt.A05;
        C42332Iou A00 = C41580IaT.A00(c39354HZt, ikk, c57252Pba);
        C38376GuD c38376GuD = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C14360o3.A0B(userSession, A1T ? 1 : 0);
        C14360o3.A0B(c38474Gvv, 1);
        C14360o3.A0B(c38376GuD, 3);
        C14360o3.A0B(interfaceC11380iw, 4);
        C41609Iay.A00.A00(interfaceC11380iw, userSession, c38474Gvv.A03, c38376GuD, A00);
        c38474Gvv.A01.setText(str2);
        c38474Gvv.A00.setText(str3);
        IgImageView igImageView = c38474Gvv.A02;
        ExtendedImageUrl A002 = A00.A00(AbstractC166997dE.A0L(igImageView));
        if (A002 != null) {
            igImageView.setUrl(A002, interfaceC11380iw);
        } else {
            igImageView.A09();
        }
        inl.A00(view, str);
        C0f9.A0A(-1954222064, A03);
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

    public HFB(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38376GuD c38376GuD, JPq jPq, INL inl) {
        this.A03 = userSession;
        this.A04 = c38376GuD;
        this.A01 = inl;
        this.A00 = jPq;
        this.A02 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1949287861);
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.hero_carousel_try_in_ar, false);
        A0D.setTag(new C38474Gvv(A0D));
        C0f9.A0A(-2093142873, A0G);
        return A0D;
    }
}
