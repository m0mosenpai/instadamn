package X;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.SfL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63215SfL {
    public static C63215SfL A02;
    public static final Lock A03 = new ReentrantLock();
    public final SharedPreferences A00;
    public final Lock A01 = new ReentrantLock();

    public final GoogleSignInAccount A01() {
        String A032;
        android.net.Uri uri;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String A033 = A03("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(A033) && (A032 = A03(AnonymousClass001.A0g("googleSignInAccount", ":", A033))) != null) {
            try {
                String str6 = null;
                if (!TextUtils.isEmpty(A032)) {
                    JSONObject A17 = AbstractC58318PtA.A17(A032);
                    String optString = A17.optString("photoUrl");
                    if (!TextUtils.isEmpty(optString)) {
                        uri = android.net.Uri.parse(optString);
                    } else {
                        uri = null;
                    }
                    long parseLong = Long.parseLong(A17.getString("expirationTime"));
                    HashSet A1H = AbstractC166987dD.A1H();
                    JSONArray jSONArray = A17.getJSONArray("grantedScopes");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        A1H.add(new Scope(1, jSONArray.getString(i)));
                    }
                    String optString2 = A17.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    if (A17.has("tokenId")) {
                        str = A17.optString("tokenId");
                    } else {
                        str = null;
                    }
                    if (A17.has("email")) {
                        str2 = A17.optString("email");
                    } else {
                        str2 = null;
                    }
                    if (A17.has(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME)) {
                        str3 = A17.optString(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
                    } else {
                        str3 = null;
                    }
                    if (A17.has("givenName")) {
                        str4 = A17.optString("givenName");
                    } else {
                        str4 = null;
                    }
                    if (A17.has("familyName")) {
                        str5 = A17.optString("familyName");
                    } else {
                        str5 = null;
                    }
                    String string = A17.getString("obfuscatedIdentifier");
                    C3U5.A04(string);
                    GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(uri, optString2, str, str2, str3, null, string, str4, str5, AbstractC166987dD.A1F(A1H), 3, parseLong);
                    if (A17.has("serverAuthCode")) {
                        str6 = A17.optString("serverAuthCode");
                    }
                    googleSignInAccount.A00 = str6;
                    return googleSignInAccount;
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final GoogleSignInOptions A02() {
        String A032;
        String str;
        Account account;
        String str2;
        String A033 = A03("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(A033) && (A032 = A03(AnonymousClass001.A0g("googleSignInOptions", ":", A033))) != null) {
            try {
                Parcelable.Creator creator = GoogleSignInOptions.CREATOR;
                String str3 = null;
                if (!TextUtils.isEmpty(A032)) {
                    JSONObject A17 = AbstractC58318PtA.A17(A032);
                    HashSet A1H = AbstractC166987dD.A1H();
                    JSONArray jSONArray = A17.getJSONArray("scopes");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        A1H.add(new Scope(1, jSONArray.getString(i)));
                    }
                    if (A17.has("accountName")) {
                        str = A17.optString("accountName");
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        account = new Account(str, "com.google");
                    } else {
                        account = null;
                    }
                    ArrayList A1F = AbstractC166987dD.A1F(A1H);
                    boolean z = A17.getBoolean("idTokenRequested");
                    boolean z2 = A17.getBoolean("serverAuthRequested");
                    boolean z3 = A17.getBoolean("forceCodeForRefreshToken");
                    if (A17.has("serverClientId")) {
                        str2 = A17.optString("serverClientId");
                    } else {
                        str2 = null;
                    }
                    if (A17.has("hostedDomain")) {
                        str3 = A17.optString("hostedDomain");
                    }
                    return new GoogleSignInOptions(account, str2, str3, null, A1F, AbstractC166987dD.A1G(), 3, z, z2, z3);
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String A03(String str) {
        Lock lock = this.A01;
        lock.lock();
        try {
            return this.A00.getString(str, null);
        } finally {
            lock.unlock();
        }
    }

    public final void A04(String str, String str2) {
        Lock lock = this.A01;
        lock.lock();
        try {
            AbstractC58318PtA.A1C(this.A00.edit(), str, str2);
        } finally {
            lock.unlock();
        }
    }

    public C63215SfL(Context context) {
        this.A00 = AbstractC58318PtA.A0F(context, "com.google.android.gms.signin");
    }

    public static C63215SfL A00(Context context) {
        C3U5.A02(context);
        Lock lock = A03;
        lock.lock();
        try {
            C63215SfL c63215SfL = A02;
            if (c63215SfL == null) {
                c63215SfL = new C63215SfL(context.getApplicationContext());
                A02 = c63215SfL;
            }
            return c63215SfL;
        } finally {
            lock.unlock();
        }
    }
}
