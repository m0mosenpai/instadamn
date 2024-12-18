package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class INL {
    public final C63622uj A00;
    public final C57112jm A01;
    public final C42390Ipr A02;
    public final C39123HJv A03;

    public final void A01(IN1 in1, IKK ikk) {
        InterfaceC43071ya[] interfaceC43071yaArr = {this.A03};
        String A01 = in1.A01();
        C59072n8 A00 = C59062n7.A00(in1, ikk, A01);
        A00.A00(interfaceC43071yaArr[0]);
        this.A00.A01(A00.A01(), A01);
    }

    public final void A02(IN1 in1, IKK ikk) {
        InterfaceC43071ya[] interfaceC43071yaArr = {this.A02, this.A03};
        String A01 = in1.A01();
        C59072n8 A00 = C59062n7.A00(in1, ikk, A01);
        int i = 0;
        do {
            A00.A00(interfaceC43071yaArr[i]);
            i++;
        } while (i < 2);
        this.A00.A01(A00.A01(), A01);
    }

    public final void A00(View view, String str) {
        AbstractC37304Gc5.A0u(view, this.A01, this.A00, str);
    }

    public INL(UserSession userSession, C57112jm c57112jm, C41702IdW c41702IdW, C41727Idy c41727Idy, InterfaceC43421JGl interfaceC43421JGl, boolean z) {
        AbstractC167027dH.A13(userSession, c57112jm, c41727Idy);
        this.A01 = c57112jm;
        C63622uj c63622uj = new C63622uj();
        this.A00 = c63622uj;
        this.A02 = new C42390Ipr(userSession, c63622uj, interfaceC43421JGl);
        this.A03 = new C39123HJv(userSession, c41702IdW, c41727Idy, z);
    }
}
