package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.Boh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26584Boh extends AbstractC51572Yf {
    public final JLM A00;
    public final JMS A01;
    public final ClipsViewerConfig A02;
    public final C120985dq A03;
    public final C37644Ghd A04;
    public final UserSession A05;
    public final C38321qM A06;
    public final InterfaceC31137Dmc A07;
    public final String A08;
    public final InterfaceC16820sZ A09;
    public final boolean A0A;
    public final boolean A0B;
    public final InterfaceC60442pS A0C;
    public final String A0D;
    public final boolean A0E;

    public C26584Boh(JLM jlm, JMS jms, ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, InterfaceC31137Dmc interfaceC31137Dmc, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(userSession, 1);
        AbstractC25234BEr.A0k(4, c38321qM, c120985dq, c37644Ghd, interfaceC31137Dmc);
        AbstractC167007dF.A1J(clipsViewerConfig, 8, interfaceC60442pS);
        C14360o3.A0B(str, 11);
        this.A05 = userSession;
        this.A00 = jlm;
        this.A01 = jms;
        this.A06 = c38321qM;
        this.A03 = c120985dq;
        this.A04 = c37644Ghd;
        this.A07 = interfaceC31137Dmc;
        this.A02 = clipsViewerConfig;
        this.A0C = interfaceC60442pS;
        this.A0B = z;
        this.A0D = str;
        this.A0A = z2;
        this.A08 = str2;
        this.A09 = interfaceC16820sZ;
        this.A0E = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r19) {
        /*
            r18 = this;
            r6 = 0
            r5 = r19
            X.C14360o3.A0B(r5, r6)
            r4 = 2131238034(0x7f081c92, float:1.8092335E38)
            r7 = r18
            X.JMS r0 = r7.A01
            r13 = 0
            if (r0 == 0) goto L1d
            com.instagram.api.schemas.CreatorViewerContextCTA r0 = r0.ArI()
            if (r0 == 0) goto L1d
            java.lang.String r3 = r0.BEi()
            if (r3 == 0) goto L1e
            goto L22
        L1d:
            r3 = r13
        L1e:
            r0 = 2131238034(0x7f081c92, float:1.8092335E38)
            goto L2c
        L22:
            java.lang.Integer r0 = X.AbstractC65877Tvg.A05(r3)     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L1e
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L31
        L2c:
            android.graphics.drawable.Drawable r9 = X.AbstractC77623dm.A0E(r5, r0)     // Catch: java.lang.Exception -> L31
            goto L55
        L31:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            r0 = 1626(0x65a, float:2.279E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r1.append(r0)
            r1.append(r3)
            r0 = 1470(0x5be, float:2.06E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.String r1 = X.AbstractC167017dG.A0n(r2, r0, r1)
            java.lang.String r0 = "CreatorViewerInsightsLineComponentKt"
            X.AbstractC12120kG.A07(r0, r1, r13)
            android.graphics.drawable.Drawable r9 = X.AbstractC77623dm.A0E(r5, r4)
        L55:
            X.3ay r0 = X.C51722Yv.A02
            r1 = 0
            java.lang.Integer r0 = X.C05F.A0C
            X.2Yv r4 = X.AbstractC25233BEq.A0a(r13, r0, r1)
            long r2 = X.AbstractC77623dm.A0B(r5)
            long r0 = X.AbstractC77623dm.A08(r5)
            X.9CU r2 = X.AbstractC25227BEk.A0c(r2)
            X.2Yv r1 = X.AbstractC25234BEr.A0D(r4, r2, r6, r0)
            r0 = 30
            X.DRP r0 = X.DRP.A00(r7, r0)
            X.2Yv r2 = X.AbstractC25233BEq.A0d(r1, r0)
            r0 = 31
            X.DRP r1 = X.DRP.A00(r7, r0)
            java.lang.Integer r0 = X.C05F.A00
            X.2Yv r4 = X.AbstractC25230BEn.A0e(r2, r0, r1, r13)
            X.3ds r3 = X.EnumC77683ds.CENTER
            boolean r8 = r7.A0E
            if (r8 != 0) goto L94
            X.2XE r2 = r5.A05
            java.lang.String r1 = r7.A0D
            X.3cd r0 = X.EnumC76913cd.GLOBAL
            X.2Yv r4 = X.AbstractC25231BEo.A0W(r2, r4, r0, r1)
        L94:
            X.2Z0 r10 = X.AbstractC25232BEp.A12(r5)
            X.3ds r0 = X.EnumC77683ds.FLEX_START
            X.3iU r0 = r7.A03(r9, r10, r0)
            r10.A00(r0)
            long r0 = X.AbstractC25230BEn.A0M()
            X.2Z3 r12 = X.AbstractC25225BEi.A0p(r0)
            if (r8 == 0) goto Lec
            X.2XE r2 = r10.A00
            java.lang.String r1 = r7.A0D
            X.3cd r0 = X.EnumC76913cd.GLOBAL
            X.2Yv r11 = X.AbstractC25231BEo.A0W(r2, r13, r0, r1)
        Lb5:
            X.2Z0 r9 = X.AbstractC25232BEp.A13(r10)
            X.2Yq r0 = r7.A04(r9)
            r9.A00(r0)
            com.instagram.common.session.UserSession r8 = r7.A05
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36326996598864115(0x810f36000838f3, double:3.0366771539713996E-306)
            boolean r0 = X.C18U.A06(r2, r8, r0)
            if (r0 == 0) goto Ldd
            r0 = 2131238146(0x7f081d02, float:1.8092562E38)
            android.graphics.drawable.Drawable r0 = X.AbstractC77623dm.A0E(r9, r0)
            X.3iU r0 = r7.A03(r0, r9, r3)
            r9.A00(r0)
        Ldd:
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r6
            X.2WH r0 = X.AbstractC76963ci.A0J(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.2WH r0 = X.AbstractC25226BEj.A0k(r0, r10, r5, r4)
            return r0
        Lec:
            r11 = r13
            goto Lb5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26584Boh.A0Y(X.3bS):X.2Vc");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, X.2Vj] */
    private final C80393iU A03(Drawable drawable, C2Z0 c2z0, EnumC77683ds enumC77683ds) {
        C2XE c2xe = c2z0.A00;
        Context A0E = AbstractC25225BEi.A0E(c2xe);
        A04(c2z0).A0K(c2xe, new Object(), 0, 0, false);
        int min = Math.min((((int) AbstractC13880nE.A01(A0E, r6.A00)) - 12) / 2, 5);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A00 = C9CU.A00(AbstractC25233BEq.A0Q(AbstractC25233BEq.A0e(C05F.A0C, 0.0f, 1), min), C05F.A01, 0, AbstractC25225BEi.A0A(min + 12));
        long A0L = AbstractC25230BEn.A0L();
        Integer num = C05F.A00;
        C51722Yv A15 = AbstractC25232BEp.A15(C9CU.A00(A00, num, 0, A0L), num, enumC77683ds);
        Drawable mutate = drawable.mutate();
        AbstractC25228BEl.A1H(PorterDuff.Mode.SRC_IN, mutate, c2z0.BoZ().A02(R.color.fundraiser_sticker_donate_button_background_color));
        return AbstractC25234BEr.A0O(mutate, c2xe, A15);
    }

    private final C51682Yq A04(C2Z1 c2z1) {
        String str;
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A00 = C9CU.A00(null, C05F.A0u, 0, AbstractC25230BEn.A0K());
        EnumC77683ds enumC77683ds = EnumC77683ds.FLEX_START;
        Integer num = C05F.A00;
        C51722Yv A0d = AbstractC25230BEn.A0d(C9CV.A00(A00, num, enumC77683ds, 3), C05F.A01, 1.0f, 1);
        C2XE ArD = c2z1.ArD();
        Typeface A0Q = AbstractC25226BEj.A0Q(ArD.A0C, num);
        long A09 = AbstractC77623dm.A09(c2z1);
        if (this.A0A) {
            int i = 2131957254;
            if (C18U.A06(C06090Tz.A06, this.A05, 36326996598929652L)) {
                i = 2131957253;
            }
            str = AbstractC77623dm.A0F(c2z1, i);
        } else {
            JLM jlm = this.A00;
            if (jlm == null || (str = jlm.getText()) == null) {
                str = this.A08;
            }
        }
        if (str == null) {
            str = "";
        }
        Spanned fromHtml = Html.fromHtml(str);
        C14360o3.A07(fromHtml);
        int A02 = c2z1.BoZ().A02(R.color.fundraiser_sticker_donate_button_background_color);
        UserSession userSession = this.A05;
        long A04 = AbstractC25449BNo.A04(userSession);
        int A022 = AbstractC25449BNo.A02(c2z1, userSession);
        long A05 = AbstractC25449BNo.A05(userSession);
        Integer A06 = AbstractC25449BNo.A06(c2z1, userSession);
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0g = AbstractC25233BEq.A0g(ArD, fromHtml, A02);
        AbstractC25230BEn.A1K(A0g, c2z1.BoZ(), 0, A09);
        A0g.A0T(A0Q);
        A0g.A0P(A022);
        AbstractC25234BEr.A18(A0g, c2z1, AbstractC25228BEl.A0A(c2z1, A04), A0D);
        AbstractC25234BEr.A1A(A0g, c2z1.BoZ(), A06, A05);
        A0g.A0X(num);
        AbstractC25233BEq.A1E(A0g, num, 1.0f, false);
        A0g.A0M(3);
        AbstractC25234BEr.A17(A0d, A0g, false);
        return A0g.A0A();
    }
}
