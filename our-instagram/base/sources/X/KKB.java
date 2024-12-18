package X;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes8.dex */
public final class KKB extends C2AG {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C47232Ku5 A01;
    public final /* synthetic */ AbstractC59962oe A02;
    public final /* synthetic */ C07270a1 A03;
    public final /* synthetic */ AbstractC33626Etc A04;
    public final /* synthetic */ LIA A05;
    public final /* synthetic */ EnumC31713DwI A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    @Override // X.C11R
    public final int getRunnableId() {
        return 1981478238;
    }

    public KKB(View view, C47232Ku5 c47232Ku5, AbstractC59962oe abstractC59962oe, C07270a1 c07270a1, AbstractC33626Etc abstractC33626Etc, LIA lia, EnumC31713DwI enumC31713DwI, String str, String str2, String str3) {
        this.A05 = lia;
        this.A03 = c07270a1;
        this.A06 = enumC31713DwI;
        this.A01 = c47232Ku5;
        this.A00 = view;
        this.A09 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A02 = abstractC59962oe;
        this.A04 = abstractC33626Etc;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Bundle deepCopy;
        boolean z;
        C47989LJs c47989LJs = C47989LJs.A00;
        C07270a1 c07270a1 = this.A03;
        String str = this.A06.A01;
        LIA lia = this.A05;
        SPT spt = LIA.A07;
        c47989LJs.A04(c07270a1, str, "client_auth_request_generate_auth_response", "authenticate query called to feo2 client", "optimistic_authentication_flow", "ar_code_sms");
        try {
            LI3 li3 = lia.A02;
            C47232Ku5 c47232Ku5 = this.A01;
            Bundle bundle = c47232Ku5.A00;
            Class A00 = LKR.A00(bundle);
            LKR.A02(bundle, A00, "useDebugKey");
            LKR.A02(bundle, A00, "allowMultiSession");
            c47232Ku5.A00 = AbstractC166987dD.A0b();
            try {
                Bundle A002 = LI3.A00(bundle, li3);
                if (A002 != null) {
                    deepCopy = A002.deepCopy();
                    if (deepCopy != null) {
                        LKR.A04(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, deepCopy);
                        z = true;
                    } else {
                        throw AbstractC166987dD.A12("Bundle is null");
                    }
                } else {
                    deepCopy = null;
                    z = false;
                }
                if (!z) {
                    c47989LJs.A04(c07270a1, str, "client_auth_response_not_found", "empty_auto_conf_authenticate_result", "optimistic_authentication_flow", "ar_code_sms");
                    return null;
                }
                c47989LJs.A04(c07270a1, str, "client_auth_response_found", null, "optimistic_authentication_flow", "ar_code_sms");
                SPT spt2 = LIA.A07;
                if (deepCopy.containsKey(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE)) {
                    return spt2.A02(deepCopy.getByteArray(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE));
                }
                throw new IllegalStateException();
            } catch (Exception e) {
                throw e;
            }
        } catch (C52P | RemoteException | SecurityException e2) {
            String message = e2.getMessage();
            String join = TextUtils.join("\n", e2.getStackTrace());
            AbstractC167007dF.A1K(c07270a1, str);
            C47989LJs.A00(c07270a1, false, str, "client_auth_response_not_found", "auto_conf_client_authenticate_failed", "optimistic_authentication_flow", "ar_code_sms", message, join, "authenticate_exception_caught", null);
            C0w9.A06("FeO2IntegrateHelper", "auto_conf_client_authenticate_failed", e2);
            return null;
        }
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C07270a1 c07270a1 = this.A03;
        String str = this.A06.A01;
        String str2 = this.A08;
        SPT spt = LIA.A07;
        String message = exc.getMessage();
        String join = TextUtils.join("\n", exc.getStackTrace());
        AbstractC167007dF.A1K(c07270a1, str);
        C47989LJs.A00(c07270a1, false, str, "client_auth_failed_other_error", "authentication request to FeO2 client failed", str2, "ar_code_sms", message, join, null, null);
        this.A04.A00();
    }

    @Override // X.C2AG, X.C2AH, X.C11R
    public final void onFinish() {
        AbstractC167007dF.A0x(this.A00);
        super.onFinish();
    }

    @Override // X.C2AG, X.C2AH, X.C11R
    public final void onStart() {
        AbstractC167007dF.A0w(this.A00);
        super.onStart();
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str = (String) obj;
        if (str != null) {
            C47989LJs c47989LJs = C47989LJs.A00;
            C07270a1 c07270a1 = this.A03;
            EnumC31713DwI enumC31713DwI = this.A06;
            String str2 = enumC31713DwI.A01;
            LIA lia = this.A05;
            SPT spt = LIA.A07;
            c47989LJs.A04(c07270a1, str2, "client_auth_request_auth_service", "client sends auth response to server to authenticate", "optimistic_authentication_flow", "ar_code_sms");
            Context context = lia.A00;
            String str3 = this.A09;
            C1ON A07 = AbstractC35276FhB.A07(context, c07270a1, str3, "111111", this.A08, null, str, this.A07);
            AbstractC59962oe abstractC59962oe = this.A02;
            A07.A00 = new C32977Efj(abstractC59962oe.getRootActivity(), abstractC59962oe, c07270a1, new G9Q(abstractC59962oe.requireActivity()), this, enumC31713DwI, C05F.A01, str3);
            C1GJ.A03(A07);
            return;
        }
        this.A04.A00();
    }
}
