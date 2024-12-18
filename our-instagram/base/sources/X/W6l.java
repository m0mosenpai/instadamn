package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.android.maps.model.LatLng;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;
import com.instagram.modal.ModalActivity;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes11.dex */
public abstract class W6l {
    public static void A00(android.net.Uri uri, FragmentActivity fragmentActivity, UserSession userSession, MapEntryPoint mapEntryPoint, String str) {
        String queryParameter;
        String queryParameter2 = uri.getQueryParameter("place_id");
        String queryParameter3 = uri.getQueryParameter("place_name");
        String queryParameter4 = uri.getQueryParameter("boundary_top_left");
        String queryParameter5 = uri.getQueryParameter("boundary_bottom_right");
        Bundle bundle = new Bundle();
        if (queryParameter2 != null) {
            String A0n = AbstractC166997dE.A0n();
            MapEntryPoint mapEntryPoint2 = MapEntryPoint.A06;
            if (queryParameter3 == null) {
                queryParameter3 = "Place";
            }
            A01(null, fragmentActivity, userSession, mapEntryPoint2, VEZ.A05, A0n, queryParameter2, queryParameter3, null, null);
            return;
        }
        if (queryParameter4 != null && queryParameter5 != null) {
            String[] split = queryParameter4.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            String[] split2 = queryParameter5.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            bundle.putParcelable("arg_boundary_top_left_lat_lng", new LatLng(Double.parseDouble(split[0]), Double.parseDouble(split[1])));
            bundle.putParcelable("arg_boundary_bottom_right_lat_lng", new LatLng(Double.parseDouble(split2[0]), Double.parseDouble(split2[1])));
        }
        String queryParameter6 = uri.getQueryParameter("query");
        String queryParameter7 = uri.getQueryParameter("query_id");
        if (queryParameter6 != null && queryParameter7 != null) {
            try {
                VEZ valueOf = VEZ.valueOf(queryParameter6.toUpperCase(Locale.US));
                if (uri.getQueryParameter("label") == null) {
                    queryParameter = valueOf.name();
                } else {
                    queryParameter = uri.getQueryParameter("label");
                }
                VEZ vez = VEZ.A06;
                boolean equals = queryParameter7.equals("17843767138059124");
                if (valueOf == vez ? !equals : equals) {
                    C0w9.A03("LaunchMapActionHandler:InvalidQueryTypeIdMismatch", "");
                } else {
                    A01(bundle, fragmentActivity, userSession, mapEntryPoint, valueOf, str, queryParameter7, queryParameter, null, null);
                    return;
                }
            } catch (IllegalArgumentException e) {
                C0w9.A07("LaunchMapActionHandler:InvalidQueryType", e);
                A02(bundle, fragmentActivity, userSession, mapEntryPoint, str);
                return;
            }
        }
        A02(bundle, fragmentActivity, userSession, mapEntryPoint, str);
    }

    public static void A01(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, MapEntryPoint mapEntryPoint, VEZ vez, String str, String str2, String str3, ArrayList arrayList, double[] dArr) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("arg_session_id", str);
        bundle2.putString("arg_hashtag_id", str2);
        bundle2.putString("arg_hashtag_name", str3);
        bundle2.putInt("arg_query_type", vez.ordinal());
        if (dArr != null) {
            bundle2.putParcelable("arg_starting_lat_lng", new LatLng(dArr[0], dArr[1]));
        }
        if (arrayList != null) {
            bundle2.putParcelableArrayList("arg_map_pins", arrayList);
        }
        bundle2.putParcelable(AbstractC43591JPw.A00(126), mapEntryPoint);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        C6XJ c6xj = new C6XJ(fragmentActivity, bundle2, userSession, ModalActivity.class, "discovery_map");
        c6xj.A08();
        c6xj.A09(0);
        c6xj.A0I = true;
        c6xj.A0C(fragmentActivity);
    }

    public static void A02(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, MapEntryPoint mapEntryPoint, String str) {
        A01(bundle, fragmentActivity, userSession, mapEntryPoint, VEZ.A06, str, "17843767138059124", "popular", null, null);
    }
}
