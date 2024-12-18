package com.instagram.camera.effect.mq.effectmetadata;

import X.AbstractC001800i;
import X.AbstractC011604e;
import X.AbstractC06950Ym;
import X.AbstractC191288dX;
import X.AnonymousClass863;
import X.C05A;
import X.C10E;
import X.C12N;
import X.C13920nI;
import X.C14360o3;
import X.C16440rp;
import X.C16930sl;
import X.C1807580d;
import X.C1815383g;
import X.C1821585z;
import X.C189698ao;
import X.C191258dU;
import X.C191278dW;
import X.C191298dY;
import X.C191368dn;
import X.C85Z;
import X.InterfaceC19390xP;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService$withSelectedEffect$$inlined$map$1$2;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class EffectTrayService {
    public final C85Z A00;
    public final EffectCollectionService A01;
    public final C1815383g A02;
    public final C13920nI A03;
    public final C1821585z A04;
    public final C05A A05;
    public final EffectsByIdMetadataService A06;
    public final C12N A07;

    public EffectTrayService(C85Z c85z, EffectCollectionService effectCollectionService, C1815383g c1815383g, C12N c12n, UserSession userSession, C13920nI c13920nI, C1821585z c1821585z) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c1815383g, 2);
        C14360o3.A0B(effectCollectionService, 3);
        C14360o3.A0B(c12n, 6);
        C14360o3.A0B(c13920nI, 7);
        this.A02 = c1815383g;
        this.A01 = effectCollectionService;
        this.A04 = c1821585z;
        this.A00 = c85z;
        this.A07 = c12n;
        this.A03 = c13920nI;
        this.A06 = new EffectsByIdMetadataService(effectCollectionService, userSession);
        this.A05 = C10E.A00(AnonymousClass863.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.AAD r14, com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r15, X.InterfaceC23621Ds r16) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.effectmetadata.EffectTrayService.A02(X.AAD, com.instagram.camera.effect.mq.effectmetadata.EffectTrayService, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.8dY] */
    public final C191298dY A04(final AbstractC191288dX abstractC191288dX, final String str, final String str2, final String str3, final List list, boolean z) {
        InterfaceC19390xP c16440rp;
        Integer num;
        boolean z2;
        C189698ao c189698ao;
        C14360o3.A0B(abstractC191288dX, 0);
        if (abstractC191288dX instanceof C191278dW) {
            final C191278dW c191278dW = (C191278dW) abstractC191288dX;
            List<C191258dU> list2 = c191278dW.A04;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
            for (C191258dU c191258dU : list2) {
                EffectCollectionService effectCollectionService = this.A01;
                long j = c191278dW.A00;
                if (C14360o3.A0K(c191258dU.A01, "SAVED")) {
                    num = null;
                } else {
                    num = c191278dW.A02;
                }
                C85Z c85z = this.A00;
                if (c85z != null && (c189698ao = (C189698ao) c85z.A00.A00()) != null) {
                    z2 = c189698ao.A04();
                } else {
                    z2 = true;
                }
                arrayList.add(effectCollectionService.A07(new C1807580d(c191258dU, num, null, j, true, true, false, z2, z)));
            }
            final InterfaceC19390xP[] interfaceC19390xPArr = (InterfaceC19390xP[]) AbstractC001800i.A0a(arrayList).toArray(new InterfaceC19390xP[0]);
            c16440rp = AbstractC011604e.A01(this.A07.AOT(818336140, 3), new InterfaceC19390xP(this) { // from class: X.80i
                public final /* synthetic */ EffectTrayService A00;

                {
                    this.A00 = this;
                }

                @Override // X.InterfaceC19390xP
                public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                    InterfaceC19390xP[] interfaceC19390xPArr2 = interfaceC19390xPArr;
                    Object A00 = AnonymousClass104.A00(interfaceC23621Ds, new C206879Ds(interfaceC19390xPArr2, 9), new C9DN(this.A00, c191278dW, null, 2), interfaceC19960yQ, interfaceC19390xPArr2);
                    if (A00 != C1JX.A02) {
                        return C0eB.A00;
                    }
                    return A00;
                }
            });
        } else {
            C16930sl c16930sl = C16930sl.A00;
            C14360o3.A0B(c16930sl, 0);
            c16440rp = new C16440rp(new C191368dn(null, null, null, c16930sl, null, true, true, false));
        }
        final InterfaceC19390xP interfaceC19390xP = c16440rp;
        return new InterfaceC19390xP(this) { // from class: X.8dY
            public final /* synthetic */ EffectTrayService A00;

            {
                this.A00 = this;
            }

            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = interfaceC19390xP.collect(new EffectTrayService$withSelectedEffect$$inlined$map$1$2(this.A00, abstractC191288dX, str2, str3, str, list, interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C191258dU r9, com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, X.InterfaceC23621Ds r14) {
        /*
            r3 = 14
            r4 = r14
            boolean r0 = X.C9CW.A00(r14, r3)
            if (r0 == 0) goto L4b
            r8 = r4
            X.9CW r8 = (X.C9CW) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r8.A00 = r2
        L17:
            java.lang.Object r3 = r8.A01
            X.1JX r1 = X.C1JX.A02
            int r0 = r8.A00
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L5f
            X.AbstractC09560e7.A00(r3)
        L25:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L53
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r1 = r3.A00
            return r1
        L30:
            X.AbstractC09560e7.A00(r3)
            com.instagram.ar.core.effectcollection.EffectCollectionService r3 = r10.A01
            r5 = r11
            X.C14360o3.A0B(r11, r2)
            r0 = 2
            r4 = r9
            X.C14360o3.A0B(r9, r0)
            r8.A00 = r2
            r9 = 3
            r6 = r12
            r7 = r13
            java.lang.Object r3 = com.instagram.ar.core.effectcollection.EffectCollectionService.A03(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r1) goto L25
            return r1
        L4b:
            r0 = 42
            X.9CW r8 = new X.9CW
            r8.<init>(r10, r14, r3, r0)
            goto L17
        L53:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L59
            r1 = 0
            return r1
        L59:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L5f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.effectmetadata.EffectTrayService.A00(X.8dU, com.instagram.camera.effect.mq.effectmetadata.EffectTrayService, java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.AAD r5, com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 15
            boolean r0 = X.MAG.A01(r7, r3)
            if (r0 == 0) goto L53
            r4 = r7
            X.MAG r4 = (X.MAG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L43
            if (r0 != r1) goto L5f
            java.lang.Object r6 = r4.A01
            com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r6 = (com.instagram.camera.effect.mq.effectmetadata.EffectTrayService) r6
            X.AbstractC09560e7.A00(r3)
        L28:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L3a
            X.05A r1 = r6.A05
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
        L34:
            r1.Egh(r0)
            X.0eB r2 = X.C0eB.A00
            return r2
        L3a:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L59
            X.05A r1 = r6.A05
            X.9fi r0 = X.C215069fi.A00
            goto L34
        L43:
            X.AbstractC09560e7.A00(r3)
            com.instagram.camera.effect.mq.effectmetadata.EffectsByIdMetadataService r0 = r6.A06
            r4.A01 = r6
            r4.A00 = r1
            java.lang.Object r3 = r0.A02(r5, r4)
            if (r3 != r2) goto L28
            return r2
        L53:
            X.MAG r4 = new X.MAG
            r4.<init>(r6, r7, r3)
            goto L16
        L59:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L5f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.effectmetadata.EffectTrayService.A01(X.AAD, com.instagram.camera.effect.mq.effectmetadata.EffectTrayService, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r7, X.AbstractC191288dX r8, java.lang.String r9, java.util.List r10, X.InterfaceC23621Ds r11) {
        /*
            r4 = 15
            boolean r0 = X.C9CW.A00(r11, r4)
            if (r0 == 0) goto L97
            r1 = r11
            X.9CW r1 = (X.C9CW) r1
            int r3 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L97
            int r3 = r3 - r2
            r1.A00 = r3
        L16:
            java.lang.Object r3 = r1.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r1.A00
            r11 = 1
            if (r0 == 0) goto L4c
            if (r0 != r11) goto La3
            X.AbstractC09560e7.A00(r3)
        L24:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L42
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r2 = r3.A00
            X.9OO r2 = (X.C9OO) r2
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A00
            if (r0 == 0) goto La0
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.C14360o3.A07(r1)
            java.util.List r0 = r2.A04
            java.util.ArrayList r0 = X.AbstractC001800i.A0S(r0, r1)
            return r0
        L42:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L69
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L4c:
            X.AbstractC09560e7.A00(r3)
            boolean r0 = r8 instanceof X.C191278dW
            if (r0 == 0) goto L6b
            X.8dW r8 = (X.C191278dW) r8
            X.8dU r4 = r8.A01
        L57:
            java.lang.String r3 = r4.A01
            if (r10 == 0) goto L69
            boolean r0 = X.C14360o3.A0K(r3, r9)
            if (r0 != 0) goto L70
            java.lang.String r0 = "EFFECT_BY_ID"
            boolean r0 = X.C14360o3.A0K(r3, r0)
            if (r0 != 0) goto L70
        L69:
            r0 = 0
            return r0
        L6b:
            X.9KP r8 = (X.C9KP) r8
            X.8dU r4 = r8.A00
            goto L57
        L70:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r8.addAll(r10)
            com.instagram.ar.core.effectcollection.EffectCollectionService r0 = r7.A01
            java.lang.Object r5 = X.AnonymousClass016.A13(r8)
            if (r5 == 0) goto Lab
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            X.C14360o3.A0B(r5, r11)
            r9 = 3
            X.9Mb r3 = new X.9Mb
            r7 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r11)
            r1.A00 = r11
            java.lang.Object r3 = r0.A09(r3, r1)
            if (r3 != r2) goto L24
            return r2
        L97:
            r0 = 42
            X.9CW r1 = new X.9CW
            r1.<init>(r7, r11, r4, r0)
            goto L16
        La0:
            java.util.List r0 = r2.A04
            return r0
        La3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lab:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.effectmetadata.EffectTrayService.A03(com.instagram.camera.effect.mq.effectmetadata.EffectTrayService, X.8dX, java.lang.String, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(X.AAD r15, X.InterfaceC23621Ds r16) {
        /*
            r14 = this;
            r4 = 14
            r5 = r16
            boolean r0 = X.C9CY.A00(r5, r4)
            r7 = r14
            if (r0 == 0) goto L7e
            r2 = r5
            X.9CY r2 = (X.C9CY) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L7e
            int r3 = r3 - r1
            r2.A00 = r3
        L19:
            java.lang.Object r0 = r2.A02
            X.1JX r1 = X.C1JX.A02
            int r6 = r2.A00
            r4 = 3
            r5 = 2
            r3 = 1
            r13 = 0
            if (r6 == 0) goto L3c
            if (r6 == r3) goto L38
            if (r6 == r5) goto L38
            if (r6 != r4) goto L84
            java.lang.Object r3 = r2.A01
            X.05A r3 = (X.C05A) r3
            X.AbstractC09560e7.A00(r0)
        L32:
            r3.Egh(r0)
        L35:
            X.0eB r1 = X.C0eB.A00
            return r1
        L38:
            X.AbstractC09560e7.A00(r0)
            goto L35
        L3c:
            X.AbstractC09560e7.A00(r0)
            java.lang.Integer r0 = r15.A03
            int r0 = r0.intValue()
            if (r0 == r13) goto L62
            if (r0 != r3) goto L8c
            X.05A r3 = r14.A05
            X.8dX r8 = r15.A02
            r9 = 0
            java.lang.String r10 = r15.A06
            java.lang.String r11 = r15.A07
            r12 = r9
            X.8dY r0 = r7.A04(r8, r9, r10, r11, r12, r13)
            r2.A01 = r3
            r2.A00 = r4
            java.lang.Object r0 = X.AbstractC209010m.A02(r2, r0)
            if (r0 != r1) goto L32
            return r1
        L62:
            X.85z r0 = r14.A04
            if (r0 == 0) goto L77
            java.util.List r0 = r15.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L77
            r2.A00 = r3
            java.lang.Object r0 = A02(r15, r14, r2)
        L74:
            if (r0 != r1) goto L35
            return r1
        L77:
            r2.A00 = r5
            java.lang.Object r0 = A01(r15, r14, r2)
            goto L74
        L7e:
            X.9CY r2 = new X.9CY
            r2.<init>(r14, r5, r4)
            goto L19
        L84:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L8c:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.effectmetadata.EffectTrayService.A05(X.AAD, X.1Ds):java.lang.Object");
    }
}
