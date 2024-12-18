package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.0c9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC08450c9 {
    public static boolean A03(Context context, int i, int i2) {
        if (!(i == i2)) {
            try {
                if (context.getPackageManager().checkSignatures(i, i2) != 0) {
                    return false;
                }
            } catch (RuntimeException e) {
                throw new SecurityException(e);
            }
        }
        return true;
    }

    public static String[] A05(Context context, int i) {
        try {
            C14360o3.A0B(context, 0);
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
            if (packagesForUid != null && packagesForUid.length != 0) {
                return packagesForUid;
            }
            throw new SecurityException(AnonymousClass001.A0O("No packageName associated with uid=", i));
        } catch (RuntimeException e) {
            throw new SecurityException(e);
        }
    }

    public static C08110bX A00(Context context, String str) {
        try {
            C08110bX A02 = AbstractC08120bY.A02(context, str, 64);
            String str2 = A02.A02;
            if (str.equals(str2)) {
                return A02;
            }
            throw new SecurityException(AnonymousClass001.A0u("Package name mismatch: expected=", str, ", was=", str2));
        } catch (PackageManager.NameNotFoundException unused) {
            throw new SecurityException(AnonymousClass001.A0R(str, " not found by PackageManager."));
        } catch (RuntimeException e) {
            throw new SecurityException(e);
        }
    }

    public static C0B5 A01(Context context, String str) {
        C08110bX A00 = A00(context, str);
        C08130ba A002 = A00.A00();
        if (A002 != null) {
            byte[] byteArray = ((Signature) A002.A00.get(0)).toByteArray();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(byteArray);
                return new C0B5(Base64.encodeToString(messageDigest.digest(), 11));
            } catch (NoSuchAlgorithmException unused) {
                throw new SecurityException("Error obtaining SHA1/SHA256");
            }
        }
        throw new SecurityException(A00.A02);
    }

    public static boolean A02(Context context) {
        if (!C0B8.A0e.contains(A01(context, context.getPackageName()))) {
            return false;
        }
        return true;
    }

    public static boolean A04(Context context, String str) {
        ApplicationInfo applicationInfo = A00(context, context.getPackageName()).A00;
        if (applicationInfo != null) {
            ApplicationInfo applicationInfo2 = A00(context, str).A00;
            if (applicationInfo2 != null) {
                return A03(context, applicationInfo.uid, applicationInfo2.uid);
            }
            throw new SecurityException(str);
        }
        throw new SecurityException(context.getPackageName());
    }
}
