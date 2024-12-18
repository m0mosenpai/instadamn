package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0pv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15400pv {
    public final C0JO A00;
    public final C0Xz A01;
    public final Map A02 = new HashMap();
    public volatile long A03;

    public final synchronized ArrayList A00() {
        ArrayList arrayList;
        Map map = this.A02;
        arrayList = new ArrayList(map.size());
        for (C06810Xx c06810Xx : map.values()) {
            String[] strArr = new String[c06810Xx.A02.length];
            String[] strArr2 = new String[c06810Xx.A04.length];
            String[] strArr3 = new String[c06810Xx.A03.length];
            String[] strArr4 = new String[c06810Xx.A01.length];
            String[] strArr5 = new String[c06810Xx.A05.length];
            C0Xz c0Xz = this.A01;
            InterfaceC12970lj[] interfaceC12970ljArr = c0Xz.A03;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 4; i3++) {
                InterfaceC12970lj interfaceC12970lj = interfaceC12970ljArr[i3];
                if (interfaceC12970lj instanceof InterfaceC12170kL) {
                    strArr[i] = interfaceC12970lj.getName();
                    i++;
                } else if (interfaceC12970lj instanceof C08950cz) {
                    strArr2[i2] = interfaceC12970lj.getName();
                    i2++;
                } else {
                    throw new UnsupportedOperationException(AnonymousClass001.A0R("Unsupported Dimension: ", interfaceC12970lj.getClass().getName()));
                }
            }
            int i4 = 0;
            int i5 = 0;
            for (C0Y3 c0y3 : c0Xz.A02) {
                if (c0y3.A00().intValue() != 0) {
                    int i6 = i5 + 1;
                    strArr4[i5] = AnonymousClass001.A0R(c0y3.A00.getName(), ".sum");
                    i5 = i6;
                } else {
                    strArr3[i4] = AnonymousClass001.A0R(c0y3.A00.getName(), ".sum");
                    i4++;
                }
            }
            arrayList.add(new C0Y1(c06810Xx.A01, c06810Xx.A02, c06810Xx.A03, strArr, strArr2, c06810Xx.A04, strArr3, strArr4, strArr5, c06810Xx.A05, c06810Xx.A00));
        }
        return arrayList;
    }

    public C15400pv(C0JO c0jo, C0Xz c0Xz) {
        this.A01 = c0Xz;
        this.A00 = c0jo;
    }
}
