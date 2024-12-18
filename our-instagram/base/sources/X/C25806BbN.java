package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;
import java.util.List;

/* renamed from: X.BbN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25806BbN extends C193578hc {
    public int A00;
    public C8l A01;
    public boolean A02;
    public C28263Cd8 A03;
    public final C28421CgT A04;
    public final C27932CSr A05;
    public final C27919CSe A06;
    public final C05A A07;
    public final C05A A08;
    public final C0UO A09;
    public final C0UO A0A;
    public final C0UO A0B;
    public final Application A0C;
    public final FoaUserSession A0D;
    public final CWL A0E;
    public final C0UO A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C25806BbN(Application application, FoaUserSession foaUserSession, C28421CgT c28421CgT, CWL cwl) {
        super(application);
        AbstractC167027dH.A0a(1, application, foaUserSession, cwl, c28421CgT);
        this.A0C = application;
        this.A0D = foaUserSession;
        this.A0E = cwl;
        this.A04 = c28421CgT;
        C27919CSe c27919CSe = new C27919CSe(cwl);
        this.A06 = c27919CSe;
        C27932CSr c27932CSr = new C27932CSr(application, cwl, new BVI(this, 37));
        this.A05 = c27932CSr;
        this.A03 = new C28263Cd8(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
        this.A0B = c27919CSe.A02;
        this.A0A = c27932CSr.A05;
        C008002u A1H = AbstractC25225BEi.A1H(EnumC27386C6p.A02);
        this.A08 = A1H;
        this.A0F = AbstractC208910l.A02(A1H);
        C008002u A00 = C10E.A00(C28243Ccn.A00);
        this.A07 = A00;
        this.A09 = A00;
        D51.A02(this, AbstractC141776au.A00(this), 19);
    }

    public final void A0E() {
        C8l c8l;
        InterfaceC30844DhJ interfaceC30844DhJ = this.A06.A00;
        if (interfaceC30844DhJ instanceof C29502CzG) {
            c8l = C8l.DISMISS_CONSENT;
        } else if (interfaceC30844DhJ instanceof C29501CzF) {
            c8l = C8l.DISMISS_CAMERA;
        } else if (interfaceC30844DhJ instanceof C29507CzL) {
            c8l = C8l.DISMISS_UPLOADING;
        } else if (interfaceC30844DhJ instanceof C29503CzH) {
            c8l = C8l.DISMISS_PHOTO_PICKER;
        } else {
            c8l = null;
        }
        this.A01 = c8l;
    }

    public final void A0F(CA0 ca0) {
        InterfaceC30844DhJ interfaceC30844DhJ;
        InterfaceC30842DhH interfaceC30842DhH;
        InterfaceC30844DhJ interfaceC30844DhJ2;
        InterfaceC30844DhJ interfaceC30844DhJ3;
        C05A c05a;
        int size;
        C8o c8o;
        InterfaceC30844DhJ interfaceC30844DhJ4;
        if (!(ca0 instanceof C4T)) {
            if (ca0 instanceof C4U) {
                C05A c05a2 = this.A07;
                do {
                } while (!c05a2.AIi(c05a2.getValue(), C28244Cco.A00));
                C27919CSe c27919CSe = this.A06;
                if (c27919CSe.A00 instanceof C29503CzH) {
                    interfaceC30844DhJ4 = new C29501CzF(C29493Cz7.A00);
                } else {
                    interfaceC30844DhJ4 = C29505CzJ.A00;
                }
                InterfaceC30844DhJ interfaceC30844DhJ5 = interfaceC30844DhJ4;
                c27919CSe.A00 = interfaceC30844DhJ5;
                C05A c05a3 = c27919CSe.A01;
                do {
                } while (!c05a3.AIi(c05a3.getValue(), interfaceC30844DhJ5));
                return;
            }
            if (ca0 instanceof C4K) {
                if (this.A06.A00 instanceof C29507CzL) {
                    C05A c05a4 = this.A08;
                    do {
                    } while (!c05a4.AIi(c05a4.getValue(), EnumC27386C6p.A04));
                    return;
                }
                A0E();
            } else if (!(ca0 instanceof C4P)) {
                if (ca0 instanceof C4J) {
                    C28421CgT.A02(C8o.A02, this.A04);
                } else if (ca0 instanceof C4O) {
                    this.A01 = C8l.DENY_CONSENT;
                    C28421CgT.A02(C8o.A05, this.A04);
                } else {
                    if (!(ca0 instanceof C4I)) {
                        return;
                    }
                    C4I c4i = (C4I) ca0;
                    boolean z = c4i.A01;
                    List list = c4i.A00;
                    C28421CgT c28421CgT = this.A04;
                    if (z) {
                        size = this.A00;
                        c8o = C8o.A0S;
                    } else {
                        size = list.size();
                        c8o = C8o.A0P;
                    }
                    C28421CgT.A01(c8o, null, null, c28421CgT, Integer.valueOf(size), false);
                    this.A02 = AbstractC166987dD.A1b(list);
                }
            }
            C05A c05a5 = this.A07;
            do {
            } while (!c05a5.AIi(c05a5.getValue(), C28242Ccm.A00));
            C27919CSe c27919CSe2 = this.A06;
            c27919CSe2.A00 = C29505CzJ.A00;
            C05A c05a6 = c27919CSe2.A01;
            do {
            } while (!c05a6.AIi(c05a6.getValue(), c27919CSe2.A00));
            return;
        }
        C27919CSe c27919CSe3 = this.A06;
        InterfaceC30844DhJ interfaceC30844DhJ6 = c27919CSe3.A00;
        if (interfaceC30844DhJ6 instanceof C29505CzJ) {
            interfaceC30844DhJ = C29502CzG.A00;
        } else {
            if (interfaceC30844DhJ6 instanceof C29502CzG) {
                interfaceC30844DhJ3 = new C29501CzF(C29494Cz8.A00);
            } else if (interfaceC30844DhJ6 instanceof C29501CzF) {
                InterfaceC30842DhH interfaceC30842DhH2 = ((C29501CzF) interfaceC30844DhJ6).A00;
                if (C14360o3.A0K(interfaceC30842DhH2, C29494Cz8.A00)) {
                    interfaceC30842DhH = C29493Cz7.A00;
                } else {
                    if (C14360o3.A0K(interfaceC30842DhH2, C29493Cz7.A00)) {
                        interfaceC30842DhH = C29495Cz9.A00;
                    }
                    interfaceC30844DhJ2 = C29503CzH.A00;
                    interfaceC30844DhJ3 = interfaceC30844DhJ2;
                }
                InterfaceC30842DhH interfaceC30842DhH3 = interfaceC30842DhH;
                if (interfaceC30842DhH3 != null) {
                    interfaceC30844DhJ2 = new C29501CzF(interfaceC30842DhH3);
                    interfaceC30844DhJ3 = interfaceC30844DhJ2;
                }
                interfaceC30844DhJ2 = C29503CzH.A00;
                interfaceC30844DhJ3 = interfaceC30844DhJ2;
            } else if (interfaceC30844DhJ6 instanceof C29503CzH) {
                interfaceC30844DhJ = C29507CzL.A00;
            } else if (interfaceC30844DhJ6 instanceof C29507CzL) {
                interfaceC30844DhJ = C29506CzK.A00;
            } else {
                interfaceC30844DhJ = C29504CzI.A00;
            }
            c27919CSe3.A00 = interfaceC30844DhJ3;
            c05a = c27919CSe3.A01;
            do {
            } while (!c05a.AIi(c05a.getValue(), interfaceC30844DhJ3));
        }
        interfaceC30844DhJ3 = interfaceC30844DhJ;
        c27919CSe3.A00 = interfaceC30844DhJ3;
        c05a = c27919CSe3.A01;
        do {
        } while (!c05a.AIi(c05a.getValue(), interfaceC30844DhJ3));
    }
}
