package com.instagram.ar.core.effectcollection;

import X.AbstractC09440dt;
import X.AbstractC173127nQ;
import X.AbstractC1807880g;
import X.AnonymousClass058;
import X.AnonymousClass111;
import X.AnonymousClass194;
import X.AnonymousClass197;
import X.B13;
import X.C06090Tz;
import X.C0ST;
import X.C0eB;
import X.C12L;
import X.C13920nI;
import X.C142456c7;
import X.C14360o3;
import X.C16400rl;
import X.C16410rm;
import X.C172897n3;
import X.C174297pL;
import X.C1807580d;
import X.C1807980h;
import X.C18U;
import X.C191258dU;
import X.C19K;
import X.C19L;
import X.C1JX;
import X.C206629Ct;
import X.C2Q9;
import X.C4HQ;
import X.C9D0;
import X.C9D2;
import X.C9DD;
import X.C9DH;
import X.C9DR;
import X.C9EI;
import X.InterfaceC09390do;
import X.InterfaceC16620sF;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.MCD;
import X.MCQ;
import android.content.Context;
import com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class EffectCollectionService {
    public final long A00;
    public final long A01;
    public final long A02;
    public final Context A03;
    public final RoomEffectCollectionRepository A04;
    public final UserSession A05;
    public final C13920nI A06;
    public final InterfaceC09390do A07;
    public final C19L A08;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r5.A05 == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.ar.core.effectcollection.EffectCollectionService r6, X.C172897n3 r7, X.C191258dU r8, X.C173327nk r9, java.lang.String r10, X.InterfaceC23621Ds r11, boolean r12) {
        /*
            r4 = 7
            boolean r0 = X.C206459Cc.A00(r11, r4)
            if (r0 == 0) goto L93
            r3 = r11
            X.9Cc r3 = (X.C206459Cc) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L93
            int r2 = r2 - r1
            r3.A00 = r2
        L15:
            java.lang.Object r1 = r3.A03
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r4 = 1
            if (r0 == 0) goto L3f
            if (r0 != r4) goto L9a
            java.lang.Object r7 = r3.A02
            X.7n3 r7 = (X.C172897n3) r7
            java.lang.Object r9 = r3.A01
            X.7nk r9 = (X.C173327nk) r9
            X.AbstractC09560e7.A00(r1)
        L2b:
            java.lang.Object r0 = r9.A00
            X.9Bj r0 = (X.C206269Bj) r0
            java.lang.Object r1 = r0.A03
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r0 = r0.A02
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r7.A01(r0, r1)
            return r9
        L3f:
            X.AbstractC09560e7.A00(r1)
            java.lang.Object r5 = r9.A00
            X.9Bj r5 = (X.C206269Bj) r5
            java.lang.Object r0 = r5.A02
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L78
            java.lang.String r1 = r8.A01
            java.lang.String r0 = "SAVED"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L78
            X.02i r4 = X.C006802i.A0p
            X.C14360o3.A07(r4)
            int r3 = X.C172897n3.A00(r7)
            r2 = 17631244(0x10d080c, float:2.5903383E-38)
            java.lang.String r1 = "failure_reason"
            java.lang.String r0 = "effects_empty"
            r4.markerAnnotate(r2, r3, r1, r0)
            int r1 = X.C172897n3.A00(r7)
            r0 = 3
            r4.markerEnd(r2, r1, r0)
            return r9
        L78:
            if (r12 == 0) goto L7f
            boolean r1 = r5.A05
            r0 = 0
            if (r1 != 0) goto L80
        L7f:
            r0 = 1
        L80:
            r3.A01 = r9
            r3.A02 = r7
            r3.A00 = r4
            if (r0 == 0) goto L2b
            r0 = 0
            if (r10 != 0) goto L8c
            r0 = 1
        L8c:
            java.lang.Object r0 = r6.A0B(r9, r3, r0, r4)
            if (r0 != r2) goto L2b
            return r2
        L93:
            X.9Cc r3 = new X.9Cc
            r3.<init>(r6, r11, r4)
            goto L15
        L9a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A00(com.instagram.ar.core.effectcollection.EffectCollectionService, X.7n3, X.8dU, X.7nk, java.lang.String, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.ar.core.effectcollection.EffectCollectionService r15, X.C208939Mb r16, X.InterfaceC23621Ds r17) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A02(com.instagram.ar.core.effectcollection.EffectCollectionService, X.9Mb, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object A03(com.instagram.ar.core.effectcollection.EffectCollectionService r14, X.C191258dU r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, X.InterfaceC23621Ds r19, long r20) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A03(com.instagram.ar.core.effectcollection.EffectCollectionService, X.8dU, java.lang.String, java.lang.String, java.lang.String, X.1Ds, long):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(com.instagram.ar.core.effectcollection.EffectCollectionService r12, X.C173327nk r13, X.C173327nk r14, X.InterfaceC23621Ds r15) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A05(com.instagram.ar.core.effectcollection.EffectCollectionService, X.7nk, X.7nk, X.1Ds):java.lang.Object");
    }

    public static final C16410rm A06(C1807580d c1807580d, EffectCollectionService effectCollectionService) {
        InterfaceC16620sF mcd;
        C172897n3 c172897n3 = new C172897n3(c1807580d.A01, c1807580d.A03);
        if (c1807580d.A08) {
            mcd = new C9DH(c1807580d, (InterfaceC23621Ds) null, effectCollectionService, 10);
        } else {
            mcd = new MCD(49, null);
        }
        return new C16410rm(new C9D2(c172897n3, null, 2), new C16400rl(new C9D0(c1807580d, c172897n3, (InterfaceC23621Ds) null, 10), AnonymousClass111.A02(new C9DR(c1807580d, effectCollectionService, c172897n3, null, 1), AnonymousClass111.A02(new C9DR(c1807580d, effectCollectionService, c172897n3, null, 0), new AnonymousClass058(mcd)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C3NY A08(X.InterfaceC23621Ds r6) {
        /*
            r5 = this;
            r4 = 7
            boolean r0 = X.C9CY.A00(r6, r4)
            if (r0 == 0) goto L88
            r3 = r6
            X.9CY r3 = (X.C9CY) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L88
            int r2 = r2 - r1
            r3.A00 = r2
        L15:
            java.lang.Object r2 = r3.A02
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto Laa
            if (r1 != r0) goto La2
            java.lang.Object r3 = r3.A01
            X.JbW r3 = (X.C43921JbW) r3
            X.AbstractC09560e7.A00(r2)
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L6b
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r1 = r2.A00
            X.9OO r1 = (X.C9OO) r1
            com.instagram.camera.effect.models.CameraAREffect r0 = r1.A00
            if (r0 != 0) goto L40
            boolean r0 = r1.A05
            if (r0 == 0) goto L61
            X.K9O r0 = X.K9O.A00
        L3b:
            X.8jk r2 = new X.8jk
            r2.<init>(r0)
        L40:
            r3.A01(r2)
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L57
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            X.9OO r0 = (X.C9OO) r0
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A00
            if (r0 == 0) goto L8e
            X.3NX r2 = new X.3NX
            r2.<init>(r0)
        L56:
            return r2
        L57:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L56
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L61:
            java.lang.String r2 = r1.A03
            java.lang.String r1 = r1.A02
            X.Uzc r0 = new X.Uzc
            r0.<init>(r2, r1)
            goto L3b
        L6b:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto L9c
            X.8jk r2 = (X.C194848jk) r2
            java.lang.Object r1 = r2.A00
            boolean r0 = r1 instanceof X.K9M
            if (r0 == 0) goto L7a
            X.K9Q r0 = X.K9Q.A00
            goto L3b
        L7a:
            boolean r0 = r1 instanceof X.K9L
            if (r0 == 0) goto L81
            X.K9P r0 = X.K9P.A00
            goto L3b
        L81:
            boolean r0 = r1 instanceof X.K9N
            if (r0 == 0) goto L96
            X.K9R r0 = X.K9R.A00
            goto L3b
        L88:
            X.9CY r3 = new X.9CY
            r3.<init>(r5, r6, r4)
            goto L15
        L8e:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L96:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L9c:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        La2:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Laa:
            X.AbstractC09560e7.A00(r2)
            java.lang.String r1 = "collectionId"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A08(X.1Ds):X.3NY");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0B(X.C173327nk r11, X.InterfaceC23621Ds r12, boolean r13, boolean r14) {
        /*
            r10 = this;
            r7 = r11
            r3 = 0
            boolean r0 = r12 instanceof X.C206479Ce
            if (r0 == 0) goto L6c
            r4 = r12
            X.9Ce r4 = (X.C206479Ce) r4
            int r0 = r4.A06
            if (r0 != r3) goto L6c
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r6 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L43
            if (r0 != r2) goto L72
            X.AbstractC09560e7.A00(r6)
        L29:
            X.0eB r3 = X.C0eB.A00
        L2b:
            return r3
        L2c:
            X.AbstractC09560e7.A00(r6)
            com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository r0 = r10.A04
            r4.A01 = r10
            r4.A02 = r11
            r4.A04 = r13
            r4.A05 = r14
            r4.A00 = r1
            java.lang.Object r6 = r0.A03(r11, r4, r13)
            if (r6 == r3) goto L2b
            r5 = r10
            goto L50
        L43:
            boolean r14 = r4.A05
            boolean r13 = r4.A04
            java.lang.Object r7 = r4.A02
            java.lang.Object r5 = r4.A01
            com.instagram.ar.core.effectcollection.EffectCollectionService r5 = (com.instagram.ar.core.effectcollection.EffectCollectionService) r5
            X.AbstractC09560e7.A00(r6)
        L50:
            if (r13 == 0) goto L29
            if (r14 == 0) goto L29
            r8 = 0
            r4.A01 = r8
            r4.A02 = r8
            r4.A00 = r2
            X.19L r2 = r5.A08
            r9 = 12
            X.9DH r4 = new X.9DH
            r4.<init>(r5, r6, r7, r8, r9)
            X.191 r1 = X.AnonymousClass191.A00
            java.lang.Integer r0 = X.C05F.A00
            X.AbstractC23641Du.A03(r0, r1, r4, r2)
            goto L29
        L6c:
            X.9Ce r4 = new X.9Ce
            r4.<init>(r10, r12, r3)
            goto L18
        L72:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A0B(X.7nk, X.1Ds, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0E(java.util.List r10, X.InterfaceC23621Ds r11) {
        /*
            r9 = this;
            r3 = 6
            boolean r0 = X.C9CY.A00(r11, r3)
            if (r0 == 0) goto L66
            r8 = r11
            X.9CY r8 = (X.C9CY) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r8.A00 = r2
        L15:
            java.lang.Object r1 = r8.A02
            X.1JX r7 = X.C1JX.A02
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L3e
            if (r0 != r6) goto L6c
            java.lang.Object r5 = r8.A01
            X.9Nv r5 = (X.C209379Nv) r5
            X.AbstractC09560e7.A00(r1)
        L27:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            X.02i r3 = r5.A01
            int r2 = r5.A00
            r1 = 3
            if (r0 == 0) goto L35
            r1 = 2
        L35:
            r0 = 17633701(0x10d11a5, float:2.591027E-38)
            r3.markerEnd(r0, r2, r1)
            X.0eB r7 = X.C0eB.A00
            return r7
        L3e:
            X.AbstractC09560e7.A00(r1)
            X.9Nv r5 = new X.9Nv
            r5.<init>()
            int r4 = r10.size()
            X.02i r3 = r5.A01
            int r2 = r5.A00
            r1 = 17633701(0x10d11a5, float:2.591027E-38)
            r3.markerStart(r1, r2)
            java.lang.String r0 = "effects_count"
            r3.markerAnnotate(r1, r2, r0, r4)
            com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository r0 = r9.A04
            r8.A01 = r5
            r8.A00 = r6
            java.lang.Object r1 = r0.A04(r10, r8)
            if (r1 != r7) goto L27
            return r7
        L66:
            X.9CY r8 = new X.9CY
            r8.<init>(r9, r11, r3)
            goto L15
        L6c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A0E(java.util.List, X.1Ds):java.lang.Object");
    }

    public /* synthetic */ EffectCollectionService(Context context, RoomEffectCollectionRepository roomEffectCollectionRepository, UserSession userSession) {
        C13920nI c13920nI = C13920nI.A00;
        C12L c12l = C12L.A00;
        C19K A02 = AnonymousClass194.A02(c12l.AOT(1362142542, 3).plus(new AnonymousClass197(null)));
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c13920nI, 3);
        C14360o3.A0B(A02, 9);
        this.A04 = roomEffectCollectionRepository;
        this.A05 = userSession;
        this.A06 = c13920nI;
        this.A03 = context;
        this.A08 = A02;
        this.A00 = C18U.A01(C06090Tz.A05, userSession, 36612023512996191L);
        TimeUnit timeUnit = TimeUnit.DAYS;
        this.A02 = timeUnit.toMillis(90L);
        this.A01 = timeUnit.toMillis(2L);
        this.A07 = AbstractC09440dt.A01(new C9EI(this, 21));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.ar.core.effectcollection.EffectCollectionService r21, X.C208939Mb r22, X.InterfaceC23621Ds r23) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A01(com.instagram.ar.core.effectcollection.EffectCollectionService, X.9Mb, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(com.instagram.ar.core.effectcollection.EffectCollectionService r11, X.C191258dU r12, java.lang.String r13, X.InterfaceC23621Ds r14) {
        /*
            r3 = 12
            boolean r0 = X.MAR.A03(r14, r3)
            r4 = r11
            if (r0 == 0) goto L49
            r9 = r14
            X.MAR r9 = (X.MAR) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r9.A00 = r2
        L17:
            java.lang.Object r3 = r9.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r9.A00
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L5d
            X.AbstractC09560e7.A00(r3)
        L25:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L51
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r2 = r3.A00
            return r2
        L30:
            X.AbstractC09560e7.A00(r3)
            long r10 = r11.A01
            r7 = 0
            r6 = r13
            X.C14360o3.A0B(r13, r1)
            r0 = 2
            r5 = r12
            X.C14360o3.A0B(r12, r0)
            r9.A00 = r1
            r8 = r7
            java.lang.Object r3 = A03(r4, r5, r6, r7, r8, r9, r10)
            if (r3 != r2) goto L25
            return r2
        L49:
            r0 = 42
            X.MAR r9 = new X.MAR
            r9.<init>(r11, r14, r3, r0)
            goto L17
        L51:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L57
            r2 = 0
            return r2
        L57:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L5d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A04(com.instagram.ar.core.effectcollection.EffectCollectionService, X.8dU, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A09(X.C208939Mb r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 44
            boolean r0 = X.MAN.A02(r8, r3)
            if (r0 == 0) goto L4e
            r5 = r8
            X.MAN r5 = (X.MAN) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L54
            java.lang.Object r1 = r5.A01
            X.JbW r1 = (X.C43921JbW) r1
            X.AbstractC09560e7.A00(r4)
        L28:
            X.3NY r4 = (X.C3NY) r4
            r1.A01(r4)
            return r4
        L2e:
            X.AbstractC09560e7.A00(r4)
            X.8dU r0 = r7.A01
            X.JbW r1 = new X.JbW
            r1.<init>(r0)
            java.util.ArrayList r0 = r7.A00()
            int r0 = r0.size()
            r1.A00(r0)
            r5.A01 = r1
            r5.A00 = r2
            java.lang.Object r4 = A02(r6, r7, r5)
            if (r4 != r3) goto L28
            return r3
        L4e:
            X.MAN r5 = new X.MAN
            r5.<init>(r6, r8, r3)
            goto L16
        L54:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A09(X.9Mb, X.1Ds):java.lang.Object");
    }

    public final Object A0A(C191258dU c191258dU, InterfaceC23621Ds interfaceC23621Ds) {
        C142456c7 c142456c7 = this.A04.A00;
        Object A00 = C4HQ.A00(c142456c7.A07, interfaceC23621Ds, new C174297pL(c142456c7, AbstractC173127nQ.A01(c191258dU, null, System.currentTimeMillis(), false)));
        C1JX c1jx = C1JX.A02;
        if (A00 != c1jx) {
            A00 = C0eB.A00;
        }
        if (A00 != c1jx) {
            return C0eB.A00;
        }
        return A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        if (r0 != r6) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0C(X.C85A r14, X.C8B8 r15, X.InterfaceC23621Ds r16) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A0C(X.85A, X.8B8, X.1Ds):java.lang.Object");
    }

    public final Object A0D(String str, InterfaceC23621Ds interfaceC23621Ds) {
        C142456c7 c142456c7 = this.A04.A00;
        Object A01 = C2Q9.A01(c142456c7.A07, new B13(c142456c7, str), interfaceC23621Ds);
        C1JX c1jx = C1JX.A02;
        if (A01 != c1jx) {
            A01 = C0eB.A00;
        }
        if (A01 != c1jx) {
            return C0eB.A00;
        }
        return A01;
    }

    public final InterfaceC19390xP A0F(C1807580d c1807580d) {
        Object A06;
        if (c1807580d.A04) {
            A06 = new AnonymousClass058(new MCQ((Object) new C9DD(this, c1807580d, null, 0), (Object) new AnonymousClass058(new C9DH(c1807580d, (InterfaceC23621Ds) null, this, 11)), (InterfaceC23621Ds) null, 17));
        } else {
            A06 = A06(c1807580d, this);
        }
        final UserSession userSession = this.A05;
        final C13920nI c13920nI = this.A06;
        C14360o3.A0B(c13920nI, 1);
        return C0ST.A01(new AnonymousClass058(new MCQ(new Object(userSession, c13920nI) { // from class: X.80f
            public final UserSession A00;
            public final C13920nI A01;

            {
                this.A00 = userSession;
                this.A01 = c13920nI;
            }
        }, A06, (InterfaceC23621Ds) null, 18)));
    }

    public final C1807980h A07(C1807580d c1807580d) {
        return AbstractC1807880g.A00(new C206629Ct(9, null), A0F(c1807580d));
    }
}
