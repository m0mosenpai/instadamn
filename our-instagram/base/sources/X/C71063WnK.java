package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.WnK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71063WnK implements C6S0, C6S2 {
    public int A00;
    public C6S5 A01;
    public ArrayList A02;
    public boolean A03;
    public final Paint A04;
    public final ArrayList A05;

    public C71063WnK(ArrayList arrayList) {
        this.A05 = arrayList;
        Paint paint = new Paint();
        this.A04 = paint;
        ArrayList A00 = C6S3.A00(arrayList);
        C14360o3.A0C(A00, "null cannot be cast to non-null type java.util.ArrayList<android.graphics.Path>");
        this.A02 = A00;
        this.A03 = true;
        this.A01 = C6S5.A05;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    @Override // X.C6S0
    public final void AQP(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A03) {
            this.A03 = false;
            Iterator A13 = AbstractC166997dE.A13(this.A02);
            while (A13.hasNext()) {
                canvas.drawPath((Path) AbstractC166997dE.A0l(A13), this.A04);
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
        this.A01 = c6s5;
    }

    @Override // X.C6S0
    public final void FCG(Layout layout, Integer num, float f, int i, int i2) {
        C14360o3.A0B(layout, 0);
        ArrayList A00 = C6S3.A00(AbstractC68595VWw.A00(layout, f, i, i2));
        C14360o3.A0C(A00, "null cannot be cast to non-null type java.util.ArrayList<android.graphics.Path>");
        this.A02 = A00;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Wia, X.XCW, java.lang.Object] */
    @Override // X.C6S2
    public final XCW Bz1() {
        int color = this.A04.getColor();
        ArrayList arrayList = this.A05;
        C6S5 c6s5 = this.A01;
        ?? obj = new Object();
        obj.A00 = color;
        obj.A02 = arrayList;
        obj.A01 = c6s5;
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
        Paint paint = this.A04;
        if (this.A01 == C6S5.A06) {
            i2 = i;
        }
        paint.setColor(i2);
    }
}
