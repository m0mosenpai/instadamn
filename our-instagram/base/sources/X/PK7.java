package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PK7 implements InterfaceC58134Ppx {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C52527NLw A01;
    public final /* synthetic */ N51 A02;
    public final /* synthetic */ InterfaceC58134Ppx A03;

    public PK7(Activity activity, C52527NLw c52527NLw, N51 n51, InterfaceC58134Ppx interfaceC58134Ppx) {
        this.A03 = interfaceC58134Ppx;
        this.A02 = n51;
        this.A01 = c52527NLw;
        this.A00 = activity;
    }

    @Override // X.InterfaceC58134Ppx
    public final void getDismissAction() {
        C54764OHw c54764OHw;
        C52527NLw c52527NLw = this.A01;
        if (!c52527NLw.A02) {
            UserSession userSession = c52527NLw.A06;
            if (C18U.A06(C06090Tz.A06, userSession, 2342158370745945252L) && (c54764OHw = c52527NLw.A00) != null) {
                c54764OHw.A00(false);
            }
            AbstractC35174FfR.A02(EnumC72435Xdf.A06, userSession, "upsell_dismiss", null, 2);
        }
        c52527NLw.A02 = false;
    }

    @Override // X.InterfaceC58134Ppx
    public final void getPrimaryCtaAction() {
        InterfaceC58134Ppx interfaceC58134Ppx = this.A03;
        if (interfaceC58134Ppx != null) {
            interfaceC58134Ppx.getPrimaryCtaAction();
        }
        N51 n51 = this.A02;
        PK2 pk2 = new PK2(this.A00, n51);
        String A01 = EnumC72412Xd8.A0B.A01();
        C28301Yr A00 = AbstractC34213F7l.A00();
        C52527NLw c52527NLw = this.A01;
        UserSession userSession = c52527NLw.A06;
        A00.A01(n51, userSession, pk2).A06(A01, AbstractC149576oA.A00(userSession).A08("IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL"));
        c52527NLw.A02 = true;
        AbstractC35174FfR.A02(EnumC72435Xdf.A06, userSession, "upsell_primary_click", null, 2);
        C52527NLw.A00(EnumC201098ur.ACCEPT, c52527NLw);
    }

    @Override // X.InterfaceC58134Ppx
    public final void getSecondaryCtaAction() {
        AbstractC167017dG.A0y(this.A00, C3DN.A00);
        C52527NLw c52527NLw = this.A01;
        c52527NLw.A02 = true;
        C54764OHw c54764OHw = c52527NLw.A00;
        if (c54764OHw != null) {
            c54764OHw.A00(false);
        }
        AbstractC35174FfR.A02(EnumC72435Xdf.A06, c52527NLw.A06, "upsell_secondary_click", null, 2);
        C52527NLw.A00(EnumC201098ur.DECLINE, c52527NLw);
    }
}
