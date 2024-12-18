package X;

import com.instagram.api.schemas.ClipsTrimmingStrategy;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.IKy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41185IKy {
    public final UserSession A00;

    public C41185IKy(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final Object A00(ClipsTrimmingStrategy clipsTrimmingStrategy, MusicCanonicalType musicCanonicalType, String str, List list, InterfaceC23621Ds interfaceC23621Ds, int i) {
        C25621Ms A0q = AbstractC25228BEl.A0q(this.A00);
        C14360o3.A0B(musicCanonicalType, 2);
        A0q.A05();
        A0q.A03();
        A0q.A0B("api/v1/clips/clips_auto_editing/");
        A0q.A0R(H9N.class, IOI.class);
        if (list != null) {
            A0q.A9s("clip_segments", list.toString());
        }
        A0q.A0D("targeting_duration", i);
        A0q.A9s("audio_cluster_id", str);
        A0q.A9s("audio_type", musicCanonicalType.A00);
        C1ON A0T = AbstractC31172DnG.A0T(A0q, "trimming_strategy", clipsTrimmingStrategy.A00);
        C14360o3.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetVideoTrimmingResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetVideoTrimmingResponse>>");
        return A0T.A00(724611380, interfaceC23621Ds);
    }
}
