package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.F4n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34137F4n {
    public static final void A00(Context context, String str, String str2, String str3) {
        C14360o3.A0B(context, 0);
        AbstractC25233BEq.A0v(1, str, str2, str3);
        Intent flags = new Intent("android.intent.action.VIEW", AbstractC31174DnI.A0B(AbstractC31175DnJ.A04("https://www.instagram.com/_n/business_order?").appendQueryParameter("order_id", str3).appendQueryParameter("merchant_id", str).appendQueryParameter("consumer_id", str2), "entrypoint", "ORDER_LIST_CLICK")).putExtra("com.instagram.url.extra.SHOULD_RETURN_TO_SENDING_ACTIVITY", true).setFlags(Constants.LOAD_RESULT_PGO_ATTEMPTED);
        C14360o3.A07(flags);
        flags.setPackage(context.getPackageName());
        C12260kU.A0D(context, flags);
    }
}
