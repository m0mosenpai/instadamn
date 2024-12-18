package X;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: X.078, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass078 implements C0LR {
    public final Application A00;
    public final Integer A01;

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A0i;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        C10860hv c10860hv;
        C10850hu c10850hu;
        C10850hu c10850hu2;
        PackageManager packageManager = this.A00.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC04370Ld.A00(packageManager, c024209q, this.A01);
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.webview", 0);
            if (packageInfo != null) {
                String str = packageInfo.versionName;
                if (str != null) {
                    if (this.A01 == C05F.A01) {
                        c10850hu2 = C0LK.AA9;
                    } else {
                        c10850hu2 = C0LK.AAA;
                    }
                    c024209q.A03(c10850hu2, str);
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            C0PC.A00().DEh("WebviewVer", e, null);
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 0);
            if (packageInfo2 != null) {
                Integer num = this.A01;
                Integer num2 = C05F.A01;
                if (num == num2) {
                    c10860hv = C0LK.A1l;
                } else {
                    c10860hv = C0LK.A1m;
                }
                c024209q.A01(c10860hv, packageInfo2.versionCode);
                if (num == num2) {
                    c10850hu = C0LK.A5q;
                } else {
                    c10850hu = C0LK.A5r;
                }
                c024209q.A03(c10850hu, packageInfo2.versionName);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            C0PC.A00().DEh("GMSVer", e2, null);
        }
    }

    public AnonymousClass078(Application application, Integer num) {
        this.A00 = application;
        this.A01 = num;
    }
}
