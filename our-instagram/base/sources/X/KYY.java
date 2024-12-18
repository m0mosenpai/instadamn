package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.R;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class KYY extends ULQ {
    public TextPaint A00;
    public TextPaint A01;
    public ImageUrl A02;
    public AbstractC44340Jif A03;
    public int A04;
    public long A05;
    public MQD A06;
    public Integer A07;
    public String A08;
    public String A09;
    public final float A0A;
    public final int A0B;
    public final Context A0C;
    public final RectF A0D;
    public final C71196Wpl A0E;
    public final String A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final float A0J;
    public final Rect A0K;
    public final RectF A0L;

    @Override // X.ULQ
    public final void A0K(ImageUrl imageUrl, String str, String str2) {
        A02(null, imageUrl, str, str2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public KYY(Drawable drawable, C71196Wpl c71196Wpl, C70394WTw c70394WTw, ImageUrl imageUrl, MQD mqd, String str, String str2, String str3, double d, double d2, int i, boolean z, boolean z2, boolean z3) {
        super(c70394WTw);
        this.A0K = AbstractC166987dD.A0U();
        this.A04 = 255;
        this.A07 = C05F.A01;
        this.A0F = str2;
        Context context = c70394WTw.A0G;
        this.A0C = context;
        this.A06 = mqd;
        this.A0E = c71196Wpl;
        this.A0L = AbstractC166987dD.A0X();
        this.A0D = AbstractC166987dD.A0X();
        this.A0J = AbstractC13880nE.A04(context, 4);
        super.A00 = WFW.A01(d2);
        super.A01 = WFW.A00(d);
        this.A0B = i;
        this.A0A = 1.0f;
        this.A0H = z;
        this.A0G = z2;
        this.A0I = z3;
        A02(drawable, imageUrl, str, str3);
    }

    public static Rect A00(KYY kyy) {
        if (kyy.A03 == null) {
            Rect rect = kyy.A0K;
            rect.set(-1, -1, -1, -1);
            return rect;
        }
        WFW wfw = ((AbstractC66278U6y) kyy).A08;
        double d = ((AbstractC66278U6y) kyy).A00;
        double d2 = ((AbstractC66278U6y) kyy).A01;
        float[] fArr = ((AbstractC66278U6y) kyy).A0C;
        wfw.A06(fArr, d, d2);
        float f = fArr[0];
        float f2 = fArr[1];
        Rect bounds = kyy.A03.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        Rect rect2 = kyy.A0K;
        float A02 = AbstractC166987dD.A02(width);
        rect2.set(Math.round(f - A02), Math.round(f2 - height), Math.round(f + A02), Math.round(f2));
        return rect2;
    }

    private void A01() {
        AbstractC44340Jif abstractC44340Jif = this.A03;
        if (abstractC44340Jif != null) {
            abstractC44340Jif.setAlpha(this.A04);
        }
        TextPaint textPaint = this.A00;
        if (textPaint != null) {
            textPaint.setAlpha(this.A04);
        }
        TextPaint textPaint2 = this.A01;
        if (textPaint2 != null) {
            textPaint2.setAlpha(this.A04);
        }
        A05();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A02(Drawable drawable, ImageUrl imageUrl, String str, String str2) {
        int round;
        int round2;
        C46014KYc c46014KYc;
        C46014KYc c46014KYc2;
        this.A09 = str;
        this.A02 = imageUrl;
        this.A08 = str2;
        if ((imageUrl != null || drawable != null) && str != null) {
            AbstractC44340Jif abstractC44340Jif = this.A03;
            if (!(abstractC44340Jif instanceof C46014KYc)) {
                C46014KYc c46014KYc3 = new C46014KYc(this.A0C, drawable, imageUrl, "media_map", this.A0A, this.A0B, this.A0H, this.A0G, this.A0I);
                c46014KYc3.A0E = true;
                c46014KYc3.setCallback(this);
                round = Math.round(c46014KYc3.A03);
                round2 = Math.round(c46014KYc3.A00);
                c46014KYc = c46014KYc3;
                c46014KYc.setBounds(0, 0, round, round2);
                c46014KYc2 = c46014KYc;
            } else {
                C46014KYc c46014KYc4 = (C46014KYc) abstractC44340Jif;
                if (!AbstractC50102Ry.A00(c46014KYc4.A0B, imageUrl)) {
                    c46014KYc4.A0B = imageUrl;
                    if (imageUrl != null) {
                        AbstractC167017dG.A1K(c46014KYc4, C25821No.A00(), imageUrl, "media_map");
                    }
                }
                super.A07.A0I.invalidate();
                A01();
            }
        } else {
            boolean z = this.A0I;
            AbstractC44340Jif abstractC44340Jif2 = this.A03;
            if (z) {
                if (!(abstractC44340Jif2 instanceof C46012KYa)) {
                    C46012KYa c46012KYa = new C46012KYa(this.A0C);
                    c46012KYa.setCallback(this);
                    int i = c46012KYa.A00;
                    c46012KYa.setBounds(0, 0, i, i);
                    c46014KYc2 = c46012KYa;
                }
            } else if (!(abstractC44340Jif2 instanceof C46013KYb)) {
                C46013KYb c46013KYb = new C46013KYb(this.A0C);
                c46013KYb.setCallback(this);
                round = c46013KYb.A08;
                round2 = c46013KYb.A07;
                c46014KYc = c46013KYb;
                c46014KYc.setBounds(0, 0, round, round2);
                c46014KYc2 = c46014KYc;
            }
            super.A07.A0I.invalidate();
            A01();
        }
        this.A03 = c46014KYc2;
        super.A07.A0I.invalidate();
        A01();
    }

    @Override // X.AbstractC66278U6y
    public final int A0A(float f, float f2) {
        return this.A0L.contains(f, f2) ? 1 : 0;
    }

    @Override // X.AbstractC66278U6y
    public final void A0D(Canvas canvas) {
        RectF rectF;
        int min;
        C71196Wpl c71196Wpl;
        Rect A00 = A00(this);
        super.A08.A06(super.A0C, super.A00, super.A01);
        float width = A00.width();
        float height = A00.height();
        float f = A00.left;
        float f2 = A00.top;
        float centerX = A00.centerX();
        float f3 = A00.bottom;
        AbstractC44340Jif abstractC44340Jif = this.A03;
        if (abstractC44340Jif instanceof C46014KYc) {
            rectF = new RectF(((C46014KYc) abstractC44340Jif).A0P);
        } else {
            rectF = new RectF(abstractC44340Jif.getBounds());
        }
        float width2 = rectF.width();
        float height2 = rectF.height();
        this.A0L.set(f, f2, width + f, height + f2);
        RectF rectF2 = this.A0D;
        float f4 = rectF.left + f;
        float f5 = rectF.top + f2;
        rectF2.set(f4, f5, width2 + f4, f5 + height2);
        canvas.save();
        canvas.translate(f, f2);
        this.A03.draw(canvas);
        canvas.restore();
        AbstractC44340Jif abstractC44340Jif2 = this.A03;
        int A02 = abstractC44340Jif2.A02();
        String str = this.A08;
        if (str != null && !(abstractC44340Jif2 instanceof C46012KYa)) {
            if (this.A01 == null) {
                TextPaint textPaint = new TextPaint();
                this.A00 = textPaint;
                textPaint.setFlags(1);
                TextPaint textPaint2 = this.A00;
                Context context = this.A0C;
                AbstractC166987dD.A1N(context, textPaint2, AbstractC53242c7.A0D(context));
                TextPaint textPaint3 = this.A00;
                Paint.Align align = Paint.Align.CENTER;
                textPaint3.setTextAlign(align);
                this.A00.setTextSize(AbstractC166987dD.A04(context.getResources(), R.dimen.autocomplete_dropdown_header_text_size));
                this.A00.setFakeBoldText(true);
                AbstractC43592JPx.A1E(this.A00);
                this.A00.setStrokeWidth(AbstractC167017dG.A07(context));
                TextPaint textPaint4 = new TextPaint();
                this.A01 = textPaint4;
                textPaint4.setFlags(1);
                AbstractC166987dD.A1N(context, this.A01, AbstractC53242c7.A07(context));
                this.A01.setTextAlign(align);
                this.A01.setFakeBoldText(true);
                this.A01.setTextSize(AbstractC166997dE.A04(context, R.dimen.autocomplete_dropdown_header_text_size));
                A01();
            }
            long currentTimeMillis = System.currentTimeMillis() - this.A05;
            if (currentTimeMillis < 300) {
                float f6 = 0.0f;
                float f7 = 255.0f;
                if (this.A07 == C05F.A0C) {
                    f6 = 255.0f;
                    f7 = 0.0f;
                }
                min = Math.min(Math.round(AbstractC13600mm.A02((float) currentTimeMillis, 0.0f, 300.0f, f6, f7)), A02);
            } else {
                if (this.A07 != C05F.A0C) {
                    min = Math.min(A02, this.A04);
                }
                canvas.save();
                canvas.translate(centerX, f3 + this.A0J);
                canvas.drawText(str, 0.0f, 0.0f, this.A00);
                canvas.drawText(str, 0.0f, 0.0f, this.A01);
                c71196Wpl = this.A0E;
                if (c71196Wpl != null && c71196Wpl.A03 > 1) {
                    StaticLayout staticLayout = new StaticLayout(str, this.A00, canvas.getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    String A0t = AbstractC43594JPz.A0t(super.A07.A0G.getResources(), c71196Wpl.A03 - 1, 2131966093);
                    canvas.drawText(A0t, 0.0f, staticLayout.getHeight(), this.A00);
                    canvas.drawText(A0t, 0.0f, staticLayout.getHeight(), this.A01);
                }
                canvas.restore();
            }
            this.A00.setAlpha(min);
            this.A01.setAlpha(min);
            canvas.save();
            canvas.translate(centerX, f3 + this.A0J);
            canvas.drawText(str, 0.0f, 0.0f, this.A00);
            canvas.drawText(str, 0.0f, 0.0f, this.A01);
            c71196Wpl = this.A0E;
            if (c71196Wpl != null) {
                StaticLayout staticLayout2 = new StaticLayout(str, this.A00, canvas.getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                String A0t2 = AbstractC43594JPz.A0t(super.A07.A0G.getResources(), c71196Wpl.A03 - 1, 2131966093);
                canvas.drawText(A0t2, 0.0f, staticLayout2.getHeight(), this.A00);
                canvas.drawText(A0t2, 0.0f, staticLayout2.getHeight(), this.A01);
            }
            canvas.restore();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
    
        if (r2.A03 > 1) goto L10;
     */
    @Override // X.AbstractC66278U6y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0G(float r5, float r6) {
        /*
            r4 = this;
            X.MQD r3 = r4.A06
            if (r3 != 0) goto L6
            r0 = 0
            return r0
        L6:
            X.Wpl r2 = r4.A0E
            if (r2 == 0) goto L18
            int r1 = r2.A03
            r0 = 1
            if (r1 <= r0) goto L18
        Lf:
            java.lang.String r1 = r4.A09
            if (r0 == 0) goto L1a
            boolean r0 = r3.DYn(r2, r4, r1)
            return r0
        L18:
            r0 = 0
            goto Lf
        L1a:
            java.lang.String r0 = r4.A0F
            boolean r0 = r3.DYo(r4, r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KYY.A0G(float, float):boolean");
    }

    @Override // X.ULS
    public final void A0H(float f) {
        this.A04 = AbstractC166987dD.A0A(f, 255.0f);
        A01();
    }

    @Override // X.ULS
    public final void A0I(LatLng latLng) {
        super.A00 = WFW.A01(latLng.A01);
        super.A01 = WFW.A00(latLng.A00);
        A05();
    }

    @Override // X.ULQ
    public final String A0J() {
        return this.A0F;
    }

    @Override // X.ULQ
    public final void A0L(Integer num, boolean z) {
        long j;
        float f;
        Integer num2 = this.A07;
        if (num != num2) {
            this.A07 = num;
            if (z) {
                j = 300;
            } else {
                j = 0;
            }
            AbstractC44340Jif abstractC44340Jif = this.A03;
            if (abstractC44340Jif instanceof C46014KYc) {
                C46014KYc c46014KYc = (C46014KYc) abstractC44340Jif;
                c46014KYc.A0D = num;
                if (AbstractC43592JPx.A03(num, 0) != 1) {
                    f = ((AbstractC44340Jif) c46014KYc).A01;
                } else {
                    f = ((AbstractC44340Jif) c46014KYc).A00;
                }
                if (c46014KYc.A0S && num == C05F.A00) {
                    f *= 1.5f;
                }
                float f2 = f + (c46014KYc.A0H * 2.0f);
                if (f2 != c46014KYc.A02) {
                    c46014KYc.A05 = j;
                    c46014KYc.A02 = f2;
                    c46014KYc.A01 = c46014KYc.A03;
                    if (j == 0) {
                        c46014KYc.A07 = -1L;
                        c46014KYc.A03 = f2;
                    } else {
                        c46014KYc.A07 = System.currentTimeMillis();
                    }
                    C46014KYc.A01(c46014KYc);
                }
            } else if (!(abstractC44340Jif instanceof C46012KYa)) {
                C46013KYb c46013KYb = (C46013KYb) abstractC44340Jif;
                if (c46013KYb.A05 != num) {
                    c46013KYb.A05 = num;
                    c46013KYb.A01 = c46013KYb.A00;
                    c46013KYb.A04 = System.currentTimeMillis();
                    c46013KYb.A03 = j;
                    float f3 = 1.2666317f;
                    if (num.intValue() != 0) {
                        f3 = 1.0f;
                    }
                    c46013KYb.A02 = f3;
                    c46013KYb.invalidateSelf();
                }
            }
            Integer num3 = this.A07;
            Integer num4 = C05F.A0C;
            if (num3 == num4 || num2 == num4) {
                this.A05 = System.currentTimeMillis();
                A05();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        super.A07.A0I.invalidate();
    }
}
