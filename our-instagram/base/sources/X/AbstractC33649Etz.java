package X;

import android.app.Activity;
import android.net.Uri;

/* renamed from: X.Etz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33649Etz {
    public static final void A00(Activity activity, String str) {
        AbstractC31180DnO.A0z(activity, AbstractC31172DnG.A0l().A03(activity, 67108864), new Uri.Builder().scheme("instagram").authority("direct-inbox").appendQueryParameter("filter_type", "all").appendQueryParameter("DIRECT_SOURCE_MODULE_NAME", str));
    }
}
