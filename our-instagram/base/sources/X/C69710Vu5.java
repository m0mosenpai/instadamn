package X;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* renamed from: X.Vu5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69710Vu5 {
    public C70154WDd A00;
    public WeakReference A01;
    public float A03;
    public final TextPaint A04 = new TextPaint(1);
    public final VK5 A05 = new C67766Uxh(this);
    public boolean A02 = true;

    public final float A00(String str) {
        float measureText;
        if (!this.A02) {
            return this.A03;
        }
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = this.A04.measureText((CharSequence) str, 0, str.length());
        }
        this.A03 = measureText;
        this.A02 = false;
        return measureText;
    }

    public final void A01(Context context, C70154WDd c70154WDd) {
        if (this.A00 != c70154WDd) {
            this.A00 = c70154WDd;
            if (c70154WDd != null) {
                TextPaint textPaint = this.A04;
                VK5 vk5 = this.A05;
                c70154WDd.A04(context, textPaint, vk5);
                XDC xdc = (XDC) this.A01.get();
                if (xdc != null) {
                    textPaint.drawableState = xdc.getState();
                }
                c70154WDd.A03(context, textPaint, vk5);
                this.A02 = true;
            }
            XDC xdc2 = (XDC) this.A01.get();
            if (xdc2 != null) {
                xdc2.Dsi();
                xdc2.onStateChange(xdc2.getState());
            }
        }
    }

    public C69710Vu5(XDC xdc) {
        this.A01 = new WeakReference(null);
        this.A01 = new WeakReference(xdc);
    }
}
