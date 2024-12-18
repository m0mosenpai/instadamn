package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class WVW implements XGp {
    public int A00;
    public int A01;
    public int A02;
    public Rect A03;
    public C68673Va9 A04;
    public final Matrix A05;
    public final Paint A06;
    public final Path A07;
    public final XEQ A08;
    public final InterfaceC71971XDd A09;
    public final C69603Vs6 A0A;
    public final boolean A0B;
    public final float[] A0C;
    public final Bitmap.Config A0D;
    public final InterfaceC71970XDc A0E;
    public final C69269Vkd A0F;
    public final AbstractC27691Vx A0G;

    public WVW(InterfaceC71970XDc interfaceC71970XDc, XEQ xeq, InterfaceC71971XDd interfaceC71971XDd, C69269Vkd c69269Vkd, C69603Vs6 c69603Vs6, C59182nJ c59182nJ, AbstractC27691Vx abstractC27691Vx, boolean z) {
        float[] fArr;
        C14360o3.A0B(abstractC27691Vx, 1);
        this.A0G = abstractC27691Vx;
        this.A08 = xeq;
        this.A0E = interfaceC71970XDc;
        this.A0A = c69603Vs6;
        this.A0B = z;
        this.A09 = interfaceC71971XDd;
        this.A0F = c69269Vkd;
        if (c59182nJ != null) {
            float f = c59182nJ.A00;
            if (f == 0.0f) {
                fArr = c59182nJ.A03;
            } else {
                fArr = new float[8];
                Arrays.fill(fArr, 0, 8, f);
            }
        } else {
            fArr = null;
        }
        this.A0C = fArr;
        this.A0D = Bitmap.Config.ARGB_8888;
        this.A06 = new Paint(6);
        this.A07 = new Path();
        this.A05 = new Matrix();
        this.A02 = -1;
        A00();
    }

    private final boolean A02(Canvas canvas, int i, int i2) {
        C1VO Ajc;
        C1VO c1vo;
        C1VO c1vo2 = null;
        try {
            boolean z = false;
            int i3 = 1;
            if (this.A0B) {
                InterfaceC71971XDd interfaceC71971XDd = this.A09;
                if (interfaceC71971XDd != null) {
                    c1vo = interfaceC71971XDd.AgA(i, canvas.getWidth(), canvas.getHeight());
                    if (c1vo != null) {
                        try {
                            if (c1vo.A05()) {
                                A01((Bitmap) c1vo.A04(), canvas, i);
                                c1vo.close();
                                return true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c1vo2 = c1vo;
                            C1VO.A01(c1vo2);
                            throw th;
                        }
                    }
                    interfaceC71971XDd.E5i(null, canvas.getWidth(), canvas.getHeight());
                } else {
                    c1vo = null;
                }
                C1VO.A01(c1vo);
                return false;
            }
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        Ajc = this.A08.B4L(i);
                        z = A03(canvas, Ajc, i, 3);
                        i3 = -1;
                    } else {
                        try {
                            Ajc = this.A0G.A00(this.A0D, this.A01, this.A00);
                            if (Ajc.A05()) {
                                if (!this.A0A.A00((Bitmap) Ajc.A04(), i)) {
                                    Ajc.close();
                                } else if (A03(canvas, Ajc, i, 2)) {
                                    z = true;
                                }
                            }
                            i3 = 3;
                        } catch (RuntimeException e) {
                            C0I3 c0i3 = C0I2.A00;
                            if (!c0i3.isLoggable(5)) {
                                return false;
                            }
                            c0i3.w(WVW.class.getSimpleName(), "Failed to create frame bitmap", e);
                            return false;
                        }
                    }
                } else {
                    Ajc = this.A08.AgB(i, this.A01, this.A00);
                    if (Ajc != null && Ajc.A05()) {
                        if (!this.A0A.A00((Bitmap) Ajc.A04(), i)) {
                            Ajc.close();
                        } else if (A03(canvas, Ajc, i, 1)) {
                            z = true;
                        }
                    }
                    i3 = 2;
                }
            } else {
                Ajc = this.A08.Ajc(i);
                z = A03(canvas, Ajc, i, 0);
            }
            C1VO.A01(Ajc);
            if (!z && i3 != -1) {
                return A02(canvas, i, i3);
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // X.XGp
    public final boolean AQi(Canvas canvas, Drawable drawable, int i) {
        C69269Vkd c69269Vkd;
        InterfaceC71971XDd interfaceC71971XDd;
        C14360o3.A0B(canvas, 1);
        boolean A02 = A02(canvas, i, 0);
        if (!this.A0B && (c69269Vkd = this.A0F) != null && (interfaceC71971XDd = this.A09) != null) {
            interfaceC71971XDd.E5j(this, this.A08, c69269Vkd, null, i);
        }
        return A02;
    }

    private final void A00() {
        int i;
        C69603Vs6 c69603Vs6 = this.A0A;
        int width = c69603Vs6.A00.A06.getWidth();
        this.A01 = width;
        int i2 = -1;
        if (width == -1) {
            Rect rect = this.A03;
            if (rect != null) {
                i = rect.width();
            } else {
                i = -1;
            }
            this.A01 = i;
        }
        int height = c69603Vs6.A00.A06.getHeight();
        this.A00 = height;
        if (height == -1) {
            Rect rect2 = this.A03;
            if (rect2 != null) {
                i2 = rect2.height();
            }
            this.A00 = i2;
        }
    }

    private final void A01(Bitmap bitmap, Canvas canvas, int i) {
        Rect rect = this.A03;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.A06);
            return;
        }
        float width = rect.width();
        float height = rect.height();
        float[] fArr = this.A0C;
        if (fArr == null) {
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.A06);
            return;
        }
        if (i != this.A02) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            RectF rectF = new RectF(0.0f, 0.0f, this.A01, this.A00);
            RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
            Matrix matrix = this.A05;
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            bitmapShader.setLocalMatrix(matrix);
            this.A06.setShader(bitmapShader);
            this.A07.addRoundRect(new RectF(0.0f, 0.0f, width, height), fArr, Path.Direction.CW);
            this.A02 = i;
        }
        canvas.drawPath(this.A07, this.A06);
    }

    private final boolean A03(Canvas canvas, C1VO c1vo, int i, int i2) {
        if (c1vo != null && c1vo.A05()) {
            A01((Bitmap) c1vo.A04(), canvas, i);
            if (i2 != 3 && !this.A0B) {
                this.A08.DIQ(c1vo, i, i2);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC71970XDc
    public final int B8b(int i) {
        return this.A0E.B8b(i);
    }

    @Override // X.XGp
    public final int BJF() {
        return this.A00;
    }

    @Override // X.XGp
    public final int BJI() {
        return this.A01;
    }

    @Override // X.InterfaceC71970XDc
    public final int BPM() {
        return this.A0E.BPM();
    }

    @Override // X.XGp
    public final void EPb(int i) {
        this.A06.setAlpha(i);
    }

    @Override // X.XGp
    public final void EQS(Rect rect) {
        this.A03 = rect;
        C69603Vs6 c69603Vs6 = this.A0A;
        C70163WEd c70163WEd = c69603Vs6.A00;
        if (!C70163WEd.A01(rect, c70163WEd.A06).equals(c70163WEd.A05)) {
            c70163WEd = new C70163WEd(rect, c70163WEd.A07, c70163WEd.A08, c70163WEd.A09);
        }
        if (c70163WEd != c69603Vs6.A00) {
            c69603Vs6.A00 = c70163WEd;
            c69603Vs6.A01 = new WEQ(c69603Vs6.A03, c70163WEd, c69603Vs6.A04);
        }
        A00();
    }

    @Override // X.XGp
    public final void ERi(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
    }

    @Override // X.InterfaceC71970XDc
    public final int getFrameCount() {
        return this.A0E.getFrameCount();
    }

    @Override // X.InterfaceC71970XDc
    public final int getLoopCount() {
        return this.A0E.getLoopCount();
    }

    @Override // X.XGp
    public final void EPi(C68673Va9 c68673Va9) {
        this.A04 = c68673Va9;
    }
}
