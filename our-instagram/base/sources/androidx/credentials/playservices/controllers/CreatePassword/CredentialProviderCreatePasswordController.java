package androidx.credentials.playservices.controllers.CreatePassword;

import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AnonymousClass001;
import X.C00O;
import X.C0eB;
import X.C14360o3;
import X.InterfaceC65463Tkf;
import X.MSW;
import X.Q6H;
import X.Q6J;
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
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class CredentialProviderCreatePasswordController extends CredentialProviderController {
    public static final Companion Companion = new Object();
    public static final String TAG = "CreatePassword";
    public InterfaceC65463Tkf callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderCreatePasswordController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$resultReceiver$1] */
    public CredentialProviderCreatePasswordController(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.context = context;
        final Handler A0J = AbstractC167007dF.A0J();
        this.resultReceiver = new ResultReceiver(A0J) { // from class: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                String str;
                C14360o3.A0B(bundle, 1);
                CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = CredentialProviderCreatePasswordController.this;
                CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                Executor executor = credentialProviderCreatePasswordController.executor;
                if (executor == null) {
                    str = "executor";
                } else {
                    InterfaceC65463Tkf interfaceC65463Tkf = credentialProviderCreatePasswordController.callback;
                    if (interfaceC65463Tkf == null) {
                        str = "callback";
                    } else {
                        if (!credentialProviderCreatePasswordController.maybeReportErrorFromResultReceiver(bundle, credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1, executor, interfaceC65463Tkf, credentialProviderCreatePasswordController.cancellationSignal)) {
                            CredentialProviderCreatePasswordController.this.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i);
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

    public static final CredentialProviderCreatePasswordController getInstance(Context context) {
        C14360o3.A0B(context, 0);
        return new CredentialProviderCreatePasswordController(context);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public SavePasswordRequest convertRequestToPlayServices(Q6H q6h) {
        C14360o3.A0B(q6h, 0);
        return new SavePasswordRequest(new SignInPassword(q6h.A00, q6h.A01), null, 0);
    }

    /* loaded from: classes10.dex */
    public final class Companion {
        public final CredentialProviderCreatePasswordController getInstance(Context context) {
            C14360o3.A0B(context, 0);
            return new CredentialProviderCreatePasswordController(context);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public SA8 convertResponseToCredentialManager(C0eB c0eB) {
        return new Q6J();
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2) {
        int i3 = CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            Log.w(TAG, AnonymousClass001.A02(i3, i, "Returned request code ", " which does not match what was given "));
            return;
        }
        if (CredentialProviderController.Companion.maybeReportErrorResultCodeCreate(i2, CredentialProviderCreatePasswordController$handleResponse$1.INSTANCE, new CredentialProviderCreatePasswordController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePasswordController$handleResponse$3(this, new Q6J()));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(Q6H q6h, InterfaceC65463Tkf interfaceC65463Tkf, Executor executor, CancellationSignal cancellationSignal) {
        AbstractC167027dH.A12(q6h, interfaceC65463Tkf, executor);
        this.cancellationSignal = cancellationSignal;
        this.callback = interfaceC65463Tkf;
        this.executor = executor;
        if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            SavePasswordRequest convertRequestToPlayServices = convertRequestToPlayServices(q6h);
            Intent A08 = MSW.A08(this.context, HiddenActivity.class);
            A08.putExtra(CredentialProviderBaseController.REQUEST_TAG, convertRequestToPlayServices);
            generateHiddenActivityIntent(this.resultReceiver, A08, CredentialProviderBaseController.CREATE_PASSWORD_TAG);
            try {
                this.context.startActivity(A08);
            } catch (Exception unused) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderCreatePasswordController$invokePlayServices$1(this));
            }
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* bridge */ /* synthetic */ Object convertResponseToCredentialManager(Object obj) {
        return new Q6J();
    }
}
