package X;

import android.content.Context;
import android.os.SystemClock;
import com.instagram.api.schemas.MoreInfoSUGPositionType;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* renamed from: X.6o5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC149536o5 {
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (A01(r18, r20) != X.C6RP.A05) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        if ("com.facebook.orca".equals(r10.CIt()) == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C133115zd A00(android.content.Context r17, com.instagram.common.session.UserSession r18, X.C6RN r19, X.C41181vS r20, java.lang.Boolean r21, java.lang.Integer r22, java.lang.String r23, java.lang.String r24, int r25, boolean r26, boolean r27) {
        /*
            r5 = 0
            r11 = r17
            X.C14360o3.A0B(r11, r5)
            r2 = 1
            r12 = r18
            r4 = r20
            X.6RP r1 = A01(r12, r4)
            X.6RP r3 = X.C6RP.A04
            java.lang.String r17 = "link_sticker_redesign_default"
            r15 = r22
            if (r1 == r3) goto L23
            X.6RP r0 = X.C6RP.A06
            if (r1 == r0) goto Ldd
            X.6RP r0 = X.C6RP.A05
            if (r1 == r0) goto Ldd
            if (r22 != 0) goto Ld9
            java.lang.String r17 = "link_sticker_default"
        L23:
            X.1qM r6 = r4.A0b
            com.instagram.model.androidlink.AndroidLink r10 = X.AbstractC905941u.A02(r11, r12, r6, r5, r5)
            com.instagram.model.androidlink.AndroidLink r0 = X.AbstractC84863qa.A04(r11, r12, r4)
            if (r0 == 0) goto L79
            X.41v r1 = X.EnumC906041v.AD_DESTINATION_PROFILE_VISIT
            X.41v r0 = X.AbstractC114965Hm.A01(r0)
            if (r1 != r0) goto L79
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36329509154341244(0x81117f0002417c, double:3.038266104172385E-306)
            boolean r0 = X.C18U.A06(r5, r12, r0)
            if (r0 == 0) goto L79
            r0 = 2131237935(0x7f081c2f, float:1.8092135E38)
        L47:
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
        L4b:
            X.6RP r1 = A01(r12, r4)
            X.6RP r0 = X.C6RP.A07
            if (r1 == r0) goto L63
            X.6RP r0 = A01(r12, r4)
            if (r0 == r3) goto L63
            X.6RP r1 = A01(r12, r4)
            X.6RP r0 = X.C6RP.A05
            r22 = 0
            if (r1 != r0) goto L65
        L63:
            r22 = 1
        L65:
            X.5zd r10 = new X.5zd
            r13 = r19
            r14 = r21
            r18 = r23
            r19 = r24
            r20 = r25
            r23 = r27
            r21 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r10
        L79:
            if (r26 == 0) goto L7f
            r0 = 2131238853(0x7f081fc5, float:1.8093996E38)
            goto L47
        L7f:
            r9 = 0
            if (r6 == 0) goto Lc9
            boolean r5 = r6.A5v()
        L86:
            if (r10 == 0) goto L95
            java.lang.String r1 = r10.CIt()
            java.lang.String r0 = "com.facebook.orca"
            boolean r0 = r0.equals(r1)
            r8 = 1
            if (r0 != 0) goto L96
        L95:
            r8 = 0
        L96:
            boolean r7 = X.AbstractC906141w.A02(r10)
            if (r10 == 0) goto Lc7
            X.41v r1 = X.AbstractC114965Hm.A01(r10)
        La0:
            X.41v r0 = X.EnumC906041v.AD_DESTINATION_JOIN_CHANNEL
            r6 = 0
            if (r1 != r0) goto La6
            r6 = 1
        La6:
            if (r8 != 0) goto Lac
            if (r7 != 0) goto Lac
            if (r6 == 0) goto Lad
        Lac:
            r9 = 1
        Lad:
            r16 = 0
            if (r9 == 0) goto L4b
            if (r5 != 0) goto L4b
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36602450030891668(0x8209bc00001294, double:3.210875013547567E-306)
            long r0 = X.C18U.A01(r5, r12, r0)
            int r5 = (int) r0
            if (r5 != r2) goto L4b
            if (r8 == 0) goto Lcb
            r0 = 2131237945(0x7f081c39, float:1.8092155E38)
            goto L47
        Lc7:
            r1 = 0
            goto La0
        Lc9:
            r5 = 0
            goto L86
        Lcb:
            if (r7 == 0) goto Ld2
            r0 = 2131237954(0x7f081c42, float:1.8092173E38)
            goto L47
        Ld2:
            if (r6 == 0) goto L4b
            r0 = 2131238114(0x7f081ce2, float:1.8092498E38)
            goto L47
        Ld9:
            java.lang.String r17 = "link_sticker_primary_color"
            goto L23
        Ldd:
            if (r22 == 0) goto L23
            java.lang.String r17 = "link_sticker_redesign_primary_icon"
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC149536o5.A00(android.content.Context, com.instagram.common.session.UserSession, X.6RN, X.1vS, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, int, boolean, boolean):X.5zd");
    }

    public static final Integer A02(UserSession userSession, C41181vS c41181vS) {
        C38321qM c38321qM = c41181vS.A0b;
        if ((c38321qM == null || !C76253bV.A06(c38321qM) || !C18U.A06(C06090Tz.A05, userSession, 36328388167810546L)) && !A07(userSession, c41181vS) && !AbstractC130925vf.A0Q(c38321qM)) {
            int A01 = (int) C18U.A01(C06090Tz.A05, userSession, 36595371926751371L);
            if (A01 != 0) {
                if (A01 != 1) {
                    if (A01 == 3) {
                        return C05F.A0C;
                    }
                }
            }
            return C05F.A00;
        }
        return C05F.A01;
    }

    public static final String A03(Context context, UserSession userSession, C41181vS c41181vS) {
        InterfaceC39301sB Aty;
        String An3;
        C14360o3.A0B(c41181vS, 0);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        if (!c41181vS.CdW()) {
            return null;
        }
        C38321qM c38321qM = c41181vS.A0b;
        c38321qM.getClass();
        AndroidLink A00 = AbstractC905941u.A00(context, userSession, c38321qM, null, false);
        if (A00 == null) {
            return null;
        }
        EnumC906041v A01 = AbstractC114965Hm.A01(A00);
        if (EnumC906041v.AD_DESTINATION_WEB == A01) {
            return A00.CHN();
        }
        if (EnumC906041v.AD_DESTINATION_JOIN_CHANNEL == A01) {
            EnumSet enumSet = AbstractC75103Za.A00;
            InterfaceC39541sb injected = c38321qM.A0C.getInjected();
            if (injected != null && (Aty = injected.Aty()) != null && (An3 = Aty.An3()) != null) {
                if (C18U.A01(C06090Tz.A05, userSession, 36608806582490908L) == 0) {
                    return An3;
                }
                return AbstractC75103Za.A08(context, c38321qM);
            }
            String BNT = c38321qM.A0C.BNT();
            if (BNT != null) {
                return BNT;
            }
            String string = context.getString(2131955206);
            C14360o3.A07(string);
            return string;
        }
        String Ax1 = A00.Ax1();
        if (Ax1 == null || Ax1.length() == 0) {
            return null;
        }
        return context.getString(2131971850, Ax1);
    }

    public static final boolean A05(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C38321qM c38321qM;
        C40C C16;
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(userSession, 3);
        boolean z = false;
        if (!A0A(userSession, c41181vS, c41551w4)) {
            return false;
        }
        if (A02(userSession, c41181vS) == C05F.A0C && (c38321qM = c41181vS.A0b) != null && c38321qM.A0C.C16() != null && (((C16 = c38321qM.A0C.C16()) == null || C16.AvL() == null) && C143726eF.A0B(context))) {
            z = true;
        }
        return !z;
    }

    public static final boolean A08(UserSession userSession, C41181vS c41181vS) {
        InterfaceC39271s5 interfaceC39271s5;
        InterfaceC87803vo BUx;
        InterfaceC107114sH B7j;
        MoreInfoSUGPositionType C3n;
        InterfaceC39541sb injected;
        C14360o3.A0B(userSession, 0);
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null && (injected = c38321qM.A0C.getInjected()) != null) {
            interfaceC39271s5 = injected.AaR();
        } else {
            interfaceC39271s5 = null;
        }
        if (AbstractC129385t0.A02(interfaceC39271s5, userSession, false)) {
            return !C18U.A06(C06090Tz.A06, userSession, 36323680883715567L);
        }
        if (c38321qM == null || (BUx = c38321qM.A0C.BUx()) == null || (B7j = BUx.B7j()) == null || (C3n = B7j.C3n()) == null || C3n != MoreInfoSUGPositionType.A04) {
            return false;
        }
        return true;
    }

    public static final boolean A09(UserSession userSession, C41181vS c41181vS, int i) {
        C38321qM c38321qM;
        C14360o3.A0B(userSession, 0);
        if ((i == 0 || C18U.A06(C06090Tz.A05, userSession, 36328448298008100L)) && (((c38321qM = c41181vS.A0b) == null || (!c38321qM.A5v() && !c38321qM.A5m())) && C18U.A06(C06090Tz.A05, userSession, 36328448297352738L))) {
            return true;
        }
        return false;
    }

    public static final boolean A0A(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        if (!c41181vS.CdW() || (!A04(userSession, c41181vS, c41551w4).isEmpty())) {
            return false;
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36313896948074788L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36313896948468006L);
        if (!AbstractC130925vf.A0b(c41181vS) && !c41181vS.A1B() && !AbstractC130925vf.A0f(c41181vS) && !AbstractC130925vf.A0e(c41181vS) && !c41181vS.A16()) {
            return A06;
        }
        if (!A06 || !A062) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        if (com.instagram.model.reels.sponsored.AutoGeneratedCardType.A0D == r5.A0C.AeF()) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0B(com.instagram.common.session.UserSession r10, X.C41181vS r11, X.C41551w4 r12) {
        /*
            r3 = 0
            X.C14360o3.A0B(r11, r3)
            r0 = r11
            boolean r1 = X.AbstractC130925vf.A0n(r12)
            if (r1 != 0) goto L15
            java.util.List r0 = X.C41551w4.A00(r10, r12)
            java.lang.Object r0 = r0.get(r3)
            X.1vS r0 = (X.C41181vS) r0
        L15:
            X.1qM r0 = r0.A0b
            if (r0 == 0) goto L58
            X.1rF r0 = r0.A0C
            com.instagram.model.showreel.IgShowreelComposition r0 = r0.Bx8()
            if (r0 == 0) goto L58
            java.lang.String r1 = r0.C5i()
        L25:
            java.lang.String r0 = "bloks_dpa_showcase_2"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            r9 = 0
            if (r0 != 0) goto L57
            boolean r0 = X.AbstractC130925vf.A0J(r10, r11, r12)
            if (r0 != 0) goto L57
            r0 = r11
            X.1qM r5 = r11.A0b
            if (r5 == 0) goto L69
            X.1rF r1 = r5.A0C
            X.40C r1 = r1.C16()
            if (r1 == 0) goto L5a
            X.1rF r1 = r5.A0C
            X.40C r1 = r1.C16()
            if (r1 == 0) goto L4f
            X.409 r1 = r1.AvL()
            if (r1 != 0) goto L5a
        L4f:
            java.lang.Integer r2 = A02(r10, r11)
            java.lang.Integer r1 = X.C05F.A00
            if (r2 != r1) goto L5a
        L57:
            return r3
        L58:
            r1 = 0
            goto L25
        L5a:
            X.1rF r1 = r5.A0C
            X.40C r1 = r1.C16()
            if (r1 == 0) goto L69
            X.409 r1 = r1.AvL()
            if (r1 == 0) goto L69
            return r3
        L69:
            X.0Tz r4 = X.C06090Tz.A05
            r1 = 36313896948664615(0x81034c00090927, double:3.028392882437178E-306)
            boolean r8 = X.C18U.A06(r4, r10, r1)
            r1 = 36313896949254441(0x81034c00120929, double:3.0283928828101866E-306)
            boolean r7 = X.C18U.A06(r4, r10, r1)
            X.1vY r6 = r11.A0e
            X.1vY r4 = X.EnumC41231vY.A09
            if (r6 != r4) goto L91
            r5.getClass()
            com.instagram.model.reels.sponsored.AutoGeneratedCardType r2 = com.instagram.model.reels.sponsored.AutoGeneratedCardType.A0D
            X.1rF r1 = r5.A0C
            com.instagram.model.reels.sponsored.AutoGeneratedCardType r1 = r1.AeF()
            if (r2 != r1) goto L91
        L90:
            return r8
        L91:
            boolean r1 = r11.A1B()
            if (r1 != 0) goto L90
            if (r6 != r4) goto La7
            r5.getClass()
            com.instagram.model.reels.sponsored.AutoGeneratedCardType r2 = com.instagram.model.reels.sponsored.AutoGeneratedCardType.A07
            X.1rF r1 = r5.A0C
            com.instagram.model.reels.sponsored.AutoGeneratedCardType r1 = r1.AeF()
            if (r2 != r1) goto La7
            return r8
        La7:
            boolean r1 = X.AbstractC130925vf.A0n(r12)
            if (r1 != 0) goto Lb7
            java.util.List r0 = X.C41551w4.A00(r10, r12)
            java.lang.Object r0 = r0.get(r3)
            X.1vS r0 = (X.C41181vS) r0
        Lb7:
            X.1qM r0 = r0.A0b
            if (r0 == 0) goto Lee
            X.1rF r0 = r0.A0C
            com.instagram.model.showreel.IgShowreelComposition r0 = r0.Bx8()
            if (r0 == 0) goto Lee
            java.lang.String r1 = r0.C5i()
        Lc7:
            java.lang.String r0 = "bloks_dpa_showcase_flexible_tiles"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L90
            boolean r0 = X.AbstractC130925vf.A0c(r11)
            if (r0 != 0) goto L90
            boolean r0 = X.AbstractC130925vf.A0b(r11)
            if (r0 != 0) goto Lf0
            boolean r0 = X.AbstractC130925vf.A0f(r11)
            if (r0 != 0) goto Lf0
            boolean r0 = X.AbstractC130925vf.A0e(r11)
            if (r0 != 0) goto Lf0
            boolean r0 = r11.A16()
            if (r0 != 0) goto Lf0
            return r8
        Lee:
            r1 = 0
            goto Lc7
        Lf0:
            if (r8 == 0) goto Lf6
            if (r7 == 0) goto Lf6
            r9 = 1
            return r9
        Lf6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC149536o5.A0B(com.instagram.common.session.UserSession, X.1vS, X.1w4):boolean");
    }

    public static final C6RP A01(UserSession userSession, C41181vS c41181vS) {
        C06090Tz c06090Tz = C06090Tz.A05;
        int A01 = (int) C18U.A01(c06090Tz, userSession, 36603519478338503L);
        if (C18U.A06(c06090Tz, userSession, 36313896950499635L) && !AbstractC130925vf.A0F(userSession, c41181vS)) {
            A01 = (int) C18U.A01(c06090Tz, userSession, 36595371927275660L);
        }
        if (A01 != 1) {
            if (A01 != 2) {
                if (A01 != 3) {
                    if (A01 != 4) {
                        return C6RP.A07;
                    }
                    return C6RP.A05;
                }
                return C6RP.A06;
            }
            return C6RP.A08;
        }
        return C6RP.A04;
    }

    public static final ArrayList A04(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        ArrayList arrayList = new ArrayList();
        if (AbstractC130925vf.A0o(c41551w4)) {
            arrayList.add("IS_MULTI_ADVERTISER_CAROUSEL");
        }
        List A0c = c41181vS.A0c();
        if (A0c != null && !A0c.isEmpty() && !AbstractC130925vf.A0Q(c41181vS.A0b)) {
            arrayList.add("HAS_OTHER_INTERACTIVE_ELEMENTS");
        }
        if (!c41551w4.A0H.A0v(c41551w4.A03(userSession, c41181vS))) {
            arrayList.add("BACKEND_INVALIDATION");
        }
        if (AbstractC130925vf.A0D(userSession, c41181vS) && !C18U.A06(C06090Tz.A05, userSession, 36313896950237487L)) {
            arrayList.add("IS_DISCLAIMER_AD");
        }
        if (!AbstractC84863qa.A0F(c41181vS)) {
            arrayList.add("NO_CTA_LINKS");
        }
        if (c41181vS.A1J()) {
            arrayList.add("IS_GENERIC_PROFILE_CARD");
        }
        if (c41181vS.A1N()) {
            arrayList.add("IS_LEADGEN_CARD");
        }
        if (c41181vS.A1G()) {
            arrayList.add("IS_FIRST_QUESTION_LEADGEN_CARD_WITH_MCQ");
        }
        if (c41181vS.A1H()) {
            arrayList.add("IS_FIRST_QUESTION_LEADGEN_CARD_WITH_SAQ");
        }
        if (c41181vS.A1Y()) {
            arrayList.add("IS_OFFSITE_LEADGEN_CARD");
        }
        if (c41181vS.A19()) {
            arrayList.add("IS_CLICK_TO_MESSAGING_FAQS_CARD");
        }
        if (AbstractC130925vf.A0H(userSession, c41181vS)) {
            arrayList.add("IS_REMINDER_AD");
        }
        if (c41181vS.A1A()) {
            arrayList.add("IS_CLICK_TO_MESSAGING_WHATSAPP_CARD");
        }
        return arrayList;
    }

    public static final boolean A07(UserSession userSession, C41181vS c41181vS) {
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM == null || !C76253bV.A09(c38321qM) || !C76253bV.A02(userSession, c38321qM)) {
            return false;
        }
        return true;
    }

    public static final boolean A0C(UserSession userSession, C141596ac c141596ac) {
        if (c141596ac.A0O <= 0.0d) {
            return false;
        }
        if ((C18U.A06(C06090Tz.A06, userSession, 36313896950368561L) || c141596ac.A0D <= 0) && !c141596ac.A0j && SystemClock.uptimeMillis() - c141596ac.A0O < ((int) C18U.A01(C06090Tz.A05, userSession, 36595371926358153L))) {
            return false;
        }
        return true;
    }

    public static final boolean A06(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        if (!A05(context, userSession, c41181vS, c41551w4) && !c41181vS.A1J() && !c41181vS.A1N() && !c41181vS.A1G() && !c41181vS.A1H() && !c41181vS.A1Y() && !c41181vS.A19() && !c41181vS.A1A() && !AbstractC130925vf.A0o(c41551w4) && !AbstractC130925vf.A0H(userSession, c41181vS)) {
            return AbstractC84863qa.A0F(c41181vS);
        }
        return false;
    }
}
