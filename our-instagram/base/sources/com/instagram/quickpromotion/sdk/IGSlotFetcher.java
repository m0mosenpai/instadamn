package com.instagram.quickpromotion.sdk;

import X.AnonymousClass139;
import X.C05F;
import X.C09530e4;
import X.C14360o3;
import X.C16930sl;
import X.C206409Bx;
import X.C4O0;
import X.C4O5;
import X.C4O6;
import X.C94584Nl;
import X.C9CB;
import X.InterfaceC16660sJ;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class IGSlotFetcher {
    public Integer A00;
    public final QuickPromotionSlot A01;
    public final C4O5 A02;
    public final Map A03;
    public final Map A04;
    public final Set A05;
    public final AnonymousClass139 A06;
    public final Context A07;
    public final UserSession A08;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.quickpromotion.sdk.IGSlotFetcher r12, X.C918349l r13, X.InterfaceC23621Ds r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quickpromotion.sdk.IGSlotFetcher.A00(com.instagram.quickpromotion.sdk.IGSlotFetcher, X.49l, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.quickpromotion.sdk.IGSlotFetcher r10, X.C918349l r11, X.InterfaceC23621Ds r12, boolean r13) {
        /*
            r4 = 32
            boolean r0 = X.C206459Cc.A00(r12, r4)
            if (r0 == 0) goto Lbc
            r3 = r12
            X.9Cc r3 = (X.C206459Cc) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lbc
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r2 = r3.A03
            X.1JX r1 = X.C1JX.A02
            int r0 = r3.A00
            r5 = 1
            if (r0 == 0) goto Lac
            if (r0 != r5) goto Lc6
            java.lang.Object r11 = r3.A02
            X.49l r11 = (X.C918349l) r11
            java.lang.Object r10 = r3.A01
            com.instagram.quickpromotion.sdk.IGSlotFetcher r10 = (com.instagram.quickpromotion.sdk.IGSlotFetcher) r10
            X.AbstractC09560e7.A00(r2)
        L2c:
            com.google.common.collect.ImmutableMap r2 = (com.google.common.collect.ImmutableMap) r2
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r9 = r0.iterator()
        L36:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lc3
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r6 = r0.getKey()
            com.instagram.quickpromotion.intf.QuickPromotionSurface r6 = (com.instagram.quickpromotion.intf.QuickPromotionSurface) r6
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            X.C14360o3.A0A(r0)
            java.util.Iterator r8 = r0.iterator()
        L55:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r4 = r8.next()
            X.4Nf r4 = (X.C94524Nf) r4
            X.4NJ r0 = r4.A01
            java.util.Set r0 = r0.CB6()
            java.util.Iterator r7 = r0.iterator()
        L6b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r3 = r7.next()
            com.instagram.quickpromotion.intf.Trigger r3 = (com.instagram.quickpromotion.intf.Trigger) r3
            com.instagram.quickpromotion.intf.QuickPromotionSlot r1 = r10.A01
            X.C14360o3.A0A(r6)
            java.util.Map r0 = X.AbstractC61082qW.A01
            X.C14360o3.A0B(r6, r5)
            r0 = 2
            X.C14360o3.A0B(r3, r0)
            java.util.EnumSet r0 = X.AbstractC61082qW.A00(r1, r6)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L6b
            java.lang.String r0 = r11.A01
            X.9C2 r2 = new X.9C2
            r2.<init>(r6, r3, r0)
            java.util.Map r1 = r10.A03
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto La6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.put(r2, r0)
        La6:
            java.util.List r0 = (java.util.List) r0
            r0.add(r4)
            goto L6b
        Lac:
            X.AbstractC09560e7.A00(r2)
            r3.A01 = r10
            r3.A02 = r11
            r3.A00 = r5
            java.lang.Object r2 = A00(r10, r11, r3, r13)
            if (r2 != r1) goto L2c
            return r1
        Lbc:
            X.9Cc r3 = new X.9Cc
            r3.<init>(r10, r12, r4)
            goto L16
        Lc3:
            X.0eB r1 = X.C0eB.A00
            return r1
        Lc6:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quickpromotion.sdk.IGSlotFetcher.A01(com.instagram.quickpromotion.sdk.IGSlotFetcher, X.49l, X.1Ds, boolean):java.lang.Object");
    }

    public static final void A02(C9CB c9cb, IGSlotFetcher iGSlotFetcher, InterfaceC16660sJ interfaceC16660sJ) {
        interfaceC16660sJ.invoke(new C4O0(c9cb, "make_pending_callbacks"));
        Map map = iGSlotFetcher.A04;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!((Set) entry.getValue()).isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            List list = (List) iGSlotFetcher.A03.get(key);
            if (list == null) {
                list = C16930sl.A00;
            }
            arrayList.add(new C09530e4(new C94584Nl(new C206409Bx(list, 14, "d0d0df20f1f4fcc942cd21b5181a6a9f0f554364b0e20671791f50beb40b97bf")), value));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C09530e4 c09530e4 = (C09530e4) it.next();
            Object obj = c09530e4.A00;
            Set<C4O6> set = (Set) c09530e4.A01;
            for (C4O6 c4o6 : set) {
                C14360o3.A0B(obj, 0);
                c4o6.A00.resumeWith(obj);
            }
            set.clear();
        }
    }

    public IGSlotFetcher(Context context, UserSession userSession, QuickPromotionSlot quickPromotionSlot) {
        this.A01 = quickPromotionSlot;
        this.A08 = userSession;
        this.A07 = context;
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        C14360o3.A07(synchronizedMap);
        this.A03 = synchronizedMap;
        Set synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        C14360o3.A07(synchronizedSet);
        this.A05 = synchronizedSet;
        Map synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
        C14360o3.A07(synchronizedMap2);
        this.A04 = synchronizedMap2;
        this.A00 = C05F.A00;
        this.A02 = new C4O5();
        this.A06 = new AnonymousClass139();
    }
}
