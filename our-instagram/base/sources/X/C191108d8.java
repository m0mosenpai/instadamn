package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8d8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191108d8 {
    public final UserSession A00;
    public final C40121td A01;
    public final User A02;
    public final Map A03;
    public final InterfaceC53852dP A04;

    public C191108d8(UserSession userSession, C40121td c40121td) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c40121td, 2);
        this.A00 = userSession;
        this.A01 = c40121td;
        this.A02 = C08730cb.A00(userSession).A00();
        this.A03 = new LinkedHashMap();
        InterfaceC53852dP interfaceC53852dP = new InterfaceC53852dP() { // from class: X.8d9
            @Override // X.InterfaceC53852dP
            public final void DHI(C47Z c47z) {
                C26086BgF c26086BgF;
                C14360o3.A0B(c47z, 0);
                if (c47z.A0D() == ShareType.A0U) {
                    C38321qM c38321qM = c47z.A1C;
                    C191108d8 c191108d8 = C191108d8.this;
                    C25671My A00 = AbstractC25651Mw.A00(c191108d8.A00);
                    if (c38321qM != null) {
                        c26086BgF = new C26086BgF(c38321qM, c191108d8.A02, (String) null, 12);
                    } else {
                        c26086BgF = null;
                    }
                    A00.E4s(new C56019Otq(c26086BgF, c191108d8, c47z.A3t));
                }
            }

            @Override // X.InterfaceC53852dP
            public final /* synthetic */ void DSR(C47Z c47z) {
            }
        };
        this.A04 = interfaceC53852dP;
        c40121td.A0H(interfaceC53852dP);
    }
}
