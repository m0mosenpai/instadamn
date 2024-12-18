package X;

import androidx.compose.foundation.gestures.ScrollingLogic;

/* loaded from: classes8.dex */
public final class MBU extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public long A01;
    public long A02;
    public final int A03 = 1;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBU(ScrollingLogic scrollingLogic, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A04 = scrollingLogic;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            r9 = r14
            int r0 = r14.A03
            X.1JX r6 = X.C1JX.A02
            if (r0 == 0) goto L4a
            int r0 = r14.A00
            r7 = 1
            if (r0 == 0) goto L12
            X.AbstractC09560e7.A00(r15)
        Lf:
            X.0eB r6 = X.C0eB.A00
            return r6
        L12:
            X.AbstractC09560e7.A00(r15)
            java.lang.Object r0 = r14.A04
            X.CfH r0 = (X.C28357CfH) r0
            X.5Y1 r8 = r0.A00
            long r2 = r14.A02
            int r0 = X.AbstractC25225BEi.A06(r2)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            float r0 = X.C25242BFb.A00(r2)
            long r4 = X.AbstractC119395aw.A00(r1, r0)
            r3 = 0
            r1 = 1137180672(0x43c80000, float:400.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            X.5Y4 r2 = new X.5Y4
            r2.<init>(r3, r0, r1)
            long r0 = r14.A01
            X.5at r1 = X.AbstractC25225BEi.A0R(r0)
            X.5at r0 = X.AbstractC25225BEi.A0R(r4)
            r14.A00 = r7
            java.lang.Object r0 = r8.A03(r2, r1, r0, r14)
            if (r0 != r6) goto Lf
            return r6
        L4a:
            int r4 = r14.A00
            r5 = 3
            r7 = 2
            r3 = 1
            if (r4 == 0) goto L6e
            if (r4 == r3) goto L84
            long r2 = r14.A02
            long r0 = r14.A01
            if (r4 == r7) goto La2
            X.AbstractC09560e7.A00(r15)
        L5c:
            X.BFb r15 = (X.C25242BFb) r15
            long r4 = r15.A00
            long r2 = X.C25242BFb.A02(r2, r4)
            long r0 = X.C25242BFb.A02(r0, r2)
            X.BFb r6 = new X.BFb
            r6.<init>(r0)
            return r6
        L6e:
            X.AbstractC09560e7.A00(r15)
            long r0 = r14.A01
            java.lang.Object r2 = r14.A04
            androidx.compose.foundation.gestures.ScrollingLogic r2 = (androidx.compose.foundation.gestures.ScrollingLogic) r2
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r2 = r2.A06
            r14.A01 = r0
            r14.A00 = r3
            java.lang.Object r15 = r2.A01(r14, r0)
            if (r15 != r6) goto L89
            return r6
        L84:
            long r0 = r14.A01
            X.AbstractC09560e7.A00(r15)
        L89:
            X.BFb r15 = (X.C25242BFb) r15
            long r2 = r15.A00
            long r2 = X.C25242BFb.A02(r0, r2)
            java.lang.Object r4 = r14.A04
            androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
            r14.A01 = r0
            r14.A02 = r2
            r14.A00 = r7
            java.lang.Object r15 = r4.A04(r14, r2)
            if (r15 != r6) goto La5
            return r6
        La2:
            X.AbstractC09560e7.A00(r15)
        La5:
            X.BFb r15 = (X.C25242BFb) r15
            long r12 = r15.A00
            java.lang.Object r4 = r14.A04
            androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r8 = r4.A06
            long r10 = X.C25242BFb.A02(r2, r12)
            r14.A01 = r0
            r14.A02 = r12
            r14.A00 = r5
            r2 = r12
            java.lang.Object r15 = r8.A02(r9, r10, r12)
            if (r15 != r6) goto L5c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MBU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A03 != 0) {
            return new MBU((C28357CfH) this.A04, interfaceC23621Ds, this.A02, this.A01);
        }
        MBU mbu = new MBU((ScrollingLogic) this.A04, interfaceC23621Ds);
        mbu.A01 = ((C25242BFb) obj).A00;
        return mbu;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        InterfaceC23621Ds create;
        if (this.A03 != 0) {
            create = AbstractC166987dD.A1M(obj2, obj, this);
        } else {
            create = create(new C25242BFb(((C25242BFb) obj).A00), (InterfaceC23621Ds) obj2);
        }
        return ((MBU) create).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBU(C28357CfH c28357CfH, InterfaceC23621Ds interfaceC23621Ds, long j, long j2) {
        super(2, interfaceC23621Ds);
        this.A04 = c28357CfH;
        this.A02 = j;
        this.A01 = j2;
    }
}
