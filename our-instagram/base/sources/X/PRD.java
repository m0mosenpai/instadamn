package X;

import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class PRD implements Runnable {
    public final /* synthetic */ C2045893s A00;
    public final /* synthetic */ NAE A01;

    public PRD(C2045893s c2045893s, NAE nae) {
        this.A01 = nae;
        this.A00 = c2045893s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NAE nae = this.A01;
        nae.A01.A0E("fetch_user_on_data");
        C2045893s c2045893s = this.A00;
        User A00 = C72W.A00(c2045893s);
        C53M A002 = NAE.A00(nae);
        if (A00 != null) {
            if (A002 != null) {
                A002.EWZ(false);
            }
            C53M A003 = NAE.A00(nae);
            if (A003 != null) {
                A003.DyF(nae.A02.A00(), A00, C72W.A01(c2045893s), c2045893s.mServerElapsedTime, c2045893s.CR4());
            }
            C53M A004 = NAE.A00(nae);
            if (A004 != null) {
                C14360o3.A0B(c2045893s, 0);
                A004.EcE(((InterfaceC128135qh) c2045893s.F7f()).BlD());
                return;
            }
            return;
        }
        if (A002 == null) {
            return;
        }
        A002.DGu(false, true, "User is null");
    }
}
