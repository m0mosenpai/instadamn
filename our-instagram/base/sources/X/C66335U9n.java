package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.U9n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66335U9n extends MetricAffectingSpan implements C6S0, C6S2 {
    public static final C69510Vpn A07 = new Object();
    public int A00;
    public C6S5 A01;
    public boolean A02;
    public final Paint A03;
    public final Paint A04;
    public final ArrayList A05;
    public final ArrayList A06;

    public C66335U9n(ArrayList arrayList, ArrayList arrayList2) {
        this.A05 = arrayList;
        this.A06 = arrayList2;
        Paint paint = new Paint();
        this.A03 = paint;
        Paint paint2 = new Paint();
        this.A04 = paint2;
        this.A02 = true;
        this.A01 = C6S5.A05;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
    }

    @Override // X.C6S0
    public final void AQP(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A02) {
            this.A02 = false;
            canvas.save();
            ArrayList arrayList = this.A05;
            int size = arrayList.size();
            ArrayList arrayList2 = this.A06;
            int min = Math.min(size, arrayList2.size());
            for (int i = 0; i < min; i++) {
                ((C69621VsO) arrayList.get(i)).A00(canvas, this.A03);
                ((C69621VsO) arrayList2.get(i)).A00(canvas, this.A04);
            }
            canvas.restore();
        }
    }

    @Override // X.C6S0
    public final /* synthetic */ void AQX(Canvas canvas, Paint paint, Spanned spanned, int i, int i2, int i3, int i4, int i5) {
        C14360o3.A0B(canvas, 2);
        AQP(canvas);
    }

    @Override // X.C6S0
    public final void EfY(C6S5 c6s5) {
        C14360o3.A0B(c6s5, 0);
        this.A01 = c6s5;
    }

    @Override // X.C6S0
    public final void FCG(Layout layout, Integer num, float f, int i, int i2) {
        C14360o3.A0B(layout, 0);
        ArrayList arrayList = this.A05;
        arrayList.clear();
        ArrayList arrayList2 = this.A06;
        arrayList2.clear();
        C69510Vpn c69510Vpn = A07;
        arrayList.addAll(c69510Vpn.A00(layout, f, i, i2, true));
        arrayList2.addAll(c69510Vpn.A00(layout, f, i, i2, false));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final /* synthetic */ boolean onPreDraw() {
        this.A02 = true;
        return true;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
    }

    @Override // X.C6S0
    public final int BgK() {
        return this.A00;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.Wie, X.XCW, java.lang.Object] */
    @Override // X.C6S2
    public final XCW Bz1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator A13 = AbstractC166997dE.A13(this.A05);
        while (A13.hasNext()) {
            C69621VsO c69621VsO = (C69621VsO) AbstractC166997dE.A0l(A13);
            arrayList.add(new W2t(c69621VsO.A03, c69621VsO.A01, c69621VsO.A02, c69621VsO.A04));
        }
        Iterator A132 = AbstractC166997dE.A13(this.A06);
        while (A132.hasNext()) {
            C69621VsO c69621VsO2 = (C69621VsO) AbstractC166997dE.A0l(A132);
            arrayList2.add(new W2t(c69621VsO2.A03, c69621VsO2.A01, c69621VsO2.A02, c69621VsO2.A04));
        }
        int color = this.A03.getColor();
        int color2 = this.A04.getColor();
        C6S5 c6s5 = this.A01;
        ?? obj = new Object();
        obj.A01 = color;
        obj.A00 = color2;
        obj.A03 = arrayList;
        obj.A04 = arrayList2;
        obj.A02 = c6s5;
        return obj;
    }

    @Override // X.C6S1
    public final /* synthetic */ Integer Bz4() {
        return C05F.A00;
    }

    @Override // X.C6S0
    public final C6S5 C6E() {
        return this.A01;
    }

    @Override // X.C6S0
    public final void ERf(int i, int i2) {
        this.A00 = i;
        boolean A1X = AbstractC167007dF.A1X(this.A01, C6S5.A06);
        Paint paint = this.A03;
        int i3 = i;
        if (A1X) {
            i3 = i2;
        }
        paint.setColor(i3);
        Paint paint2 = this.A04;
        if (!A1X) {
            i = i2;
        }
        paint2.setColor(i);
    }
}
