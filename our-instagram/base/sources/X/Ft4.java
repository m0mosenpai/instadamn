package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class Ft4 implements InterfaceC216113n {
    public final /* synthetic */ C1Ee A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public Ft4(C1Ee c1Ee, UserSession userSession, String str) {
        this.A02 = str;
        this.A01 = userSession;
        this.A00 = c1Ee;
    }

    @Override // X.InterfaceC216113n
    public final /* bridge */ /* synthetic */ Object get() {
        String str;
        C1Ee c1Ee = new C1Ee();
        c1Ee.A05("upload_id", this.A02);
        c1Ee.A05("use_fbuploader", "true");
        Boolean CdJ = AbstractC31171DnF.A0T(this.A01, C17060sy.A01).CdJ();
        if (CdJ != null && CdJ.booleanValue()) {
            str = "True";
        } else {
            str = "False";
        }
        c1Ee.A05(AbstractC58317Pt9.A00(941), str);
        c1Ee.A04(this.A00, null);
        return c1Ee;
    }
}
