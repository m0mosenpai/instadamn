package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.J1v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43055J1v implements InterfaceC43429JGt {
    public final /* synthetic */ C3G2 A00;
    public final /* synthetic */ C3KX A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    @Override // X.InterfaceC43429JGt
    public final void D0R(Reel reel) {
        String str;
        String str2;
        UserSession userSession;
        C105824pt c105824pt = reel.A0H;
        if (c105824pt != null && (str2 = c105824pt.A0d) != null && !str2.equals("0")) {
            EnumC109104va enumC109104va = c105824pt.A06;
            if (enumC109104va == null) {
                enumC109104va = EnumC109104va.A0E;
            }
            if (enumC109104va.A00() && (userSession = this.A01.A01) != null) {
                FragmentActivity A00 = C3KW.A00();
                if (A00 != null) {
                    C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A1i, userSession);
                    c116875Qr.A1D = str2;
                    AbstractC41751IeQ.A01(A00, c116875Qr, userSession, false);
                    return;
                }
                return;
            }
        }
        if (this.A06 && (str = this.A05) != null) {
            C3KX.A02(reel, this.A00, this.A01, str, this.A04);
        } else {
            C3KX.A01(reel, this.A00, this.A01, this.A02, this.A03);
        }
    }

    public C43055J1v(C3G2 c3g2, C3KX c3kx, String str, String str2, String str3, String str4, boolean z) {
        this.A01 = c3kx;
        this.A06 = z;
        this.A05 = str;
        this.A00 = c3g2;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
