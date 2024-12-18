package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WnN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71065WnN implements C6S0, C6S2 {
    public float A00;
    public int A01;
    public int A02;
    public ArrayList A06;
    public ArrayList A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final Context A0C;
    public final boolean A0D;
    public Paint A03 = new Paint(1);
    public boolean A05 = true;
    public C6S5 A04 = C6S5.A05;

    public C71065WnN(Context context, ArrayList arrayList, float f, float f2, float f3, float f4, float f5, boolean z) {
        this.A0C = context;
        this.A00 = f;
        this.A07 = arrayList;
        this.A0D = z;
        this.A0B = f2;
        this.A08 = f3;
        this.A09 = f4;
        this.A0A = f5;
        this.A06 = new ArrayList();
        ArrayList A00 = C6S3.A00(this.A07);
        C14360o3.A0C(A00, "null cannot be cast to non-null type java.util.ArrayList<android.graphics.Path>");
        this.A06 = A00;
        this.A03.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A03.setPathEffect(new CornerPathEffect(this.A00));
    }

    public final void A01(List list, float f) {
        this.A07 = (ArrayList) list;
        this.A00 = f / 4.0f;
        ArrayList A00 = C6S3.A00(list);
        C14360o3.A0C(A00, "null cannot be cast to non-null type java.util.ArrayList<android.graphics.Path>");
        this.A06 = A00;
    }

    @Override // X.C6S0
    public final void AQP(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A05) {
            this.A05 = false;
            Paint paint = this.A03;
            paint.setAlpha(255);
            Iterator A13 = AbstractC166997dE.A13(this.A06);
            while (A13.hasNext()) {
                canvas.drawPath((Path) AbstractC166997dE.A0l(A13), paint);
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
        this.A04 = c6s5;
    }

    @Override // X.C6S0
    public final void FCG(Layout layout, Integer num, float f, int i, int i2) {
        C14360o3.A0B(layout, 0);
        ArrayList A02 = AbstractC139126Rt.A02(layout, f * this.A09, f * this.A0B, f * this.A08, this.A00, this.A0A);
        C14360o3.A0C(A02, AbstractC111324zv.A00(245));
        this.A07 = A02;
        this.A00 = f / 4.0f;
        ArrayList A00 = C6S3.A00(A02);
        C14360o3.A0C(A00, "null cannot be cast to non-null type java.util.ArrayList<android.graphics.Path>");
        this.A06 = A00;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final /* synthetic */ boolean onPreDraw() {
        this.A05 = true;
        return true;
    }

    public final void A00(Canvas canvas, Integer num) {
        if (this.A05) {
            this.A05 = false;
            if (num != null) {
                this.A03.setAlpha(num.intValue());
            }
            Iterator A13 = AbstractC166997dE.A13(this.A06);
            while (A13.hasNext()) {
                canvas.drawPath((Path) AbstractC166997dE.A0l(A13), this.A03);
            }
        }
    }

    @Override // X.C6S0
    public final int BgK() {
        return this.A01;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.XCW, java.lang.Object, X.Wih] */
    @Override // X.C6S2
    public final XCW Bz1() {
        int i = this.A01;
        int i2 = this.A02;
        float f = this.A00;
        ArrayList arrayList = this.A07;
        boolean z = this.A0D;
        float f2 = this.A0B;
        float f3 = this.A08;
        float f4 = this.A09;
        float f5 = this.A0A;
        C6S5 c6s5 = this.A04;
        C14360o3.A0B(arrayList, 4);
        ?? obj = new Object();
        obj.A06 = i;
        obj.A05 = i2;
        obj.A01 = f;
        obj.A08 = arrayList;
        obj.A09 = z;
        obj.A04 = f2;
        obj.A00 = f3;
        obj.A02 = f4;
        obj.A03 = f5;
        obj.A07 = c6s5;
        return obj;
    }

    @Override // X.C6S1
    public final /* synthetic */ Integer Bz4() {
        return C05F.A00;
    }

    @Override // X.C6S0
    public final C6S5 C6E() {
        return this.A04;
    }

    @Override // X.C6S0
    public final void ERf(int i, int i2) {
        boolean z = this.A0D;
        if (z) {
            i = AbstractC13950nL.A03(i);
        }
        this.A01 = i;
        if (z) {
            i2 = AbstractC13950nL.A03(i2);
        }
        this.A02 = i2;
        Paint paint = this.A03;
        if (this.A04 == C6S5.A06) {
            i2 = this.A01;
        }
        paint.setColor(i2);
    }
}
