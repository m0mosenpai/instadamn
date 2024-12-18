package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0LG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LG {
    public final int A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public static C0LG A00(Context context, int i, boolean z) {
        try {
            C14360o3.A0B(context, 0);
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
            if (packagesForUid != null && packagesForUid.length != 0) {
                return A03(AbstractC08120bY.A02(context, packagesForUid[0], 64), z);
            }
            throw new PackageManager.NameNotFoundException("Unable to get package names for uid $uid");
        } catch (PackageManager.NameNotFoundException unused) {
            throw new SecurityException(AnonymousClass001.A0O("Unable to get packageInfo for uid ", i));
        }
    }

    public static C0LG A01(Context context, String str) {
        ProviderInfo A01 = AbstractC08120bY.A01(context, str, 0);
        if (A01 != null) {
            return A02(context, ((PackageItemInfo) A01).packageName, true);
        }
        throw new SecurityException(AnonymousClass001.A0R("Unable to get providerInfo for authority ", str));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0LG c0lg = (C0LG) obj;
            if (this.A00 != c0lg.A00 || !this.A03.equals(c0lg.A03) || !C02O.A00(this.A04, c0lg.A04) || !C02O.A00(this.A02, c0lg.A02) || !C02O.A00(this.A01, c0lg.A01)) {
                return false;
            }
        }
        return true;
    }

    public static C0LG A02(Context context, String str, boolean z) {
        try {
            return A03(AbstractC08120bY.A02(context, str, 64), z);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new SecurityException(AnonymousClass001.A0R("Unable to get packageInfo for package ", str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0B5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.0B5, java.lang.Object] */
    public static C0LG A03(C08110bX c08110bX, boolean z) {
        ?? c0b5;
        HashSet hashSet = new HashSet();
        C08130ba A00 = c08110bX.A00();
        if (A00 != null) {
            List list = A00.A00;
            if (!list.isEmpty()) {
                ApplicationInfo applicationInfo = c08110bX.A00;
                if (applicationInfo != null) {
                    ArrayList arrayList = new ArrayList(list.size());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        byte[] byteArray = ((Signature) it.next()).toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            String encodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                            if (z) {
                                MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-1");
                                messageDigest2.update(byteArray);
                                Base64.encodeToString(messageDigest2.digest(), 11);
                                c0b5 = new Object();
                                if (encodeToString.length() == 43) {
                                    c0b5.A00 = encodeToString;
                                } else {
                                    throw new SecurityException("Invalid SHA256 key hash - should be 256-bit.");
                                }
                            } else {
                                c0b5 = new C0B5(encodeToString);
                            }
                            arrayList.add(c0b5);
                        } catch (NoSuchAlgorithmException unused) {
                            throw new SecurityException("Error obtaining SHA1/SHA256");
                        }
                    }
                    hashSet.add(c08110bX.A02);
                    int i = applicationInfo.uid;
                    return new C0LG(c08110bX.A03, null, new ArrayList(hashSet), arrayList, i);
                }
                throw new SecurityException("Unable to construct AppIdentity -- package applicationInfo is null");
            }
            throw new SecurityException("Unable to construct AppIdentity -- packageInfo does not have any signatures. Make sure you called getPackageInfo() with GET_SIGNATURES or GET_CERTIFICATES flag.");
        }
        throw new SecurityException("Unable to construct AppIdentity -- signingInfo was null. Make sure you called getPackageInfo() with GET_SIGNATURES or GET_CERTIFICATES flag.");
    }

    public final C0B5 A04() {
        List list = this.A04;
        if (list.isEmpty()) {
            return null;
        }
        return (C0B5) list.get(0);
    }

    public final String A05() {
        List list = this.A03;
        if (!list.isEmpty()) {
            return (String) list.iterator().next();
        }
        throw new IllegalStateException("Invalid AppIdentity object: no package names");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A03, this.A04, this.A02, this.A01});
    }

    public C0LG(String str, String str2, List list, List list2, int i) {
        this.A00 = i;
        this.A03 = Collections.unmodifiableList(list);
        this.A04 = list2;
        this.A02 = str;
        this.A01 = str2;
        if (!list.isEmpty()) {
        } else {
            throw new IllegalArgumentException("At least one package name is required");
        }
    }

    public final String toString() {
        String str;
        C0B5 A04 = A04();
        StringBuilder sb = new StringBuilder();
        sb.append("AppIdentity{uid=");
        sb.append(this.A00);
        sb.append(", packageNames=");
        sb.append(this.A03);
        sb.append(", sha2=");
        String str2 = "null";
        if (A04 == null) {
            str = "null";
        } else {
            str = A04.A00;
        }
        sb.append(str);
        sb.append(", version=");
        String str3 = this.A02;
        if (str3 == null) {
            str3 = "null";
        }
        sb.append(str3);
        sb.append(", domain=");
        String str4 = this.A01;
        if (str4 != null) {
            str2 = str4;
        }
        sb.append(str2);
        sb.append('}');
        return sb.toString();
    }
}
