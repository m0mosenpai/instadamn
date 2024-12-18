package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.6NJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6NJ {
    public final List A00 = new ArrayList();

    public /* synthetic */ C6NJ(List list, DefaultConstructorMarker defaultConstructorMarker, int i) {
    }

    public final int A00() {
        int intValue;
        List list = this.A00;
        if (list.size() > 0) {
            int intValue2 = ((Number) list.get(0)).intValue();
            while ((!list.isEmpty()) && ((Number) list.get(0)).intValue() == intValue2) {
                list.set(0, AbstractC001800i.A0K(list));
                list.remove(list.size() - 1);
                int size = list.size();
                int size2 = list.size() >>> 1;
                int i = 0;
                while (i < size2) {
                    int intValue3 = ((Number) list.get(i)).intValue();
                    int i2 = (i + 1) * 2;
                    int i3 = i2 - 1;
                    int intValue4 = ((Number) list.get(i3)).intValue();
                    if (i2 < size && (intValue = ((Number) list.get(i2)).intValue()) > intValue4) {
                        if (intValue > intValue3) {
                            list.set(i, Integer.valueOf(intValue));
                            list.set(i2, Integer.valueOf(intValue3));
                            i = i2;
                        }
                    } else if (intValue4 > intValue3) {
                        list.set(i, Integer.valueOf(intValue4));
                        list.set(i3, Integer.valueOf(intValue3));
                        i = i3;
                    }
                }
            }
            return intValue2;
        }
        C5UC.A03("Set is empty");
        throw C00O.createAndThrow();
    }

    public final void A01(int i) {
        List list = this.A00;
        if ((!list.isEmpty()) && (((Number) list.get(0)).intValue() == i || ((Number) list.get(list.size() - 1)).intValue() == i)) {
            return;
        }
        int size = list.size();
        Integer valueOf = Integer.valueOf(i);
        list.add(valueOf);
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int intValue = ((Number) list.get(i2)).intValue();
            if (i <= intValue) {
                break;
            }
            list.set(size, Integer.valueOf(intValue));
            size = i2;
        }
        list.set(size, valueOf);
    }

    public C6NJ() {
    }
}
