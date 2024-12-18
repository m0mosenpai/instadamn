package X;

import com.facebook.commonavatarliveediting.PrefetchQueue;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.commonavatarliveediting.PrefetchQueue", f = "PrefetchQueue.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {351, 103}, m = "processPrefetchList", n = {"this", "cdlProvider", "coroutineScope", "coroutineDispatcher", "prefetchChoiceList", "surfaceType", "trigger", "qplLogger", "$this$withLock_u24default$iv", "tickCacheCount", "this", "cdlProvider", "coroutineScope", "coroutineDispatcher", "tickCacheCount"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"})
/* loaded from: classes9.dex */
public final class PWf extends C1Dq {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public /* synthetic */ Object A0B;
    public final /* synthetic */ PrefetchQueue A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWf(PrefetchQueue prefetchQueue, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A0C = prefetchQueue;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A0B = obj;
        this.A01 |= Integer.MIN_VALUE;
        return this.A0C.A02(null, null, null, null, null, this, null, null, 0);
    }
}
