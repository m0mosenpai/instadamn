package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.keyword.KeywordRepository;

/* renamed from: X.Bvw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27017Bvw extends AbstractC61132qb {
    public final Bundle A00;
    public final UserSession A01;

    public C27017Bvw(Bundle bundle, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = bundle;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        String string;
        Bundle bundle = this.A00;
        if (bundle != null && (string = bundle.getString("creator_ai_creator_igid")) != null) {
            String string2 = bundle.getString("creator_ai_creator_fbid");
            if (string2 != null) {
                String string3 = bundle.getString("creator_ai_link_keyword");
                if (string3 == null) {
                    string3 = "";
                }
                String string4 = bundle.getString("creator_ai_link_keyword_link");
                if (string4 == null) {
                    string4 = "";
                }
                String string5 = bundle.getString("creator_ai_link_keyword_id");
                if (string5 == null) {
                    string5 = "";
                }
                String string6 = bundle.getString("creator_ai_link_keyword_description");
                if (string6 == null) {
                    string6 = "";
                }
                return new C26907BuA(new KeywordRepository(AbstractC40691uc.A01(this.A01), string, string2), Long.valueOf(bundle.getLong("creator_ai_link_keyword_expiration_timestamp")), string5, string3, bundle.getString("creator_ai_entry_point_extra"), string4, string6);
            }
            throw AbstractC166987dD.A14("expected nonnull creator fbid");
        }
        throw AbstractC166987dD.A14("expected nonnull creator igid");
    }
}
