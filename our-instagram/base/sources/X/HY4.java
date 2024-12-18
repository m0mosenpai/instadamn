package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class HY4 extends AbstractC65202xI implements InterfaceC65222xK, InterfaceC65242xM, InterfaceC65252xN, InterfaceC65272xP {
    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ void A8q(Object obj, int i) {
    }

    public final C3XG A01(int i) {
        boolean z = this instanceof C37432GeC;
        AbstractC65332xV abstractC65332xV = (AbstractC65332xV) ((AbstractC65202xI) this).A00;
        int size = abstractC65332xV.A01.size();
        if (z) {
            if (i < size) {
                return C3XH.A01((C38321qM) abstractC65332xV.A01.get(i));
            }
            return null;
        }
        if (i < size) {
            return (C3XG) abstractC65332xV.A01.get(i);
        }
        return null;
    }

    public final C66772zu A02() {
        if (this instanceof C37432GeC) {
            return (C66772zu) ((C37432GeC) this).A0E.getValue();
        }
        return ((C38284GsT) this).A07;
    }

    public final List A03() {
        if (this instanceof C38284GsT) {
            return AbstractC31172DnG.A19(((AbstractC65332xV) ((AbstractC65202xI) this).A00).A01);
        }
        return C3XG.A0A.A06(A04());
    }

    public final List A04() {
        if (this instanceof C37432GeC) {
            C37432GeC c37432GeC = (C37432GeC) this;
            if (c37432GeC.A0G) {
                if (!C18U.A06(C06090Tz.A05, c37432GeC.A05, 36330252183552774L)) {
                    List distinctItems = c37432GeC.getDistinctItems(C38321qM.class);
                    C14360o3.A0A(distinctItems);
                    return distinctItems;
                }
            }
            return ((AbstractC65332xV) ((AbstractC65202xI) c37432GeC).A00).A01;
        }
        return C3XH.A03(A03());
    }

    public final void A05() {
        if (this instanceof C37432GeC) {
            C37432GeC c37432GeC = (C37432GeC) this;
            ((AbstractC65332xV) ((AbstractC65202xI) c37432GeC).A00).A04();
            C37432GeC.A00(c37432GeC);
        } else {
            C38284GsT c38284GsT = (C38284GsT) this;
            ((AbstractC65332xV) ((AbstractC65202xI) c38284GsT).A00).A04();
            C38284GsT.A00(c38284GsT);
        }
    }

    public final void A06() {
        if (this instanceof C37432GeC) {
            ((C37432GeC) this).A00 = true;
        } else {
            ((C38284GsT) this).A02 = true;
        }
    }

    public final void A07(C19260xA c19260xA) {
        C65672y3 c65672y3;
        if (this instanceof C37432GeC) {
            C37432GeC c37432GeC = (C37432GeC) this;
            C37443GeN c37443GeN = (C37443GeN) c37432GeC.A0F.getValue();
            if (c37443GeN != null) {
                C85793s8 c85793s8 = c37443GeN.A02;
                if (c85793s8 == null) {
                    C14360o3.A0F("mediaHeaderViewBinder");
                    throw C00O.createAndThrow();
                }
                c85793s8.A00 = c19260xA;
            }
            c65672y3 = c37432GeC.A06;
        } else {
            c65672y3 = ((C38284GsT) this).A06;
        }
        if (c65672y3 != null) {
            c65672y3.A07(c19260xA);
        }
    }

    public final void A08(Hd8 hd8) {
        if (!(this instanceof C37432GeC)) {
            ((C38284GsT) this).A01 = hd8;
        }
    }

    public final void A09(User user) {
        User user2;
        if (this instanceof C37432GeC) {
            C37432GeC c37432GeC = (C37432GeC) this;
            AbstractC65332xV abstractC65332xV = (AbstractC65332xV) ((AbstractC65202xI) c37432GeC).A00;
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator A13 = AbstractC166997dE.A13(abstractC65332xV.A02);
            while (A13.hasNext()) {
                Object next = A13.next();
                C38321qM c38321qM = (C38321qM) next;
                C14360o3.A0B(c38321qM, 0);
                if (AbstractC25225BEi.A1a(user.getId(), AbstractC37303Gc4.A0T(c37432GeC.A05, c38321qM))) {
                    A1E2.add(next);
                } else {
                    A1E.add(next);
                }
            }
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                abstractC65332xV.A0D(it.next());
            }
            AbstractC37302Gc3.A1Q(abstractC65332xV, A1E2);
            C37432GeC.A00(c37432GeC);
            return;
        }
        C38284GsT c38284GsT = (C38284GsT) this;
        AbstractC65332xV abstractC65332xV2 = (AbstractC65332xV) ((AbstractC65202xI) c38284GsT).A00;
        ArrayList A1E3 = AbstractC166987dD.A1E();
        ArrayList A1E4 = AbstractC166987dD.A1E();
        Iterator A132 = AbstractC166997dE.A13(abstractC65332xV2.A02);
        while (A132.hasNext()) {
            Object next2 = A132.next();
            C3XG c3xg = (C3XG) next2;
            C14360o3.A0B(c3xg, 0);
            InterfaceC38381qS interfaceC38381qS = c3xg.A05;
            C38321qM A02 = C3XH.A02(interfaceC38381qS);
            if (A02 != null) {
                user2 = A02.A2E(c38284GsT.A05);
            } else {
                user2 = null;
            }
            if ((interfaceC38381qS instanceof InterfaceC38371qR) && user2 != null && AbstractC31174DnI.A1Y(user2, user.getId())) {
                A1E3.add(next2);
            } else {
                A1E4.add(next2);
            }
        }
        Iterator it2 = A1E3.iterator();
        while (it2.hasNext()) {
            abstractC65332xV2.A0D(it2.next());
        }
        AbstractC37302Gc3.A1Q(abstractC65332xV2, A1E4);
        C38284GsT.A00(c38284GsT);
    }

    public final void A0A(String str) {
        Hashtag B7K;
        String str2;
        if (this instanceof C37432GeC) {
            C37432GeC c37432GeC = (C37432GeC) this;
            AbstractC65332xV abstractC65332xV = (AbstractC65332xV) ((AbstractC65202xI) c37432GeC).A00;
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator A13 = AbstractC166997dE.A13(abstractC65332xV.A02);
            while (A13.hasNext()) {
                Object next = A13.next();
                C38321qM c38321qM = (C38321qM) next;
                C14360o3.A0B(c38321qM, 0);
                Hashtag B7K2 = c38321qM.A0C.B7K();
                if (B7K2 != null) {
                    str2 = B7K2.getId();
                } else {
                    str2 = null;
                }
                if (!str.equals(str2)) {
                    A1E2.add(next);
                } else {
                    A1E.add(next);
                }
            }
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                abstractC65332xV.A0D(it.next());
            }
            AbstractC37302Gc3.A1Q(abstractC65332xV, A1E2);
            C37432GeC.A00(c37432GeC);
            return;
        }
        C38284GsT c38284GsT = (C38284GsT) this;
        AbstractC65332xV abstractC65332xV2 = (AbstractC65332xV) ((AbstractC65202xI) c38284GsT).A00;
        ArrayList A1E3 = AbstractC166987dD.A1E();
        ArrayList A1E4 = AbstractC166987dD.A1E();
        Iterator A132 = AbstractC166997dE.A13(abstractC65332xV2.A02);
        while (A132.hasNext()) {
            Object next2 = A132.next();
            C3XG c3xg = (C3XG) next2;
            C14360o3.A0B(c3xg, 0);
            InterfaceC38381qS interfaceC38381qS = c3xg.A05;
            if (interfaceC38381qS instanceof InterfaceC38371qR) {
                C38321qM A02 = C3XH.A02(interfaceC38381qS);
                String str3 = null;
                if (A02 != null && A02.A0C.B7K() != null) {
                    C38321qM A022 = C3XH.A02(interfaceC38381qS);
                    if (A022 != null && (B7K = A022.A0C.B7K()) != null) {
                        str3 = B7K.getId();
                    }
                    if (str.equals(str3)) {
                        A1E3.add(next2);
                    }
                }
            }
            A1E4.add(next2);
        }
        Iterator it2 = A1E3.iterator();
        while (it2.hasNext()) {
            abstractC65332xV2.A0D(it2.next());
        }
        AbstractC37302Gc3.A1Q(abstractC65332xV2, A1E4);
        C38284GsT.A00(c38284GsT);
    }

    public final void A0B(List list) {
        if (this instanceof C37432GeC) {
            C37432GeC c37432GeC = (C37432GeC) this;
            ((AbstractC65332xV) ((AbstractC65202xI) c37432GeC).A00).A0B(list);
            C37432GeC.A00(c37432GeC);
        } else {
            C38284GsT c38284GsT = (C38284GsT) this;
            ((AbstractC65332xV) ((AbstractC65202xI) c38284GsT).A00).A0B(C3XG.A0A.A06(list));
            C38284GsT.A00(c38284GsT);
        }
    }

    public final void A0C(List list, int i) {
        if (this instanceof C37432GeC) {
            C37432GeC c37432GeC = (C37432GeC) this;
            AbstractC65332xV abstractC65332xV = (AbstractC65332xV) ((AbstractC65202xI) c37432GeC).A00;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC65332xV.A01(abstractC65332xV, it.next(), i, true);
            }
            C37432GeC.A00(c37432GeC);
            return;
        }
        C38284GsT c38284GsT = (C38284GsT) this;
        AbstractC65332xV abstractC65332xV2 = (AbstractC65332xV) ((AbstractC65202xI) c38284GsT).A00;
        Iterator it2 = C3XG.A0A.A06(list).iterator();
        while (it2.hasNext()) {
            AbstractC65332xV.A01(abstractC65332xV2, it2.next(), i, true);
        }
        C38284GsT.A00(c38284GsT);
    }

    public final void A0D(boolean z) {
        if (this instanceof C37432GeC) {
            ((C37432GeC) this).A01 = z;
        } else {
            ((C38284GsT) this).A03 = z;
        }
    }

    public final boolean A0E(C38321qM c38321qM) {
        boolean z = this instanceof C37432GeC;
        InterfaceC65342xW interfaceC65342xW = ((AbstractC65202xI) this).A00;
        if (z) {
            return ((AbstractC65332xV) interfaceC65342xW).A0C(c38321qM);
        }
        return ((C65322xU) interfaceC65342xW).A0F(c38321qM);
    }

    public final boolean AJn(String str) {
        if (this instanceof C38284GsT) {
            C38284GsT c38284GsT = (C38284GsT) this;
            C14360o3.A0B(str, 0);
            C65322xU c65322xU = (C65322xU) ((AbstractC65202xI) c38284GsT).A00;
            UserSession userSession = c38284GsT.A05;
            Iterator it = c65322xU.A01.iterator();
            while (it.hasNext()) {
                User A2E = AbstractC31172DnG.A0i(it).A2E(userSession);
                A2E.getClass();
                if (A2E.getId().equals(str)) {
                }
            }
            return false;
        }
        C37432GeC c37432GeC = (C37432GeC) this;
        C14360o3.A0B(str, 0);
        AbstractC65332xV abstractC65332xV = (AbstractC65332xV) ((AbstractC65202xI) c37432GeC).A00;
        UserSession userSession2 = c37432GeC.A05;
        C14360o3.A0B(userSession2, 0);
        List list = abstractC65332xV.A01;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (C14360o3.A0K(AbstractC37303Gc4.A0T(userSession2, AbstractC31172DnG.A0i(it2)), str)) {
            }
        }
        return false;
        return true;
    }

    public final void FAg() {
        if (this instanceof C37432GeC) {
            C37432GeC.A00((C37432GeC) this);
        } else {
            C38284GsT.A00((C38284GsT) this);
        }
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ List CCN() {
        return AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ int BK6(String str) {
        return -1;
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ Object EFR(int i) {
        return null;
    }
}
