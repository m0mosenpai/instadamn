package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;

/* renamed from: X.WEd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70163WEd {
    public Bitmap A00;
    public final int A01;
    public final Paint A02;
    public final Rect A05;
    public final InterfaceC71992XEf A06;
    public final C68675VaB A07;
    public final VMQ A08;
    public final boolean A09;
    public final int[] A0A;
    public final C69323VlV[] A0B;
    public final Rect A04 = new Rect();
    public final Rect A03 = new Rect();

    public static synchronized Bitmap A00(C70163WEd c70163WEd, int i, int i2) {
        Bitmap bitmap;
        synchronized (c70163WEd) {
            Bitmap bitmap2 = c70163WEd.A00;
            if (bitmap2 != null && (bitmap2.getWidth() < i || c70163WEd.A00.getHeight() < i2)) {
                Bitmap bitmap3 = c70163WEd.A00;
                if (bitmap3 != null) {
                    bitmap3.recycle();
                    c70163WEd.A00 = null;
                }
            }
            Bitmap bitmap4 = c70163WEd.A00;
            if (bitmap4 == null) {
                bitmap4 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                c70163WEd.A00 = bitmap4;
            }
            bitmap4.eraseColor(0);
            bitmap = c70163WEd.A00;
        }
        return bitmap;
    }

    public static Rect A01(Rect rect, InterfaceC71992XEf interfaceC71992XEf) {
        int min;
        int min2;
        if (rect == null) {
            min = interfaceC71992XEf.getWidth();
            min2 = interfaceC71992XEf.getHeight();
        } else {
            min = Math.min(rect.width(), interfaceC71992XEf.getWidth());
            min2 = Math.min(rect.height(), interfaceC71992XEf.getHeight());
        }
        return new Rect(0, 0, min, min2);
    }

    public final void A03(Canvas canvas, int i) {
        int width;
        int height;
        int xOffset;
        int yOffset;
        InterfaceC71992XEf interfaceC71992XEf = this.A06;
        XEH frame = interfaceC71992XEf.getFrame(i);
        try {
            if (frame.getWidth() > 0 && frame.getHeight() > 0) {
                if (interfaceC71992XEf.doesRenderSupportScaling()) {
                    Rect rect = this.A05;
                    double width2 = rect.width() / interfaceC71992XEf.getWidth();
                    double height2 = rect.height() / interfaceC71992XEf.getHeight();
                    int round = (int) Math.round(frame.getWidth() * width2);
                    int round2 = (int) Math.round(frame.getHeight() * height2);
                    int xOffset2 = (int) (frame.getXOffset() * width2);
                    int yOffset2 = (int) (frame.getYOffset() * height2);
                    synchronized (this) {
                        try {
                            int width3 = rect.width();
                            int height3 = rect.height();
                            A00(this, width3, height3);
                            Bitmap bitmap = this.A00;
                            if (bitmap != null) {
                                frame.renderFrame(round, round2, bitmap);
                            }
                            Rect rect2 = this.A04;
                            rect2.set(0, 0, width3, height3);
                            Rect rect3 = this.A03;
                            rect3.set(xOffset2, yOffset2, width3 + xOffset2, height3 + yOffset2);
                            Bitmap bitmap2 = this.A00;
                            if (bitmap2 != null) {
                                canvas.drawBitmap(bitmap2, rect2, rect3, (Paint) null);
                            }
                        } finally {
                        }
                    }
                } else {
                    if (this.A09) {
                        float max = Math.max(frame.getWidth() / Math.min(frame.getWidth(), canvas.getWidth()), frame.getHeight() / Math.min(frame.getHeight(), canvas.getHeight()));
                        width = (int) (frame.getWidth() / max);
                        height = (int) (frame.getHeight() / max);
                        xOffset = (int) (frame.getXOffset() / max);
                        yOffset = (int) (frame.getYOffset() / max);
                    } else {
                        width = frame.getWidth();
                        height = frame.getHeight();
                        xOffset = frame.getXOffset();
                        yOffset = frame.getYOffset();
                    }
                    synchronized (this) {
                        try {
                            Bitmap A00 = A00(this, width, height);
                            this.A00 = A00;
                            frame.renderFrame(width, height, A00);
                            canvas.save();
                            canvas.translate(xOffset, yOffset);
                            canvas.drawBitmap(this.A00, 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } finally {
            frame.dispose();
        }
    }

    public static void A02(Canvas canvas, C69323VlV c69323VlV, C70163WEd c70163WEd, float f, float f2) {
        if (c69323VlV.A04 == VCZ.DISPOSE_TO_BACKGROUND) {
            int ceil = (int) Math.ceil(c69323VlV.A01 * f);
            int ceil2 = (int) Math.ceil(c69323VlV.A00 * f2);
            int ceil3 = (int) Math.ceil(c69323VlV.A02 * f);
            int ceil4 = (int) Math.ceil(c69323VlV.A03 * f2);
            canvas.drawRect(new Rect(ceil3, ceil4, ceil + ceil3, ceil2 + ceil4), c70163WEd.A02);
        }
    }

    public C70163WEd(Rect rect, C68675VaB c68675VaB, VMQ vmq, boolean z) {
        this.A08 = vmq;
        this.A07 = c68675VaB;
        InterfaceC71992XEf interfaceC71992XEf = c68675VaB.A00;
        this.A06 = interfaceC71992XEf;
        int[] frameDurations = interfaceC71992XEf.getFrameDurations();
        this.A0A = frameDurations;
        C14360o3.A0B(frameDurations, 0);
        int length = frameDurations.length;
        for (int i = 0; i < length; i++) {
            if (frameDurations[i] < 11) {
                frameDurations[i] = 100;
            }
        }
        int i2 = 0;
        for (int i3 : frameDurations) {
            i2 += i3;
        }
        this.A01 = i2;
        for (int i4 = 0; i4 < length; i4++) {
        }
        this.A05 = A01(rect, interfaceC71992XEf);
        this.A09 = z;
        this.A0B = new C69323VlV[interfaceC71992XEf.getFrameCount()];
        for (int i5 = 0; i5 < this.A06.getFrameCount(); i5++) {
            this.A0B[i5] = this.A06.getFrameInfo(i5);
        }
        Paint paint = new Paint();
        this.A02 = paint;
        AbstractC166997dE.A1D(paint, PorterDuff.Mode.CLEAR);
    }
}
