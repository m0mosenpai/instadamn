package androidx.credentials.playservices.controllers;

import X.AbstractC167027dH;
import X.AbstractC16830sb;
import X.AbstractC53409Njy;
import X.AbstractC53410Njz;
import X.C14360o3;
import X.C58732Q6f;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.ResultReceiver;
import com.facebook.common.dextricks.Constants;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public class CredentialProviderBaseController {
    public static final String ACTIVITY_REQUEST_CODE_TAG = "ACTIVITY_REQUEST_CODE";
    public static final String BEGIN_SIGN_IN_TAG = "BEGIN_SIGN_IN";
    public static final int CONTROLLER_REQUEST_CODE = 1;
    public static final String CREATE_CANCELED = "CREATE_CANCELED";
    public static final String CREATE_INTERRUPTED = "CREATE_INTERRUPTED";
    public static final String CREATE_PASSWORD_TAG = "CREATE_PASSWORD";
    public static final String CREATE_PUBLIC_KEY_CREDENTIAL_TAG = "CREATE_PUBLIC_KEY_CREDENTIAL";
    public static final String CREATE_UNKNOWN = "CREATE_UNKNOWN";
    public static final String EXCEPTION_MESSAGE_TAG = "EXCEPTION_MESSAGE";
    public static final String EXCEPTION_TYPE_TAG = "EXCEPTION_TYPE";
    public static final String FAILURE_RESPONSE_TAG = "FAILURE_RESPONSE";
    public static final String GET_CANCELED = "GET_CANCELED_TAG";
    public static final String GET_INTERRUPTED = "GET_INTERRUPTED";
    public static final String GET_NO_CREDENTIALS = "GET_NO_CREDENTIALS";
    public static final String GET_UNKNOWN = "GET_UNKNOWN";
    public static final String REQUEST_TAG = "REQUEST_TYPE";
    public static final String RESULT_DATA_TAG = "RESULT_DATA";
    public static final String RESULT_RECEIVER_TAG = "RESULT_RECEIVER";
    public static final String SIGN_IN_INTENT_TAG = "SIGN_IN_INTENT";
    public static final String TYPE_TAG = "TYPE";
    public final Context context;
    public static final Companion Companion = new Object();
    public static final Set retryables = AbstractC16830sb.A07(7, 20);

    /* loaded from: classes10.dex */
    public final class Companion {
        public static /* synthetic */ void getCONTROLLER_REQUEST_CODE$annotations() {
        }

        public final AbstractC53409Njy createCredentialExceptionTypeToException$credentials_play_services_auth_release(String str, String str2) {
            if (C14360o3.A0K(str, CredentialProviderBaseController.CREATE_CANCELED)) {
                return new AbstractC53409Njy("android.credentials.CreateCredentialException.TYPE_USER_CANCELED", str2);
            }
            if (C14360o3.A0K(str, CredentialProviderBaseController.CREATE_INTERRUPTED)) {
                return new AbstractC53409Njy("android.credentials.CreateCredentialException.TYPE_INTERRUPTED", str2);
            }
            return new AbstractC53409Njy("android.credentials.CreateCredentialException.TYPE_UNKNOWN", str2);
        }

        public final int getCONTROLLER_REQUEST_CODE() {
            return CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        }

        public final AbstractC53410Njz getCredentialExceptionTypeToException$credentials_play_services_auth_release(String str, String str2) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1567968963) {
                    if (hashCode != -154594663) {
                        if (hashCode == 1996705159 && str.equals(CredentialProviderBaseController.GET_NO_CREDENTIALS)) {
                            return new AbstractC53410Njz("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL", str2);
                        }
                    } else if (str.equals(CredentialProviderBaseController.GET_INTERRUPTED)) {
                        return new AbstractC53410Njz("android.credentials.GetCredentialException.TYPE_INTERRUPTED", str2);
                    }
                } else if (str.equals(CredentialProviderBaseController.GET_CANCELED)) {
                    return new AbstractC53410Njz("android.credentials.GetCredentialException.TYPE_USER_CANCELED", str2);
                }
            }
            return C58732Q6f.A00(str2);
        }

        public final Set getRetryables() {
            return CredentialProviderBaseController.retryables;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public CredentialProviderBaseController(Context context) {
        C14360o3.A0B(context, 1);
        this.context = context;
    }

    public static final int getCONTROLLER_REQUEST_CODE() {
        return CONTROLLER_REQUEST_CODE;
    }

    public final void generateHiddenActivityIntent(ResultReceiver resultReceiver, Intent intent, String str) {
        AbstractC167027dH.A12(resultReceiver, intent, str);
        intent.putExtra(TYPE_TAG, str);
        intent.putExtra(ACTIVITY_REQUEST_CODE_TAG, CONTROLLER_REQUEST_CODE);
        intent.putExtra(RESULT_RECEIVER_TAG, toIpcFriendlyResultReceiver(resultReceiver));
        intent.setFlags(Constants.LOAD_RESULT_PGO_ATTEMPTED);
    }

    public final ResultReceiver toIpcFriendlyResultReceiver(ResultReceiver resultReceiver) {
        Parcel obtain = Parcel.obtain();
        C14360o3.A07(obtain);
        C14360o3.A0A(resultReceiver);
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }
}
