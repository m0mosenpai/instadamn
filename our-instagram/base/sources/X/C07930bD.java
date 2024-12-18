package X;

import android.content.pm.PackageItemInfo;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/* renamed from: X.0bD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07930bD implements Comparator {
    public static final java.util.Set A00 = new HashSet(Arrays.asList("com.facebook.lite", "com.facebook.liteqa", "com.instagram.lite"));

    public static int A00(String str) {
        java.util.Set set = C0CE.A00;
        C14360o3.A0B(str, 0);
        if (str.startsWith("com.facebook") || str.startsWith("com.instagram") || str.startsWith("com.oculus") || str.startsWith("com.meta") || str.startsWith("com.whatsapp") || str.startsWith("com.leaplock") || str.startsWith("com.mapillary")) {
            return A00.contains(str) ? 1 : 0;
        }
        return 2;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        PackageItemInfo packageItemInfo = (PackageItemInfo) obj;
        PackageItemInfo packageItemInfo2 = (PackageItemInfo) obj2;
        int compareTo = Integer.valueOf(A00(packageItemInfo.packageName)).compareTo(Integer.valueOf(A00(packageItemInfo2.packageName)));
        if (compareTo == 0) {
            return packageItemInfo.packageName.compareTo(packageItemInfo2.packageName);
        }
        return compareTo;
    }
}
