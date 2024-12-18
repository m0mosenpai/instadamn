package com.facebook.avatar.expresso.odr;

import X.AbstractC23611Dp;
import X.C0eB;
import X.C19L;
import X.C51462Mo9;
import X.C51463MoA;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.avatar.expresso.odr.ODRController$initODRCDLHandlerOrODRAvatarHandler$callback$1", f = "ODRController.kt", i = {}, l = {353, 357, 362}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class ODRController$initODRCDLHandlerOrODRAvatarHandler$callback$1 extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ ODRController A03;
    public final /* synthetic */ C51462Mo9 A04;
    public final /* synthetic */ C51463MoA A05;
    public final /* synthetic */ C19L A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ODRController$initODRCDLHandlerOrODRAvatarHandler$callback$1(ODRController oDRController, C51462Mo9 c51462Mo9, C51463MoA c51463MoA, InterfaceC23621Ds interfaceC23621Ds, C19L c19l) {
        super(3, interfaceC23621Ds);
        this.A06 = c19l;
        this.A03 = oDRController;
        this.A05 = c51463MoA;
        this.A04 = c51462Mo9;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C19L c19l = this.A06;
        ODRController oDRController = this.A03;
        C51463MoA c51463MoA = this.A05;
        ODRController$initODRCDLHandlerOrODRAvatarHandler$callback$1 oDRController$initODRCDLHandlerOrODRAvatarHandler$callback$1 = new ODRController$initODRCDLHandlerOrODRAvatarHandler$callback$1(oDRController, this.A04, c51463MoA, (InterfaceC23621Ds) obj3, c19l);
        oDRController$initODRCDLHandlerOrODRAvatarHandler$callback$1.A01 = obj;
        oDRController$initODRCDLHandlerOrODRAvatarHandler$callback$1.A02 = obj2;
        return oDRController$initODRCDLHandlerOrODRAvatarHandler$callback$1.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            r28 = this;
            X.1JX r9 = X.C1JX.A02
            r10 = r28
            int r0 = r10.A00
            r3 = 3
            r2 = 2
            r8 = 1
            r7 = 0
            if (r0 == 0) goto L2a
            if (r0 == r8) goto Lc4
            if (r0 != r2) goto Lc4
            X.AbstractC09560e7.A00(r29)
        L13:
            com.facebook.avatar.expresso.odr.ODRController r1 = r10.A03
            X.Pnz r0 = r1.A00
            if (r0 == 0) goto L1c
            r0.onDestroy()
        L1c:
            X.Od2 r0 = r1.A03
            if (r0 != 0) goto Lc8
            java.lang.String r0 = "ig4aAvatarRichMediaViewerProvider"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L2a:
            X.AbstractC09560e7.A00(r29)
            java.lang.Object r12 = r10.A01
            X.NkA r12 = (X.AbstractC53421NkA) r12
            java.lang.Object r6 = r10.A02
            X.Mo2 r6 = (X.C51456Mo2) r6
            boolean r0 = r12 instanceof X.C51453Mnz
            if (r0 == 0) goto Laa
            r2 = r12
            X.Mnz r2 = (X.C51453Mnz) r2
            java.io.File r0 = r2.A00
            r0.getCanonicalPath()
            X.19L r1 = r10.A06
            com.facebook.avatar.expresso.odr.ODRController r13 = r10.A03
            X.MoA r14 = r10.A05
            X.Mo9 r0 = r10.A04
            r5 = 8
            X.JTH r11 = new X.JTH
            r15 = r6
            r16 = r0
            r17 = r7
            r18 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            X.AbstractC166987dD.A1Z(r11, r1)
            X.0Ui r14 = r13.A0F
            java.io.File r0 = r2.A00
            java.lang.String r16 = X.MSX.A0i(r0)
            java.lang.String r13 = r6.A0A
            int r0 = r6.A01
            r17 = r0
            int r15 = r6.A02
            int r12 = r6.A03
            int r11 = r6.A00
            java.lang.String r4 = r6.A0B
            java.lang.String r3 = r6.A05
            java.lang.String r2 = r6.A08
            java.lang.String r1 = r6.A06
            java.lang.String r0 = r6.A04
            java.lang.String r6 = r6.A07
            X.C14360o3.A0B(r13, r8)
            X.AbstractC167017dG.A1U(r4, r3)
            X.AbstractC25234BEr.A0l(r5, r2, r1, r0, r6)
            X.Mo2 r5 = new X.Mo2
            r25 = r15
            r26 = r12
            r27 = r11
            r21 = r1
            r22 = r0
            r23 = r6
            r24 = r17
            r18 = r4
            r19 = r3
            r20 = r2
            r15 = r5
            r17 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r10.A01 = r7
            r10.A00 = r8
            java.lang.Object r0 = r14.emit(r5, r10)
        La7:
            if (r0 != r9) goto Lcb
            return r9
        Laa:
            boolean r1 = r12 instanceof X.C51454Mo0
            com.facebook.avatar.expresso.odr.ODRController r0 = r10.A03
            X.0Ui r0 = r0.A0F
            r10.A01 = r7
            if (r1 == 0) goto Lbd
            r10.A00 = r2
            java.lang.Object r0 = r0.emit(r12, r10)
            if (r0 != r9) goto L13
            return r9
        Lbd:
            r10.A00 = r3
            java.lang.Object r0 = r0.emit(r12, r10)
            goto La7
        Lc4:
            X.AbstractC09560e7.A00(r29)
            goto Lcb
        Lc8:
            r0.A04()
        Lcb:
            X.0eB r9 = X.C0eB.A00
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController$initODRCDLHandlerOrODRAvatarHandler$callback$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
