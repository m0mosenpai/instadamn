package X;

import com.instagram.mainfeed.network.flashfeed.FlashFeedCache;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.mainfeed.network.flashfeed.FlashFeedCache", f = "FlashFeedCache.kt", i = {0, 0, 0, 1}, l = {422, 294}, m = "saveItems", n = {"this", "$this$withLock_u24default$iv", "clearOrderedFeedCache", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "Z$0", "L$0"})
/* renamed from: X.MXu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50654MXu extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ FlashFeedCache A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50654MXu(FlashFeedCache flashFeedCache, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A05 = flashFeedCache;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A04 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A05.A07(this, false);
    }
}
