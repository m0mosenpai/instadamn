package X;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class SUF {
    public static final HashSet A00 = AbstractC16830sb.A05("com.facebook.wakizashi", "com.facebook.katana", "com.facebook.lite", "com.facebook.orca", "com.oculus.twilight", "com.instagram.android", "com.instagram.barcelona", "com.instagram.lite", "com.whatsapp");

    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        ApplicationInfo applicationInfo;
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 0);
        if (A0s == null) {
            return null;
        }
        String A0s2 = AbstractC31173DnH.A0s(list, 1);
        C6FG c6fg = c6fq.A03;
        if (c6fg == null) {
            return null;
        }
        FragmentActivity A03 = C6BQ.A03(C6BQ.A09(c6fq));
        Intent intent = new Intent("android.intent.action.VIEW", AbstractC08820cl.A03(A0s));
        if (A0s2 != null && A0s2.length() != 0) {
            intent.setPackage(AbstractC25227BEk.A0B(A0s2).getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
        }
        List<ResolveInfo> queryIntentActivities = A03.getPackageManager().queryIntentActivities(intent, Constants.LOAD_RESULT_PGO_ATTEMPTED);
        ArrayList A10 = AbstractC31174DnI.A10(queryIntentActivities);
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            HashSet hashSet = A00;
            if (activityInfo != null && (applicationInfo = ((ComponentInfo) activityInfo).applicationInfo) != null) {
                str = ((PackageItemInfo) applicationInfo).packageName;
            } else {
                str = null;
            }
            if (AbstractC001800i.A0u(hashSet, str)) {
                A10.add(resolveInfo);
            }
        }
        if (AbstractC25226BEj.A1b(A10)) {
            C0b3.A00().A06().A0G(c6fg.A00, intent);
        } else if (A0s2 != null && A0s2.length() != 0) {
            C12260kU.A00(c6fg.A00, new Intent("android.intent.action.VIEW", AbstractC08820cl.A03(A0s2)));
            return null;
        }
        return null;
    }
}
