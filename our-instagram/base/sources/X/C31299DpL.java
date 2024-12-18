package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.DpL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31299DpL extends AbstractC46524KiP implements GZA {
    public User A00;
    public C34413FFd A01;
    public final int A02;
    public final UserSession A03;
    public final C164677Yg A04;
    public final C2056398n A05;
    public final FragmentActivity A06;

    @Override // X.AbstractC46524KiP
    public final View A06(Context context) {
        InterfaceC81183jn interfaceC81183jn;
        C14360o3.A0B(context, 0);
        User user = this.A00;
        if (user != null) {
            interfaceC81183jn = user.A03.BdE();
        } else {
            interfaceC81183jn = null;
        }
        C34413FFd c34413FFd = new C34413FFd(context, interfaceC81183jn, this);
        this.A01 = c34413FFd;
        return c34413FFd.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
    
        if (r7.isEmpty() != false) goto L32;
     */
    @Override // X.AbstractC46524KiP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(X.InterfaceC50428MOi r9, X.InterfaceC37159GYw r10, X.C2EC r11, java.lang.String r12, boolean r13) {
        /*
            r8 = this;
            r5 = 1
            X.C14360o3.A0B(r10, r5)
            if (r11 == 0) goto Lee
            java.util.List r0 = r11.BSH()
            java.lang.Object r2 = X.AbstractC001800i.A0J(r0)
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            r7 = 0
            if (r2 == 0) goto L21
            com.instagram.common.session.UserSession r0 = r8.A03
            X.18A r1 = X.AnonymousClass189.A00(r0)
            java.lang.String r0 = r2.getId()
            com.instagram.user.model.User r7 = r1.A02(r0)
        L21:
            r8.A00 = r7
            boolean r0 = r11.CVQ()
            r4 = 0
            if (r0 != 0) goto Lee
            if (r7 == 0) goto Lee
            com.instagram.common.session.UserSession r3 = r8.A03
            X.2kX r0 = X.C57582kX.A00(r3)
            boolean r0 = r0.A0Q(r7)
            if (r0 == 0) goto Lee
            X.17P r0 = r7.A03
            X.3jn r0 = r0.BdE()
            if (r0 == 0) goto Lee
            java.util.List r0 = r0.BdF()
            if (r0 == 0) goto Lee
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            if (r0 != r5) goto Lee
            X.98n r6 = r8.A05
            X.0ry r2 = r6.A07
            X.0YR[] r1 = X.C2056398n.A0d
            r0 = 18
            java.lang.Object r0 = X.AbstractC31171DnF.A0Y(r6, r2, r1, r0)
            int r1 = X.AbstractC166987dD.A0H(r0)
            int r0 = r8.A02
            if (r1 >= r0) goto Lee
            X.17P r0 = r7.A03
            X.3jn r0 = r0.BdE()
            if (r0 == 0) goto L9b
            java.util.List r0 = r0.BdF()
            if (r0 == 0) goto L9b
            java.util.ArrayList r7 = X.AbstractC166987dD.A1E()
            java.util.Iterator r6 = r0.iterator()
        L76:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r2 = r6.next()
            r0 = r2
            X.44Q r0 = (X.C44Q) r0
            java.lang.Boolean r1 = r0.CYK()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L76
            r7.add(r2)
            goto L76
        L95:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto Lee
        L9b:
            X.7Yg r0 = r8.A04
            if (r0 == 0) goto Lee
            X.7Yf r2 = r0.A00
            X.0sZ r0 = r2.A0I
            java.lang.Object r1 = r0.invoke()
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            X.Bbn r0 = r2.A00
            if (r0 == 0) goto Lee
            if (r1 == 0) goto Lee
            X.0sZ r0 = r2.A0F
            java.lang.Object r0 = r0.invoke()
            X.7U0 r0 = (X.C7U0) r0
            X.7Ts r0 = r0.BT6()
            java.util.ArrayList r0 = r0.Bku(r5)
            boolean r0 = X.AbstractC25226BEj.A1b(r0)
            if (r0 != 0) goto Lee
            int r1 = r1.A1c()
            X.0sZ r0 = r2.A0J
            java.lang.Object r0 = r0.invoke()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.3OO r1 = r0.A0W(r1, r4)
            boolean r0 = r1 instanceof X.KS6
            if (r0 != 0) goto Lee
            boolean r0 = r1 instanceof X.C161747Mj
            if (r0 != 0) goto Lee
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318204800342035(0x81073700011813, double:3.031117185184305E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto Lee
            r10.Dpu(r8)
            return
        Lee:
            r10.onFailure()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31299DpL.A07(X.MOi, X.GYw, X.2EC, java.lang.String, boolean):void");
    }

    @Override // X.AbstractC46524KiP
    public final void A04(boolean z) {
        C154886xd A00 = AbstractC154876xc.A00(this.A03);
        User user = this.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00.A01, "instagram_ibc_profile_actions");
        if (A0f.isSampled() && user != null) {
            AbstractC31181DnP.A0d(A0f, A00);
            AbstractC31177DnL.A1F(A0f, "see_channel_button");
            AbstractC31181DnP.A0e(A0f, A00, user, "channel_upsell_banner_rendered");
            A0f.A7v("is_test_user", AbstractC166997dE.A0a());
            String str = A00.A00;
            if (str == null) {
                C14360o3.A0F("sessionId");
                throw C00O.createAndThrow();
            }
            AbstractC31172DnG.A1P(A0f, str);
            A0f.Cht();
        }
        C2056398n c2056398n = this.A05;
        c2056398n.A04(AbstractC166987dD.A0H(AbstractC31171DnF.A0Y(c2056398n, c2056398n.A07, C2056398n.A0d, 18)) + 1);
    }

    @Override // X.GZA
    public final void onActionClicked() {
        String str;
        InterfaceC81183jn BdE;
        List BdF;
        UserSession userSession = this.A03;
        C154886xd A00 = AbstractC154876xc.A00(userSession);
        User user = this.A00;
        boolean z = false;
        if (user != null && (BdE = user.A03.BdE()) != null && (BdF = BdE.BdF()) != null && BdF.size() > 1) {
            z = true;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00.A01, "instagram_ibc_profile_actions");
        if (A0f.isSampled() && user != null) {
            AbstractC31181DnP.A0d(A0f, A00);
            AbstractC25232BEp.A1K(A0f, "see_channel_button");
            if (z) {
                str = AbstractC43591JPw.A00(135);
            } else {
                str = "single_channel_rendered";
            }
            AbstractC31181DnP.A0e(A0f, A00, user, str);
            A0f.A7v("is_test_user", AbstractC166997dE.A0a());
            String str2 = A00.A00;
            if (str2 == null) {
                C14360o3.A0F("sessionId");
                throw C00O.createAndThrow();
            }
            AbstractC31172DnG.A1P(A0f, str2);
            A0f.Cht();
        }
        this.A05.A04(this.A02);
        C14360o3.A0B(userSession, 0);
        ((G4S) userSession.A01(G4S.class, new C37017GSy(userSession, 39))).Cqf(this.A06, this.A00, "creator_dm", false);
        C34413FFd c34413FFd = this.A01;
        if (c34413FFd != null) {
            c34413FFd.A00.setVisibility(8);
        }
    }

    @Override // X.GZA
    public final void onBannerDismissed() {
        C154886xd A00 = AbstractC154876xc.A00(this.A03);
        User user = this.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00.A01, "instagram_ibc_profile_actions");
        if (A0f.isSampled() && user != null) {
            AbstractC31181DnP.A0d(A0f, A00);
            AbstractC25232BEp.A1K(A0f, "see_channel_button");
            AbstractC31181DnP.A0e(A0f, A00, user, "dismiss_channel_upsell_banner");
            A0f.A7v("is_test_user", AbstractC166997dE.A0a());
            String str = A00.A00;
            if (str == null) {
                C14360o3.A0F("sessionId");
                throw C00O.createAndThrow();
            }
            AbstractC31172DnG.A1P(A0f, str);
            A0f.Cht();
        }
        this.A05.A04(this.A02);
    }

    public C31299DpL(FragmentActivity fragmentActivity, UserSession userSession, C164677Yg c164677Yg) {
        this.A06 = fragmentActivity;
        this.A03 = userSession;
        this.A04 = c164677Yg;
        this.A05 = AbstractC2056298m.A00(userSession);
        this.A02 = AbstractC25225BEi.A07(C06090Tz.A06, userSession, 36599679777115766L);
    }
}
