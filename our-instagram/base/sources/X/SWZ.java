package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.customtabs.ICustomTabsService;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class SWZ {
    public final ComponentName A00;
    public final Context A01;
    public final ICustomTabsService A02;
    public final /* synthetic */ AbstractServiceConnectionC63432SkB A03;

    public SWZ(ComponentName componentName, Context context, ICustomTabsService iCustomTabsService, AbstractServiceConnectionC63432SkB abstractServiceConnectionC63432SkB) {
        this.A03 = abstractServiceConnectionC63432SkB;
        this.A02 = iCustomTabsService;
        this.A00 = componentName;
        this.A01 = context;
    }

    public static String A00(Context context, List list) {
        PackageManager packageManager = context.getPackageManager();
        new Intent("android.intent.action.VIEW", android.net.Uri.parse("http://"));
        Intent A0E = AbstractC58318PtA.A0E("android.support.customtabs.action.CustomTabsService");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            A0E.setPackage(A1B);
            if (packageManager.resolveService(A0E, 0) != null) {
                return A1B;
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            android.util.Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
            return null;
        }
        return null;
    }
}
