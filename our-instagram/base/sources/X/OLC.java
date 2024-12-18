package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class OLC {
    public final long A01;
    public final long A02;
    public final EnumC142806cg A03;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final C05A A08;
    public final C05A A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final C05A A0E;
    public final C05A A0F;
    public final C05A A0G;
    public final C05A A0H;
    public final C05A A0I;
    public final C05A A0J;
    public final C05A A0K;
    public final C05A A0L;
    public final C05A A0M;
    public final C05A A0N;
    public final C05A A0O;
    public final C05A A0P;
    public final C05A A0Q;
    public final C05A A0R;
    public final C05A A0S;
    public final C05A A0T;
    public final C05A A0U;
    public final C0UO A0V;
    public final C0UO A0W;
    public final C0UO A0X;
    public final C0UO A0Y;
    public final C0UO A0Z;
    public final C0UO A0a;
    public final C0UO A0b;
    public final C0UO A0c;
    public final C0UO A0d;
    public final C0UO A0e;
    public final C0UO A0f;
    public final C0UO A0g;
    public final C0UO A0h;
    public final C0UO A0i;
    public final C0UO A0j;
    public final C0UO A0k;
    public final C0UO A0l;
    public final C0UO A0m;
    public final C0UO A0n;
    public final C0UO A0o;
    public final C0UO A0p;
    public final C0UO A0q;
    public final C0UO A0r;
    public final C0UO A0s;
    public final boolean A0t;
    public final C23031Ai A0u;
    public final C0UO A0v;
    public final C0UO A0w;
    public int A00 = 4;
    public final java.util.Set A04 = AbstractC31171DnF.A0l();

    public final void A00(java.util.Set set) {
        int i;
        C14360o3.A0B(set, 0);
        this.A05.Egh(set);
        boolean z = true;
        AbstractC166997dE.A1Y(this.A0J, !set.isEmpty());
        C05A c05a = this.A0B;
        C05A c05a2 = this.A0A;
        AbstractC166997dE.A1Y(c05a, MSY.A1R((((java.util.Set) c05a2.getValue()).size() > this.A01 ? 1 : (((java.util.Set) c05a2.getValue()).size() == this.A01 ? 0 : -1))));
        C05A c05a3 = this.A0I;
        int size = set.size();
        if (this.A0t) {
            i = ((java.util.Set) c05a2.getValue()).size();
        } else {
            i = 0;
        }
        if (size + i < this.A00 - 1) {
            z = false;
        }
        AbstractC166997dE.A1Y(c05a3, z);
        java.util.Set set2 = this.A04;
        ArrayList A0q = AbstractC167017dG.A0q(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC167017dG.A1V(A0q, it);
        }
        set2.addAll(A0q);
    }

    public final void A01(boolean z) {
        AbstractC166997dE.A1Y(this.A0O, z);
    }

    public OLC(UserSession userSession, EnumC142806cg enumC142806cg, long j, long j2, boolean z) {
        this.A03 = enumC142806cg;
        this.A0t = z;
        this.A01 = j;
        this.A02 = j2;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        this.A0u = A00;
        C008002u A1H = AbstractC25225BEi.A1H(EnumC53165NfK.A06);
        this.A0U = A1H;
        this.A0s = AbstractC208910l.A02(A1H);
        C008002u A1H2 = AbstractC25225BEi.A1H(EnumC53145Nez.A03);
        this.A0T = A1H2;
        this.A0r = AbstractC208910l.A02(A1H2);
        C008002u A1H3 = AbstractC25225BEi.A1H(EnumC53324Ni1.A0E);
        this.A06 = A1H3;
        this.A0W = AbstractC208910l.A02(A1H3);
        C008002u A1H4 = AbstractC25225BEi.A1H(false);
        this.A0G = A1H4;
        this.A0f = AbstractC208910l.A02(A1H4);
        EnumC142806cg enumC142806cg2 = EnumC142806cg.A03;
        C008002u A0s = MSX.A0s(AbstractC25229BEm.A1a(enumC142806cg, enumC142806cg2));
        this.A0K = A0s;
        this.A0j = AbstractC208910l.A02(A0s);
        C008002u A1H5 = AbstractC25225BEi.A1H(false);
        this.A0H = A1H5;
        this.A0g = AbstractC208910l.A02(A1H5);
        C008002u A0s2 = MSX.A0s(AbstractC167007dF.A1X(enumC142806cg, EnumC142806cg.A04));
        this.A0J = A0s2;
        this.A0i = AbstractC208910l.A02(A0s2);
        C008002u A1H6 = AbstractC25225BEi.A1H(false);
        this.A0B = A1H6;
        this.A0a = AbstractC208910l.A02(A1H6);
        C008002u A1H7 = AbstractC25225BEi.A1H(false);
        this.A0I = A1H7;
        this.A0h = AbstractC208910l.A02(A1H7);
        C008002u A1H8 = AbstractC25225BEi.A1H(false);
        this.A0O = A1H8;
        this.A0w = AbstractC208910l.A02(A1H8);
        C16910sj c16910sj = C16910sj.A00;
        C008002u A002 = C10E.A00(c16910sj);
        this.A0A = A002;
        this.A0Z = AbstractC208910l.A02(A002);
        C008002u A003 = C10E.A00(c16910sj);
        this.A05 = A003;
        this.A0V = AbstractC208910l.A02(A003);
        C008002u A1H9 = AbstractC25225BEi.A1H(false);
        this.A0N = A1H9;
        this.A0m = AbstractC208910l.A02(A1H9);
        C008002u A0s3 = MSX.A0s(A00.A01.getInt("live_nux_tutorial_view_count", 0) == 0 && enumC142806cg == enumC142806cg2);
        this.A0M = A0s3;
        this.A0l = AbstractC208910l.A02(A0s3);
        C008002u A0u = MSY.A0u(0);
        this.A07 = A0u;
        this.A0v = AbstractC208910l.A02(A0u);
        C008002u A1H10 = AbstractC25225BEi.A1H(false);
        this.A0R = A1H10;
        this.A0p = AbstractC208910l.A02(A1H10);
        C008002u A1H11 = AbstractC25225BEi.A1H(false);
        this.A0S = A1H11;
        this.A0q = AbstractC208910l.A02(A1H11);
        C008002u A1H12 = AbstractC25225BEi.A1H(false);
        this.A0E = A1H12;
        this.A0d = AbstractC208910l.A02(A1H12);
        C008002u A1H13 = AbstractC25225BEi.A1H(false);
        this.A0L = A1H13;
        this.A0k = AbstractC208910l.A02(A1H13);
        C008002u A1H14 = AbstractC25225BEi.A1H(false);
        this.A0P = A1H14;
        this.A0n = AbstractC208910l.A02(A1H14);
        C008002u A1H15 = AbstractC25225BEi.A1H(false);
        this.A0C = A1H15;
        this.A0b = AbstractC208910l.A02(A1H15);
        C008002u A1H16 = AbstractC25225BEi.A1H(false);
        this.A0Q = A1H16;
        this.A0o = AbstractC208910l.A02(A1H16);
        C008002u A1H17 = AbstractC25225BEi.A1H(false);
        this.A08 = A1H17;
        this.A0X = AbstractC208910l.A02(A1H17);
        C008002u A1H18 = AbstractC25225BEi.A1H(false);
        this.A0F = A1H18;
        this.A0e = AbstractC208910l.A02(A1H18);
        C008002u A1H19 = AbstractC25225BEi.A1H(false);
        this.A09 = A1H19;
        this.A0Y = AbstractC208910l.A02(A1H19);
        C008002u A1H20 = AbstractC25225BEi.A1H(false);
        this.A0D = A1H20;
        this.A0c = AbstractC208910l.A02(A1H20);
    }
}
