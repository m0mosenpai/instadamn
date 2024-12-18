package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: X.N8i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52193N8i extends C7E1 implements InterfaceC65252xN, InterfaceC57914PmK, InterfaceC57916PmM {
    public final C55197Oe4 A01;
    public final Context A04;
    public final N9G A05;
    public final Map A02 = AbstractC166987dD.A1G();
    public final NLo A00 = new N3V(this);
    public final InterfaceC65952yX A06 = new P2P(this);
    public final SortedMap A03 = new TreeMap();

    public C52193N8i(Context context, N7V n7v, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A04 = context;
        C55197Oe4 A00 = C55197Oe4.A00(userSession);
        this.A01 = A00;
        N9G n9g = new N9G(context, this, n7v, interfaceC11380iw, userSession);
        this.A05 = n9g;
        A0B(n9g);
        A00.A06.add(this);
    }

    @Override // X.InterfaceC57914PmK
    public final java.util.Set Bsh() {
        return this.A01.A05.keySet();
    }

    @Override // X.InterfaceC57916PmM
    public final void DSF() {
        String str;
        C55197Oe4 c55197Oe4 = this.A01;
        java.util.Set keySet = c55197Oe4.A05.keySet();
        C54662OCo c54662OCo = c55197Oe4.A00;
        if (c54662OCo != null && (str = c54662OCo.A03) != null && !keySet.isEmpty() && !keySet.contains(str)) {
            c55197Oe4.A06(this.A04);
        }
        Iterator it = C55197Oe4.A02(c55197Oe4).iterator();
        while (it.hasNext()) {
            C38321qM A0i = AbstractC31172DnG.A0i(it);
            this.A03.put(Long.valueOf(A0i.A1B()), A0i);
        }
        NLo nLo = this.A00;
        nLo.A04();
        this.A02.clear();
        nLo.A0B(AbstractC166987dD.A1F(this.A03.values()));
        A0C();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        if (this.A00.A02() != 0) {
            return false;
        }
        return true;
    }

    public final void A0C() {
        A06();
        NLo nLo = this.A00;
        nLo.A08(this.A06);
        if (!isEmpty()) {
            for (int i = 0; i < nLo.A02(); i++) {
                Object c153126ug = new C153126ug(nLo.A01, i * 3, 3);
                Map map = this.A02;
                C153336v2 c153336v2 = (C153336v2) map.get(AbstractC166997dE.A0u(c153126ug));
                if (c153336v2 == null) {
                    c153336v2 = new C153336v2();
                    map.put(AbstractC166997dE.A0u(c153126ug), c153336v2);
                }
                boolean z = true;
                if (i != nLo.A02() - 1) {
                    z = false;
                }
                c153336v2.A00(i, z);
                A09(this.A05, c153126ug, c153336v2);
            }
        }
        A07();
    }

    @Override // X.InterfaceC65252xN
    public final void EVk(int i) {
        A0C();
    }
}
