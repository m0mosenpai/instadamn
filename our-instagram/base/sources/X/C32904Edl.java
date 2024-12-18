package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Edl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32904Edl extends AbstractC52526NLv {
    public final /* synthetic */ ENT A00;

    @Override // X.C31253Dob, X.InterfaceC37216GaR
    public final void DAw(C47P c47p, String str, int i) {
        C14360o3.A0B(c47p, 0);
        super.DAw(c47p, str, i);
        ENT ent = this.A00;
        EQL eql = ent.A01;
        if (eql == null) {
            C14360o3.A0F("oneCategoryAdapter");
            throw C00O.createAndThrow();
        }
        ArrayList arrayList = eql.A00;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C47O A00 = ((C47L) next).A00();
            if (A00 != null) {
                if (A00.equals(c47p)) {
                    A1E.add(next);
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        arrayList.removeAll(A1E);
        EQL.A00(eql);
        AbstractC31176DnK.A0Q(ent.A09).E4s(new C151746sK(c47p));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32904Edl(UserSession userSession, ENT ent) {
        super(ent, ent, userSession);
        this.A00 = ent;
    }

    @Override // X.AbstractC52526NLv
    public final void A02() {
        EQL eql = this.A00.A01;
        if (eql == null) {
            C14360o3.A0F("oneCategoryAdapter");
            throw C00O.createAndThrow();
        }
        EQL.A00(eql);
    }
}
