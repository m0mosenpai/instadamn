package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes10.dex */
public final class SWG {
    public static final C62927SXj A02 = new C62927SXj("ReviewService");
    public C63185Sek A00;
    public final String A01;

    public SWG(Context context) {
        int length;
        String str;
        this.A01 = context.getPackageName();
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
                        this.A00 = new C63185Sek(context, AbstractC58318PtA.A0E("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), A02, C62849STw.A00);
                        return;
                    } while (i < length);
                    return;
                }
                C62927SXj c62927SXj = S7P.A00;
                if (android.util.Log.isLoggable("PlayCore", 5)) {
                    android.util.Log.w("PlayCore", AnonymousClass001.A0g(c62927SXj.A00, " : ", "Phonesky package is not signed -- possibly self-built package. Could not verify."));
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
