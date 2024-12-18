package com.instagram.acp.igacpsecuritykey;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.AbstractC58437PvG;
import X.C00X;
import X.C0K8;
import X.C0f9;
import X.C11L;
import X.C14360o3;
import X.C5KS;
import X.C61Q;
import X.C61X;
import X.C62947SYp;
import X.C63538Sp6;
import X.DRW;
import X.InterfaceC1335661b;
import X.InterfaceC65406Tjd;
import X.MSY;
import X.RGS;
import X.SPT;
import X.SWk;
import X.T70;
import X.T7C;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.fido.fido2.zzg;
import com.google.android.gms.internal.fido.zza;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class IGACPSecurityKeySignInActivity extends IgFragmentActivity {
    public final C00X A00 = registerForActivityResult(new Object(), new C63538Sp6(this, 3));
    public final String A01 = "IGACPSecurityKeySignInActivity";

    public static final JSONObject A00(AuthenticatorAssertionResponse authenticatorAssertionResponse) {
        String str;
        String A02 = SPT.A01.A02(authenticatorAssertionResponse.A01.A03());
        String encodeToString = Base64.encodeToString(authenticatorAssertionResponse.A02.A03(), 2);
        String encodeToString2 = Base64.encodeToString(authenticatorAssertionResponse.A03.A03(), 2);
        byte[] A1Z = AbstractC58322PtE.A1Z(authenticatorAssertionResponse.A04);
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put("authenticator_data", encodeToString);
        A0q.put("client_data_json", A02);
        A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, encodeToString2);
        if (A1Z == null || (str = A1Z.toString()) == null) {
            str = "";
        }
        A0q.put("user_handle", str);
        String A022 = SPT.A02.A02(authenticatorAssertionResponse.A00.A03());
        C14360o3.A0A(A022);
        String A0s = AbstractC58319PtB.A0s(new C11L("/").A00(A022, "_"), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, "");
        JSONObject A0q2 = AbstractC31171DnF.A0q();
        A0q2.put("credential_id", A0s);
        A0q2.put("raw_id", A0s);
        A0q2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "public-key");
        A0q2.put(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, A0q);
        return A0q2;
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return null;
    }

    public static final void A01(IGACPSecurityKeySignInActivity iGACPSecurityKeySignInActivity, Integer num, String str) {
        Intent A04 = AbstractC31171DnF.A04();
        iGACPSecurityKeySignInActivity.setResult(0, A04);
        A04.putExtra("extra_result_error_code", num);
        A04.putExtra("extra_result_error_message", str);
        iGACPSecurityKeySignInActivity.finish();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        setResult(0, AbstractC31171DnF.A04());
        finish();
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, X.61b] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.RGS, X.61Q] */
    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-778430842);
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("extra_challenge");
        String stringExtra2 = intent.getStringExtra("extra_rpid");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("extra_allow_credentials");
        if (stringExtra != null && stringExtra2 != null && stringArrayListExtra != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator<String> it = stringArrayListExtra.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                if (A1B.length() != 0) {
                    Parcelable.Creator creator = PublicKeyCredentialDescriptor.CREATOR;
                    A1E.add(new PublicKeyCredentialDescriptor(PublicKeyCredentialType.A01.toString(), null, Base64.decode(A1B, 10)));
                }
            }
            if (!A1E.isEmpty() && stringExtra2.length() != 0 && stringExtra.length() != 0) {
                final PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = new PublicKeyCredentialRequestOptions(null, null, null, null, null, null, stringExtra2, null, null, A1E, MSY.A1a(stringExtra));
                final ?? c61q = new C61Q(this, C61X.A00, RGS.A00, (InterfaceC1335661b) new Object());
                C62947SYp A002 = SWk.A00();
                A002.A01 = new InterfaceC65406Tjd() { // from class: X.T5I
                    @Override // X.InterfaceC65406Tjd
                    public final void accept(Object obj, Object obj2) {
                        zzg zzgVar = new zzg((C58411Pup) obj2);
                        zza zzaVar = (zza) ((BaseGmsClient) obj).A03();
                        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions2 = publicKeyCredentialRequestOptions;
                        int A03 = C0f9.A03(-371256735);
                        int A032 = C0f9.A03(-583546164);
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
                        C0f9.A0A(-746055467, A032);
                        obtain.writeStrongBinder(zzgVar);
                        obtain.writeInt(1);
                        publicKeyCredentialRequestOptions2.writeToParcel(obtain, 0);
                        zzaVar.A00(obtain, 2);
                        C0f9.A0A(1978984992, A03);
                    }
                };
                A002.A00 = 5408;
                C5KS A003 = C61Q.A00(c61q, A002.A01(), 0);
                T70 t70 = new T70(this, 1);
                Executor executor = AbstractC58437PvG.A00;
                A003.A0B(t70, executor);
                A003.A04(new T7C(3, new DRW(this, 13)), executor);
            } else {
                C0K8.A0C(this.A01, "Unable to create the PublicKeyCredentialRequestOptions empty parameters");
                A01(this, null, "Unable to create the PublicKeyCredentialRequestOptions empty parameters");
            }
        } else {
            C0K8.A0C(this.A01, "Unable to create the PublicKeyCredentialRequestOptions missing parameters");
            A01(this, null, "Unable to create the PublicKeyCredentialRequestOptions missing parameters");
        }
        C0f9.A07(205975473, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return null;
    }
}
