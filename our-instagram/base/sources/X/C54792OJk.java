package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.OJk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54792OJk {
    public String A01;
    public boolean A03;
    public final UserSession A04;
    public final C55902Orq A05;
    public final O59 A06;
    public final Integer A07;
    public final InterfaceC09390do A08;
    public C35168FfK A00 = new C35168FfK(new C56382P1r(this, 3));
    public String A02 = "";

    public final void A00() {
        C71665WyH c71665WyH = this.A05.A00;
        Iterator it = c71665WyH.values().iterator();
        while (it.hasNext()) {
            ((C0Ah) it.next()).Cht();
        }
        c71665WyH.clear();
    }

    public C54792OJk(UserSession userSession, C57112jm c57112jm, C55902Orq c55902Orq, O59 o59, Integer num) {
        this.A04 = userSession;
        this.A06 = o59;
        this.A05 = c55902Orq;
        this.A07 = num;
        this.A08 = C1XM.A00(new MHU(39, c57112jm, this));
    }
}
