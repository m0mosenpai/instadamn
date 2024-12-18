package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4QJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4QJ extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC28041Xi A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C61982rz A03;
    public final /* synthetic */ InterfaceC674632l A04;
    public final /* synthetic */ C4QH A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4QJ(InterfaceC28041Xi interfaceC28041Xi, UserSession userSession, C61982rz c61982rz, InterfaceC674632l interfaceC674632l, C4QH c4qh, List list, int i, boolean z) {
        super(345, 3, false, false);
        this.A03 = c61982rz;
        this.A05 = c4qh;
        this.A00 = i;
        this.A01 = interfaceC28041Xi;
        this.A02 = userSession;
        this.A04 = interfaceC674632l;
        this.A07 = z;
        this.A06 = list;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [X.0ps, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Map map2;
        final List list;
        Runnable runnable;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        final C61982rz c61982rz = this.A03;
        Object obj = c61982rz.A02;
        List<String> list2 = this.A06;
        synchronized (obj) {
            for (String str : list2) {
                c61982rz.A04.remove(str);
                c61982rz.A03.remove(str);
                hashSet.add(str);
            }
            map = c61982rz.A04;
            arrayList.addAll(map.values());
            map2 = c61982rz.A03;
            arrayList.addAll(map2.values());
        }
        C4QH c4qh = this.A05;
        int i = this.A00;
        InterfaceC28041Xi interfaceC28041Xi = this.A01;
        final ArrayList A00 = C61982rz.A00(interfaceC28041Xi, c61982rz, c4qh, arrayList, hashSet, i, false);
        UserSession userSession = this.A02;
        if (C1XT.A03(userSession) && C18U.A06(C06090Tz.A05, userSession, 36328418232778243L) && (!(A00 instanceof Collection) || !A00.isEmpty())) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                if (C3YW.A02((C3XG) it.next())) {
                    list = C61982rz.A00(interfaceC28041Xi, c61982rz, c4qh, arrayList, hashSet, i, true);
                    break;
                }
            }
        }
        list = C16930sl.A00;
        final InterfaceC674632l interfaceC674632l = this.A04;
        if (this.A07) {
            ?? obj2 = new Object();
            List Ctr = interfaceC674632l.Ctr(A00);
            obj2.A00 = Ctr;
            if (Ctr.isEmpty() && (!list.isEmpty())) {
                obj2.A00 = interfaceC674632l.Ctr(list);
            }
            synchronized (obj) {
                Iterator it2 = ((List) obj2.A00).iterator();
                while (it2.hasNext()) {
                    String str2 = ((C3XG) it2.next()).A09;
                    map.remove(str2);
                    map2.remove(str2);
                }
            }
            runnable = new RunnableC43115J4e(interfaceC674632l, obj2);
        } else {
            runnable = new Runnable() { // from class: X.4QM
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC674632l interfaceC674632l2 = interfaceC674632l;
                    List<C3XG> Ctr2 = interfaceC674632l2.Ctr(A00);
                    if (Ctr2.isEmpty()) {
                        List list3 = list;
                        if (!list3.isEmpty()) {
                            Ctr2 = interfaceC674632l2.Ctr(list3);
                        }
                    }
                    C61982rz c61982rz2 = c61982rz;
                    synchronized (c61982rz2.A02) {
                        for (C3XG c3xg : Ctr2) {
                            Map map3 = c61982rz2.A04;
                            String str3 = c3xg.A09;
                            map3.remove(str3);
                            c61982rz2.A03.remove(str3);
                        }
                    }
                    interfaceC674632l2.DHK(!Ctr2.isEmpty());
                }
            };
        }
        C11T.A07(false, runnable);
    }
}
