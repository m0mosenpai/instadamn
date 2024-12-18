package com.instagram.mainfeed.network;

import X.AbstractC23611Dp;
import X.C0eB;
import X.C1X7;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.mainfeed.network.FeedCacheCoordinator$loadInitialFeedCache$2", f = "FeedCacheCoordinator.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4}, l = {334, 353, 395, 417, 434}, m = "invokeSuspend", n = {"igQpl", "initialFeedCacheResponse", "coldStartFlashFeedItems", "dedupSet", "instanceKey", "igQpl", "initialFeedCacheResponse", "coldStartFlashFeedItems", "instanceKey", "igQpl", "initialFeedCacheResponse", "coldStartFlashFeedItems", "dedupSet", "instanceKey", "igQpl", "initialFeedCacheResponse", "coldStartFlashFeedItems", "instanceKey", "igQpl", "isInitialFlashFeedDelivered", "instanceKey"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes2.dex */
public final class FeedCacheCoordinator$loadInitialFeedCache$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final /* synthetic */ C1X7 A06;
    public final /* synthetic */ FeedCacheCoordinator A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedCacheCoordinator$loadInitialFeedCache$2(C1X7 c1x7, FeedCacheCoordinator feedCacheCoordinator, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A07 = feedCacheCoordinator;
        this.A06 = c1x7;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new FeedCacheCoordinator$loadInitialFeedCache$2(this.A06, this.A07, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FeedCacheCoordinator$loadInitialFeedCache$2) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r6 == null) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x036f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03b3  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [X.0oO] */
    /* JADX WARN: Type inference failed for: r5v18, types: [X.0oO] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 1190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.network.FeedCacheCoordinator$loadInitialFeedCache$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
