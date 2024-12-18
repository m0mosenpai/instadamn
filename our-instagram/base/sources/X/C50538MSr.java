package X;

import com.instagram.mainfeed.network.flashfeed.FeedCacheRoom;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.mainfeed.network.flashfeed.FeedCacheRoom", f = "FeedCacheRoom.kt", i = {0, 0, 0, 0, 0, 0}, l = {94}, m = "getItems", n = {"this", "filters", "qplInstanceKey", "igQpl", "feedItems", "oldThreadPriority"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
/* renamed from: X.MSr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50538MSr extends C1Dq {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public /* synthetic */ Object A07;
    public final /* synthetic */ FeedCacheRoom A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50538MSr(FeedCacheRoom feedCacheRoom, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A08 = feedCacheRoom;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A07 = obj;
        this.A01 |= Integer.MIN_VALUE;
        return this.A08.A02(null, null, null, null, this, 0, 0L);
    }
}
