package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.3lN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82013lN {
    public final C25821No A00;
    public final UserSession A01;
    public final java.util.Set A03;
    public final C19L A05;
    public final Map A02 = new HashMap();
    public final java.util.Set A04 = new HashSet();

    public final void A00(C3G5 c3g5, C51R c51r, String str, String str2, Map map) {
        C14360o3.A0B(str2, 3);
        HashSet hashSet = new HashSet();
        if (str != null) {
            hashSet.add(str);
        }
        A01(c3g5, c51r, str2, map, hashSet);
    }

    public final void A01(C3G5 c3g5, C51R c51r, String str, Map map, java.util.Set set) {
        WeakReference weakReference;
        C51R c51r2;
        C14360o3.A0B(str, 3);
        C14360o3.A0B(c3g5, 4);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (this.A04.contains(it.next())) {
                it.remove();
            }
        }
        this.A04.addAll(set);
        Integer num = null;
        if (c51r != null) {
            weakReference = new WeakReference(c51r);
        } else {
            weakReference = null;
        }
        if (!set.isEmpty()) {
            C82023lO c82023lO = new C82023lO(this, str, weakReference);
            UserSession userSession = this.A01;
            C82043lQ c82043lQ = new C82043lQ(userSession, c3g5, c82023lO, str, map, set);
            if (AbstractC82073lT.A05(userSession)) {
                num = C05F.A00;
            }
            c82043lQ.A07(new C1ET(num));
            return;
        }
        if (weakReference == null || (c51r2 = (C51R) weakReference.get()) == null) {
            return;
        }
        c51r2.DqI(null);
    }

    public final void A02(C3G5 c3g5, String str, String str2, Map map) {
        C14360o3.A0B(str2, 2);
        A00(c3g5, null, str, str2, map);
    }

    public final void A03(InterfaceC81993lL interfaceC81993lL) {
        C14360o3.A0B(interfaceC81993lL, 0);
        ArrayList arrayList = new ArrayList(this.A02.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (str != null) {
                A04(interfaceC81993lL, str);
            }
        }
    }

    public final void A04(InterfaceC81993lL interfaceC81993lL, String str) {
        C14360o3.A0B(interfaceC81993lL, 1);
        List<Reference> list = (List) this.A02.get(str);
        if (list != null) {
            for (Reference reference : list) {
                Object obj = reference.get();
                if (obj == interfaceC81993lL || obj == null) {
                    list.remove(reference);
                }
            }
        }
    }

    public final void A05(InterfaceC81993lL interfaceC81993lL, String str, String str2, boolean z) {
        C14360o3.A0B(interfaceC81993lL, 2);
        UserSession userSession = this.A01;
        Reel A0M = ReelStore.A03(userSession).A0M(str);
        if (!z && C75653aW.A05(userSession, A0M, str2)) {
            if (A0M != null) {
                interfaceC81993lL.DPz(A0M.getId(), true);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        Map map = this.A02;
        List list = (List) map.get(str);
        if (list == null) {
            list = new CopyOnWriteArrayList();
            map.put(str, list);
        }
        list.add(new WeakReference(interfaceC81993lL));
    }

    public C82013lN(UserSession userSession) {
        this.A01 = userSession;
        C25821No A00 = C25821No.A00();
        C14360o3.A07(A00);
        this.A00 = A00;
        this.A03 = new HashSet();
        this.A05 = AnonymousClass194.A02(C12L.A00.CPG(1784315198, 3));
    }
}
