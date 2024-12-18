package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class OFY {
    public List A00;
    public C05A A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final UserSession A05;
    public final C2EE A06;
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(new C37017GSy(this, 45));
    public final C05A A08;
    public final C05A A09;
    public final C0UO A0A;
    public final FragmentActivity A0B;

    public OFY(FragmentActivity fragmentActivity, UserSession userSession, C2EE c2ee) {
        this.A0B = fragmentActivity;
        this.A05 = userSession;
        this.A06 = c2ee;
        this.A04 = fragmentActivity.getApplicationContext();
        C16930sl c16930sl = C16930sl.A00;
        this.A00 = c16930sl;
        this.A01 = AbstractC25227BEk.A0z();
        C008002u A1H = AbstractC25225BEi.A1H(EnumC53149Nf4.A05);
        this.A08 = A1H;
        C008002u A00 = C10E.A00(c16930sl);
        this.A09 = A00;
        MV5 A002 = MV5.A00(this, new InterfaceC19390xP[]{A1H, A00, this.A01}, 3);
        this.A0A = AbstractC208910l.A01(C56377P1m.A00, AbstractC25229BEm.A0a(fragmentActivity), A002, C10I.A01);
    }
}
