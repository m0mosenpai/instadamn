package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class NIX extends AbstractC50863Mdu {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public final int A04;
    public final Context A05;
    public final AC0 A06;
    public final C1818484t A07;
    public final ClipsCreationViewModel A08;
    public final C187358Sd A09;
    public final InterfaceC16820sZ A0A;
    public final InterfaceC06180Ui A0B;
    public final InterfaceC06180Ui A0C;
    public final InterfaceC06180Ui A0D;
    public final C05A A0E;
    public final InterfaceC15070pN A0F;
    public final InterfaceC15070pN A0G;
    public final InterfaceC15070pN A0H;
    public final InterfaceC15070pN A0I;
    public final C0UO A0J;
    public final C54749OGy A0K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.AC0, java.lang.Object] */
    public NIX(Application application, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, C187358Sd c187358Sd, InterfaceC16820sZ interfaceC16820sZ, int i) {
        super(application, userSession, new B5y(clipsCreationViewModel, 12), false);
        AbstractC25233BEq.A0w(2, userSession, c187358Sd, clipsCreationViewModel);
        C14360o3.A0B(interfaceC16820sZ, 6);
        this.A09 = c187358Sd;
        this.A08 = clipsCreationViewModel;
        this.A04 = i;
        this.A0A = interfaceC16820sZ;
        this.A05 = MSZ.A0G(this);
        C008002u A1H = AbstractC25225BEi.A1H(EnumC53130Nej.A03);
        this.A0E = A1H;
        this.A0J = A1H;
        this.A0H = super.A03;
        Integer num = C05F.A00;
        AnonymousClass057 A00 = C10M.A00(num, 0, 0);
        this.A0C = A00;
        this.A0G = A00;
        AnonymousClass057 A002 = C10M.A00(num, 0, 0);
        this.A0B = A002;
        this.A0F = A002;
        this.A00 = MSW.A04(clipsCreationViewModel);
        C1Q2.A02();
        this.A06 = new Object();
        AnonymousClass057 A003 = C10M.A00(num, 0, 0);
        this.A0D = A003;
        this.A0I = A003;
        C54749OGy c54749OGy = new C54749OGy(this);
        this.A0K = c54749OGy;
        this.A07 = clipsCreationViewModel.A0Q;
        super.A01.A01 = c54749OGy;
    }

    public final void A0T(int i) {
        AbstractC166987dD.A1Z(new C50530MSj(this, null, null, i, 7), AbstractC141776au.A00(this));
    }

    public final void A0V(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A00 = i2 + i;
        Iterator it = super.A01.A0K(new MTY(this, 2), i, i2, z, z2, z3, false).iterator();
        while (it.hasNext()) {
            A0I(AbstractC167007dF.A0B(it));
        }
        A00(this);
    }

    public final boolean A0Y(int i, int i2, int i3, boolean z, boolean z2) {
        C55228Oey c55228Oey = super.A01;
        int A07 = MSZ.A07(c55228Oey);
        List list = C16930sl.A00;
        if (c55228Oey.A0W(i, A07)) {
            C51832Mva A0H = c55228Oey.A0H(i, A07);
            if (!z) {
                A03(this, A0H.A0B, i2, i3);
                this.A0E.Egh(EnumC53130Nej.A03);
            }
            list = c55228Oey.A0J(i, A07, i2, i3);
            AbstractC166987dD.A1Z(new PXk(this, null, i2, i3, 1, z, z2), AbstractC141776au.A00(this));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0I(AbstractC167007dF.A0B(it));
            }
        }
        return AbstractC166987dD.A1b(list);
    }

    public static final void A00(NIX nix) {
        int size = MSW.A1B(((AbstractC50863Mdu) nix).A01.A09).size();
        for (int i = 0; i < size; i++) {
            nix.A0T(i);
        }
    }

    public static final void A01(NIX nix) {
        UserSession userSession = ((AbstractC50863Mdu) nix).A00;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36322113220519940L)) {
            C55228Oey c55228Oey = ((AbstractC50863Mdu) nix).A01;
            if (c55228Oey.A0W(0, 0) && c55228Oey.A0H(0, 0).A0A == C05F.A15) {
                c55228Oey.A0Y(c55228Oey.A0H(0, 0));
                nix.A0I(0);
            }
        }
    }

    public static void A02(NIX nix, int i) {
        nix.A01 = i;
        nix.A0G();
        A00(nix);
    }

    public static final void A03(NIX nix, String str, int i, int i2) {
        Object obj;
        ClipsCreationViewModel clipsCreationViewModel = nix.A08;
        C14360o3.A0B(str, 0);
        C1817884n c1817884n = clipsCreationViewModel.A0N;
        List list = c1817884n.A02;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C5RO) obj).getId(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C5RO c5ro = (C5RO) obj;
        if (c5ro != null) {
            C56305OzQ c56305OzQ = new C56305OzQ(c5ro);
            c5ro.Efo(i, i2);
            C05A c05a = c1817884n.A0C;
            MSW.A1A(c05a).remove(c5ro);
            c05a.Egh(new ArrayList(list));
            c1817884n.A09.F8m(AbstractC166987dD.A1L(c56305OzQ, c5ro));
        }
    }

    public final C51831MvZ A0M() {
        C55228Oey c55228Oey = super.A01;
        int i = c55228Oey.A00;
        if (i != -1) {
            return (C51831MvZ) AbstractC25225BEi.A13(c55228Oey.A09.getValue(), i);
        }
        return null;
    }

    public final void A0N() {
        int i;
        C55228Oey c55228Oey = super.A01;
        String A0q = AbstractC166997dE.A0q(this.A05.getResources(), 2131955909);
        int A04 = MSW.A04(this.A08);
        InterfaceC16820sZ interfaceC16820sZ = this.A0A;
        int A08 = MSZ.A08(interfaceC16820sZ);
        int i2 = this.A04 / 2;
        if (A08 > i2) {
            i = MSZ.A08(interfaceC16820sZ) - i2;
        } else {
            i = 0;
        }
        C51832Mva c51832Mva = new C51832Mva(null, null, null, EnumC53185Nfh.A09, C05F.A15, A0q, A0q, 0, A04, 0, A04, 0, i, false, false);
        C05A c05a = c55228Oey.A08;
        if (MSZ.A09(c05a) == 0) {
            c55228Oey.A0N();
        }
        int A09 = MSZ.A09(c05a) - 1;
        C55228Oey.A00(c51832Mva, c55228Oey, A09, false);
        if (A09 != -1) {
            A0I(A09);
        }
    }

    public final void A0O() {
        C55228Oey c55228Oey = super.A01;
        do {
        } while (!MSZ.A1Z(c55228Oey.A08));
        do {
        } while (!MSZ.A1Z(c55228Oey.A07));
        C55228Oey.A06(c55228Oey);
        C55228Oey.A07(c55228Oey);
        A0G();
    }

    public final void A0P() {
        C55228Oey c55228Oey;
        int i;
        this.A0E.Egh(EnumC53130Nej.A03);
        if ((this.A09.A0E() instanceof C8T1) && (i = (c55228Oey = super.A01).A00) != -1) {
            c55228Oey.A0U(i, true);
            c55228Oey.A0T(i, false);
            A0T(i);
        }
    }

    public final void A0Q() {
        AbstractC187378Sf A0E = this.A09.A0E();
        this.A0E.Egh(EnumC53130Nej.A03);
        if (A0E instanceof C187568Sz) {
            C55228Oey c55228Oey = super.A01;
            if (AbstractC25225BEi.A1a(c55228Oey.A04, C55228Oey.A0C)) {
                C09530e4 c09530e4 = c55228Oey.A04;
                int A0F = AbstractC25230BEn.A0F(c09530e4);
                int A0A = AbstractC25229BEm.A0A(c09530e4);
                c55228Oey.A0S(A0F, A0A, true);
                c55228Oey.A0R(A0F, A0A, false);
                A0I(A0F);
            }
        }
    }

    public final void A0R() {
        Object value;
        AbstractList abstractList;
        C51832Mva A00;
        C55228Oey c55228Oey = super.A01;
        C09530e4 c09530e4 = c55228Oey.A03;
        if (c55228Oey.A0W(AbstractC25230BEn.A0F(c09530e4), AbstractC25229BEm.A0A(c55228Oey.A03))) {
            int A0F = AbstractC25230BEn.A0F(c55228Oey.A03);
            int A0A = AbstractC25229BEm.A0A(c55228Oey.A03);
            C05A c05a = c55228Oey.A08;
            do {
                value = c05a.getValue();
                abstractList = (AbstractList) value;
                if (!c55228Oey.A0W(A0F, A0A)) {
                    break;
                }
                AbstractList A16 = MSW.A16(abstractList, A0F);
                C51832Mva A0W = MSZ.A0W(abstractList, A0F, A0A);
                Integer num = A0W.A0A;
                if (num == C05F.A0C) {
                    num = C05F.A00;
                }
                A00 = C51832Mva.A00(null, null, null, A0W, num, null, 0, 0, 0, 0, 32511, false);
                A16.set(A0A, A00);
            } while (!c05a.AIi(value, abstractList));
        }
        c55228Oey.A03 = C55228Oey.A0C;
        if (!C14360o3.A0K(c09530e4, C55228Oey.A0C)) {
            A0I(AbstractC25230BEn.A0F(c09530e4));
        }
    }

    public final void A0S() {
        C55228Oey c55228Oey = super.A01;
        int A06 = MSZ.A06(c55228Oey);
        int i = c55228Oey.A00;
        C55228Oey.A06(c55228Oey);
        C55228Oey.A07(c55228Oey);
        if (A06 != AbstractC25230BEn.A0F(C55228Oey.A0C)) {
            A0I(A06);
        }
        if (i != -1) {
            A0T(i);
        }
    }

    public final void A0U(int i) {
        C55228Oey c55228Oey = super.A01;
        int A06 = MSZ.A06(c55228Oey);
        int i2 = c55228Oey.A00;
        c55228Oey.A0U(i, true);
        if (A06 != AbstractC25230BEn.A0F(C55228Oey.A0C)) {
            A0I(A06);
        }
        if (i2 != -1 && i2 != i) {
            A0T(i2);
        }
        A0T(i);
    }

    public final void A0W(boolean z) {
        Object value;
        AbstractList abstractList;
        Integer num;
        C55228Oey c55228Oey = super.A01;
        int i = c55228Oey.A00;
        if (i != -1) {
            C05A c05a = c55228Oey.A07;
            do {
                value = c05a.getValue();
                abstractList = (AbstractList) value;
                if (c55228Oey.A0V(i)) {
                    C51831MvZ c51831MvZ = (C51831MvZ) abstractList.get(i);
                    if (z) {
                        num = C05F.A0N;
                    } else if (c51831MvZ.CGw() == C05F.A0N) {
                        num = C05F.A00;
                    } else {
                        num = c51831MvZ.A03;
                    }
                    EnumC53185Nfh enumC53185Nfh = c51831MvZ.A02;
                    String str = c51831MvZ.A04;
                    C5RR c5rr = c51831MvZ.A00;
                    boolean z2 = c51831MvZ.A05;
                    int i2 = c51831MvZ.A01;
                    AbstractC167017dG.A1N(enumC53185Nfh, str);
                    C14360o3.A0B(num, 4);
                    abstractList.set(i, new C51831MvZ(enumC53185Nfh, c5rr, num, str, i2, z2));
                }
            } while (!c05a.AIi(value, abstractList));
            A0T(c55228Oey.A00);
        }
    }

    public final void A0X(boolean z) {
        Object value;
        AbstractList abstractList;
        Integer num;
        C51832Mva A00;
        C55228Oey c55228Oey = super.A01;
        if (AbstractC25225BEi.A1a(c55228Oey.A04, C55228Oey.A0C)) {
            int A06 = MSZ.A06(c55228Oey);
            int A07 = MSZ.A07(c55228Oey);
            C05A c05a = c55228Oey.A08;
            do {
                value = c05a.getValue();
                abstractList = (AbstractList) value;
                if (c55228Oey.A0W(A06, A07)) {
                    AbstractList A16 = MSW.A16(abstractList, A06);
                    C51832Mva A0W = MSZ.A0W(abstractList, A06, A07);
                    if (z) {
                        num = C05F.A0N;
                    } else if (A0W.CGw() == C05F.A0N) {
                        num = C05F.A00;
                    } else {
                        num = A0W.A0A;
                    }
                    A00 = C51832Mva.A00(null, null, null, A0W, num, null, 0, 0, 0, 0, 32511, false);
                    A16.set(A07, A00);
                }
            } while (!c05a.AIi(value, abstractList));
            A0I(MSZ.A06(c55228Oey));
        }
    }
}
