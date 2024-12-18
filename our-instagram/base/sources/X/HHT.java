package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;

/* loaded from: classes7.dex */
public final class HHT extends AbstractC61132qb {
    public final UserSession A00;
    public final TaggingFeedMultiSelectState A01;

    public HHT(UserSession userSession, TaggingFeedMultiSelectState taggingFeedMultiSelectState) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = taggingFeedMultiSelectState;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C38329GtO(this.A00, this.A01);
    }
}
