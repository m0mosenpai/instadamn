package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.shopping.productfeed.ProductTileMedia;

/* loaded from: classes7.dex */
public final class HFC extends AbstractC65632xz {
    public final INL A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C38376GuD A03;
    public final JPq A04;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(46777821);
        int A06 = AbstractC167007dF.A06(1, view, obj);
        C14360o3.A0B(obj2, 3);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselMediaPreviewViewBinder.Holder");
        C38461Gvi c38461Gvi = (C38461Gvi) tag;
        UserSession userSession = this.A02;
        JPq jPq = this.A04;
        INL inl = this.A00;
        C41580IaT c41580IaT = new C41580IaT(userSession, jPq, inl);
        C39348HZn c39348HZn = (C39348HZn) obj;
        IKK ikk = (IKK) obj2;
        J88 j88 = J88.A00;
        boolean A1T = AbstractC31175DnJ.A1T(1, c39348HZn, ikk);
        C14360o3.A0B(j88, A06);
        c41580IaT.A02.A01(c39348HZn, ikk);
        String A01 = c39348HZn.A01();
        ProductTileMedia productTileMedia = c39348HZn.A00;
        String str = productTileMedia.A03;
        productTileMedia.A01.getUsername();
        C42332Iou A00 = C41580IaT.A00(c39348HZn, ikk, j88);
        C38376GuD c38376GuD = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C14360o3.A0B(c38461Gvi, A1T ? 1 : 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c38376GuD, 3);
        C14360o3.A0B(interfaceC11380iw, 4);
        C41609Iay.A00.A00(interfaceC11380iw, userSession, c38461Gvi.A02.A02, c38376GuD, A00);
        IgProgressImageView igProgressImageView = c38461Gvi.A01;
        igProgressImageView.setMiniPreviewPayload(str);
        ExtendedImageUrl A002 = A00.A00(c38461Gvi.A00);
        if (A002 != null) {
            igProgressImageView.setUrl(A002, interfaceC11380iw);
        } else {
            igProgressImageView.A04();
        }
        inl.A00(view, A01);
        C0f9.A0A(-242216698, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        IN1 in1 = (IN1) obj;
        IKK ikk = (IKK) obj2;
        C14360o3.A0B(anonymousClass306, 0);
        AbstractC167017dG.A1P(in1, ikk);
        anonymousClass306.A7a(0);
        this.A00.A01(in1, ikk);
    }

    public HFC(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38376GuD c38376GuD, JPq jPq, INL inl) {
        this.A02 = userSession;
        this.A03 = c38376GuD;
        this.A00 = inl;
        this.A04 = jPq;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -378455258);
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.hero_carousel_media_photo, false);
        A0D.setTag(new C38461Gvi(A0D));
        C0f9.A0A(540734893, A0G);
        return A0D;
    }
}
