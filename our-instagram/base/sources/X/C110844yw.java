package X;

import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: X.4yw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110844yw extends C110814yt {
    public int A00;
    public int A01;
    public C69046Vgn A02;
    public boolean A03;

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0009. Please report as an issue. */
    public final void A0E(String str) {
        int i = 0;
        if (str != null) {
            int i2 = 1;
            i = -1;
            switch (str.hashCode()) {
                case -1364013995:
                    if (!str.equals("center")) {
                        return;
                    }
                    i2 = Integer.MIN_VALUE;
                    this.A01 = i2;
                    return;
                case 100571:
                    if (!str.equals("end")) {
                        return;
                    }
                    this.A01 = i2;
                    return;
                case 109757538:
                    if (!str.equals("start")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
        }
        this.A01 = i;
    }

    @Override // X.C110814yt
    public final float A06(DisplayMetrics displayMetrics) {
        float f = 25.0f / displayMetrics.densityDpi;
        if (!this.A03) {
            return f * 0.1f;
        }
        return f;
    }

    @Override // X.C110814yt
    public final int A07() {
        return this.A01;
    }

    @Override // X.C110814yt
    public final int A08() {
        return this.A01;
    }

    @Override // X.C110814yt
    public final int A0B(int i, int i2, int i3, int i4, int i5) {
        if (this.A01 == Integer.MIN_VALUE) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
        return super.A0B(i, i2, i3, i4, i5);
    }

    @Override // X.C110814yt
    public final int A0C(View view, int i) {
        int i2;
        AbstractC70663Fe abstractC70663Fe = ((AbstractC110824yu) this).A02;
        if (abstractC70663Fe != null && abstractC70663Fe.A1X()) {
            i2 = this.A00;
        } else {
            i2 = 0;
        }
        return super.A0C(view, i) + i2;
    }

    @Override // X.C110814yt
    public final int A0D(View view, int i) {
        int i2;
        AbstractC70663Fe abstractC70663Fe = ((AbstractC110824yu) this).A02;
        if (abstractC70663Fe != null && abstractC70663Fe.A1Y()) {
            i2 = this.A00;
        } else {
            i2 = 0;
        }
        return super.A0D(view, i) + i2;
    }

    @Override // X.C110814yt, X.AbstractC110824yu
    public final void A02() {
        super.A02();
        C69046Vgn c69046Vgn = this.A02;
        if (c69046Vgn != null) {
            c69046Vgn.A02.A02 = null;
            c69046Vgn.A00.A14(new UHH(c69046Vgn));
        }
    }
}
