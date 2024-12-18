package X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.7jX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170807jX {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public Path A0E;
    public boolean A0F;
    public int[] A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final Paint A0J;
    public final RectF A0K = new RectF();

    public C170807jX() {
        Paint paint = new Paint();
        this.A0J = paint;
        Paint paint2 = new Paint();
        this.A0H = paint2;
        Paint paint3 = new Paint();
        this.A0I = paint3;
        this.A04 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 0.0f;
        this.A08 = 5.0f;
        this.A00 = 1.0f;
        this.A09 = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }
}
