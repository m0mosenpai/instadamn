package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4sX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107264sX extends C4A7 implements InterfaceC54632fL {
    public boolean A00;
    public final UserSession A01;
    public final InterfaceC08830cm A02;
    public final InterfaceC08830cm A03;
    public final C19L A04;
    public final InterfaceC19390xP A05;
    public final C05A A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C107264sX(UserSession userSession, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2) {
        super("ActivityFeed", C4A8.A01(2109432776, 3));
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = interfaceC08830cm;
        this.A02 = interfaceC08830cm2;
        this.A04 = super.A01;
        C008002u A00 = C10E.A00(C107284sZ.A00);
        this.A06 = A00;
        this.A05 = AbstractC208910l.A02(A00);
    }

    public static final ArrayList A00(C107264sX c107264sX) {
        ArrayList A1N = AbstractC16960so.A1N(0);
        UserSession userSession = c107264sX.A01;
        if ((C18U.A06(C06090Tz.A05, userSession, 36321438911571395L) || C18U.A06(C06090Tz.A06, userSession, 36322628616595830L)) && AbstractC109484wa.A00(userSession).A02()) {
            A1N.add(1520);
            A1N.add(1519);
        }
        return A1N;
    }

    @Override // X.InterfaceC54632fL
    public final void AHc(InterfaceC54232eZ interfaceC54232eZ) {
        this.A00 = false;
    }

    @Override // X.InterfaceC54632fL
    public final void AfE(InterfaceC54232eZ interfaceC54232eZ, C89573yx c89573yx, C54432ex c54432ex) {
        C14360o3.A0B(interfaceC54232eZ, 0);
        if (interfaceC54232eZ == EnumC54222eY.A0U) {
            boolean z = this.A00;
            c89573yx.A00.resumeWith(new C54432ex(interfaceC54232eZ, null, z ? 1 : 0, z ? 1 : 0));
        }
    }

    public final void A01() {
        AbstractC23641Du.A05(C12L.A00.CPG(480314591, 3), new PZS(this, null, 46), this.A04);
    }

    public final void A02() {
        C19L c19l = this.A04;
        AbstractC23641Du.A03(C05F.A00, C12L.A00.CPG(480314591, 3), new C206629Ct(this, null, 34), c19l);
    }

    public final void A03(List list) {
        AbstractC23641Du.A05(C12L.A00.CPG(480314591, 3), new C50534MSn(this, list, null, 49), super.A01);
    }
}
