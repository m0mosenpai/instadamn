package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.facebook.R;
import com.instagram.arlink.model.ArLinkCandidate;
import com.instagram.arlink.model.ArLinkTextBox;
import java.util.List;

/* renamed from: X.Jju, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44413Jju extends View {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Paint A05;
    public Paint A06;
    public Paint A07;
    public String A08;
    public float A09;
    public float A0A;
    public final Point A0B;
    public final Rect A0C;
    public final RectF A0D;
    public final Object A0E;
    public final java.util.Set A0F;
    public final RectF A0G;
    public final List A0H;

    private RectF A00(Point point, RectF rectF) {
        RectF rectF2 = this.A0G;
        rectF2.set(AbstractC166987dD.A07(this) - ((rectF.centerY() + (point.y / 2.0f)) * this.A09), (rectF.centerX() - (point.x / 2.0f)) * this.A0A, AbstractC166987dD.A07(this) - ((rectF.centerY() - (point.y / 2.0f)) * this.A09), (rectF.centerX() + (point.x / 2.0f)) * this.A0A);
        return rectF2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r1 > 3) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCandidates(java.util.List r7) {
        /*
            r6 = this;
            java.lang.Object r2 = r6.A0E
            monitor-enter(r2)
            java.util.List r4 = r6.A0H     // Catch: java.lang.Throwable -> L86
            r4.clear()     // Catch: java.lang.Throwable -> L86
            java.util.Iterator r3 = r7.iterator()     // Catch: java.lang.Throwable -> L86
        Lc:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L86
            r5 = 1065017672(0x3f7ae148, float:0.98)
            if (r0 == 0) goto L2d
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L86
            com.instagram.arlink.model.ArLinkCandidate r1 = (com.instagram.arlink.model.ArLinkCandidate) r1     // Catch: java.lang.Throwable -> L86
            float r0 = r1.mConfidenceScore     // Catch: java.lang.Throwable -> L86
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto Lc
            java.util.List r0 = r1.mTextBoxes     // Catch: java.lang.Throwable -> L86
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L86
            if (r0 != 0) goto Lc
            r4.add(r1)     // Catch: java.lang.Throwable -> L86
            goto Lc
        L2d:
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L86
            r3 = 0
            if (r0 == 0) goto L3d
            int r1 = r6.A01     // Catch: java.lang.Throwable -> L86
            int r0 = r1 + 1
            r6.A01 = r0     // Catch: java.lang.Throwable -> L86
            r0 = 3
            if (r1 <= r0) goto L44
        L3d:
            r6.A01 = r3     // Catch: java.lang.Throwable -> L86
            java.util.Set r0 = r6.A0F     // Catch: java.lang.Throwable -> L86
            r0.clear()     // Catch: java.lang.Throwable -> L86
        L44:
            java.util.Set r0 = r6.A0F     // Catch: java.lang.Throwable -> L86
            r0.addAll(r4)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = r6.A08     // Catch: java.lang.Throwable -> L86
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L73
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L73
            boolean r0 = r7.isEmpty()     // Catch: java.lang.Throwable -> L86
            if (r0 != 0) goto L73
            java.lang.Object r0 = r7.get(r3)     // Catch: java.lang.Throwable -> L86
            com.instagram.arlink.model.ArLinkCandidate r0 = (com.instagram.arlink.model.ArLinkCandidate) r0     // Catch: java.lang.Throwable -> L86
            float r1 = r0.mConfidenceScore     // Catch: java.lang.Throwable -> L86
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L73
            java.lang.String r0 = "Low detection score: "
            java.lang.String r0 = X.AnonymousClass001.A0N(r0, r1)     // Catch: java.lang.Throwable -> L86
            r6.A08 = r0     // Catch: java.lang.Throwable -> L86
            r6.A02 = r3     // Catch: java.lang.Throwable -> L86
        L73:
            int r1 = r6.A02     // Catch: java.lang.Throwable -> L86
            int r0 = r1 + 1
            r6.A02 = r0     // Catch: java.lang.Throwable -> L86
            r0 = 5
            if (r1 <= r0) goto L81
            r6.A02 = r3     // Catch: java.lang.Throwable -> L86
            r0 = 0
            r6.A08 = r0     // Catch: java.lang.Throwable -> L86
        L81:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L86
            r6.postInvalidate()
            return
        L86:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L86
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44413Jju.setCandidates(java.util.List):void");
    }

    public void setMessage(String str) {
        synchronized (this.A0E) {
            this.A08 = str;
            this.A02 = 0;
        }
        postInvalidate();
    }

    public C44413Jju(Context context) {
        super(context);
        this.A0E = new Object();
        this.A0F = AbstractC166987dD.A1H();
        this.A0H = AbstractC166987dD.A1E();
        this.A0B = new Point();
        this.A0C = AbstractC166987dD.A0U();
        this.A0G = AbstractC166987dD.A0X();
        this.A0D = AbstractC166987dD.A0X();
        this.A0A = 1.0f;
        this.A09 = 1.0f;
        Paint A0R = AbstractC166987dD.A0R();
        this.A05 = A0R;
        A0R.setColor(-1);
        AbstractC43592JPx.A1E(this.A05);
        this.A05.setStrokeWidth(4.0f);
        this.A00 = AbstractC13880nE.A04(getContext(), 60);
        Resources resources = getResources();
        float applyDimension = TypedValue.applyDimension(0, AbstractC166987dD.A04(resources, R.dimen.auth_title_text_size), resources.getDisplayMetrics());
        Paint A0R2 = AbstractC166987dD.A0R();
        this.A07 = A0R2;
        A0R2.setColor(-1);
        this.A07.setTextSize(applyDimension);
        this.A07.setTextAlign(Paint.Align.RIGHT);
        Paint A0R3 = AbstractC166987dD.A0R();
        this.A06 = A0R3;
        A0R3.setColor(1308622847);
        AbstractC166987dD.A1R(this.A06);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        synchronized (this.A0E) {
            for (ArLinkCandidate arLinkCandidate : this.A0F) {
                float rotationDegree = arLinkCandidate.getRotationDegree();
                RectF rectF = arLinkCandidate.mIconRect;
                double radians = Math.toRadians(rotationDegree);
                double width = ((rectF.width() + rectF.height()) * 0.5f) / (Math.abs(Math.sin(radians)) + Math.abs(Math.cos(radians)));
                Point point = this.A0B;
                int i = (int) width;
                point.x = i;
                point.y = i;
                RectF A00 = A00(point, arLinkCandidate.mIconRect);
                canvas.save();
                float f = -rotationDegree;
                canvas.rotate(f, A00.centerX(), A00.centerY());
                Paint paint = this.A05;
                canvas.drawRoundRect(A00, 10.0f, 10.0f, paint);
                canvas.restore();
                for (ArLinkTextBox arLinkTextBox : arLinkCandidate.mTextBoxes) {
                    RectF A002 = A00(arLinkTextBox.mSize, arLinkTextBox.mTextRect);
                    canvas.save();
                    canvas.rotate(f, A002.centerX(), A002.centerY());
                    canvas.drawRoundRect(A002, 10.0f, 10.0f, paint);
                    canvas.restore();
                }
            }
            if (!TextUtils.isEmpty(this.A08)) {
                Paint paint2 = this.A07;
                String str = this.A08;
                paint2.getTextBounds(str, 0, str.length(), this.A0C);
                RectF rectF2 = this.A0D;
                float f2 = this.A00;
                rectF2.set((canvas.getWidth() - r7.width()) / 2.0f, f2, (canvas.getWidth() + r7.width()) / 2.0f, r7.height() + f2);
                rectF2.inset(-20.0f, -20.0f);
                canvas.drawRoundRect(rectF2, 10.0f, 10.0f, this.A06);
                canvas.drawText(this.A08, rectF2.right - 20.0f, rectF2.top + r7.height() + 20.0f, paint2);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int A06 = C0f9.A06(1483202377);
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0 && (i5 = this.A04) > 0 && (i6 = this.A03) > 0) {
            this.A0A = i2 / i5;
            this.A09 = i / i6;
        }
        C0f9.A0D(-1934120236, A06);
    }
}
