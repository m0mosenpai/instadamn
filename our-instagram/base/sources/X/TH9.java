package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.SigningInfo;
import android.text.TextUtils;
import com.spotify.sdk.android.auth.AuthorizationRequest;

/* loaded from: classes10.dex */
public final class TH9 implements InterfaceC65554TmX {
    public C63143Sdp A00;

    @Override // X.InterfaceC65554TmX
    public final boolean CQB() {
        return false;
    }

    @Override // X.InterfaceC65554TmX
    public final boolean Emp(Activity activity, AuthorizationRequest authorizationRequest) {
        boolean A00;
        C63143Sdp c63143Sdp = new C63143Sdp(activity, authorizationRequest, new C62457SCk());
        this.A00 = c63143Sdp;
        Activity activity2 = c63143Sdp.A00;
        C62457SCk c62457SCk = c63143Sdp.A02;
        String[] strArr = C63143Sdp.A03;
        int i = 0;
        do {
            String A0R = AnonymousClass001.A0R("com.spotify.music", strArr[i]);
            Intent A0E = AbstractC58318PtA.A0E("com.spotify.sso.action.START_AUTH_FLOW");
            A0E.setPackage(A0R);
            ComponentName resolveActivity = A0E.resolveActivity(activity2.getPackageManager());
            if (resolveActivity != null) {
                try {
                    PackageInfo packageInfo = activity2.getPackageManager().getPackageInfo(resolveActivity.getPackageName(), 134217728);
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo != null) {
                        if (signingInfo.hasMultipleSigners()) {
                            A00 = C63143Sdp.A00(c62457SCk, packageInfo.signingInfo.getApkContentsSigners());
                        } else {
                            A00 = C63143Sdp.A00(c62457SCk, packageInfo.signingInfo.getSigningCertificateHistory());
                        }
                        if (A00) {
                            A0E.putExtra("VERSION", 1);
                            AuthorizationRequest authorizationRequest2 = c63143Sdp.A01;
                            A0E.putExtra("CLIENT_ID", authorizationRequest2.A01);
                            A0E.putExtra("REDIRECT_URI", authorizationRequest2.A02);
                            A0E.putExtra("RESPONSE_TYPE", authorizationRequest2.A03);
                            A0E.putExtra("SCOPES", authorizationRequest2.A05);
                            A0E.putExtra("STATE", authorizationRequest2.A04);
                            A0E.putExtra("UTM_SOURCE", "spotify-sdk");
                            String str = authorizationRequest2.A00;
                            if (TextUtils.isEmpty(str)) {
                                str = "android-sdk";
                            }
                            A0E.putExtra("UTM_CAMPAIGN", str);
                            A0E.putExtra("UTM_MEDIUM", "android-sdk");
                            try {
                                activity2.startActivityForResult(A0E, 1138);
                                return true;
                            } catch (ActivityNotFoundException unused) {
                                return false;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
            i++;
        } while (i < 4);
        return false;
    }

    @Override // X.InterfaceC65554TmX
    public final void stop() {
        C63143Sdp c63143Sdp = this.A00;
        if (c63143Sdp != null) {
            c63143Sdp.A00.finishActivity(1138);
        }
    }
}
