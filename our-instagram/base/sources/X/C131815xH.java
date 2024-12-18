package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.style.ReplacementSpan;
import android.view.View;
import com.facebook.common.callercontext.ContextChain;

/* renamed from: X.5xH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131815xH extends ReplacementSpan implements Drawable.Callback {
    public static final ContextChain A07 = new ContextChain(null, "i", "BloksRichTextImageSpan");
    public View A00;
    public InterfaceC16820sZ A01;
    public final Resources A02;
    public final InterfaceC59242nQ A03;
    public final Q44 A04;
    public final C6FG A05;
    public final C102884kP A06;

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C14360o3.A0B(canvas, 0);
        C14360o3.A0B(paint, 8);
        this.A04.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C14360o3.A0B(paint, 0);
        return this.A04.getSize(paint, charSequence, i, i2, fontMetricsInt);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C14360o3.A0B(runnable, 1);
        View view = this.A00;
        if (view != null) {
            view.postDelayed(runnable, j - SystemClock.uptimeMillis());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C14360o3.A0B(runnable, 1);
        View view = this.A00;
        if (view != null) {
            view.removeCallbacks(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        View view = this.A00;
        if (view != null) {
            view.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C131815xH(Rect rect, C6FG c6fg, C102884kP c102884kP, int i, int i2) {
        InterfaceC59242nQ interfaceC59242nQ = (InterfaceC59242nQ) C59232nO.A00().AM5();
        C14360o3.A0B(interfaceC59242nQ, 6);
        Resources resources = c6fg.A00.getResources();
        C14360o3.A07(resources);
        Drawable drawable = (Drawable) interfaceC59242nQ;
        R8G r8g = new R8G(rect, drawable, i2, i);
        this.A02 = resources;
        this.A03 = interfaceC59242nQ;
        this.A04 = r8g;
        drawable.setCallback(this);
        this.A05 = c6fg;
        this.A06 = c102884kP;
    }
}
