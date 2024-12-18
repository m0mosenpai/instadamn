package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.Map;

/* renamed from: X.Idc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41706Idc {
    public static final void A03(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, JH8 jh8, EnumC77173d3 enumC77173d3, C38321qM c38321qM, SearchContext searchContext, Integer num, Integer num2, Integer num3, Integer num4, Long l, String str, String str2, Map map, boolean z, boolean z2) {
        AbstractC167017dG.A1N(context, c38321qM);
        C14360o3.A0B(num, 4);
        C57532kS A00 = C57532kS.A00(userSession);
        boolean A1X = AbstractC167007dF.A1X(num, C05F.A01);
        C14360o3.A0A(interfaceC11380iw);
        FO4 A0M = A00.A0M(interfaceC11380iw, enumC77173d3, c38321qM, AbstractC15820qc.A09(context), map, A1X);
        C1ON A002 = A00(context, userSession, enumC77173d3, c38321qM, searchContext, num, num2, num3, num4, l, str, interfaceC11380iw.getModuleName(), str2, map, z, z2);
        A002.A00 = new HG2(0, jh8, c38321qM, userSession, A0M);
        C1GJ.A03(A002);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x012a, code lost:
    
        if (r17 != null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1ON A00(android.content.Context r7, com.instagram.common.session.UserSession r8, X.EnumC77173d3 r9, X.C38321qM r10, com.instagram.search.common.analytics.SearchContext r11, java.lang.Integer r12, java.lang.Integer r13, java.lang.Integer r14, java.lang.Integer r15, java.lang.Long r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.util.Map r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41706Idc.A00(android.content.Context, com.instagram.common.session.UserSession, X.3d3, X.1qM, com.instagram.search.common.analytics.SearchContext, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean, boolean):X.1ON");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (r10.isSponsoredEligible() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
    
        if (r1 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0020, code lost:
    
        if (r10.isSponsoredEligible() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x002e, code lost:
    
        if (r10.isOrganicEligible() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0033, code lost:
    
        if (r0 != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(android.app.Activity r5, X.C11520jB r6, com.instagram.common.session.UserSession r7, X.EnumC77173d3 r8, X.C38321qM r9, X.InterfaceC60442pS r10, com.instagram.search.common.analytics.SearchContext r11, X.C1M1 r12, java.lang.Integer r13, java.lang.String r14, java.lang.String r15, int r16, int r17, int r18, boolean r19) {
        /*
            java.lang.String r4 = "like"
            java.lang.String r3 = "unlike"
            java.lang.String r1 = "double_tap_on_liked"
            if (r19 == 0) goto Lb3
            r2 = r1
        L9:
            boolean r0 = r2.equals(r4)
            if (r0 != 0) goto L15
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L93
        L15:
            boolean r0 = r9.CdW()
            if (r0 == 0) goto L22
            boolean r0 = r10.isSponsoredEligible()
            r4 = 1
            if (r0 != 0) goto L23
        L22:
            r4 = 0
        L23:
            boolean r0 = r9.CZq()
            if (r0 == 0) goto L30
            boolean r1 = r10.isOrganicEligible()
            r0 = 1
            if (r1 != 0) goto L31
        L30:
            r0 = 0
        L31:
            if (r4 != 0) goto L36
            if (r0 == 0) goto L93
        L35:
            r6 = 0
        L36:
            X.3mZ r1 = X.AbstractC37301Gc2.A0F(r7, r9, r10, r2)
            r0 = r16
            r1.A09(r0)
            java.lang.Long r0 = X.AbstractC31171DnF.A0V(r18)
            r1.A3Z = r0
            int r0 = r13.intValue()
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L90;
                default: goto L4c;
            }
        L4c:
            java.lang.String r0 = "peek_media"
        L4e:
            r1.A75 = r0
            r1.A11 = r11
            r1.A6h = r14
            r1.A4m = r15
            X.1rF r0 = r9.A0C
            java.lang.String r0 = r0.Bk6()
            r1.A6f = r0
            boolean r0 = X.AbstractC75423a9.A02(r9, r10)
            if (r0 != 0) goto L71
            if (r5 == 0) goto L69
            r1.A0C(r5, r7)
        L69:
            if (r12 == 0) goto L71
            java.lang.String r0 = r12.getSessionId()
            r1.A70 = r0
        L71:
            if (r11 == 0) goto L85
            r1.A11 = r11
            java.lang.String r0 = r11.A05
            r1.A6y = r0
            java.lang.String r0 = r11.A06
            r1.A6z = r0
            java.lang.String r0 = r11.A02
            r1.A6d = r0
            java.lang.String r0 = r11.A03
            r1.A6f = r0
        L85:
            r1.A0k = r6
            r0 = r17
            X.C32U.A0E(r7, r1, r9, r10, r0)
            return
        L8d:
            java.lang.String r0 = "button"
            goto L4e
        L90:
            java.lang.String r0 = "double_tap_media"
            goto L4e
        L93:
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L35
            boolean r0 = r9.CdW()
            if (r0 == 0) goto La6
            boolean r0 = r10.isSponsoredEligible()
            r1 = 1
            if (r0 != 0) goto La7
        La6:
            r1 = 0
        La7:
            boolean r0 = r9.CZq()
            if (r0 == 0) goto Lb0
            r10.isOrganicEligible()
        Lb0:
            if (r1 == 0) goto L35
            goto L36
        Lb3:
            X.3d3 r0 = X.EnumC77173d3.A02
            r2 = r3
            if (r8 != r0) goto L9
            r2 = r4
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41706Idc.A02(android.app.Activity, X.0jB, com.instagram.common.session.UserSession, X.3d3, X.1qM, X.2pS, com.instagram.search.common.analytics.SearchContext, X.1M1, java.lang.Integer, java.lang.String, java.lang.String, int, int, int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (X.AbstractC37301Gc2.A1a(r32, r35) == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.app.Activity r29, android.content.Context r30, X.C11520jB r31, com.instagram.common.session.UserSession r32, X.JH8 r33, X.EnumC77173d3 r34, X.C38321qM r35, X.C37905Gm2 r36, X.InterfaceC60442pS r37, com.instagram.search.common.analytics.SearchContext r38, X.C1M1 r39, java.lang.Integer r40, java.lang.Long r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, int r45, int r46, int r47, int r48, boolean r49) {
        /*
            r2 = 0
            r6 = r30
            X.C14360o3.A0B(r6, r2)
            r4 = 1
            r0 = 11
            r8 = r32
            X.C14360o3.A0B(r8, r0)
            java.lang.Integer r0 = X.C05F.A00
            r13 = r40
            r10 = r34
            if (r13 != r0) goto L3e
            X.3d3 r0 = X.EnumC77173d3.A02
            if (r10 != r0) goto L3e
            X.0vz r0 = X.AbstractC12960li.A00
            X.0y2 r0 = X.AbstractC19730y1.A00(r0)
            X.0xq r5 = r0.A00
            java.lang.String r3 = "used_double_tap_hint_impressions"
            int r1 = r5.getInt(r3, r2)
            r0 = 3
            if (r1 >= r0) goto L3e
            java.lang.String r0 = "used_double_tap"
            boolean r0 = r5.getBoolean(r0, r2)
            if (r0 != 0) goto L3e
            r0 = 2131961141(0x7f132535, float:1.955897E38)
            X.C9GR.A06(r6, r0)
            int r0 = r1 + 1
            X.AbstractC167007dF.A18(r5, r3, r0)
        L3e:
            java.lang.Integer r3 = X.C05F.A01
            if (r13 != r3) goto L56
            X.0vz r0 = X.AbstractC12960li.A00
            X.0y2 r0 = X.AbstractC19730y1.A00(r0)
            X.0xq r0 = r0.A00
            X.0xo r1 = r0.ARD()
            java.lang.String r0 = "used_double_tap"
            r1.E77(r0, r4)
            r1.apply()
        L56:
            r1 = 0
            r7 = r37
            boolean r0 = r7 instanceof X.InterfaceC11480j6
            if (r0 == 0) goto L6a
            r0 = r7
            X.0j6 r0 = (X.InterfaceC11480j6) r0
            X.0jB r0 = r0.E6b()
            if (r0 == 0) goto L6a
            java.util.HashMap r1 = r0.A02()
        L6a:
            r4 = r36
            if (r36 == 0) goto L80
            if (r1 != 0) goto L74
            java.util.HashMap r1 = X.AbstractC166987dD.A1G()
        L74:
            int r0 = r13.intValue()
            switch(r0) {
                case 0: goto Le5;
                case 1: goto Le2;
                default: goto L7b;
            }
        L7b:
            java.lang.String r0 = "peek_media"
        L7d:
            X.C37905Gm2.A00(r4, r0, r1)
        L80:
            r11 = r35
            if (r13 != r3) goto L8c
            boolean r0 = X.AbstractC37301Gc2.A1a(r8, r11)
            r28 = 1
            if (r0 != 0) goto L8e
        L8c:
            r28 = 0
        L8e:
            X.2kS r0 = X.C57532kS.A00(r8)
            X.3d3 r0 = r0.A0L(r11)
            r12 = r38
            r26 = r47
            r25 = r45
            if (r0 == r10) goto Lc6
            X.2kS r0 = X.C57532kS.A00(r8)
            X.3d3 r0 = r0.A0L(r11)
            X.I0H.A00(r8, r0, r10, r11)
            r18 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r25)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r46)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r26)
            r17 = r41
            r21 = r49
            r19 = r44
            r9 = r33
            r20 = r1
            r22 = r2
            A03(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        Lc6:
            r21 = r39
            r27 = r48
            r15 = r31
            r24 = r43
            r23 = r42
            r14 = r29
            r16 = r8
            r17 = r10
            r18 = r11
            r19 = r7
            r20 = r12
            r22 = r13
            A02(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        Le2:
            java.lang.String r0 = "double_tap_media"
            goto L7d
        Le5:
            java.lang.String r0 = "button"
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41706Idc.A01(android.app.Activity, android.content.Context, X.0jB, com.instagram.common.session.UserSession, X.JH8, X.3d3, X.1qM, X.Gm2, X.2pS, com.instagram.search.common.analytics.SearchContext, X.1M1, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, boolean):void");
    }
}
