package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.PHe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56761PHe implements InterfaceC1119153d {
    public final /* synthetic */ P0G A00;
    public final /* synthetic */ C130135uJ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public C56761PHe(P0G p0g, C130135uJ c130135uJ, String str, String str2) {
        this.A00 = p0g;
        this.A01 = c130135uJ;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        P0G p0g = this.A00;
        C51045Mgx c51045Mgx = p0g.A08.A0D.A02;
        C130135uJ c130135uJ = this.A01;
        String str = this.A02;
        String str2 = this.A03;
        AbstractC59962oe abstractC59962oe = p0g.A05;
        abstractC59962oe.requireActivity();
        Context requireContext = abstractC59962oe.requireContext();
        UserSession userSession = c51045Mgx.A01;
        AbstractC130145uK.A02(userSession, "default_privacy_consent_bottomsheet_dismiss_click", c130135uJ.A02.toString(), str, str2, c130135uJ.A01.toString(), false, C196218mC.A00(userSession), c130135uJ.A05);
        C131975xX c131975xX = C131965xW.A05;
        if (C131975xX.A02(c130135uJ) && !C131975xX.A00(userSession).A0B()) {
            if (MSX.A0Q(userSession) != null) {
                c130135uJ.A00 = true;
                C131975xX.A00(userSession).A0A(c130135uJ);
            }
            C51045Mgx.A01(c51045Mgx);
            C51045Mgx.A00(c51045Mgx);
            C131975xX.A00(userSession).A07(requireContext, str2);
        }
    }
}
