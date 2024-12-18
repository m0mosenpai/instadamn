package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Kt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115595Kt extends C0T6 {
    public final C9BW A00;
    public final C5JH A01;
    public final C47v A02;
    public final List A03;
    public final List A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    public C115595Kt(C9BW c9bw, C5JH c5jh, C47v c47v, List list, List list2) {
        C14360o3.A0B(list, 1);
        this.A04 = list;
        this.A01 = c5jh;
        this.A02 = c47v;
        this.A00 = c9bw;
        this.A03 = list2;
        this.A07 = AbstractC09440dt.A01(new C9EQ(this, 2));
        this.A06 = AbstractC09440dt.A01(new C9EQ(this, 3));
        this.A05 = AbstractC09440dt.A01(new C9EQ(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.9Z6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.9Z6, java.lang.Object] */
    public final ArrayList A00() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (C115475Kh c115475Kh : (List) this.A06.getValue()) {
            String str = c115475Kh.A0M;
            if (str != null) {
                int i2 = i - 250;
                if (arrayList.isEmpty() || ((!arrayList.isEmpty()) && ((C9Z6) AbstractC001800i.A0K(arrayList)).A01 != i2)) {
                    ?? obj = new Object();
                    obj.A02 = str;
                    obj.A00 = 500;
                    obj.A01 = i2;
                    arrayList.add(obj);
                }
            }
            String str2 = c115475Kh.A0N;
            if (str2 != null) {
                int i3 = ((c115475Kh.A08 - c115475Kh.A09) + i) - 250;
                if (arrayList.isEmpty() || ((!arrayList.isEmpty()) && ((C9Z6) AbstractC001800i.A0K(arrayList)).A01 != i3)) {
                    ?? obj2 = new Object();
                    obj2.A02 = str2;
                    obj2.A00 = 500;
                    obj2.A01 = i3;
                    arrayList.add(obj2);
                }
            }
            i += c115475Kh.A08 - c115475Kh.A09;
        }
        return arrayList;
    }

    public final List A01() {
        return (List) this.A07.getValue();
    }
}
