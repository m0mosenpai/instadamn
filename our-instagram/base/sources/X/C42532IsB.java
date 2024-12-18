package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ClipsMashupType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.IsB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42532IsB implements GZ7 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ ClipsViewerConfig A02;
    public final /* synthetic */ ClipsViewerSource A03;
    public final /* synthetic */ C120985dq A04;
    public final /* synthetic */ C37644Ghd A05;
    public final /* synthetic */ InterfaceC11380iw A06;
    public final /* synthetic */ UserSession A07;
    public final /* synthetic */ C38321qM A08;
    public final /* synthetic */ IG5 A09;
    public final /* synthetic */ C15370ps A0A;

    @Override // X.GZ7
    public final void Dpv(C38321qM c38321qM) {
        ClipsMashupType clipsMashupType;
        C14360o3.A0B(c38321qM, 0);
        AbstractC59962oe abstractC59962oe = this.A01;
        if (abstractC59962oe.mView != null) {
            C15370ps c15370ps = this.A0A;
            if (c15370ps.A00 != null) {
                C57312k6 A07 = AbstractC37302Gc3.A07(abstractC59962oe);
                ClipsViewerSource clipsViewerSource = this.A03;
                InterfaceC11380iw interfaceC11380iw = this.A06;
                UserSession userSession = this.A07;
                C37644Ghd c37644Ghd = this.A05;
                IG5 ig5 = this.A09;
                FragmentActivity fragmentActivity = this.A00;
                AbstractC166987dD.A1Z(new C43168J6i(ig5, abstractC59962oe, clipsViewerSource, c38321qM, c37644Ghd, userSession, this.A02, c15370ps, this.A04, this.A08, interfaceC11380iw, fragmentActivity, null, 1), A07);
                return;
            }
            C37855Gl9 c37855Gl9 = C37855Gl9.A00;
            InterfaceC11380iw interfaceC11380iw2 = this.A06;
            UserSession userSession2 = this.A07;
            Integer valueOf = Integer.valueOf(this.A05.A06());
            String str = this.A09.A00;
            FragmentActivity fragmentActivity2 = this.A00;
            ClipsViewerSource clipsViewerSource2 = this.A03;
            C22P A00 = IB0.A00(clipsViewerSource2);
            C120985dq c120985dq = this.A04;
            String A08 = AbstractC41770Iem.A08(c120985dq);
            String A09 = AbstractC41770Iem.A09(c120985dq);
            String A072 = AbstractC41770Iem.A07(c120985dq);
            Boolean A06 = AbstractC41770Iem.A06(c120985dq);
            ImageUrl A01 = AbstractC41770Iem.A01(c120985dq);
            if (clipsViewerSource2 != ClipsViewerSource.A2F && clipsViewerSource2 != ClipsViewerSource.A2H) {
                clipsMashupType = ClipsMashupType.A0B;
            } else {
                clipsMashupType = ClipsMashupType.A0A;
            }
            C38321qM c38321qM2 = c120985dq.A02;
            C14360o3.A0B(A00, 7);
            C37855Gl9.A04(abstractC59962oe, fragmentActivity2, A00, clipsMashupType, interfaceC11380iw2, userSession2, A01, c38321qM, c38321qM2, c37855Gl9, A06, valueOf, str, A08, A09, A072);
        }
    }

    public C42532IsB(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, ClipsViewerConfig clipsViewerConfig, ClipsViewerSource clipsViewerSource, C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, IG5 ig5, C15370ps c15370ps) {
        this.A01 = abstractC59962oe;
        this.A0A = c15370ps;
        this.A06 = interfaceC11380iw;
        this.A07 = userSession;
        this.A05 = c37644Ghd;
        this.A09 = ig5;
        this.A00 = fragmentActivity;
        this.A03 = clipsViewerSource;
        this.A04 = c120985dq;
        this.A02 = clipsViewerConfig;
        this.A08 = c38321qM;
    }

    @Override // X.GZ7
    public final void onFail(String str) {
        C15370ps c15370ps = this.A0A;
        AnonymousClass195 anonymousClass195 = (AnonymousClass195) c15370ps.A00;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        c15370ps.A00 = null;
        C41760Ieb.A03(this.A01, this.A03);
        AbstractC37302Gc3.A12(C18950wb.A01.AEp("ClipsOrganicMoreOptionsActionUtil", 817902720), "Failed to fetch original media: ", str);
    }
}
