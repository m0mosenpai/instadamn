package com.instagram.creation.capture.quickcapture.storydrafts;

import X.AbstractC07080Za;
import X.AbstractC141776au;
import X.AbstractC198428pr;
import X.AbstractC198448pt;
import X.AbstractC208910l;
import X.AbstractC23641Du;
import X.AbstractC52922bZ;
import X.AbstractC58232lf;
import X.AnonymousClass059;
import X.AnonymousClass191;
import X.AnonymousClass229;
import X.AnonymousClass840;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C05U;
import X.C0UO;
import X.C141796aw;
import X.C14360o3;
import X.C1815483h;
import X.C1816783z;
import X.C183978Ee;
import X.C195868lW;
import X.C198438ps;
import X.C199008r1;
import X.C19L;
import X.C220709ou;
import X.C220719ov;
import X.C24721Ip;
import X.C24Q;
import X.C2GT;
import X.C4A7;
import X.C8CI;
import X.C8CO;
import X.C8CQ;
import X.C9B5;
import X.C9D4;
import X.C9DH;
import X.C9DZ;
import X.C9ZO;
import X.EnumC198268pb;
import X.InterfaceC11380iw;
import X.InterfaceC16660sJ;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.InterfaceC24731Iq;
import X.PXZ;
import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class StoryDraftsCreationViewModel extends AbstractC52922bZ {
    public final C2GT A00;
    public final C2GT A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C8CQ A04;
    public final InterfaceC24731Iq A05;
    public final InterfaceC24731Iq A06;
    public final InterfaceC19390xP A07;
    public final C05A A08;
    public final InterfaceC19390xP A09;
    public final C0UO A0A;

    public StoryDraftsCreationViewModel(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C8CQ c8cq) {
        C14360o3.A0B(interfaceC11380iw, 3);
        this.A03 = userSession;
        this.A04 = c8cq;
        this.A02 = interfaceC11380iw;
        C008002u c008002u = new C008002u(new C9B5(false, 1));
        this.A08 = c008002u;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A06 = c24721Ip;
        C05U A03 = AbstractC07080Za.A03(c24721Ip);
        this.A09 = A03;
        AnonymousClass059 A02 = AbstractC208910l.A02(c008002u);
        this.A0A = A02;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A01 = AbstractC58232lf.A00(anonymousClass191, A02);
        this.A00 = AbstractC58232lf.A00(anonymousClass191, A03);
        C24721Ip c24721Ip2 = new C24721Ip(0);
        this.A05 = c24721Ip2;
        this.A07 = AbstractC07080Za.A03(c24721Ip2);
    }

    public final void A01(Context context, Bitmap bitmap, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass840 anonymousClass840, CameraSpec cameraSpec, C199008r1 c199008r1, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        Integer num;
        C9ZO c9zo;
        C14360o3.A0B(anonymousClass840, 0);
        C14360o3.A0B(targetViewSizeProvider, 3);
        C14360o3.A0B(context, 4);
        C198438ps A00 = AbstractC198428pr.A00(this.A03);
        C24Q c24q = A00.A04;
        long A04 = c24q.A04(null, null, 518927515, 12000L);
        A00.A01 = A04;
        if (z2) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        c24q.A0B(A04, "media_type", AbstractC198448pt.A00(num), false);
        C1816783z c1816783z = anonymousClass840.A02;
        EnumC198268pb A01 = c1816783z.A01();
        EnumC198268pb enumC198268pb = EnumC198268pb.A07;
        C1815483h c1815483h = c1816783z.A01;
        if (A01 == enumC198268pb) {
            C195868lW A042 = c1815483h.A04();
            if (A042 != null) {
                if (A042.A1G) {
                    int i = A042.A0J;
                    A042.A0H = i;
                    int i2 = A042.A0I;
                    A042.A06 = i2;
                    A042.A07 = i2 - i;
                }
                c9zo = new C9ZO(context, bitmap, targetViewSizeProvider, cameraSpec, c199008r1, C220719ov.A00, null, A042, c1815483h.A05(), c1815483h.A0G, z);
            } else {
                return;
            }
        } else {
            C183978Ee A03 = c1815483h.A03();
            if (A03 == null) {
                return;
            } else {
                c9zo = new C9ZO(context, bitmap, targetViewSizeProvider, cameraSpec, c199008r1, C220709ou.A00, A03, null, c1815483h.A05(), c1815483h.A0G, z);
            }
        }
        C141796aw A002 = AbstractC141776au.A00(this);
        C9DH c9dh = new C9DH(this, interfaceC16660sJ, c9zo, null, 28);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dh, A002);
    }

    public final void A03(String str) {
        C8CI c8ci = this.A04.A03.A00;
        C19L c19l = ((C4A7) c8ci).A01;
        AbstractC23641Du.A05(AnonymousClass191.A00, new PXZ(c8ci, str, null, 15, true), c19l);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|(1:(1:15))(1:(1:20))|16|17))|30|6|7|(0)(0)|12|(0)(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        if (r12 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        r12.onError(X.AnonymousClass001.A0R("draftCreationUseCases.Save failed ", r0.getMessage()));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel r11, X.InterfaceC25186BCj r12, X.C9ZO r13, X.InterfaceC23621Ds r14) {
        /*
            r3 = 12
            boolean r0 = X.C206459Cc.A00(r14, r3)
            if (r0 == 0) goto L28
            r4 = r14
            X.9Cc r4 = (X.C206459Cc) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r0 = r4.A03
            X.1JX r5 = X.C1JX.A02
            int r3 = r4.A00
            java.lang.String r1 = "draftCreationUseCases.Save failed "
            r2 = 1
            if (r3 == 0) goto L36
            if (r3 != r2) goto L2e
            java.lang.Object r12 = r4.A02
            X.BCj r12 = (X.InterfaceC25186BCj) r12
            goto L6e
        L28:
            X.9Cc r4 = new X.9Cc
            r4.<init>(r11, r14, r3)
            goto L16
        L2e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L36:
            X.AbstractC09560e7.A00(r0)
            X.8CQ r0 = r11.A04     // Catch: java.lang.RuntimeException -> L86
            X.8CN r0 = r0.A02     // Catch: java.lang.RuntimeException -> L86
            r8 = r13
            r4.A01 = r13     // Catch: java.lang.RuntimeException -> L86
            r4.A02 = r12     // Catch: java.lang.RuntimeException -> L86
            r4.A00 = r2     // Catch: java.lang.RuntimeException -> L86
            X.8CI r9 = r0.A00     // Catch: java.lang.RuntimeException -> L86
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C89563yw.A01     // Catch: java.lang.RuntimeException -> L86
            X.1Ds r0 = X.C1E2.A02(r4)     // Catch: java.lang.RuntimeException -> L86
            X.3yw r4 = new X.3yw     // Catch: java.lang.RuntimeException -> L86
            r4.<init>(r0)     // Catch: java.lang.RuntimeException -> L86
            X.AhE r7 = new X.AhE     // Catch: java.lang.RuntimeException -> L86
            r7.<init>(r4)     // Catch: java.lang.RuntimeException -> L86
            X.19L r3 = r9.A01     // Catch: java.lang.RuntimeException -> L86
            r10 = 0
            r11 = 8
            X.9DG r6 = new X.9DG     // Catch: java.lang.RuntimeException -> L86
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.RuntimeException -> L86
            X.191 r2 = X.AnonymousClass191.A00     // Catch: java.lang.RuntimeException -> L86
            java.lang.Integer r0 = X.C05F.A00     // Catch: java.lang.RuntimeException -> L86
            X.AbstractC23641Du.A03(r0, r2, r6, r3)     // Catch: java.lang.RuntimeException -> L86
            java.lang.Object r0 = r4.A00()     // Catch: java.lang.RuntimeException -> L86
            if (r0 != r5) goto L71
            return r5
        L6e:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.RuntimeException -> L86
        L71:
            X.8yg r0 = (X.C203238yg) r0     // Catch: java.lang.RuntimeException -> L86
            if (r0 == 0) goto L7b
            if (r12 == 0) goto L94
            r12.Dps(r0)     // Catch: java.lang.RuntimeException -> L86
            goto L94
        L7b:
            if (r12 == 0) goto L94
            r0 = 0
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)     // Catch: java.lang.RuntimeException -> L86
            r12.onError(r0)     // Catch: java.lang.RuntimeException -> L86
            goto L94
        L86:
            r0 = move-exception
            if (r12 == 0) goto L94
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            r12.onError(r0)
        L94:
            X.0eB r5 = X.C0eB.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel.A00(com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel, X.BCj, X.9ZO, X.1Ds):java.lang.Object");
    }

    public final void A02(String str) {
        if (str != null) {
            C141796aw A00 = AbstractC141776au.A00(this);
            C9DZ c9dz = new C9DZ(this, str, null, 0);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dz, A00);
        }
    }

    public final void A04(List list) {
        C8CO c8co = this.A04.A00;
        UserSession userSession = this.A03;
        C8CI c8ci = c8co.A00;
        C19L c19l = ((C4A7) c8ci).A01;
        C9D4 c9d4 = new C9D4(list, c8ci, (InterfaceC23621Ds) null, 27);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d4, c19l);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass229.A01(userSession).A1p((String) it.next());
        }
    }
}
