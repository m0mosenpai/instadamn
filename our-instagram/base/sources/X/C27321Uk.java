package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {0, 0, 0, 0}, l = {3064}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", n = {"this", "segment", "index", "r"}, s = {"L$0", "L$1", "I$0", "J$0"})
/* renamed from: X.1Uk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27321Uk extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ C24721Ip A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27321Uk(InterfaceC23621Ds interfaceC23621Ds, C24721Ip c24721Ip) {
        super(interfaceC23621Ds);
        this.A04 = c24721Ip;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A03 = obj;
        this.A00 |= Integer.MIN_VALUE;
        Object A03 = C24721Ip.A03(this, this.A04, null, 0, 0L);
        if (A03 != C1JX.A02) {
            return new C2QV(A03);
        }
        return A03;
    }
}
