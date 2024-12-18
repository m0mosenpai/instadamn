package X;

import android.content.Context;
import android.graphics.Point;
import android.location.Location;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.user.model.User;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9O1, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9O1 {
    public static AnonymousClass442 A00(UserSession userSession, C211689Zc c211689Zc) {
        String str;
        AnonymousClass442 anonymousClass442 = null;
        if (c211689Zc != null && (str = c211689Zc.A02) != null) {
            try {
                anonymousClass442 = AnonymousClass442.A00(C07950bF.A04.A01(userSession, str));
                return anonymousClass442;
            } catch (IOException e) {
                AbstractC12120kG.A07("StoryPendingMediaUtil", AbstractC111324zv.A00(3615), e);
            }
        }
        return anonymousClass442;
    }

    public static void A05(final Context context, final UserSession userSession, C1GL c1gl, AbstractC24481Hr abstractC24481Hr, final C22925A8v c22925A8v, FilterGroupModel filterGroupModel, C47Z c47z, final C183978Ee c183978Ee, Runnable runnable, final boolean z) {
        C23836Agl c23836Agl = new C23836Agl(1, context, userSession, c47z, runnable);
        final EnumC53116NeT[] enumC53116NeTArr = {EnumC53116NeT.A03};
        C216039hJ c216039hJ = new C216039hJ(context, userSession, abstractC24481Hr, new BC0() { // from class: X.Agg
            @Override // X.BC0
            public final AAZ AMw(A5Z a5z, FilterGroupModel filterGroupModel2) {
                return new AAZ(context, userSession, a5z, c22925A8v, filterGroupModel2, c183978Ee, null, enumC53116NeTArr, z, false);
            }
        }, c23836Agl, c22925A8v, filterGroupModel, c183978Ee, enumC53116NeTArr, false, false, false);
        if (c1gl == null) {
            C1GJ.A03(c216039hJ);
        } else {
            c1gl.schedule(c216039hJ);
        }
    }

    public static void A07(final Context context, UserSession userSession, C47Z c47z, final String str) {
        c47z.A5g = false;
        C25A.A00(userSession).A04(c47z.A35, str);
        AnonymousClass257.A00(userSession).A04();
        C11T.A02(new Runnable() { // from class: X.AwC
            @Override // java.lang.Runnable
            public final void run() {
                C9GR.A0A(context, str);
            }
        });
    }

    public static void A08(Location location, CameraAREffect cameraAREffect, UserSession userSession, TransformMatrixConfig transformMatrixConfig, C81M c81m, C187028Qv c187028Qv, FilterGroupModel filterGroupModel, C47v c47v, C188538Ws c188538Ws, C47Z c47z, C915647m c915647m, Integer num, Integer num2, boolean z, boolean z2, boolean z3, boolean z4) {
        List list;
        List list2;
        List list3;
        List list4;
        MYQ myq = new MYQ(c47z);
        C915647m c915647m2 = c915647m;
        if (c915647m == null) {
            c915647m2 = new C915647m();
        }
        C47Z c47z2 = myq.A01;
        c47z2.A1i = c915647m2;
        c47z2.A5F = z2;
        c47z.A69 = z;
        c47z.A16 = transformMatrixConfig;
        C14360o3.A0B(c47v, 0);
        c47z.A1V = c47v;
        if (c915647m != null && (list = c915647m.A03) != null && Collections.unmodifiableList(list) != null && (list2 = c915647m.A02) != null && Collections.unmodifiableList(list2) != null) {
            List list5 = c915647m.A03;
            if (list5 != null) {
                list3 = Collections.unmodifiableList(list5);
            } else {
                list3 = null;
            }
            List list6 = c915647m.A02;
            if (list6 != null) {
                list4 = Collections.unmodifiableList(list6);
            } else {
                list4 = null;
            }
            C915647m c915647m3 = c47z.A1i;
            c915647m3.A03 = list3;
            c915647m3.A02 = list4;
        }
        c47z.A60 = z3;
        c47z.A61 = z4;
        if (filterGroupModel != null) {
            AbstractC23131AMn.A03(((FilterGroupModelImpl) filterGroupModel).A02, c47z, z3);
        } else if (!z4) {
            AbstractC12120kG.A01("StoryPendingMediaUtil", MSV.A00(314));
        }
        A09(location, cameraAREffect, userSession, c81m, c187028Qv, c188538Ws, c47z, num, num2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0228, code lost:
    
        if (X.AbstractC23021Ah.A00(r23).A1i() == false) goto L138;
     */
    /* JADX WARN: Type inference failed for: r0v105, types: [X.A64, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [X.A7Y, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A09(android.location.Location r21, com.instagram.camera.effect.models.CameraAREffect r22, com.instagram.common.session.UserSession r23, X.C81M r24, X.C187028Qv r25, X.C188538Ws r26, X.C47Z r27, java.lang.Integer r28, java.lang.Integer r29) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9O1.A09(android.location.Location, com.instagram.camera.effect.models.CameraAREffect, com.instagram.common.session.UserSession, X.81M, X.8Qv, X.8Ws, X.47Z, java.lang.Integer, java.lang.Integer):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0276, code lost:
    
        if (r5 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0180, code lost:
    
        if (r13.A1D != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r1.equals("boomerang") == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ea  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, X.56Y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C47Z A01(X.C22P r8, com.instagram.camera.effect.models.CameraAREffect r9, com.instagram.common.session.UserSession r10, com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r11, com.instagram.pendingmedia.model.ClipInfo r12, X.C195868lW r13, java.lang.String r14, java.lang.String r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9O1.A01(X.22P, com.instagram.camera.effect.models.CameraAREffect, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig, com.instagram.pendingmedia.model.ClipInfo, X.8lW, java.lang.String, java.lang.String, boolean):X.47Z");
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0262, code lost:
    
        if (X.C18U.A06(r8, r22, 36327172693768569L) == false) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C47Z A02(X.C22P r21, com.instagram.common.session.UserSession r22, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r23, X.BBu r24, com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r25, X.C183978Ee r26, java.lang.String r27, java.util.Set r28) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9O1.A02(X.22P, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.BBu, com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig, X.8Ee, java.lang.String, java.util.Set):X.47Z");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (r36.A57 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(android.content.Context r25, X.C26086BgF r26, com.instagram.common.session.UserSession r27, X.C1GL r28, X.AbstractC24481Hr r29, X.ACA r30, X.C22925A8v r31, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r32, com.instagram.model.direct.DirectShareTarget r33, X.C211689Zc r34, X.A8X r35, X.C47Z r36, X.C40121td r37, X.C183978Ee r38, java.lang.String r39, java.lang.String r40, boolean r41, boolean r42) {
        /*
            r3 = r29
            X.Agm r4 = new X.Agm
            r13 = r37
            r12 = r36
            r11 = r35
            r10 = r34
            r9 = r33
            r17 = r42
            r16 = r40
            r7 = r27
            r15 = r39
            r6 = r26
            r14 = r38
            r5 = r25
            r8 = r30
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r29 == 0) goto L2d
            r1 = 2
            X.Adt r0 = new X.Adt
            r0.<init>(r12, r1)
            X.1Hr r3 = r3.A03(r0)
        L2d:
            java.util.EnumSet r0 = com.instagram.pendingmedia.model.constants.ShareType.A02
            boolean r1 = r12.A14(r0)
            boolean r0 = X.AbstractC50707Ma2.A00(r12)
            boolean r0 = X.AbstractC54247NyS.A00(r7, r1, r0)
            if (r0 == 0) goto L42
            boolean r0 = r12.A57
            r1 = 1
            if (r0 == 0) goto L43
        L42:
            r1 = 0
        L43:
            boolean r2 = r12.A57
            com.instagram.camera.effect.models.CameraAREffect r0 = r12.A10
            boolean r25 = X.AbstractC167007dF.A1W(r0)
            boolean r27 = X.AbstractC23131AMn.A07(r7, r12)
            boolean r18 = A0H(r7, r12)
            r17 = r41
            r21 = r31
            if (r1 == 0) goto L8d
            X.NeT r1 = X.EnumC53116NeT.A02
            X.NeT r0 = X.EnumC53116NeT.A03
            X.NeT[] r24 = new X.EnumC53116NeT[]{r1, r0}
            X.Agh r19 = new X.Agh
            r10 = r19
            r11 = r5
            r12 = r7
            r13 = r21
            r15 = r24
            r16 = r17
            r17 = r18
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
        L72:
            X.9hJ r15 = new X.9hJ
            r22 = r32
            r16 = r5
            r17 = r7
            r18 = r3
            r20 = r4
            r23 = r14
            r26 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0 = r28
            if (r28 != 0) goto La2
            X.C1GJ.A03(r15)
            return
        L8d:
            r15 = 0
            X.NeT r0 = X.EnumC53116NeT.A03
            X.NeT[] r24 = new X.EnumC53116NeT[]{r0}
            X.Agi r19 = new X.Agi
            r10 = r19
            r11 = r5
            r12 = r7
            r13 = r21
            r16 = r24
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L72
        La2:
            r0.schedule(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9O1.A04(android.content.Context, X.BgF, com.instagram.common.session.UserSession, X.1GL, X.1Hr, X.ACA, X.A8v, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel, com.instagram.model.direct.DirectShareTarget, X.9Zc, X.A8X, X.47Z, X.1td, X.8Ee, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public static void A06(Context context, UserSession userSession, C1GL c1gl, AbstractC24481Hr abstractC24481Hr, C22925A8v c22925A8v, FilterGroupModel filterGroupModel, C47Z c47z, C183978Ee c183978Ee, String str, LinkedHashMap linkedHashMap) {
        AbstractC24481Hr abstractC24481Hr2 = abstractC24481Hr;
        c47z.A0c(ShareType.A0W);
        c47z.A4w = true;
        if (str != null) {
            c47z.A3e = str;
        }
        C23835Agk c23835Agk = new C23835Agk(context, userSession, c47z);
        if (abstractC24481Hr != null) {
            abstractC24481Hr2 = abstractC24481Hr2.A03(new C23658Adt(c47z, 1));
        }
        boolean A1W = AbstractC167007dF.A1W(c47z.A10);
        boolean z = c47z.A57;
        boolean A07 = AbstractC23131AMn.A07(userSession, c47z);
        boolean A0H = A0H(userSession, c47z);
        EnumC53116NeT[] enumC53116NeTArr = {EnumC53116NeT.A03};
        C216039hJ c216039hJ = new C216039hJ(context, userSession, abstractC24481Hr2, new C23833Agi(context, userSession, c22925A8v, c183978Ee, linkedHashMap, enumC53116NeTArr, false, A0H), c23835Agk, c22925A8v, filterGroupModel, c183978Ee, enumC53116NeTArr, A1W, z, A07);
        if (c1gl == null) {
            C1GJ.A03(c216039hJ);
        } else {
            c1gl.schedule(c216039hJ);
        }
        C40121td.A00(context, userSession).A0C(c47z);
        PendingMediaStore A00 = C25A.A00(userSession);
        A00.A07.add(c47z.A35);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if ("story_remix_reply".equals(r1) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0A(X.C26086BgF r19, com.instagram.common.session.UserSession r20, X.ACA r21, X.C211689Zc r22, X.C47Z r23, java.lang.String r24, java.lang.String r25) {
        /*
            r5 = r21
            boolean r0 = r5.A01()
            r4 = r20
            r3 = r23
            if (r0 == 0) goto L9c
            r2 = r22
            r2.getClass()
            java.lang.String r1 = r2.A03
            java.lang.String r0 = "story_camera_reply"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L24
            java.lang.String r0 = "story_remix_reply"
            boolean r1 = r0.equals(r1)
            r0 = 1
            if (r1 == 0) goto L25
        L24:
            r0 = 0
        L25:
            r3.A4w = r0
            com.instagram.model.direct.DirectShareTarget r1 = r5.A00
            r1.getClass()
            r0 = 2276(0x8e4, float:3.19E-42)
            java.lang.String r10 = X.AbstractC111324zv.A00(r0)
            X.7TG r7 = X.AbstractC165967bO.A00(r4)
            com.instagram.common.session.UserSession r0 = r7.A03
            X.2DS r0 = X.AbstractC28761aE.A00(r0)
            X.3kb r0 = r0.BZQ(r1)
            com.instagram.model.direct.DirectThreadKey r9 = X.C4GQ.A03(r0)
            boolean r14 = r2.A07
            java.lang.String r11 = r2.A00
            r23 = 0
            X.BWq r13 = new X.BWq
            r5 = r19
            r22 = r24
            r12 = r25
            r15 = r13
            r18 = r5
            r19 = r9
            r20 = r7
            r21 = r12
            r17 = r3
            r16 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r6 = 0
            r8 = r6
            java.lang.Object r0 = X.C7TG.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r6 = r0.first
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r0.second
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r0 = 1
            r3.A5Q = r0
            X.3oG r0 = r1.A09
            r0.getClass()
            X.3oF r1 = X.AbstractC140946Yw.A01(r0)
            boolean r5 = r2.booleanValue()
            r0 = 3
            X.C14360o3.A0B(r6, r0)
            X.3oF r0 = X.AbstractC140946Yw.A01(r1)
            com.instagram.model.direct.DirectThreadKey r2 = X.AbstractC140956Yx.A01(r0)
            com.instagram.pendingmedia.model.constants.ShareType r1 = r3.A0D()
            X.1tc r0 = r3.A1G
            java.lang.String r0 = X.AbstractC46704KlN.A00(r0, r1)
            X.C162337Ov.A0i(r4, r2, r0, r6, r5)
        L9b:
            return
        L9c:
            com.instagram.pendingmedia.model.constants.ShareType r1 = r5.A02
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0T
            if (r1 != r0) goto L9b
            com.instagram.model.direct.DirectShareTarget r2 = r5.A00
            r2.getClass()
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            X.7TG r1 = X.AbstractC165967bO.A00(r4)
            r0 = 0
            r1.A0H(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9O1.A0A(X.BgF, com.instagram.common.session.UserSession, X.ACA, X.9Zc, X.47Z, java.lang.String, java.lang.String):void");
    }

    public static void A0B(final UserSession userSession, C1GL c1gl, final AbstractC24481Hr abstractC24481Hr, final InterfaceC25185BCi interfaceC25185BCi) {
        C2AG c2ag = new C2AG(userSession, abstractC24481Hr, interfaceC25185BCi) { // from class: X.9hH
            public final AbstractC24481Hr A00;
            public final InterfaceC25185BCi A01;
            public final UserSession A02;

            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
                String canonicalPath;
                try {
                    AbstractC24481Hr abstractC24481Hr2 = this.A00;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    C14360o3.A0B(abstractC24481Hr2, 0);
                    if (LH2.A02(abstractC24481Hr2, new LEZ(5L, timeUnit))) {
                        File file = (File) abstractC24481Hr2.A07();
                        if (file != null && (canonicalPath = file.getCanonicalPath()) != null) {
                            this.A01.DXM(canonicalPath);
                            return null;
                        }
                    } else {
                        C18950wb.A01.AEp("Failed to save Template Overlay", 18956031);
                        this.A01.DXL();
                    }
                    return null;
                } catch (InterruptedException unused) {
                    C18950wb.A01.AEp("Failed to save Template Overlay", 18956031);
                    this.A01.DXL();
                    return null;
                }
            }

            @Override // X.C11R
            public final int getRunnableId() {
                return 1626698477;
            }

            {
                this.A00 = abstractC24481Hr;
                this.A01 = interfaceC25185BCi;
                this.A02 = userSession;
            }
        };
        if (c1gl == null) {
            C1GJ.A03(c2ag);
        } else {
            c1gl.schedule(c2ag);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r8.A01 == null) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.1tl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0C(com.instagram.common.session.UserSession r6, X.ACA r7, X.A96 r8, X.C47Z r9) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9O1.A0C(com.instagram.common.session.UserSession, X.ACA, X.A96, X.47Z):void");
    }

    public static void A0D(UserSession userSession, C54791OJj c54791OJj, C47Z c47z) {
        c47z.A24 = c54791OJj.A04;
        c47z.A25 = c54791OJj.A05;
        c47z.A0A = c54791OJj.A00;
        Point point = c54791OJj.A01;
        point.getClass();
        int i = point.x;
        int i2 = point.y;
        c47z.A0C = i;
        c47z.A0B = i2;
        Point point2 = c54791OJj.A02;
        point2.getClass();
        int i3 = point2.x;
        int i4 = point2.y;
        c47z.A0S = i3;
        c47z.A0R = i4;
        c47z.A33 = c54791OJj.A08;
        c47z.A5g = false;
        c47z.A5l = true;
        A8E a8e = c47z.A19;
        if (a8e != null) {
            a8e.A02.A19 = null;
            UserSession userSession2 = a8e.A00;
            C40121td.A0G.A01(userSession2.deviceSession.A06(), userSession2).A0G(c47z, false, false);
        }
        C25A.A00(userSession).A0A();
    }

    public static void A0E(UserSession userSession, C47Z c47z) {
        User user;
        if (c47z != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (C84823qW c84823qW : c47z.A4b) {
                EnumC75383a5 enumC75383a5 = c84823qW.A12;
                if (enumC75383a5 != EnumC75383a5.A0n || (user = c84823qW.A1C) == null) {
                    if (enumC75383a5 == EnumC75383a5.A0c) {
                        C217859kI A0C = c84823qW.A0C();
                        if (A0C != null) {
                            Iterator it = A0C.A05.iterator();
                            while (it.hasNext()) {
                                AbstractC167017dG.A1V(A1E, it);
                            }
                        }
                    } else if (enumC75383a5 == EnumC75383a5.A0o && (user = c84823qW.A1C) != null) {
                    }
                }
                A1E.add(user.getId());
            }
            if (!A1E.isEmpty()) {
                AbstractC186788Pv.A00(userSession).A01(c47z.A3t, A1E);
            }
        }
    }

    public static void A0F(UserSession userSession, C47Z c47z, int i, int i2) {
        if (i > 0 && i2 > 0 && !c47z.A4t.isEmpty()) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36323165487836213L) || C18U.A06(c06090Tz, userSession, 36320953579742228L)) {
                Iterator it = c47z.A4t.iterator();
                while (it.hasNext()) {
                    AGG agg = ((AGS) it.next()).A01;
                    if (agg != null) {
                        agg.A01 = Float.valueOf(i);
                        agg.A00 = Float.valueOf(i2);
                    }
                }
            }
        }
    }

    public static boolean A0G(UserSession userSession, DirectShareTarget directShareTarget) {
        if (directShareTarget != null && C18U.A06(C06090Tz.A05, userSession, 2342164439534675380L)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.1tl] */
    public static C47Z A03(UserSession userSession, ShareType shareType) {
        PendingMediaStore A00 = C25A.A00(userSession);
        String valueOf = String.valueOf(System.nanoTime());
        C14360o3.A0B(valueOf, 0);
        C47Z A01 = AbstractC209399Nx.A01(valueOf);
        A01.A0Y(new Object());
        A01.A1k = shareType;
        A01.A0N = 12;
        A01.A0a(EnumC915447k.A02);
        A00.A0D(A01, A01.A35);
        return A01;
    }

    public static boolean A0H(UserSession userSession, C47Z c47z) {
        C06090Tz c06090Tz;
        long j;
        String str;
        if (c47z.A0D() != ShareType.A0V && c47z.A0D() != ShareType.A0W) {
            return false;
        }
        if (AbstractC23131AMn.A07(userSession, c47z)) {
            c06090Tz = C06090Tz.A05;
            j = 36324642956390725L;
        } else {
            if (c47z.A1G == EnumC40111tc.A0Q && c47z.A10 == null && !c47z.A57 && c47z.A14(ShareType.A02)) {
                C84823qW A00 = C48r.A00(EnumC75383a5.A0s, c47z.A4b);
                if (A00 != null) {
                    str = A00.A1h;
                } else {
                    str = null;
                }
                if (C14360o3.A0K(str, EnumC138556Pl.A0D.A02)) {
                    c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36323165487574066L)) {
                        j = 36324642956325188L;
                    }
                }
            }
            boolean A0z = c47z.A0z();
            c06090Tz = C06090Tz.A05;
            if (!A0z) {
                j = 36324642956456262L;
            } else {
                j = 36324642956259651L;
            }
        }
        return C18U.A06(c06090Tz, userSession, j);
    }
}
