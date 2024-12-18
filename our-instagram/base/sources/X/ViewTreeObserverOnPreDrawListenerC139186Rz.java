package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LineBackgroundSpan;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Rz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewTreeObserverOnPreDrawListenerC139186Rz implements C6S0, ViewTreeObserver.OnPreDrawListener, C6S2, LineBackgroundSpan {
    public int A00;
    public int A01;
    public C6S5 A02;
    public boolean A03;
    public float A04;
    public List A05;
    public List A06;
    public boolean A07;
    public final Paint A08;
    public final boolean A09;

    public ViewTreeObserverOnPreDrawListenerC139186Rz(List list, float f, int i) {
        C14360o3.A0B(list, 3);
        this.A00 = i;
        this.A04 = f;
        this.A06 = list;
        Paint paint = new Paint(1);
        this.A08 = paint;
        this.A05 = C6S3.A00(this.A06);
        this.A02 = C6S5.A05;
        paint.setColor(this.A00);
        this.A09 = Color.alpha(this.A00) < 255;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setPathEffect(new CornerPathEffect(this.A04));
        this.A07 = true;
    }

    @Override // X.C6S0
    public final /* synthetic */ void AQP(Canvas canvas) {
    }

    @Override // X.C6S0
    public final void AQX(Canvas canvas, Paint paint, Spanned spanned, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // X.C6S0
    public final void ERf(int i, int i2) {
        this.A07 = true;
        this.A01 = i;
        if (this.A02 == C6S5.A06) {
            i2 = i;
        }
        this.A00 = i2;
        this.A08.setColor(i2);
    }

    @Override // X.C6S0
    public final void EfY(C6S5 c6s5) {
        C14360o3.A0B(c6s5, 0);
        this.A02 = c6s5;
    }

    @Override // X.C6S0
    public final void FCG(Layout layout, Integer num, float f, int i, int i2) {
        C14360o3.A0B(layout, 0);
        float f2 = f * 0.2f;
        float f3 = f / 4.0f;
        this.A04 = f3;
        ArrayList A02 = AbstractC139126Rt.A02(layout, f * 0.3f, f2, f2, f3, 1.0f);
        this.A06 = A02;
        this.A05 = C6S3.A00(A02);
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        C14360o3.A0B(canvas, 0);
        if (!this.A07 && !this.A03) {
            return;
        }
        this.A07 = false;
        int size = this.A05.size();
        for (int i9 = 0; i9 < size; i9++) {
            canvas.drawPath((Path) this.A05.get(i9), this.A08);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.A07 = true;
        return true;
    }

    @Override // X.C6S0
    public final int BgK() {
        return this.A01;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.XCW, java.lang.Object, X.WiZ] */
    @Override // X.C6S2
    public final XCW Bz1() {
        int i = this.A00;
        float f = this.A04;
        List list = this.A06;
        ?? obj = new Object();
        obj.A02 = C16930sl.A00;
        obj.A01 = i;
        obj.A00 = f;
        obj.A02 = list;
        return obj;
    }

    @Override // X.C6S1
    public final /* synthetic */ Integer Bz4() {
        return C05F.A00;
    }

    @Override // X.C6S0
    public final C6S5 C6E() {
        return this.A02;
    }
}
