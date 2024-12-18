package X;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* renamed from: X.6IM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6IM {
    public Object A00;
    public boolean A01;
    public final C6M7 A02;
    public final InterfaceC119545bC A03;
    public final InterfaceC119545bC A04;

    public static final void A00(C6IM c6im, int i, int i2) {
        if (i >= 0.0f) {
            c6im.A03.EWE(i);
            c6im.A02.A00(i);
            c6im.A04.EWE(i2);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0I("Index should be non-negative (", ')', i));
    }

    public C6IM(int i, int i2) {
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A03 = new ParcelableSnapshotMutableIntState(i);
        this.A04 = new ParcelableSnapshotMutableIntState(i2);
        this.A02 = new C6M7(i, 30, 100);
    }

    public C6IM() {
        this(0, 0);
    }
}
