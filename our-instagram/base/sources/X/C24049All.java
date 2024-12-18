package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.All, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24049All implements InterfaceC58073Poy {
    public final /* synthetic */ C196208mB A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public C24049All(C196208mB c196208mB, String str, boolean z) {
        this.A00 = c196208mB;
        this.A02 = z;
        this.A01 = str;
    }

    @Override // X.InterfaceC58073Poy
    public final void DFf() {
        C196208mB c196208mB = this.A00;
        String str = this.A01;
        boolean z = this.A02;
        Integer num = C05F.A00;
        UserSession userSession = c196208mB.A01;
        C9LK.A05(userSession, str, "server_setting_updated_failed", null, C9H5.A01(num), C196218mC.A00(userSession), z);
        C22882A7c c22882A7c = c196208mB.A00;
        if (c22882A7c != null) {
            C9GR.A0F(c22882A7c.A00, MSV.A00(206), 2131962508);
        }
    }

    @Override // X.InterfaceC58073Poy
    public final void Dq3(C213789dd c213789dd) {
        C196208mB c196208mB = this.A00;
        boolean z = this.A02;
        C196208mB.A00(c196208mB, C05F.A00, this.A01, z, AbstractC167007dF.A1W(c213789dd));
    }
}
