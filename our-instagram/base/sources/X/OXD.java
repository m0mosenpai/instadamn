package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OXD {
    public int A00;
    public int A01;
    public int A02;
    public C115435Kd A03;
    public EnumC915447k A04;
    public EnumC915447k A05;
    public C55654Onf A06;
    public Integer A07;
    public List A08;
    public InterfaceC50122Sb A09;
    public final Context A0A;
    public final UserSession A0B;
    public final C47Z A0C;
    public final InterfaceC70363Du A0D;
    public final OI2 A0E;
    public final InterfaceC57966PnC A0F;
    public final C1CM A0G;
    public final String A0H;
    public final String A0I;
    public final List A0J;
    public final Map A0K;
    public final C13920nI A0L;

    public OXD(Context context, UserSession userSession, C47Z c47z, InterfaceC70363Du interfaceC70363Du, InterfaceC57966PnC interfaceC57966PnC, C1CM c1cm, String str, Map map) {
        AbstractC25233BEq.A0x(3, c47z, interfaceC70363Du, str);
        C14360o3.A0B(c1cm, 6);
        this.A0A = context;
        this.A0B = userSession;
        this.A0C = c47z;
        this.A0D = interfaceC70363Du;
        this.A0H = str;
        this.A0G = c1cm;
        this.A0F = interfaceC57966PnC;
        this.A0K = map;
        this.A0L = C13920nI.A00;
        this.A0E = new OI2(c47z, interfaceC70363Du);
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A0J = A1E;
        this.A06 = new C55654Onf();
        this.A07 = C05F.A00;
        this.A0I = userSession.userId;
        if (c47z.A0t()) {
            A1E.addAll(c47z.A0K());
        }
        if (c47z.A10()) {
            A1E.addAll(c47z.A4m);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C115435Kd A01(X.InterfaceC40821up r13, X.C3JY r14, java.lang.String r15) {
        /*
            r12 = this;
            r0 = 1
            X.C14360o3.A0B(r14, r0)
            java.lang.String r4 = r13.getStatus()
            X.C14360o3.A07(r4)
            java.lang.String r3 = r13.getErrorMessage()
            java.lang.String r7 = r13.getErrorType()
            int r0 = r4.length()
            if (r0 != 0) goto L2e
            if (r3 == 0) goto L21
            int r0 = r3.length()
            if (r0 != 0) goto L2e
        L21:
            java.lang.String r0 = ": Invalid reply"
            java.lang.String r0 = X.AnonymousClass001.A0R(r15, r0)
            X.5Kd r4 = X.C115445Ke.A00(r14, r0)
        L2b:
            r12.A03 = r4
            return r4
        L2e:
            int r11 = r14.A02
            r6 = 400(0x190, float:5.6E-43)
            if (r11 < r6) goto L90
            r0 = 500(0x1f4, float:7.0E-43)
            if (r11 >= r0) goto L89
            boolean r5 = r13.isLoginRequired()
            boolean r2 = r13.isCheckpointRequired()
            boolean r1 = r13.isFeedbackRequired()
            r0 = 429(0x1ad, float:6.01E-43)
            if (r11 == r0) goto L86
            if (r2 != 0) goto L86
            if (r5 != 0) goto L86
            if (r1 != 0) goto L86
            r0 = 422(0x1a6, float:5.91E-43)
            if (r11 != r0) goto L7e
            X.5Kb r5 = X.EnumC115415Kb.A09
        L54:
            X.5Kb r0 = X.EnumC115415Kb.A0O
            if (r5 == r0) goto L7c
            java.lang.String r8 = r13.getLocalizedErrorMessage()
        L5c:
            java.lang.StringBuilder r1 = X.AbstractC166997dE.A11(r15)
            java.lang.String r0 = ": Reply: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r6 = X.MSZ.A0u(r0, r3, r1)
            r9 = 0
            X.5Kd r4 = new X.5Kd
            r10 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto L2b
        L7c:
            r8 = 0
            goto L5c
        L7e:
            if (r11 != r6) goto L83
            X.5Kb r5 = X.EnumC115415Kb.A0J
            goto L54
        L83:
            X.5Kb r5 = X.EnumC115415Kb.A0F
            goto L54
        L86:
            X.5Kb r5 = X.EnumC115415Kb.A0B
            goto L54
        L89:
            r0 = 600(0x258, float:8.41E-43)
            if (r11 >= r0) goto L90
            X.5Kb r5 = X.EnumC115415Kb.A0O
            goto L54
        L90:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            java.lang.String r1 = r13.getStatus()
            java.lang.String r0 = r13.getErrorMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = "Unexpected IG Reply %d, %s, %s"
            java.lang.String r1 = X.AbstractC13670mt.A06(r0, r1)
            java.lang.String r0 = "ErrorType"
            X.C0w9.A03(r0, r1)
            X.5Kb r5 = X.EnumC115415Kb.A0B
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OXD.A01(X.1up, X.3JY, java.lang.String):X.5Kd");
    }

    public final C115435Kd A02(EnumC115415Kb enumC115415Kb, String str) {
        C14360o3.A0B(str, 1);
        C115435Kd A01 = C115445Ke.A01(enumC115415Kb, str, null, null);
        this.A03 = A01;
        return A01;
    }

    public final C115435Kd A03(EnumC115415Kb enumC115415Kb, String str, String str2, Throwable th) {
        AbstractC167027dH.A12(enumC115415Kb, str, str2);
        C115435Kd A01 = C115445Ke.A01(enumC115415Kb, str, str2, th);
        this.A03 = A01;
        this.A0D.EHh(enumC115415Kb, this.A0C, str, str2, A01.A08);
        return A01;
    }

    public static String A00(OXD oxd, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("from ");
        sb.append(oxd.A04);
        sb.append(" to ");
        sb.append(obj);
        return sb.toString();
    }

    public final C115435Kd A04(EnumC115415Kb enumC115415Kb, String str, Throwable th) {
        String str2;
        Map A07;
        boolean A1a = AbstractC167017dG.A1a(enumC115415Kb, str);
        C115435Kd A01 = C115445Ke.A01(enumC115415Kb, str, null, th);
        this.A03 = A01;
        InterfaceC70363Du interfaceC70363Du = this.A0D;
        C47Z c47z = this.A0C;
        C70353Dt c70353Dt = (C70353Dt) interfaceC70363Du;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c70353Dt.A01, "ig_video_render_cancel");
        if (A0f.isSampled()) {
            Context context = c70353Dt.A00;
            UserSession userSession = c70353Dt.A02;
            C50703MZy c50703MZy = new C50703MZy(context, userSession, c47z);
            MSZ.A1G(A0f, c50703MZy.A02);
            C50704MZz.A05(A0f, c50703MZy, "connection", AbstractC15820qc.A08(((C50704MZz) c50703MZy).A00));
            C50704MZz.A02(A0f, userSession, c47z, c50703MZy);
            if (c47z.A0D() == ShareType.A0V) {
                str2 = C50702MZx.A03(userSession, c47z, null, A1a);
            } else {
                str2 = null;
            }
            A0f.AAP("target_surface", str2);
            A0f.AAP("ingest_type", c50703MZy.A0I());
            C50704MZz.A03(A0f, c50703MZy);
            A0f.AAP("reason", str);
            if (c47z.A5D) {
                A07 = null;
            } else {
                A07 = c50703MZy.A07();
            }
            AbstractC50522MSa.A1F(A0f, A07);
            A0f.Cht();
        }
        if (th instanceof C105764pn) {
            c70353Dt.Ckw(null, c47z, "VIDEO_RENDER_CANCEL", "", th);
        }
        c70353Dt.Cl0(c47z, "ig_video_render_cancel", null);
        return A01;
    }
}
