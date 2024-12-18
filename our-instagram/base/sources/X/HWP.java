package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HWP extends C17T implements C47N {
    public C54N A00;
    public InterfaceC115885Me A01;
    public InterfaceC115905Mg A02;
    public User A03;
    public List A04;
    public List A05;

    @Override // X.C47N
    public final C47F AvM() {
        return (C47F) A05(-1183438890, C39251HSj.class);
    }

    @Override // X.C47N
    public final List BR6() {
        return this.A04;
    }

    @Override // X.C47N
    public final InterfaceC115885Me Bfs() {
        InterfaceC115885Me interfaceC115885Me = this.A01;
        if (interfaceC115885Me == null) {
            return (InterfaceC115885Me) A05(700235949, C33024EhS.class);
        }
        return interfaceC115885Me;
    }

    @Override // X.C47N
    public final List ByM() {
        return this.A05;
    }

    @Override // X.C47N
    public final C54N CDJ() {
        C54N c54n = this.A00;
        if (c54n == null) {
            return (C54N) A05(1395735988, HPA.class);
        }
        return c54n;
    }

    @Override // X.C47N
    public final User CDj() {
        return this.A03;
    }

    @Override // X.C47N
    public final InterfaceC115905Mg CE5() {
        InterfaceC115905Mg interfaceC115905Mg = this.A02;
        if (interfaceC115905Mg == null) {
            return (InterfaceC115905Mg) A05(1934820225, HWQ.class);
        }
        return interfaceC115905Mg;
    }

    @Override // X.C47N
    public final C47N EBf(C1DY c1dy) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ImmutableList A08 = A08(-3896982, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            arrayList = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC37304Gc5.A1F(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A04 = arrayList;
        InterfaceC115885Me Bfs = Bfs();
        InterfaceC115905Mg interfaceC115905Mg = null;
        if (Bfs != null) {
            Bfs.E9T(c1dy);
        } else {
            Bfs = null;
        }
        this.A01 = Bfs;
        ImmutableList A082 = A08(378965114, ImmutablePandoUserDict.class);
        if (A082 != null) {
            arrayList2 = AbstractC167017dG.A0q(A082);
            Iterator<E> it2 = A082.iterator();
            while (it2.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, arrayList2, it2);
            }
        } else {
            arrayList2 = null;
        }
        this.A05 = arrayList2;
        C54N CDJ = CDJ();
        if (CDJ != null) {
            CDJ.E97(c1dy);
        } else {
            CDJ = null;
        }
        this.A00 = CDJ;
        this.A03 = AbstractC31179DnN.A0T(c1dy, this);
        InterfaceC115905Mg CE5 = CE5();
        if (CE5 != null) {
            CE5.EBg(c1dy);
            interfaceC115905Mg = CE5;
        }
        this.A02 = interfaceC115905Mg;
        return this;
    }

    @Override // X.C47N
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40708I2o.A00(this));
    }

    @Override // X.C47N
    public final String Af0() {
        return A0i(-168253766);
    }

    @Override // X.C47N
    public final String Alc() {
        return A0i(552573414);
    }

    @Override // X.C47N
    public final Boolean B7Q() {
        return getOptionalBooleanValueByHashCode(1601672934);
    }

    @Override // X.C47N
    public final Boolean BCj() {
        return getOptionalBooleanValueByHashCode(-1011195986);
    }

    @Override // X.C47N
    public final String BEi() {
        return AbstractC37304Gc5.A0i(this);
    }

    @Override // X.C47N
    public final String BIz() {
        return A0i(-304132134);
    }

    @Override // X.C47N
    public final List BL9() {
        return getOptionalStringListByHashCode(2040312680);
    }

    @Override // X.C47N
    public final Integer BQb() {
        return getOptionalIntValueByHashCode(-9393932);
    }

    @Override // X.C47N
    public final List BR1() {
        return A0n(2140775389);
    }

    @Override // X.C47N
    public final String Blg() {
        return A0j(-598090789);
    }

    @Override // X.C47N
    public final Float Bqj() {
        return A0K(109264530);
    }

    @Override // X.C47N
    public final String ByJ() {
        return A0i(-823445795);
    }

    @Override // X.C47N
    public final List C8C() {
        return getOptionalStringListByHashCode(760022103);
    }

    @Override // X.C47N
    public final String CEI() {
        return A0j(3601339);
    }

    @Override // X.C47N
    public final Float CER() {
        return A0K(111972721);
    }

    @Override // X.C47N
    public final Boolean CZO() {
        return getOptionalBooleanValueByHashCode(91445688);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    @Override // X.C47N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47M F5V(X.C1DY r31) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HWP.F5V(X.1DY):X.47M");
    }

    @Override // X.C47N
    public final String getAlgorithm() {
        return A0i(225490031);
    }
}
