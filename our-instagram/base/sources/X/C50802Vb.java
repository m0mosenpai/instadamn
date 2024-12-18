package X;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.2Vb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50802Vb {
    public static int A00;
    public static SparseIntArray A01;
    public static Map A02;
    public static boolean A03;
    public static boolean A04;
    public static boolean A06;
    public static boolean A07;
    public static boolean A08;
    public static boolean A09;
    public static boolean A0A;
    public static final QuickPerformanceLogger A0B;
    public static final C50802Vb A0C = new Object();
    public static boolean A05 = true;
    public static final InterfaceC09390do A0D = AbstractC09440dt.A00(EnumC09460dv.A02, C50842Vf.A00);

    public static final View A00(LayoutInflater layoutInflater, ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup, int i, int i2, boolean z, boolean z2) {
        boolean z3;
        QuickPerformanceLogger quickPerformanceLogger;
        String str;
        int i3;
        boolean z4 = false;
        int i4 = 0;
        C14360o3.A0B(layoutInflater, 2);
        if (A09) {
            QuickPerformanceLogger quickPerformanceLogger2 = A0B;
            if (quickPerformanceLogger2 != null) {
                quickPerformanceLogger2.markerStart(264583695);
                quickPerformanceLogger2.markerAnnotate(264583695, "cache_size", ((C2WD) A0D.getValue()).A00(i));
                C9BQ c9bq = (C9BQ) A02.get(Integer.valueOf(i));
                if (c9bq != null) {
                    i3 = c9bq.A01;
                } else {
                    i3 = 0;
                }
                quickPerformanceLogger2.markerAnnotate(264583695, "cache_max_size", i3);
            }
            z3 = true;
            i4 = i;
        } else {
            z3 = false;
        }
        View A012 = ((C2WD) A0D.getValue()).A01(i);
        if (A012 != null) {
            A03(i);
            r7 = z3;
            if (z && viewGroup != null) {
                viewGroup.addView(A012);
            }
        } else {
            A012 = layoutInflater.inflate(i, viewGroup, z);
        }
        if (layoutParams != null) {
            if (z3) {
                z4 = true;
            }
            A012.setLayoutParams(layoutParams);
        }
        if (z2 && A05) {
            Context context = layoutInflater.getContext();
            C14360o3.A07(context);
            A04(context, i, 0, i2);
        }
        if (z3 && (quickPerformanceLogger = A0B) != null) {
            quickPerformanceLogger.markerPoint(264583695, "view_fetched");
            quickPerformanceLogger.markerAnnotate(264583695, "cache_hit", r7);
            quickPerformanceLogger.markerAnnotate(264583695, "use_layout_params", z4);
            try {
                str = AbstractC12290kX.A00.getResources().getResourceEntryName(i4);
            } catch (Throwable unused) {
                str = "unknown";
            }
            quickPerformanceLogger.markerAnnotate(264583695, "view_name", str);
            quickPerformanceLogger.markerEnd(264583695, (short) 2);
        }
        C14360o3.A0A(A012);
        return A012;
    }

    public static final View A01(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return A00(layoutInflater, null, viewGroup, i, 0, false, false);
    }

    public static final View A02(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return A00(layoutInflater, null, viewGroup, i, 0, false, true);
    }

    public static final void A05(Context context, C50992Vv c50992Vv, Map map) {
        int i;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c50992Vv, 2);
        if (A05) {
            A02 = map;
            if (A01 == null) {
                A01 = new SparseIntArray(map.size());
            }
            for (Map.Entry entry : map.entrySet()) {
                int i2 = ((C9BQ) entry.getValue()).A01;
                InterfaceC09390do interfaceC09390do = A0D;
                int A002 = i2 - ((C2WD) interfaceC09390do.getValue()).A00(((Number) entry.getKey()).intValue());
                C2WD c2wd = (C2WD) interfaceC09390do.getValue();
                int intValue = ((Number) entry.getKey()).intValue();
                int i3 = -A002;
                for (int i4 = 0; i4 < i3; i4++) {
                    c2wd.A01(intValue);
                }
                if (A002 < 0) {
                    A002 = 0;
                }
                SparseIntArray sparseIntArray = A01;
                if (sparseIntArray != null) {
                    sparseIntArray.put(((Number) entry.getKey()).intValue(), A002);
                }
            }
            if (c50992Vv.A05) {
                for (Map.Entry entry2 : AbstractC001800i.A0g(map.entrySet(), new B0O())) {
                    int i5 = ((C9BQ) entry2.getValue()).A01;
                    for (int i6 = 0; i6 < i5; i6++) {
                        int intValue2 = ((Number) entry2.getKey()).intValue();
                        Number number = (Number) ((C9BQ) entry2.getValue()).A03;
                        C14360o3.A0B(number, 0);
                        int intValue3 = number.intValue();
                        if (intValue3 != 0) {
                            if (intValue3 != 1) {
                                if (intValue3 != 2) {
                                    if (intValue3 == 3) {
                                        i = c50992Vv.A03;
                                    } else {
                                        throw new RuntimeException();
                                    }
                                } else {
                                    i = c50992Vv.A04;
                                }
                            } else {
                                i = c50992Vv.A02;
                            }
                        } else {
                            i = c50992Vv.A01;
                        }
                        A04(context, intValue2, i, ((C9BQ) entry2.getValue()).A02);
                    }
                }
                return;
            }
            for (Map.Entry entry3 : map.entrySet()) {
                int i7 = ((C9BQ) entry3.getValue()).A01;
                for (int i8 = 0; i8 < i7; i8++) {
                    A04(context, ((Number) entry3.getKey()).intValue(), c50992Vv.A00, ((C9BQ) entry3.getValue()).A02);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Vb, java.lang.Object] */
    static {
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        A02 = c16920sk;
        A0B = QuickPerformanceLoggerProvider.getQPLInstance();
    }

    public static final void A03(int i) {
        SparseIntArray sparseIntArray;
        Integer valueOf;
        SparseIntArray sparseIntArray2;
        if (A08 && (sparseIntArray = A01) != null && (valueOf = Integer.valueOf(sparseIntArray.get(i))) != null && (sparseIntArray2 = A01) != null) {
            sparseIntArray2.put(i, valueOf.intValue() + 1);
        }
    }

    public static final void A04(Context context, final int i, int i2, final int i3) {
        int i4;
        int i5;
        if (A08) {
            SparseIntArray sparseIntArray = A01;
            if (sparseIntArray != null && (i5 = sparseIntArray.get(i)) > 0) {
                SparseIntArray sparseIntArray2 = A01;
                if (sparseIntArray2 != null) {
                    sparseIntArray2.put(i, i5 - 1);
                }
            } else {
                return;
            }
        } else {
            C9BQ c9bq = (C9BQ) A02.get(Integer.valueOf(i));
            if (c9bq != null) {
                i4 = c9bq.A01;
            } else {
                i4 = 0;
            }
            if (A04 && ((C2WD) A0D.getValue()).A00(i) >= i4) {
                return;
            }
        }
        if (A06) {
            context = AbstractC12290kX.A00;
        }
        C14360o3.A0A(context);
        final WeakReference weakReference = new WeakReference(context);
        AbstractC18280vF abstractC18280vF = new AbstractC18280vF() { // from class: X.2WR
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("view_prefetch", 389017095, 3, false, false);
            }

            @Override // X.AbstractC18280vF
            public final void loggedRun() {
                C13270mD c13270mD;
                InterfaceC13250mB interfaceC13250mB;
                Context context2 = (Context) weakReference.get();
                if (context2 != null) {
                    final int i6 = i;
                    int i7 = i3;
                    if (C50802Vb.A0A) {
                        c13270mD = new C13270mD(context2, i7);
                        interfaceC13250mB = new C48559Ldw(i6);
                    } else {
                        c13270mD = new C13270mD(context2, 0);
                        interfaceC13250mB = new InterfaceC13250mB() { // from class: X.48f
                            @Override // X.InterfaceC13250mB
                            public final void DLv(ViewGroup viewGroup, View view, int i8) {
                                C14360o3.A0B(view, 0);
                                ((C2WD) C50802Vb.A0D.getValue()).A02(view, i6);
                            }
                        };
                    }
                    c13270mD.A00(interfaceC13250mB, i6);
                }
            }
        };
        if (i2 != 1) {
            if (i2 != 2) {
                AbstractC24641Ih.A02.Ep8(abstractC18280vF);
                return;
            } else {
                abstractC18280vF.run();
                return;
            }
        }
        C14120nc.A00().ATO(abstractC18280vF);
    }
}
