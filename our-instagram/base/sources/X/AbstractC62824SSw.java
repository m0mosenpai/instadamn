package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SSw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62824SSw {
    public static final List A00(Context context, String str) {
        PackageInfo packageInfo;
        int parseInt;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                packageInfo = context.getPackageManager().getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
            } else {
                packageInfo = context.getPackageManager().getPackageInfo(str, 128);
            }
            S5T.A00("lam:CompanionAppUtil", AnonymousClass001.A0S("versionName=", packageInfo.versionName, ' '));
            String str2 = packageInfo.versionName;
            if (str2 != null) {
                List A0R = AbstractC001900j.A0R(str2, new String[]{"."}, 0);
                ArrayList A0q = AbstractC167017dG.A0q(A0R);
                Iterator it = A0R.iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    if (AbstractC167007dF.A1N(A1B.length())) {
                        parseInt = 0;
                    } else {
                        parseInt = Integer.parseInt(A1B);
                    }
                    AbstractC166997dE.A1W(A0q, parseInt);
                }
                return A0q;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public static final boolean A01(List list) {
        if (list == null || !(!list.isEmpty())) {
            return false;
        }
        if (AbstractC31176DnK.A01(list, 0) > 126) {
            return true;
        }
        return AbstractC31176DnK.A01(list, 0) == 126 && list.size() >= 5 && AbstractC31176DnK.A01(list, 4) >= 20;
    }
}
