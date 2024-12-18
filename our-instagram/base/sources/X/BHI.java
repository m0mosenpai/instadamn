package X;

import android.view.View;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class BHI implements C5E5 {
    public final C03I A00;
    public final View A01;
    public final int[] A02;

    @Override // X.C5E5
    public final Object DZz(InterfaceC23621Ds interfaceC23621Ds, long j, long j2) {
        C03I c03i = this.A00;
        if (!c03i.A04(AbstractC25231BEo.A00(j2) * (-1.0f), AbstractC25232BEp.A00(j2) * (-1.0f), true)) {
            j2 = 0;
        }
        if (c03i.A01 != null) {
            c03i.A01(0);
        }
        if (c03i.A00 != null) {
            c03i.A01(1);
        }
        return new C25242BFb(j2);
    }

    @Override // X.C5E5
    public final long Da2(long j, long j2, int i) {
        C03I c03i = this.A00;
        float A01 = C119365at.A01(j2);
        int i2 = 0;
        if (Math.abs(A01) >= 0.5f) {
            i2 = 1;
        }
        float A02 = C119365at.A02(j2);
        if (Math.abs(A02) >= 0.5f) {
            i2 |= 2;
        }
        int i3 = 0;
        if (i == 1) {
            i3 = 1;
        }
        int i4 = i3 ^ 1;
        if (c03i.A05(i2, i4)) {
            int[] iArr = this.A02;
            Arrays.fill(iArr, 0, 2, 0);
            C03I.A00(c03i, null, iArr, BHJ.A00(C119365at.A01(j)), BHJ.A00(C119365at.A02(j)), BHJ.A00(A01), BHJ.A00(A02), i4);
            return BHJ.A01(iArr, j2);
        }
        return 0L;
    }

    @Override // X.C5E5
    public final Object Da5(InterfaceC23621Ds interfaceC23621Ds, long j) {
        C03I c03i = this.A00;
        if (!c03i.A03(AbstractC25231BEo.A00(j) * (-1.0f), AbstractC25232BEp.A00(j) * (-1.0f))) {
            j = 0;
        }
        if (c03i.A01 != null) {
            c03i.A01(0);
        }
        if (c03i.A00 != null) {
            c03i.A01(1);
        }
        return new C25242BFb(j);
    }

    @Override // X.C5E5
    public final long DaA(long j, int i) {
        C03I c03i = this.A00;
        float A01 = C119365at.A01(j);
        int i2 = 0;
        if (Math.abs(A01) >= 0.5f) {
            i2 = 1;
        }
        float A02 = C119365at.A02(j);
        if (Math.abs(A02) >= 0.5f) {
            i2 |= 2;
        }
        int i3 = 0;
        if (i == 1) {
            i3 = 1;
        }
        int i4 = i3 ^ 1;
        if (c03i.A05(i2, i4)) {
            int[] iArr = this.A02;
            Arrays.fill(iArr, 0, 2, 0);
            c03i.A07(iArr, null, BHJ.A00(A01), BHJ.A00(A02), i4);
            return BHJ.A01(iArr, j);
        }
        return 0L;
    }

    public BHI(View view) {
        this.A01 = view;
        C03I c03i = new C03I(view);
        c03i.A02(true);
        this.A00 = c03i;
        this.A02 = new int[2];
        view.setNestedScrollingEnabled(true);
    }
}
