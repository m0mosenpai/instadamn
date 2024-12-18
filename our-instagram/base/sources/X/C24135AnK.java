package X;

import android.view.View;
import android.view.ViewGroup;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: X.AnK, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24135AnK implements InterfaceC195688l9 {
    public int A00;
    public int A01;
    public int A02;
    public final AbstractC195668l7 A03;
    public final InterfaceC195538kt A04;

    public C24135AnK(AbstractC195668l7 abstractC195668l7, InterfaceC195538kt interfaceC195538kt, int i, int i2) {
        this.A03 = abstractC195668l7;
        this.A04 = interfaceC195538kt;
        if (interfaceC195538kt.Bph() > 0) {
            this.A01 = i;
        }
        if (i2 > 0) {
            this.A00 = i2;
        } else if (interfaceC195538kt.Bph() > 1) {
            this.A00 = i;
        }
        if (interfaceC195538kt.Bph() > 2) {
            this.A02 = i;
        }
    }

    private final int A00(int i) {
        int i2 = this.A01;
        int i3 = this.A02;
        InterfaceC195538kt interfaceC195538kt = this.A04;
        if (i >= i2 + (i3 * (interfaceC195538kt.Bph() - 2))) {
            return interfaceC195538kt.Bph() - 1;
        }
        int i4 = this.A01;
        if (i < i4) {
            return 0;
        }
        return ((i - i4) / this.A02) + 1;
    }

    public static int A01(C24135AnK c24135AnK) {
        return c24135AnK.A01 + (c24135AnK.A02 * (c24135AnK.A04.Bph() - 2)) + c24135AnK.A00;
    }

    @Override // X.InterfaceC195688l9
    public final float Br1(int i) {
        View childAt = this.A03.A00.getChildAt(0);
        C14360o3.A07(childAt);
        int i2 = -childAt.getTop();
        int i3 = 1;
        int i4 = this.A01 * (AbstractC167007dF.A1O(i) ? 1 : 0);
        int i5 = this.A02;
        int i6 = 0;
        if (i > 0) {
            i6 = i - 1;
        }
        int i7 = i5 * i6;
        int i8 = this.A00;
        if (i <= this.A04.Bph()) {
            i3 = 0;
        }
        return C17s.A01(BigDecimal.valueOf((((i4 + i7) + (i8 * i3)) + i2) / (A01(this) - r6.getHeight())).setScale(5, RoundingMode.HALF_UP).floatValue());
    }

    @Override // X.InterfaceC195688l9
    public final void DPF() {
        InterfaceC195538kt interfaceC195538kt = this.A04;
        if (interfaceC195538kt.Bph() == 0) {
            this.A01 = 0;
        }
        if (interfaceC195538kt.Bph() <= 1) {
            this.A00 = 0;
        }
        if (interfaceC195538kt.Bph() <= 2) {
            this.A02 = 0;
        }
    }

    @Override // X.InterfaceC195688l9
    public final int BYc(int i, float f) {
        int A01 = (int) (f * (A01(this) - this.A03.A00.getHeight()));
        int i2 = 1;
        int i3 = this.A01 * (AbstractC167007dF.A1O(i) ? 1 : 0);
        int i4 = this.A02;
        int i5 = 0;
        if (i > 0) {
            i5 = i - 1;
        }
        int i6 = i4 * i5;
        int i7 = this.A00;
        if (i <= this.A04.Bph()) {
            i2 = 0;
        }
        return ((i3 + i6) + (i7 * i2)) - A01;
    }

    @Override // X.InterfaceC195688l9
    public final int Bpj(float f) {
        return A00((int) (f * (A01(this) - this.A03.A00.getHeight())));
    }

    @Override // X.InterfaceC195688l9
    public final int Brk(float f) {
        return A00((int) (f * A01(this)));
    }

    @Override // X.InterfaceC195688l9
    public final boolean CcU() {
        int A01 = A01(this);
        ViewGroup viewGroup = this.A03.A00;
        if (A01 > viewGroup.getHeight() && viewGroup.getChildCount() > 0) {
            return true;
        }
        return false;
    }
}
