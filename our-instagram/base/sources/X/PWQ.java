package X;

import com.instagram.comments.mvvm.data.network.MediaChildCommentNetworkFetcherKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.data.network.MediaChildCommentNetworkFetcherKt", f = "MediaChildCommentNetworkFetcher.kt", i = {0, 0, 0, 0, 0, 0}, l = {61}, m = "suspendAndFetch", n = {"$this$suspendAndFetch", "userSession", "sourceMediaId", "allCommentIds", "isViewerSourceOfMedia", "isLikedByMediaOwnerBadgeEnabled"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
/* loaded from: classes9.dex */
public final class PWQ extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public /* synthetic */ Object A07;

    public PWQ(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A07 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return MediaChildCommentNetworkFetcherKt.A00(null, null, null, null, this, false, false);
    }
}
