package X;

import java.util.List;

/* renamed from: X.8MJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MJ implements C8MI {
    public C199578s9 A00;
    public List A01;
    public final C8MK A02 = new Object();
    public final C8ME A03;

    public final synchronized void A00(List list) {
        C14360o3.A0B(list, 0);
        this.A01 = list;
    }

    @Override // X.C8MI
    public final synchronized void Da9() {
        if (this.A00 != null) {
            C8ME c8me = this.A03;
            C8MK c8mk = this.A02;
            c8me.AKw(c8mk);
            int i = c8mk.A01;
            int i2 = c8mk.A02;
            float f = c8mk.A00;
            C14360o3.A0A(this.A00);
            Integer num = c8mk.A03;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 3 || intValue == 2) {
                            C199578s9 c199578s9 = this.A00;
                            C14360o3.A0A(c199578s9);
                            c199578s9.A01(i, i, f);
                            C199578s9 c199578s92 = this.A00;
                            C14360o3.A0A(c199578s92);
                            c199578s92.A02(this.A01, i, i);
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        C199578s9 c199578s93 = this.A00;
                        C14360o3.A0A(c199578s93);
                        c199578s93.A01(i2, i, f);
                        C199578s9 c199578s94 = this.A00;
                        C14360o3.A0A(c199578s94);
                        c199578s94.A02(this.A01, i2, i);
                    }
                } else {
                    C199578s9 c199578s95 = this.A00;
                    C14360o3.A0A(c199578s95);
                    c199578s95.A01(i, i2, f);
                    C199578s9 c199578s96 = this.A00;
                    C14360o3.A0A(c199578s96);
                    c199578s96.A02(this.A01, i, i2);
                }
            } else {
                C14360o3.A0F("swipeMode");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.8MK] */
    public C8MJ(C8ME c8me) {
        this.A03 = c8me;
    }
}
