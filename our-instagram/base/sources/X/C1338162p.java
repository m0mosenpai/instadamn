package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceSettingQueryResponseImpl;
import java.util.ArrayList;

/* renamed from: X.62p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1338162p implements InterfaceC70433Ec {
    public final C2JM A00 = new C2JM();
    public final C2JM A01 = new C2JM();

    @Override // X.InterfaceC70433Ec
    /* renamed from: build */
    public final /* bridge */ /* synthetic */ C1Dk A00() {
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return new PandoGraphQLRequest(AbstractC40511uK.A00(), "FBToIGDefaultAudienceSettingQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), FBToIGDefaultAudienceSettingQueryResponseImpl.class, false, null, 0, null, "xcxp_get_feed_crossposting_default_audience_status", new ArrayList());
    }
}
