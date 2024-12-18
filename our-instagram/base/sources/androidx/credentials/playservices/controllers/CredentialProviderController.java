package androidx.credentials.playservices.controllers;

import X.AbstractC167007dF;
import X.AbstractC25233BEq;
import X.AbstractC53409Njy;
import X.AbstractC53410Njz;
import X.AnonymousClass001;
import X.C14360o3;
import X.C58732Q6f;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC65463Tkf;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public abstract class CredentialProviderController extends CredentialProviderBaseController {
    public static final Companion Companion = new Object();
    public static final String ERROR_MESSAGE_START_ACTIVITY_FAILED = "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.";
    public final Context context;

    /* loaded from: classes10.dex */
    public final class Companion {
        public final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, InterfaceC16820sZ interfaceC16820sZ) {
            C14360o3.A0B(interfaceC16820sZ, 1);
            if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                interfaceC16820sZ.invoke();
            }
        }

        public final String generateErrorStringCanceled$credentials_play_services_auth_release() {
            return "activity is cancelled by the user.";
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [X.0ps, java.lang.Object] */
        public final boolean maybeReportErrorResultCodeCreate(int i, InterfaceC16620sF interfaceC16620sF, InterfaceC16660sJ interfaceC16660sJ, CancellationSignal cancellationSignal) {
            AbstractC167007dF.A1D(interfaceC16620sF, 1, interfaceC16660sJ);
            if (i != -1) {
                ?? obj = new Object();
                obj.A00 = new AbstractC53409Njy("android.credentials.CreateCredentialException.TYPE_UNKNOWN", AnonymousClass001.A0c("activity with result code: ", " indicating not RESULT_OK", i));
                if (i == 0) {
                    obj.A00 = new AbstractC53409Njy("android.credentials.CreateCredentialException.TYPE_USER_CANCELED", "activity is cancelled by the user.");
                }
                interfaceC16620sF.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1(interfaceC16660sJ, obj));
                return true;
            }
            return false;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [X.0ps, java.lang.Object] */
        public final boolean maybeReportErrorResultCodeGet(int i, InterfaceC16620sF interfaceC16620sF, InterfaceC16660sJ interfaceC16660sJ, CancellationSignal cancellationSignal) {
            AbstractC167007dF.A1D(interfaceC16620sF, 1, interfaceC16660sJ);
            if (i != -1) {
                ?? obj = new Object();
                obj.A00 = C58732Q6f.A00(AnonymousClass001.A0c("activity with result code: ", " indicating not RESULT_OK", i));
                if (i == 0) {
                    obj.A00 = new AbstractC53410Njz("android.credentials.GetCredentialException.TYPE_USER_CANCELED", "activity is cancelled by the user.");
                }
                interfaceC16620sF.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1(interfaceC16660sJ, obj));
                return true;
            }
            return false;
        }

        public final String generateErrorStringUnknown$credentials_play_services_auth_release(int i) {
            return AnonymousClass001.A0c("activity with result code: ", " indicating not RESULT_OK", i);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.context = context;
    }

    public static final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, InterfaceC16820sZ interfaceC16820sZ) {
        Companion.cancelOrCallbackExceptionOrResult(cancellationSignal, interfaceC16820sZ);
    }

    public static final boolean maybeReportErrorResultCodeCreate(int i, InterfaceC16620sF interfaceC16620sF, InterfaceC16660sJ interfaceC16660sJ, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeCreate(i, interfaceC16620sF, interfaceC16660sJ, cancellationSignal);
    }

    public static final boolean maybeReportErrorResultCodeGet(int i, InterfaceC16620sF interfaceC16620sF, InterfaceC16660sJ interfaceC16660sJ, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeGet(i, interfaceC16620sF, interfaceC16660sJ, cancellationSignal);
    }

    public abstract Object convertRequestToPlayServices(Object obj);

    public abstract Object convertResponseToCredentialManager(Object obj);

    public abstract void invokePlayServices(Object obj, InterfaceC65463Tkf interfaceC65463Tkf, Executor executor, CancellationSignal cancellationSignal);

    public final boolean maybeReportErrorFromResultReceiver(Bundle bundle, InterfaceC16620sF interfaceC16620sF, Executor executor, InterfaceC65463Tkf interfaceC65463Tkf, CancellationSignal cancellationSignal) {
        C14360o3.A0B(bundle, 0);
        AbstractC25233BEq.A0v(1, interfaceC16620sF, executor, interfaceC65463Tkf);
        if (!bundle.getBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG)) {
            return false;
        }
        cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderController$maybeReportErrorFromResultReceiver$1(executor, interfaceC65463Tkf, interfaceC16620sF.invoke(bundle.getString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG), bundle.getString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG))));
        return true;
    }
}
