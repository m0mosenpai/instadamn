package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes12.dex */
public final class XMI implements InterfaceC81993lL {
    public final /* synthetic */ C41551w4 A00;
    public final /* synthetic */ C143556du A01;
    public final /* synthetic */ C146826jK A02;

    public XMI(C41551w4 c41551w4, C143556du c143556du, C146826jK c146826jK) {
        this.A02 = c146826jK;
        this.A00 = c41551w4;
        this.A01 = c143556du;
    }

    @Override // X.InterfaceC81993lL
    public final void DPm(String str) {
        C146826jK c146826jK = this.A02;
        c146826jK.A0A.remove(this);
        C143556du c143556du = this.A01;
        C41551w4 c41551w4 = c143556du.A09;
        C41551w4 c41551w42 = this.A00;
        if (c41551w4 == c41551w42) {
            UserSession userSession = c146826jK.A02;
            AbstractC140696Xx.A00(userSession).A06(c41551w42.A08(userSession));
            c146826jK.A08.ADm(c41551w42.A08(userSession), c41551w42, c143556du);
        }
    }

    @Override // X.InterfaceC81993lL
    public final void DPz(String str, boolean z) {
        C146826jK c146826jK = this.A02;
        c146826jK.A0A.remove(this);
        C41551w4 c41551w4 = this.A00;
        UserSession userSession = c146826jK.A02;
        c41551w4.A0B(userSession);
        C143556du c143556du = this.A01;
        if (c143556du.A09 == c41551w4) {
            if (!c41551w4.A0E(userSession)) {
                c146826jK.A05.A02(c41551w4.A0H, c41551w4.A09(userSession), z);
                AbstractC140696Xx.A00(userSession).A07(c41551w4.A08(userSession));
                c146826jK.A08.ADm(c41551w4.A09(userSession), c41551w4, c143556du);
                return;
            }
            AbstractC140696Xx.A00(userSession).A06(c41551w4.A08(userSession));
            c146826jK.A08.ADm(c41551w4.A08(userSession), c41551w4, c143556du);
            if (str == null || str.equals(c146826jK.A00)) {
                return;
            }
            c146826jK.A00 = str;
            AbstractC115975Mo.A01(userSession, str, "reel_empty", c146826jK.A04.A00);
        }
    }
}
