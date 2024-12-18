package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class IN4 {
    public Boolean A00;
    public Integer A01;
    public String A02;
    public String A03;
    public List A04;
    public final InterfaceC1347967p A05;

    public final InterfaceC1347967p A01() {
        Object A00;
        ArrayList arrayList = null;
        AbstractC167017dG.A0x();
        InterfaceC1347967p interfaceC1347967p = this.A05;
        if (interfaceC1347967p instanceof C1347867o) {
            List list = this.A04;
            if (list != null) {
                arrayList = AbstractC167017dG.A0q(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC31178DnM.A1U(arrayList, it);
                }
            }
            A00 = AbstractC37303Gc4.A06(interfaceC1347967p, new C09530e4[]{AbstractC166987dD.A1L("facepile_users", arrayList), AbstractC166987dD.A1L("num_items", this.A01), AbstractC166987dD.A1L("prompt_id", this.A02), AbstractC166987dD.A1L("prompt_text", this.A03), AbstractC166987dD.A1L(AbstractC111324zv.A00(267), this.A00)});
        } else {
            A00 = A00();
        }
        return (InterfaceC1347967p) A00;
    }

    public IN4(C1348267y c1348267y) {
        this.A05 = c1348267y;
        this.A04 = c1348267y.B49();
        this.A01 = c1348267y.BXh();
        this.A02 = c1348267y.Big();
        this.A03 = c1348267y.Bim();
        this.A00 = c1348267y.Bvl();
    }

    public final C1348267y A00() {
        AbstractC167017dG.A0x();
        List list = this.A04;
        return new C1348267y(this.A00, this.A01, this.A02, this.A03, list);
    }
}
