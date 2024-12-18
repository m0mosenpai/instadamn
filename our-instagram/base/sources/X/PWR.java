package X;

import com.instagram.comments.request.CommentsFetcher;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.request.CommentsFetcher", f = "CommentsFetcher.kt", i = {0, 0, 0, 0, 0, 0}, l = {485}, m = "fetchComments", n = {"this", "fetchType", "callback", "fetchParameters", "isPrefetch", "prefetchCacheExpiryDurationMs"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "J$0"})
/* loaded from: classes9.dex */
public final class PWR extends C1Dq {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public /* synthetic */ Object A06;
    public final /* synthetic */ CommentsFetcher A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWR(CommentsFetcher commentsFetcher, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A07 = commentsFetcher;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A06 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return CommentsFetcher.A00(null, this.A07, null, this, 0L, false, false);
    }
}
