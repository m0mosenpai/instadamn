package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4lO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C103484lO {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Double A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;
    public final InterfaceC39571se A08;

    public final C39561sd A00() {
        ArrayList arrayList;
        Boolean bool = this.A00;
        Double d = this.A01;
        String str = this.A04;
        String str2 = this.A05;
        Double d2 = this.A02;
        String str3 = this.A06;
        Double d3 = this.A03;
        List list = this.A07;
        if (list != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC43522JKi) it.next()).F3b());
            }
        } else {
            arrayList = null;
        }
        return new C39561sd(bool, d, d2, d3, str, str2, str3, arrayList);
    }

    public C103484lO(InterfaceC39571se interfaceC39571se) {
        this.A08 = interfaceC39571se;
        this.A00 = interfaceC39571se.B1k();
        this.A01 = interfaceC39571se.BQC();
        this.A04 = interfaceC39571se.Bew();
        this.A05 = interfaceC39571se.Bex();
        this.A02 = interfaceC39571se.BfM();
        this.A06 = interfaceC39571se.BjF();
        this.A03 = interfaceC39571se.C8M();
        this.A07 = interfaceC39571se.CDr();
    }
}
