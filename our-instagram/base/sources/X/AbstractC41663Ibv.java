package X;

import android.os.Bundle;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ibv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41663Ibv {
    public static final LinkedHashMap A01(Bundle bundle, HashMap hashMap, String[] strArr) {
        Object A0R;
        List A1Q = AbstractC16960so.A1Q("analytics_referral_component", "analytics_referral_experience", "analytics_referral_module", "analytics_referral_page", "is_rendered_in_wishlist");
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC16850sd.A0L(hashMap.size()));
        Iterator A14 = AbstractC166997dE.A14(hashMap);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            if (A1Q.contains(A1K.getKey())) {
                A0R = A1K.getKey();
            } else {
                A0R = AnonymousClass001.A0R("prop_", AbstractC31172DnG.A17(A1K));
            }
            A18.put(A0R, A1K.getValue());
        }
        builder.putAll(A18);
        ImmutableMap buildOrThrow = builder.buildOrThrow();
        C14360o3.A0A(buildOrThrow);
        A1I.putAll(buildOrThrow);
        String str = strArr[0];
        if (bundle.containsKey(str)) {
            Object obj = bundle.get(str);
            if (obj == null) {
                obj = "";
            }
            A1I.put(str, obj);
        }
        return A1I;
    }

    public static final void A02(HashMap hashMap) {
        if (!hashMap.containsKey("shopping_session_id")) {
            hashMap.put("shopping_session_id", AbstractC61112qZ.A00(null));
        }
        if (!hashMap.containsKey("checkout_session_id")) {
            hashMap.put("checkout_session_id", AbstractC58442PvL.A02());
        }
    }

    public static final HashMap A00(Bundle bundle, String[] strArr) {
        java.util.Set<String> keySet = bundle.keySet();
        ArrayList A10 = AbstractC31174DnI.A10(keySet);
        for (String str : keySet) {
            String str2 = str;
            if (bundle.get(str2) != null && !AbstractC009903n.A0O(str2, strArr)) {
                A10.add(str);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A10);
        Iterator it = A10.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            AbstractC166997dE.A1R(A1B, String.valueOf(bundle.get(A1B)), A0q);
        }
        HashMap A1G = AbstractC166987dD.A1G();
        AbstractC06930Yk.A0F(A0q, A1G);
        return A1G;
    }
}
