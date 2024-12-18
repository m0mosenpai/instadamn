package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes6.dex */
public final class ET8 extends C1P1 {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final String A02;

    public ET8(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        AbstractC167017dG.A1R(interfaceC11380iw, str);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = str;
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1608736339);
        C3JG.A02(C05F.A01);
        C0f9.A0A(723728638, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        String str;
        int A03 = C0f9.A03(-368562983);
        ECJ ecj = (ECJ) obj;
        int A032 = C0f9.A03(1545869228);
        C14360o3.A0B(ecj, 0);
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        C1LC it = AbstractC31173DnH.A0L(ecj.A01).iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            EfU efU = ((C33597Et9) it.next()).A01;
            AbstractC31173DnH.A1X(efU.A00, linkedList);
            linkedList2.add(efU.A00.getUsername());
        }
        LinkedList linkedList3 = new LinkedList();
        LinkedList linkedList4 = new LinkedList();
        C1LC it2 = AbstractC31173DnH.A0L(ecj.A00).iterator();
        C14360o3.A07(it2);
        while (it2.hasNext()) {
            FK7 fk7 = (FK7) it2.next();
            AbstractC31173DnH.A1X(fk7.A00.A01, linkedList3);
            linkedList4.add(fk7.A00.A01.getUsername());
        }
        UserSession userSession = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        String str2 = this.A02;
        C14360o3.A0B(userSession, 0);
        if (interfaceC11380iw != null) {
            str = interfaceC11380iw.getModuleName();
        } else {
            str = null;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_one_login_response_received");
        A0f.AAP("waterfall_id", str2);
        HashSet A1H = AbstractC166987dD.A1H();
        Iterator it3 = linkedList.iterator();
        while (it3.hasNext()) {
            AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it3), A1H);
        }
        A0f.AAL("array_newly_logged_in_child_account_ids", A1H);
        HashSet A1H2 = AbstractC166987dD.A1H();
        Iterator it4 = linkedList3.iterator();
        while (it4.hasNext()) {
            AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it4), A1H2);
        }
        A0f.AAL("array_newly_login_deferred_child_account_ids", A1H2);
        AbstractC25225BEi.A1O(A0f, str);
        A0f.Cht();
        ImmutableList A0L = AbstractC31173DnH.A0L(ecj.A01);
        LinkedList linkedList5 = new LinkedList();
        Iterator<E> it5 = A0L.iterator();
        while (it5.hasNext()) {
            C33597Et9 c33597Et9 = (C33597Et9) it5.next();
            User user = c33597Et9.A01.A00;
            C14360o3.A07(user);
            AbstractC31173DnH.A1X(user, linkedList5);
            ((C17110t6) C0BQ.A00(userSession)).A02.A07(user);
            String str3 = c33597Et9.A00.A00.A00;
            C14360o3.A07(str3);
            C1FA A00 = C1F8.A00(userSession);
            String id = user.getId();
            if (!id.equals(A00.A02)) {
                AbstractC31176DnK.A1X(A00.A00, id, str3);
            } else {
                throw AbstractC166987dD.A12(AbstractC111324zv.A00(23));
            }
        }
        List list = ((C34388FEe) userSession.A01(C34388FEe.class, new C36983GRa())).A00;
        list.clear();
        list.addAll(linkedList5);
        ((C17110t6) C0BQ.A00(userSession)).A02.A07(AbstractC166997dE.A0Y(userSession));
        C3JG.A02(C05F.A01);
        ImmutableList A0L2 = AbstractC31173DnH.A0L(ecj.A00);
        Iterator<E> it6 = A0L2.iterator();
        while (it6.hasNext()) {
            ((FK7) it6.next()).A01 = userSession.userId;
        }
        C84613qA.A00(userSession).A04(A0L2);
        C95P.A00(userSession, interfaceC11380iw.getModuleName()).A01();
        AbstractC25651Mw.A00(userSession).E4s(new C2AS(AbstractC166997dE.A0Y(userSession)));
        AbstractC25651Mw.A00(userSession).E4s(new C3IM(AbstractC166997dE.A0Y(userSession), linkedList2, linkedList4, linkedList, linkedList3));
        C0f9.A0A(-1836382614, A032);
        C0f9.A0A(467315173, A03);
    }
}
