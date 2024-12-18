package com.instagram.creation.capture.quickcapture.storydrafts.model;

import X.AbstractC001800i;
import X.AbstractC06950Ym;
import X.AbstractC07080Za;
import X.AbstractC203228yf;
import X.AbstractC23021Ah;
import X.C0JE;
import X.C12L;
import X.C12N;
import X.C14360o3;
import X.C194698jV;
import X.C203238yg;
import X.C23031Ai;
import X.C24721Ip;
import X.C8CL;
import X.C9D3;
import X.InterfaceC13000lm;
import X.InterfaceC19390xP;
import X.InterfaceC19610xo;
import X.InterfaceC24731Iq;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class StoryDraftsStore implements InterfaceC13000lm {
    public static final C8CL A08 = new Object();
    public final C12N A00;
    public final UserSession A01;
    public final C23031Ai A02;
    public final List A03;
    public final List A04;
    public final InterfaceC24731Iq A05;
    public final InterfaceC19390xP A06;
    public final InterfaceC19390xP A07;

    /* JADX WARN: Removed duplicated region for block: B:103:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.content.Context r30, android.graphics.Bitmap r31, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r32, com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r33, X.C196948nP r34, X.C199008r1 r35, X.InterfaceC25186BCj r36, com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore r37, java.lang.String r38, java.lang.String r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore.A00(android.content.Context, android.graphics.Bitmap, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec, X.8nP, X.8r1, X.BCj, com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore, java.lang.String, java.lang.String, boolean):void");
    }

    public static final void A01(StoryDraftsStore storyDraftsStore) {
        List list = storyDraftsStore.A03;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC203228yf.A00((C203238yg) it.next()));
        }
        Set A0k = AbstractC001800i.A0k(arrayList);
        InterfaceC19610xo ARD = storyDraftsStore.A02.A01.ARD();
        ARD.E7L("story_drafts", A0k);
        ARD.apply();
    }

    public static final void A02(StoryDraftsStore storyDraftsStore, List list) {
        for (C194698jV c194698jV : storyDraftsStore.A04) {
            C14360o3.A0B(list, 0);
            c194698jV.A01.F8s(new ArrayList(list));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[Catch: IOException -> 0x0065, TryCatch #0 {IOException -> 0x0065, blocks: (B:11:0x0045, B:12:0x0048, B:13:0x004e, B:15:0x0054, B:27:0x0038), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 13
            boolean r0 = X.C206459Cc.A00(r8, r3)
            if (r0 == 0) goto L27
            r5 = r8
            X.9Cc r5 = (X.C206459Cc) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A03
            X.1JX r2 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L35
            if (r1 != r0) goto L2d
            java.lang.Object r7 = r5.A02
            java.lang.String r7 = (java.lang.String) r7
            goto L45
        L27:
            X.9Cc r5 = new X.9Cc
            r5.<init>(r6, r8, r3)
            goto L16
        L2d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L35:
            X.AbstractC09560e7.A00(r4)
            r5.A01 = r6     // Catch: java.io.IOException -> L65
            r5.A02 = r7     // Catch: java.io.IOException -> L65
            r5.A00 = r0     // Catch: java.io.IOException -> L65
            java.lang.Object r4 = r6.A04(r5)     // Catch: java.io.IOException -> L65
            if (r4 != r2) goto L48
            return r2
        L45:
            X.AbstractC09560e7.A00(r4)     // Catch: java.io.IOException -> L65
        L48:
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.io.IOException -> L65
            java.util.Iterator r2 = r4.iterator()     // Catch: java.io.IOException -> L65
        L4e:
            boolean r0 = r2.hasNext()     // Catch: java.io.IOException -> L65
            if (r0 == 0) goto L64
            java.lang.Object r1 = r2.next()     // Catch: java.io.IOException -> L65
            r0 = r1
            X.8yg r0 = (X.C203238yg) r0     // Catch: java.io.IOException -> L65
            java.lang.String r0 = r0.A07     // Catch: java.io.IOException -> L65
            boolean r0 = X.C14360o3.A0K(r0, r7)     // Catch: java.io.IOException -> L65
            if (r0 == 0) goto L4e
            return r1
        L64:
            return r3
        L65:
            r2 = move-exception
            java.lang.String r1 = "StoryDraftsStore"
            java.lang.String r0 = "Failed to de-serialise story draft "
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r7)
            X.AbstractC12120kG.A0F(r1, r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore.A03(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.InterfaceC23621Ds r8) {
        /*
            r7 = this;
            r3 = 18
            boolean r0 = X.C9CY.A00(r8, r3)
            if (r0 == 0) goto L22
            r6 = r8
            X.9CY r6 = (X.C9CY) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r0 = r6.A02
            X.1JX r5 = X.C1JX.A02
            int r1 = r6.A00
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 != r4) goto L2c
            goto L28
        L22:
            X.9CY r6 = new X.9CY
            r6.<init>(r7, r8, r3)
            goto L16
        L28:
            X.AbstractC09560e7.A00(r0)     // Catch: java.io.IOException -> L53
            return r0
        L2c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L34:
            X.AbstractC09560e7.A00(r0)
            X.12N r2 = r7.A00     // Catch: java.io.IOException -> L53
            r3 = 0
            r1 = 825(0x339, float:1.156E-42)
            r0 = 3
            X.0nZ r2 = r2.AOT(r1, r0)     // Catch: java.io.IOException -> L53
            r1 = 16
            X.9Ct r0 = new X.9Ct     // Catch: java.io.IOException -> L53
            r0.<init>(r7, r3, r1)     // Catch: java.io.IOException -> L53
            r6.A01 = r7     // Catch: java.io.IOException -> L53
            r6.A00 = r4     // Catch: java.io.IOException -> L53
            java.lang.Object r0 = X.AbstractC23641Du.A00(r6, r2, r0)     // Catch: java.io.IOException -> L53
            if (r0 != r5) goto L5d
            return r5
        L53:
            r2 = move-exception
            java.lang.String r1 = "StoryDraftsStore"
            java.lang.String r0 = "Failed to de-serialise story drafts"
            X.AbstractC12120kG.A0F(r1, r0, r2)
            X.0sl r0 = X.C16930sl.A00
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore.A04(X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A04.clear();
    }

    public /* synthetic */ StoryDraftsStore(UserSession userSession) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C12L c12l = C12L.A00;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(A00, 2);
        C14360o3.A0B(c12l, 3);
        this.A01 = userSession;
        this.A02 = A00;
        this.A00 = c12l;
        this.A03 = new ArrayList();
        this.A04 = new ArrayList();
        this.A07 = C0JE.A00(new C9D3(this, null, 37));
        C24721Ip c24721Ip = new C24721Ip(Integer.MAX_VALUE);
        this.A05 = c24721Ip;
        this.A06 = AbstractC07080Za.A03(c24721Ip);
    }
}
