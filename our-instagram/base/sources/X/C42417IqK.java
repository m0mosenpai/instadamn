package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.IqK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42417IqK implements InterfaceC43460JHy {
    public final UserSession A00;
    public final C38144GqB A01;
    public final String A02;

    @Override // X.InterfaceC43460JHy
    public final int AuB() {
        return 1;
    }

    @Override // X.InterfaceC43460JHy
    public final void CJS(Map map) {
    }

    @Override // X.InterfaceC43460JHy
    public final void DqV(C84543q2 c84543q2, String str, String str2, String str3, List list) {
        C14360o3.A0B(list, 0);
        C38169Gqa A00 = AbstractC38168GqZ.A00(this.A00);
        String str4 = this.A02;
        A00.A01(str4, str, str2, list);
        this.A01.A03(str4);
    }

    @Override // X.InterfaceC43460JHy
    public final void onStart() {
    }

    @Override // X.InterfaceC43460JHy
    public final void DFf() {
        this.A01.A03(this.A02);
    }

    public C42417IqK(UserSession userSession, C38144GqB c38144GqB, String str) {
        this.A02 = str;
        this.A00 = userSession;
        this.A01 = c38144GqB;
    }
}
