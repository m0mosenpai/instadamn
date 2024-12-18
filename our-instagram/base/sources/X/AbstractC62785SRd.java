package X;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import com.facebook.common.dextricks.Constants;
import com.google.common.collect.ImmutableSet;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.SRd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62785SRd {
    public static Bundle A00(ContentResolver contentResolver, android.net.Uri uri, Bundle bundle, C62538SFp c62538SFp, String str) {
        Signature[] signatureArr;
        ImmutableSet A04;
        String authority = uri.getAuthority();
        if (authority != null) {
            PackageManager packageManager = c62538SFp.A00;
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(authority, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
            if (resolveContentProvider != null) {
                String str2 = ((PackageItemInfo) resolveContentProvider).packageName;
                if (str2 != null) {
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(str2, 64);
                        if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && (A04 = ImmutableSet.A04(signatureArr)) != null) {
                            ImmutableSet AXV = c62538SFp.A02.AXV(str2);
                            C1LC it = A04.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                if (c62538SFp.A01.contains(next) || AXV.contains(next)) {
                                    ContentProviderClient A00 = C0fI.A00(contentResolver, uri, 1838451259);
                                    if (A00 != null) {
                                        try {
                                            return A00.call(str, null, bundle);
                                        } finally {
                                            A00.close();
                                        }
                                    }
                                    throw AbstractC166987dD.A14("Failed to acquire client");
                                }
                            }
                            ArrayList A1E = AbstractC166987dD.A1E();
                            Iterator<E> it2 = A04.iterator();
                            while (it2.hasNext()) {
                                byte[] byteArray = ((Signature) it2.next()).toByteArray();
                                try {
                                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                                    messageDigest.update(byteArray, 0, byteArray.length);
                                    A1E.add(AbstractC58319PtB.A0x(messageDigest.digest()));
                                } catch (NoSuchAlgorithmException e) {
                                    throw AbstractC58318PtA.A0f(e);
                                }
                            }
                            throw new SecurityException(AnonymousClass001.A11("Untrusted provider package ", str2, " [", new C71473Il(", ").A02(A1E), "]"));
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    throw new SecurityException(AnonymousClass001.A0u("No signature for package ", str2, " resolving authority ", authority));
                }
                throw AbstractC58319PtB.A0o("No package name for authority ", authority);
            }
            throw AbstractC58319PtB.A0o("No provider for authority ", authority);
        }
        throw new SecurityException(AbstractC167017dG.A0n(uri, "No authority in URI ", AbstractC166987dD.A1C()));
    }

    public static void A01(Bundle bundle, C1Tc c1Tc, String str) {
        String str2;
        bundle.getClass();
        Bundle bundle2 = bundle.getBundle("@exception@");
        if (bundle2 == null) {
            return;
        }
        Throwable A01 = c1Tc.A00(bundle2).A01();
        String message = A01.getMessage();
        String A0q = AbstractC31173DnH.A0q(A01);
        if (message != null) {
            str2 = AnonymousClass001.A0R(": ", message);
        } else {
            str2 = "";
        }
        throw new Exception(AnonymousClass001.A11("Exception in provider when invoking ", str, "(): ", A0q, str2), A01);
    }
}
