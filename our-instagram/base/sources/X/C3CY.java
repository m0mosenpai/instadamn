package X;

import com.instagram.common.session.UserSession;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.3CY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CY extends AbstractC52922bZ {
    public boolean A00;
    public final C2GT A01;
    public final UserSession A02;
    public final C191138dB A03;
    public final O8R A04;
    public final QuickSnapRepository A05;
    public final InterfaceC19390xP A06;
    public final InterfaceC19390xP A07;
    public final InterfaceC06180Ui A08;
    public final C05A A09;
    public final C0UO A0A;

    public C3CY(UserSession userSession, C191138dB c191138dB, O8R o8r, QuickSnapRepository quickSnapRepository) {
        C14360o3.A0B(quickSnapRepository, 2);
        C14360o3.A0B(o8r, 3);
        C14360o3.A0B(c191138dB, 4);
        this.A02 = userSession;
        this.A05 = quickSnapRepository;
        this.A04 = o8r;
        this.A03 = c191138dB;
        this.A00 = true;
        C008002u c008002u = new C008002u(new C206209Bd((C26086BgF) null, (User) null, (List) null, (DefaultConstructorMarker) null, 7, 16));
        this.A09 = c008002u;
        this.A0A = c008002u;
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 0, 0);
        this.A08 = A00;
        this.A07 = A00;
        PV6 pv6 = new PV6(quickSnapRepository.A0B);
        this.A06 = pv6;
        this.A01 = AbstractC58232lf.A00(AnonymousClass191.A00, pv6);
    }

    public final void A03(C26086BgF c26086BgF, User user) {
        C05A c05a = this.A09;
        List list = (List) ((C206209Bd) c05a.getValue()).A02;
        C14360o3.A0B(list, 0);
        c05a.Egh(new C206209Bd(c26086BgF, user, list));
    }

    public final void A05(boolean z) {
        this.A00 = z;
        C141796aw A00 = AbstractC141776au.A00(this);
        AbstractC23641Du.A05(AnonymousClass191.A00, new PZW(this, (InterfaceC23621Ds) null, 43, z), A00);
    }

    public final void A00() {
        C141796aw A00 = AbstractC141776au.A00(this);
        AbstractC23641Du.A05(AnonymousClass191.A00, new PZB(this, (InterfaceC23621Ds) null, 38), A00);
    }

    public final void A01() {
        C141796aw A00 = AbstractC141776au.A00(this);
        AbstractC23641Du.A05(AnonymousClass191.A00, new PYs(this, null, 8), A00);
    }

    public final void A02() {
        C141796aw A00 = AbstractC141776au.A00(this);
        AbstractC23641Du.A05(AnonymousClass191.A00, new PZX(this, null, 44), A00);
    }

    public final void A04(boolean z) {
        C141796aw A00 = AbstractC141776au.A00(this);
        C206689Cz c206689Cz = new C206689Cz(this, null, 0, z);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206689Cz, A00);
    }
}
