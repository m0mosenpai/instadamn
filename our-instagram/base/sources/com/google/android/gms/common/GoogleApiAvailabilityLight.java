package com.google.android.gms.common;

import X.AbstractC58317Pt9;
import X.C3U2;
import X.C3U3;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.Constants;
import com.google.android.gms.common.util.DeviceProperties;

/* loaded from: classes2.dex */
public class GoogleApiAvailabilityLight {
    public static final GoogleApiAvailabilityLight A00 = new Object();

    public final Intent A04(Context context, String str, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent(AbstractC58317Pt9.A00(18));
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && DeviceProperties.A00(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(12451000);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                C3U3 A002 = C3U2.A00(context);
                sb.append(A002.A00.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String obj = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "com.google.android.gms");
        if (!TextUtils.isEmpty(obj)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", obj);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(Constants.LOAD_RESULT_WITH_VDEX_ODEX);
        return intent3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
    
        if (r0.booleanValue() != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A03(android.content.Context r15, int r16) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleApiAvailabilityLight.A03(android.content.Context, int):int");
    }

    public final int A02(Context context) {
        return A03(context, 12451000);
    }
}
