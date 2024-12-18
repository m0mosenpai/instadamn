package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "libraries.zero.headers.ZeroHeadersManager", f = "ZeroHeadersManager.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5}, l = {47, 176, 71, 78, 84, 86}, m = "runHeadersFlowImpl", n = {"this", "flowId", "this", "flowId", "pingUri", "headwindProgram", "usage", "headwindStorageId", "storageId", "$this$withLock_u24default$iv", "isOptedOut", "timestampNow", "flowId", "usage", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0", "J$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes9.dex */
public final class PWg extends C1Dq {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public boolean A0A;
    public /* synthetic */ Object A0B;
    public final /* synthetic */ C55171Oda A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWg(InterfaceC23621Ds interfaceC23621Ds, C55171Oda c55171Oda) {
        super(interfaceC23621Ds);
        this.A0C = c55171Oda;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A0B = obj;
        this.A00 |= Integer.MIN_VALUE;
        return C55171Oda.A03(null, null, this, this.A0C);
    }
}
