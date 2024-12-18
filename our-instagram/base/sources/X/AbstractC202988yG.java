package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewTreeObserver;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.8yG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC202988yG extends C6RB implements C74Q, C5RQ, InterfaceC202998yH {
    public int A00;
    public int A01;
    public boolean A02;
    public int A03;
    public final float A04;
    public final Paint A05;
    public final C6RL A06;

    public AbstractC202988yG(Context context, int i) {
        super(context, i);
        Paint paint = new Paint(1);
        this.A05 = paint;
        this.A04 = AbstractC13880nE.A00(context, 5.0f);
        Context context2 = this.A0Z;
        C14360o3.A07(context2);
        this.A06 = AbstractC1572274c.A00(context2, this);
        paint.setColor(context.getColor(R.color.cds_white_a20));
    }

    @Override // X.C74Q
    public final /* synthetic */ void CN0() {
        AbstractC1572274c.A02(this);
    }

    @Override // X.C5RQ
    public final /* synthetic */ void Egu() {
    }

    @Override // X.C6RB, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (A0W() > 0) {
            Spannable spannable = this.A0F;
            C14360o3.A07(spannable);
            if (spannable.length() != 0) {
                if (this.A02) {
                    RectF rectF = new RectF(getBounds());
                    float f = rectF.left;
                    float f2 = this.A04;
                    rectF.left = f - f2;
                    rectF.right += f2;
                    rectF.top -= f2;
                    rectF.bottom += f2;
                    TextPaint textPaint = this.A0b;
                    canvas.drawRoundRect(rectF, textPaint.getTextSize() / 4.0f, textPaint.getTextSize() / 4.0f, this.A05);
                }
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                A0H(canvas);
                TextPaint textPaint2 = this.A0b;
                C14360o3.A07(textPaint2);
                int i = this.A00 - this.A01;
                if (i < 0) {
                    i = 0;
                }
                A0Z(canvas, spannable, textPaint2, A08(), super.A00, super.A01, i);
                canvas.restore();
                this.A06.draw(canvas);
            }
        }
    }

    public float A0U() {
        return 0.0f;
    }

    public float A0V() {
        return 0.0f;
    }

    public EnumC194908jr A0X() {
        if (this instanceof C219769nO) {
            return ((C219769nO) this).A01;
        }
        return ((C219759nN) this).A03;
    }

    public void A0Y() {
        Spannable spannable;
        if ((this instanceof C219769nO) && (spannable = this.A0F) != null && spannable.length() != 0) {
            Spannable spannable2 = this.A0F;
            C14360o3.A07(spannable2);
            C4GL.A05(spannable2, C221459qA.class);
            Spannable spannable3 = this.A0F;
            C14360o3.A07(spannable3);
            C4GL.A05(spannable3, C9TB.class);
        }
    }

    public void A0Z(Canvas canvas, Spannable spannable, TextPaint textPaint, C57482kN c57482kN, float f, float f2, int i) {
        StaticLayout staticLayout;
        int i2;
        Integer num;
        if (this instanceof C219759nN) {
            C219759nN c219759nN = (C219759nN) this;
            C14360o3.A0B(canvas, 0);
            C14360o3.A0B(spannable, 2);
            staticLayout = c219759nN.A0G;
            if (staticLayout != null) {
                List list = c219759nN.A04;
                int i3 = i % CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
                int i4 = c219759nN.A02;
                float floatValue = ((Number) list.get(i3 / i4)).floatValue();
                float f3 = (i % i4) / i4;
                if (floatValue == 0.0f) {
                    num = Integer.valueOf(c219759nN.A01);
                } else {
                    num = null;
                    if (floatValue != 1.0f) {
                        float cos = ((1.0f - ((float) Math.cos((f3 * 2.0f) * 3.141592653589793d))) / 2.0f) * floatValue;
                        floatValue = cos;
                        if (cos < 0.2f) {
                            floatValue = 0.0f;
                        }
                    }
                }
                C9T9 c9t9 = (C9T9) C4GL.A00(spannable, C9T9.class);
                if (c9t9 != null) {
                    c9t9.A04 = Float.valueOf(floatValue * c219759nN.A00);
                    c9t9.A05 = num;
                }
            } else {
                return;
            }
        } else {
            C219769nO c219769nO = (C219769nO) this;
            C14360o3.A0B(canvas, 0);
            staticLayout = c219769nO.A0G;
            if (staticLayout == null) {
                return;
            }
            float f4 = (i % 1000) / 1000.0f;
            TimeInterpolator timeInterpolator = c219769nO.A00;
            C14360o3.A0B(timeInterpolator, 1);
            if (f4 < 0.25f) {
                i2 = -10;
            } else {
                int i5 = 10;
                if (f4 < 0.5f) {
                    i2 = ((int) ((timeInterpolator.getInterpolation((f4 - 0.25f) * 4.0f) * 2.0f) * 10.0f)) - 10;
                } else {
                    if (f4 >= 0.75f) {
                        i5 = 10 - ((int) ((timeInterpolator.getInterpolation((f4 - 0.75f) * 4.0f) * 2.0f) * 10.0f));
                    }
                    i2 = i5;
                }
            }
            Iterator it = c219769nO.A03.iterator();
            while (it.hasNext()) {
                ((ViewTreeObserver.OnPreDrawListener) it.next()).onPreDraw();
            }
            Iterator it2 = c219769nO.A04.iterator();
            while (it2.hasNext()) {
                ((C9TB) it2.next()).A00 = i2;
            }
            Iterator it3 = c219769nO.A02.iterator();
            while (it3.hasNext()) {
                ((C202888y6) it3.next()).A04 = false;
            }
        }
        staticLayout.draw(canvas);
    }

    @Override // X.C74Q
    public final C6RL C5E() {
        return this.A06;
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean Cf3() {
        return false;
    }

    @Override // X.C5RQ
    public void EUp(int i, int i2) {
        this.A00 = i;
        this.A03 = i2;
        invalidateSelf();
    }

    @Override // X.C74Q
    public final void FBl(boolean z, boolean z2) {
        this.A02 = z;
        C6RL c6rl = this.A06;
        if (z2) {
            c6rl.A01();
        } else {
            c6rl.A00();
        }
        invalidateSelf();
    }

    public final int A0W() {
        int durationInMs = getDurationInMs();
        int i = this.A03;
        if (i < 0) {
            i = durationInMs;
        }
        if (i <= 0) {
            return 0;
        }
        int i2 = (int) (i / durationInMs);
        if (i2 <= 1) {
            return i;
        }
        return i / i2;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return AbstractC227039zz.A00(A0X(), this, true, false);
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean CaH(UserSession userSession) {
        return true;
    }

    @Override // X.InterfaceC202998yH
    public final void DtF(int i, int i2) {
        this.A01 = i;
    }
}
