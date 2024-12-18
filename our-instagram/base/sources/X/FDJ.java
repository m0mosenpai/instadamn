package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FDJ {
    public static final void A00(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        Uri.Builder A04 = AbstractC31175DnJ.A04(AnonymousClass001.A0R(S8X.A01, "donate/"));
        A04.appendQueryParameter("fundraiser_campaign_id", str);
        A04.appendQueryParameter(CacheBehaviorLogger.SOURCE, "instagram_story_api");
        AbstractC35190Ffi.A01(context, interfaceC60442pS, userSession, "ig_story", null, A04.build().toString());
    }
}
