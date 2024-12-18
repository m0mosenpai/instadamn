package androidx.compose.foundation;

import X.AbstractC114345Dz;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C5XO;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC58269PsN;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", i = {0, 1, 2}, l = {1139, 1141, 1148, 1149, 1158}, m = "invokeSuspend", n = {"delayJob", "success", "release"}, s = {"L$0", "Z$0", "L$0"})
/* loaded from: classes5.dex */
public final class AbstractClickableNode$handlePressInteraction$2$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public boolean A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ AbstractC114345Dz A04;
    public final /* synthetic */ InterfaceC58269PsN A05;
    public final /* synthetic */ C5XO A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1(AbstractC114345Dz abstractC114345Dz, InterfaceC58269PsN interfaceC58269PsN, C5XO c5xo, InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(2, interfaceC23621Ds);
        this.A05 = interfaceC58269PsN;
        this.A03 = j;
        this.A06 = c5xo;
        this.A04 = abstractC114345Dz;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC58269PsN interfaceC58269PsN = this.A05;
        long j = this.A03;
        AbstractClickableNode$handlePressInteraction$2$1 abstractClickableNode$handlePressInteraction$2$1 = new AbstractClickableNode$handlePressInteraction$2$1(this.A04, interfaceC58269PsN, this.A06, interfaceC23621Ds, j);
        abstractClickableNode$handlePressInteraction$2$1.A02 = obj;
        return abstractClickableNode$handlePressInteraction$2$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.Dg2, java.lang.Object, X.CmS] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r9 = r16
            X.1JX r3 = X.C1JX.A02
            int r0 = r15.A00
            r5 = 5
            r2 = 4
            r6 = 3
            r1 = 2
            r7 = 1
            r13 = 0
            if (r0 == 0) goto L1e
            if (r0 == r7) goto L42
            if (r0 == r1) goto L63
            if (r0 == r6) goto L81
            X.AbstractC09560e7.A00(r9)
        L17:
            X.5Dz r0 = r15.A04
            r0.A04 = r13
            X.0eB r3 = X.C0eB.A00
            return r3
        L1e:
            X.AbstractC09560e7.A00(r9)
            java.lang.Object r0 = r15.A02
            X.19L r0 = (X.C19L) r0
            X.5Dz r9 = r15.A04
            long r11 = r15.A03
            X.5XO r10 = r15.A06
            r14 = 0
            X.BSy r8 = new X.BSy
            r8.<init>(r9, r10, r11, r13, r14)
            X.1Dx r8 = X.AbstractC25226BEj.A1L(r8, r0)
            X.PsN r0 = r15.A05
            r15.A02 = r8
            r15.A00 = r7
            java.lang.Object r9 = r0.F8j(r15)
            if (r9 != r3) goto L49
            return r3
        L42:
            java.lang.Object r8 = r15.A02
            X.195 r8 = (X.AnonymousClass195) r8
            X.AbstractC09560e7.A00(r9)
        L49:
            boolean r7 = X.AbstractC166987dD.A1a(r9)
            boolean r0 = r8.isActive()
            if (r0 == 0) goto L95
            r15.A02 = r13
            r15.A01 = r7
            r15.A00 = r1
            r8.AGH(r13)
            java.lang.Object r0 = r8.CgU(r15)
            if (r0 != r3) goto L68
            return r3
        L63:
            boolean r7 = r15.A01
            X.AbstractC09560e7.A00(r9)
        L68:
            if (r7 == 0) goto L17
            X.CmS r1 = new X.CmS
            r1.<init>()
            X.BSv r5 = new X.BSv
            r5.<init>(r1)
            X.5XO r0 = r15.A06
            r15.A02 = r5
            r15.A00 = r6
            java.lang.Object r0 = r0.ARN(r1, r15)
            if (r0 != r3) goto L88
            return r3
        L81:
            java.lang.Object r5 = r15.A02
            X.BSv r5 = (X.C25582BSv) r5
            X.AbstractC09560e7.A00(r9)
        L88:
            X.5XO r0 = r15.A06
            r15.A02 = r13
            r15.A00 = r2
            java.lang.Object r0 = r0.ARN(r5, r15)
            if (r0 != r3) goto L17
            return r3
        L95:
            X.5Dz r0 = r15.A04
            X.CmS r2 = r0.A04
            if (r2 == 0) goto L17
            X.5XO r1 = r15.A06
            if (r7 == 0) goto Laf
            X.BSv r0 = new X.BSv
            r0.<init>(r2)
        La4:
            r15.A02 = r13
            r15.A00 = r5
            java.lang.Object r0 = r1.ARN(r0, r15)
            if (r0 != r3) goto L17
            return r3
        Laf:
            X.CmV r0 = new X.CmV
            r0.<init>(r2)
            goto La4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$handlePressInteraction$2$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
