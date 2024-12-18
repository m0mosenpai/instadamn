package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;

/* renamed from: X.Swg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63956Swg implements InterfaceC65539TmB {
    @Override // X.InterfaceC65539TmB
    public final boolean F8o(Context context, Bundle bundle) {
        return false;
    }

    @Override // X.InterfaceC65539TmB
    public final Bundle ALk(String str, String str2, boolean z) {
        Bundle A0b = AbstractC166987dD.A0b();
        if (str != null) {
            A0b.putString("url_param", str);
        }
        return A0b;
    }

    @Override // X.InterfaceC65539TmB
    public final boolean F8p(Context context, Bundle bundle) {
        String str;
        String string = bundle.getString("url_param");
        if (string != null) {
            try {
                android.net.Uri A03 = AbstractC08820cl.A03(string);
                if (A03 != null) {
                    Intent A0D = AbstractC58318PtA.A0D(A03);
                    for (ResolveInfo resolveInfo : AbstractC08120bY.A04(context, A0D, 0)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo != null && ((PackageItemInfo) activityInfo).packageName.contentEquals("com.oculus.twilight")) {
                            ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                            AbstractC58319PtB.A19(A0D, ((PackageItemInfo) activityInfo2).packageName, ((PackageItemInfo) activityInfo2).name);
                            boolean A0G = C0b3.A00().A06().A0G(context, A0D);
                            if (A0G) {
                                str = "Success";
                            } else {
                                str = "Failed";
                            }
                            C0K8.A0O("TwilightAppUriHandler", "Launch status of Twilight App : %s", str);
                            return A0G;
                        }
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        return false;
    }
}
