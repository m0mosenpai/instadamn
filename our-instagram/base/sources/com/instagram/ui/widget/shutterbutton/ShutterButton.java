package com.instagram.ui.widget.shutterbutton;

import X.AbstractC001800i;
import X.AbstractC13550mh;
import X.AbstractC13560mi;
import X.AbstractC13600mm;
import X.AbstractC13630mp;
import X.AbstractC13880nE;
import X.AbstractC183338Bg;
import X.AbstractC55922hc;
import X.AbstractC70163Da;
import X.C05F;
import X.C0f9;
import X.C131425wZ;
import X.C131485wf;
import X.C14360o3;
import X.C184778Hs;
import X.C55942hf;
import X.C55982hj;
import X.C8I0;
import X.C8I4;
import X.C8I5;
import X.C8I6;
import X.C8I8;
import X.EnumC131445wb;
import X.InterfaceC131415wY;
import X.InterfaceC131505wh;
import X.InterfaceC184788Ht;
import X.InterfaceC184808Hv;
import X.InterfaceC184828Hx;
import X.InterfaceC55932he;
import X.YN5;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class ShutterButton extends View implements InterfaceC55932he, InterfaceC131415wY {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public long A08;
    public long A09;
    public Shader A0A;
    public Handler A0B;
    public EnumC131445wb A0C;
    public C8I4 A0D;
    public C8I0 A0E;
    public InterfaceC131505wh A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public float A0J;
    public float A0K;
    public float A0L;
    public float A0M;
    public float A0N;
    public int A0O;
    public int A0P;
    public Shader A0Q;
    public Shader A0R;
    public Drawable A0S;
    public YN5 A0T;
    public final Matrix A0U;
    public final Paint A0V;
    public final Paint A0W;
    public final Paint A0X;
    public final Paint A0Y;
    public final Paint A0Z;
    public final Rect A0a;
    public final RectF A0b;
    public final RectF A0c;
    public final TextPaint A0d;
    public final Choreographer.FrameCallback A0e;
    public final Choreographer A0f;
    public final C55982hj A0g;
    public final C131485wf A0h;
    public final C131425wZ A0i;
    public final InterfaceC131505wh A0j;
    public final Runnable A0k;
    public final Runnable A0l;
    public final int[] A0m;
    public final Paint A0n;
    public final Paint A0o;
    public final Paint A0p;
    public final Drawable A0q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShutterButton(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    public final void A03(Integer num) {
        if (this.A0C == EnumC131445wb.A07) {
            C131425wZ c131425wZ = this.A0i;
            if (c131425wZ.A09) {
                c131425wZ.A0A = true;
            }
            c131425wZ.A08 = true;
            this.A0g.A06(this.A0F.CFO());
            setMode(EnumC131445wb.A06);
            if (num == C05F.A00) {
                this.A09 = SystemClock.elapsedRealtime();
                this.A0f.postFrameCallback(this.A0e);
            }
            C8I8 c8i8 = c131425wZ.A03;
            if (c8i8 != null) {
                c8i8.DoI(false);
            }
        }
    }

    public final void A04(String str, String str2) {
        C14360o3.A0B(str2, 1);
        EnumC131445wb enumC131445wb = this.A0C;
        EnumC131445wb enumC131445wb2 = EnumC131445wb.A04;
        if (enumC131445wb == enumC131445wb2) {
            InterfaceC184788Ht interfaceC184788Ht = this.A0i.A02;
            if (interfaceC184788Ht != null) {
                interfaceC184788Ht.Cli("onCancelVideoRecording but Mode.READY_TO_SHOOT");
                return;
            }
            return;
        }
        C131425wZ c131425wZ = this.A0i;
        InterfaceC184788Ht interfaceC184788Ht2 = c131425wZ.A02;
        if (interfaceC184788Ht2 != null) {
            AbstractC183338Bg.A00(((C184778Hs) interfaceC184788Ht2).A00.A0f).A0G("cancel_video_recording");
        }
        c131425wZ.A0A = false;
        c131425wZ.A08 = true;
        this.A0f.removeFrameCallback(this.A0e);
        setVideoRecordingProgress(0.0f);
        setMode(enumC131445wb2);
        C8I8 c8i8 = c131425wZ.A03;
        if (c8i8 == null) {
            return;
        }
        c8i8.D1w(str, str2);
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        double CFO;
        double d;
        double d2;
        double d3;
        C14360o3.A0B(c55982hj, 0);
        float f = (float) c55982hj.A09.A00;
        this.A03 = f;
        double d4 = f;
        if (c55982hj.A01 > c55982hj.A03) {
            CFO = 1.0d;
            d = this.A0F.CFO();
            d3 = 0.8726999759674072d;
            d2 = 1.0d;
        } else {
            CFO = this.A0F.CFO();
            d = 1.0d;
            d2 = 0.8726999759674072d;
            d3 = 1.0d;
        }
        this.A0N = (float) AbstractC70163Da.A04(d4, CFO, d, d2, d3);
        invalidate();
        if (this.A0D != null) {
            float f2 = this.A03;
            float CFO2 = this.A0F.CFO() - 1.0f;
            float f3 = 1.0f - 0.0f;
            float f4 = 0.0f;
            if (CFO2 != 0.0f) {
                f4 = (f2 - 1.0f) / CFO2;
            }
            C8I4 c8i4 = this.A0D;
            C14360o3.A0A(c8i4);
            c8i4.DmD((f4 * f3) + 0.0f, (Math.min(getWidth(), getHeight()) / 2.0f) * (f2 - 1.0f));
        }
    }

    @Override // X.InterfaceC131415wY
    public final void Dp4(String str) {
        EnumC131445wb enumC131445wb = this.A0C;
        EnumC131445wb enumC131445wb2 = EnumC131445wb.A04;
        if (enumC131445wb == enumC131445wb2) {
            InterfaceC184788Ht interfaceC184788Ht = this.A0i.A02;
            if (interfaceC184788Ht != null) {
                interfaceC184788Ht.Cli("onStopVideoRecording but Mode.READY_TO_SHOOT");
                return;
            }
            return;
        }
        C131425wZ c131425wZ = this.A0i;
        InterfaceC184788Ht interfaceC184788Ht2 = c131425wZ.A02;
        if (interfaceC184788Ht2 != null) {
            AbstractC183338Bg.A00(((C184778Hs) interfaceC184788Ht2).A00.A0f).A0G("stop_video_recording");
        }
        long min = Math.min(SystemClock.elapsedRealtime() - this.A09, this.A08);
        SystemClock.elapsedRealtime();
        c131425wZ.A0A = false;
        c131425wZ.A08 = true;
        this.A0f.removeFrameCallback(this.A0e);
        setVideoRecordingProgress(0.0f);
        setMode(enumC131445wb2);
        C131485wf c131485wf = this.A0h;
        if (c131485wf.A02 < 0) {
            ArrayList arrayList = c131485wf.A0B;
            arrayList.add(Integer.valueOf((int) min));
            c131485wf.A04 = AbstractC001800i.A02(arrayList);
        }
        C8I8 c8i8 = c131425wZ.A03;
        if (c8i8 == null) {
            return;
        }
        c8i8.Dp3((int) min, str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r16) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.shutterbutton.ShutterButton.onDraw(android.graphics.Canvas):void");
    }

    public final void setContinuousVideoCaptureSupported(boolean z) {
    }

    public final void setInnerText(String str) {
        C14360o3.A0B(str, 0);
        if (!str.equals(this.A0G)) {
            this.A0G = str;
            invalidate();
        }
    }

    @Override // X.InterfaceC131415wY
    public void setMode(EnumC131445wb enumC131445wb) {
        C14360o3.A0B(enumC131445wb, 0);
        if (this.A0C != enumC131445wb) {
            this.A0C = enumC131445wb;
            invalidate();
        }
        EnumC131445wb enumC131445wb2 = this.A0C;
        if (enumC131445wb2 == EnumC131445wb.A04 || enumC131445wb2 == EnumC131445wb.A05) {
            this.A0g.A06(1.0d);
        }
    }

    public final void setMultiCaptureProgress(float f) {
        this.A02 = AbstractC13600mm.A00(f, 0.0f, 1.0f);
        setMode(EnumC131445wb.A05);
        invalidate();
    }

    public final void setShutterButtonRecordingStyle(InterfaceC131505wh interfaceC131505wh) {
        C14360o3.A0B(interfaceC131505wh, 0);
        this.A0F = interfaceC131505wh;
        requestLayout();
        invalidate();
    }

    public final void setVideoRecordingProgress(float f) {
        this.A05 = AbstractC13600mm.A00(f, 0.0f, 1.0f);
        invalidate();
        C8I8 c8i8 = this.A0i.A03;
        if (c8i8 != null) {
            c8i8.Dzi(this.A05);
        }
    }

    private final void A00(Canvas canvas) {
        float min = Math.min(getWidth(), getHeight()) / 2.0f;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        int i = (int) (255.0f * this.A0M);
        Paint paint = this.A0o;
        paint.setAlpha(i);
        float f = this.A0L;
        float f2 = (min - (this.A0K + f)) * this.A0N;
        float f3 = this.A04 / 2.0f;
        float f4 = (min * this.A03) - f3;
        RectF rectF = this.A0b;
        rectF.set(width - f4, height - f4, width + f4, height + f4);
        canvas.drawCircle(width, height, f2, paint);
        boolean CRA = this.A0F.CRA();
        boolean z = true;
        EnumC131445wb enumC131445wb = this.A0C;
        EnumC131445wb enumC131445wb2 = EnumC131445wb.A06;
        if (!CRA) {
            Paint paint2 = this.A0V;
            paint2.setAlpha(255);
            canvas.drawArc(rectF, 0.0f, 360.0f, false, paint2);
        } else if (enumC131445wb == enumC131445wb2 || this.A0H) {
            z = false;
        }
        if (this.A0F.CRA()) {
            C131485wf c131485wf = this.A0h;
            c131485wf.A0A.set(width - f4, height - f4, width + f4, height + f4);
            c131485wf.A06 = z;
            c131485wf.setProgressShader(this.A0R);
            c131485wf.A00 = f;
            c131485wf.draw(canvas);
        }
        Drawable drawable = this.A0S;
        if (this.A0i.A0A) {
            if (this.A0F.CRA()) {
                setInnerCircleAlpha(0.0f);
                canvas.drawCircle(width, height, f4 + f3, this.A0p);
                float width2 = getWidth() / 2.0f;
                float height2 = getHeight() / 2.0f;
                RectF rectF2 = this.A0c;
                rectF2.set(width2 - 50.0f, height2 - 50.0f, width2 + 50.0f, height2 + 50.0f);
                canvas.drawRoundRect(rectF2, 24.0f, 24.0f, this.A0Z);
                return;
            }
            A01(canvas, this.A0q);
            return;
        }
        if (drawable == null) {
            return;
        }
        A01(canvas, drawable);
    }

    private final void A01(Canvas canvas, Drawable drawable) {
        canvas.save();
        C14360o3.A07(drawable.getBounds());
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        float f = this.A0N;
        canvas.scale(f, f);
        canvas.translate((-r2.width()) / 2.0f, (-r2.height()) / 2.0f);
        drawable.setAlpha((int) (255.0f * 1.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void A02() {
        TextView textView;
        Handler handler = this.A0B;
        if (handler != null) {
            handler.removeCallbacks(this.A0k);
        }
        setMode(EnumC131445wb.A04);
        C131425wZ c131425wZ = this.A0i;
        c131425wZ.A08 = true;
        C8I6 c8i6 = c131425wZ.A05;
        if (c8i6 != null && (textView = ((C8I5) c8i6).A00.A02) != null) {
            textView.setVisibility(8);
        }
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A0I = false;
    }

    public final C131485wf getClipsShutterButtonProgressRing() {
        return this.A0h;
    }

    public EnumC131445wb getCurrentMode() {
        return this.A0C;
    }

    public final C131425wZ getShutterButtonActionsHandler() {
        return this.A0i;
    }

    public final float getZoomDragAvailableHeight() {
        float f = this.A0J;
        if (f == 0.0f) {
            Context context = getContext();
            C14360o3.A07(context);
            float min = Math.min(getRootView().getHeight() * 0.7f, AbstractC13880nE.A04(context, 200));
            this.A0J = min;
            return min;
        }
        return f;
    }

    public final void setButtonActionsEnabled(boolean z) {
        this.A0i.A08 = z;
    }

    public final void setCameraInitialisedDelegate(InterfaceC184808Hv interfaceC184808Hv) {
        this.A0i.A01 = interfaceC184808Hv;
    }

    public final void setFormatIcon(Drawable drawable) {
        this.A0S = drawable;
        invalidate();
    }

    public final void setHandsFreeRecordingEnabled(boolean z) {
        this.A0i.A09 = z;
    }

    public final void setInnerCircleAlpha(float f) {
        if (this.A0M != f) {
            this.A0M = f;
            invalidate();
        }
    }

    public final void setLoggingListener(InterfaceC184788Ht interfaceC184788Ht) {
        this.A0i.A02 = interfaceC184788Ht;
    }

    public final void setLongPressEnabled(boolean z) {
        this.A0i.A0B = z;
    }

    public final void setOnRecordVideoListener(C8I8 c8i8) {
        this.A0i.A03 = c8i8;
    }

    public final void setOnSingleTapCaptureListener(InterfaceC184828Hx interfaceC184828Hx) {
        this.A0i.A04 = interfaceC184828Hx;
    }

    public final void setOnTakingLowLightPhotoListener(C8I6 c8i6) {
        this.A0i.A05 = c8i6;
    }

    public final void setPhotoCaptureProgress(float f) {
        if (f >= this.A01 * 100.0f) {
            this.A01 = f / 100.0f;
            setMode(EnumC131445wb.A03);
        }
        if (this.A01 >= 0.3f) {
            if (this.A0B == null) {
                Handler handler = new Handler(Looper.getMainLooper());
                this.A0B = handler;
                handler.removeCallbacks(this.A0l);
            }
            invalidate();
        }
    }

    public final void setRetakeSegmentIndex(int i) {
        this.A0h.A02 = i;
        invalidate();
    }

    public final void setShutterButtonSingularColor(int i) {
        Paint paint = this.A0V;
        paint.setColor(i);
        this.A0o.setColor(i);
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void setVideoRecordingEnabled(boolean z) {
        this.A0i.A0C = z;
    }

    private final int getTotalElapsedTimeMs() {
        return this.A0h.A04 + ((int) (SystemClock.elapsedRealtime() - this.A09));
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-887745157);
        super.onAttachedToWindow();
        this.A0g.A0A(this);
        C0f9.A0D(-370876623, A06);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(588741068);
        super.onDetachedFromWindow();
        this.A0g.A0B(this);
        C0f9.A0D(630395457, A06);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC131505wh interfaceC131505wh = this.A0F;
        if (interfaceC131505wh.CRA()) {
            int i5 = this.A0P;
            int[] BiL = interfaceC131505wh.BiL(i5);
            float[] BiM = this.A0F.BiM();
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.A0R = new LinearGradient(0.0f, 250.0f, 250.0f, 0.0f, BiL, BiM, tileMode);
            this.A0Q = new LinearGradient(0.0f, 380.0f, 380.0f, 0.0f, this.A0F.BiL(i5), this.A0F.BiM(), tileMode);
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), this.A0F.BiL(this.A0P), this.A0F.BiM(), Shader.TileMode.CLAMP);
        this.A0A = linearGradient;
        this.A0X.setShader(linearGradient);
        this.A0Y.setShader(this.A0R);
        this.A0W.setShader(this.A0Q);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1478185920);
        this.A0n.setShader(new RadialGradient(getWidth() / 2, getHeight() / 2, (Math.min(getWidth(), getHeight()) / 2.0f) * this.A03 * 1.09f, this.A0O, 0, Shader.TileMode.CLAMP));
        C0f9.A0D(-472642741, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r10 != 6) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0171, code lost:
    
        if (r1 != null) goto L71;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.shutterbutton.ShutterButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        invalidate();
    }

    public final void setCurrentLayoutIndex(int i) {
        this.A06 = i;
    }

    public final void setIsHandsFreeRecordingEnabled(boolean z) {
        setHandsFreeRecordingEnabled(z);
    }

    public final void setIsLayoutInProgress(boolean z) {
        this.A0H = z;
    }

    public final void setIsVideoRecordingEnabled(boolean z) {
        setVideoRecordingEnabled(z);
    }

    public final void setLayoutCapacity(int i) {
        this.A07 = i;
    }

    public final void setMaxVideoDurationMS(long j) {
        this.A08 = j;
    }

    public final void setOnShutterButtonScaleChangedListener(C8I4 c8i4) {
        this.A0D = c8i4;
    }

    public final void setOnZoomVideoListener(C8I0 c8i0) {
        this.A0E = c8i0;
    }

    public void setRecordingProgressListener(YN5 yn5) {
        this.A0T = yn5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShutterButton(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0d = new TextPaint();
        Paint paint = new Paint(1);
        this.A0o = paint;
        Paint paint2 = new Paint(1);
        this.A0p = paint2;
        Paint paint3 = new Paint(1);
        this.A0X = paint3;
        Paint paint4 = new Paint(1);
        this.A0Y = paint4;
        Paint paint5 = new Paint(1);
        this.A0W = paint5;
        Paint paint6 = new Paint(paint);
        this.A0n = paint6;
        Paint paint7 = new Paint(paint);
        this.A0V = paint7;
        this.A0A = new Shader();
        this.A0R = new Shader();
        this.A0Q = new Shader();
        this.A0U = new Matrix();
        this.A0i = new C131425wZ(this);
        this.A0a = new Rect();
        this.A0m = new int[2];
        this.A03 = 1.0f;
        this.A0N = 1.0f;
        this.A0b = new RectF();
        this.A0c = new RectF();
        Paint paint8 = new Paint(1);
        this.A0Z = paint8;
        this.A0C = EnumC131445wb.A04;
        this.A07 = 2;
        this.A0M = 1.0f;
        this.A0l = new Runnable() { // from class: X.5wc
            @Override // java.lang.Runnable
            public final void run() {
                ShutterButton shutterButton = ShutterButton.this;
                float f = shutterButton.A01;
                if (f >= 1.0f) {
                    shutterButton.A01 = 0.0f;
                    f = 0.0f;
                } else if (f > 0.3f) {
                    return;
                }
                shutterButton.A01 = f + 0.001f;
                shutterButton.invalidate();
                Handler handler = shutterButton.A0B;
                if (handler != null) {
                    handler.postDelayed(this, 16L);
                }
            }
        };
        this.A0k = new Runnable() { // from class: X.5wd
            @Override // java.lang.Runnable
            public final void run() {
                ShutterButton shutterButton = ShutterButton.this;
                float f = shutterButton.A00;
                if (f >= 1.0f) {
                    shutterButton.A00 = 0.0f;
                    f = 0.0f;
                }
                shutterButton.A00 = f + 0.02f;
                shutterButton.invalidate();
                Handler handler = shutterButton.A0B;
                if (handler != null) {
                    handler.postDelayed(this, 16L);
                }
            }
        };
        Choreographer choreographer = AbstractC13550mh.A00;
        if (choreographer == null) {
            choreographer = Choreographer.getInstance();
            AbstractC13550mh.A00 = choreographer;
            C14360o3.A07(choreographer);
        }
        this.A0f = choreographer;
        this.A0e = new Choreographer.FrameCallback() { // from class: X.5we
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ShutterButton shutterButton = ShutterButton.this;
                long j2 = elapsedRealtime - shutterButton.A09;
                long j3 = shutterButton.A08;
                if (j2 < j3) {
                    shutterButton.setVideoRecordingProgress(((float) j2) / ((float) j3));
                    shutterButton.A0f.postFrameCallback(this);
                } else {
                    shutterButton.Dp4("max_duration_reached");
                }
            }
        };
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A29, 0, 0);
        C14360o3.A07(obtainStyledAttributes);
        try {
            int color = obtainStyledAttributes.getColor(12, -1);
            int color2 = obtainStyledAttributes.getColor(6, -7829368);
            int color3 = obtainStyledAttributes.getColor(9, -3355444);
            this.A0O = obtainStyledAttributes.getColor(4, -3355444);
            int color4 = obtainStyledAttributes.getColor(1, -1);
            this.A0L = obtainStyledAttributes.getDimension(3, 5.0f);
            this.A0K = obtainStyledAttributes.getDimension(2, 5.0f);
            this.A04 = obtainStyledAttributes.getDimension(10, 5.0f);
            this.A08 = obtainStyledAttributes.getInteger(7, 15000);
            this.A0P = obtainStyledAttributes.getResourceId(11, R.style.GradientPatternStyle);
            Context context2 = getContext();
            int color5 = obtainStyledAttributes.getColor(8, context2.getColor(R.color.camera_shutter_button_outer_border_shadow_color));
            int resourceId = obtainStyledAttributes.getResourceId(13, R.drawable.video_stop_icon);
            int resourceId2 = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId2 != 0) {
                setContentDescription(context.getText(resourceId2));
            }
            obtainStyledAttributes.recycle();
            this.A0h = new C131485wf(context);
            InterfaceC131505wh interfaceC131505wh = new InterfaceC131505wh(context) { // from class: X.5wg
                public float[] A00;
                public int[] A01;
                public final Context A02;

                @Override // X.InterfaceC131505wh
                public final float BiN(long j) {
                    return ((((float) j) / 8000.0f) * 360.0f) % 360.0f;
                }

                @Override // X.InterfaceC131505wh
                public final float BiO(float f, long j) {
                    return f;
                }

                @Override // X.InterfaceC131505wh
                public final float CFO() {
                    return 1.525f;
                }

                @Override // X.InterfaceC131505wh
                public final boolean CRA() {
                    return false;
                }

                @Override // X.InterfaceC131505wh
                public final int[] BiL(int i2) {
                    if (this.A01 == null) {
                        int[] iArr = new int[5];
                        this.A01 = iArr;
                        C50L.A03(this.A02, null, iArr, i2);
                    }
                    return this.A01;
                }

                @Override // X.InterfaceC131505wh
                public final float[] BiM() {
                    float[] fArr = this.A00;
                    if (fArr == null) {
                        float[] fArr2 = {0.0f, 0.27f, 0.51f, 0.75f, 1.0f};
                        this.A00 = fArr2;
                        return fArr2;
                    }
                    return fArr;
                }

                {
                    this.A02 = context;
                }
            };
            this.A0j = interfaceC131505wh;
            this.A0F = interfaceC131505wh;
            paint.setColor(color2);
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            paint2.setColor(color3);
            paint2.setStyle(style);
            paint2.setMaskFilter(new BlurMaskFilter(8.0f, BlurMaskFilter.Blur.INNER));
            paint6.setStyle(style);
            Paint.Style style2 = Paint.Style.STROKE;
            paint7.setStyle(style2);
            paint7.setColor(color4);
            Paint.Cap cap = Paint.Cap.ROUND;
            paint7.setStrokeCap(cap);
            paint7.setStrokeWidth(this.A0L);
            if (!this.A0F.CRA()) {
                paint7.setShadowLayer(getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material), 0.0f, 0.0f, color5);
            }
            paint3.setStyle(style2);
            paint3.setStrokeCap(cap);
            paint3.setStrokeWidth(this.A04);
            paint4.setStyle(style2);
            paint4.setStrokeCap(cap);
            paint4.setStrokeWidth(this.A0L);
            paint5.setStyle(style2);
            paint5.setStrokeCap(cap);
            paint5.setStrokeWidth(24.0f);
            C55982hj A02 = AbstractC13560mi.A00().A02();
            A02.A09(C55942hf.A04(80.0d, 7.0d));
            A02.A05(1.0d);
            this.A0g = A02;
            Drawable A00 = AbstractC13630mp.A00(context2, resourceId);
            this.A0q = A00;
            A00.setBounds(0, 0, A00.getIntrinsicWidth(), A00.getIntrinsicHeight());
            paint8.setColor(color);
            Paint.Style style3 = Paint.Style.FILL;
            paint8.setStyle(style);
            setClickable(false);
            setFocusable(true);
            setLongClickable(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public /* synthetic */ ShutterButton(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShutterButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
