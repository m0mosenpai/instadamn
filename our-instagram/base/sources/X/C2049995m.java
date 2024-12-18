package X;

import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.95m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2049995m {
    public final C84613qA A00;
    public final InterfaceC02900Bo A01;
    public final Map A02 = new ConcurrentHashMap();
    public final AbstractC12990ll A03;

    public static int A00(C2049995m c2049995m, String str) {
        Map map = c2049995m.A02;
        int i = 0;
        if (map.get(str) != null && c2049995m.A06(str)) {
            java.util.Set BOd = c2049995m.A01.BOd();
            HashSet A02 = A02(((AccountFamily) map.get(str)).A04);
            Iterator it = BOd.iterator();
            while (it.hasNext()) {
                if (A02.contains(it.next())) {
                    i++;
                }
            }
        }
        return i;
    }

    public static C2049995m A01(final AbstractC12990ll abstractC12990ll) {
        return (C2049995m) abstractC12990ll.A01(C2049995m.class, new InterfaceC16820sZ() { // from class: X.95n
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C2049995m(AbstractC12990ll.this);
            }
        });
    }

    public static HashSet A02(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((User) it.next()).getId());
        }
        return hashSet;
    }

    public final User A03(UserSession userSession) {
        String str = userSession.userId;
        Map map = this.A02;
        if (map.get(str) == null) {
            return null;
        }
        if (A07(str)) {
            return C08730cb.A00(userSession).A00();
        }
        List<User> BOe = C0BQ.A00(userSession).BOe();
        HashSet A02 = A02(((AccountFamily) map.get(str)).A04);
        ArrayList arrayList = new ArrayList();
        for (User user : BOe) {
            if (A02.contains(user.getId())) {
                arrayList.add(user);
            }
        }
        if (arrayList.size() == 1) {
            return (User) arrayList.get(0);
        }
        C0w9.A03(AbstractC111324zv.A00(287), "Showing Log Out family option when there's multiple or no main accounts logged in");
        return null;
    }

    public final boolean A05(String str) {
        String A00;
        String str2;
        AccountFamily accountFamily = (AccountFamily) this.A02.get(str);
        if (accountFamily == null) {
            A00 = AbstractC111324zv.A00(287);
            str2 = AbstractC111324zv.A00(1815);
        } else {
            EnumC2050795x enumC2050795x = accountFamily.A00;
            if (enumC2050795x == EnumC2050795x.UNKNOWN) {
                A00 = AbstractC111324zv.A00(287);
                str2 = "The linking state of the requested account isn't fetched yet";
            } else {
                if (enumC2050795x == EnumC2050795x.UNLINKED_ACCOUNT) {
                    return false;
                }
                return true;
            }
        }
        C0w9.A03(A00, str2);
        return false;
    }

    public C2049995m(AbstractC12990ll abstractC12990ll) {
        C84613qA c84613qA;
        this.A03 = abstractC12990ll;
        this.A01 = C0BQ.A00(abstractC12990ll);
        if (abstractC12990ll instanceof UserSession) {
            c84613qA = C84613qA.A00(abstractC12990ll);
        } else {
            c84613qA = null;
        }
        this.A00 = c84613qA;
    }

    public final ArrayList A04(UserSession userSession) {
        List list;
        User A03 = A03(userSession);
        if (A03 != null) {
            String id = A03.getId();
            Map map = this.A02;
            if (map.get(id) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(A03);
                AccountFamily accountFamily = (AccountFamily) map.get(A03.getId());
                if (accountFamily.A04.isEmpty()) {
                    list = accountFamily.A03;
                } else {
                    list = accountFamily.A04;
                }
                HashSet A02 = A02(list);
                for (User user : C0BQ.A00(userSession).BOe()) {
                    if (A02.contains(user.getId())) {
                        arrayList.add(user);
                    }
                }
                return arrayList;
            }
        }
        return null;
    }

    public final boolean A06(String str) {
        if (A05(str)) {
            Map map = this.A02;
            if (map.get(str) != null && ((AccountFamily) map.get(str)).A00 == EnumC2050795x.CHILD_ACCOUNT) {
                return true;
            }
        }
        return false;
    }

    public final boolean A07(String str) {
        if (A05(str)) {
            Map map = this.A02;
            if (map.get(str) != null && ((AccountFamily) map.get(str)).A00 == EnumC2050795x.MAIN_ACCOUNT) {
                return true;
            }
        }
        return false;
    }
}
