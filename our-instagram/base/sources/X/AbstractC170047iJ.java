package X;

import android.util.Pair;
import android.util.SparseArray;
import com.facebook.litho.ComponentsSystrace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7iJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC170047iJ {
    public static final List A00 = new ArrayList();

    public static C170057iK A00(C169927i7 c169927i7, AbstractC169857hz abstractC169857hz, AbstractC169857hz abstractC169857hz2, C169827hw c169827hw, String str, String str2, String str3, String str4, List list) {
        String str5;
        String str6;
        List<AbstractC169857hz> list2;
        int intValue;
        List list3;
        String str7;
        int i = 0;
        boolean z = false;
        if (abstractC169857hz == null) {
            z = true;
        }
        boolean z2 = false;
        if (abstractC169857hz2 == null) {
            z2 = true;
        }
        if (z) {
            if (z2) {
                throw new IllegalStateException("Both currentRoot and newRoot are null.");
            }
        } else if (z2) {
            int i2 = abstractC169857hz.A00;
            list.add(abstractC169857hz);
            int i3 = abstractC169857hz.A00;
            C170057iK c170057iK = new C170057iK();
            c170057iK.A00 = i3;
            c170057iK.A02 = abstractC169857hz2;
            c170057iK.A01 = null;
            for (int i4 = 0; i4 < i2; i4++) {
                c170057iK.A01(C170167iV.A00(C170697jM.A00(), null, null, 3, 0));
            }
            return c170057iK;
        }
        if (abstractC169857hz != null) {
            if (abstractC169857hz.A01 == null) {
                str5 = abstractC169857hz.getClass().getSimpleName();
            } else {
                str5 = AnonymousClass001.A0g(str2, "->", abstractC169857hz.getClass().getSimpleName());
            }
        } else {
            str5 = "";
        }
        if (abstractC169857hz2 != null) {
            if (abstractC169857hz2.A01 == null) {
                str6 = abstractC169857hz2.getClass().getSimpleName();
            } else {
                str6 = AnonymousClass001.A0g(str3, "->", abstractC169857hz2.getClass().getSimpleName());
            }
        } else {
            str6 = "";
        }
        if (!z && abstractC169857hz.A00 == abstractC169857hz2.A00 && !abstractC169857hz2.A07 && (abstractC169857hz == abstractC169857hz2 || abstractC169857hz.CTz(abstractC169857hz2))) {
            int i5 = abstractC169857hz.A00;
            C170057iK c170057iK2 = new C170057iK();
            c170057iK2.A00 = i5;
            c170057iK2.A02 = abstractC169857hz2;
            c170057iK2.A01 = null;
            abstractC169857hz2.A00 = i5;
            c169927i7.A00(false, abstractC169857hz, abstractC169857hz2, str, str5, str6, str4);
            return c170057iK2;
        }
        c169927i7.A00(true, abstractC169857hz, abstractC169857hz2, str, str5, str6, str4);
        if (abstractC169857hz2 instanceof C170027iH) {
            boolean isTracing = ComponentsSystrace.A00.isTracing();
            if (isTracing) {
                C1LP A002 = ComponentsSystrace.A00("generateChangeSet");
                if (z) {
                    str7 = "<null>";
                } else {
                    str7 = abstractC169857hz.A04;
                }
                A002.ACW(str7, "current_root");
                A002.ACW(str5, "update_prefix");
                A002.flush();
            }
            if (!z) {
                i = abstractC169857hz.A00;
            }
            C170057iK c170057iK3 = new C170057iK();
            c170057iK3.A00 = i;
            c170057iK3.A02 = abstractC169857hz2;
            C169827hw c169827hw2 = null;
            c170057iK3.A01 = null;
            C169827hw c169827hw3 = abstractC169857hz2.A02;
            if (abstractC169857hz != null) {
                c169827hw2 = abstractC169857hz.A02;
            }
            abstractC169857hz2.A03(c170057iK3, abstractC169857hz, abstractC169857hz2, c169827hw3, c169827hw2, c169827hw3);
            abstractC169857hz2.A00 = c170057iK3.A00;
            if (!isTracing) {
                return c170057iK3;
            }
            ComponentsSystrace.A01();
            return c170057iK3;
        }
        C170057iK c170057iK4 = new C170057iK();
        c170057iK4.A00 = 0;
        c170057iK4.A02 = abstractC169857hz2;
        c170057iK4.A01 = null;
        HashMap A003 = AbstractC169857hz.A00(abstractC169857hz);
        HashMap A004 = AbstractC169857hz.A00(abstractC169857hz2);
        if (abstractC169857hz != null && (list3 = abstractC169857hz.A05) != null) {
            list2 = new ArrayList(list3);
        } else {
            list2 = A00;
        }
        List list4 = abstractC169857hz2.A05;
        if (list4 == null) {
            list4 = A00;
        }
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < list4.size(); i8++) {
            String str8 = ((AbstractC169857hz) list4.get(i8)).A03;
            if (A003.containsKey(str8)) {
                Pair pair = (Pair) A003.get(str8);
                AbstractC169857hz abstractC169857hz3 = (AbstractC169857hz) pair.first;
                int intValue2 = ((Number) pair.second).intValue();
                if (i6 > intValue2) {
                    for (int i9 = 0; i9 < abstractC169857hz3.A00; i9++) {
                        int i10 = 0;
                        for (AbstractC169857hz abstractC169857hz4 : list2) {
                            if (!abstractC169857hz4.A03.equals(str8)) {
                                i10 += abstractC169857hz4.A00;
                            }
                        }
                        c170057iK4.A01(new C170167iV(null, null, null, null, 0, i10, i7, 1));
                    }
                    list2.remove(intValue2);
                    list2.add(i6, abstractC169857hz3);
                    int size = list2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        AbstractC169857hz abstractC169857hz5 = (AbstractC169857hz) list2.get(i11);
                        Pair pair2 = (Pair) A003.get(abstractC169857hz5.A03);
                        if (((Number) pair2.second).intValue() != i11) {
                            A003.put(abstractC169857hz5.A03, new Pair(pair2.first, Integer.valueOf(i11)));
                        }
                    }
                } else if (intValue2 > i6) {
                    int i12 = 0;
                    for (AbstractC169857hz abstractC169857hz6 : list2) {
                        if (abstractC169857hz6.A03.equals(str8)) {
                            break;
                        }
                        i12 += abstractC169857hz6.A00;
                    }
                    i7 = (i12 + ((AbstractC169857hz) list2.get(intValue2)).A00) - 1;
                    i6 = intValue2;
                }
            }
        }
        SparseArray sparseArray = new SparseArray();
        for (int i13 = 0; i13 < list2.size(); i13++) {
            String str9 = ((AbstractC169857hz) list2.get(i13)).A03;
            AbstractC169857hz abstractC169857hz7 = (AbstractC169857hz) list2.get(i13);
            if (A004.get(str9) == null) {
                sparseArray.put(i13, A00(c169927i7, abstractC169857hz7, null, c169827hw, str, str5, str6, str4, list));
            }
        }
        for (int i14 = 0; i14 < list4.size(); i14++) {
            AbstractC169857hz abstractC169857hz8 = (AbstractC169857hz) list4.get(i14);
            Pair pair3 = (Pair) A003.get(abstractC169857hz8.A03);
            if (pair3 != null && (intValue = ((Number) pair3.second).intValue()) >= 0) {
                sparseArray.put(intValue, C170057iK.A00((C170057iK) sparseArray.get(intValue), A00(c169927i7, (AbstractC169857hz) list2.get(intValue), abstractC169857hz8, c169827hw, str, str5, str6, str4, list)));
                i = intValue;
            } else {
                sparseArray.put(i, C170057iK.A00((C170057iK) sparseArray.get(i), A00(c169927i7, null, abstractC169857hz8, c169827hw, str, str5, str6, str4, list)));
            }
        }
        int size2 = sparseArray.size();
        for (int i15 = 0; i15 < size2; i15++) {
            c170057iK4 = C170057iK.A00(c170057iK4, (C170057iK) sparseArray.valueAt(i15));
        }
        abstractC169857hz2.A00 = c170057iK4.A00;
        return c170057iK4;
    }
}
