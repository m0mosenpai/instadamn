package X;

import android.content.Context;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialRequest;
import android.credentials.Credential;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import com.facebook.R;
import java.util.concurrent.Executor;

/* renamed from: X.Sq4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63597Sq4 implements InterfaceC58096PpL {
    public final CredentialManager A00;

    public static final AbstractC53409Njy A01(CreateCredentialException createCredentialException) {
        Exception A00;
        String type = createCredentialException.getType();
        switch (type.hashCode()) {
            case -2055374133:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    return new AbstractC53409Njy("android.credentials.CreateCredentialException.TYPE_USER_CANCELED", createCredentialException.getMessage());
                }
                break;
            case 1316905704:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    return new AbstractC53409Njy("android.credentials.CreateCredentialException.TYPE_UNKNOWN", createCredentialException.getMessage());
                }
                break;
            case 2092588512:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                    return new AbstractC53409Njy("android.credentials.CreateCredentialException.TYPE_INTERRUPTED", createCredentialException.getMessage());
                }
                break;
            case 2131915191:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                    return new AbstractC53409Njy("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS", createCredentialException.getMessage());
                }
                break;
        }
        String type2 = createCredentialException.getType();
        C14360o3.A07(type2);
        boolean A1a = AbstractC43592JPx.A1a("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", 1, type2);
        String type3 = createCredentialException.getType();
        C14360o3.A07(type3);
        String message = createCredentialException.getMessage();
        if (A1a) {
            try {
                if (AbstractC001900j.A0a(type3, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    try {
                        Q79 q79 = new Q79(new Q76(), null);
                        if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_ABORT_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58733Q6g(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_CONSTRAINT_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58734Q6h(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_DATA_CLONE_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58735Q6i(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_DATA_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58736Q6j(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_ENCODING_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58737Q6k(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58738Q6l(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58739Q6m(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_INVALID_CHARACTER_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58740Q6n(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58741Q6o(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58742Q6p(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_INVALID_STATE_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58743Q6q(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_NAMESPACE_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58744Q6r(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_NETWORK_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58745Q6s(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58746Q6t(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_NOT_ALLOWED_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58747Q6u(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_NOT_FOUND_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58748Q6v(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_NOT_READABLE_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58749Q6w(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_NOT_SUPPORTED_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58750Q6x(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_OPERATION_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58751Q6y(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_OPT_OUT_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58752Q6z(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new Q70(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_READ_ONLY_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new Q71(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_SECURITY_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new Q72(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_SYNTAX_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new Q73(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_TIMEOUT_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new Q74(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new Q75(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_UNKNOWN_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new Q76(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_VERSION_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new Q77(), q79, message);
                        } else if (A03("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new Q78(), q79, message);
                        } else {
                            throw new Exception();
                        }
                        return (AbstractC53409Njy) A00;
                    } catch (C61246Rjj unused) {
                        return new Q6Y(type3, message);
                    }
                }
                throw new Exception();
            } catch (C61246Rjj unused2) {
                return new Q6Y(type3, message);
            }
        }
        return new Q6Y(type3, message);
    }

    @Override // X.InterfaceC58096PpL
    public final void onCreateCredential(Context context, SH5 sh5, CancellationSignal cancellationSignal, Executor executor, InterfaceC65463Tkf interfaceC65463Tkf) {
        int i;
        C57514Pfo c57514Pfo = new C57514Pfo(interfaceC65463Tkf, 15);
        CredentialManager credentialManager = this.A00;
        if (credentialManager == null) {
            c57514Pfo.invoke();
            return;
        }
        C63466Sl6 c63466Sl6 = new C63466Sl6(sh5, interfaceC65463Tkf, this);
        C14360o3.A0A(credentialManager);
        String str = sh5.A03;
        Bundle bundle = sh5.A01;
        SFG sfg = sh5.A02;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", sfg.A01);
        CharSequence charSequence = sfg.A00;
        if (!TextUtils.isEmpty(charSequence)) {
            A0b.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        String str2 = sfg.A02;
        if (!TextUtils.isEmpty(str2)) {
            A0b.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", str2);
        }
        if (sh5 instanceof Q6H) {
            i = R.drawable.ic_password;
        } else {
            boolean z = sh5 instanceof Q6G;
            i = R.drawable.ic_other_sign_in;
            if (z) {
                i = R.drawable.ic_passkey;
            }
        }
        A0b.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, i));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", A0b);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder(str, bundle, sh5.A00).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        C14360o3.A07(alwaysSendAppInfoToProvider);
        CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
        C14360o3.A07(build);
        credentialManager.createCredential(context, build, cancellationSignal, executor, c63466Sl6);
    }

    @Override // X.InterfaceC58096PpL
    public final boolean isAvailableOnDevice() {
        if (Build.VERSION.SDK_INT >= 34 && this.A00 != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC58096PpL
    public final void onGetCredential(Context context, C62471SCy c62471SCy, CancellationSignal cancellationSignal, Executor executor, InterfaceC65463Tkf interfaceC65463Tkf) {
        C57514Pfo c57514Pfo = new C57514Pfo(interfaceC65463Tkf, 16);
        CredentialManager credentialManager = this.A00;
        if (credentialManager == null) {
            c57514Pfo.invoke();
            return;
        }
        C63465Sl5 c63465Sl5 = new C63465Sl5(interfaceC65463Tkf, this);
        C14360o3.A0A(credentialManager);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        A0b.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", c62471SCy.A01);
        A0b.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(A0b);
        for (SI4 si4 : c62471SCy.A00) {
            builder.addCredentialOption(new CredentialOption.Builder(si4.A02, si4.A01, si4.A00).setIsSystemProviderRequired(false).setAllowedProviders(si4.A03).build());
        }
        GetCredentialRequest build = builder.build();
        C14360o3.A07(build);
        credentialManager.getCredential(context, build, cancellationSignal, executor, c63465Sl5);
    }

    public C63597Sq4(Context context) {
        this.A00 = (CredentialManager) context.getSystemService("credential");
    }

    public static final SAA A00(GetCredentialResponse getCredentialResponse) {
        SA9 sa9;
        Credential credential = getCredentialResponse.getCredential();
        C14360o3.A07(credential);
        String type = credential.getType();
        C14360o3.A07(type);
        Bundle data = credential.getData();
        C14360o3.A07(data);
        try {
        } catch (C61246Rjj unused) {
            sa9 = new SA9(data);
            if (type.length() <= 0) {
                throw AbstractC166987dD.A12("type should not be empty");
            }
        }
        if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                String string2 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                C14360o3.A0A(string);
                C14360o3.A0A(string2);
                sa9 = new Q6M(data, string, string2);
                return new SAA(sa9);
            } catch (Exception unused2) {
                throw new Exception();
            }
        }
        if (type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
            try {
                String string3 = data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                C14360o3.A0A(string3);
                sa9 = new Q6L(string3, data);
                return new SAA(sa9);
            } catch (Exception unused3) {
                throw new Exception();
            }
        }
        throw new Exception();
    }

    public static final AbstractC53410Njz A02(GetCredentialException getCredentialException) {
        Exception A00;
        String type = getCredentialException.getType();
        switch (type.hashCode()) {
            case -781118336:
                if (type.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new AbstractC53410Njz("android.credentials.GetCredentialException.TYPE_UNKNOWN", getCredentialException.getMessage());
                }
                break;
            case -45448328:
                if (type.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new AbstractC53410Njz("android.credentials.GetCredentialException.TYPE_INTERRUPTED", getCredentialException.getMessage());
                }
                break;
            case 580557411:
                if (type.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new AbstractC53410Njz("android.credentials.GetCredentialException.TYPE_USER_CANCELED", getCredentialException.getMessage());
                }
                break;
            case 627896683:
                if (type.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new AbstractC53410Njz("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL", getCredentialException.getMessage());
                }
                break;
        }
        String type2 = getCredentialException.getType();
        C14360o3.A07(type2);
        boolean A1a = AbstractC43592JPx.A1a("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", 1, type2);
        String type3 = getCredentialException.getType();
        C14360o3.A07(type3);
        String message = getCredentialException.getMessage();
        if (A1a) {
            try {
                if (AbstractC43592JPx.A1a("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", 1, type3)) {
                    try {
                        Q7A q7a = new Q7A(new Q76(), null);
                        if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_ABORT_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58733Q6g(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_CONSTRAINT_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58734Q6h(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_DATA_CLONE_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58735Q6i(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_DATA_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58736Q6j(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_ENCODING_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58737Q6k(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58738Q6l(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58739Q6m(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_INVALID_CHARACTER_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58740Q6n(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58741Q6o(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58742Q6p(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_INVALID_STATE_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58743Q6q(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_NAMESPACE_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58744Q6r(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_NETWORK_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58745Q6s(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58746Q6t(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_NOT_ALLOWED_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58747Q6u(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_NOT_FOUND_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58748Q6v(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_NOT_READABLE_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58749Q6w(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_NOT_SUPPORTED_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58750Q6x(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_OPERATION_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58751Q6y(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_OPT_OUT_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new C58752Q6z(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new Q70(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_READ_ONLY_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new Q71(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_SECURITY_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new Q72(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_SYNTAX_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new Q73(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_TIMEOUT_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new Q74(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new Q75(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_UNKNOWN_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new Q76(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_VERSION_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new Q77(), q7a, message);
                        } else if (A03("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", "androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR", type3)) {
                            A00 = AbstractC61638Rr2.A00(new Q78(), q7a, message);
                        } else {
                            throw new Exception();
                        }
                        return (AbstractC53410Njz) A00;
                    } catch (C61246Rjj unused) {
                        return new C58731Q6d(type3, message);
                    }
                }
                throw new Exception();
            } catch (C61246Rjj unused2) {
                return new C58731Q6d(type3, message);
            }
        }
        return new C58731Q6d(type3, message);
    }

    public static boolean A03(String str, String str2, String str3) {
        return str3.equals(AnonymousClass001.A0R(str, str2));
    }
}
