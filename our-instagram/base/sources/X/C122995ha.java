package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.5ha, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122995ha extends C40781ul implements InterfaceC55612h1, InterfaceC74303Vl {
    public C206369Bt A03;
    public C31200Dnj A04;
    public MUW A05;
    public C45097JxR A06;
    public C47K A07;
    public C25290BHi A08;
    public BIC A09;
    public C41061IGe A0A;
    public C123025hd A0B;
    public C123135ho A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public List A0I;
    public List A0J;
    public List A0K;
    public List A0L;
    public List A0M;
    public List A0N;
    public List A0O;
    public boolean A0P;
    public boolean A0Q;
    public String A0H = null;
    public C9BO A01 = new C9BO(2);
    public C9BO A02 = new C9BO(2);
    public C9B5 A00 = new C9B5(false, 4);
    public long A0S = -1;
    public long A0R = -1;

    @Override // X.InterfaceC74303Vl
    public final boolean CQT() {
        return false;
    }

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    public static void A00(List list, String str) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C5HW) it.next()).A0D = str;
            }
        }
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A0R;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A0S;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQG() {
        return this.A0P;
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        if (this.A0S == -1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return this.A0G;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A0R = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A0S = j;
    }
}
