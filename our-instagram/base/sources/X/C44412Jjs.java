package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.SizeF;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Jjs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44412Jjs extends View {
    public static final float[] A0C;
    public static final int[] A0D;
    public static final int[] A0E;
    public static final SizeF A0F;
    public static final List A0G;
    public static final float[] A0H;
    public static final int[] A0I;
    public float A00;
    public final Paint A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final ValueAnimator A05;
    public final ValueAnimator A06;
    public final Matrix A07;
    public final Paint A08;
    public final Path A09;
    public final PointF A0A;
    public final RectF A0B;

    static {
        List A1Q = AbstractC16960so.A1Q(new C47799L9h(AbstractC16830sb.A07(AbstractC25227BEk.A0p(), 1, 3, 5, 7, 8, 11, 12, 14, 16, 17, 18), 50.166668f, 0.70382804f), new C47799L9h(AbstractC16830sb.A07(3, 6, 9, 15, 19), 56.666668f, 0.5319006f), new C47799L9h(C16910sj.A00, 63.0f, 0.4513096f));
        A0G = A1Q;
        A0F = new SizeF((((C47799L9h) AbstractC001800i.A0K(A1Q)).A01.A03.getWidth() + 7.445f) * 1.03f, (((C47799L9h) AbstractC001800i.A0K(A1Q)).A01.A03.getHeight() + 7.445f) * 1.03f);
        A0C = new float[]{0.0f, 0.24f, 0.73f, 1.0f};
        A0D = new int[]{Color.parseColor("#FF74D7"), Color.parseColor("#015CF3"), Color.parseColor("#1D5FF0"), Color.parseColor("#08F2E0")};
        A0E = new int[]{Color.parseColor("#08F2E0"), Color.parseColor("#015CF3"), Color.parseColor("#FF74D7"), Color.parseColor("#1D5FF0")};
        A0H = new float[]{0.0f, 0.92f, 0.96f, 1.0f};
        A0I = new int[]{Color.parseColor("#00FFFFFF"), Color.parseColor("#00FFFFFF"), Color.parseColor("#B3FFFFFF"), Color.parseColor("#FFFFFFFF")};
    }

    public C44412Jjs(Context context) {
        super(context, null);
        this.A09 = new Path(AbstractC47203Ktc.A00);
        this.A0B = AbstractC166987dD.A0X();
        this.A07 = AbstractC166987dD.A0Q();
        this.A0A = new PointF();
        this.A00 = 1.0f;
        Paint A0S = AbstractC166987dD.A0S(1);
        Paint.Style style = Paint.Style.FILL;
        A0S.setStyle(style);
        AbstractC166997dE.A1D(A0S, PorterDuff.Mode.SRC_ATOP);
        this.A08 = A0S;
        Paint A0S2 = AbstractC166987dD.A0S(1);
        A0S2.setStyle(style);
        AbstractC166997dE.A1D(A0S2, PorterDuff.Mode.SRC_IN);
        this.A01 = A0S2;
        List list = A0G;
        int size = list.size();
        ArrayList A17 = AbstractC25225BEi.A17(size);
        for (int i = 0; i < size; i++) {
            A17.add(Float.valueOf(0.5f));
        }
        this.A03 = A17;
        int size2 = list.size();
        ArrayList A172 = AbstractC25225BEi.A17(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            A172.add(Float.valueOf(0.0f));
        }
        this.A04 = A172;
        int size3 = list.size();
        ArrayList A173 = AbstractC25225BEi.A17(size3);
        for (int i3 = 0; i3 < size3; i3++) {
            A173.add(Float.valueOf(0.0f));
        }
        this.A02 = A173;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(2500L);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        C44249Jgt.A00(ofFloat, new ArgbEvaluator(), this, 14);
        this.A05 = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 6.2831855f);
        ofFloat2.setDuration(1500L);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(1);
        AbstractC43592JPx.A1A(ofFloat2);
        LMA.A01(ofFloat2, this, 36);
        this.A06 = ofFloat2;
        ofFloat.start();
        ofFloat2.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r34) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44412Jjs.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1496283814);
        super.onSizeChanged(i, i2, i3, i4);
        this.A00 = AbstractC166987dD.A07(this) / A0F.getWidth();
        float height = (getHeight() * 3) / 4.0f;
        Paint paint = this.A01;
        float A08 = AbstractC166987dD.A08(this) - height;
        float A07 = AbstractC166987dD.A07(this) - height;
        int[] iArr = A0D;
        float[] fArr = A0C;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new LinearGradient(height, A08, A07, height, iArr, fArr, tileMode));
        this.A08.setShader(new RadialGradient(AbstractC166987dD.A07(this) / 2.0f, AbstractC166987dD.A08(this) / 2.0f, AbstractC166987dD.A07(this) / 2.0f, A0I, A0H, tileMode));
        C0f9.A0D(1745986600, A06);
    }
}
