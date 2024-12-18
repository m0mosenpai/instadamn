package X;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes11.dex */
public final class W3R {
    public static final WTT A00(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("key_screen_container_props_bundle");
        if (bundle2 == null) {
            return null;
        }
        boolean z = bundle2.getBoolean("key_from_config_change");
        Integer A0X = AbstractC31179DnN.A0X(bundle2, "key_content_parse_result");
        C1338462s c1338462s = (C1338462s) AbstractC66261U6f.A01(C1338462s.class, A0X);
        if (c1338462s != null) {
            Integer A0X2 = AbstractC31179DnN.A0X(bundle2, "key_tree_params");
            Map map = (Map) AbstractC66261U6f.A01(Map.class, A0X2);
            if (map != null) {
                String string = bundle2.getString("key_analytics_module");
                Integer A0X3 = AbstractC31179DnN.A0X(bundle2, "key_analytics_extras");
                Map map2 = (Map) AbstractC66261U6f.A01(Map.class, A0X3);
                boolean z2 = bundle2.getBoolean("key_animate_on_navigation");
                Integer A0X4 = AbstractC31179DnN.A0X(bundle2, "key_container_config");
                return new WTT((InterfaceC65469Tkm) AbstractC66261U6f.A01(InterfaceC65469Tkm.class, A0X4), c1338462s, Boolean.valueOf(z2), string, AbstractC16960so.A1Q(A0X, A0X2, A0X3, A0X4), map, map2, true, z);
            }
            throw new IllegalStateException("Must have non-null tree params");
        }
        throw new IllegalStateException("Must have a non-null content ParseResult");
    }

    public final WTT A01(Bundle bundle) {
        try {
            WTT A00 = A00(bundle);
            if (A00 != null) {
                return A00;
            }
            throw new IllegalStateException("args Bundle must contain ScreenContainerProps");
        } catch (RuntimeException e) {
            throw new Exception(e);
        }
    }
}
