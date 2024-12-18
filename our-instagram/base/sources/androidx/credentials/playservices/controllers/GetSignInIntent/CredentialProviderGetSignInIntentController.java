package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC53410Njz;
import X.AbstractC58319PtB;
import X.AnonymousClass001;
import X.C00O;
import X.C14360o3;
import X.C3U5;
import X.C50831MdO;
import X.C58732Q6f;
import X.C62471SCy;
import X.C64218T4s;
import X.InterfaceC16820sZ;
import X.InterfaceC65463Tkf;
import X.MSV;
import X.Q6Q;
import X.RGZ;
import X.Rk3;
import X.SAA;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class CredentialProviderGetSignInIntentController extends CredentialProviderController {
    public static final Companion Companion = new Object();
    public static final String TAG = "GetSignInIntent";
    public InterfaceC65463Tkf callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderGetSignInIntentController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$resultReceiver$1] */
    public CredentialProviderGetSignInIntentController(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.context = context;
        final Handler A0J = AbstractC167007dF.A0J();
        this.resultReceiver = new ResultReceiver(A0J) { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                C14360o3.A0B(bundle, 1);
                CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = CredentialProviderGetSignInIntentController.this;
                if (!credentialProviderGetSignInIntentController.maybeReportErrorFromResultReceiver(bundle, new CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion), credentialProviderGetSignInIntentController.getExecutor(), CredentialProviderGetSignInIntentController.this.getCallback(), CredentialProviderGetSignInIntentController.this.cancellationSignal)) {
                    CredentialProviderGetSignInIntentController.this.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i, (Intent) bundle.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
                }
            }
        };
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderGetSignInIntentController getInstance(Context context) {
        C14360o3.A0B(context, 0);
        return new CredentialProviderGetSignInIntentController(context);
    }

    public GetSignInIntentRequest convertRequestToPlayServices(C62471SCy c62471SCy) {
        C14360o3.A0B(c62471SCy, 0);
        List list = c62471SCy.A00;
        if (list.size() == 1) {
            C14360o3.A0C(list.get(0), "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
            throw AbstractC166987dD.A15("getServerClientId");
        }
        throw new AbstractC53410Njz(MSV.A00(913), "GetSignInWithGoogleOption cannot be combined with other options.");
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public SAA convertResponseToCredentialManager(SignInCredential signInCredential) {
        C14360o3.A0B(signInCredential, 0);
        if (signInCredential.A07 != null) {
            return new SAA(createGoogleIdCredential(signInCredential));
        }
        Log.w(TAG, "Credential returned but no google Id found");
        throw C58732Q6f.A00("When attempting to convert get response, null credential found");
    }

    public final Q6Q createGoogleIdCredential(SignInCredential signInCredential) {
        C14360o3.A0B(signInCredential, 0);
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        String str5 = signInCredential.A02;
        C14360o3.A07(str5);
        try {
            String str6 = signInCredential.A07;
            C14360o3.A0A(str6);
            C14360o3.A0B(str6, 0);
            String str7 = signInCredential.A03;
            if (str7 != null) {
                str = str7;
            }
            String str8 = signInCredential.A04;
            if (str8 != null) {
                str3 = str8;
            }
            String str9 = signInCredential.A05;
            if (str9 != null) {
                str2 = str9;
            }
            String str10 = signInCredential.A08;
            if (str10 != null) {
                str4 = str10;
            }
            Uri uri2 = signInCredential.A00;
            if (uri2 != null) {
                uri = uri2;
            }
            return new Q6Q(uri, str5, str6, str, str2, str3, str4);
        } catch (Exception unused) {
            throw C58732Q6f.A00("When attempting to convert get response, null Google ID Token found");
        }
    }

    public final void setCallback(InterfaceC65463Tkf interfaceC65463Tkf) {
        C14360o3.A0B(interfaceC65463Tkf, 0);
        this.callback = interfaceC65463Tkf;
    }

    public final void setExecutor(Executor executor) {
        C14360o3.A0B(executor, 0);
        this.executor = executor;
    }

    /* loaded from: classes10.dex */
    public final class Companion {
        public final CredentialProviderGetSignInIntentController getInstance(Context context) {
            C14360o3.A0B(context, 0);
            return new CredentialProviderGetSignInIntentController(context);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final InterfaceC65463Tkf getCallback() {
        InterfaceC65463Tkf interfaceC65463Tkf = this.callback;
        if (interfaceC65463Tkf != null) {
            return interfaceC65463Tkf;
        }
        C14360o3.A0F("callback");
        throw C00O.createAndThrow();
    }

    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        C14360o3.A0F("executor");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [X.T4s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0ps, java.lang.Object] */
    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        CancellationSignal cancellationSignal;
        InterfaceC16820sZ credentialProviderGetSignInIntentController$handleResponse$6;
        AbstractC53410Njz abstractC53410Njz;
        int i3 = CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            Log.w(TAG, AnonymousClass001.A02(i3, i, "Returned request code ", " which  does not match what was given "));
            return;
        }
        if (CredentialProviderController.Companion.maybeReportErrorResultCodeGet(i2, CredentialProviderGetSignInIntentController$handleResponse$1.INSTANCE, new CredentialProviderGetSignInIntentController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        try {
            Context context = this.context;
            C3U5.A02(context);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$3(this, convertResponseToCredentialManager(new RGZ(context, (C64218T4s) new Object()).A00(intent))));
        } catch (AbstractC53410Njz e) {
            cancellationSignal = this.cancellationSignal;
            credentialProviderGetSignInIntentController$handleResponse$6 = new CredentialProviderGetSignInIntentController$handleResponse$5(this, e);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, credentialProviderGetSignInIntentController$handleResponse$6);
        } catch (Rk3 e2) {
            ?? obj = new Object();
            obj.A00 = C58732Q6f.A00(e2.getMessage());
            int i4 = e2.A00.A00;
            if (i4 == 16) {
                abstractC53410Njz = new AbstractC53410Njz("android.credentials.GetCredentialException.TYPE_USER_CANCELED", e2.getMessage());
            } else {
                if (AbstractC58319PtB.A1W(CredentialProviderBaseController.retryables, i4)) {
                    abstractC53410Njz = new AbstractC53410Njz("android.credentials.GetCredentialException.TYPE_INTERRUPTED", e2.getMessage());
                }
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$4(this, obj));
            }
            obj.A00 = abstractC53410Njz;
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$4(this, obj));
        } catch (Throwable th) {
            C58732Q6f A00 = C58732Q6f.A00(th.getMessage());
            cancellationSignal = this.cancellationSignal;
            credentialProviderGetSignInIntentController$handleResponse$6 = new CredentialProviderGetSignInIntentController$handleResponse$6(this, A00);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, credentialProviderGetSignInIntentController$handleResponse$6);
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(C62471SCy c62471SCy, InterfaceC65463Tkf interfaceC65463Tkf, Executor executor, CancellationSignal cancellationSignal) {
        InterfaceC16820sZ credentialProviderGetSignInIntentController$invokePlayServices$2;
        AbstractC167027dH.A12(c62471SCy, interfaceC65463Tkf, executor);
        this.cancellationSignal = cancellationSignal;
        this.callback = interfaceC65463Tkf;
        this.executor = executor;
        if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            try {
                convertRequestToPlayServices(c62471SCy);
                throw C00O.createAndThrow();
            } catch (Exception e) {
                if (e instanceof C50831MdO) {
                    credentialProviderGetSignInIntentController$invokePlayServices$2 = new CredentialProviderGetSignInIntentController$invokePlayServices$1(this, e);
                } else {
                    credentialProviderGetSignInIntentController$invokePlayServices$2 = new CredentialProviderGetSignInIntentController$invokePlayServices$2(this);
                }
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, credentialProviderGetSignInIntentController$invokePlayServices$2);
            }
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* bridge */ /* synthetic */ Object convertRequestToPlayServices(Object obj) {
        convertRequestToPlayServices((C62471SCy) obj);
        throw C00O.createAndThrow();
    }
}
