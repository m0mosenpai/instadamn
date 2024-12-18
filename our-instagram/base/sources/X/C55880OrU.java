package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.OrU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55880OrU implements InterfaceC57926PmW {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C54472O5a A03;
    public final /* synthetic */ C54722OEz A04;
    public final /* synthetic */ ENZ A05;
    public final /* synthetic */ boolean A06;

    @Override // X.InterfaceC57926PmW
    public final void Dlm(EnumC76753cN enumC76753cN) {
        C14360o3.A0B(enumC76753cN, 0);
        if (enumC76753cN == EnumC76753cN.A06) {
            UserSession userSession = this.A02;
            C196068lw.A00(userSession).A01(C55202OeD.A01, null, "reels_row_share");
            C54722OEz c54722OEz = this.A04;
            C55202OeD.A01(this.A00, this.A01, userSession, new C54563O8p(this.A03.A00, this.A06), c54722OEz, this.A05);
            return;
        }
        if (enumC76753cN == EnumC76753cN.A05) {
            C54722OEz c54722OEz2 = this.A04;
            IgdsButton igdsButton = c54722OEz2.A06;
            MSY.A1F(igdsButton);
            c54722OEz2.A05.setVisibility(8);
            igdsButton.setVisibility(8);
            c54722OEz2.A01.setVisibility(0);
            return;
        }
        if (enumC76753cN != EnumC76753cN.A04) {
            return;
        }
        MSY.A1F(this.A04.A06);
    }

    public C55880OrU(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, C54472O5a c54472O5a, C54722OEz c54722OEz, ENZ enz, boolean z) {
        this.A02 = userSession;
        this.A04 = c54722OEz;
        this.A06 = z;
        this.A03 = c54472O5a;
        this.A00 = context;
        this.A01 = abstractC59962oe;
        this.A05 = enz;
    }
}
