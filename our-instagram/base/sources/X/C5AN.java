package X;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: X.5AN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5AN implements C5AO {
    public Shader A02;
    public C5YV A03;
    public InterfaceC72011XEz A04;
    public Paint A01 = new Paint(7);
    public int A00 = 3;

    @Override // X.C5AO
    public final int C30() {
        int i;
        Paint.Cap strokeCap = this.A01.getStrokeCap();
        if (strokeCap != null && (i = C62X.A00[strokeCap.ordinal()]) != 1) {
            if (i != 2) {
                if (i == 3) {
                    return 2;
                }
                return 0;
            }
            return 1;
        }
        return 0;
    }

    @Override // X.C5AO
    public final int C32() {
        int i;
        Paint.Join strokeJoin = this.A01.getStrokeJoin();
        if (strokeJoin != null && (i = C62X.A01[strokeJoin.ordinal()]) != 1) {
            if (i != 2) {
                if (i == 3) {
                    return 1;
                }
            } else {
                return 2;
            }
        }
        return 0;
    }

    @Override // X.C5AO
    public final void EPa(float f) {
        this.A01.setAlpha((int) Math.rint(f * 255.0f));
    }

    @Override // X.C5AO
    public final void EQM(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            AbstractC65752TtR.A00(i, this.A01);
        }
    }

    @Override // X.C5AO
    public final void ERg(long j) {
        this.A01.setColor(C5AC.A00(j));
    }

    @Override // X.C5AO
    public final void ERj(C5YV c5yv) {
        ColorFilter colorFilter;
        this.A03 = c5yv;
        Paint paint = this.A01;
        if (c5yv != null) {
            colorFilter = c5yv.A00;
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
    }

    @Override // X.C5AO
    public final void Ef2(int i) {
        Paint.Cap cap;
        Paint paint = this.A01;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }
}
