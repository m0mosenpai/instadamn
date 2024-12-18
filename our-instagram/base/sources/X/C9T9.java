package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;

/* renamed from: X.9T9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9T9 extends CharacterStyle implements C6S0, C6S2 {
    public int A00;
    public int A01;
    public Float A04;
    public Integer A05;
    public final Context A06;
    public TextShadow A03 = TextShadow.A03;
    public C6S5 A02 = C6S5.A05;

    @Override // X.C6S0
    public final /* synthetic */ void AQP(Canvas canvas) {
    }

    @Override // X.C6S0
    public final /* synthetic */ void AQX(Canvas canvas, Paint paint, Spanned spanned, int i, int i2, int i3, int i4, int i5) {
        C14360o3.A0B(canvas, 2);
    }

    @Override // X.C6S0
    public final void EfY(C6S5 c6s5) {
        C14360o3.A0B(c6s5, 0);
        this.A02 = c6s5;
    }

    @Override // X.C6S0
    public final /* synthetic */ void FCG(Layout layout, Integer num, float f, int i, int i2) {
    }

    @Override // X.C6S0
    public final int BgK() {
        return this.A01;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.XCW, java.lang.Object, X.WiX] */
    @Override // X.C6S2
    public final XCW Bz1() {
        int i = this.A00;
        C6S5 c6s5 = this.A02;
        ?? obj = new Object();
        obj.A00 = i;
        obj.A01 = c6s5;
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

    @Override // X.C6S0
    public final void ERf(int i, int i2) {
        this.A01 = i;
        this.A00 = i;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final /* synthetic */ boolean onPreDraw() {
        return true;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i;
        float A01;
        TextColors ALM = InterfaceC190908cm.A02.ALM(this.A00);
        TextShadow textShadow = ALM.A01;
        if (textShadow != null) {
            this.A03 = textShadow;
        }
        if (textPaint != null) {
            Integer num = this.A05;
            if (num != null) {
                i = num.intValue();
            } else {
                i = ALM.A00;
            }
            textPaint.setColor(i);
            Float f = this.A04;
            if (f != null) {
                A01 = f.floatValue();
            } else {
                A01 = this.A03.A01(this.A06);
            }
            textPaint.setShadowLayer(A01, 0.0f, this.A03.A00(this.A06), this.A03.A00);
        }
    }

    public C9T9(Context context) {
        this.A06 = context;
    }
}
