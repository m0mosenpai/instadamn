package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2KP */
/* loaded from: classes.dex */
public final class C2KP {
    public static final C2KQ A02 = new C2KQ("SplitInstallService");
    public static final Intent A03 = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    public C48402Kh A00;
    public final String A01;

    public static C5KS A00() {
        A02.A02("onError(%d)", -14);
        N20 n20 = new N20(-14);
        C5KS c5ks = new C5KS();
        c5ks.A0C(n20);
        return c5ks;
    }

    public C2KP(Context context, String str) {
        int length;
        String str2;
        this.A01 = str;
        int i = 0;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (length = signatureArr.length) == 0) {
                    S7Q.A00.A04("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return;
                }
                do {
                    byte[] byteArray = signatureArr[i].toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        str2 = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        str2 = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str2)) {
                        String str3 = Build.TAGS;
                        if ((!str3.contains("dev-keys") && !str3.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str2)) {
                            i++;
                        }
                    }
                    Context applicationContext = context.getApplicationContext();
                    this.A00 = new C48402Kh(applicationContext != null ? applicationContext : context, A03, A02, C48392Kg.A00);
                    return;
                } while (i < length);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    public static /* bridge */ /* synthetic */ ArrayList A01(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }
}
