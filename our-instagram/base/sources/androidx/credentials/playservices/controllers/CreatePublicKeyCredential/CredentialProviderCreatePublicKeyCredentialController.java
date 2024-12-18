package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC53409Njy;
import X.AnonymousClass001;
import X.C00O;
import X.C14360o3;
import X.C58737Q6k;
import X.InterfaceC16820sZ;
import X.InterfaceC65463Tkf;
import X.MSW;
import X.Q6G;
import X.Q6K;
import X.Q76;
import X.Q79;
import X.SA8;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;

/* loaded from: classes10.dex */
public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController {
    public static final Companion Companion = new Object();
    public static final String TAG = "CreatePublicKey";
    public InterfaceC65463Tkf callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1] */
    public CredentialProviderCreatePublicKeyCredentialController(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.context = context;
        final Handler A0J = AbstractC167007dF.A0J();
        this.resultReceiver = new ResultReceiver(A0J) { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                String str;
                C14360o3.A0B(bundle, 1);
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
                CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
                if (executor == null) {
                    str = "executor";
                } else {
                    InterfaceC65463Tkf interfaceC65463Tkf = credentialProviderCreatePublicKeyCredentialController.callback;
                    if (interfaceC65463Tkf == null) {
                        str = "callback";
                    } else {
                        if (!credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(bundle, credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor, interfaceC65463Tkf, credentialProviderCreatePublicKeyCredentialController.cancellationSignal)) {
                            CredentialProviderCreatePublicKeyCredentialController.this.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i, (Intent) bundle.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
                            return;
                        }
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        };
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
        C14360o3.A0B(context, 0);
        return new CredentialProviderCreatePublicKeyCredentialController(context);
    }

    public static final void handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        C14360o3.A0B(credentialProviderCreatePublicKeyCredentialController, 0);
        InterfaceC65463Tkf interfaceC65463Tkf = credentialProviderCreatePublicKeyCredentialController.callback;
        if (interfaceC65463Tkf == null) {
            C14360o3.A0F("callback");
            throw C00O.createAndThrow();
        }
        interfaceC65463Tkf.DEG(new Q79(new Q76(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public PublicKeyCredentialCreationOptions convertRequestToPlayServices(Q6G q6g) {
        C14360o3.A0B(q6g, 0);
        return PublicKeyCredentialControllerUtility.Companion.convert(q6g);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public SA8 convertResponseToCredentialManager(PublicKeyCredential publicKeyCredential) {
        C14360o3.A0B(publicKeyCredential, 0);
        try {
            String A00 = publicKeyCredential.A00();
            C14360o3.A07(A00);
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", A00);
            return new Q6K(A00, A0b);
        } catch (Throwable th) {
            throw new AbstractC53409Njy("android.credentials.CreateCredentialException.TYPE_UNKNOWN", AbstractC166997dE.A0y("The PublicKeyCredential response json had an unexpected exception when parsing: ", th));
        }
    }

    /* loaded from: classes10.dex */
    public final class Companion {
        public final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
            C14360o3.A0B(context, 0);
            return new CredentialProviderCreatePublicKeyCredentialController(context);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        byte[] byteArrayExtra;
        CancellationSignal cancellationSignal;
        InterfaceC16820sZ credentialProviderCreatePublicKeyCredentialController$handleResponse$7;
        InterfaceC16820sZ interfaceC16820sZ;
        int i3 = CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            Log.w(TAG, AnonymousClass001.A02(i3, i, "Returned request code ", " does not match what was given "));
            return;
        }
        if (CredentialProviderController.Companion.maybeReportErrorResultCodeCreate(i2, CredentialProviderCreatePublicKeyCredentialController$handleResponse$1.INSTANCE, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        if (intent != null && (byteArrayExtra = intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA")) != null) {
            PublicKeyCredential publicKeyCredential = (PublicKeyCredential) SafeParcelableSerializer.A00(PublicKeyCredential.CREATOR, byteArrayExtra);
            C14360o3.A07(publicKeyCredential);
            AbstractC53409Njy publicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.Companion.publicKeyCredentialResponseContainsError(publicKeyCredential);
            if (publicKeyCredentialResponseContainsError != null) {
                cancellationSignal = this.cancellationSignal;
                interfaceC16820sZ = new CredentialProviderCreatePublicKeyCredentialController$handleResponse$4(this, publicKeyCredentialResponseContainsError);
            } else {
                try {
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$5(this, convertResponseToCredentialManager(publicKeyCredential)));
                    return;
                } catch (JSONException e) {
                    cancellationSignal = this.cancellationSignal;
                    credentialProviderCreatePublicKeyCredentialController$handleResponse$7 = new CredentialProviderCreatePublicKeyCredentialController$handleResponse$6(this, e);
                    interfaceC16820sZ = credentialProviderCreatePublicKeyCredentialController$handleResponse$7;
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, interfaceC16820sZ);
                    return;
                } catch (Throwable th) {
                    cancellationSignal = this.cancellationSignal;
                    credentialProviderCreatePublicKeyCredentialController$handleResponse$7 = new CredentialProviderCreatePublicKeyCredentialController$handleResponse$7(this, th);
                    interfaceC16820sZ = credentialProviderCreatePublicKeyCredentialController$handleResponse$7;
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, interfaceC16820sZ);
                    return;
                }
            }
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, interfaceC16820sZ);
            return;
        }
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(this.cancellationSignal)) {
            return;
        }
        Executor executor = this.executor;
        if (executor == null) {
            C14360o3.A0F("executor");
            throw C00O.createAndThrow();
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Q79 JSONExceptionToPKCError(JSONException jSONException) {
        String message = jSONException.getMessage();
        if (message != null && message.length() > 0) {
            return new Q79(new C58737Q6k(), message);
        }
        return new Q79(new C58737Q6k(), "Unknown error");
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(Q6G q6g, InterfaceC65463Tkf interfaceC65463Tkf, Executor executor, CancellationSignal cancellationSignal) {
        InterfaceC16820sZ credentialProviderCreatePublicKeyCredentialController$invokePlayServices$2;
        AbstractC167027dH.A12(q6g, interfaceC65463Tkf, executor);
        this.cancellationSignal = cancellationSignal;
        this.callback = interfaceC65463Tkf;
        this.executor = executor;
        try {
            PublicKeyCredentialCreationOptions convert = PublicKeyCredentialControllerUtility.Companion.convert(q6g);
            if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                Intent A08 = MSW.A08(this.context, HiddenActivity.class);
                A08.putExtra(CredentialProviderBaseController.REQUEST_TAG, convert);
                generateHiddenActivityIntent(this.resultReceiver, A08, CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
                try {
                    this.context.startActivity(A08);
                } catch (Exception unused) {
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3(this));
                }
            }
        } catch (JSONException e) {
            credentialProviderCreatePublicKeyCredentialController$invokePlayServices$2 = new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1(this, e);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, credentialProviderCreatePublicKeyCredentialController$invokePlayServices$2);
        } catch (Throwable th) {
            credentialProviderCreatePublicKeyCredentialController$invokePlayServices$2 = new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2(this, th);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, credentialProviderCreatePublicKeyCredentialController$invokePlayServices$2);
        }
    }
}
