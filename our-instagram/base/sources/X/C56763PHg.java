package X;

import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.PHg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56763PHg implements InterfaceC1119153d {
    public final /* synthetic */ C130135uJ A00;
    public final /* synthetic */ IgdsSwitch A01;
    public final /* synthetic */ C50808McV A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public C56763PHg(C130135uJ c130135uJ, IgdsSwitch igdsSwitch, C50808McV c50808McV, String str, String str2) {
        this.A02 = c50808McV;
        this.A00 = c130135uJ;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = igdsSwitch;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        C50808McV c50808McV = this.A02;
        UserSession userSession = c50808McV.A0J;
        C130135uJ c130135uJ = this.A00;
        String obj = c130135uJ.A02.toString();
        String str = this.A03;
        String str2 = this.A04;
        AbstractC130145uK.A02(userSession, "default_privacy_consent_bottomsheet_dismiss_click", obj, str, str2, c130135uJ.A01.toString(), false, C196218mC.A00(userSession), c130135uJ.A05);
        C131975xX c131975xX = C131965xW.A05;
        if (C131975xX.A02(c130135uJ) && !C131975xX.A00(userSession).A0B()) {
            C50808McV.A03(c130135uJ, this.A01, c50808McV);
            C131975xX.A00(userSession).A07(AbstractC166997dE.A0L(c50808McV), str2);
        }
    }
}
