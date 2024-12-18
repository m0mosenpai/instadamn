package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes10.dex */
public final class SGY {
    public final C62928SXk A00;
    public final C63186Sel A01;
    public final String A02;

    public SGY(Context context, C62928SXk c62928SXk) {
        int length;
        String str;
        this.A02 = context.getPackageName();
        this.A00 = c62928SXk;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (length = signatureArr.length) != 0) {
                    int i = 0;
                    do {
                        byte[] byteArray = signatureArr[i].toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            str = AbstractC58319PtB.A0x(messageDigest.digest());
                        } catch (NoSuchAlgorithmException unused) {
                            str = "";
                        }
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                            String str2 = Build.TAGS;
                            if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                                i++;
                            }
                        }
                        this.A01 = new C63186Sel(context, S7O.A00, C62848STv.A00, c62928SXk);
                        return;
                    } while (i < length);
                }
                C62928SXk c62928SXk2 = S7T.A00;
                if (android.util.Log.isLoggable("PlayCore", 5)) {
                    android.util.Log.w("PlayCore", AnonymousClass001.A0g(c62928SXk2.A00, " : ", "Phonesky package is not signed -- possibly self-built package. Could not verify."));
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            android.util.Log.e("PlayCore", AnonymousClass001.A0g(c62928SXk.A00, " : ", "Phonesky is not installed."));
        }
    }
}
