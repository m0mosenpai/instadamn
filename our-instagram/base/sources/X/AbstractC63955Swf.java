package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.facebook.common.dextricks.Constants;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Swf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63955Swf implements InterfaceC65539TmB {
    public static final boolean A02(Context context, android.net.Uri uri, Bundle bundle) {
        boolean z = bundle.getBoolean("can_use_alley_oop", false);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("package_names");
        if (stringArrayList == null) {
            return false;
        }
        if ((context instanceof Activity) && "play.google.com".equals(uri.getHost()) && uri.getQueryParameter("listing") == null && z) {
            Intent A07 = AbstractC31177DnL.A07(uri.toString().replace("https://play.google.com/store/apps/", "market://"));
            A07.putExtra(MSV.A00(403), "com.facebook.katana");
            A07.putExtra("overlay", true);
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Iterator<ResolveInfo> it = packageManager.queryIntentActivities(A07, Constants.LOAD_RESULT_PGO_ATTEMPTED).iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    if (activityInfo != null && stringArrayList.contains(((PackageItemInfo) activityInfo).packageName)) {
                        Activity activity = (Activity) context;
                        Boolean bool = AbstractC63262SgL.A01;
                        if (activity != null) {
                            try {
                                AbstractC63262SgL.A01(A07, AbstractC61546RpQ.A00);
                                C0b3.A00().A03().A0F(activity, A07, 0);
                                return true;
                            } catch (ActivityNotFoundException unused) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        Intent A08 = AbstractC31177DnL.A08("android.intent.action.VIEW");
        A08.setData(uri);
        PackageManager packageManager2 = context.getPackageManager();
        if (packageManager2 != null) {
            Iterator<ResolveInfo> it2 = packageManager2.queryIntentActivities(A08, Constants.LOAD_RESULT_PGO_ATTEMPTED).iterator();
            while (it2.hasNext()) {
                ActivityInfo activityInfo2 = it2.next().activityInfo;
                if (activityInfo2 != null) {
                    String str = ((PackageItemInfo) activityInfo2).packageName;
                    if (stringArrayList.contains(str)) {
                        Intent intent = new Intent(A08);
                        AbstractC58319PtB.A19(intent, str, ((PackageItemInfo) activityInfo2).name);
                        Boolean bool2 = AbstractC63262SgL.A01;
                        try {
                            AbstractC63262SgL.A01(intent, AbstractC61546RpQ.A00);
                            AbstractC07840b2.A01(context, intent);
                            return true;
                        } catch (ActivityNotFoundException unused2) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return false;
        }
        return false;
    }
}
