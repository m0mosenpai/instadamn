package X;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1Rm, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Rm {
    public final ContentResolver A00;
    public final Context A01;
    public final C27051Td A02;
    public final C1Tc A03;

    public final long A03(List list) {
        HashSet hashSet = new HashSet(list);
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("module_names", new ArrayList<>(hashSet));
        bundle.putBoolean("deferred", true);
        bundle.putInt("pending_user_action_handling_type", 1);
        Bundle A00 = A00(bundle, this, "install");
        A01(A00, this);
        return A00.getLong(AbstractC58361Pu1.A00(), -1L);
    }

    public static Bundle A00(Bundle bundle, C1Rm c1Rm, String str) {
        Signature[] signatureArr;
        Signature signature;
        PackageManager packageManager = c1Rm.A01.getPackageManager();
        if (packageManager != null) {
            String str2 = C1TW.A01;
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str2, 0);
            if (resolveContentProvider != null) {
                String str3 = ((PackageItemInfo) resolveContentProvider).packageName;
                if ("com.facebook.appmanager".equals(str3)) {
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(str3, 64);
                        if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length == 1 && (signature = signatureArr[0]) != null) {
                            if (!signature.equals(C1SC.A01) && !signature.equals(C1SC.A00) && !signature.equals(C1SC.A02)) {
                                throw new SecurityException("Provider package signature does not match");
                            }
                            ContentProviderClient A00 = C0fI.A00(c1Rm.A00, C1TW.A00, 1135733613);
                            if (A00 != null) {
                                try {
                                    return A00.call(str, null, bundle);
                                } finally {
                                    A00.release();
                                }
                            }
                            throw new IllegalStateException("Failed to acquire modules provider.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    throw new SecurityException("Missing provider package signature");
                }
                throw new SecurityException(String.format(null, "Invalid provider package name %s", str3));
            }
            throw new SecurityException(String.format(null, "Failed resolving provider info (%s)", str2));
        }
        throw new SecurityException("PackageManager not available for client verification");
    }

    public static boolean A02(Context context, PackageManager packageManager) {
        int length;
        C1TT A00 = new C1Ro(context, packageManager).A00();
        if (C05F.A01.equals(A00.A02) && A00.A06 && A00.A05) {
            try {
                ProviderInfo[] providerInfoArr = packageManager.getPackageInfo("com.facebook.appmanager", 8).providers;
                if (providerInfoArr != null && (length = providerInfoArr.length) != 0) {
                    int i = 0;
                    while (true) {
                        ProviderInfo providerInfo = providerInfoArr[i];
                        if (C1TW.A01.equals(providerInfo.authority)) {
                            if (!((ComponentInfo) providerInfo).exported) {
                                break;
                            }
                            return true;
                        }
                        i++;
                        if (i >= length) {
                            break;
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public final void A04(InterfaceC65343TiQ interfaceC65343TiQ) {
        android.net.Uri build;
        C27051Td c27051Td = this.A02;
        List list = c27051Td.A02;
        synchronized (list) {
            if (list.isEmpty()) {
                ContentResolver contentResolver = c27051Td.A00;
                Context context = c27051Td.A01;
                if ("com.facebook.appmanager".equals(context.getPackageName())) {
                    build = C1TW.A00;
                } else {
                    build = C1TW.A00.buildUpon().appendPath(context.getPackageName()).appendPath("sessions").build();
                }
                contentResolver.registerContentObserver(build, true, c27051Td);
            }
            list.add(interfaceC65343TiQ);
        }
    }

    public C1Rm(ContentResolver contentResolver, Context context, Handler handler, C1Tc c1Tc) {
        this.A03 = c1Tc;
        this.A00 = contentResolver;
        this.A01 = context;
        this.A02 = new C27051Td(contentResolver, context, handler);
    }

    public static void A01(Bundle bundle, C1Rm c1Rm) {
        bundle.getClass();
        Bundle bundle2 = bundle.getBundle("exception");
        if (bundle2 == null) {
        } else {
            throw c1Rm.A03.A00(bundle2).A01();
        }
    }
}
