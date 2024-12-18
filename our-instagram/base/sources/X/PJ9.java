package X;

import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class PJ9 implements InterfaceC43429JGt {
    public final /* synthetic */ C3KX A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    @Override // X.InterfaceC43429JGt
    public final void D0R(Reel reel) {
        C105824pt c105824pt = reel.A0H;
        if (c105824pt != null) {
            C3KX c3kx = this.A00;
            String str = this.A01;
            String str2 = this.A03;
            String str3 = this.A02;
            C2OG A01 = C2OG.A01();
            User user = c105824pt.A09;
            user.getClass();
            String str4 = c105824pt.A0Y;
            if (str4 == null) {
                str4 = "";
            }
            C3PO c3po = c105824pt.A0A;
            if (c3po == null) {
                c3po = C3PO.A08;
            }
            boolean z = false;
            boolean A1X = AbstractC167007dF.A1X(c3po, C3PO.A0A);
            boolean A1X2 = AbstractC167007dF.A1X(c3po, C3PO.A04);
            if (c105824pt.A01 != null) {
                z = true;
            }
            A01.A0A(C3KX.A00(reel, user, c3kx, str4, str, str2, str3, A1X, A1X2, z));
        }
    }

    public PJ9(C3KX c3kx, String str, String str2, String str3) {
        this.A00 = c3kx;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
    }
}
