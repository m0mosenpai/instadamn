package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* renamed from: X.Sh5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63301Sh5 {
    public String A00;
    public int A01;
    public int A02 = 0;
    public String A03;
    public final Context A04;

    public static final synchronized void A02(C63301Sh5 c63301Sh5) {
        synchronized (c63301Sh5) {
            PackageInfo A00 = c63301Sh5.A00(c63301Sh5.A04.getPackageName());
            if (A00 != null) {
                c63301Sh5.A03 = Integer.toString(A00.versionCode);
                c63301Sh5.A00 = A00.versionName;
            }
        }
    }

    public final synchronized int A03() {
        int i;
        i = this.A02;
        if (i == 0) {
            PackageManager packageManager = this.A04.getPackageManager();
            i = 0;
            if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                android.util.Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            } else {
                Intent A0E = AbstractC58318PtA.A0E("com.google.iid.TOKEN_REQUEST");
                A0E.setPackage("com.google.android.gms");
                List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(A0E, 0);
                i = 2;
                if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                    android.util.Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                }
                this.A02 = 2;
            }
        }
        return i;
    }

    public final synchronized int A04() {
        PackageInfo A00;
        if (this.A01 == 0 && (A00 = A00("com.google.android.gms")) != null) {
            this.A01 = A00.versionCode;
        }
        return this.A01;
    }

    public final synchronized String A05() {
        if (this.A03 == null) {
            A02(this);
        }
        return this.A03;
    }

    private final PackageInfo A00(String str) {
        try {
            return this.A04.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            android.util.Log.w("FirebaseInstanceId", MSZ.A0u("Failed to find package ", valueOf, AbstractC58318PtA.A0q(AbstractC58319PtB.A05(valueOf) + 23)));
            return null;
        }
    }

    public C63301Sh5(Context context) {
        this.A04 = context;
    }

    public static String A01(C63342Shx c63342Shx) {
        C63342Shx.A01(c63342Shx);
        SPG spg = c63342Shx.A01;
        String str = spg.A01;
        if (str == null) {
            C63342Shx.A01(c63342Shx);
            str = spg.A00;
            if (str.startsWith("1:")) {
                String[] split = str.split(":");
                if (split.length >= 2) {
                    str = split[1];
                    if (str.isEmpty()) {
                    }
                }
                return null;
            }
        }
        return str;
    }
}
