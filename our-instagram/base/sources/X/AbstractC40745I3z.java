package X;

import com.instagram.api.schemas.RankingInfo;

/* renamed from: X.I3z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40745I3z {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.Gwy] */
    public static final C38537Gwy A00(RankingInfo rankingInfo) {
        ?? c0Zx = new C0Zx();
        c0Zx.A06("recommender_type", rankingInfo.A00);
        c0Zx.A06("request_uuid", rankingInfo.A01);
        c0Zx.A05("wpr_request_id", AbstractC25233BEq.A0n(rankingInfo.A02));
        return c0Zx;
    }
}
