package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.IdM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41693IdM {
    public static final List A09 = Arrays.asList("shopping_camera", "shopping_story");
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final JI6 A04;
    public final String A05;
    public final String A06;
    public final Activity A07;
    public final UserSession A08;

    public static void A00(C41693IdM c41693IdM, String str) {
        JI6 ji6 = c41693IdM.A04;
        C38321qM Byj = ji6.Byj();
        Product product = ji6.C02().A08;
        product.getClass();
        if (!c41693IdM.A03 && C1VN.A00 != null) {
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("product_id", product.A0H);
            A1G.put("merchant_id", AbstractC37300Gc1.A0T(product));
            boolean z = c41693IdM.A00;
            String str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            Object obj = "0";
            if (z) {
                obj = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A1G.put("checkout_clicked", obj);
            if (!c41693IdM.A01) {
                str2 = "0";
            }
            A1G.put("checkout_completed", str2);
            A1G.put("prior_module", c41693IdM.A06);
            A1G.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c41693IdM.A05);
            if (Byj != null) {
                A1G.put("media_id", Byj.A38());
                User A2E = Byj.A2E(c41693IdM.A08);
                if (A2E != null) {
                    A1G.put("media_owner_id", A2E.getId());
                }
            }
            C1VN c1vn = C1VN.A00;
            c1vn.getClass();
            c1vn.A00(c41693IdM.A07, c41693IdM.A08, str, A1G);
            c41693IdM.A03 = true;
        }
    }

    public C41693IdM(Activity activity, UserSession userSession, JI6 ji6, String str, String str2) {
        this.A07 = activity;
        this.A08 = userSession;
        this.A04 = ji6;
        this.A06 = str;
        this.A05 = str2;
    }
}
