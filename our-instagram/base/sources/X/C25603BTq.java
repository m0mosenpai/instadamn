package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {953, 955}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.BTq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25603BTq extends AbstractC105074oN implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ AnonymousClass198 A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25603BTq(InterfaceC23621Ds interfaceC23621Ds, AnonymousClass198 anonymousClass198) {
        super(2, interfaceC23621Ds);
        this.A04 = anonymousClass198;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C25603BTq c25603BTq = new C25603BTq(interfaceC23621Ds, this.A04);
        c25603BTq.A03 = obj;
        return c25603BTq;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0036 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0023 -> B:5:0x0017). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1JX r4 = X.C1JX.A02
            int r0 = r6.A00
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L39
            if (r0 == r2) goto L6f
            java.lang.Object r1 = r6.A02
            X.19J r1 = (X.C19J) r1
            java.lang.Object r2 = r6.A01
            java.lang.Object r3 = r6.A03
            X.4oP r3 = (X.C105094oP) r3
            X.AbstractC09560e7.A00(r7)
        L17:
            X.19J r1 = r1.A03()
        L1b:
            boolean r0 = X.C14360o3.A0K(r1, r2)
            if (r0 != 0) goto L72
            boolean r0 = r1 instanceof X.C19F
            if (r0 == 0) goto L17
            r0 = r1
            X.19F r0 = (X.C19F) r0
            X.198 r0 = r0.A00
            r6.A03 = r3
            r6.A01 = r2
            r6.A02 = r1
            r6.A00 = r5
            X.1JX r0 = r3.A02(r0, r6)
            if (r0 != r4) goto L17
            return r4
        L39:
            X.AbstractC09560e7.A00(r7)
            java.lang.Object r3 = r6.A03
            X.4oP r3 = (X.C105094oP) r3
            X.198 r0 = r6.A04
            java.lang.Object r1 = r0.A0C()
            boolean r0 = r1 instanceof X.C19F
            if (r0 == 0) goto L57
            X.19F r1 = (X.C19F) r1
            X.198 r0 = r1.A00
            r6.A00 = r2
            X.1JX r0 = r3.A02(r0, r6)
            if (r0 != r4) goto L72
            return r4
        L57:
            boolean r0 = r1 instanceof X.C19B
            if (r0 == 0) goto L72
            X.19B r1 = (X.C19B) r1
            X.1Uc r2 = r1.BNj()
            if (r2 == 0) goto L72
            java.lang.Object r1 = r2.A02()
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            X.C14360o3.A0C(r1, r0)
            X.19J r1 = (X.C19J) r1
            goto L1b
        L6f:
            X.AbstractC09560e7.A00(r7)
        L72:
            X.0eB r4 = X.C0eB.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25603BTq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C25603BTq) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
