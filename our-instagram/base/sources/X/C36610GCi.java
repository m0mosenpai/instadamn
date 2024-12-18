package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import java.util.List;

/* renamed from: X.GCi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36610GCi implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        String str;
        ProductType productType;
        FragmentActivity fragmentActivity;
        UserSession userSession;
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("media_id");
        String queryParameter2 = uri.getQueryParameter("product_type");
        String queryParameter3 = uri.getQueryParameter("achievement_id");
        String A12 = AbstractC31172DnG.A12(uri);
        if (queryParameter != null && queryParameter2 != null && queryParameter3 != null) {
            if (!queryParameter2.equals(ProductType.FEED.A00) && !queryParameter2.equals(ProductType.FEED_CAROUSEL.A00)) {
                if (queryParameter2.equals(ProductType.CLIPS.A00)) {
                    fragmentActivity = this.A00;
                    if (!fragmentActivity.getSupportFragmentManager().A11()) {
                        C35227FgK c35227FgK = C35227FgK.A00;
                        userSession = this.A01;
                        c35227FgK.A03(fragmentActivity, userSession, queryParameter);
                    } else {
                        str = "Cannot launch Reels viewer";
                    }
                } else if (queryParameter2.equals(ProductType.STORY.A00)) {
                    String queryParameter4 = uri.getQueryParameter(MSV.A00(270));
                    if (queryParameter4 == null) {
                        str = "Deeplink missing: story_reel_id";
                    } else {
                        C35227FgK.A00.A04(this.A00, this.A01, queryParameter4, queryParameter, A12, AbstractC166987dD.A1J(queryParameter3));
                        return;
                    }
                } else {
                    str = AnonymousClass001.A0R("product_type not recognized: ", queryParameter2);
                }
            } else {
                fragmentActivity = this.A00;
                userSession = this.A01;
                C35227FgK.A02(fragmentActivity, userSession, queryParameter);
            }
            F1A.A00().A04(fragmentActivity, userSession, queryParameter, A12, AbstractC166987dD.A1J(queryParameter3));
            return;
        }
        str = "Deeplink missing:";
        if (queryParameter == null) {
            str = AnonymousClass001.A0R("Deeplink missing:", " media_id");
        }
        if (queryParameter2 == null) {
            str = AnonymousClass001.A0R(str, " product_type");
        }
        if (queryParameter3 == null) {
            str = AnonymousClass001.A0R(str, " achievement_id");
        }
        List list = null;
        if (queryParameter2 != null) {
            productType = (ProductType) ProductType.A01.get(queryParameter2);
        } else {
            productType = null;
        }
        if (queryParameter3 != null) {
            list = AbstractC166987dD.A1J(queryParameter3);
        }
        C28458ChA.A00.A03(this.A01, productType, "activity_feed", "url_handler_input_validation", A12, queryParameter, str, list, null, null, null, null);
        C9GR.A0B(this.A00.getApplicationContext(), "something_went_wrong");
    }

    public C36610GCi(FragmentActivity fragmentActivity, UserSession userSession) {
        AbstractC167017dG.A1P(fragmentActivity, userSession);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
