package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.KEe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45539KEe extends C1P1 {
    public UserSession A00;
    public final /* synthetic */ C47699L4g A01;

    public C45539KEe(UserSession userSession, C47699L4g c47699L4g) {
        this.A01 = c47699L4g;
        this.A00 = userSession;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = C0f9.A03(-1728334691);
        int A032 = C0f9.A03(1394812817);
        C45008Jvy c45008Jvy = ((K7t) obj).A00;
        if (c45008Jvy == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        String str = c45008Jvy.A00;
        if (str == null) {
            i = 1818940943;
        } else {
            C47699L4g c47699L4g = this.A01;
            UserSession userSession = this.A00;
            C47232Ku5 c47232Ku5 = new C47232Ku5();
            c47232Ku5.A00.putByteArray(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, C47699L4g.A07.A03(str));
            c47232Ku5.A00.putBoolean("useDebugKey", false);
            C1GJ.A03(new KK4(4, c47699L4g, userSession, c47232Ku5));
            i = -1474190458;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(-1489168822, A03);
    }
}
