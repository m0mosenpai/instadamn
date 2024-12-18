package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Wmm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71031Wmm implements InterfaceC03950Jk {
    @Override // X.InterfaceC03950Jk
    public final /* bridge */ /* synthetic */ void ATX(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm, Object obj) {
        UPM upm = (UPM) obj;
        AbstractC167027dH.A12(userSession, upm, interfaceC03960Jm);
        C1DX A00 = C1DW.A00(userSession);
        C38321qM c38321qM = upm.A02;
        C38321qM A02 = A00.A02(c38321qM.getId());
        if (A02 == null) {
            String id = c38321qM.getId();
            C38821rE parseFromJson = AbstractC38811rD.parseFromJson(C16V.A00("{}"));
            C14360o3.A07(parseFromJson);
            C38321qM A022 = C38801rC.A02(parseFromJson);
            if (A022 != null) {
                A022.A4P(id);
                A02 = A00.A01(A022, true, false);
                if (A02 == null) {
                    return;
                }
            } else {
                return;
            }
        }
        String str = upm.A04;
        boolean z = upm.A07;
        int i = upm.A00;
        XiA.A00(upm.A01, userSession, new Aj6(interfaceC03960Jm), A02, upm.A03, str, upm.A06, upm.A05, i, z, false);
    }
}
