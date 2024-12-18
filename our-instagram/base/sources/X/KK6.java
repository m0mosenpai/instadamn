package X;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes8.dex */
public final class KK6 extends C2AG {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ C1P1 A02;
    public final /* synthetic */ C07270a1 A03;
    public final /* synthetic */ AbstractC33626Etc A04;
    public final /* synthetic */ LIA A05;
    public final /* synthetic */ EnumC31713DwI A06;
    public final /* synthetic */ Boolean A07;
    public final /* synthetic */ String A08;

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        Bundle bundle = null;
        C47989LJs c47989LJs = C47989LJs.A00;
        C07270a1 c07270a1 = this.A03;
        String str = this.A06.A01;
        c47989LJs.A02(c07270a1, str, "client_start_generate_start_message");
        try {
            LIA lia = this.A05;
            SPT spt = LIA.A07;
            LI3 li3 = lia.A02;
            Bundle A0b = AbstractC166987dD.A0b();
            LKR.A01(A0b);
            try {
                Bundle A01 = LI3.A01(A0b, li3);
                if (A01 != null) {
                    bundle = A01.deepCopy();
                    AbstractC46568Kj7.A00(bundle);
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    c47989LJs.A03(c07270a1, str, "client_start_message_not_found", "empty_auto_conf_start_query_result");
                    return null;
                }
                c47989LJs.A02(c07270a1, str, "client_start_message_found");
                SPT spt2 = LIA.A07;
                if (bundle.containsKey("startMessage")) {
                    return spt2.A02(bundle.getByteArray("startMessage"));
                }
                throw new IllegalStateException();
            } catch (Exception e) {
                throw e;
            }
        } catch (C52P | RemoteException | SecurityException e2) {
            String message = e2.getMessage();
            String join = TextUtils.join("\n", e2.getStackTrace());
            AbstractC167007dF.A1K(c07270a1, str);
            C47989LJs.A00(c07270a1, false, str, "client_start_message_not_found", "auto_conf_client_start_query_failed", null, message, join, null, null, null);
            C0w9.A06("FeO2IntegrateHelper", "auto_conf_client_start_query_failed", e2);
            return null;
        }
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return 1200830798;
    }

    public KK6(View view, AbstractC59962oe abstractC59962oe, C1P1 c1p1, C07270a1 c07270a1, AbstractC33626Etc abstractC33626Etc, LIA lia, EnumC31713DwI enumC31713DwI, Boolean bool, String str) {
        this.A05 = lia;
        this.A03 = c07270a1;
        this.A06 = enumC31713DwI;
        this.A08 = str;
        this.A07 = bool;
        this.A01 = abstractC59962oe;
        this.A00 = view;
        this.A02 = c1p1;
        this.A04 = abstractC33626Etc;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C07270a1 c07270a1 = this.A03;
        String str = this.A06.A01;
        String message = exc.getMessage();
        String join = TextUtils.join("\n", exc.getStackTrace());
        AbstractC167007dF.A1K(c07270a1, str);
        C47989LJs.A00(c07270a1, false, str, "client_start_request_fail", "client start request to FeO2 fails", null, message, join, null, null, null);
        this.A04.A01();
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str = (String) obj;
        if (str != null) {
            C47989LJs c47989LJs = C47989LJs.A00;
            C07270a1 c07270a1 = this.A03;
            EnumC31713DwI enumC31713DwI = this.A06;
            c47989LJs.A03(c07270a1, enumC31713DwI.A01, "client_start_request_query_verifier", "client sends start message to server to query verifier");
            LIA lia = this.A05;
            SPT spt = LIA.A07;
            Context context = lia.A00;
            String str2 = this.A08;
            Boolean bool = this.A07;
            boolean booleanValue = bool.booleanValue();
            C1ON A01 = AbstractC35276FhB.A01(context, c07270a1, false, bool, str2, str, true, false);
            A01.A00 = new EUZ(this.A00, this.A01, this.A02, c07270a1, lia, enumC31713DwI, str, str2, booleanValue);
            C1GJ.A03(A01);
            return;
        }
        this.A04.A01();
    }
}
