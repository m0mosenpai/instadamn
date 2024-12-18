package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelViewerConfig;

/* loaded from: classes12.dex */
public final class YFS implements InterfaceC81993lL {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C41551w4 A01;
    public final /* synthetic */ C140436Wx A02;
    public final /* synthetic */ C146826jK A03;

    public YFS(Context context, C41551w4 c41551w4, C140436Wx c140436Wx, C146826jK c146826jK) {
        this.A03 = c146826jK;
        this.A01 = c41551w4;
        this.A02 = c140436Wx;
        this.A00 = context;
    }

    @Override // X.InterfaceC81993lL
    public final void DPm(String str) {
        C146826jK c146826jK = this.A03;
        c146826jK.A0A.remove(this);
        C41551w4 c41551w4 = this.A02.A01;
        C41551w4 c41551w42 = this.A01;
        if (c41551w4 == c41551w42) {
            UserSession userSession = c146826jK.A02;
            AbstractC140696Xx.A00(userSession).A06(c41551w42.A08(userSession));
        }
    }

    @Override // X.InterfaceC81993lL
    public final void DPz(String str, boolean z) {
        C146826jK c146826jK = this.A03;
        c146826jK.A0A.remove(this);
        C41551w4 c41551w4 = this.A01;
        UserSession userSession = c146826jK.A02;
        c41551w4.A0B(userSession);
        C140436Wx c140436Wx = this.A02;
        if (c140436Wx.A01 == c41551w4) {
            if (!c41551w4.A0E(userSession)) {
                C41181vS A09 = c41551w4.A09(userSession);
                int A02 = c41551w4.A02(userSession);
                int A03 = c41551w4.A03(userSession, A09);
                AbstractC140696Xx.A00(userSession).A07(c41551w4.A08(userSession));
                Context context = this.A00;
                C141596ac C00 = c146826jK.A06.C00(A09);
                InterfaceC145416h0 interfaceC145416h0 = c146826jK.A07;
                C146036i0 c146036i0 = c146826jK.A09;
                ReelViewerConfig reelViewerConfig = c146826jK.A03;
                C3G2 c3g2 = c146826jK.A04;
                C6TR.A01(context, c146826jK.A01, userSession, c146826jK.A08, A09, c41551w4, reelViewerConfig, c3g2, C00, c146036i0, c140436Wx, interfaceC145416h0, A02, A03);
                return;
            }
            if (str != null && !str.equals(c146826jK.A00)) {
                c146826jK.A00 = str;
                AbstractC115975Mo.A01(userSession, str, "reel_empty", c146826jK.A04.A00);
            }
            if (c140436Wx.A01 != c41551w4) {
                return;
            }
            AbstractC140696Xx.A00(userSession).A06(c41551w4.A08(userSession));
        }
    }
}
