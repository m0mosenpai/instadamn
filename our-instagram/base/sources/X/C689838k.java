package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.38k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C689838k {
    public final UserSession A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16820sZ A08;

    public static final boolean A00(C38321qM c38321qM, C689838k c689838k, C75113Zb c75113Zb) {
        AnonymousClass341 anonymousClass341;
        if (c38321qM != null) {
            if (c75113Zb != null) {
                anonymousClass341 = c75113Zb.A0o;
            } else {
                anonymousClass341 = null;
            }
            if (anonymousClass341 == AnonymousClass341.A0H) {
                if (!C18U.A06(C06090Tz.A05, c689838k.A00, 36316048727805858L) && c38321qM.A67()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A02(C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c75113Zb, 1);
        if (c38321qM != null && c75113Zb.A0o == AnonymousClass341.A0H) {
            if (!C18U.A06(C06090Tz.A05, this.A00, 36316048727412637L) && c38321qM.A67()) {
                return true;
            }
        }
        return false;
    }

    public final boolean A03(C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c75113Zb, 1);
        if (c75113Zb.A0o == AnonymousClass341.A0H) {
            UserSession userSession = this.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36316048727543711L) && ((C18U.A06(c06090Tz, userSession, 36316048727412637L) || !c38321qM.A67()) && !c38321qM.A5Q() && c38321qM.A0C.BGH() == null)) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ C689838k(UserSession userSession) {
        C207019Eg c207019Eg = new C207019Eg(userSession, 19);
        C207019Eg c207019Eg2 = new C207019Eg(userSession, 20);
        C207019Eg c207019Eg3 = new C207019Eg(userSession, 21);
        C207019Eg c207019Eg4 = new C207019Eg(userSession, 22);
        C207019Eg c207019Eg5 = new C207019Eg(userSession, 23);
        C207019Eg c207019Eg6 = new C207019Eg(userSession, 24);
        C207019Eg c207019Eg7 = new C207019Eg(userSession, 25);
        C207019Eg c207019Eg8 = new C207019Eg(userSession, 26);
        this.A00 = userSession;
        this.A06 = c207019Eg;
        this.A03 = c207019Eg2;
        this.A04 = c207019Eg3;
        this.A05 = c207019Eg4;
        this.A01 = c207019Eg5;
        this.A02 = c207019Eg6;
        this.A07 = c207019Eg7;
        this.A08 = c207019Eg8;
    }

    public final long A01(C38321qM c38321qM, C75113Zb c75113Zb) {
        double d;
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        long A00;
        if (A00(c38321qM, this, c75113Zb)) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36323470430186783L)) {
                A00 = 3000;
            } else {
                A00 = 4000;
            }
        } else {
            if (c38321qM != null) {
                userSession = this.A00;
                c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36316048727674784L) && c38321qM.Cff()) {
                    d = 1000.0d;
                    j = 37160473657737333L;
                    A00 = (long) (d * C18U.A00(c06090Tz, userSession, j));
                }
            }
            d = 1000.0d;
            userSession = this.A00;
            c06090Tz = C06090Tz.A05;
            j = 37160473656885364L;
            A00 = (long) (d * C18U.A00(c06090Tz, userSession, j));
        }
        if (c38321qM != null) {
            c38321qM.getId();
        }
        return A00;
    }
}
