package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KK7 extends C2AG {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C34385FEb A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C32522ETy A04;
    public final /* synthetic */ LIA A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        Bundle bundle = null;
        C47989LJs c47989LJs = C47989LJs.A00;
        UserSession userSession = this.A03;
        String str = this.A08;
        String str2 = this.A07;
        c47989LJs.A04(userSession, str, "client_reg_request_create_and_acquire_verifier", null, "registration_flow", str2);
        try {
            LIA lia = this.A05;
            SPT spt = LIA.A07;
            LI3 li3 = lia.A02;
            C34385FEb c34385FEb = this.A01;
            Bundle bundle2 = c34385FEb.A00;
            LKR.A04("requestMessage", bundle2);
            LKR.A02(bundle2, Bundle.class, "auxAttributes");
            LKR.A02(bundle2, Boolean.class, "useDebugKey");
            LKR.A02(bundle2, Boolean.class, "backupAttributes");
            c34385FEb.A00 = AbstractC166987dD.A0b();
            try {
                Bundle A00 = AbstractC62785SRd.A00(li3.A00, li3.A01, bundle2.deepCopy(), li3.A02, "register");
                C47894LDo c47894LDo = C47894LDo.A01;
                AbstractC62785SRd.A01(A00, li3.A03, "register");
                if (A00 == null) {
                    z = false;
                } else {
                    bundle = A00.deepCopy();
                    if (bundle != null) {
                        LKR.A04("verifier", bundle);
                        z = true;
                    } else {
                        throw AbstractC166987dD.A12("Bundle is null");
                    }
                }
                if (!z) {
                    AbstractC167007dF.A1K(userSession, str);
                    C47989LJs.A00(userSession, false, str, "client_reg_query_verifier_failed", "empty enc verifier from feo2 client", "registration_flow", str2, null, null, "null enc verifier from feo2 client", null);
                    return null;
                }
                c47989LJs.A04(userSession, str, "client_reg_query_verifier_success", null, "registration_flow", str2);
                SPT spt2 = LIA.A07;
                if (bundle.containsKey("verifier")) {
                    return spt2.A02(bundle.getByteArray("verifier"));
                }
                throw new IllegalStateException();
            } catch (Exception e) {
                throw e;
            }
        } catch (C52P | RemoteException | SecurityException e2) {
            String message = e2.getMessage();
            String join = TextUtils.join("\n", e2.getStackTrace());
            AbstractC167007dF.A1K(userSession, str);
            C47989LJs.A00(userSession, false, str, "client_reg_query_verifier_failed", "exception when getting enc verifier from feo2 client", "registration_flow", str2, message, join, null, null);
            C0w9.A06("FeO2IntegrateHelper", "auto_conf_client_register_failed", e2);
            return null;
        }
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return 1654495535;
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str = (String) obj;
        if (str != null) {
            C47989LJs c47989LJs = C47989LJs.A00;
            UserSession userSession = this.A03;
            String str2 = this.A08;
            String str3 = this.A07;
            c47989LJs.A04(userSession, str2, "client_reg_request_register_feo2_service", "register query called to feo2 client", "registration_flow", str3);
            LIA lia = this.A05;
            SPT spt = LIA.A07;
            C1ON A0A = AbstractC35276FhB.A0A(lia.A00, userSession, str, this.A06, str3, true);
            A0A.A00 = this.A04;
            C1GJ.A03(A0A);
            return;
        }
        AbstractC31525Dt9.A06(this.A00, null, this.A02, this.A03);
    }

    public KK7(Activity activity, C34385FEb c34385FEb, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C32522ETy c32522ETy, LIA lia, String str, String str2, String str3) {
        this.A05 = lia;
        this.A03 = userSession;
        this.A08 = str;
        this.A07 = str2;
        this.A01 = c34385FEb;
        this.A06 = str3;
        this.A04 = c32522ETy;
        this.A00 = activity;
        this.A02 = interfaceC11380iw;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        UserSession userSession = this.A03;
        String str = this.A08;
        SPT spt = LIA.A07;
        String message = exc.getMessage();
        String join = TextUtils.join("\n", exc.getStackTrace());
        AbstractC167007dF.A1K(userSession, str);
        C47989LJs.A00(userSession, false, str, "client_reg_query_verifier_failed", "failure when getting enc verifier from feo2 client", "registration_flow", "ar_code_sms", message, join, null, null);
        AbstractC31525Dt9.A06(this.A00, null, this.A02, userSession);
    }
}
