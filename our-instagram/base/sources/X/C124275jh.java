package X;

import com.instagram.api.schemas.ClipsSpecialResponseType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5jh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C124275jh extends AbstractC124285ji implements InterfaceC124295jj, InterfaceC74303Vl {
    public ClipsSpecialResponseType A00;
    public Integer A01;

    @Override // X.InterfaceC124295jj
    public final boolean Cew() {
        Boolean bool = true;
        return bool.equals(this.A03);
    }

    public final void A00() {
        List list = this.A09;
        String str = this.A04;
        List list2 = this.A0A;
        C14360o3.A0A(list2);
        List list3 = this.A0B;
        HashMap hashMap = this.A08;
        C111074zO c111074zO = this.A02;
        C14360o3.A0A(c111074zO);
        super.A01 = new C124215ja(c111074zO, this.A03, str, this.A06, hashMap, list, list2, list3);
    }

    @Override // X.InterfaceC124295jj
    public final List Ahw() {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC124295jj
    public final HashMap Ahz() {
        return this.A08;
    }

    @Override // X.InterfaceC124295jj
    public final List AoM() {
        List list = this.A0B;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C120985dq A03 = AbstractC128065qa.A03((C38695H2g) it.next());
                if (A03 != null) {
                    arrayList.add(A03);
                }
            }
            return arrayList;
        }
        return C16930sl.A00;
    }

    @Override // X.InterfaceC124295jj
    public final List AoN() {
        List list = this.A0B;
        if (list == null) {
            return C16930sl.A00;
        }
        return list;
    }

    @Override // X.InterfaceC124295jj
    public List AoP() {
        if (!this.A0A.isEmpty()) {
            List list = this.A0A;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC128065qa.A02((C111034zF) it.next()));
            }
            return arrayList;
        }
        List list2 = this.A09;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(AbstractC128065qa.A02((C111034zF) it2.next()));
            }
            return arrayList2;
        }
        return C16930sl.A00;
    }

    @Override // X.InterfaceC124295jj
    public final String Bb1() {
        return this.A06;
    }

    @Override // X.InterfaceC124295jj
    public InterfaceC111084zP BbA() {
        return this.A02;
    }

    @Override // X.InterfaceC124295jj
    public final String Boh() {
        return this.A04;
    }

    @Override // X.InterfaceC74303Vl
    public String getNextMaxId() {
        return this.A02.A00;
    }

    @Override // X.InterfaceC74303Vl
    public boolean CQG() {
        if (!CQT() && !this.A02.A01) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQT() {
        C38321qM c38321qM;
        if (!C14360o3.A0K(getNextMaxId(), "0") && (!(!this.A0A.isEmpty()) || (c38321qM = ((C120985dq) AoP().get(0)).A02) == null || c38321qM.A0C.BtM() == null)) {
            return false;
        }
        return true;
    }
}
