package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Lxt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49724Lxt implements InterfaceC42241xE {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C7E8 A02;
    public final /* synthetic */ C158797Aq A03;
    public final /* synthetic */ MRJ A04;
    public final /* synthetic */ IgProgressImageView A05;
    public final /* synthetic */ InterfaceC16660sJ A06;

    public C49724Lxt(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7E8 c7e8, C158797Aq c158797Aq, MRJ mrj, IgProgressImageView igProgressImageView, InterfaceC16660sJ interfaceC16660sJ) {
        this.A02 = c7e8;
        this.A03 = c158797Aq;
        this.A05 = igProgressImageView;
        this.A04 = mrj;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A06 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        int i;
        ImageUrl imageUrl = (ImageUrl) obj;
        C158797Aq c158797Aq = this.A03;
        IgProgressImageView igProgressImageView = this.A05;
        MRJ mrj = this.A04;
        C14360o3.A0A(imageUrl);
        UserSession userSession = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        InterfaceC16660sJ interfaceC16660sJ = this.A06;
        C38321qM c38321qM = c158797Aq.A0E;
        if (c38321qM != null) {
            igProgressImageView.setExpiration(c38321qM.A18());
        }
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = c158797Aq.A01;
        if (privacyMediaOverlayViewModel == null || ((i = privacyMediaOverlayViewModel.A00) != 2 && i != 1)) {
            igProgressImageView.setPostProcessor(null);
        }
        JUO.A00(imageUrl, mrj);
        igProgressImageView.setEnableProgressBar(!c158797Aq.A0u);
        igProgressImageView.setUrl(userSession, imageUrl, interfaceC11380iw);
        interfaceC16660sJ.invoke(Float.valueOf(c158797Aq.A02));
    }
}
