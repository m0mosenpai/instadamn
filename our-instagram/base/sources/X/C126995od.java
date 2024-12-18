package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5od, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126995od implements InterfaceC122595gu {
    public final C5C8 A00;
    public final List A01;
    public final List A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public C126995od(C5C8 c5c8, C118125Vw c118125Vw, C5DD c5dd, InterfaceC1128957x interfaceC1128957x, List list) {
        String str;
        this.A00 = c5c8;
        this.A02 = list;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C9EV(this, 34));
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new C9EV(this, 33));
        C5W4 c5w4 = c118125Vw.A00;
        C5C8 c5c82 = AbstractC127005oe.A00;
        String str2 = c5c8.A00;
        int length = str2.length();
        List list2 = c5c8.A02;
        list2 = list2 == null ? C16930sl.A00 : list2;
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            C127015of c127015of = (C127015of) list2.get(i);
            C5W4 c5w42 = (C5W4) c127015of.A02;
            int i3 = c127015of.A01;
            int i4 = c127015of.A00;
            if (i3 != i2) {
                arrayList.add(new C127015of(c5w4, i2, i3));
            }
            arrayList.add(new C127015of(c5w4.A00(c5w42), i3, i4));
            i++;
            i2 = i4;
        }
        if (i2 != length) {
            arrayList.add(new C127015of(c5w4, i2, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C127015of(c5w4, 0, 0));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            C127015of c127015of2 = (C127015of) arrayList.get(i5);
            int i6 = c127015of2.A01;
            int i7 = c127015of2.A00;
            if (i6 != i7) {
                str = str2.substring(i6, i7);
                C14360o3.A07(str);
            } else {
                str = "";
            }
            C5C8 c5c83 = new C5C8(str, AbstractC127005oe.A00(c5c8, i6, i7), null, null);
            C5W4 c5w43 = (C5W4) c127015of2.A02;
            if (c5w43.A03 == Integer.MIN_VALUE) {
                int i8 = c5w4.A03;
                c5w43 = new C5W4(c5w43.A05, c5w43.A06, c5w43.A07, c5w43.A02, i8, c5w43.A01, c5w43.A00, c5w43.A04);
            }
            String str3 = c5c83.A00;
            C118125Vw c118125Vw2 = new C118125Vw(c5w4.A00(c5w43), c118125Vw.A02);
            List list3 = c5c83.A03;
            list3 = list3 == null ? C16930sl.A00 : list3;
            List list4 = this.A02;
            ArrayList arrayList3 = new ArrayList(list4.size());
            int size3 = list4.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Object obj = list4.get(i9);
                C127015of c127015of3 = (C127015of) obj;
                if (AbstractC127005oe.A02(i6, i7, c127015of3.A01, c127015of3.A00)) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size4 = arrayList3.size();
            for (int i10 = 0; i10 < size4; i10++) {
                C127015of c127015of4 = (C127015of) arrayList3.get(i10);
                if (i6 <= c127015of4.A01 && c127015of4.A00 <= i7) {
                    arrayList4.add(new C127015of(c127015of4.A02, c127015of4.A01 - i6, c127015of4.A00 - i6));
                } else {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
                }
            }
            arrayList2.add(new C127025og(new C122585gt(c118125Vw2, c5dd, interfaceC1128957x, str3, list3, arrayList4), i6, i7));
        }
        this.A01 = arrayList2;
    }

    @Override // X.InterfaceC122595gu
    public final boolean BCg() {
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C127025og) list.get(i)).A02.BCg()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC122595gu
    public final float BPq() {
        return ((Number) this.A03.getValue()).floatValue();
    }

    @Override // X.InterfaceC122595gu
    public final float BTs() {
        return ((Number) this.A04.getValue()).floatValue();
    }
}
