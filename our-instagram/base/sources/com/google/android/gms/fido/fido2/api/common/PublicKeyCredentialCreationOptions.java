package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC37302Gc3;
import X.AbstractC50523MSb;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.AbstractC64513THf;
import X.C3U5;
import X.C60681RLt;
import X.C63474SlF;
import X.MSV;
import X.RLu;
import X.RjP;
import X.RjR;
import X.SSI;
import X.SSJ;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(72);
    public ResultReceiver A00;
    public final AttestationConveyancePreference A01;
    public final AuthenticationExtensions A02;
    public final AuthenticatorSelectionCriteria A03;
    public final PublicKeyCredentialRpEntity A04;
    public final PublicKeyCredentialUserEntity A05;
    public final TokenBinding A06;
    public final Double A07;
    public final Integer A08;
    public final String A09;
    public final List A0A;
    public final List A0B;
    public final byte[] A0C;

    public final boolean equals(Object obj) {
        if (obj instanceof PublicKeyCredentialCreationOptions) {
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
            if (SSI.A01(this.A04, publicKeyCredentialCreationOptions.A04) && SSI.A01(this.A05, publicKeyCredentialCreationOptions.A05) && Arrays.equals(this.A0C, publicKeyCredentialCreationOptions.A0C) && SSI.A01(this.A07, publicKeyCredentialCreationOptions.A07)) {
                List list = this.A0A;
                List list2 = publicKeyCredentialCreationOptions.A0A;
                if (list.containsAll(list2) && list2.containsAll(list)) {
                    List list3 = this.A0B;
                    List list4 = publicKeyCredentialCreationOptions.A0B;
                    if (list3 != null ? !(list4 == null || !list3.containsAll(list4) || !list4.containsAll(list3)) : list4 == null) {
                        if (SSI.A01(this.A03, publicKeyCredentialCreationOptions.A03) && SSI.A01(this.A08, publicKeyCredentialCreationOptions.A08) && SSI.A01(this.A06, publicKeyCredentialCreationOptions.A06) && SSI.A01(this.A01, publicKeyCredentialCreationOptions.A01) && SSI.A01(this.A02, publicKeyCredentialCreationOptions.A02)) {
                            return SSI.A00(this.A09, publicKeyCredentialCreationOptions.A09);
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A05, Integer.valueOf(Arrays.hashCode(this.A0C)), this.A0A, this.A07, this.A0B, this.A03, this.A08, this.A06, this.A01, this.A02, this.A09});
    }

    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.A02;
        AttestationConveyancePreference attestationConveyancePreference = this.A01;
        TokenBinding tokenBinding = this.A06;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.A03;
        List list = this.A0B;
        List list2 = this.A0A;
        byte[] bArr = this.A0C;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.A05;
        String valueOf = String.valueOf(this.A04);
        String valueOf2 = String.valueOf(publicKeyCredentialUserEntity);
        String A00 = SSJ.A00(bArr);
        String valueOf3 = String.valueOf(list2);
        String valueOf4 = String.valueOf(list);
        String valueOf5 = String.valueOf(authenticatorSelectionCriteria);
        String valueOf6 = String.valueOf(tokenBinding);
        String valueOf7 = String.valueOf(attestationConveyancePreference);
        String valueOf8 = String.valueOf(authenticationExtensions);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PublicKeyCredentialCreationOptions{\n rp=");
        A1C.append(valueOf);
        A1C.append(", \n user=");
        A1C.append(valueOf2);
        A1C.append(", \n challenge=");
        A1C.append(A00);
        A1C.append(", \n parameters=");
        A1C.append(valueOf3);
        A1C.append(", \n timeoutSeconds=");
        A1C.append(this.A07);
        A1C.append(", \n excludeList=");
        A1C.append(valueOf4);
        A1C.append(", \n authenticatorSelection=");
        A1C.append(valueOf5);
        A1C.append(", \n requestId=");
        A1C.append(this.A08);
        A1C.append(", \n tokenBinding=");
        A1C.append(valueOf6);
        A1C.append(", \n attestationConveyancePreference=");
        A1C.append(valueOf7);
        A1C.append(", \n authenticationExtensions=");
        return AbstractC50523MSb.A0W(valueOf8, A1C);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String obj;
        int A04 = AbstractC58319PtB.A04(parcel);
        boolean A1U = AbstractC58322PtE.A1U(parcel, this.A04, i);
        AbstractC128825rw.A0A(parcel, this.A05, 3, i, A1U);
        AbstractC128825rw.A0F(parcel, this.A0C, 4, A1U);
        AbstractC128825rw.A0E(parcel, this.A0A, 5, A1U);
        Double d = this.A07;
        if (d != null) {
            AbstractC58322PtE.A1C(parcel, d, 524294);
        }
        AbstractC128825rw.A0E(parcel, this.A0B, 7, A1U);
        AbstractC128825rw.A0A(parcel, this.A03, 8, i, A1U);
        Integer num = this.A08;
        if (num != null) {
            parcel.writeInt(262153);
            AbstractC58318PtA.A1H(parcel, num);
        }
        AbstractC128825rw.A0A(parcel, this.A06, 10, i, A1U);
        AttestationConveyancePreference attestationConveyancePreference = this.A01;
        if (attestationConveyancePreference == null) {
            obj = null;
        } else {
            obj = attestationConveyancePreference.toString();
        }
        AbstractC128825rw.A0C(parcel, obj, 11, A1U);
        AbstractC128825rw.A0A(parcel, this.A02, 12, i, A1U);
        AbstractC128825rw.A0C(parcel, this.A09, 13, A1U);
        AbstractC128825rw.A0A(parcel, this.A00, 14, i, A1U);
        AbstractC128825rw.A06(parcel, A04);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.SMt] */
    public PublicKeyCredentialCreationOptions(ResultReceiver resultReceiver, AuthenticationExtensions authenticationExtensions, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, TokenBinding tokenBinding, Double d, Integer num, String str, String str2, List list, List list2, byte[] bArr) {
        String str3;
        byte[] decode;
        String str4;
        byte[] decode2;
        String str5;
        String str6;
        Boolean bool;
        ArrayList arrayList;
        AbstractC64513THf abstractC64513THf;
        this.A00 = resultReceiver;
        if (str2 != null) {
            try {
                JSONObject A17 = AbstractC58318PtA.A17(str2);
                ?? obj = new Object();
                JSONObject jSONObject = A17.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_RP);
                String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                String string2 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                if (jSONObject.has(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) {
                    str3 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
                } else {
                    str3 = null;
                }
                obj.A03 = new PublicKeyCredentialRpEntity(string, string2, str3);
                JSONObject jSONObject2 = A17.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                String string3 = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                if (string3 == null) {
                    decode = null;
                } else {
                    decode = Base64.decode(string3, 11);
                }
                String string4 = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
                if (jSONObject2.has(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) {
                    str4 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
                } else {
                    str4 = null;
                }
                obj.A04 = new PublicKeyCredentialUserEntity(string4, decode, str4, optString);
                String string5 = A17.getString(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE);
                if (string5 == null) {
                    decode2 = null;
                } else {
                    decode2 = Base64.decode(string5, 11);
                }
                C3U5.A02(decode2);
                obj.A08 = decode2;
                JSONArray jSONArray = A17.getJSONArray(PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS);
                ArrayList A1E = AbstractC166987dD.A1E();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    try {
                        abstractC64513THf = new C60681RLt(new PublicKeyCredentialParameters(jSONObject3.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), jSONObject3.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_ALG)));
                    } catch (IllegalArgumentException unused) {
                        abstractC64513THf = RLu.A00;
                    }
                    if (abstractC64513THf instanceof C60681RLt) {
                        A1E.add(((C60681RLt) abstractC64513THf).A00);
                    }
                }
                obj.A06 = A1E;
                if (A17.has(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT)) {
                    obj.A05 = AbstractC37302Gc3.A0S(A17.getDouble(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT));
                }
                if (A17.has(PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS)) {
                    JSONArray jSONArray2 = A17.getJSONArray(PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS);
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                        Parcelable.Creator creator = PublicKeyCredentialDescriptor.CREATOR;
                        String string6 = jSONObject4.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        byte[] decode3 = Base64.decode(jSONObject4.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), 11);
                        if (jSONObject4.has(PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS)) {
                            JSONArray jSONArray3 = jSONObject4.getJSONArray(PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS);
                            if (jSONArray3 == null) {
                                arrayList = null;
                            } else {
                                HashSet hashSet = new HashSet(jSONArray3.length());
                                for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                                    String string7 = jSONArray3.getString(i3);
                                    if (string7 != null && !string7.isEmpty()) {
                                        try {
                                            hashSet.add(Transport.A00(string7));
                                        } catch (RjP unused2) {
                                            Log.w("Transport", "Ignoring unrecognized transport ".concat(string7));
                                        }
                                    }
                                }
                                arrayList = AbstractC166987dD.A1F(hashSet);
                            }
                        } else {
                            arrayList = null;
                        }
                        A1E2.add(new PublicKeyCredentialDescriptor(string6, arrayList, decode3));
                    }
                    obj.A07 = A1E2;
                }
                if (A17.has(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION)) {
                    JSONObject jSONObject5 = A17.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION);
                    if (jSONObject5.has(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT)) {
                        str5 = jSONObject5.optString(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT);
                    } else {
                        str5 = null;
                    }
                    if (jSONObject5.has(PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY)) {
                        str6 = jSONObject5.optString(PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY);
                    } else {
                        str6 = null;
                    }
                    if (jSONObject5.has(PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY)) {
                        bool = Boolean.valueOf(jSONObject5.optBoolean(PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY));
                    } else {
                        bool = null;
                    }
                    String A00 = MSV.A00(1696);
                    obj.A02 = new AuthenticatorSelectionCriteria(bool, str5, jSONObject5.has(A00) ? jSONObject5.optString(A00) : null, str6);
                }
                if (A17.has(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS)) {
                    JSONObject jSONObject6 = A17.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
                    zzs zzsVar = null;
                    zzu zzuVar = null;
                    zzak zzakVar = null;
                    FidoAppIdExtension fidoAppIdExtension = jSONObject6.has(PublicKeyCredentialControllerUtility.JSON_KEY_APPID) ? new FidoAppIdExtension(jSONObject6.getString(PublicKeyCredentialControllerUtility.JSON_KEY_APPID)) : jSONObject6.has("fidoAppIdExtension") ? new FidoAppIdExtension(jSONObject6.getJSONObject("fidoAppIdExtension").getString(PublicKeyCredentialControllerUtility.JSON_KEY_APPID)) : null;
                    if (jSONObject6.has("prf")) {
                        if (!jSONObject6.has("prfAlreadyHashed")) {
                            zzakVar = zzak.A00(jSONObject6.getJSONObject("prf"), false);
                        } else {
                            throw new JSONException("both prf and prfAlreadyHashed extensions found");
                        }
                    } else if (jSONObject6.has("prfAlreadyHashed")) {
                        zzakVar = zzak.A00(jSONObject6.getJSONObject("prfAlreadyHashed"), true);
                    }
                    if (jSONObject6.has("cableAuthenticationExtension")) {
                        JSONArray jSONArray4 = jSONObject6.getJSONArray("cableAuthenticationExtension");
                        ArrayList A1E3 = AbstractC166987dD.A1E();
                        for (int i4 = 0; i4 < jSONArray4.length(); i4++) {
                            JSONObject jSONObject7 = jSONArray4.getJSONObject(i4);
                            A1E3.add(new zzq(Base64.decode(jSONObject7.getString("clientEid"), 11), Base64.decode(jSONObject7.getString("authenticatorEid"), 11), Base64.decode(jSONObject7.getString("sessionPreKey"), 11), jSONObject7.getLong("version")));
                        }
                        zzsVar = new zzs(A1E3);
                    }
                    UserVerificationMethodExtension userVerificationMethodExtension = jSONObject6.has("userVerificationMethodExtension") ? new UserVerificationMethodExtension(jSONObject6.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")) : null;
                    zzz zzzVar = jSONObject6.has("google_multiAssertionExtension") ? new zzz(jSONObject6.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")) : null;
                    zzab zzabVar = jSONObject6.has("google_sessionIdExtension") ? new zzab(jSONObject6.getJSONObject("google_sessionIdExtension").getInt("sessionId")) : null;
                    zzad zzadVar = jSONObject6.has("google_silentVerificationExtension") ? new zzad(jSONObject6.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")) : null;
                    if (jSONObject6.has("devicePublicKeyExtension")) {
                        jSONObject6.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                        zzuVar = new Object();
                    }
                    obj.A01 = new AuthenticationExtensions(fidoAppIdExtension, jSONObject6.has("google_thirdPartyPaymentExtension") ? new GoogleThirdPartyPaymentExtension(jSONObject6.getJSONObject("google_thirdPartyPaymentExtension").getBoolean(PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT)) : null, userVerificationMethodExtension, zzabVar, zzadVar, jSONObject6.has("google_tunnelServerIdExtension") ? new zzag(jSONObject6.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, null, zzakVar, jSONObject6.has("txAuthSimple") ? new zzaw(jSONObject6.getString("txAuthSimple")) : null, zzsVar, zzuVar, zzzVar);
                }
                if (A17.has(PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION)) {
                    try {
                        obj.A00 = AttestationConveyancePreference.A00(A17.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION));
                    } catch (RjR e) {
                        Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e);
                        obj.A00 = AttestationConveyancePreference.NONE;
                    }
                }
                obj.A00();
                this.A09 = str2;
                return;
            } catch (JSONException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        C3U5.A02(publicKeyCredentialRpEntity);
        this.A04 = publicKeyCredentialRpEntity;
        C3U5.A02(publicKeyCredentialUserEntity);
        this.A05 = publicKeyCredentialUserEntity;
        C3U5.A02(bArr);
        this.A0C = bArr;
        C3U5.A02(list);
        this.A0A = list;
        this.A07 = d;
        this.A0B = list2;
        this.A03 = authenticatorSelectionCriteria;
        this.A08 = num;
        this.A06 = tokenBinding;
        if (str != null) {
            try {
                this.A01 = AttestationConveyancePreference.A00(str);
            } catch (RjR e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        this.A02 = authenticationExtensions;
    }
}
