package X;

import java.io.Serializable;

/* renamed from: X.45b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C912245b implements InterfaceC912345c, Serializable {
    @Override // X.InterfaceC912345c
    public final void FEY(AnonymousClass182 anonymousClass182, int i) {
        if (this instanceof C912145a) {
            anonymousClass182.A0e(' ');
            return;
        }
        if (!(this instanceof C912445d)) {
            return;
        }
        C912445d c912445d = (C912445d) this;
        anonymousClass182.A0t(c912445d.A01);
        if (i <= 0) {
            return;
        }
        int i2 = i * c912445d.A00;
        while (true) {
            char[] cArr = c912445d.A02;
            int length = cArr.length;
            if (i2 > length) {
                anonymousClass182.A0z(cArr, 0, length);
                i2 -= length;
            } else {
                anonymousClass182.A0z(cArr, 0, i2);
                return;
            }
        }
    }

    @Override // X.InterfaceC912345c
    public final boolean isInline() {
        if (this instanceof C912445d) {
            return false;
        }
        return true;
    }
}
