package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.V3d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67938V3d extends C1P1 {
    public final /* synthetic */ C455127l A00;

    public C67938V3d(C455127l c455127l) {
        this.A00 = c455127l;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = C0f9.A03(61176425);
        C67793UyS c67793UyS = (C67793UyS) obj;
        int A032 = C0f9.A03(1924181831);
        super.onSuccess(c67793UyS);
        UserSession userSession = this.A00.A02;
        User A0Y = AbstractC166997dE.A0Y(userSession);
        InterfaceC223716s C45 = A0Y.A03.C45();
        if (C45 == null) {
            i = 1700231559;
        } else {
            XFE xfe = c67793UyS.A00;
            if (xfe == null) {
                C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
                throw C00O.createAndThrow();
            }
            UQq uQq = (UQq) xfe;
            List list = uQq.A03;
            Integer num = uQq.A02;
            Integer num2 = uQq.A01;
            E8G e8g = uQq.A00;
            E8G e8g2 = null;
            if (e8g != null) {
                e8g2 = e8g;
            }
            C223616r F2e = C45.F2e();
            A0Y.A03.EfB(VP8.A00(F2e, e8g2, F2e.BBp(), F2e.BCi(), F2e.CQe(), F2e.CSI(), F2e.CTX(), F2e.CVf(), F2e.CVg(), F2e.CYu(), F2e.CbT(), F2e.CbU(), F2e.Cdz(), F2e.Ce0(), F2e.Ce1(), num2, num, F2e.B5G(), F2e.Bqn(), list));
            A0Y.A0c(userSession);
            i = -900642868;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(-207227035, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(855033375);
        super.onFail(abstractC115105If);
        C0f9.A0A(801060016, A03);
    }
}
