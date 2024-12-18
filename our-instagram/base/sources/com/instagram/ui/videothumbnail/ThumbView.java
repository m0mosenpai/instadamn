package com.instagram.ui.videothumbnail;

import X.AbstractC166987dD;
import X.C006802i;
import X.C14360o3;
import X.C2CF;
import X.C2CG;
import X.C41584IaX;
import X.JHW;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class ThumbView extends View implements JHW {
    public int A00;
    public int A01;
    public Bitmap A02;
    public Rect A03;
    public C41584IaX A04;
    public boolean A05;
    public int A06;
    public final Path A07;
    public final Rect A08;
    public final RectF A09;

    @Override // X.JHW
    public final void Dsz(int i, int i2) {
    }

    public static void A00(ThumbView thumbView) {
        C41584IaX c41584IaX = thumbView.A04;
        if (c41584IaX != null) {
            C006802i c006802i = C006802i.A0p;
            C14360o3.A07(c006802i);
            String str = c41584IaX.A01.A0G;
            int i = thumbView.A01;
            int i2 = thumbView.A06;
            long j = c41584IaX.A00;
            C2CG c2cg = C2CF.A0D;
            int hashCode = str.hashCode();
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("number_of_seeks", String.valueOf(i));
            A1G.put("number_of_thumbs_served", String.valueOf(i2));
            A1G.put("number_of_thumbnail_errors", String.valueOf(0));
            A1G.put("max_thumbnail_delay", String.valueOf(j));
            c2cg.A03(1900591, hashCode, A1G);
            c006802i.markerEnd(1900591, hashCode, (short) 2);
            c41584IaX.A00 = 0L;
        }
        thumbView.A06 = 0;
        thumbView.A01 = 0;
    }

    @Override // X.JHW
    public final void Elm(Bitmap bitmap, Rect rect, double d, int i, int i2) {
        this.A02 = bitmap;
        this.A03 = rect;
        this.A06++;
    }

    public C41584IaX getThumbnailController() {
        return this.A04;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Rect rect = this.A08;
        rect.set(0, 0, canvas.getWidth(), canvas.getHeight());
        if (this.A00 > 0) {
            RectF rectF = this.A09;
            rectF.set(rect);
            Path path = this.A07;
            path.rewind();
            float f = this.A00;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.clipPath(path);
        }
        Rect rect2 = this.A03;
        Bitmap bitmap = this.A02;
        if (bitmap != null && rect2 != null) {
            canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
        }
        super.onDraw(canvas);
        postInvalidate();
    }

    public void setScrubberThumbnailCallback(JHW jhw) {
        C41584IaX c41584IaX = this.A04;
        if (c41584IaX != null) {
            c41584IaX.A03.add(jhw);
        }
    }

    public ThumbView(Context context) {
        super(context);
        this.A08 = AbstractC166987dD.A0U();
        this.A09 = new RectF();
        this.A07 = new Path();
    }

    public void setBitmap(Bitmap bitmap) {
        this.A02 = bitmap;
    }

    public void setSrcRect(Rect rect) {
        this.A03 = rect;
    }

    public void setThumbRoundRadius(int i) {
        this.A00 = i;
    }

    public ThumbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A08 = AbstractC166987dD.A0U();
        this.A09 = new RectF();
        this.A07 = new Path();
    }

    public ThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A08 = AbstractC166987dD.A0U();
        this.A09 = new RectF();
        this.A07 = new Path();
    }
}
