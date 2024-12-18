package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.webview.SystemWebView;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.instagram.acp.igacpsecuritykey.IGACPSecurityKeySignInActivity;
import java.util.HashMap;

/* renamed from: X.Sp6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63538Sp6 implements C00V {
    public final int A00;
    public final Object A01;

    public C63538Sp6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C00V
    public final /* bridge */ /* synthetic */ void Cv1(Object obj) {
        Integer num;
        long j;
        String str;
        String str2;
        String obj2;
        boolean z;
        EnumC61062Reb enumC61062Reb;
        byte[] bArr;
        byte[] byteArrayExtra;
        switch (this.A00) {
            case 0:
                ActivityResult activityResult = (ActivityResult) obj;
                C14360o3.A0B(activityResult, 0);
                Intent intent = activityResult.A01;
                if (intent != null) {
                    AbstractC63952Swb abstractC63952Swb = (AbstractC63952Swb) this.A01;
                    String stringExtra = intent.getStringExtra("result_operation_type");
                    String str3 = "";
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    abstractC63952Swb.A01 = stringExtra;
                    if (activityResult.A00 == 0) {
                        String stringExtra2 = intent.getStringExtra("error");
                        if (stringExtra2 != null) {
                            str3 = stringExtra2;
                        }
                        if (str3.equals("LOGIN_CANCELLED_BY_USER")) {
                            num = C05F.A00;
                        } else {
                            num = C05F.A01;
                        }
                        abstractC63952Swb.A02(num);
                        return;
                    }
                    if (!stringExtra.equals("refresh_access_token")) {
                        abstractC63952Swb.A02(C05F.A0C);
                    }
                    String stringExtra3 = intent.getStringExtra("access_token");
                    int intExtra = intent.getIntExtra("access_token_expiry_time", 0);
                    C62965SZi c62965SZi = C62965SZi.A04;
                    if (c62965SZi != null) {
                        SFZ sfz = c62965SZi.A02;
                        sfz.A02 = stringExtra3;
                        sfz.A00 = intExtra;
                        sfz.A01 = C05F.A0N;
                        FragmentActivity activity = abstractC63952Swb.A04.getActivity();
                        if (activity != null) {
                            AbstractC62768SQh.A01(activity, c62965SZi);
                        }
                    }
                    abstractC63952Swb.A01();
                    return;
                }
                return;
            case 1:
                ActivityResult activityResult2 = (ActivityResult) obj;
                C14360o3.A0B(activityResult2, 0);
                Intent intent2 = activityResult2.A01;
                if (intent2 != null) {
                    C63953Swc c63953Swc = (C63953Swc) this.A01;
                    String stringExtra4 = intent2.getStringExtra("result_type");
                    c63953Swc.A00 = stringExtra4;
                    if (activityResult2.A00 == 0) {
                        String stringExtra5 = intent2.getStringExtra("error");
                        if (C14360o3.A0K(stringExtra5, "LOGIN_CANCELED_BY_USER") || (c63953Swc.A09 && C14360o3.A0K(stringExtra5, "LOGIN_CANCELLED_BY_USER"))) {
                            z = true;
                        } else {
                            z = false;
                        }
                        SL5 sl5 = c63953Swc.A03;
                        if (z) {
                            enumC61062Reb = EnumC61062Reb.A04;
                        } else {
                            enumC61062Reb = EnumC61062Reb.A02;
                        }
                        sl5.A00(enumC61062Reb);
                        return;
                    }
                    if (!C14360o3.A0K(stringExtra4, "refresh_token")) {
                        c63953Swc.A03.A00(EnumC61062Reb.A03);
                    }
                    InterfaceC172717mh interfaceC172717mh = c63953Swc.A04;
                    boolean z2 = c63953Swc.A09;
                    C14360o3.A0B(interfaceC172717mh, 1);
                    String stringExtra6 = intent2.getStringExtra("access_token");
                    int intExtra2 = intent2.getIntExtra("expiry_time", 0);
                    if (z2) {
                        stringExtra6 = intent2.getStringExtra("access_token");
                        intExtra2 = intent2.getIntExtra("access_token_expiry_time", 0);
                    }
                    C63217SfN c63217SfN = C63217SfN.A06;
                    if (c63217SfN == null) {
                        C0K8.A0E("BwPExtUtil", "BwPContext is null!");
                    } else {
                        C62524SFa c62524SFa = c63217SfN.A03;
                        c62524SFa.A02 = stringExtra6;
                        c62524SFa.A00 = intExtra2;
                        c62524SFa.A01 = C05F.A0N;
                        FragmentActivity activity2 = interfaceC172717mh.getActivity();
                        if (activity2 != null) {
                            SQi.A01(activity2, c63217SfN, false);
                        }
                    }
                    Bundle bundle = c63953Swc.A02;
                    String str4 = c63953Swc.A00;
                    C14360o3.A0B(bundle, 0);
                    C63217SfN c63217SfN2 = C63217SfN.A06;
                    if (c63217SfN2 == null) {
                        C0K8.A0D("BwPExtUtil", "BwPContext is null");
                        return;
                    }
                    String str5 = C63217SfN.A07;
                    if (str5 == null || str5.length() == 0 || !c63217SfN2.A04(str5)) {
                        str5 = c63217SfN2.A01.A03;
                    }
                    QF6 C9a = interfaceC172717mh.C9a();
                    if (C9a != null && str5 != null && str5.length() != 0) {
                        ((SystemWebView) C9a).A04.loadUrl(str5, c63217SfN2.A04.A00());
                        Object obj3 = bundle.get("ad_id");
                        if (obj3 != null && (obj2 = obj3.toString()) != null) {
                            j = Long.parseLong(obj2);
                        } else {
                            j = 0;
                        }
                        Object obj4 = bundle.get("iab_session_id");
                        String str6 = "";
                        if (obj4 == null || (str = obj4.toString()) == null) {
                            str = "";
                        }
                        HashMap A1G = AbstractC166987dD.A1G();
                        if ("new_token".equals(str4)) {
                            str2 = "PAGE_LOAD_AFTER_AUTH_SUCCESS";
                        } else {
                            str2 = "PAGE_LOAD_AFTER_TOKEN_REFRESH";
                        }
                        String A0t = AbstractC58321PtD.A0t(bundle, "media_id");
                        if (A0t != null) {
                            str6 = A0t;
                        }
                        A1G.put("pageLoadSource", str2);
                        A1G.put("tokenSource", AbstractC61709RsQ.A00(c63217SfN2.A03.A01));
                        A1G.put("is_organic", String.valueOf(c63217SfN2.A02));
                        A1G.put("media_id", str6);
                        C63305ShB.A00().A04(j, "PAGE_LOADED", str, A1G);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                C14360o3.A0B(bool, 0);
                boolean booleanValue = bool.booleanValue();
                XQ3 xq3 = (XQ3) this.A01;
                if (booleanValue) {
                    xq3.A04 = false;
                    XQ3.A02(xq3);
                    return;
                } else {
                    if (!xq3.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        xq3.A04 = true;
                    } else {
                        xq3.A04 = false;
                    }
                    XQ3.A01(xq3);
                    return;
                }
            default:
                ActivityResult activityResult3 = (ActivityResult) obj;
                C14360o3.A0B(activityResult3, 0);
                Intent intent3 = activityResult3.A01;
                if (intent3 != null) {
                    bArr = intent3.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA");
                } else {
                    bArr = null;
                }
                if (activityResult3.A00 == -1 && bArr != null) {
                    PublicKeyCredential publicKeyCredential = (PublicKeyCredential) SafeParcelableSerializer.A00(PublicKeyCredential.CREATOR, bArr);
                    C14360o3.A07(publicKeyCredential);
                    SafeParcelable safeParcelable = publicKeyCredential.A02;
                    if (safeParcelable == null && (safeParcelable = publicKeyCredential.A01) == null && (safeParcelable = publicKeyCredential.A03) == null) {
                        throw AbstractC166987dD.A14("No response set.");
                    }
                    if (safeParcelable instanceof AuthenticatorErrorResponse) {
                        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) safeParcelable;
                        IGACPSecurityKeySignInActivity.A01((IGACPSecurityKeySignInActivity) this.A01, Integer.valueOf(authenticatorErrorResponse.A00.A00), authenticatorErrorResponse.A01);
                        return;
                    } else {
                        if (safeParcelable instanceof AuthenticatorAssertionResponse) {
                            Activity activity3 = (Activity) this.A01;
                            String A19 = AbstractC166987dD.A19(IGACPSecurityKeySignInActivity.A00((AuthenticatorAssertionResponse) safeParcelable));
                            Intent A04 = AbstractC31171DnF.A04();
                            activity3.setResult(-1, A04);
                            A04.putExtra("extra_result_code", A19);
                            activity3.finish();
                            return;
                        }
                        return;
                    }
                }
                IGACPSecurityKeySignInActivity iGACPSecurityKeySignInActivity = (IGACPSecurityKeySignInActivity) this.A01;
                if (intent3 != null && (byteArrayExtra = intent3.getByteArrayExtra("FIDO2_ERROR_EXTRA")) != null) {
                    AuthenticatorErrorResponse authenticatorErrorResponse2 = (AuthenticatorErrorResponse) SafeParcelableSerializer.A00(AuthenticatorErrorResponse.CREATOR, byteArrayExtra);
                    C14360o3.A07(authenticatorErrorResponse2);
                    IGACPSecurityKeySignInActivity.A01(iGACPSecurityKeySignInActivity, Integer.valueOf(authenticatorErrorResponse2.A00.A00), authenticatorErrorResponse2.A01);
                    return;
                }
                IGACPSecurityKeySignInActivity.A01(iGACPSecurityKeySignInActivity, null, null);
                return;
        }
    }
}
