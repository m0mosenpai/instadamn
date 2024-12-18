package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7iV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170167iV {
    public static final List A08 = new ArrayList();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final InterfaceC170717jO A04;
    public final List A05;
    public final List A06;
    public final List A07;

    public static C170167iV A00(InterfaceC170717jO interfaceC170717jO, Object obj, Object obj2, int i, int i2) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        return new C170167iV(interfaceC170717jO, null, list, obj2 != null ? Collections.singletonList(obj2) : null, i, i2, -1, 1);
    }

    public C170167iV(InterfaceC170717jO interfaceC170717jO, List list, List list2, List list3, int i, int i2, int i3, int i4) {
        List list4;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A04 = interfaceC170717jO == null ? C170697jM.A00() : interfaceC170717jO;
        if (list == null) {
            this.A07 = A08;
        } else {
            int size = list.size();
            this.A07 = new ArrayList(size);
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = list.get(i5);
                List list5 = this.A07;
                if (obj == null) {
                    obj = C170697jM.A00();
                }
                list5.add(obj);
            }
        }
        if (list2 != null) {
            list4 = Collections.unmodifiableList(list2);
        } else {
            list4 = null;
        }
        this.A06 = list4;
        this.A05 = list3 != null ? Collections.unmodifiableList(list3) : null;
    }
}
