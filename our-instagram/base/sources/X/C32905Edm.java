package X;

import com.instagram.common.session.UserSession;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Edm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32905Edm extends AbstractC52526NLv {
    public final /* synthetic */ C32353ENa A00;

    @Override // X.C31253Dob, X.InterfaceC37216GaR
    public final Integer AvK(String str) {
        EQJ eqj = (EQJ) this.A00.getAdapter();
        if (eqj != null) {
            return (Integer) eqj.A0I.get(str);
        }
        return null;
    }

    @Override // X.C31253Dob, X.InterfaceC37216GaR
    public final void DAw(C47P c47p, String str, int i) {
        C14360o3.A0B(c47p, 0);
        super.DAw(c47p, str, i);
        C32353ENa c32353ENa = this.A00;
        EQJ eqj = c32353ENa.A01;
        if (eqj == null) {
            C14360o3.A0F("explorePeopleAdapter");
            throw C00O.createAndThrow();
        }
        ArrayList arrayList = eqj.A0G;
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            C47K c47k = (C47K) it.next();
            if (!c47k.A07()) {
                List list = c47k.A0M;
                if (list != null && AbstractC001800i.A0u(list, c47p)) {
                    C15500q5.A00(list).remove(c47p);
                    if (eqj.A0K) {
                        ArrayList arrayList2 = eqj.A0H;
                        if (!((Collection) AbstractC31173DnH.A0i(arrayList2, i2)).isEmpty()) {
                            Object remove = ((AbstractList) arrayList2.get(i2)).remove(0);
                            C14360o3.A07(remove);
                            C47O c47o = (C47O) remove;
                            List list2 = ((C47K) arrayList.get(i2)).A0M;
                            if (list2 != null) {
                                list2.add(c47o);
                            }
                            eqj.A0J.add(c47o.getId());
                        }
                    }
                }
            } else if (!c47k.A08()) {
                c47k.A06(c47p.getId());
            }
            i2 = i3;
        }
        eqj.A0J.remove(c47p.getId());
        EQJ.A01(eqj);
        AbstractC31176DnK.A0Q(c32353ENa.A0S).E4s(new C151746sK(c47p));
    }

    @Override // X.C31253Dob, X.InterfaceC37216GaR
    public final void DHq(C47P c47p, String str, int i) {
        C14360o3.A0B(c47p, 0);
        super.DHq(c47p, str, i);
        C32353ENa c32353ENa = this.A00;
        if (c32353ENa.A05 == C05F.A0C) {
            C35037FcA A06 = C1Q9.A1y.A02(AbstractC166987dD.A0o(c32353ENa.A0S)).A06(null, c32353ENa.A04);
            A06.A04("target_id", c47p.getId());
            A06.A03("position", i);
            A06.A02();
        }
    }

    @Override // X.C31253Dob, X.InterfaceC37216GaR
    public final void Dxe(C47P c47p, String str, int i) {
        C14360o3.A0B(c47p, 0);
        super.Dxe(c47p, str, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32905Edm(UserSession userSession, C32353ENa c32353ENa) {
        super(c32353ENa, c32353ENa, userSession);
        this.A00 = c32353ENa;
    }
}
