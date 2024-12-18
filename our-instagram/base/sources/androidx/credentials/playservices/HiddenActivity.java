package androidx.credentials.playservices;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AbstractC58437PvG;
import X.C0f9;
import X.C14360o3;
import X.C3U5;
import X.C5KS;
import X.C61Q;
import X.C61X;
import X.C62947SYp;
import X.C64218T4s;
import X.InterfaceC1335661b;
import X.InterfaceC16660sJ;
import X.InterfaceC65406Tjd;
import X.InterfaceC65424Tjv;
import X.RGS;
import X.RGX;
import X.RGZ;
import X.Rk3;
import X.SA3;
import X.SWk;
import X.YO1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.zzf;
import com.google.android.gms.internal.fido.zza;
import com.google.android.gms.internal.p002authapi.zba;
import com.google.android.gms.internal.p002authapi.zbav;
import com.google.android.gms.internal.p002authapi.zbbc;
import com.google.android.gms.internal.p002authapi.zbbe;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public class HiddenActivity extends Activity {
    public static final Companion Companion = new Object();
    public static final int DEFAULT_VALUE = 1;
    public static final String KEY_AWAITING_RESULT = "androidx.credentials.playservices.AWAITING_RESULT";
    public static final String TAG = "HiddenActivity";
    public boolean mWaitingForActivityResult;
    public ResultReceiver resultReceiver;

    public static final void handleBeginSignIn$lambda$10$lambda$8(InterfaceC16660sJ interfaceC16660sJ, Object obj) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        interfaceC16660sJ.invoke(obj);
    }

    public static final void handleCreatePassword$lambda$14$lambda$12(InterfaceC16660sJ interfaceC16660sJ, Object obj) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        interfaceC16660sJ.invoke(obj);
    }

    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$0(InterfaceC16660sJ interfaceC16660sJ, Object obj) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        interfaceC16660sJ.invoke(obj);
    }

    public static final void handleGetSignInIntent$lambda$6$lambda$4(InterfaceC16660sJ interfaceC16660sJ, Object obj) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        interfaceC16660sJ.invoke(obj);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        bundle.putBoolean(KEY_AWAITING_RESULT, this.mWaitingForActivityResult);
        super.onSaveInstanceState(bundle);
    }

    /* loaded from: classes10.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.T4s, java.lang.Object] */
    private final void handleBeginSignIn() {
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (beginSignInRequest != null) {
            final RGZ rgz = new RGZ((Activity) this, (C64218T4s) new Object());
            new BeginSignInRequest.GoogleIdTokenRequestOptions(null, null, null, null, false, true, false);
            BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = beginSignInRequest.A01;
            C3U5.A02(googleIdTokenRequestOptions);
            BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = beginSignInRequest.A04;
            C3U5.A02(passwordRequestOptions);
            BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = beginSignInRequest.A03;
            C3U5.A02(passkeysRequestOptions);
            BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = beginSignInRequest.A02;
            C3U5.A02(passkeyJsonRequestOptions);
            boolean z = beginSignInRequest.A06;
            final BeginSignInRequest beginSignInRequest2 = new BeginSignInRequest(googleIdTokenRequestOptions, passkeyJsonRequestOptions, passkeysRequestOptions, passwordRequestOptions, rgz.A00, beginSignInRequest.A00, z);
            C62947SYp A00 = SWk.A00();
            A00.A03 = new Feature[]{SA3.A00};
            A00.A01 = new InterfaceC65406Tjd() { // from class: X.T5L
                @Override // X.InterfaceC65406Tjd
                public final void accept(Object obj, Object obj2) {
                    BeginSignInRequest beginSignInRequest3 = beginSignInRequest2;
                    zbbc zbbcVar = new zbbc((C58411Pup) obj2);
                    zba zbaVar = (zba) ((BaseGmsClient) obj).A03();
                    C3U5.A02(beginSignInRequest3);
                    int A03 = C0f9.A03(100747770);
                    zbaVar.A01(zba.A00(zbbcVar, beginSignInRequest3, zbaVar), 1);
                    C0f9.A0A(895529720, A03);
                }
            };
            A00.A02 = false;
            C5KS A002 = C62947SYp.A00(rgz, A00, 1553, 0);
            final HiddenActivity$handleBeginSignIn$1$1 hiddenActivity$handleBeginSignIn$1$1 = new HiddenActivity$handleBeginSignIn$1$1(this, intExtra);
            A002.A04(new YO1() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda4
                @Override // X.YO1
                public final void onSuccess(Object obj) {
                    HiddenActivity.handleBeginSignIn$lambda$10$lambda$8(InterfaceC16660sJ.this, obj);
                }
            }, AbstractC58437PvG.A00);
            A002.A0A(new InterfaceC65424Tjv() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda5
                @Override // X.InterfaceC65424Tjv
                public final void onFailure(Exception exc) {
                    HiddenActivity.handleBeginSignIn$lambda$10$lambda$9(HiddenActivity.this, exc);
                }
            });
            return;
        }
        finish();
    }

    private final void restoreState(Bundle bundle) {
        if (bundle != null) {
            this.mWaitingForActivityResult = bundle.getBoolean(KEY_AWAITING_RESULT, false);
        }
    }

    public static final void handleBeginSignIn$lambda$10$lambda$9(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        AbstractC167017dG.A1N(hiddenActivity, exc);
        if ((exc instanceof Rk3) && AbstractC58319PtB.A1W(CredentialProviderBaseController.retryables, ((Rk3) exc).A00.A00)) {
            str = CredentialProviderBaseController.GET_INTERRUPTED;
        } else {
            str = CredentialProviderBaseController.GET_NO_CREDENTIALS;
        }
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        C14360o3.A0A(resultReceiver);
        hiddenActivity.setupFailure(resultReceiver, str, AbstractC166997dE.A0y("During begin sign in, failure response from one tap: ", exc));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.T4r, java.lang.Object] */
    private final void handleCreatePassword() {
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (savePasswordRequest != null) {
            final RGX rgx = new RGX(this, new Object());
            final SavePasswordRequest savePasswordRequest2 = new SavePasswordRequest(savePasswordRequest.A01, rgx.A00, savePasswordRequest.A00);
            C62947SYp A00 = SWk.A00();
            A00.A03 = new Feature[]{SA3.A04};
            A00.A01 = new InterfaceC65406Tjd() { // from class: X.T5K
                @Override // X.InterfaceC65406Tjd
                public final void accept(Object obj, Object obj2) {
                    SavePasswordRequest savePasswordRequest3 = savePasswordRequest2;
                    zbav zbavVar = new zbav((C58411Pup) obj2);
                    zba zbaVar = (zba) ((BaseGmsClient) obj).A03();
                    C3U5.A02(savePasswordRequest3);
                    int A03 = C0f9.A03(-2047719763);
                    zbaVar.A01(zba.A00(zbavVar, savePasswordRequest3, zbaVar), 2);
                    C0f9.A0A(1276285557, A03);
                }
            };
            A00.A02 = false;
            C5KS A002 = C62947SYp.A00(rgx, A00, 1536, 0);
            final HiddenActivity$handleCreatePassword$1$1 hiddenActivity$handleCreatePassword$1$1 = new HiddenActivity$handleCreatePassword$1$1(this, intExtra);
            A002.A04(new YO1() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda6
                @Override // X.YO1
                public final void onSuccess(Object obj) {
                    HiddenActivity.handleCreatePassword$lambda$14$lambda$12(InterfaceC16660sJ.this, obj);
                }
            }, AbstractC58437PvG.A00);
            A002.A0A(new InterfaceC65424Tjv() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda7
                @Override // X.InterfaceC65424Tjv
                public final void onFailure(Exception exc) {
                    HiddenActivity.handleCreatePassword$lambda$14$lambda$13(HiddenActivity.this, exc);
                }
            });
            return;
        }
        finish();
    }

    public static final void handleCreatePassword$lambda$14$lambda$13(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        AbstractC167017dG.A1N(hiddenActivity, exc);
        if ((exc instanceof Rk3) && AbstractC58319PtB.A1W(CredentialProviderBaseController.retryables, ((Rk3) exc).A00.A00)) {
            str = CredentialProviderBaseController.CREATE_INTERRUPTED;
        } else {
            str = CredentialProviderBaseController.CREATE_UNKNOWN;
        }
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        C14360o3.A0A(resultReceiver);
        hiddenActivity.setupFailure(resultReceiver, str, AbstractC166997dE.A0y("During save password, found password failure response from one tap ", exc));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.61b] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.RGS, X.61Q] */
    private final void handleCreatePublicKeyCredential() {
        final PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (publicKeyCredentialCreationOptions != null) {
            final ?? c61q = new C61Q(this, C61X.A00, RGS.A00, (InterfaceC1335661b) new Object());
            C62947SYp A00 = SWk.A00();
            A00.A01 = new InterfaceC65406Tjd() { // from class: X.T5H
                @Override // X.InterfaceC65406Tjd
                public final void accept(Object obj, Object obj2) {
                    zzf zzfVar = new zzf((C58411Pup) obj2);
                    zza zzaVar = (zza) ((BaseGmsClient) obj).A03();
                    PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions2 = publicKeyCredentialCreationOptions;
                    int A03 = C0f9.A03(1408861356);
                    int A032 = C0f9.A03(-583546164);
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
                    C0f9.A0A(-746055467, A032);
                    obtain.writeStrongBinder(zzfVar);
                    obtain.writeInt(1);
                    publicKeyCredentialCreationOptions2.writeToParcel(obtain, 0);
                    zzaVar.A00(obtain, 1);
                    C0f9.A0A(-947669095, A03);
                }
            };
            A00.A00 = 5407;
            C5KS A002 = C61Q.A00(c61q, A00.A01(), 0);
            final HiddenActivity$handleCreatePublicKeyCredential$1$1 hiddenActivity$handleCreatePublicKeyCredential$1$1 = new HiddenActivity$handleCreatePublicKeyCredential$1$1(this, intExtra);
            A002.A04(new YO1() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda0
                @Override // X.YO1
                public final void onSuccess(Object obj) {
                    HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$0(InterfaceC16660sJ.this, obj);
                }
            }, AbstractC58437PvG.A00);
            A002.A0A(new InterfaceC65424Tjv() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda1
                @Override // X.InterfaceC65424Tjv
                public final void onFailure(Exception exc) {
                    HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity.this, exc);
                }
            });
            return;
        }
        Log.w(TAG, "During create public key credential, request is null, so nothing to launch for public key credentials");
        finish();
    }

    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        AbstractC167017dG.A1N(hiddenActivity, exc);
        if ((exc instanceof Rk3) && AbstractC58319PtB.A1W(CredentialProviderBaseController.retryables, ((Rk3) exc).A00.A00)) {
            str = CredentialProviderBaseController.CREATE_INTERRUPTED;
        } else {
            str = CredentialProviderBaseController.CREATE_UNKNOWN;
        }
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        C14360o3.A0A(resultReceiver);
        hiddenActivity.setupFailure(resultReceiver, str, AbstractC166997dE.A0y("During create public key credential, fido registration failure: ", exc));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.T4s, java.lang.Object] */
    private final void handleGetSignInIntent() {
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (getSignInIntentRequest != null) {
            final RGZ rgz = new RGZ((Activity) this, (C64218T4s) new Object());
            String str = getSignInIntentRequest.A01;
            C3U5.A02(str);
            String str2 = getSignInIntentRequest.A04;
            String str3 = getSignInIntentRequest.A02;
            boolean z = getSignInIntentRequest.A05;
            final GetSignInIntentRequest getSignInIntentRequest2 = new GetSignInIntentRequest(str, str3, rgz.A00, str2, getSignInIntentRequest.A00, z);
            C62947SYp A00 = SWk.A00();
            A00.A03 = new Feature[]{SA3.A05};
            A00.A01 = new InterfaceC65406Tjd() { // from class: X.T5M
                @Override // X.InterfaceC65406Tjd
                public final void accept(Object obj, Object obj2) {
                    GetSignInIntentRequest getSignInIntentRequest3 = getSignInIntentRequest2;
                    zbbe zbbeVar = new zbbe((C58411Pup) obj2);
                    zba zbaVar = (zba) ((BaseGmsClient) obj).A03();
                    C3U5.A02(getSignInIntentRequest3);
                    int A03 = C0f9.A03(-952634903);
                    zbaVar.A01(zba.A00(zbbeVar, getSignInIntentRequest3, zbaVar), 3);
                    C0f9.A0A(-817663096, A03);
                }
            };
            C5KS A002 = C62947SYp.A00(rgz, A00, 1555, 0);
            final HiddenActivity$handleGetSignInIntent$1$1 hiddenActivity$handleGetSignInIntent$1$1 = new HiddenActivity$handleGetSignInIntent$1$1(this, intExtra);
            A002.A04(new YO1() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda2
                @Override // X.YO1
                public final void onSuccess(Object obj) {
                    HiddenActivity.handleGetSignInIntent$lambda$6$lambda$4(InterfaceC16660sJ.this, obj);
                }
            }, AbstractC58437PvG.A00);
            A002.A0A(new InterfaceC65424Tjv() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda3
                @Override // X.InterfaceC65424Tjv
                public final void onFailure(Exception exc) {
                    HiddenActivity.handleGetSignInIntent$lambda$6$lambda$5(HiddenActivity.this, exc);
                }
            });
            return;
        }
        finish();
    }

    public static final void handleGetSignInIntent$lambda$6$lambda$5(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        AbstractC167017dG.A1N(hiddenActivity, exc);
        if ((exc instanceof Rk3) && AbstractC58319PtB.A1W(CredentialProviderBaseController.retryables, ((Rk3) exc).A00.A00)) {
            str = CredentialProviderBaseController.GET_INTERRUPTED;
        } else {
            str = CredentialProviderBaseController.GET_NO_CREDENTIALS;
        }
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        C14360o3.A0A(resultReceiver);
        hiddenActivity.setupFailure(resultReceiver, str, AbstractC166997dE.A0y("During get sign-in intent, failure response from one tap: ", exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupFailure(ResultReceiver resultReceiver, String str, String str2) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, true);
        A0b.putString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG, str);
        A0b.putString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG, str2);
        resultReceiver.send(Integer.MAX_VALUE, A0b);
        finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, false);
        A0b.putInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, i);
        A0b.putParcelable(CredentialProviderBaseController.RESULT_DATA_TAG, intent);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            resultReceiver.send(i2, A0b);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        int A09 = AbstractC58321PtD.A09(this, 836628341);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra(CredentialProviderBaseController.TYPE_TAG);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG);
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        restoreState(bundle);
        if (this.mWaitingForActivityResult) {
            i = -2040202793;
        } else {
            if (stringExtra != null) {
                switch (stringExtra.hashCode()) {
                    case -441061071:
                        if (stringExtra.equals(CredentialProviderBaseController.BEGIN_SIGN_IN_TAG)) {
                            handleBeginSignIn();
                            break;
                        }
                        break;
                    case 15545322:
                        if (stringExtra.equals(CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                            handleCreatePublicKeyCredential();
                            break;
                        }
                        break;
                    case 1246634622:
                        if (stringExtra.equals(CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                            handleCreatePassword();
                            break;
                        }
                        break;
                    case 1980564212:
                        if (stringExtra.equals(CredentialProviderBaseController.SIGN_IN_INTENT_TAG)) {
                            handleGetSignInIntent();
                            break;
                        }
                        break;
                }
                i = 1144566155;
            }
            Log.w(TAG, "Activity handed an unsupported type");
            finish();
            i = 1144566155;
        }
        C0f9.A07(i, A09);
    }
}
