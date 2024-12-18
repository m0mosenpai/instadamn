package X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.HashMap;

/* renamed from: X.Sys, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64076Sys implements InterfaceC65487Tl7 {
    public C63209SfE A00;
    public C63209SfE A01;
    public AbstractC12990ll A02;

    @Override // X.InterfaceC65487Tl7
    public final boolean Cv2(Intent intent, int i, int i2) {
        LoginClient$Result A02;
        String stringExtra;
        LoginClient$Request loginClient$Request = this.A01.A01;
        if (intent == null) {
            A01(loginClient$Request, this.A02, null, "native_auth_cancel");
            stringExtra = "Operation canceled";
        } else if (i2 == 0) {
            A01(loginClient$Request, this.A02, null, "native_auth_cancel");
            stringExtra = intent.getStringExtra("error");
        } else {
            if (i2 != -1) {
                AbstractC62273S4s.A00(this.A02, "native_auth_error", loginClient$Request.A01, A00("Unexpected resultCode from authorization."), loginClient$Request.A02);
                A02 = LoginClient$Result.A02(loginClient$Request, "Unexpected resultCode from authorization.", null, null);
            } else {
                Bundle extras = intent.getExtras();
                String string = extras.getString("error");
                if (string == null) {
                    string = extras.getString("error_type");
                }
                String string2 = extras.getString(TraceFieldType.ErrorCode);
                String string3 = extras.getString("error_message");
                if (string3 == null) {
                    string3 = extras.getString(TraceFieldType.Error);
                }
                if (string == null && string2 == null && string3 == null) {
                    try {
                        A01(loginClient$Request, this.A02, null, "native_auth_success");
                        A02 = LoginClient$Result.A00(C63209SfE.A00(extras, C05F.A01, loginClient$Request.A03, loginClient$Request.A06), loginClient$Request);
                    } catch (TXS e) {
                        A02 = LoginClient$Result.A02(loginClient$Request, null, e.getMessage(), null);
                    }
                } else {
                    if (AbstractC62356S8d.A00.contains(string)) {
                        this.A00.A02();
                        return true;
                    }
                    if (AbstractC62356S8d.A01.contains(string)) {
                        A02 = LoginClient$Result.A01(loginClient$Request, null);
                    } else {
                        A02 = LoginClient$Result.A02(loginClient$Request, string, string3, string2);
                    }
                }
            }
            this.A00.A04(A02);
            return true;
        }
        A02 = LoginClient$Result.A01(loginClient$Request, stringExtra);
        this.A00.A04(A02);
        return true;
    }

    @Override // X.InterfaceC65487Tl7
    public final void F8i(LoginClient$Request loginClient$Request) {
        Intent intent;
        AbstractC12990ll abstractC12990ll;
        String str;
        String str2;
        AbstractC62273S4s.A00(this.A02, "native_auth_attempted", loginClient$Request.A01, A00(null), loginClient$Request.A02);
        String A01 = C63209SfE.A01();
        FragmentActivity activity = this.A01.A06.getActivity();
        String str3 = loginClient$Request.A03;
        java.util.Set set = loginClient$Request.A06;
        boolean z = loginClient$Request.A07;
        loop0: for (S6Y s6y : SV2.A02) {
            Intent A04 = AbstractC31171DnF.A04();
            if (s6y instanceof QIT) {
                str2 = "com.facebook.wakizashi";
            } else if (s6y instanceof QIS) {
                str2 = "com.facebook.orca";
            } else {
                str2 = "com.facebook.katana";
            }
            intent = A04.setClassName(str2, "com.facebook.katana.ProxyAuth").putExtra("client_id", str3);
            if (set.size() != 0) {
                intent.putExtra("scope", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, set));
            }
            if (!AbstractC63349Si6.A05(A01)) {
                intent.putExtra("e2e", A01);
            }
            intent.putExtra("response_type", "token,signed_request");
            intent.putExtra("return_scopes", "true");
            intent.putExtra("default_audience", "friends");
            intent.putExtra("legacy_override", "v2.3");
            if (z) {
                intent.putExtra("auth_type", "rerequest");
            }
            ResolveInfo resolveActivity = activity.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity != null) {
                String str4 = ((PackageItemInfo) resolveActivity.activityInfo).packageName;
                String str5 = Build.BRAND;
                int i = activity.getApplicationInfo().flags;
                if (!str5.startsWith("generic") || (i & 2) == 0) {
                    try {
                        for (Signature signature : activity.getPackageManager().getPackageInfo(str4, 64).signatures) {
                            if (!S6Y.A00.contains(AbstractC63349Si6.A03(signature.toByteArray()))) {
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        continue;
                    }
                }
                intent.putExtra("is_cal", loginClient$Request.A02);
                intent.putExtra("location", loginClient$Request.A01);
                break loop0;
            }
        }
        intent = null;
        if (intent == null) {
            abstractC12990ll = this.A02;
            str = "Null native intent";
        } else {
            try {
                if (C12260kU.A0J(intent, this.A01.A06, 64206)) {
                    return;
                }
                abstractC12990ll = this.A02;
                str = "Native auth failed at launching";
            } catch (ActivityNotFoundException e) {
                A01(loginClient$Request, this.A02, e.getMessage(), "native_auth_error");
                this.A00.A02();
                return;
            }
        }
        A01(loginClient$Request, abstractC12990ll, str, "native_auth_error");
        this.A00.A02();
    }

    public static HashMap A00(String str) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(MSV.A00(205), String.valueOf(AbstractC23851Es.A03()));
        A1G.put("exception", str);
        return A1G;
    }

    public static void A01(LoginClient$Request loginClient$Request, AbstractC12990ll abstractC12990ll, String str, String str2) {
        AbstractC62273S4s.A00(abstractC12990ll, str2, loginClient$Request.A01, A00(str), loginClient$Request.A02);
    }
}
