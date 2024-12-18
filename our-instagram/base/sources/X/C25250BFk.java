package X;

/* renamed from: X.BFk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25250BFk extends AbstractC105074oN implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03 = 0;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25250BFk(InterfaceC31064Dl6 interfaceC31064Dl6, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A04 = interfaceC31064Dl6;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A03 != 0) {
            C25250BFk c25250BFk = new C25250BFk((InterfaceC31064Dl6) this.A04, interfaceC23621Ds);
            c25250BFk.A01 = obj;
            return c25250BFk;
        }
        C25250BFk c25250BFk2 = new C25250BFk(interfaceC23621Ds, (C12W) this.A01, (InterfaceC16620sF) this.A04);
        c25250BFk2.A02 = obj;
        return c25250BFk2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0086, code lost:
    
        if (androidx.compose.foundation.gestures.ForEachGestureKt.A00(r2, r13) == r6) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090 A[Catch: CancellationException -> 0x00b7, TRY_ENTER, TryCatch #0 {CancellationException -> 0x00b7, blocks: (B:43:0x0090, B:47:0x00ae, B:52:0x00a3, B:54:0x00ab), top: B:36:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0047 -> B:8:0x001a). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25250BFk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C25250BFk) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25250BFk(InterfaceC23621Ds interfaceC23621Ds, C12W c12w, InterfaceC16620sF interfaceC16620sF) {
        super(2, interfaceC23621Ds);
        this.A01 = c12w;
        this.A04 = interfaceC16620sF;
    }
}
