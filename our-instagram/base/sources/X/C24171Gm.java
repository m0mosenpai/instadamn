package X;

import android.util.LruCache;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/* renamed from: X.1Gm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24171Gm implements C1G4 {
    public final LruCache A00;
    public final C23351Bx A01;
    public final Object A02;
    public final java.util.Set A03;
    public final C24111Gg A04;
    public final C1G4 A05;

    @Override // X.C1G4
    public final InterfaceC27191Tt startRequest(C1QW c1qw, C1QY c1qy, C26511Qg c26511Qg) {
        StringBuilder sb;
        InterfaceC27191Tt A00;
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(c1qy, 1);
        C14360o3.A0B(c26511Qg, 2);
        int ordinal = c1qy.A09.ordinal();
        if (ordinal != 6) {
            if (ordinal == 5) {
                synchronized (this.A02) {
                    C23351Bx c23351Bx = this.A01;
                    if (c23351Bx.A01() && this.A04.A03.size() == 0) {
                        c26511Qg.A01(new C3DX(this));
                        A00 = this.A05.startRequest(c1qw, c1qy, c26511Qg);
                        c23351Bx.A00(c1qy);
                    } else {
                        java.net.URI uri = c1qw.A09;
                        int hashCode = uri.hashCode();
                        LruCache lruCache = this.A00;
                        Integer num = (Integer) lruCache.get(Integer.valueOf(uri.hashCode()));
                        if (num != null) {
                            Integer valueOf = Integer.valueOf(hashCode);
                            int intValue = num.intValue() + 1;
                            lruCache.put(valueOf, Integer.valueOf(intValue));
                            java.util.Set set = this.A03;
                            if (!set.contains(valueOf) && intValue > 20) {
                                set.add(valueOf);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Exceeded 20 concurrent duplicate request: ");
                                sb2.append(uri);
                                C0w9.A03("IdleQueueApiRequestCapLayer", sb2.toString());
                            }
                        } else {
                            lruCache.put(Integer.valueOf(hashCode), 1);
                        }
                        A00 = this.A04.A00(null, c26511Qg, c1qw, c1qy, C1RN.A00(c1qy));
                        A00(this);
                    }
                }
                return A00;
            }
        } else {
            java.net.URI uri2 = c1qw.A09;
            String path = uri2.getPath();
            if (path == null) {
                sb = new StringBuilder();
                sb.append("Invalid URI: ");
                sb.append(uri2);
            } else {
                Iterator it = C1RK.A00.iterator();
                while (it.hasNext()) {
                    if (AbstractC001900j.A0a(path, (String) it.next(), false)) {
                        break;
                    }
                }
                sb = new StringBuilder();
                sb.append("Invalid Critical API: ");
                sb.append(uri2.getPath());
            }
            C0w9.A03("CriticalAPIValidator", sb.toString());
            String path2 = uri2.getPath();
            if (path2 != null && AbstractC001900j.A0a(path2, "/feed/timeline", false)) {
                C226418s A01 = C226218q.A01(AbstractC12960li.A00);
                A01.A0P(A01.A02, "FEED_REQUEST_SKIP_API_QUEUE");
            }
        }
        InterfaceC27191Tt startRequest = this.A05.startRequest(c1qw, c1qy, c26511Qg);
        C14360o3.A07(startRequest);
        return startRequest;
    }

    public static final void A00(C24171Gm c24171Gm) {
        synchronized (c24171Gm.A02) {
            C24111Gg c24111Gg = c24171Gm.A04;
            LinkedList linkedList = c24111Gg.A03;
            if (linkedList.size() != 0) {
                C23351Bx c23351Bx = c24171Gm.A01;
                if (c23351Bx.A01()) {
                    Iterator it = linkedList.iterator();
                    C89143yG c89143yG = (C89143yG) it.next();
                    C14360o3.A07(c89143yG);
                    C26511Qg c26511Qg = c89143yG.A02;
                    c26511Qg.A01(new C3DX(c24171Gm));
                    C1G4 c1g4 = c24171Gm.A05;
                    C1QW c1qw = c89143yG.A03;
                    C1QY c1qy = c89143yG.A04;
                    c89143yG.A01.A00 = c1g4.startRequest(c1qw, c1qy, c26511Qg);
                    it.remove();
                    C24101Gf c24101Gf = c24111Gg.A00;
                    if (c24101Gf != null) {
                        c24101Gf.A00.A09.A00.decrementAndGet();
                    }
                    C14360o3.A06(c1qy);
                    c23351Bx.A00(c1qy);
                    C14360o3.A06(c1qw);
                    int hashCode = c1qw.A09.hashCode();
                    LruCache lruCache = c24171Gm.A00;
                    Integer valueOf = Integer.valueOf(hashCode);
                    if (((Integer) lruCache.get(valueOf)) != null) {
                        lruCache.put(valueOf, Integer.valueOf(r0.intValue() - 1));
                    }
                }
            }
        }
    }

    public C24171Gm(C23351Bx c23351Bx, C1G4 c1g4) {
        this.A01 = c23351Bx;
        this.A05 = c1g4;
        Object obj = new Object();
        this.A02 = obj;
        this.A04 = new C24111Gg(null, obj);
        this.A00 = new LruCache(50);
        this.A03 = new LinkedHashSet();
    }
}
