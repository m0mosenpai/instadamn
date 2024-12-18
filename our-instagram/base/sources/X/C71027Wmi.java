package X;

import com.instagram.model.mapquery.MapQuery;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.Wmi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71027Wmi implements XBJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C71027Wmi(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = obj;
    }

    @Override // X.XBJ
    public final void EKb() {
        switch (this.A00) {
            case 0:
                if (((Tx0) this.A01).A0F) {
                    U1X.A00(((C66152U1t) this.A03).A01).A00((JIN) this.A02);
                }
                java.util.Set set = ((C66152U1t) this.A03).A03;
                JIN jin = (JIN) this.A02;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((XBE) it.next()).CMK(jin.getId());
                }
                return;
            case 1:
                if (((Tx0) this.A02).A0F) {
                    VWR.A00(((C66152U1t) this.A03).A01).A02((MapQuery) this.A01);
                }
                Iterator it2 = ((C66152U1t) this.A03).A06.iterator();
                while (it2.hasNext()) {
                    C70727Wft.A00((C70727Wft) it2.next());
                }
                return;
            default:
                if (((Tx0) this.A01).A0F) {
                    AbstractC65792TuA.A00(((C66152U1t) this.A03).A01).A01((User) this.A02);
                }
                java.util.Set set2 = ((C66152U1t) this.A03).A08;
                User user = (User) this.A02;
                Iterator it3 = set2.iterator();
                while (it3.hasNext()) {
                    ((XBI) it3.next()).CN3(user.getId());
                }
                return;
        }
    }
}
