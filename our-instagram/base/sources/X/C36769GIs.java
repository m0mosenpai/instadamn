package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.GIs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36769GIs implements GZW {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ C35199Ffr A04;
    public final /* synthetic */ InterfaceC37219GaU A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ JSONObject A09;

    public C36769GIs(Context context, FragmentActivity fragmentActivity, UserSession userSession, User user, C35199Ffr c35199Ffr, InterfaceC37219GaU interfaceC37219GaU, String str, String str2, String str3, JSONObject jSONObject) {
        this.A02 = userSession;
        this.A03 = user;
        this.A04 = c35199Ffr;
        this.A00 = context;
        this.A01 = fragmentActivity;
        this.A07 = str;
        this.A06 = str2;
        this.A09 = jSONObject;
        this.A05 = interfaceC37219GaU;
        this.A08 = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    @Override // X.GZW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D6u(int r20, boolean r21) {
        /*
            r19 = this;
            r2 = r19
            com.instagram.common.session.UserSession r9 = r2.A02
            com.instagram.user.model.User r0 = r2.A03
            java.lang.String r3 = r0.getId()
            X.Ffr r5 = r2.A04
            r1 = 3
            X.C14360o3.A0B(r5, r1)
            r1 = r20
            X.C35263Fgx.A01(r9, r5, r3, r1)
            r18 = r21
            if (r21 == 0) goto L44
            java.lang.String r13 = r0.getId()
            java.lang.String r11 = r5.A09
            X.C14360o3.A07(r11)
            java.lang.String r3 = r5.A08
            com.instagram.user.model.FollowStatus r3 = com.instagram.user.model.FollowStatus.valueOf(r3)
            X.C14360o3.A07(r3)
            X.73w r10 = X.C1571673v.A01(r3)
            java.lang.String r14 = r5.A07
            java.lang.String r15 = r5.A0B
            int r4 = r5.A00
            java.lang.String r3 = r5.A0A
            X.76z r7 = r5.A01
            X.Eqz r8 = r5.A02
            java.lang.String r12 = "block_report"
            r17 = r4
            r16 = r3
            X.C1571673v.A03(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L44:
            android.content.Context r10 = r2.A00
            androidx.fragment.app.FragmentActivity r3 = r2.A01
            java.lang.String r6 = r2.A07
            java.lang.String r5 = r2.A06
            if (r5 != 0) goto L52
            java.lang.String r5 = X.AbstractC34332FCa.A00(r6)
        L52:
            org.json.JSONObject r4 = r2.A09
            X.GaU r7 = r2.A05
            java.lang.String r8 = r2.A08
            r11 = r9
            r13 = r7
            r14 = r6
            r15 = r5
            r16 = r4
            r17 = r1
            r12 = r0
            X.AbstractC34336FCe.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = 1
            if (r1 == r0) goto Lc0
            boolean r0 = X.AbstractC14490oL.A09(r10)
            if (r0 == 0) goto Lbc
            X.0Tz r0 = X.C06090Tz.A05
            r4 = 36321395960980878(0x810a1e0000258e, double:3.033135288022082E-306)
            boolean r0 = X.C18U.A06(r0, r9, r4)
            if (r0 == 0) goto Lbc
            X.8hC r2 = X.AbstractC31171DnF.A0I(r10)
            r0 = 2131958614(0x7f131b56, float:1.9553845E38)
            java.lang.String r0 = X.AbstractC167007dF.A0f(r10, r8, r0)
            r2.A05 = r0
            r0 = 2131975519(0x7f135d5f, float:1.9588133E38)
            r2.A09(r0)
            r2.A07()
            r0 = 7
        L91:
            X.DialogInterfaceOnDismissListenerC35463FkK.A00(r2, r7, r0)
            X.AbstractC166987dD.A1W(r2)
        L97:
            r2 = 2
            java.lang.String r0 = "profile"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lb5
            if (r20 == 0) goto La4
            if (r1 != r2) goto Lb5
        La4:
            X.1VN r2 = X.C1VN.A00
            if (r2 == 0) goto Lb5
            boolean r0 = r10 instanceof android.app.Activity
            if (r0 == 0) goto Lb5
            android.app.Activity r10 = (android.app.Activity) r10
            if (r20 != 0) goto Lb9
            java.lang.String r0 = "276988983850056"
        Lb2:
            r2.A02(r9, r10, r0)
        Lb5:
            X.C1Yn.A01(r3, r9, r1)
            return
        Lb9:
            java.lang.String r0 = "2811804699078398"
            goto Lb2
        Lbc:
            X.AbstractC35098Fd9.A02(r10, r7, r8, r1)
            goto L97
        Lc0:
            X.8hC r2 = X.AbstractC31171DnF.A0I(r10)
            r0 = 2131958616(0x7f131b58, float:1.955385E38)
            java.lang.String r0 = X.AbstractC167007dF.A0f(r10, r8, r0)
            X.C14360o3.A0A(r0)
            r2.A05 = r0
            r0 = 2131958615(0x7f131b57, float:1.9553847E38)
            java.lang.String r0 = X.AbstractC166997dE.A0p(r10, r0)
            r2.A0r(r0)
            r2.A07()
            r0 = 8
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36769GIs.D6u(int, boolean):void");
    }

    @Override // X.GZW
    public final void onCancel() {
        C1VN c1vn;
        Context context = this.A00;
        UserSession userSession = this.A02;
        User user = this.A03;
        String str = this.A07;
        InterfaceC37219GaU interfaceC37219GaU = this.A05;
        C35199Ffr c35199Ffr = this.A04;
        if (interfaceC37219GaU != null) {
            interfaceC37219GaU.onCancel();
        }
        C35263Fgx.A05(userSession, c35199Ffr, user.getId(), !user.CQf());
        if (str.equals("profile") && !user.CQf() && (c1vn = C1VN.A00) != null && (context instanceof Activity)) {
            c1vn.A02(userSession, (Activity) context, "754144705306599");
        }
    }
}
