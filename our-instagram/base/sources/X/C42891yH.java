package X;

import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1yH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42891yH {
    public UserSession A00;
    public String A01;
    public Map A02;
    public final InterfaceC41501vz A03;
    public final C42901yI A04 = new C42901yI(this);

    public C42891yH(UserSession userSession) {
        InterfaceC41501vz interfaceC41501vz = new InterfaceC41501vz() { // from class: X.1yJ
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1690729240);
                C42661xu c42661xu = (C42661xu) obj;
                int A032 = C0f9.A03(1962484389);
                C42891yH c42891yH = C42891yH.this;
                C42901yI c42901yI = c42891yH.A04;
                String str = C55772hI.A00(c42891yH.A00).A05;
                final String str2 = c42661xu.A02;
                String str3 = c42661xu.A01;
                if (!str2.equals(str3)) {
                    String str4 = c42891yH.A01;
                    if (str4 == null || (str != null && !str.equals(str4))) {
                        c42891yH.A01 = str;
                    } else {
                        Map map = c42891yH.A02;
                        Stack stack = (Stack) map.get(str);
                        if (stack == null) {
                            stack = new Stack();
                            map.put(str, stack);
                        }
                        if (!stack.isEmpty()) {
                            C42661xu c42661xu2 = (C42661xu) stack.peek();
                            C18C.A07(c42661xu2, "stack should not stock null value");
                            if (c42661xu2.A02.equals(str3)) {
                                stack.pop();
                                UserSession userSession2 = c42901yI.A00.A00;
                                if (C18U.A06(C06090Tz.A05, userSession2, 36320756010853235L)) {
                                    Map map2 = AbstractC46782Cq.A00(userSession2).A00;
                                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) map2.get(str2);
                                    if (copyOnWriteArrayList != null) {
                                        Iterator it = copyOnWriteArrayList.iterator();
                                        C14360o3.A07(it);
                                        while (it.hasNext()) {
                                            ((InterfaceC27201Tu) it.next()).cancel();
                                        }
                                    }
                                    map2.remove(str2);
                                } else {
                                    C55762OpW A00 = AbstractC54278Nyy.A00(userSession2);
                                    synchronized (A00) {
                                        try {
                                            Map map3 = A00.A00;
                                            java.util.Set set = (java.util.Set) map3.get(str2);
                                            if (set != null) {
                                                Iterator it2 = set.iterator();
                                                while (it2.hasNext()) {
                                                    ((InterfaceC27201Tu) it2.next()).cancel();
                                                }
                                            }
                                            map3.remove(str2);
                                        } finally {
                                        }
                                    }
                                }
                                final C25821No A002 = C25821No.A00();
                                if (Looper.myLooper() == Looper.getMainLooper()) {
                                    A002.A0M.A01(997783198, new Runnable() { // from class: X.6VW
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C25821No.A0C(C25821No.this, str2);
                                        }
                                    });
                                } else {
                                    C25821No.A0C(A002, str2);
                                }
                            }
                        }
                        stack.push(c42661xu);
                    }
                }
                C0f9.A0A(358512915, A032);
                C0f9.A0A(-1618960787, A03);
            }
        };
        this.A03 = interfaceC41501vz;
        this.A00 = userSession;
        this.A02 = new HashMap();
        C41451vu.A01.A02(interfaceC41501vz, C42661xu.class);
    }
}
