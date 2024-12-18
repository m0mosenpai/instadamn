package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class GFT implements InterfaceC37181GZs {
    public final int A00;
    public final Object A01;

    public GFT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC37181GZs
    public final void DHQ() {
        if (1 - this.A00 == 0) {
            C32356ENd c32356ENd = (C32356ENd) this.A01;
            if (c32356ENd.A06) {
                InterfaceC190488c6 interfaceC190488c6 = c32356ENd.A00;
                if (interfaceC190488c6 == null) {
                    C14360o3.A0F("searchLogger");
                    throw C00O.createAndThrow();
                }
                interfaceC190488c6.Clg();
            }
        }
    }

    @Override // X.InterfaceC37181GZs
    public final void DjG(String str) {
        String str2;
        if (1 - this.A00 == 0) {
            C32356ENd c32356ENd = (C32356ENd) this.A01;
            InterfaceC190488c6 interfaceC190488c6 = c32356ENd.A00;
            if (interfaceC190488c6 == null) {
                str2 = "searchLogger";
            } else {
                interfaceC190488c6.ClV();
                if (c32356ENd.A06) {
                    C65974TxR c65974TxR = c32356ENd.A02;
                    if (c65974TxR != null) {
                        c65974TxR.A06(str);
                    }
                } else if (!str.equals(c32356ENd.A04)) {
                    C1ON AN7 = c32356ENd.AN7(str, null);
                    AN7.A00 = new EUP(str, c32356ENd, 4);
                    c32356ENd.schedule(AN7);
                } else {
                    return;
                }
                EQM eqm = c32356ENd.A03;
                if (eqm == null) {
                    str2 = "userListAdapter";
                } else {
                    eqm.A0B = false;
                    eqm.A07 = null;
                    return;
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC37181GZs
    public final void DjI(String str) {
        String str2;
        switch (this.A00) {
            case 0:
                int length = str.length();
                Object obj = this.A01;
                if (length > 0) {
                    EOO eoo = (EOO) obj;
                    ArrayList arrayList = eoo.A0C;
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) next;
                        if ((interfaceC66482zP instanceof C32082E8g) && Pattern.compile(Pattern.quote(str), 2).matcher(((C32082E8g) interfaceC66482zP).A02).find()) {
                            A1E.add(next);
                        }
                    }
                    eoo.A0B(A1E);
                    return;
                }
                EOO eoo2 = (EOO) obj;
                eoo2.A0B(eoo2.A0C);
                eoo2.getRecyclerView().A0n(0);
                return;
            case 1:
                C32356ENd c32356ENd = (C32356ENd) this.A01;
                EQM eqm = c32356ENd.A03;
                str2 = "userListAdapter";
                if (eqm != null) {
                    eqm.A04 = null;
                    eqm.A0A = false;
                    if (str.length() == 0) {
                        eqm.A0R.clear();
                        eqm.A0S.clear();
                        eqm.A0B = false;
                        eqm.A07 = null;
                        eqm.clear();
                        eqm.notifyDataSetChangedSmart();
                        C32356ENd.A00(c32356ENd);
                        if (!c32356ENd.A05) {
                            return;
                        }
                        C25621Ms A0D = AbstractC31179DnN.A0D(AbstractC166987dD.A0o(c32356ENd.A0C));
                        A0D.A0B("discover/non_profiled/");
                        EV0.A01(c32356ENd, AbstractC25227BEk.A0e(A0D, EAL.class, C34737FSc.class), 20);
                        return;
                    }
                    if (!c32356ENd.A06) {
                        return;
                    }
                    C65974TxR c65974TxR = c32356ENd.A02;
                    if (c65974TxR != null) {
                        c65974TxR.A06(str);
                    }
                    EQM eqm2 = c32356ENd.A03;
                    if (eqm2 != null) {
                        eqm2.A0B = false;
                        eqm2.A07 = null;
                        C32356ENd.A00(c32356ENd);
                        return;
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            default:
                C45511KDa c45511KDa = (C45511KDa) this.A01;
                if (!c45511KDa.A0F) {
                    if (str.length() == 0) {
                        c45511KDa.A02(null, false);
                        return;
                    }
                    C44522JmS c44522JmS = c45511KDa.A07;
                    if (c44522JmS == null) {
                        str2 = "viewModel";
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    c44522JmS.A00(str);
                    return;
                }
                return;
        }
    }
}
