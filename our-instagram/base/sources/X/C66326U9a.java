package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* renamed from: X.U9a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66326U9a extends CharacterStyle implements C6S0, C6S2 {
    public int A00;
    public int A01;
    public int A02;
    public C6S5 A03 = C6S5.A05;

    @Override // X.C6S0
    public final void AQP(Canvas canvas) {
    }

    @Override // X.C6S0
    public final void AQX(Canvas canvas, Paint paint, Spanned spanned, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // X.C6S0
    public final void EfY(C6S5 c6s5) {
        C14360o3.A0B(c6s5, 0);
        this.A03 = c6s5;
    }

    @Override // X.C6S0
    public final void FCG(Layout layout, Integer num, float f, int i, int i2) {
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        return true;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        textPaint.bgColor = this.A00;
    }

    @Override // X.C6S0
    public final int BgK() {
        return this.A01;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.XCW, java.lang.Object, X.WiY] */
    @Override // X.C6S2
    public final XCW Bz1() {
        int i = this.A01;
        int i2 = this.A02;
        ?? obj = new Object();
        obj.A01 = i;
        obj.A00 = i2;
        return obj;
    }

    @Override // X.C6S1
    public final /* synthetic */ Integer Bz4() {
        return C05F.A00;
    }

    @Override // X.C6S0
    public final C6S5 C6E() {
        return this.A03;
    }

    @Override // X.C6S0
    public final void ERf(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i2;
    }
}
