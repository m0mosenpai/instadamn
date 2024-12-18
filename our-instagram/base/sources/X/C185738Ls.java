package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.8Ls, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185738Ls {
    public final Context A00;
    public final C22P A01;
    public final UserSession A02;
    public final AnonymousClass840 A03;
    public final C81J A04;
    public final C185728Lr A05;
    public final C1GL A06;

    public final TransformMatrixConfig A02(TargetViewSizeProvider targetViewSizeProvider, C198998qz c198998qz, C183978Ee c183978Ee) {
        AnonymousClass840 anonymousClass840;
        TransformMatrixConfig transformMatrixConfig;
        C14360o3.A0B(targetViewSizeProvider, 2);
        if (c198998qz == null || (transformMatrixConfig = c198998qz.A03) == null) {
            InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
            int width = interfaceC1812882f.getWidth();
            int height = interfaceC1812882f.getHeight();
            if ((!c183978Ee.A0y || !c183978Ee.A1A) && (anonymousClass840 = this.A03) != null) {
                anonymousClass840.A02.A0G();
            }
            return AbstractC197458oG.A02(c183978Ee, 1.0f, width, height);
        }
        return transformMatrixConfig;
    }

    public final A5X A03(final AbstractC24481Hr abstractC24481Hr, AbstractC24481Hr abstractC24481Hr2, AbstractC24481Hr abstractC24481Hr3, TargetViewSizeProvider targetViewSizeProvider, BBu bBu, C198998qz c198998qz, A8X a8x, C55h c55h, final C183978Ee c183978Ee, LinkedHashMap linkedHashMap, java.util.Set set, boolean z, boolean z2, boolean z3) {
        String str;
        C14360o3.A0B(c183978Ee, 0);
        C14360o3.A0B(targetViewSizeProvider, 5);
        A9Q a9q = new A9Q(targetViewSizeProvider, bBu, c198998qz, this, a8x, c55h, null, c183978Ee, C0HM.A00().toString(), null, "share_sheet", set, z, z3);
        if (abstractC24481Hr2 != null || z2) {
            a9q.A03.A5w = true;
        }
        final Context context = this.A00;
        final UserSession userSession = this.A02;
        final C47Z c47z = a9q.A03;
        final FilterGroupModel filterGroupModel = a9q.A02;
        final C22925A8v c22925A8v = a9q.A01;
        final C1GL c1gl = this.A06;
        C81J c81j = this.A04;
        if (c81j != null) {
            str = c81j.A2i;
        } else {
            str = null;
        }
        if (c47z.A5w) {
            final String str2 = str;
            Runnable runnable = new Runnable() { // from class: X.B02
                @Override // java.lang.Runnable
                public final void run() {
                    C47Z c47z2 = c47z;
                    Context context2 = context;
                    UserSession userSession2 = userSession;
                    C183978Ee c183978Ee2 = c183978Ee;
                    FilterGroupModel filterGroupModel2 = filterGroupModel;
                    C22925A8v c22925A8v2 = c22925A8v;
                    AbstractC24481Hr abstractC24481Hr4 = abstractC24481Hr;
                    C1GL c1gl2 = c1gl;
                    String str3 = str2;
                    c47z2.A5l = true;
                    C9O1.A06(context2, userSession2, c1gl2, abstractC24481Hr4, c22925A8v2, filterGroupModel2, c47z2, c183978Ee2, str3, null);
                }
            };
            if (abstractC24481Hr2 != null) {
                C9O1.A0B(userSession, c1gl, abstractC24481Hr2, new C23856Ah8(context, userSession, c1gl, abstractC24481Hr3, c22925A8v, filterGroupModel, c47z, c183978Ee, runnable, z2));
            } else if (z2) {
                C9O1.A05(context, userSession, c1gl, abstractC24481Hr3, c22925A8v, filterGroupModel, c47z, c183978Ee, runnable, false);
            } else {
                throw new IllegalStateException("Cannot prepare Story Template PendingMedia if neither overlay nor background are part of the template");
            }
        } else {
            C9O1.A06(context, userSession, c1gl, abstractC24481Hr, c22925A8v, filterGroupModel, c47z, c183978Ee, str, linkedHashMap);
        }
        String str3 = c47z.A35;
        C14360o3.A0B(str3, 0);
        return new A5X(str3);
    }

    private final boolean A01(ACA aca) {
        ShareType shareType = aca.A02;
        if (shareType != ShareType.A0T && !aca.A00() && !aca.A01()) {
            if (shareType == ShareType.A0P) {
                if (C18U.A06(C06090Tz.A05, this.A02, 36320704471638847L)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r10.A1A == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel A05(com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r8, X.C198998qz r9, X.C183978Ee r10) {
        /*
            r7 = this;
            if (r9 == 0) goto L7
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r3 = r9.A06
            if (r3 == 0) goto L7
            return r3
        L7:
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r3 = X.AbstractC197358o6.A00()
            X.0v1 r1 = r10.A0I
            boolean r0 = r10.A0y
            if (r0 == 0) goto L16
            boolean r0 = r10.A1A
            r4 = 1
            if (r0 != 0) goto L17
        L16:
            r4 = 0
        L17:
            X.840 r2 = r7.A03
            com.instagram.common.session.UserSession r0 = r7.A02
            r5 = 0
            r6 = r5
            X.AbstractC197438oE.A00(r0, r1, r2, r3, r4, r5, r6)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r1 = r3.A02
            float[] r0 = r8.C6v()
            X.AbstractC199768sS.A02(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C185738Ls.A05(com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig, X.8qz, X.8Ee):com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel");
    }

    public C185738Ls(Context context, C22P c22p, UserSession userSession, C1GL c1gl, AnonymousClass840 anonymousClass840, C81J c81j, C185728Lr c185728Lr) {
        this.A00 = context;
        this.A02 = userSession;
        this.A05 = c185728Lr;
        this.A03 = anonymousClass840;
        this.A04 = c81j;
        this.A06 = c1gl;
        this.A01 = c22p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r24 != null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.A9Q A00(com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r20, X.BBu r21, X.C198998qz r22, X.ACA r23, X.C9ZH r24, X.C211689Zc r25, X.A8X r26, X.C188538Ws r27, X.C9ZL r28, X.C183978Ee r29, java.lang.Boolean r30, java.lang.Boolean r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.util.List r37, java.util.List r38, java.util.Set r39, boolean r40) {
        /*
            r19 = this;
            r0 = r23
            com.instagram.pendingmedia.model.constants.ShareType r2 = r0.A02
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.A0T
            r0 = 0
            if (r2 != r1) goto La
            r0 = 1
        La:
            r1 = r25
            r3 = r24
            if (r25 != 0) goto L16
            if (r0 != 0) goto L16
            r17 = 0
            if (r24 == 0) goto Lb3
        L16:
            r17 = 1
            if (r25 == 0) goto Lb3
            java.lang.String r2 = r1.A06
            java.lang.String r1 = r1.A03
            r0 = 0
            X.55h r10 = new X.55h
            r10.<init>(r2, r1, r0)
        L24:
            r6 = 0
            r2 = 1
            X.A9Q r4 = new X.A9Q
            r12 = r29
            r11 = r27
            r9 = r26
            r18 = r40
            r16 = r39
            r7 = r22
            r14 = r34
            r13 = r33
            r5 = r20
            r8 = r19
            r15 = r32
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r21
            if (r21 == 0) goto L4a
            X.47Z r0 = r4.A03
            r1.F8R(r0)
        L4a:
            r0 = r28
            if (r28 == 0) goto La6
            X.47Z r1 = r4.A03
            r1.A1l = r0
            X.AkS r0 = new X.AkS
            r0.<init>(r8)
            r1.A0W(r0)
        L5a:
            if (r37 == 0) goto L64
            X.47Z r1 = r4.A03
            java.util.List r0 = X.AbstractC001800i.A0X(r37)
            r1.A49 = r0
        L64:
            r1 = r38
            if (r38 == 0) goto L6c
            X.47Z r0 = r4.A03
            r0.A4e = r1
        L6c:
            r0 = r35
            if (r35 == 0) goto L82
            X.47Z r1 = r4.A03
            r1.A31 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3 = r30
            boolean r0 = X.C14360o3.A0K(r3, r0)
            if (r0 == 0) goto L82
            r1.A56 = r2
        L82:
            r0 = r36
            if (r36 == 0) goto L99
            X.47Z r1 = r4.A03
            r1.A3D = r0
            r0 = 8
            r1.A0N = r0
            r0 = 0
            r1.A5e = r0
            X.HY2 r0 = new X.HY2
            r0.<init>()
            r1.A0Y(r0)
        L99:
            X.47Z r1 = r4.A03
            if (r31 == 0) goto La4
            boolean r0 = r31.booleanValue()
        La1:
            r1.A5B = r0
            return r4
        La4:
            r0 = 0
            goto La1
        La6:
            if (r24 == 0) goto L5a
            X.AkU r1 = new X.AkU
            r1.<init>(r8, r3)
            X.47Z r0 = r4.A03
            r0.A0W(r1)
            goto L5a
        Lb3:
            r10 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C185738Ls.A00(com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.BBu, X.8qz, X.ACA, X.9ZH, X.9Zc, X.A8X, X.8Ws, X.9ZL, X.8Ee, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.Set, boolean):X.A9Q");
    }

    public final A5Y A04(C26086BgF c26086BgF, final AbstractC24481Hr abstractC24481Hr, AbstractC24481Hr abstractC24481Hr2, AbstractC24481Hr abstractC24481Hr3, TargetViewSizeProvider targetViewSizeProvider, BBu bBu, C198998qz c198998qz, final ACA aca, C9ZH c9zh, final C211689Zc c211689Zc, A8X a8x, A96 a96, C188538Ws c188538Ws, C9ZL c9zl, final C183978Ee c183978Ee, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, final String str5, String str6, final String str7, List list, List list2, java.util.Set set, final boolean z, boolean z2, boolean z3) {
        C81663kb B3U;
        Integer num;
        boolean z4;
        C14360o3.A0B(aca, 5);
        C14360o3.A0B(targetViewSizeProvider, 12);
        C14360o3.A0B(str5, 19);
        A9Q A00 = A00(targetViewSizeProvider, bBu, c198998qz, aca, c9zh, c211689Zc, a8x, c188538Ws, c9zl, c183978Ee, bool, bool2, str, str2, str3, str4, str6, list, list2, set, z3);
        final Context context = this.A00;
        final UserSession userSession = this.A02;
        final C47Z c47z = A00.A03;
        final FilterGroupModel filterGroupModel = A00.A02;
        final C22925A8v c22925A8v = A00.A01;
        final C1GL c1gl = this.A06;
        final boolean A01 = A01(aca);
        final C40121td A002 = C40121td.A00(context, userSession);
        C9O1.A0C(userSession, aca, a96, c47z);
        final DirectShareTarget directShareTarget = aca.A00;
        if (directShareTarget != null && (B3U = AbstractC28761aE.A00(userSession).B3U(directShareTarget.A00())) != null) {
            if (z) {
                num = C05F.A0N;
            } else {
                num = C05F.A04;
            }
            L1W B2W = B3U.B2W();
            if (B2W != null) {
                z4 = AbstractC46831KnQ.A00(B2W);
            } else {
                z4 = false;
            }
            if (AbstractC159387Cy.A03(userSession, directShareTarget.A00(), Boolean.valueOf(z4), num, B3U.CWO(), false, false) != EnumC159397Cz.A06) {
                c47z.A5D = true;
                c47z.A53 = true;
            }
        }
        if (!z && !C9O1.A0G(userSession, directShareTarget)) {
            A002.A0C(c47z);
            C9O1.A0A(c26086BgF, userSession, aca, c211689Zc, c47z, str7, null);
        }
        C9O1.A0E(userSession, c47z);
        if (!z2 && abstractC24481Hr2 == null) {
            C9O1.A04(context, c26086BgF, userSession, c1gl, abstractC24481Hr, aca, c22925A8v, filterGroupModel, directShareTarget, c211689Zc, a8x, c47z, A002, c183978Ee, str5, str7, A01, z);
        } else {
            c47z.A5w = true;
            Runnable runnable = new Runnable() { // from class: X.B06
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    UserSession userSession2 = userSession;
                    C47Z c47z2 = c47z;
                    C183978Ee c183978Ee2 = c183978Ee;
                    FilterGroupModel filterGroupModel2 = filterGroupModel;
                    C22925A8v c22925A8v2 = c22925A8v;
                    ACA aca2 = aca;
                    C211689Zc c211689Zc2 = c211689Zc;
                    AbstractC24481Hr abstractC24481Hr4 = abstractC24481Hr;
                    C1GL c1gl2 = c1gl;
                    boolean z5 = A01;
                    String str8 = str5;
                    C40121td c40121td = A002;
                    C9O1.A04(context2, null, userSession2, c1gl2, abstractC24481Hr4, aca2, c22925A8v2, filterGroupModel2, directShareTarget, c211689Zc2, null, c47z2, c40121td, c183978Ee2, str8, str7, z5, z);
                }
            };
            if (abstractC24481Hr2 != null) {
                C9O1.A0B(userSession, c1gl, abstractC24481Hr2, new C23858AhA(context, userSession, c1gl, abstractC24481Hr3, c22925A8v, filterGroupModel, c47z, c183978Ee, runnable, z2, A01));
            } else if (z2) {
                C9O1.A05(context, userSession, c1gl, abstractC24481Hr3, c22925A8v, filterGroupModel, c47z, c183978Ee, runnable, A01);
            } else {
                throw new IllegalStateException("Cannot prepare Story Template PendingMedia if neither overlay nor background are part of the template");
            }
        }
        return new A5Y(c47z.A35);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007c, code lost:
    
        if (r1 != true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.AbstractC24481Hr r34, X.AbstractC24481Hr r35, X.AbstractC24481Hr r36, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r37, X.BBu r38, X.C198998qz r39, X.ACA r40, X.C9ZH r41, X.C211689Zc r42, X.A8X r43, X.A96 r44, X.C188538Ws r45, X.C9ZL r46, X.C183978Ee r47, java.lang.Boolean r48, java.lang.Boolean r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.util.List r55, java.util.List r56, java.util.Set r57, X.InterfaceC16660sJ r58, X.InterfaceC16660sJ r59, boolean r60, boolean r61, boolean r62) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C185738Ls.A06(X.1Hr, X.1Hr, X.1Hr, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.BBu, X.8qz, X.ACA, X.9ZH, X.9Zc, X.A8X, X.A96, X.8Ws, X.9ZL, X.8Ee, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.Set, X.0sJ, X.0sJ, boolean, boolean, boolean):void");
    }
}
