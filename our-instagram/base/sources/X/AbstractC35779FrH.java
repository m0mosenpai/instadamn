package X;

import com.facebook.common.callercontext.CallerContextable;
import java.util.HashMap;

/* renamed from: X.FrH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35779FrH implements CallerContextable {
    public static final String __redex_internal_original_name = "BusinessAnalyticsUtil";

    public static final HashMap A00(boolean z, boolean z2, boolean z3) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("should_show_public_contacts", String.valueOf(z));
        A1G.put("should_show_category", String.valueOf(z2));
        A1G.put("should_show_discount", String.valueOf(z3));
        return A1G;
    }
}
