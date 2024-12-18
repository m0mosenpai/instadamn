package com.google.android.gms.auth.api.signin.internal;

import X.AbstractC018607g;
import X.AbstractC31171DnF;
import X.AbstractC58318PtA;
import X.AbstractC58321PtD;
import X.AnonymousClass001;
import X.C0f9;
import X.C3U5;
import X.C62938SYg;
import X.C63215SfL;
import X.C63631Sqd;
import X.TSK;
import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.DexStore;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@KeepName
/* loaded from: classes10.dex */
public class SignInHubActivity extends FragmentActivity {
    public static boolean A05;
    public int A00;
    public Intent A01;
    public SignInConfiguration A02;
    public boolean A03 = false;
    public boolean A04;

    private final void A00(int i) {
        Status status = new Status(i, null);
        Intent A04 = AbstractC31171DnF.A04();
        A04.putExtra("googleSignInStatus", status);
        setResult(0, A04);
        finish();
        A05 = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (!this.A03) {
            setResult(0);
            if (i == 40962) {
                int i3 = 8;
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && (googleSignInAccount = signInAccount.zbc) != null) {
                        C62938SYg A00 = C62938SYg.A00(this);
                        GoogleSignInOptions googleSignInOptions = this.A02.A00;
                        synchronized (A00) {
                            C63215SfL c63215SfL = A00.A02;
                            C3U5.A02(googleSignInOptions);
                            String str = googleSignInAccount.A08;
                            c63215SfL.A04("defaultGoogleSignInAccount", str);
                            C3U5.A02(googleSignInOptions);
                            String A0g = AnonymousClass001.A0g("googleSignInAccount", ":", str);
                            JSONObject A0q = AbstractC31171DnF.A0q();
                            try {
                                String str2 = googleSignInAccount.A04;
                                if (str2 != null) {
                                    A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
                                }
                                String str3 = googleSignInAccount.A05;
                                if (str3 != null) {
                                    A0q.put("tokenId", str3);
                                }
                                String str4 = googleSignInAccount.A06;
                                if (str4 != null) {
                                    A0q.put("email", str4);
                                }
                                String str5 = googleSignInAccount.A07;
                                if (str5 != null) {
                                    A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, str5);
                                }
                                String str6 = googleSignInAccount.A09;
                                if (str6 != null) {
                                    A0q.put("givenName", str6);
                                }
                                String str7 = googleSignInAccount.A0A;
                                if (str7 != null) {
                                    A0q.put("familyName", str7);
                                }
                                Uri uri = googleSignInAccount.A03;
                                if (uri != null) {
                                    A0q.put("photoUrl", uri.toString());
                                }
                                String str8 = googleSignInAccount.A00;
                                if (str8 != null) {
                                    A0q.put("serverAuthCode", str8);
                                }
                                A0q.put("expirationTime", googleSignInAccount.A02);
                                A0q.put("obfuscatedIdentifier", str);
                                JSONArray A0p = AbstractC31171DnF.A0p();
                                List list = googleSignInAccount.A0B;
                                Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
                                Arrays.sort(scopeArr, TSK.A00);
                                for (Scope scope : scopeArr) {
                                    A0p.put(scope.A01);
                                }
                                A0q.put("grantedScopes", A0p);
                                A0q.remove("serverAuthCode");
                                c63215SfL.A04(A0g, A0q.toString());
                                String A0g2 = AnonymousClass001.A0g("googleSignInOptions", ":", str);
                                JSONObject A0q2 = AbstractC31171DnF.A0q();
                                try {
                                    JSONArray A0p2 = AbstractC31171DnF.A0p();
                                    ArrayList arrayList = googleSignInOptions.A08;
                                    Collections.sort(arrayList, GoogleSignInOptions.A0I);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        A0p2.put(((Scope) it.next()).A01);
                                    }
                                    A0q2.put("scopes", A0p2);
                                    Account account = googleSignInOptions.A00;
                                    if (account != null) {
                                        A0q2.put("accountName", account.name);
                                    }
                                    A0q2.put("idTokenRequested", googleSignInOptions.A05);
                                    A0q2.put("forceCodeForRefreshToken", googleSignInOptions.A0A);
                                    A0q2.put("serverAuthRequested", googleSignInOptions.A09);
                                    String str9 = googleSignInOptions.A01;
                                    if (!TextUtils.isEmpty(str9)) {
                                        A0q2.put("serverClientId", str9);
                                    }
                                    String str10 = googleSignInOptions.A02;
                                    if (!TextUtils.isEmpty(str10)) {
                                        A0q2.put("hostedDomain", str10);
                                    }
                                    c63215SfL.A04(A0g2, A0q2.toString());
                                    A00.A00 = googleSignInAccount;
                                    A00.A01 = googleSignInOptions;
                                } catch (JSONException e) {
                                    throw AbstractC58318PtA.A0f(e);
                                }
                            } catch (JSONException e2) {
                                throw AbstractC58318PtA.A0f(e2);
                            }
                        }
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", googleSignInAccount);
                        this.A04 = true;
                        this.A00 = i2;
                        this.A01 = intent;
                        AbstractC018607g.A00(this).A02(null, new C63631Sqd(this), 0);
                        A05 = false;
                        return;
                    }
                    if (intent.hasExtra("errorCode") && (i3 = intent.getIntExtra("errorCode", 8)) == 13) {
                        i3 = 12501;
                    }
                }
                A00(i3);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        String packageName;
        int A00 = C0f9.A00(-1639906415);
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action != null) {
            if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
                A00(12500);
                i2 = -1030414423;
            } else {
                boolean equals = action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN");
                if (!equals && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
                    AbstractC58321PtD.A1Q("Unknown action: ", String.valueOf(intent.getAction()), "AuthSignInClient");
                    finish();
                    i2 = -417818207;
                } else {
                    Bundle bundleExtra = intent.getBundleExtra(DexStore.CONFIG_FILENAME);
                    if (bundleExtra != null) {
                        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable(DexStore.CONFIG_FILENAME);
                        if (signInConfiguration == null) {
                            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                            setResult(0);
                            finish();
                            i2 = -677715940;
                        } else {
                            this.A02 = signInConfiguration;
                            if (bundle == null) {
                                if (A05) {
                                    setResult(0);
                                    A00(12502);
                                    i2 = -1680183990;
                                } else {
                                    A05 = true;
                                    Intent A0E = AbstractC58318PtA.A0E(action);
                                    if (equals) {
                                        packageName = "com.google.android.gms";
                                    } else {
                                        packageName = getPackageName();
                                    }
                                    A0E.setPackage(packageName);
                                    A0E.putExtra(DexStore.CONFIG_FILENAME, this.A02);
                                    try {
                                        startActivityForResult(A0E, 40962);
                                    } catch (ActivityNotFoundException unused) {
                                        this.A03 = true;
                                        Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                                        A00(17);
                                    }
                                    i2 = -1174643578;
                                }
                            } else {
                                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                                this.A04 = z;
                                if (z) {
                                    this.A00 = bundle.getInt("signInResultCode");
                                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                                    if (intent2 != null) {
                                        this.A01 = intent2;
                                        AbstractC018607g.A00(this).A02(null, new C63631Sqd(this), 0);
                                        A05 = false;
                                        i2 = 1417466859;
                                    } else {
                                        i = -1314743039;
                                    }
                                } else {
                                    i2 = -541711958;
                                }
                            }
                        }
                    } else {
                        i = -812549903;
                    }
                }
            }
            C0f9.A07(i2, A00);
            return;
        }
        i = -1067329039;
        C0f9.A07(i, A00);
        throw null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int A00 = C0f9.A00(641151584);
        super.onDestroy();
        A05 = false;
        C0f9.A07(489646596, A00);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.A04);
        if (this.A04) {
            bundle.putInt("signInResultCode", this.A00);
            bundle.putParcelable("signInResultData", this.A01);
        }
    }
}
