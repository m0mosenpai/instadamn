package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.C14360o3;
import X.C3U5;
import X.C62471SCy;
import X.Q6O;
import X.Q6P;
import X.Q6S;
import X.SI4;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class BeginSignInControllerUtility {
    public static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;
    public static final Companion Companion = new Object();
    public static final String TAG = "BeginSignInUtility";

    /* loaded from: classes10.dex */
    public final class Companion {
        private final boolean needsBackwardsCompatibleRequest(long j) {
            return j < BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING;
        }

        public final BeginSignInRequest constructBeginSignInRequest$credentials_play_services_auth_release(C62471SCy c62471SCy, Context context) {
            boolean A1R = AbstractC167007dF.A1R(0, c62471SCy, context);
            BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = new BeginSignInRequest.PasswordRequestOptions(false);
            BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = new BeginSignInRequest.GoogleIdTokenRequestOptions(null, null, null, null, false, A1R, false);
            BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = new BeginSignInRequest.PasskeysRequestOptions(null, null, false);
            BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = new BeginSignInRequest.PasskeyJsonRequestOptions(false, null);
            boolean z = false;
            boolean z2 = false;
            for (SI4 si4 : c62471SCy.A00) {
                if (si4 instanceof Q6P) {
                    passwordRequestOptions = new BeginSignInRequest.PasswordRequestOptions(A1R);
                    if (!z) {
                        z = false;
                        if (si4.A04) {
                        }
                    }
                    z = true;
                } else if ((si4 instanceof Q6O) && !z2) {
                    boolean needsBackwardsCompatibleRequest = needsBackwardsCompatibleRequest(determineDeviceGMSVersionCode(context));
                    PublicKeyCredentialControllerUtility.Companion companion = PublicKeyCredentialControllerUtility.Companion;
                    Q6O q6o = (Q6O) si4;
                    if (needsBackwardsCompatibleRequest) {
                        passkeysRequestOptions = companion.convertToPlayAuthPasskeyRequest(q6o);
                        C3U5.A02(passkeysRequestOptions);
                    } else {
                        passkeyJsonRequestOptions = companion.convertToPlayAuthPasskeyJsonRequest(q6o);
                        C3U5.A02(passkeyJsonRequestOptions);
                    }
                    z2 = true;
                }
            }
            return new BeginSignInRequest(googleIdTokenRequestOptions, passkeyJsonRequestOptions, passkeysRequestOptions, passwordRequestOptions, null, 0, z);
        }

        private final BeginSignInRequest.GoogleIdTokenRequestOptions convertToGoogleIdTokenOption(Q6S q6s) {
            throw AbstractC166987dD.A15("getFilterByAuthorizedAccounts");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            C14360o3.A07(context.getPackageManager());
            return r2.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        public Companion() {
        }
    }
}
