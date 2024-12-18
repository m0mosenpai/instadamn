package X;

import com.facebook.memorytimeline.MemoryTimeline;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.1TU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1TU implements InterfaceC11380iw, C0TX, C0TK {
    public static C1TU A0C = null;
    public static final String __redex_internal_original_name = "IgMemoryRedManager";
    public long A00;
    public C0JO A01;
    public MemoryTimeline A02;
    public C0TP A03;
    public C0TS A04;
    public C0TZ A05;
    public C18920wW A06;
    public UserSession A07;
    public Map A08;
    public final C2QP A09;
    public final java.util.Set A0A;
    public final boolean A0B;
    public static final C0TP A0F = C0TP.A0u;
    public static final C0TP A0G = C0TP.A11;
    public static final C0TP A0E = C0TP.A0v;
    public static final C0TP A0D = C0TP.A0p;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "java/com/instagram/memory";
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0JO, java.lang.Object] */
    public C1TU(MemoryTimeline memoryTimeline, UserSession userSession, C2QP c2qp, boolean z) {
        C0TP c0tp;
        ?? obj = new Object();
        java.util.Set emptySet = Collections.emptySet();
        this.A00 = 0L;
        HashSet hashSet = new HashSet();
        this.A0A = hashSet;
        this.A02 = memoryTimeline;
        this.A01 = obj;
        hashSet.addAll(emptySet);
        this.A08 = new HashMap();
        this.A09 = c2qp;
        this.A07 = userSession;
        int A01 = (int) C18U.A01(C06090Tz.A05, userSession, 36610425785161779L);
        if (A01 != 2) {
            if (A01 != 3) {
                c0tp = A0F;
            } else {
                c0tp = A0E;
            }
        } else {
            c0tp = A0G;
        }
        this.A03 = c0tp;
        this.A06 = AbstractC12220kQ.A00(this, C12180kM.A02, userSession);
        this.A0B = z;
    }

    public static C0TU A00(C1TU c1tu, String str) {
        if ("".equals(str)) {
            str = "NO_NAME";
        }
        synchronized (c1tu.A08) {
            if (c1tu.A08.containsKey(str)) {
                return (C0TU) c1tu.A08.get(str);
            }
            C0TU c0tu = new C0TU(str);
            c1tu.A08.put(str, c0tu);
            return c0tu;
        }
    }

    public static synchronized C1TU A01() {
        C1TU c1tu;
        synchronized (C1TU.class) {
            c1tu = A0C;
        }
        return c1tu;
    }

    public static void A02(C0TU c0tu, C0TZ c0tz, C0TZ c0tz2) {
        long j = c0tz2.A04 - c0tz.A04;
        C0TY c0ty = c0tz2.A05;
        C0TY c0ty2 = C0TY.RED;
        if (c0ty == c0ty2) {
            c0tu.A01 += j;
        }
        C0TY c0ty3 = C0TY.YELLOW;
        if (c0ty == c0ty3) {
            c0tu.A02 += j;
        }
        C0TY c0ty4 = C0TY.GREEN;
        if (c0ty == c0ty4) {
            c0tu.A00 += j;
        }
        C0TY c0ty5 = c0tz2.A06;
        if (c0ty5 == c0ty2) {
            c0tu.A04 += j;
        } else if (c0ty5 == c0ty3) {
            c0tu.A05 += j;
        } else if (c0ty5 == c0ty4) {
            c0tu.A03 += j;
        }
        C0TY c0ty6 = c0tz2.A07;
        if (c0ty6 == c0ty2) {
            c0tu.A07 += j;
        } else if (c0ty6 == c0ty3) {
            c0tu.A08 += j;
        } else {
            if (c0ty6 != c0ty4) {
                return;
            }
            c0tu.A06 += j;
        }
    }

    @Override // X.C0TX
    public final void A93(C0TW c0tw) {
        java.util.Set set = this.A0A;
        synchronized (set) {
            set.add(c0tw);
        }
    }

    @Override // X.C0TX
    public final void EFY(C0TW c0tw) {
        java.util.Set set = this.A0A;
        synchronized (set) {
            set.remove(c0tw);
        }
    }
}
