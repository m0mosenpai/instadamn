package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {}, l = {739}, m = "receiveCatching-JP2dKIU$suspendImpl", n = {}, s = {})
/* loaded from: classes4.dex */
public final class B54 extends C1Dq {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C24721Ip A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B54(InterfaceC23621Ds interfaceC23621Ds, C24721Ip c24721Ip) {
        super(interfaceC23621Ds);
        this.A02 = c24721Ip;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A01 = obj;
        this.A00 |= Integer.MIN_VALUE;
        Object A02 = C24721Ip.A02(this, this.A02);
        if (A02 != C1JX.A02) {
            return new C2QV(A02);
        }
        return A02;
    }
}
