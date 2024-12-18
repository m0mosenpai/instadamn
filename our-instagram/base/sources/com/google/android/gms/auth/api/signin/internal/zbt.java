package com.google.android.gms.auth.api.signin.internal;

import X.AbstractC166987dD;
import X.AnonymousClass001;
import X.C0f9;
import X.C3U2;
import X.C3U6;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.IInterface;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.p002authapi.zbb;

/* loaded from: classes10.dex */
public final class zbt extends zbb implements IInterface {
    public final Context A00;

    public zbt(Context context) {
        this();
        int A03 = C0f9.A03(-1740762173);
        this.A00 = context;
        C0f9.A0A(1516754252, A03);
    }

    public static final void A00(zbt zbtVar) {
        AppOpsManager appOpsManager;
        int A03 = C0f9.A03(-618800924);
        Context context = zbtVar.A00;
        int callingUid = Binder.getCallingUid();
        try {
            appOpsManager = (AppOpsManager) C3U2.A00(context).A00.getSystemService("appops");
        } catch (SecurityException unused) {
        }
        if (appOpsManager != null) {
            appOpsManager.checkPackage(callingUid, "com.google.android.gms");
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                C3U6 A00 = C3U6.A00(context);
                if (packageInfo != null) {
                    if (!C3U6.A01(packageInfo, false)) {
                        if (C3U6.A01(packageInfo, true)) {
                            Context context2 = A00.A00;
                            try {
                                if (!GooglePlayServicesUtil.A00) {
                                    try {
                                        PackageInfo packageInfo2 = C3U2.A00(context2).A00.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                                        C3U6.A00(context2);
                                        if (packageInfo2 != null && !C3U6.A01(packageInfo2, false) && C3U6.A01(packageInfo2, true)) {
                                            GooglePlayServicesUtil.A01 = true;
                                        } else {
                                            GooglePlayServicesUtil.A01 = false;
                                        }
                                    } catch (PackageManager.NameNotFoundException e) {
                                        Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                                    }
                                }
                                if (!GooglePlayServicesUtil.A01 && PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(Build.TYPE)) {
                                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                                }
                            } finally {
                                GooglePlayServicesUtil.A00 = true;
                            }
                        }
                    }
                    C0f9.A0A(1404781098, A03);
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.isLoggable("UidVerifier", 3);
            }
            SecurityException securityException = new SecurityException(AnonymousClass001.A0c("Calling UID ", " is not Google Play services.", Binder.getCallingUid()));
            C0f9.A0A(-1834771666, A03);
            throw securityException;
        }
        throw AbstractC166987dD.A15("context.getSystemService(Context.APP_OPS_SERVICE) is null");
    }

    public zbt() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        C0f9.A0A(-808983721, C0f9.A03(144710946));
    }
}
