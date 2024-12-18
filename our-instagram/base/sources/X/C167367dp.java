package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {160}, m = "awaitCancellation", n = {}, s = {})
/* renamed from: X.7dp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167367dp extends C1Dq {
    public int A00;
    public /* synthetic */ Object A01;

    public C167367dp(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A01 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return AbstractC89993zf.A03(this);
    }
}
