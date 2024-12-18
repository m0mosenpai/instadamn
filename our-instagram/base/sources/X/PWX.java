package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository", f = "IgLiveCommentsRepository.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, l = {597, 603, 621, 632}, m = "postComment", n = {"this", "broadcastId", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, "$this$postComment_u24lambda_u2437", "broadcastPositionMs", "checkOffensive", "this", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, "commentPost", "this", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, "commentPost", "$this$postComment_u24lambda_u2444_u24lambda_u2442", "this", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, "commentPost", "$this$postComment_u24lambda_u2447_u24lambda_u2445"}, s = {"L$0", "L$1", "L$2", "L$4", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$2", "L$4"})
/* loaded from: classes9.dex */
public final class PWX extends C1Dq {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public boolean A07;
    public /* synthetic */ Object A08;
    public final /* synthetic */ IgLiveCommentsRepository A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWX(IgLiveCommentsRepository igLiveCommentsRepository, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A09 = igLiveCommentsRepository;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A08 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A09.A0A(null, null, null, this, 0, 0, 0L, 0L, false, false);
    }
}
