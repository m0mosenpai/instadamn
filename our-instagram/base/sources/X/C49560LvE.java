package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;

/* renamed from: X.LvE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49560LvE implements GYB {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final Context A02;

    public C49560LvE(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(abstractC59962oe, 1);
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        this.A02 = abstractC59962oe.requireContext();
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        UserSession userSession = this.A01;
        TitleIcon titleIcon = new TitleIcon(null, R.drawable.reels_content_studio_ig_reels_pride_icon);
        Context context = this.A02;
        String string = context.getString(2131956034);
        IconConfig.IconWithTextConfig iconWithTextConfig = new IconConfig.IconWithTextConfig(R.drawable.instagram_circle_outline_44, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        String A0p = AbstractC166997dE.A0p(context, 2131956038);
        Integer valueOf = Integer.valueOf(R.color.igds_primary_text);
        C47947LGc c47947LGc = new C47947LGc(userSession, new PrimerBottomSheetConfig(titleIcon, null, null, null, null, null, null, null, "ClipsCameraWithTrendNuxActionHandler", AbstractC166997dE.A0p(context, 2131956042), AbstractC166997dE.A0p(context, 2131960994), null, AbstractC16960so.A1Q(new InfoItem(iconWithTextConfig, valueOf, A0p, string), new InfoItem(new IconConfig.IconWithTextConfig(R.drawable.instagram_circle_outline_44, "2"), valueOf, AbstractC166997dE.A0p(context, 2131956039), context.getString(2131956035)), new InfoItem(new IconConfig.IconWithTextConfig(R.drawable.instagram_circle_outline_44, "3"), valueOf, AbstractC166997dE.A0p(context, 2131956040), context.getString(2131956036)), new InfoItem(new IconConfig.IconWithTextConfig(R.drawable.instagram_circle_outline_44, "4"), valueOf, AbstractC166997dE.A0p(context, 2131956041), context.getString(2131956037))), 2131956043, false, false, false), null, true, true, false);
        c47947LGc.A00 = new ViewOnClickListenerC42029Ijy(22, c47947LGc, uri, this);
        c47947LGc.A01 = new ViewOnClickListenerC48073LPy(c47947LGc, 25);
        c47947LGc.A02(context);
    }
}
