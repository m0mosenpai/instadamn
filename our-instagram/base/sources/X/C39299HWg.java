package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HWg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39299HWg extends C17T implements InterfaceC39751sy {
    public Map A00;
    public List A01;

    @Override // X.InterfaceC39751sy
    public final InterfaceC104764ng AZB() {
        return (InterfaceC104764ng) A05(-1593201482, HWb.class);
    }

    @Override // X.InterfaceC39751sy
    public final C5FJ Ale() {
        return (C5FJ) A05(-1077203130, C39296HWa.class);
    }

    @Override // X.InterfaceC39751sy
    public final InterfaceC104764ng AyD() {
        return (InterfaceC104764ng) A05(1446414091, HWb.class);
    }

    @Override // X.InterfaceC39751sy
    public final C5FJ BDN() {
        return (C5FJ) A05(1588497204, C39296HWa.class);
    }

    @Override // X.InterfaceC39751sy
    public final InterfaceC110874yz BKs() {
        return (InterfaceC110874yz) A05(-1822059410, HWd.class);
    }

    @Override // X.InterfaceC39751sy
    public final Map BSP() {
        Map map = this.A00;
        if (map == null) {
            return null;
        }
        return map;
    }

    @Override // X.InterfaceC39751sy
    public final List BSS() {
        return this.A01;
    }

    @Override // X.InterfaceC39751sy
    public final InterfaceC39751sy EBk(C1DY c1dy) {
        ArrayList arrayList;
        Map map = this.A00;
        if (map == null) {
            map = null;
        }
        this.A00 = map;
        ImmutableList A08 = A08(1498308178, ImmutablePandoUserDict.class);
        if (A08 != null) {
            arrayList = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A01 = arrayList;
        return this;
    }

    @Override // X.InterfaceC39751sy
    public final C39741sx F5q(C1DY c1dy) {
        C5Fa c5Fa;
        C5FI c5fi;
        C5Fa c5Fa2;
        C5FI c5fi2;
        C110864yy c110864yy;
        HashMap hashMap;
        InterfaceC104764ng AZB = AZB();
        ArrayList arrayList = null;
        if (AZB != null) {
            c5Fa = AZB.F5k();
        } else {
            c5Fa = null;
        }
        String A0n = AbstractC37301Gc2.A0n(this);
        String A0i = A0i(305089521);
        C5FJ Ale = Ale();
        if (Ale != null) {
            c5fi = Ale.F5j();
        } else {
            c5fi = null;
        }
        String A0i2 = A0i(549275112);
        String A0T = A0T();
        InterfaceC104764ng AyD = AyD();
        if (AyD != null) {
            c5Fa2 = AyD.F5k();
        } else {
            c5Fa2 = null;
        }
        C5FJ BDN = BDN();
        if (BDN != null) {
            c5fi2 = BDN.F5j();
        } else {
            c5fi2 = null;
        }
        InterfaceC110874yz BKs = BKs();
        if (BKs != null) {
            c110864yy = BKs.F5m();
        } else {
            c110864yy = null;
        }
        Map map = this.A00;
        if (map == null) {
            hashMap = null;
        } else {
            LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC16850sd.A0L(map.size()));
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                A18.put(A1K.getKey(), c1dy.A00((C17M) A1K.getValue()));
            }
            hashMap = new HashMap(A18);
        }
        ImmutableList A08 = A08(1498308178, ImmutablePandoUserDict.class);
        if (A08 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, A0q, it);
            }
            if (A0q != null) {
                arrayList = AbstractC167017dG.A0q(A0q);
                Iterator it2 = A0q.iterator();
                while (it2.hasNext()) {
                    AbstractC37303Gc4.A18(c1dy, arrayList, it2);
                }
            }
        }
        return new C39741sx(c5fi, c5fi2, c5Fa, c5Fa2, c110864yy, getOptionalBooleanValueByHashCode(625144022), getOptionalIntValueByHashCode(-1037596717), A0n, A0i, A0i2, A0T, A0X(), AbstractC37301Gc2.A0l(this), hashMap, arrayList);
    }

    @Override // X.InterfaceC39751sy
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I3D.A00(this));
    }

    @Override // X.InterfaceC39751sy
    public final String Aeu() {
        return A0i(305089521);
    }

    @Override // X.InterfaceC39751sy
    public final String AwB() {
        return A0i(549275112);
    }

    @Override // X.InterfaceC39751sy
    public final Boolean BwS() {
        return getOptionalBooleanValueByHashCode(625144022);
    }

    @Override // X.InterfaceC39751sy
    public final Integer C6j() {
        return getOptionalIntValueByHashCode(-1037596717);
    }

    @Override // X.InterfaceC39751sy
    public final C39741sx F5r(C1DV c1dv) {
        return F5q(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.InterfaceC39751sy
    public final String getBackgroundColor() {
        return AbstractC37301Gc2.A0n(this);
    }

    @Override // X.InterfaceC39751sy
    public final String getDescription() {
        return A0T();
    }

    @Override // X.InterfaceC39751sy
    public final String getText() {
        return A0X();
    }

    @Override // X.InterfaceC39751sy
    public final String getTextColor() {
        return AbstractC37301Gc2.A0l(this);
    }
}
