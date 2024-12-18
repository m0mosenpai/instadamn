package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.WnL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71064WnL implements C6S0, C6S2 {
    public int A00;
    public ArrayList A04;
    public final ArrayList A05;
    public Paint A01 = new Paint();
    public boolean A03 = true;
    public C6S5 A02 = C6S5.A05;

    public C71064WnL(ArrayList arrayList) {
        this.A05 = arrayList;
        this.A04 = new ArrayList();
        ArrayList A00 = C6S3.A00(arrayList);
        C14360o3.A0C(A00, "null cannot be cast to non-null type java.util.ArrayList<android.graphics.Path>");
        this.A04 = A00;
        this.A01.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    @Override // X.C6S0
    public final void AQP(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A03) {
            this.A03 = false;
            Iterator A13 = AbstractC166997dE.A13(this.A04);
            while (A13.hasNext()) {
                canvas.drawPath((Path) AbstractC166997dE.A0l(A13), this.A01);
            }
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
        this.A02 = c6s5;
    }

    @Override // X.C6S0
    public final void FCG(Layout layout, Integer num, float f, int i, int i2) {
        C14360o3.A0B(layout, 0);
        ArrayList arrayList = this.A05;
        arrayList.clear();
        arrayList.addAll(AbstractC68597VWy.A00(layout, f));
        ArrayList A00 = C6S3.A00(arrayList);
        C14360o3.A0C(A00, "null cannot be cast to non-null type java.util.ArrayList<android.graphics.Path>");
        this.A04 = A00;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final /* synthetic */ boolean onPreDraw() {
        this.A03 = true;
        return true;
    }

    @Override // X.C6S0
    public final int BgK() {
        return this.A00;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Wid, X.XCW, java.lang.Object] */
    @Override // X.C6S2
    public final XCW Bz1() {
        Paint paint = this.A01;
        int color = paint.getColor();
        int color2 = paint.getColor();
        ArrayList arrayList = this.A05;
        C6S5 c6s5 = this.A02;
        ?? obj = new Object();
        obj.A01 = color;
        obj.A00 = color2;
        obj.A03 = arrayList;
        obj.A02 = c6s5;
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
        this.A00 = i;
        Paint paint = this.A01;
        if (this.A02 == C6S5.A06) {
            i2 = i;
        }
        paint.setColor(i2);
    }
}
