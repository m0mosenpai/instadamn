package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6iR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146286iR implements InterfaceC146296iS {
    public final UserSession A00;
    public final List A01;
    public final List A02;
    public final Map A03;
    public final ConcurrentHashMap A04;
    public final AtomicInteger A05;
    public final InterfaceC146256iO A06;
    public final C142086bR A07;
    public final boolean A08;

    @Override // X.InterfaceC146296iS
    public final C141596ac C00(C41181vS c41181vS) {
        C14360o3.A0B(c41181vS, 0);
        Map map = this.A03;
        C141596ac c141596ac = (C141596ac) map.get(c41181vS);
        if (c141596ac == null) {
            C141596ac c141596ac2 = new C141596ac(this.A08);
            map.put(c41181vS, c141596ac2);
            return c141596ac2;
        }
        return c141596ac;
    }

    public final int A00() {
        int i = this.A05.get();
        if (i > 1000) {
            C0w9.A03("ReelViewerData#getCount resulting in large accumulation of ViewModels", AnonymousClass001.A0O("viewModels: ", i));
        }
        return i;
    }

    public final void A01(C41551w4 c41551w4, int i) {
        ConcurrentHashMap concurrentHashMap = this.A04;
        Reel reel = c41551w4.A0H;
        String id = reel.getId();
        C14360o3.A07(id);
        if (!concurrentHashMap.containsKey(id)) {
            this.A02.add(i, c41551w4);
            String id2 = reel.getId();
            C14360o3.A07(id2);
            concurrentHashMap.put(id2, c41551w4);
            List list = this.A01;
            String id3 = reel.getId();
            C14360o3.A07(id3);
            list.add(i, id3);
            this.A05.incrementAndGet();
        }
    }

    public final boolean A02(C41551w4 c41551w4) {
        ConcurrentHashMap concurrentHashMap = this.A04;
        Reel reel = c41551w4.A0H;
        String id = reel.getId();
        C14360o3.A07(id);
        Object remove = concurrentHashMap.remove(id);
        boolean remove2 = this.A02.remove(c41551w4);
        List list = this.A01;
        String id2 = reel.getId();
        C14360o3.A07(id2);
        boolean remove3 = list.remove(id2);
        this.A05.decrementAndGet();
        if (remove != null && remove2 && remove3) {
            return true;
        }
        return false;
    }

    public C146286iR(UserSession userSession, InterfaceC146256iO interfaceC146256iO, boolean z) {
        this.A00 = userSession;
        this.A08 = z;
        this.A06 = interfaceC146256iO;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        C14360o3.A07(synchronizedList);
        this.A02 = synchronizedList;
        this.A01 = new ArrayList();
        this.A04 = new ConcurrentHashMap();
        this.A03 = new LinkedHashMap();
        this.A07 = (C142086bR) userSession.A01(C142086bR.class, new C9EU(userSession, 19));
        this.A05 = new AtomicInteger(0);
    }
}
