package com.instagram.fanclub.memberlist.viewmodel;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C15370ps;
import X.C32940EeL;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.fanclub.memberlist.viewmodel.CreatorMessagingSelectionScreenViewModel$fetchMemberData$2", f = "CreatorMessagingSelectionScreenViewModel.kt", i = {0, 0, 1}, l = {84, 85, 86, 89}, m = "invokeSuspend", n = {"fetchMembersJob", "fetchMemberCountJob", "fetchMembersJob"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes6.dex */
public final class CreatorMessagingSelectionScreenViewModel$fetchMemberData$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C32940EeL A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ C15370ps A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorMessagingSelectionScreenViewModel$fetchMemberData$2(C32940EeL c32940EeL, String str, InterfaceC23621Ds interfaceC23621Ds, C15370ps c15370ps, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A03 = c32940EeL;
        this.A07 = z;
        this.A06 = z2;
        this.A05 = c15370ps;
        this.A04 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C32940EeL c32940EeL = this.A03;
        boolean z = this.A07;
        boolean z2 = this.A06;
        CreatorMessagingSelectionScreenViewModel$fetchMemberData$2 creatorMessagingSelectionScreenViewModel$fetchMemberData$2 = new CreatorMessagingSelectionScreenViewModel$fetchMemberData$2(c32940EeL, this.A04, interfaceC23621Ds, this.A05, z, z2);
        creatorMessagingSelectionScreenViewModel$fetchMemberData$2.A02 = obj;
        return creatorMessagingSelectionScreenViewModel$fetchMemberData$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009c A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            X.1JX r3 = X.C1JX.A02
            r4 = r17
            int r0 = r4.A00
            r1 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r15 = 0
            if (r0 == 0) goto L20
            if (r0 == r7) goto L6c
            if (r0 == r6) goto L89
            X.AbstractC09560e7.A00(r18)
        L14:
            X.EeL r0 = r4.A03
            X.05A r1 = r0.A00
            X.EeI r0 = X.C32937EeI.A00
            r1.Egh(r0)
            X.0eB r0 = X.C0eB.A00
            return r0
        L20:
            X.AbstractC09560e7.A00(r18)
            java.lang.Object r8 = r4.A02
            X.19L r8 = (X.C19L) r8
            X.EeL r12 = r4.A03
            X.05A r2 = r12.A00
            X.EeJ r0 = X.C32938EeJ.A00
            r2.Egh(r0)
            X.0ps r13 = r4.A05
            java.lang.String r14 = r4.A04
            r16 = 48
            X.MC9 r11 = new X.MC9
            r11.<init>(r12, r13, r14, r15, r16)
            X.191 r10 = X.AnonymousClass191.A00
            X.2Sa r9 = X.AbstractC23641Du.A02(r10, r11, r8)
            boolean r0 = r4.A07
            if (r0 == 0) goto L86
            boolean r0 = r4.A06
            if (r0 != 0) goto L86
            r1 = 10
            X.MBp r0 = new X.MBp
            r0.<init>(r12, r15, r1)
            X.2Sa r2 = X.AbstractC23641Du.A02(r10, r0, r8)
            r1 = 11
            X.MBp r0 = new X.MBp
            r0.<init>(r12, r15, r1)
            X.2Sa r0 = X.AbstractC23641Du.A02(r10, r0, r8)
            r4.A02 = r9
            r4.A01 = r0
            r4.A00 = r7
            java.lang.Object r1 = r2.A0E(r4)
            if (r1 != r3) goto L77
            return r3
        L6c:
            java.lang.Object r0 = r4.A01
            X.2Sb r0 = (X.InterfaceC50122Sb) r0
            java.lang.Object r9 = r4.A02
            X.2Sb r9 = (X.InterfaceC50122Sb) r9
            X.AbstractC09560e7.A00(r18)
        L77:
            r4.A02 = r9
            r4.A01 = r15
            r4.A00 = r6
            X.198 r0 = (X.AnonymousClass198) r0
            java.lang.Object r0 = r0.A0E(r4)
            if (r0 != r3) goto L90
            return r3
        L86:
            r4.A00 = r1
            goto L94
        L89:
            java.lang.Object r9 = r4.A02
            X.2Sb r9 = (X.InterfaceC50122Sb) r9
            X.AbstractC09560e7.A00(r18)
        L90:
            r4.A02 = r15
            r4.A00 = r5
        L94:
            X.198 r9 = (X.AnonymousClass198) r9
            java.lang.Object r0 = r9.A0E(r4)
            if (r0 != r3) goto L14
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.viewmodel.CreatorMessagingSelectionScreenViewModel$fetchMemberData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CreatorMessagingSelectionScreenViewModel$fetchMemberData$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
