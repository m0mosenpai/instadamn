package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.LruCache;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.FfX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35180FfX {
    public static Intent A00(Context context, Integer num, String str) {
        android.net.Uri parse;
        Uri.Builder buildUpon;
        String str2;
        Intent flags = new Intent("android.intent.action.VIEW").setFlags(268435456);
        if (num.intValue() != 0) {
            buildUpon = AbstractC31175DnJ.A04("https://maps.google.com/maps");
            str2 = "daddr";
        } else {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            if (packageManager.queryIntentActivities(flags, Constants.LOAD_RESULT_PGO_ATTEMPTED).isEmpty()) {
                parse = AbstractC08820cl.A03("https://maps.google.com/maps");
            } else {
                LruCache lruCache = AbstractC08820cl.A00;
                parse = android.net.Uri.parse("geo:0,0");
            }
            buildUpon = parse.buildUpon();
            str2 = "q";
        }
        flags.setData(AbstractC31174DnI.A0B(buildUpon, str2, str));
        return flags;
    }

    public static void A03(Context context, String str, String str2, String str3) {
        String A0R;
        if (str2 == null) {
            A0R = "";
        } else {
            A0R = AnonymousClass001.A0R(", ", str2);
        }
        C12260kU.A0E(context, A00(context, C05F.A00, AnonymousClass001.A0g(str, A0R, str3 != null ? AnonymousClass001.A0R(", ", str3) : "")));
    }

    public static void A01(Context context, double d, double d2) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(d);
        A1C.append(", ");
        A1C.append(d2);
        A02(context, null, A00(context, C05F.A00, A1C.toString()));
    }

    public static void A02(Context context, DialogInterface.OnDismissListener onDismissListener, Intent intent) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        DialogInterfaceOnClickListenerC35455FkC A00 = DialogInterfaceOnClickListenerC35455FkC.A00(context, intent, 43);
        A0I.A09(2131969212);
        A0I.A0J(A00, 2131969097);
        A0I.A0D(A00);
        A0I.A0s(true);
        A0I.A0g(onDismissListener);
        AbstractC166987dD.A1W(A0I);
    }
}
