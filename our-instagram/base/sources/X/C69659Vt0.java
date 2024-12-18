package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vt0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69659Vt0 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public List A0B;
    public List A0C;
    public final InterfaceC43574JMi A0D;

    public final URM A00() {
        ArrayList arrayList;
        Integer num = this.A02;
        String str = this.A04;
        String str2 = this.A05;
        Boolean bool = this.A00;
        String str3 = this.A06;
        List list = this.A0B;
        ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC43540JLa) it.next()).F1Z());
            }
        } else {
            arrayList = null;
        }
        String str4 = this.A07;
        String str5 = this.A08;
        String str6 = this.A09;
        List list2 = this.A0C;
        if (list2 != null) {
            arrayList2 = AbstractC167007dF.A0i(list2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((InterfaceC43540JLa) it2.next()).F1Z());
            }
        }
        return new URM(bool, this.A01, num, this.A03, str, str2, str3, str4, str5, str6, this.A0A, arrayList, arrayList2);
    }

    public C69659Vt0(URM urm) {
        this.A0D = urm;
        this.A02 = urm.A02;
        this.A04 = urm.A04;
        this.A05 = urm.A05;
        this.A00 = urm.A00;
        this.A06 = urm.A06;
        this.A0B = urm.A0B;
        this.A07 = urm.A07;
        this.A08 = urm.A08;
        this.A09 = urm.A09;
        this.A0C = urm.A0C;
        this.A0A = urm.A0A;
        this.A03 = urm.A03;
        this.A01 = urm.A01;
    }
}
