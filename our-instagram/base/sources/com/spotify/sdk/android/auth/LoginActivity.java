package com.spotify.sdk.android.auth;

import X.AbstractC58321PtD;
import X.C05F;
import X.C0f9;
import X.InterfaceC65294ThS;
import X.InterfaceC65554TmX;
import X.MSV;
import X.SMZ;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import com.facebook.R;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class LoginActivity extends Activity implements InterfaceC65294ThS {
    public final SMZ A00 = new SMZ(this);

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Integer num;
        AuthorizationResponse authorizationResponse;
        super.onNewIntent(intent);
        Uri data = intent.getData();
        SMZ smz = this.A00;
        String str = null;
        String str2 = null;
        int i = 0;
        String str3 = null;
        if (data == null) {
            num = C05F.A0N;
        } else {
            String queryParameter = data.getQueryParameter("error");
            if (queryParameter != null) {
                str3 = data.getQueryParameter(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                str2 = queryParameter;
                num = C05F.A0C;
            } else {
                String queryParameter2 = data.getQueryParameter(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                if (queryParameter2 != null) {
                    str3 = data.getQueryParameter(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                    str = queryParameter2;
                    num = C05F.A00;
                } else {
                    String encodedFragment = data.getEncodedFragment();
                    if (encodedFragment != null && encodedFragment.length() > 0) {
                        String str4 = null;
                        String str5 = null;
                        for (String str6 : encodedFragment.split("&")) {
                            String[] split = str6.split(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                            if (split.length == 2) {
                                if (split[0].startsWith("access_token")) {
                                    str4 = Uri.decode(split[1]);
                                }
                                if (split[0].startsWith(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE)) {
                                    str5 = Uri.decode(split[1]);
                                }
                                if (split[0].startsWith("expires_in")) {
                                    str = Uri.decode(split[1]);
                                }
                            }
                        }
                        if (str != null) {
                            try {
                                i = Integer.parseInt(str);
                            } catch (NumberFormatException unused) {
                            }
                        }
                        authorizationResponse = new AuthorizationResponse(C05F.A01, null, str4, str5, null, i);
                        smz.A00(authorizationResponse);
                    }
                    num = C05F.A0Y;
                }
            }
        }
        authorizationResponse = new AuthorizationResponse(num, str, null, str3, str2, 0);
        smz.A00(authorizationResponse);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Integer num;
        super.onActivityResult(i, i2, intent);
        if (i == 1138) {
            String str = null;
            String str2 = null;
            String str3 = null;
            int i3 = 0;
            String str4 = null;
            if (i2 == -2) {
                num = C05F.A0C;
                if (intent == null) {
                    str3 = "Invalid message format";
                } else {
                    str3 = intent.getStringExtra("ERROR");
                    if (str3 == null) {
                        str3 = "Unknown error";
                    }
                }
            } else if (i2 == -1) {
                BaseBundle baseBundle = (BaseBundle) intent.getParcelableExtra("REPLY");
                if (baseBundle == null) {
                    num = C05F.A0C;
                    str3 = "Missing response data";
                } else {
                    String string = baseBundle.getString("RESPONSE_TYPE", "unknown");
                    str4 = baseBundle.getString("STATE", null);
                    if (!string.equals(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE)) {
                        if (!string.equals("token")) {
                            num = C05F.A0Y;
                        } else {
                            str = baseBundle.getString("ACCESS_TOKEN");
                            i3 = baseBundle.getInt("EXPIRES_IN");
                            num = C05F.A01;
                        }
                    } else {
                        str2 = baseBundle.getString("AUTHORIZATION_CODE");
                        num = C05F.A00;
                    }
                }
            } else {
                num = C05F.A0N;
            }
            SMZ smz = this.A00;
            smz.A00 = this;
            smz.A00(new AuthorizationResponse(num, str2, str, str4, str3, i3));
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        AuthorizationRequest authorizationRequest;
        int A09 = AbstractC58321PtD.A09(this, -857946363);
        super.onCreate(bundle);
        setContentView(R.layout.com_spotify_sdk_login_activity);
        Bundle bundleExtra = getIntent().getBundleExtra(MSV.A00(747));
        if (bundleExtra == null) {
            authorizationRequest = null;
        } else {
            authorizationRequest = (AuthorizationRequest) bundleExtra.getParcelable("request");
        }
        SMZ smz = this.A00;
        smz.A00 = this;
        if (getCallingActivity() == null) {
            Log.e("com.spotify.sdk.android.auth.LoginActivity", "Can't use LoginActivity with a null caller. Possible reasons: calling activity has a singleInstance mode or LoginActivity is in a singleInstance/singleTask mode");
        } else if (authorizationRequest == null) {
            Log.e("com.spotify.sdk.android.auth.LoginActivity", "No authorization request");
            setResult(0);
        } else {
            if (bundle == null) {
                String.format("Spotify Auth starting with the request [%s]", authorizationRequest.A00().toString());
                if (!smz.A03) {
                    smz.A03 = true;
                    Iterator it = smz.A02.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InterfaceC65554TmX interfaceC65554TmX = (InterfaceC65554TmX) it.next();
                        if (!interfaceC65554TmX.Emp(smz.A04, authorizationRequest)) {
                            interfaceC65554TmX.stop();
                        } else {
                            smz.A01 = interfaceC65554TmX;
                            break;
                        }
                    }
                }
            }
            C0f9.A07(438737101, A09);
        }
        finish();
        C0f9.A07(438737101, A09);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        int A00 = C0f9.A00(43982237);
        SMZ smz = this.A00;
        if (smz.A03) {
            smz.A03 = false;
            InterfaceC65554TmX interfaceC65554TmX = smz.A01;
            if (interfaceC65554TmX != null) {
                interfaceC65554TmX.stop();
            }
            Object obj = smz.A00;
            if (obj != null) {
                Log.w("com.spotify.sdk.android.auth.LoginActivity", "Spotify Auth cancelled due to LoginActivity being finished");
                ((Activity) obj).setResult(0);
                smz.A00 = null;
            }
        }
        smz.A00 = null;
        super.onDestroy();
        C0f9.A07(-1582391288, A00);
    }

    @Override // android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(1388797185);
        super.onResume();
        SMZ smz = this.A00;
        InterfaceC65554TmX interfaceC65554TmX = smz.A01;
        if (interfaceC65554TmX != null && interfaceC65554TmX.CQB()) {
            smz.A00(new AuthorizationResponse(C05F.A0N, null, null, null, null, 0));
        }
        C0f9.A07(-1866030464, A00);
    }
}
