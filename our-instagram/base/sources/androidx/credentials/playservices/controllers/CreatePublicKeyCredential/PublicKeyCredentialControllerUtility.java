package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AbstractC001900j;
import X.AbstractC06930Yk;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC31171DnF;
import X.AbstractC37302Gc3;
import X.AbstractC43592JPx;
import X.AbstractC53409Njy;
import X.AbstractC53410Njz;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AnonymousClass001;
import X.C14360o3;
import X.C3U5;
import X.C58732Q6f;
import X.C58733Q6g;
import X.C58734Q6h;
import X.C58736Q6j;
import X.C58737Q6k;
import X.C58743Q6q;
import X.C58745Q6s;
import X.C58747Q6u;
import X.C58749Q6w;
import X.C58750Q6x;
import X.C62705SMt;
import X.MSY;
import X.Q6G;
import X.Q6O;
import X.Q72;
import X.Q74;
import X.Q76;
import X.Q79;
import X.Q7A;
import X.RjP;
import X.SAB;
import android.util.Base64;
import android.util.Log;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class PublicKeyCredentialControllerUtility {
    public static final int FLAGS = 11;
    public static final String JSON_KEY_ALG = "alg";
    public static final String JSON_KEY_APPID = "appid";
    public static final String JSON_KEY_ATTESTATION = "attestation";
    public static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    public static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    public static final String JSON_KEY_AUTH_DATA = "authenticatorData";
    public static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    public static final String JSON_KEY_CHALLENGE = "challenge";
    public static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";
    public static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    public static final String JSON_KEY_CRED_PROPS = "credProps";
    public static final String JSON_KEY_DISPLAY_NAME = "displayName";
    public static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    public static final String JSON_KEY_EXTENSTIONS = "extensions";
    public static final String JSON_KEY_ICON = "icon";
    public static final String JSON_KEY_ID = "id";
    public static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    public static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    public static final String JSON_KEY_NAME = "name";
    public static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    public static final String JSON_KEY_RAW_ID = "rawId";
    public static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    public static final String JSON_KEY_RESPONSE = "response";
    public static final String JSON_KEY_RES_KEY = "residentKey";
    public static final String JSON_KEY_RK = "rk";
    public static final String JSON_KEY_RP = "rp";
    public static final String JSON_KEY_RPID = "rpId";
    public static final String JSON_KEY_SIGNATURE = "signature";
    public static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    public static final String JSON_KEY_TIMEOUT = "timeout";
    public static final String JSON_KEY_TRANSPORTS = "transports";
    public static final String JSON_KEY_TYPE = "type";
    public static final String JSON_KEY_USER = "user";
    public static final String JSON_KEY_USER_HANDLE = "userHandle";
    public static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    public static final String TAG = "PublicKeyUtility";
    public static final Companion Companion = new Object();
    public static final LinkedHashMap orderedErrorCodeToExceptions = AbstractC06930Yk.A05(AbstractC166987dD.A1L(ErrorCode.UNKNOWN_ERR, new Q76()), AbstractC166987dD.A1L(ErrorCode.ABORT_ERR, new C58733Q6g()), AbstractC166987dD.A1L(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new C58749Q6w()), AbstractC166987dD.A1L(ErrorCode.CONSTRAINT_ERR, new C58734Q6h()), AbstractC166987dD.A1L(ErrorCode.DATA_ERR, new C58736Q6j()), AbstractC166987dD.A1L(ErrorCode.INVALID_STATE_ERR, new C58743Q6q()), AbstractC166987dD.A1L(ErrorCode.ENCODING_ERR, new C58737Q6k()), AbstractC166987dD.A1L(ErrorCode.NETWORK_ERR, new C58745Q6s()), AbstractC166987dD.A1L(ErrorCode.NOT_ALLOWED_ERR, new C58747Q6u()), AbstractC166987dD.A1L(ErrorCode.NOT_SUPPORTED_ERR, new C58750Q6x()), AbstractC166987dD.A1L(ErrorCode.SECURITY_ERR, new Q72()), AbstractC166987dD.A1L(ErrorCode.TIMEOUT_ERR, new Q74()));

    /* loaded from: classes10.dex */
    public final class Companion {
        public final byte[] b64Decode(String str) {
            C14360o3.A0B(str, 0);
            byte[] decode = Base64.decode(str, 11);
            C14360o3.A07(decode);
            return decode;
        }

        public final String b64Encode(byte[] bArr) {
            C14360o3.A0B(bArr, 0);
            String A0x = AbstractC58319PtB.A0x(bArr);
            C14360o3.A07(A0x);
            return A0x;
        }

        public final AbstractC53410Njz beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(ErrorCode errorCode, String str) {
            C14360o3.A0B(errorCode, 0);
            SAB sab = (SAB) PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions.get(errorCode);
            if (sab == null) {
                return new Q7A(new Q76(), AnonymousClass001.A0R("unknown fido gms exception - ", str));
            }
            if (errorCode == ErrorCode.CONSTRAINT_ERR && str != null && AbstractC001900j.A0a(str, "Unable to get sync account", false)) {
                return new AbstractC53410Njz("android.credentials.GetCredentialException.TYPE_USER_CANCELED", "Passkey retrieval was cancelled by the user.");
            }
            return new Q7A(sab, str);
        }

        public final PublicKeyCredentialCreationOptions convert(Q6G q6g) {
            C14360o3.A0B(q6g, 0);
            return convertJSON$credentials_play_services_auth_release(AbstractC58318PtA.A17(q6g.A00));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.SMt] */
        public final PublicKeyCredentialCreationOptions convertJSON$credentials_play_services_auth_release(JSONObject jSONObject) {
            C14360o3.A0B(jSONObject, 0);
            ?? obj = new Object();
            parseRequiredChallengeAndUser$credentials_play_services_auth_release(jSONObject, obj);
            parseRequiredRpAndParams$credentials_play_services_auth_release(jSONObject, obj);
            parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(jSONObject, obj);
            parseOptionalTimeout$credentials_play_services_auth_release(jSONObject, obj);
            parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(jSONObject, obj);
            parseOptionalExtensions$credentials_play_services_auth_release(jSONObject, obj);
            return obj.A00();
        }

        public final BeginSignInRequest.PasskeyJsonRequestOptions convertToPlayAuthPasskeyJsonRequest(Q6O q6o) {
            C14360o3.A0B(q6o, 0);
            return new BeginSignInRequest.PasskeyJsonRequestOptions(true, q6o.A00);
        }

        @Deprecated(message = "Upgrade GMS version so 'convertToPlayAuthPasskeyJsonRequest' is used")
        public final BeginSignInRequest.PasskeysRequestOptions convertToPlayAuthPasskeyRequest(Q6O q6o) {
            C14360o3.A0B(q6o, 0);
            JSONObject A17 = AbstractC58318PtA.A17(q6o.A00);
            String optString = A17.optString(PublicKeyCredentialControllerUtility.JSON_KEY_RPID, "");
            if (AbstractC43592JPx.A04(optString) == 0) {
                throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
            }
            return new BeginSignInRequest.PasskeysRequestOptions(optString, getChallenge(A17), true);
        }

        public final void parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(JSONObject jSONObject, C62705SMt c62705SMt) {
            String obj;
            String obj2;
            AbstractC167007dF.A1K(jSONObject, c62705SMt);
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
            if (jSONObject.has(str)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                Attachment attachment = null;
                boolean optBoolean = jSONObject2.optBoolean(PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY, false);
                String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY, "");
                ResidentKeyRequirement residentKeyRequirement = null;
                if (AbstractC43592JPx.A04(optString) > 0) {
                    residentKeyRequirement = ResidentKeyRequirement.A00(optString);
                }
                Boolean valueOf = Boolean.valueOf(optBoolean);
                String optString2 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT, "");
                if (AbstractC43592JPx.A04(optString2) > 0) {
                    attachment = Attachment.A00(optString2);
                }
                if (attachment == null) {
                    obj = null;
                } else {
                    obj = attachment.toString();
                }
                if (residentKeyRequirement == null) {
                    obj2 = null;
                } else {
                    obj2 = residentKeyRequirement.toString();
                }
                c62705SMt.A02 = new AuthenticatorSelectionCriteria(valueOf, obj, null, obj2);
            }
        }

        public final void parseOptionalExtensions$credentials_play_services_auth_release(JSONObject jSONObject, C62705SMt c62705SMt) {
            boolean A1R = AbstractC167007dF.A1R(0, jSONObject, c62705SMt);
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
            if (jSONObject.has(str)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                FidoAppIdExtension fidoAppIdExtension = null;
                UserVerificationMethodExtension userVerificationMethodExtension = null;
                GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
                String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, "");
                if (AbstractC43592JPx.A04(optString) > 0) {
                    fidoAppIdExtension = new FidoAppIdExtension(optString);
                }
                if (jSONObject2.optBoolean(PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT, false)) {
                    googleThirdPartyPaymentExtension = new GoogleThirdPartyPaymentExtension(A1R);
                }
                if (jSONObject2.optBoolean("uvm", false)) {
                    userVerificationMethodExtension = new UserVerificationMethodExtension(A1R);
                }
                c62705SMt.A01 = new AuthenticationExtensions(fidoAppIdExtension, googleThirdPartyPaymentExtension, userVerificationMethodExtension, null, null, null, null, null, null, null, null, null);
            }
        }

        public final AbstractC53409Njy publicKeyCredentialResponseContainsError(PublicKeyCredential publicKeyCredential) {
            C14360o3.A0B(publicKeyCredential, 0);
            SafeParcelable safeParcelable = publicKeyCredential.A02;
            if (safeParcelable == null && (safeParcelable = publicKeyCredential.A01) == null && (safeParcelable = publicKeyCredential.A03) == null) {
                throw AbstractC166987dD.A14("No response set.");
            }
            if (!(safeParcelable instanceof AuthenticatorErrorResponse)) {
                return null;
            }
            AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) safeParcelable;
            ErrorCode errorCode = authenticatorErrorResponse.A00;
            C14360o3.A07(errorCode);
            SAB sab = (SAB) PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions.get(errorCode);
            String str = authenticatorErrorResponse.A01;
            if (sab == null) {
                return new Q79(new Q76(), AnonymousClass001.A0R("unknown fido gms exception - ", str));
            }
            if (errorCode == ErrorCode.CONSTRAINT_ERR && str != null && AbstractC001900j.A0a(str, "Unable to get sync account", false)) {
                return new AbstractC53409Njy("android.credentials.CreateCredentialException.TYPE_USER_CANCELED", "Passkey registration was cancelled by the user.");
            }
            return new Q79(sab, str);
        }

        public final String toAssertPasskeyResponse(SignInCredential signInCredential) {
            Object obj;
            C14360o3.A0B(signInCredential, 0);
            JSONObject A0q = AbstractC31171DnF.A0q();
            PublicKeyCredential publicKeyCredential = signInCredential.A01;
            if (publicKeyCredential != null) {
                obj = publicKeyCredential.A02;
                if (obj == null && (obj = publicKeyCredential.A01) == null && (obj = publicKeyCredential.A03) == null) {
                    throw AbstractC166987dD.A14("No response set.");
                }
            } else {
                obj = null;
            }
            C14360o3.A0A(obj);
            if (!(obj instanceof AuthenticatorErrorResponse)) {
                if (obj instanceof AuthenticatorAssertionResponse) {
                    try {
                        String A00 = publicKeyCredential.A00();
                        C14360o3.A07(A00);
                        return A00;
                    } catch (Throwable th) {
                        throw C58732Q6f.A00(AbstractC166997dE.A0y("The PublicKeyCredential response json had an unexpected exception when parsing: ", th));
                    }
                }
                Log.e(PublicKeyCredentialControllerUtility.TAG, AnonymousClass001.A0R("AuthenticatorResponse expected assertion response but got: ", MSY.A0h(obj)));
                return AbstractC166987dD.A19(A0q);
            }
            AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
            ErrorCode errorCode = authenticatorErrorResponse.A00;
            C14360o3.A07(errorCode);
            throw beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(errorCode, authenticatorErrorResponse.A01);
        }

        private final byte[] getChallenge(JSONObject jSONObject) {
            String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, "");
            if (AbstractC43592JPx.A04(optString) == 0) {
                throw new JSONException("Challenge not found in request or is unexpectedly empty");
            }
            byte[] decode = Base64.decode(optString, 11);
            C14360o3.A07(decode);
            return decode;
        }

        public final String getJSON_KEY_ALG$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final String getJSON_KEY_APPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        public final String getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        public final String getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        public final String getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        public final String getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        public final String getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final String getJSON_KEY_ICON$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final String getJSON_KEY_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        public final String getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        public final String getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        public final String getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final String getJSON_KEY_RK$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        public final String getJSON_KEY_RP$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final String getJSON_KEY_RPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        public final String getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final String getJSON_KEY_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final String getJSON_KEY_USER$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        public final String getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        public final LinkedHashMap getOrderedErrorCodeToExceptions$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void addAuthenticatorAttestationResponse$credentials_play_services_auth_release(byte[] bArr, byte[] bArr2, String[] strArr, JSONObject jSONObject) {
            AbstractC167027dH.A12(bArr, bArr2, strArr);
            C14360o3.A0B(jSONObject, 3);
            JSONObject A0q = AbstractC31171DnF.A0q();
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
            String encodeToString = Base64.encodeToString(bArr, 11);
            C14360o3.A07(encodeToString);
            A0q.put(str, encodeToString);
            String str2 = PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
            String encodeToString2 = Base64.encodeToString(bArr2, 11);
            C14360o3.A07(encodeToString2);
            A0q.put(str2, encodeToString2);
            A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS, new JSONArray(strArr));
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, A0q);
        }

        public final boolean checkAlgSupported(int i) {
            try {
                COSEAlgorithmIdentifier.A00(i);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth_release(JSONObject jSONObject, C62705SMt c62705SMt) {
            AbstractC167017dG.A1N(jSONObject, c62705SMt);
            if (jSONObject.has(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT)) {
                c62705SMt.A05 = AbstractC37302Gc3.A0S(jSONObject.getLong(r1));
            }
        }

        public final void parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(JSONObject jSONObject, C62705SMt c62705SMt) {
            AbstractC167017dG.A1N(jSONObject, c62705SMt);
            ArrayList A1E = AbstractC166987dD.A1E();
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
            if (jSONObject.has(str)) {
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    C14360o3.A07(string);
                    byte[] decode = Base64.decode(string, 11);
                    C14360o3.A07(decode);
                    String string2 = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    if (AbstractC43592JPx.A04(string2) == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (decode.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    ArrayList arrayList = null;
                    String str2 = PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
                    if (jSONObject2.has(str2)) {
                        arrayList = AbstractC166987dD.A1E();
                        JSONArray jSONArray2 = jSONObject2.getJSONArray(str2);
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            try {
                                arrayList.add(Transport.A00(jSONArray2.getString(i2)));
                            } catch (RjP e) {
                                throw new Q79(new C58737Q6k(), e.getMessage());
                            }
                        }
                    }
                    A1E.add(new PublicKeyCredentialDescriptor(string2, arrayList, decode));
                }
            }
            c62705SMt.A07 = A1E;
            String str3 = PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
            String str4 = NetInfoModule.CONNECTION_TYPE_NONE;
            String optString = jSONObject.optString(str3, NetInfoModule.CONNECTION_TYPE_NONE);
            if (AbstractC43592JPx.A04(optString) != 0) {
                str4 = optString;
            }
            c62705SMt.A00 = AttestationConveyancePreference.A00(str4);
        }

        public final void parseRequiredChallengeAndUser$credentials_play_services_auth_release(JSONObject jSONObject, C62705SMt c62705SMt) {
            AbstractC167017dG.A1N(jSONObject, c62705SMt);
            byte[] challenge = getChallenge(jSONObject);
            C3U5.A02(challenge);
            c62705SMt.A08 = challenge;
            JSONObject jSONObject2 = jSONObject.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            C14360o3.A07(string);
            byte[] decode = Base64.decode(string, 11);
            C14360o3.A07(decode);
            String string2 = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            String string3 = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
            String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "");
            if (AbstractC43592JPx.A04(string3) == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (decode.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            if (AbstractC43592JPx.A04(string2) == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            c62705SMt.A04 = new PublicKeyCredentialUserEntity(string2, decode, optString, string3);
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth_release(JSONObject jSONObject, C62705SMt c62705SMt) {
            AbstractC167017dG.A1N(jSONObject, c62705SMt);
            JSONObject jSONObject2 = jSONObject.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_RP);
            String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "");
            String optString2 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "");
            C14360o3.A0A(optString2);
            if (optString2.length() == 0) {
                optString2 = null;
            }
            if (AbstractC43592JPx.A04(optString) == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            if (AbstractC43592JPx.A04(string) == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            c62705SMt.A03 = new PublicKeyCredentialRpEntity(string, optString, optString2);
            JSONArray jSONArray = jSONObject.getJSONArray(PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS);
            ArrayList A1E = AbstractC166987dD.A1E();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                int i2 = (int) jSONObject3.getLong(PublicKeyCredentialControllerUtility.JSON_KEY_ALG);
                String optString3 = jSONObject3.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "");
                if (AbstractC43592JPx.A04(optString3) == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                try {
                    COSEAlgorithmIdentifier.A00(i2);
                    A1E.add(new PublicKeyCredentialParameters(optString3, i2));
                } catch (Throwable unused) {
                }
            }
            c62705SMt.A06 = A1E;
        }

        public Companion() {
        }
    }

    public static final PublicKeyCredentialCreationOptions convert(Q6G q6g) {
        return Companion.convert(q6g);
    }
}
