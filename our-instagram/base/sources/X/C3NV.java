package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3NV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3NV implements InterfaceC13000lm {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Integer A04;
    public final List A05;
    public final InterfaceC16600sD A06;

    public C3NV(Integer num, InterfaceC16600sD interfaceC16600sD, int i, int i2, int i3, int i4) {
        C14360o3.A0B(num, 5);
        this.A03 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A04 = num;
        this.A06 = interfaceC16600sD;
        this.A05 = new ArrayList();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A05.clear();
    }
}
