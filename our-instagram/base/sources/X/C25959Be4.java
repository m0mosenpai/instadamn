package X;

import java.util.Arrays;
import java.util.TimerTask;

/* renamed from: X.Be4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25959Be4 extends UMM {
    public int A00;
    public TimerTask A01;

    public final InterfaceC59242nQ A05() {
        InterfaceC59242nQ interfaceC59242nQ = (InterfaceC59242nQ) A02((this.A00 + 1) % ((AbstractC66312U8l) this).A04.length);
        if (interfaceC59242nQ != null) {
            return interfaceC59242nQ;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A06() {
        int i = this.A00;
        int length = ((AbstractC66312U8l) this).A04.length;
        int i2 = ((i - 1) + length) % length;
        int i3 = (i + 1) % length;
        ((UMM) this).A02++;
        ((UMM) this).A03 = 0;
        boolean[] zArr = this.A0A;
        int i4 = i3 + 1;
        Arrays.fill(zArr, 0, i4, true);
        Arrays.fill(zArr, i4, this.A0C.length, false);
        invalidateSelf();
        zArr[i2] = false;
        this.A08[i2] = 0;
        invalidateSelf();
        ((UMM) this).A02--;
        invalidateSelf();
        this.A00 = i3;
    }
}
