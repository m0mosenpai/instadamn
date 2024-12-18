package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {174, 176, 178, 179, 181}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
/* renamed from: X.0Ue, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06140Ue extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public /* synthetic */ int A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C15020pI A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06140Ue(InterfaceC23621Ds interfaceC23621Ds, C15020pI c15020pI) {
        super(3, interfaceC23621Ds);
        this.A03 = c15020pI;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        C06140Ue c06140Ue = new C06140Ue((InterfaceC23621Ds) obj3, this.A03);
        c06140Ue.A02 = obj;
        c06140Ue.A01 = intValue;
        return c06140Ue.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1JX r3 = X.C1JX.A02
            int r0 = r9.A00
            r4 = 5
            r7 = 4
            r8 = 3
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L28
            if (r0 == r5) goto L72
            if (r0 == r6) goto L47
            if (r0 == r8) goto L5b
            if (r0 != r7) goto L72
            java.lang.Object r2 = r9.A02
            X.0yQ r2 = (X.InterfaceC19960yQ) r2
            X.AbstractC09560e7.A00(r10)
        L1a:
            X.10L r1 = X.C10L.A04
            r0 = 0
            r9.A02 = r0
            r9.A00 = r4
        L21:
            java.lang.Object r0 = r2.emit(r1, r9)
            if (r0 != r3) goto L75
            return r3
        L28:
            X.AbstractC09560e7.A00(r10)
            java.lang.Object r2 = r9.A02
            X.0yQ r2 = (X.InterfaceC19960yQ) r2
            int r0 = r9.A01
            if (r0 <= 0) goto L38
            X.10L r1 = X.C10L.A02
            r9.A00 = r5
            goto L21
        L38:
            X.0pI r0 = r9.A03
            long r0 = r0.A00
            r9.A02 = r2
            r9.A00 = r6
            java.lang.Object r0 = X.AbstractC89993zf.A01(r9, r0)
            if (r0 != r3) goto L4e
            return r3
        L47:
            java.lang.Object r2 = r9.A02
            X.0yQ r2 = (X.InterfaceC19960yQ) r2
            X.AbstractC09560e7.A00(r10)
        L4e:
            X.10L r0 = X.C10L.A03
            r9.A02 = r2
            r9.A00 = r8
            java.lang.Object r0 = r2.emit(r0, r9)
            if (r0 != r3) goto L62
            return r3
        L5b:
            java.lang.Object r2 = r9.A02
            X.0yQ r2 = (X.InterfaceC19960yQ) r2
            X.AbstractC09560e7.A00(r10)
        L62:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9.A02 = r2
            r9.A00 = r7
            java.lang.Object r0 = X.AbstractC89993zf.A01(r9, r0)
            if (r0 != r3) goto L1a
            return r3
        L72:
            X.AbstractC09560e7.A00(r10)
        L75:
            X.0eB r3 = X.C0eB.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06140Ue.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
