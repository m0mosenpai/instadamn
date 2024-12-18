package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0bX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08110bX {
    public final ApplicationInfo A00;
    public final PackageInfo A01;
    public final String A02;
    public final String A03;

    public C08110bX(PackageInfo packageInfo) {
        C14360o3.A0B(packageInfo, 1);
        this.A01 = packageInfo;
        String str = packageInfo.packageName;
        this.A02 = str == null ? "" : str;
        String str2 = packageInfo.versionName;
        this.A03 = str2 == null ? "" : str2;
        this.A00 = packageInfo.applicationInfo;
    }

    public final C08130ba A00() {
        Signature[] signingCertificateHistory;
        boolean z = true;
        PackageInfo packageInfo = this.A01;
        SigningInfo signingInfo = packageInfo.signingInfo;
        if (signingInfo != null) {
            boolean hasMultipleSigners = signingInfo.hasMultipleSigners();
            boolean hasPastSigningCertificates = signingInfo.hasPastSigningCertificates();
            if (hasMultipleSigners) {
                signingCertificateHistory = signingInfo.getApkContentsSigners();
            } else {
                signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            }
            if (signingCertificateHistory == null) {
                return null;
            }
            List asList = Arrays.asList(signingCertificateHistory);
            C14360o3.A07(asList);
            List A0X = AbstractC001800i.A0X(asList);
            if (A0X.isEmpty()) {
                return null;
            }
            return new C08130ba(A0X, hasMultipleSigners, hasPastSigningCertificates);
        }
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        List asList2 = Arrays.asList(signatureArr);
        C14360o3.A07(asList2);
        List A0X2 = AbstractC001800i.A0X(asList2);
        if (A0X2.isEmpty()) {
            return null;
        }
        if (A0X2.size() <= 1) {
            z = false;
        }
        return new C08130ba(A0X2, z, false);
    }
}
