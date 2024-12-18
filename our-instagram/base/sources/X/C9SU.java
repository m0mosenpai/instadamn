package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.facebook.R;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Calendar;

/* renamed from: X.9SU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SU extends Drawable implements InterfaceC202708xo {
    public static final String[] A0E = {"12", RealtimeSubscription.GRAPHQL_MQTT_VERSION, "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    public int A00;
    public int A01;
    public String A02;
    public final Matrix A03;
    public final Paint A04;
    public final float[] A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;

    @Override // X.InterfaceC202708xo
    public final void EVu(String str) {
        C14360o3.A0B(str, 0);
        this.A02 = str;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.save();
        canvas.translate(this.A00, this.A01);
        float f = this.A0A / 2.0f;
        Paint paint = this.A04;
        paint.setColor(this.A0B);
        AbstractC166987dD.A1R(paint);
        canvas.drawCircle(f, f, f, paint);
        paint.setColor(-1);
        float f2 = this.A08;
        float f3 = (0.16f * f) + f2;
        String[] strArr = A0E;
        canvas.drawText(strArr[0], f, f3, paint);
        float[] fArr = this.A05;
        fArr[0] = f;
        fArr[1] = f3;
        Matrix matrix = this.A03;
        matrix.reset();
        matrix.preRotate(30.0f, f, (f2 / 2.0f) + f);
        int i = 1;
        do {
            matrix.mapPoints(fArr);
            canvas.drawText(strArr[i], fArr[0], fArr[1], paint);
            i++;
        } while (i < 12);
        canvas.drawCircle(f, f, this.A07 / 2.0f, paint);
        paint.setStrokeWidth(this.A06);
        float f4 = this.A0D / 60.0f;
        fArr[0] = f;
        fArr[1] = 0.73f * f;
        matrix.reset();
        matrix.preRotate(((this.A0C + f4) / 12.0f) * 360.0f, f, f);
        matrix.mapPoints(fArr);
        canvas.drawLine(f, f, fArr[0], fArr[1], paint);
        fArr[0] = f;
        fArr[1] = 0.55f * f;
        matrix.reset();
        matrix.preRotate(f4 * 360.0f, f, f);
        matrix.mapPoints(fArr);
        canvas.drawLine(f, f, fArr[0], fArr[1], paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        this.A00 = rect.left;
        this.A01 = rect.top;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C9SU(Context context, Resources resources, long j) {
        C14360o3.A0B(resources, 3);
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A04 = A0S;
        this.A03 = AbstractC166987dD.A0Q();
        this.A05 = new float[2];
        int A01 = (int) (AbstractC188878Yd.A01(context) * 0.5f);
        this.A0A = A01;
        this.A09 = A01;
        this.A02 = "";
        float f = A01;
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        RectF rectF = AbstractC13880nE.A01;
        float applyDimension = f / TypedValue.applyDimension(1, 150.0f, displayMetrics);
        float applyDimension2 = TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics()) * applyDimension;
        A0S.setTextAlign(Paint.Align.CENTER);
        A0S.setTypeface(AbstractC167017dG.A0S(context));
        A0S.setStrokeCap(Paint.Cap.ROUND);
        A0S.setTextSize(applyDimension2);
        this.A07 = TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()) * applyDimension;
        this.A06 = TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()) * applyDimension;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        this.A0C = calendar.get(10);
        this.A0D = calendar.get(12);
        this.A0B = resources.getColor(R.color.sticker_subtle_light_background);
        A0S.getTextBounds(RealtimeSubscription.GRAPHQL_MQTT_VERSION, 0, 1, AbstractC166987dD.A0U());
        this.A08 = r2.height();
    }

    @Override // X.InterfaceC202708xo
    public final String getId() {
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A09;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0A;
    }
}
