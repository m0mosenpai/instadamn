package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dz3 */
/* loaded from: classes6.dex */
public abstract class AbstractC31842Dz3 extends AbstractC52922bZ {
    public final C41951wl A00;
    public final java.util.Set A01;
    public final C05A A02;
    public final C0UO A03;
    public final boolean A04;

    public /* synthetic */ AbstractC31842Dz3(UserSession userSession, int i) {
        boolean z = (i & 2) != 0;
        C41951wl A00 = (i & 4) != 0 ? C41951wl.A00(userSession) : null;
        C14360o3.A0B(A00, 3);
        this.A04 = z;
        this.A00 = A00;
        C008002u A0z = AbstractC25227BEk.A0z();
        this.A02 = A0z;
        this.A03 = AbstractC208910l.A02(A0z);
        this.A01 = AbstractC31171DnF.A0l();
    }

    public abstract Integer A02();

    public abstract InterfaceC19390xP A04();

    public abstract void A06();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static /* synthetic */ void A00(AbstractC31842Dz3 abstractC31842Dz3, List list, java.util.Set set, int i) {
        BHS bhs;
        List list2;
        List list3;
        if ((i & 1) != 0) {
            C34539FJz c34539FJz = (C34539FJz) abstractC31842Dz3.A02.getValue();
            if (c34539FJz != null && (list3 = c34539FJz.A01) != null) {
                list = AbstractC167007dF.A0i(list3);
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    list.add(((C26085BgE) it.next()).A02);
                }
            } else {
                list = C16930sl.A00;
            }
        }
        if ((i & 2) != 0) {
            C34539FJz c34539FJz2 = (C34539FJz) abstractC31842Dz3.A02.getValue();
            if (c34539FJz2 != null && (list2 = c34539FJz2.A01) != null) {
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj : list2) {
                    if (((C26085BgE) obj).A04) {
                        A1E.add(obj);
                    }
                }
                ArrayList A0i = AbstractC167007dF.A0i(A1E);
                Iterator it2 = A1E.iterator();
                while (it2.hasNext()) {
                    AbstractC31173DnH.A1X((User) ((C26085BgE) it2.next()).A02, A0i);
                }
                set = AbstractC001800i.A0k(A0i);
            } else {
                set = C16910sj.A00;
            }
        }
        ArrayList A0i2 = AbstractC167007dF.A0i(list);
        Iterator it3 = list.iterator();
        while (true) {
            bhs = null;
            Integer num = null;
            boolean z = false;
            if (!it3.hasNext()) {
                break;
            }
            User A15 = AbstractC25226BEj.A15(it3);
            boolean A1Y = AbstractC31175DnJ.A1Y(A15, set);
            C41951wl c41951wl = abstractC31842Dz3.A00;
            C42321xM A02 = c41951wl.A02(A15.getId());
            if (A02 != null && A02.A05) {
                z = true;
            }
            C42321xM A022 = c41951wl.A02(A15.getId());
            if (A022 != null) {
                num = Integer.valueOf((int) ((System.currentTimeMillis() - A022.A01) / StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS));
            }
            A0i2.add(new C26085BgE(A15, num, A1Y, z));
        }
        C05A c05a = abstractC31842Dz3.A02;
        Integer A023 = abstractC31842Dz3.A02();
        if (A023 != null) {
            bhs = BHS.A00(new Object[0], A023.intValue());
        }
        c05a.Egh(new C34539FJz(bhs, A0i2));
    }

    public final java.util.Set A03() {
        List list;
        C34539FJz c34539FJz = (C34539FJz) this.A02.getValue();
        if (c34539FJz != null && (list = c34539FJz.A01) != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (((C26085BgE) obj).A04) {
                    A1E.add(obj);
                }
            }
            ArrayList A0q = AbstractC167017dG.A0q(A1E);
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                A0q.add(((C26085BgE) it.next()).A02);
            }
            return AbstractC001800i.A0k(A0q);
        }
        return C16910sj.A00;
    }

    public int A01() {
        return 100;
    }

    public final void A05() {
        AbstractC18560vj.A03(AbstractC141776au.A00(this), new C15340po(new C57167PZl(this, null, 41), A04()));
    }
}
