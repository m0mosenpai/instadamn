package X;

import java.util.List;

/* renamed from: X.3JY, reason: invalid class name */
/* loaded from: classes2.dex */
public class C3JY {
    public InterfaceC26481Qd A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final List A04;

    public InterfaceC26481Qd A00() {
        return this.A00;
    }

    public final C23781El A01(String str) {
        for (C23781El c23781El : this.A04) {
            if (c23781El.A00.equalsIgnoreCase(str)) {
                return c23781El;
            }
        }
        return null;
    }

    public C3JY(String str, List list, int i, int i2) {
        this.A02 = i;
        this.A03 = str;
        this.A01 = i2;
        this.A04 = list;
    }
}
