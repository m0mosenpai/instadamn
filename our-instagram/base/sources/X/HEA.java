package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class HEA extends C7E1 {
    public HEA(JG0 jg0, List list) {
        int size = list.size();
        InterfaceC65642y0[] interfaceC65642y0Arr = new InterfaceC65642y0[size];
        for (int i = 0; i < size; i++) {
            interfaceC65642y0Arr[i] = new C38987HEp(jg0);
        }
        A0B(interfaceC65642y0Arr);
        for (int i2 = 0; i2 < size; i2++) {
            A08(interfaceC65642y0Arr[i2], list.get(i2));
        }
    }
}
