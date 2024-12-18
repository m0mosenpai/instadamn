package X;

import android.content.Context;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.MVf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50594MVf {
    public static final C50594MVf A00 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(android.content.Context r14, X.C26136BhN r15, com.instagram.common.session.UserSession r16, X.C62832tM r17, X.C50594MVf r18, X.C37546Gg2 r19, X.AbstractC39459Hbl r20, X.C37556GgC r21, java.lang.String r22, X.InterfaceC23621Ds r23) {
        /*
            r7 = r14
            r11 = r19
            r12 = r20
            r13 = r21
            r9 = r16
            r10 = r17
            r14 = r22
            r5 = 9
            r6 = r23
            boolean r0 = X.C50593MVe.A02(r6, r5)
            r4 = r18
            if (r0 == 0) goto L8f
            r3 = r6
            X.MVe r3 = (X.C50593MVe) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r3.A00 = r2
        L27:
            java.lang.Object r8 = r3.A09
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L71
            if (r0 != r1) goto L95
            java.lang.Object r14 = r3.A08
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r10 = r3.A07
            X.2tM r10 = (X.C62832tM) r10
            java.lang.Object r9 = r3.A06
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            java.lang.Object r13 = r3.A05
            X.GgC r13 = (X.C37556GgC) r13
            java.lang.Object r12 = r3.A04
            X.Hbl r12 = (X.AbstractC39459Hbl) r12
            java.lang.Object r11 = r3.A03
            X.Gg2 r11 = (X.C37546Gg2) r11
            java.lang.Object r7 = r3.A02
            android.content.Context r7 = (android.content.Context) r7
            X.AbstractC09560e7.A00(r8)
        L51:
            X.Gz4 r8 = (X.C38663Gz4) r8
            if (r8 == 0) goto L6e
            com.instagram.api.schemas.InstagramMidcardType r1 = r8.A05
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A05
            if (r1 == r0) goto L6e
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A0a
            if (r1 == r0) goto L6e
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A0b
            if (r1 == r0) goto L6e
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A0F
            if (r1 == r0) goto L6e
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A0E
            if (r1 == r0) goto L6e
            A02(r7, r8, r9, r10, r11, r12, r13, r14)
        L6e:
            X.0eB r2 = X.C0eB.A00
            return r2
        L71:
            X.AbstractC09560e7.A00(r8)
            X.Oeb r0 = X.C55214Oeb.A00
            r3.A01 = r4
            r3.A02 = r7
            r3.A03 = r11
            r3.A04 = r12
            r3.A05 = r13
            r3.A06 = r9
            r3.A07 = r10
            r3.A08 = r14
            r3.A00 = r1
            java.lang.Object r8 = r0.A08(r7, r15, r9, r3)
            if (r8 != r2) goto L51
            return r2
        L8f:
            X.MVe r3 = new X.MVe
            r3.<init>(r4, r6, r5)
            goto L27
        L95:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50594MVf.A01(android.content.Context, X.BhN, com.instagram.common.session.UserSession, X.2tM, X.MVf, X.Gg2, X.Hbl, X.GgC, java.lang.String, X.1Ds):java.lang.Object");
    }

    public static final void A03(C38663Gz4 c38663Gz4, C62832tM c62832tM, C37546Gg2 c37546Gg2, AbstractC39459Hbl abstractC39459Hbl, String str, int i) {
        C14360o3.A0B(c38663Gz4, 0);
        C120985dq c120985dq = new C120985dq(new C38226GrV(c38663Gz4));
        EnumC129395t1 enumC129395t1 = c120985dq.A01;
        EnumC129395t1 enumC129395t12 = EnumC129395t1.A09;
        if (enumC129395t1 == enumC129395t12) {
            c37546Gg2.A0A.A0c(c120985dq, i);
        }
        if (str != null && c62832tM != null) {
            List A0J = abstractC39459Hbl.A0J();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : A0J) {
                EnumC129395t1 enumC129395t13 = ((C120985dq) obj).A01;
                if (enumC129395t13 == EnumC129395t1.A0G || enumC129395t13 == EnumC129395t1.A02 || enumC129395t13 == EnumC129395t1.A03 || enumC129395t13 == EnumC129395t1.A0A || enumC129395t13 == enumC129395t12) {
                    A1E.add(obj);
                }
            }
            c62832tM.A08(str, A1E, false, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
    
        if (r1 != X.EnumC129395t1.A0A) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer A00(X.C38663Gz4 r9, com.instagram.common.session.UserSession r10, X.AbstractC39459Hbl r11, X.C37556GgC r12) {
        /*
            int r5 = r9.A01
            X.5t1 r0 = X.EnumC129395t1.A09
            java.util.List r1 = r11.A0L(r0)
            boolean r0 = r1.isEmpty()
            r9 = 0
            if (r0 == 0) goto L23
            r0 = 8
            int r5 = java.lang.Math.min(r0, r5)
        L15:
            r8 = r9
        L16:
            java.util.List r0 = r11.A0J()
            int r0 = r0.size()
            int r4 = r0 + (-2)
            if (r5 <= r4) goto L34
            return r9
        L23:
            java.lang.Object r0 = X.AbstractC001800i.A0L(r1)
            X.5dq r0 = (X.C120985dq) r0
            if (r0 == 0) goto L15
            int r0 = r11.A0C(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            goto L16
        L34:
            int r0 = r12.A03()
            int r0 = r0 + 2
            if (r5 >= r0) goto L3d
            r5 = r0
        L3d:
            if (r5 > r4) goto Lb9
            int r6 = r12.A03()
            X.5dq r0 = r11.A0F(r5)
            X.5t1 r1 = r0.A01
            X.5t1 r3 = X.EnumC129395t1.A02
            if (r1 == r3) goto L59
            X.5t1 r0 = X.EnumC129395t1.A03
            if (r1 == r0) goto L59
            X.5t1 r0 = X.EnumC129395t1.A0A
            if (r1 == r0) goto L59
            X.5t1 r0 = X.EnumC129395t1.A0G
            if (r1 != r0) goto L95
        L59:
            int r2 = r5 + (-1)
            X.5dq r0 = r11.A0F(r2)
            X.5t1 r1 = r0.A01
            if (r1 == r3) goto L6f
            X.5t1 r0 = X.EnumC129395t1.A03
            if (r1 == r0) goto L6f
            X.5t1 r0 = X.EnumC129395t1.A0A
            if (r1 == r0) goto L6f
            X.5t1 r0 = X.EnumC129395t1.A0G
            if (r1 != r0) goto L95
        L6f:
            int r0 = r6 + 1
            if (r0 >= r5) goto L95
            if (r5 <= 0) goto L98
            X.5dq r0 = r11.A0F(r2)
            X.5dq r2 = r11.A0F(r5)
            X.5t1 r1 = r0.A01
            if (r1 == r3) goto L89
            X.5t1 r0 = X.EnumC129395t1.A03
            if (r1 == r0) goto L89
            X.5t1 r0 = X.EnumC129395t1.A0A
            if (r1 != r0) goto L98
        L89:
            X.5t1 r1 = r2.A01
            if (r1 == r3) goto L95
            X.5t1 r0 = X.EnumC129395t1.A03
            if (r1 == r0) goto L95
            X.5t1 r0 = X.EnumC129395t1.A0A
            if (r1 != r0) goto L98
        L95:
            int r5 = r5 + 1
            goto L3d
        L98:
            if (r8 == 0) goto Lb4
            int r0 = r8.intValue()
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            long r2 = (long) r0
            X.0Tz r6 = X.C06090Tz.A05
            r0 = 36602591765205707(0x8209dd000612cb, double:3.2109646468984836E-306)
            long r6 = X.C18U.A01(r6, r10, r0)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L95
        Lb4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            return r0
        Lb9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50594MVf.A00(X.Gz4, com.instagram.common.session.UserSession, X.Hbl, X.GgC):java.lang.Integer");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(android.content.Context r23, com.instagram.common.session.UserSession r24, X.C62832tM r25, X.C37845Gkz r26, X.C37546Gg2 r27, X.AbstractC39459Hbl r28, X.C37556GgC r29, java.lang.String r30, X.InterfaceC23621Ds r31) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50594MVf.A04(android.content.Context, com.instagram.common.session.UserSession, X.2tM, X.Gkz, X.Gg2, X.Hbl, X.GgC, java.lang.String, X.1Ds):java.lang.Object");
    }

    public static final void A02(Context context, C38663Gz4 c38663Gz4, UserSession userSession, C62832tM c62832tM, C37546Gg2 c37546Gg2, AbstractC39459Hbl abstractC39459Hbl, C37556GgC c37556GgC, String str) {
        String str2;
        List list;
        MVa.A00(userSession).A01(c38663Gz4);
        C50590MVb A002 = MVa.A00(userSession);
        C120985dq c120985dq = new C120985dq(new C38226GrV(c38663Gz4));
        AbstractC167017dG.A1N(userSession, context);
        if (c120985dq.A01 == EnumC129395t1.A09) {
            InstagramMidcardType instagramMidcardType = c120985dq.A01().A05;
            if (instagramMidcardType != InstagramMidcardType.A0a && instagramMidcardType != InstagramMidcardType.A0F) {
                str2 = null;
                list = null;
            } else {
                str2 = c120985dq.A01().A0C;
                list = c120985dq.A01().A0I;
            }
            C55209OeS c55209OeS = new C55209OeS(context, userSession, AbstractC23021Ah.A00(userSession));
            A002.A00 = c55209OeS;
            if (str2 != null && list != null) {
                if (C55209OeS.A06(c55209OeS, str2)) {
                    C55209OeS.A02(c55209OeS, str2);
                } else {
                    c55209OeS.A01.put(str2, list);
                    LinkedHashMap A1I = AbstractC166987dD.A1I();
                    ArrayList A1E = AbstractC166987dD.A1E();
                    C55209OeS.A04(c55209OeS, list, A1E, A1I);
                    C75H c75h = c55209OeS.A00;
                    ArrayList A0q = AbstractC167017dG.A0q(A1E);
                    Iterator it = A1E.iterator();
                    while (it.hasNext()) {
                        A0q.add(c75h.A00(AbstractC31172DnG.A0i(it)));
                    }
                    C121275eQ A01 = c75h.A01(A0q, null);
                    A01.A00 = new C215959hB(A1I, c55209OeS, str2, 2);
                    C1GJ.A04(A01, 1394228119);
                }
            }
        }
        Integer A003 = A00(c38663Gz4, userSession, abstractC39459Hbl, c37556GgC);
        if (A003 != null) {
            A03(c38663Gz4, c62832tM, c37546Gg2, abstractC39459Hbl, str, A003.intValue());
        }
    }
}
