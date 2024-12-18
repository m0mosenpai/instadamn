package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oog, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55714Oog implements C3SZ {
    public final C0JM A00;
    public final C4QF A01;

    public C55714Oog(C0JM c0jm, C4QF c4qf) {
        C14360o3.A0B(c4qf, 1);
        this.A01 = c4qf;
        this.A00 = c0jm;
    }

    @Override // X.C3SZ
    public final C3SN E8D(String str, int i) {
        C14360o3.A0B(str, 0);
        C3SN A00 = A00(str, i);
        try {
            Iterable iterable = (Iterable) A00.A00;
            ArrayList A0q = AbstractC167017dG.A0q(iterable);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                AbstractC31177DnL.A1R((String) ((C51574MqS) it.next()).A02, A0q);
            }
            return MSW.A0L(A0q, A00.A01, A00.A02);
        } catch (NumberFormatException unused) {
            return MSW.A0L(C16930sl.A00, "Number format exception when using toLong()", false);
        }
    }

    @Override // X.C3SZ
    public final C3SN E8E(List list, int i) {
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            C3SN E8D = E8D(A1B, 0);
            if (!E8D.A02) {
                return MSW.A0L(AbstractC06930Yk.A0E(), E8D.A01, false);
            }
            A1G.put(A1B, E8D.A00);
        }
        return MSZ.A0O(A1G);
    }

    @Override // X.C3SZ
    public final void FEK(String str, long j, long j2) {
        List list;
        String obj = Long.valueOf(j).toString();
        C3SN A00 = A00(str, 0);
        C51574MqS c51574MqS = new C51574MqS(obj, this.A00.now(), j2);
        if (!A00.A02) {
            list = AbstractC166987dD.A1J(c51574MqS);
        } else {
            Object obj2 = A00.A00;
            ((AbstractCollection) obj2).add(c51574MqS);
            list = (List) obj2;
        }
        A01(str, list);
    }

    private final C3SN A00(String str, int i) {
        long now = this.A00.now();
        C4QF c4qf = this.A01;
        C14360o3.A0B(str, 0);
        String A01 = c4qf.A01(AnonymousClass001.A0R("sig_", str));
        try {
            ArrayList A1E = AbstractC166987dD.A1E();
            int i2 = 0;
            if (A01.length() != 0) {
                List A0R = AbstractC001900j.A0R(A01, new String[]{";"}, 0);
                int A00 = C17x.A00(0, AbstractC25226BEj.A05(A0R), 3);
                if (A00 >= 0) {
                    while (true) {
                        Object obj = A0R.get(i2);
                        long parseLong = Long.parseLong(AbstractC25226BEj.A1I(A0R, i2 + 1));
                        long parseLong2 = Long.parseLong(AbstractC25226BEj.A1I(A0R, i2 + 2));
                        if (now <= parseLong + parseLong2) {
                            A1E.add(new C51574MqS(obj, parseLong, parseLong2));
                        }
                        if (i2 == A00) {
                            break;
                        }
                        i2 += 3;
                    }
                }
                if (A1E.size() > 1) {
                    C01T.A1D(A1E, new C50583MUt(0));
                }
                if (i > 0) {
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    int size = A1E.size();
                    for (int max = Math.max(0, A1E.size() - i); max < size; max++) {
                        A1E2.add(A1E.get(max));
                    }
                    A1E = A1E2;
                }
            }
            return MSW.A0L(A1E, null, true);
        } catch (IndexOutOfBoundsException unused) {
            return MSW.A0L(AbstractC166987dD.A1E(), "signal fields not  3", false);
        }
    }

    private final void A01(String str, List list) {
        String A19;
        C4QF c4qf = this.A01;
        C14360o3.A0B(str, 0);
        String A0R = AnonymousClass001.A0R("sig_", str);
        if (list.isEmpty()) {
            A19 = "";
        } else {
            StringBuilder A1C = AbstractC166987dD.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C51574MqS c51574MqS = (C51574MqS) it.next();
                A1C.append((String) c51574MqS.A02);
                A1C.append(";");
                A1C.append(c51574MqS.A00);
                A1C.append(";");
                A1C.append(c51574MqS.A01);
                A1C.append(";");
            }
            A1C.deleteCharAt(A1C.length() - 1);
            A19 = AbstractC166987dD.A19(A1C);
        }
        c4qf.A06(A0R, A19);
    }

    @Override // X.C3SZ
    public final void CgV(int i) {
        List A02 = this.A01.A02();
        ArrayList A0q = AbstractC167017dG.A0q(A02);
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC001900j.A0F("sig_", AbstractC166987dD.A1B(it)));
        }
        Iterator it2 = A0q.iterator();
        while (it2.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it2);
            A01(A1B, (List) A00(A1B, i).A00);
        }
    }

    @Override // X.C3SZ
    public final void EEz() {
        C4QF c4qf = this.A01;
        List A02 = c4qf.A02();
        ArrayList A0q = AbstractC167017dG.A0q(A02);
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC001900j.A0F("sig_", AbstractC166987dD.A1B(it)));
        }
        Iterator it2 = A0q.iterator();
        while (it2.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it2);
            C14360o3.A0B(A1B, 0);
            c4qf.A03(AnonymousClass001.A0R("sig_", A1B));
        }
    }
}
