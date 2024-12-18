package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Loq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49173Loq implements InterfaceC50518MRv {
    public static final C47724L5l A0W = new Object();
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final C2EY A03;
    public final MsysThreadId A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final long A0G;
    public final EnumC31648DvE A0H;
    public final DirectThreadKey A0I;
    public final Long A0J;
    public final String A0K;
    public final String A0L;
    public final List A0M;
    public final Map A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;

    @Override // X.InterfaceC50518MRv
    public final C81613kW Aic() {
        return null;
    }

    @Override // X.InterfaceC50518MRv
    public final Integer An0() {
        return null;
    }

    @Override // X.InterfaceC50518MRv
    public final ImageUrl Ass() {
        return null;
    }

    @Override // X.InterfaceC50518MRv
    public final List Axh() {
        return null;
    }

    @Override // X.InterfaceC50518MRv
    public final String B5E() {
        return null;
    }

    @Override // X.InterfaceC50518MRv
    public final AnonymousClass172 BJU() {
        return null;
    }

    @Override // X.InterfaceC50518MRv
    public final Map BX8() {
        return null;
    }

    @Override // X.InterfaceC50518MRv
    public final C9BO BXU() {
        return null;
    }

    @Override // X.InterfaceC50518MRv
    public final long BdM() {
        return 0L;
    }

    @Override // X.InterfaceC50518MRv
    public final C51593Mql C58() {
        return null;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CM0() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CM4() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CNV() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CNW() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CPo() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CSp() {
        return true;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CUM() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CUy() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CVl() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CX1() {
        return true;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CXl() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CXo() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CXz() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CaK() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CaO() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CbK() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CbY() {
        return true;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CeR() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CeS() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean Cfy() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean Eje() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final /* synthetic */ List Aa2() {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean Aqm() {
        MutedWordsFilterManager A00 = AbstractC2042992d.A00(this.A02);
        if (A00 == null) {
            return false;
        }
        List list = this.A09;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((C47390Kwf) it.next()).A00);
        }
        Iterator it2 = AbstractC001800i.A0U(A0q).iterator();
        while (it2.hasNext()) {
            if (A00.A05(AbstractC166987dD.A1B(it2), Ko0.A00(this.A01)).A00) {
                if (JRE.A06(this.A04) != null) {
                    return true;
                }
                throw AbstractC166997dE.A0g();
            }
        }
        if (JRE.A06(this.A04) != null) {
            return false;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC50518MRv
    public final /* synthetic */ String Asv() {
        return null;
    }

    @Override // X.InterfaceC50518MRv
    public final DirectThreadKey Axg() {
        return this.A0I;
    }

    @Override // X.InterfaceC50518MRv
    public final int BI1() {
        if (LCG.A00(this.A01) && CDm(this.A02.userId, null) == null) {
            return 1;
        }
        return 0;
    }

    @Override // X.InterfaceC50518MRv
    public final /* synthetic */ List BKM() {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC50518MRv
    public final /* synthetic */ List BKN() {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC50518MRv
    public final long BLG() {
        return this.A0G;
    }

    @Override // X.InterfaceC50518MRv
    public final String BLZ() {
        return this.A06;
    }

    @Override // X.InterfaceC50518MRv
    public final Long BLu() {
        Long l = this.A0J;
        if (l != null) {
            return Long.valueOf(l.longValue() * 1000);
        }
        return null;
    }

    @Override // X.InterfaceC50518MRv
    public final Integer BN6() {
        return C05F.A0N;
    }

    @Override // X.InterfaceC50518MRv
    public final int BY6() {
        return this.A0F;
    }

    @Override // X.InterfaceC50518MRv
    public final List BbX() {
        Collection values;
        Map map = this.A0N;
        if (map != null && (values = map.values()) != null) {
            List A0a = AbstractC001800i.A0a(values);
            ArrayList A0q = AbstractC167017dG.A0q(A0a);
            Iterator it = A0a.iterator();
            while (it.hasNext()) {
                A0q.add(AbstractC43592JPx.A17(it).A00);
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : A0q) {
                AbstractC25232BEp.A1Q(AbstractC31171DnF.A0g(obj), this.A02.userId, obj, A1E);
            }
            return A1E;
        }
        return C16930sl.A00;
    }

    @Override // X.InterfaceC50518MRv
    public final List Bl3() {
        java.util.Set keySet;
        Map map = this.A0N;
        if (map != null && (keySet = map.keySet()) != null) {
            List A0a = AbstractC001800i.A0a(keySet);
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : A0a) {
                AbstractC25228BEl.A1Q(obj, A1E, AbstractC31171DnF.A1W(this.A02, obj) ? 1 : 0);
            }
            return A1E;
        }
        return C16930sl.A00;
    }

    @Override // X.InterfaceC50518MRv
    public final List Bl6() {
        Collection values;
        Map map = this.A0N;
        if (map != null && (values = map.values()) != null) {
            List A0a = AbstractC001800i.A0a(values);
            ArrayList A0q = AbstractC167017dG.A0q(A0a);
            Iterator it = A0a.iterator();
            while (it.hasNext()) {
                A0q.add(AbstractC43592JPx.A17(it).A00);
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : A0q) {
                AbstractC25232BEp.A1Q(AbstractC31171DnF.A0g(obj), this.A02.userId, obj, A1E);
            }
            return A1E;
        }
        return C16930sl.A00;
    }

    @Override // X.InterfaceC50518MRv
    public final int C7C() {
        return this.A0E;
    }

    @Override // X.InterfaceC50518MRv
    public final ImageUrl C7H() {
        String str = this.A0L;
        if (str != null) {
            return AbstractC25225BEi.A0t(str);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC50518MRv
    public final DirectShareTarget C7e() {
        ?? r2;
        Collection values;
        UserSession userSession = this.A02;
        Map map = this.A0N;
        if (map != null && (values = map.values()) != null) {
            r2 = AbstractC167017dG.A0q(values);
            Iterator it = values.iterator();
            while (it.hasNext()) {
                r2.add(AbstractC43592JPx.A17(it).A00);
            }
        } else {
            r2 = C16930sl.A00;
        }
        return AbstractC34135F4l.A00(userSession, this.A04, this.A0K, r2);
    }

    @Override // X.InterfaceC50518MRv
    public final /* synthetic */ int C7g() {
        return 0;
    }

    @Override // X.InterfaceC50518MRv
    public final String C7l() {
        return this.A0K;
    }

    @Override // X.InterfaceC50518MRv
    public final EnumC92794Ds CAo() {
        if (Ko0.A00(this.A01)) {
            return EnumC92794Ds.A04;
        }
        return EnumC92794Ds.A07;
    }

    @Override // X.InterfaceC50518MRv
    public final C3o9 CCb() {
        return this.A04;
    }

    @Override // X.InterfaceC50518MRv
    public final User CDm(String str, String str2) {
        C09530e4 c09530e4;
        Map map = this.A0N;
        if (map != null && (c09530e4 = (C09530e4) map.get(str)) != null) {
            return (User) c09530e4.A00;
        }
        return null;
    }

    @Override // X.InterfaceC50518MRv
    public final LinkedHashMap CDv() {
        List<C47615L1a> list = this.A0M;
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(list, 10)));
        for (C47615L1a c47615L1a : list) {
            A18.put(c47615L1a.A01, new C31230DoD(null, TimeUnit.MILLISECONDS.toMicros(c47615L1a.A00)));
        }
        return A18;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CKe() {
        int i = this.A0D;
        if (i == 4 || i == 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CKg() {
        int i = this.A0D;
        if (i != 3 && i != 2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CLG() {
        return this.A0O;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CM1() {
        return this.A0P;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CM2() {
        return this.A0C;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CM3() {
        return this.A0P;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CSH() {
        return this.A0Q;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CTV() {
        return this.A0B;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CVQ() {
        return LCG.A00(this.A01);
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CVU() {
        return this.A0R;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CWD() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CWO() {
        return this.A0B;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CXG() {
        if (this.A03 == C2EY.A0q) {
            if (!AbstractC31171DnF.A1W(this.A02, this.A07)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CYQ() {
        return this.A0S;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CZH() {
        return AbstractC167007dF.A1W(this.A0K);
    }

    @Override // X.InterfaceC50518MRv
    public final /* synthetic */ boolean CbX() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CdS() {
        return AbstractC167007dF.A1X(this.A0H, EnumC31648DvE.A07);
    }

    @Override // X.InterfaceC50518MRv
    public final /* synthetic */ boolean Cdw() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean Cf6() {
        return this.A0C;
    }

    @Override // X.InterfaceC50518MRv
    public final /* synthetic */ boolean CfB() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CfO() {
        return this.A0B;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean Cfg() {
        if (C98Q.A00(this.A02).A00(this.A04, 26) && AbstractC166987dD.A1b(Bl6())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean Cfh() {
        return this.A0U;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean EjY() {
        return this.A0V;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean isMuted() {
        return this.A0T;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean isPending() {
        return AbstractC167007dF.A1X(this.A0H, EnumC31648DvE.A08);
    }

    public C49173Loq(UserSession userSession, EnumC31648DvE enumC31648DvE, DirectThreadKey directThreadKey, C2EY c2ey, MsysThreadId msysThreadId, Long l, Long l2, String str, String str2, String str3, String str4, String str5, List list, List list2, Map map, int i, int i2, int i3, int i4, int i5, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.A02 = userSession;
        this.A0N = map;
        this.A0M = list;
        this.A09 = list2;
        this.A0I = directThreadKey;
        this.A04 = msysThreadId;
        this.A0D = i;
        this.A0K = str;
        this.A01 = i2;
        this.A0B = z;
        this.A0G = j;
        this.A0L = str2;
        this.A0F = i3;
        this.A0C = z2;
        this.A0P = z3;
        this.A0T = z4;
        this.A0S = z5;
        this.A0U = z6;
        this.A0H = enumC31648DvE;
        this.A0E = i4;
        this.A08 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A00 = i5;
        this.A05 = l;
        this.A03 = c2ey;
        this.A0V = z7;
        this.A0R = z8;
        this.A0J = l2;
        this.A0Q = z9;
        this.A0A = z10;
        this.A0O = z11;
    }

    @Override // X.InterfaceC50518MRv
    public final int BT2() {
        return isPending() ? 1 : 0;
    }
}
