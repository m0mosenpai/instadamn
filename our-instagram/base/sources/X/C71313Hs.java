package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: X.3Hs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71313Hs {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public WeakReference A04;
    public WeakReference A05;
    public final Handler A06;
    public final C71333Hu A07;
    public final AbstractC12990ll A08;

    public final void A05(View view, EnumC71343Hv enumC71343Hv) {
        A08(view, new C71353Hw(null, enumC71343Hv, null, null));
    }

    public final void A06(View view, EnumC71343Hv enumC71343Hv, int i) {
        Integer num = null;
        if (i >= 0) {
            num = Integer.valueOf(i);
        }
        A08(view, new C71353Hw(num, enumC71343Hv, null, null));
    }

    public final void A07(View view, EnumC71343Hv enumC71343Hv, String[] strArr, int i) {
        A09(view, new C71353Hw(null, enumC71343Hv, null, null), strArr, i);
    }

    public final void A0B(View view, String... strArr) {
        String str;
        this.A00 = 1;
        if (strArr.length > 0) {
            str = strArr[0];
        } else {
            str = null;
        }
        A01(view, null, str);
    }

    public static C71313Hs A00(final AbstractC12990ll abstractC12990ll) {
        return (C71313Hs) abstractC12990ll.A01(C71313Hs.class, new InterfaceC16820sZ() { // from class: X.3Ht
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C71313Hs(AbstractC12990ll.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r11 != null) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01(android.view.View r9, X.C71353Hw r10, java.lang.String r11) {
        /*
            r8 = this;
            X.0ll r2 = r8.A08
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36331115471979683(0x8112f5000044a3, double:3.0392819459150556E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r0 == 0) goto L47
            if (r10 == 0) goto L1e
            r5.add(r10)
        L1e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.3Hu r0 = r8.A07
            X.CD9.A00(r9, r0, r4, r5, r1)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L46
            r7 = 0
            java.lang.Object r3 = r1.get(r7)
            X.4Hy r3 = (X.C93574Hy) r3
            if (r3 == 0) goto L46
            if (r11 == 0) goto L3b
        L39:
            r3.A03 = r11
        L3b:
            X.3KL r2 = X.C3KL.A00(r2)
            int r6 = r8.A00
            r2.A04(r3, r4, r5, r6, r7)
            r8.A00 = r7
        L46:
            return
        L47:
            if (r10 == 0) goto L4c
            r5.add(r10)
        L4c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.3Hu r0 = r8.A07
            X.CD9.A00(r9, r0, r4, r5, r1)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L46
            r7 = 0
            java.lang.Object r3 = r1.get(r7)
            X.4Hy r3 = (X.C93574Hy) r3
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71313Hs.A01(android.view.View, X.3Hw, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.3Hx, java.lang.Object] */
    public final C71363Hx A02(View view) {
        Map map = this.A07.A02;
        if (map.get(view) != null && map.get(view) != C71363Hx.A07) {
            C71363Hx c71363Hx = (C71363Hx) map.get(view);
            c71363Hx.getClass();
            return c71363Hx;
        }
        ?? obj = new Object();
        map.put(view, obj);
        return obj;
    }

    public final void A04(View view) {
        this.A07.A02.remove(view);
    }

    public final void A09(View view, C71353Hw c71353Hw, String[] strArr, int i) {
        String str;
        C129165sd c129165sd;
        GestureDetectorOnGestureListenerC72583Nf gestureDetectorOnGestureListenerC72583Nf = (GestureDetectorOnGestureListenerC72583Nf) this.A04.get();
        if (gestureDetectorOnGestureListenerC72583Nf != null && (c129165sd = gestureDetectorOnGestureListenerC72583Nf.A02) != null) {
            c129165sd.A0G.add(c71353Hw);
        }
        this.A00 = i;
        if (strArr.length > 0) {
            str = strArr[0];
        } else {
            str = null;
        }
        A01(view, c71353Hw, str);
    }

    public C71313Hs(AbstractC12990ll abstractC12990ll) {
        this();
        List list;
        this.A00 = 0;
        this.A05 = new WeakReference(null);
        this.A08 = abstractC12990ll;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A01 = C18U.A01(c06090Tz, abstractC12990ll, 36591953131077703L);
        this.A03 = C18U.A01(c06090Tz, abstractC12990ll, 36591953131143240L);
        this.A07.A01 = C18U.A06(c06090Tz, abstractC12990ll, 2342153487367864436L);
        HashSet hashSet = new HashSet();
        List A03 = new C11L(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(C18U.A04(c06090Tz, abstractC12990ll, 36873428107919374L));
        if (!A03.isEmpty()) {
            ListIterator listIterator = A03.listIterator(A03.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    list = AbstractC001800i.A0d(A03, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = C16930sl.A00;
        for (String str : (String[]) list.toArray(new String[0])) {
            if (str.length() > 0) {
                hashSet.add(str);
            }
        }
        this.A07.A00 = hashSet;
    }

    public final void A03() {
        String str;
        boolean isShown;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.A02 > this.A01) {
            C71333Hu c71333Hu = this.A07;
            long j = this.A03;
            ArrayList arrayList = new ArrayList();
            long currentTimeMillis2 = System.currentTimeMillis();
            Map map = c71333Hu.A02;
            Iterator it = new HashSet(map.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view = (View) entry.getKey();
                C71363Hx c71363Hx = (C71363Hx) entry.getValue();
                if (c71363Hx != null) {
                    long j2 = currentTimeMillis2 - c71363Hx.A00;
                    InterfaceC79643hF interfaceC79643hF = c71363Hx.A05;
                    C93574Hy c93574Hy = c71363Hx.A03;
                    if (c93574Hy == null && interfaceC79643hF != null) {
                        c93574Hy = interfaceC79643hF.AWp();
                        c71363Hx.A03 = c93574Hy;
                    }
                    if (c93574Hy != null) {
                        str = ((InterfaceC11380iw) c93574Hy.A02).getModuleName();
                    } else {
                        str = "";
                    }
                    if (view != null) {
                        if (c71333Hu.A01) {
                            isShown = view.isAttachedToWindow();
                        } else {
                            isShown = view.isShown();
                        }
                        if (!isShown && j2 > j && !c71333Hu.A00.contains(str)) {
                        }
                    }
                }
                arrayList.add(view);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                map.remove(it2.next());
            }
            this.A02 = currentTimeMillis;
        }
    }

    public final void A08(View view, C71353Hw c71353Hw) {
        C71363Hx A02 = A02(view);
        A02.A04 = c71353Hw;
        A02.A00 = System.currentTimeMillis();
    }

    public final void A0A(View view, InterfaceC79643hF interfaceC79643hF) {
        C71363Hx A02 = A02(view);
        A02.A06 = null;
        A02.A03 = null;
        A02.A02 = null;
        A02.A01 = null;
        A02.A05 = interfaceC79643hF;
        A02.A00 = System.currentTimeMillis();
    }

    public C71313Hs() {
        this.A04 = new WeakReference(null);
        this.A06 = new Handler(Looper.getMainLooper());
        this.A02 = 0L;
        this.A03 = 0L;
        this.A01 = 1000L;
        this.A07 = new C71333Hu();
    }
}
