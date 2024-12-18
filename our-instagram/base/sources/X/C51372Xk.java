package X;

import com.facebook.litho.ComponentsSystrace;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: X.2Xk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51372Xk {
    public static final C51372Xk A00 = new Object();

    public static final void A02(C2XE c2xe, C27861CPy c27861CPy) {
        C14360o3.A0B(c2xe, 0);
        C14360o3.A0B(c27861CPy, 1);
        C2V9 A04 = c2xe.A04();
        C14360o3.A07(A04);
        A04.A00(c27861CPy);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.CPy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.CPy, java.lang.Object] */
    public static final void A03(C2XE c2xe, Exception exc) {
        C27861CPy c27861CPy;
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        try {
            if (isTracing) {
                try {
                    ComponentsSystrace.A02("handleError");
                } catch (AbstractC51512Xy unused) {
                    throw A00(c2xe, exc);
                } catch (Exception e) {
                    throw A00(c2xe, e);
                }
            }
            if (c2xe.A01 != null) {
                AnonymousClass412 A002 = A00(c2xe, exc);
                String A08 = c2xe.A08();
                LinkedList linkedList = new LinkedList();
                String[] split = A08.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                Map map = AbstractC50812Vc.A07;
                synchronized (map) {
                    for (String str : split) {
                        C14360o3.A0B(str, 0);
                        if (!str.startsWith("$")) {
                            String A0S = AnonymousClass001.A0S("id(", str, ')');
                            C117315Sq A06 = C2XX.A00.A06(str, 0);
                            if (A06 != null) {
                                String group = A06.A01.group();
                                C14360o3.A07(group);
                                Integer A0j = AbstractC003100w.A0j(group, 10);
                                if (A0j != null) {
                                    int intValue = A0j.intValue();
                                    for (Map.Entry entry : map.entrySet()) {
                                        Object key = entry.getKey();
                                        if (((Number) entry.getValue()).intValue() == intValue) {
                                            if (key instanceof Class) {
                                                str = AnonymousClass001.A0g("<cls>", ((Class) key).getName(), "</cls>");
                                            } else {
                                                str = key.toString();
                                            }
                                        }
                                    }
                                }
                            }
                            str = A0S;
                        }
                        linkedList.add(str);
                    }
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    C14360o3.A0A(str2);
                    C14360o3.A0B(str2, 0);
                    A002.A01.add(str2);
                }
                C14360o3.A0B(A002, 1);
                ?? obj = new Object();
                obj.A01 = A002;
                c27861CPy = obj;
            } else {
                ?? obj2 = new Object();
                obj2.A01 = exc;
                c27861CPy = obj2;
            }
            c27861CPy.A00 = c2xe;
            A02(c2xe, c27861CPy);
        } finally {
            if (isTracing) {
                ComponentsSystrace.A01();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0119, code lost:
    
        if (r2 != null) goto L46;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0048. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x016a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A05(java.lang.Object r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51372Xk.A05(java.lang.Object, java.lang.Object):boolean");
    }

    private final boolean A06(Collection collection, Collection collection2, int i) {
        boolean A06;
        if (i >= 1) {
            if (collection != collection2) {
                if (collection != null && collection2 != null && collection.size() == collection2.size()) {
                    Iterator it = collection.iterator();
                    Iterator it2 = collection2.iterator();
                    while (it.hasNext() && it2.hasNext()) {
                        if (i == 1) {
                            Object next = it.next();
                            C14360o3.A0C(next, "null cannot be cast to non-null type com.facebook.litho.Component");
                            A06 = ((AbstractC50812Vc) next).CTz((AbstractC50812Vc) it2.next());
                        } else {
                            A06 = A06((Collection) it.next(), (Collection) it2.next(), i - 1);
                        }
                        if (!A06) {
                        }
                    }
                }
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Level cannot be < 1");
    }

    public static final AnonymousClass412 A00(C2XE c2xe, Exception exc) {
        if (exc instanceof AnonymousClass412) {
            return (AnonymousClass412) exc;
        }
        return new AnonymousClass412(c2xe, null, null, exc);
    }

    public static final boolean A04(AbstractC50812Vc abstractC50812Vc, AbstractC50812Vc abstractC50812Vc2, boolean z) {
        if (abstractC50812Vc == abstractC50812Vc2) {
            return true;
        }
        if (abstractC50812Vc != null && abstractC50812Vc2 != null) {
            if ((abstractC50812Vc instanceof AbstractC50792Va) && (abstractC50812Vc2 instanceof AbstractC50792Va)) {
                return abstractC50812Vc.A0O(abstractC50812Vc2, z);
            }
            return abstractC50812Vc.CTz(abstractC50812Vc2);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.CPy, java.lang.Object] */
    public static final void A01(AbstractC50812Vc abstractC50812Vc, C2XE c2xe, Exception exc) {
        C2V9 A04 = c2xe.A04();
        C14360o3.A07(A04);
        C2V9 c2v9 = null;
        if (exc instanceof AnonymousClass412) {
            c2v9 = ((AnonymousClass412) exc).A00;
        }
        AnonymousClass412 A002 = A00(c2xe, exc);
        String valueOf = String.valueOf(abstractC50812Vc.A0H());
        C14360o3.A0B(valueOf, 0);
        A002.A01.add(valueOf);
        if (c2v9 != A04) {
            if (A04 instanceof C2V8) {
                ((C2V8) A04).A02(c2xe, A002);
                throw C00O.createAndThrow();
            }
            try {
                ?? obj = new Object();
                obj.A01 = exc;
                obj.A00 = c2xe;
                A02(c2xe, obj);
                return;
            } catch (AbstractC51512Xy unused) {
                A002.A00 = A04;
                throw A002;
            }
        }
        A002.A00 = c2v9;
        throw A002;
    }
}
