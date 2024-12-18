package X;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1yT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43001yT implements InterfaceC43011yU {
    public final C43041yX A00;
    public final java.util.Set A01;
    public final boolean A02;
    public final boolean A03;
    public final ImmutableMap A04;
    public final InterfaceC43071ya A05;
    public final boolean A06;

    @Override // X.InterfaceC43011yU
    public final void Cxd(View view, C75363a3 c75363a3, String str) {
        C14360o3.A0B(str, 2);
        A01(view, c75363a3, str);
    }

    @Override // X.InterfaceC43011yU
    public final void Dzz(View view, C75363a3 c75363a3, String str) {
        C14360o3.A0B(str, 2);
        A01(view, c75363a3, str);
    }

    private final C59062n7 A00(View view, C75363a3 c75363a3, String str) {
        String str2;
        ImmutableMap immutableMap = this.A04;
        if (immutableMap != null && (str2 = (String) immutableMap.get(str)) != null) {
            str = str2;
        }
        WeakReference weakReference = null;
        if (this.A06) {
            weakReference = new WeakReference(view.getOverlay());
        }
        C59072n8 A00 = C59062n7.A00(new C9BW(c75363a3, weakReference), new C206389Bv(str), c75363a3.A0G);
        A00.A00(this.A05);
        return A00.A01();
    }

    private final void A01(View view, C75363a3 c75363a3, String str) {
        if (c75363a3 != null) {
            if (this.A03) {
                C57112jm A01 = AbstractC58982mw.A01(AbstractC58952mt.A00(view));
                if (A01 != null) {
                    C57112jm.A01(this.A00, A00(view, c75363a3, str), A01, AbstractC58952mt.A00(view));
                    return;
                }
                return;
            }
            C57112jm A00 = AbstractC58982mw.A00(view);
            if (A00 == null) {
                return;
            }
            A00.A05(view, A00(view, c75363a3, str));
        }
    }

    @Override // X.InterfaceC43011yU
    public final void DA0(View view) {
        if (this.A03) {
            C57112jm A01 = AbstractC58982mw.A01(AbstractC58952mt.A00(view));
            if (A01 != null) {
                C57112jm.A02(this.A00, A01, AbstractC58952mt.A00(view));
                return;
            }
            return;
        }
        C57112jm A00 = AbstractC58982mw.A00(view);
        if (A00 == null) {
            return;
        }
        A00.A04(view);
    }

    @Override // X.InterfaceC43011yU
    public final void Dzy(View view) {
        if (this.A03) {
            C57112jm A01 = AbstractC58982mw.A01(AbstractC58952mt.A00(view));
            if (A01 != null) {
                C57112jm.A02(this.A00, A01, AbstractC58952mt.A00(view));
                return;
            }
            return;
        }
        C57112jm A00 = AbstractC58982mw.A00(view);
        if (A00 == null) {
            return;
        }
        A00.A04(view);
    }

    public C43001yT(UserSession userSession) {
        C43041yX c43041yX;
        ImmutableMap immutableMap;
        boolean z = false;
        this.A06 = C1C0.A00(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36327713858009910L);
        this.A03 = A06;
        if (!A06 && C18U.A06(c06090Tz, userSession, 2342167102414139269L)) {
            z = true;
        }
        this.A02 = z;
        synchronized (C43041yX.A02) {
            int i = C43041yX.A01 + 1;
            C43041yX.A01 = i;
            c43041yX = new C43041yX(AnonymousClass001.A0O("_UniqueKey_", i));
        }
        this.A00 = c43041yX;
        java.util.Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        C14360o3.A07(newSetFromMap);
        this.A01 = newSetFromMap;
        this.A05 = new InterfaceC43071ya() { // from class: X.1yZ
            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                Integer CFq = interfaceC57162jr.CFq(c59062n7);
                C14360o3.A07(CFq);
                Rect rect = new Rect();
                interfaceC57162jr.BA6(rect, c59062n7);
                if (CFq != C05F.A00) {
                    C43001yT c43001yT = C43001yT.this;
                    if (!c43001yT.A02 || CFq != C05F.A01 || ((C206389Bv) c59062n7.A04).A00) {
                        if (CFq == C05F.A0C) {
                            C206389Bv c206389Bv = (C206389Bv) c59062n7.A04;
                            c206389Bv.A00 = false;
                            C75363a3 c75363a3 = (C75363a3) ((C9BW) c59062n7.A03).A00;
                            String str = c206389Bv.A02;
                            boolean z2 = C1KM.A08;
                            String str2 = c75363a3.A0G;
                            C14360o3.A0B(str, 1);
                            if (C1KT.A05) {
                                C1KT.A01(new C1KR(C1KT.A04, str2, str, SystemClock.uptimeMillis()));
                            }
                            if (C1KM.A08) {
                                C1KM.A05(new C1KR(C1KM.A01(), str2, str, SystemClock.uptimeMillis()));
                            }
                            Iterator it = c43001yT.A01.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC42451xZ) it.next()).Dz2(c75363a3, str);
                            }
                            return;
                        }
                        return;
                    }
                }
                C206389Bv c206389Bv2 = (C206389Bv) c59062n7.A04;
                c206389Bv2.A00 = true;
                C43001yT c43001yT2 = C43001yT.this;
                C9BW c9bw = (C9BW) c59062n7.A03;
                C75363a3 c75363a32 = (C75363a3) c9bw.A00;
                String str3 = c206389Bv2.A02;
                WeakReference weakReference = (WeakReference) c9bw.A01;
                boolean z3 = C1KM.A08;
                String str4 = c75363a32.A0G;
                C14360o3.A0B(str3, 1);
                if (C1KT.A05) {
                    C1KT.A01(new C4JY(rect, C1KT.A04, str4, str3, weakReference, SystemClock.uptimeMillis()));
                }
                if (C1KM.A08) {
                    C1KM.A05(new C4JY(rect, C1KM.A01(), str4, str3, weakReference, SystemClock.uptimeMillis()));
                }
                Iterator it2 = c43001yT2.A01.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC42451xZ) it2.next()).Dyz(c75363a32, str3);
                }
            }
        };
        HashMap A08 = AbstractC13670mt.A08(C18U.A04(c06090Tz, userSession, 36875614246535242L), C04830Nb.A00);
        if (A08 != null) {
            immutableMap = ImmutableMap.copyOf((Map) A08);
        } else {
            immutableMap = null;
        }
        this.A04 = immutableMap;
    }
}
