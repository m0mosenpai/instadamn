package X;

import android.content.Context;
import android.os.Process;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.systrace.Systrace;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7Ik, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160767Ik implements C5GW {
    public final Context A00;
    public final UserSession A01;
    public final C98N A02;
    public final HashMap A03;
    public final InterfaceC09390do A04;
    public final InterfaceC16660sJ A05;
    public final InterfaceC14020nS A06;
    public final C160677Ib A07;
    public final java.util.Set A08;
    public volatile String A09;

    public C160767Ik(Context context, UserSession userSession, C98N c98n, String str, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(str, 5);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = c98n;
        this.A05 = interfaceC16660sJ;
        this.A09 = str;
        this.A03 = new HashMap();
        this.A04 = C1XM.A00(new C9EZ(this, 41));
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        this.A06 = A00;
        this.A07 = new C160677Ib(userSession);
        java.util.Set singleton = Collections.singleton(163);
        C14360o3.A07(singleton);
        this.A08 = singleton;
    }

    @Override // X.C5GW
    public final void CKV(String str) {
        C14360o3.A0B(str, 0);
        if (C18U.A06(C06090Tz.A05, this.A01, 36319098153474999L)) {
            this.A09 = str;
            HashMap hashMap = this.A03;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                int size = ((C7K4) entry.getValue()).A01.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList2.add(Integer.valueOf(intValue));
                }
                AnonymousClass016.A16(arrayList2, arrayList);
            }
            hashMap.clear();
            A02(arrayList);
        }
    }

    private final List A00() {
        List A0R = AbstractC001900j.A0R(C18U.A04(C06090Tz.A05, this.A01, 36882048107282865L), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0R, 10));
        Iterator it = A0R.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        return arrayList;
    }

    public final void A02(List list) {
        UserSession userSession = this.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36319098153474999L)) {
            ArrayList arrayList = new ArrayList();
            if (C18U.A06(c06090Tz, userSession, 36319098153737144L)) {
                if (C18U.A06(c06090Tz, userSession, 36319098153933754L)) {
                    arrayList.addAll(A00());
                } else {
                    arrayList.addAll(list);
                    list = A00();
                }
            }
            arrayList.addAll(list);
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (!this.A07.A00(intValue)) {
                    java.util.Set set = this.A08;
                    Integer valueOf = Integer.valueOf(intValue);
                    if (!set.contains(valueOf)) {
                        HashMap hashMap = this.A03;
                        Object obj = hashMap.get(valueOf);
                        if (obj == null) {
                            obj = new C7K4();
                            hashMap.put(valueOf, obj);
                        }
                        C7K4 c7k4 = (C7K4) obj;
                        int i = c7k4.A00;
                        Object obj2 = ((Map) this.A04.getValue()).get(valueOf);
                        if (obj2 == null) {
                            obj2 = 5;
                        }
                        if (i < ((Number) obj2).intValue()) {
                            c7k4.A00++;
                            arrayList2.add(valueOf);
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                A01(this, arrayList2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[RETURN] */
    @Override // X.C5GW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.C3OO AXD(int r6) {
        /*
            r5 = this;
            java.util.HashMap r0 = r5.A03
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.get(r4)
            X.7K4 r0 = (X.C7K4) r0
            r3 = 0
            if (r0 == 0) goto L2f
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.A01
            java.lang.Object r1 = r0.poll()
            X.3OO r1 = (X.C3OO) r1
            if (r1 == 0) goto L30
            android.view.View r0 = r1.itemView
            if (r0 == 0) goto L30
            android.view.ViewParent r0 = r0.getParent()
        L21:
            java.lang.String r2 = "LegacyRecyclerViewMessageThreadViewHolderPreloader"
            if (r0 == 0) goto L32
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r0 = "Found view holder with non-null parent for view type: %d"
            X.C0K8.A0Q(r2, r0, r1)
            return r3
        L2f:
            r1 = r3
        L30:
            r0 = r3
            goto L21
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160767Ik.AXD(int):X.3OO");
    }

    public static final void A01(final C160767Ik c160767Ik, final List list) {
        if (!list.isEmpty()) {
            final String str = c160767Ik.A09;
            c160767Ik.A06.ATO(new AbstractRunnableC14200nk(c160767Ik, str, list) { // from class: X.7K5
                public String A00;
                public final List A01;
                public final boolean A02;
                public final /* synthetic */ C160767Ik A03;

                /* JADX WARN: Illegal instructions before constructor call */
                {
                    /*
                        r4 = this;
                        com.instagram.common.session.UserSession r3 = r5.A01
                        X.0Tz r2 = X.C06090Tz.A05
                        r0 = 36319098154130365(0x810807000a1bbd, double:3.031682145717292E-306)
                        boolean r3 = X.C18U.A06(r2, r3, r0)
                        r0 = 2
                        X.C14360o3.A0B(r6, r0)
                        r4.A03 = r5
                        r2 = 1788300865(0x6a974e41, float:9.145867E25)
                        r1 = 3
                        r0 = 0
                        r4.<init>(r2, r1, r3, r0)
                        r4.A00 = r6
                        r4.A01 = r7
                        r4.A02 = r3
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C7K5.<init>(X.7Ik, java.lang.String, java.util.List):void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Integer num;
                    int i;
                    if (this.A02) {
                        num = 0;
                    } else {
                        num = null;
                    }
                    C160767Ik c160767Ik2 = this.A03;
                    if (num != null) {
                        int threadPriority = Process.getThreadPriority(Process.myTid());
                        int intValue = num.intValue();
                        if (intValue >= threadPriority) {
                            AbstractC09800fd.A01("MessageThreadViewHolderPreloader.preload", -949586868);
                            InterfaceC09390do interfaceC09390do = c160767Ik2.A02.A0A;
                            Object value = interfaceC09390do.getValue();
                            C14360o3.A07(value);
                            ((C69613Av) value).A08(null);
                            FrameLayout frameLayout = new FrameLayout(c160767Ik2.A00);
                            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                            Iterator it = this.A01.iterator();
                            while (it.hasNext()) {
                                int intValue2 = ((Number) it.next()).intValue();
                                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) c160767Ik2.A05.invoke(Integer.valueOf(intValue2));
                                if (interfaceC16660sJ != null) {
                                    A00(frameLayout, interfaceC16660sJ, intValue2);
                                }
                            }
                            Object value2 = interfaceC09390do.getValue();
                            C14360o3.A07(value2);
                            ((C69613Av) value2).A05();
                            i = -1102203298;
                        } else {
                            if (Systrace.A0E(1L)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(AbstractC43591JPw.A00(29));
                                sb.append(num);
                                C0fO.A01(sb.toString(), 1934370717);
                            }
                            Process.setThreadPriority(intValue);
                            try {
                                AbstractC09800fd.A01("MessageThreadViewHolderPreloader.preload", -299264595);
                                InterfaceC09390do interfaceC09390do2 = c160767Ik2.A02.A0A;
                                Object value3 = interfaceC09390do2.getValue();
                                C14360o3.A07(value3);
                                ((C69613Av) value3).A08(null);
                                FrameLayout frameLayout2 = new FrameLayout(c160767Ik2.A00);
                                frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                Iterator it2 = this.A01.iterator();
                                while (it2.hasNext()) {
                                    int intValue3 = ((Number) it2.next()).intValue();
                                    InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) c160767Ik2.A05.invoke(Integer.valueOf(intValue3));
                                    if (interfaceC16660sJ2 != null) {
                                        A00(frameLayout2, interfaceC16660sJ2, intValue3);
                                    }
                                }
                                Object value4 = interfaceC09390do2.getValue();
                                C14360o3.A07(value4);
                                ((C69613Av) value4).A05();
                                AbstractC09800fd.A00(1910831746);
                                Process.setThreadPriority(threadPriority);
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(-1354716256);
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                Process.setThreadPriority(threadPriority);
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(-67943831);
                                }
                                throw th;
                            }
                        }
                    } else {
                        AbstractC09800fd.A01("MessageThreadViewHolderPreloader.preload", 1303661986);
                        InterfaceC09390do interfaceC09390do3 = c160767Ik2.A02.A0A;
                        Object value5 = interfaceC09390do3.getValue();
                        C14360o3.A07(value5);
                        ((C69613Av) value5).A08(null);
                        FrameLayout frameLayout3 = new FrameLayout(c160767Ik2.A00);
                        frameLayout3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        Iterator it3 = this.A01.iterator();
                        while (it3.hasNext()) {
                            int intValue4 = ((Number) it3.next()).intValue();
                            InterfaceC16660sJ interfaceC16660sJ3 = (InterfaceC16660sJ) c160767Ik2.A05.invoke(Integer.valueOf(intValue4));
                            if (interfaceC16660sJ3 != null) {
                                A00(frameLayout3, interfaceC16660sJ3, intValue4);
                            }
                        }
                        Object value6 = interfaceC09390do3.getValue();
                        C14360o3.A07(value6);
                        ((C69613Av) value6).A05();
                        i = -550311061;
                    }
                    AbstractC09800fd.A00(i);
                }

                private final void A00(ViewGroup viewGroup, InterfaceC16660sJ interfaceC16660sJ, int i) {
                    Object invoke = interfaceC16660sJ.invoke(viewGroup);
                    C160767Ik c160767Ik2 = this.A03;
                    HashMap hashMap = c160767Ik2.A03;
                    Integer valueOf = Integer.valueOf(i);
                    Object obj = hashMap.get(valueOf);
                    if (obj == null) {
                        obj = new C7K4();
                        hashMap.put(valueOf, obj);
                    }
                    C7K4 c7k4 = (C7K4) obj;
                    if (C14360o3.A0K(this.A00, c160767Ik2.A09)) {
                        C14360o3.A0B(invoke, 0);
                        c7k4.A01.add(invoke);
                    } else {
                        this.A00 = c160767Ik2.A09;
                        A00(viewGroup, interfaceC16660sJ, i);
                    }
                }
            });
        }
    }
}
