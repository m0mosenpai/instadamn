package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes11.dex */
public final class V3T extends C1P1 {
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(182592032);
        C67790UyP c67790UyP = (C67790UyP) obj;
        int A0N = AbstractC167017dG.A0N(c67790UyP, -65118148);
        XFH xfh = c67790UyP.A00;
        if (xfh == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        if (((UQs) xfh).A00) {
            AbstractC166987dD.A1T(C18950wb.A01, "push_event_test_ig_user_session_server_canary_test.bool", 817892914);
        }
        C0f9.A0A(-1533380400, A0N);
        C0f9.A0A(-271203806, A03);
    }
}
