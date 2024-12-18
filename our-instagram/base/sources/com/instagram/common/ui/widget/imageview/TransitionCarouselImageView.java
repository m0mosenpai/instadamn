package com.instagram.common.ui.widget.imageview;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25230BEn;
import X.AbstractC37303Gc4;
import X.AbstractC50102Ry;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C1NJ;
import X.C1OG;
import X.C25821No;
import X.C73033Pe;
import X.C73083Pj;
import X.C82183lf;
import X.InterfaceC59502nt;
import X.InterfaceC73023Pd;
import X.JFQ;
import X.JQ0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class TransitionCarouselImageView extends View implements C1NJ, JFQ {
    public int A00;
    public Bitmap A01;
    public Bitmap A02;
    public List A03;
    public float A04;
    public float A05;
    public float A06;
    public long A07;
    public long A08;
    public long A09;
    public Handler A0A;
    public InterfaceC73023Pd A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public final ValueAnimator A0F;
    public final ValueAnimator A0G;
    public final ValueAnimator A0H;
    public final Rect A0I;
    public final Rect A0J;
    public final boolean A0K;
    public final Paint A0L;
    public final Rect A0M;

    public final void A04(List list, boolean z) {
        if (AbstractC50102Ry.A00(list, list) && this.A0E == z) {
            return;
        }
        A03(this);
        this.A01 = null;
        this.A02 = null;
        this.A0I.setEmpty();
        this.A0J.setEmpty();
        this.A03 = list;
        this.A00 = 0;
        this.A0E = z;
        A02(this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        ?? A1R = AbstractC167007dF.A1R(0, interfaceC59502nt, c73033Pe);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            if (this.A01 == null) {
                this.A01 = bitmap;
                if (this.A0K) {
                    this.A0F.start();
                }
                List list = this.A03;
                if (list != null && list.size() > A1R) {
                    this.A00 = (this.A00 + 1) % list.size();
                    A01(this);
                }
                invalidate();
            } else {
                this.A02 = bitmap;
                this.A0A.sendEmptyMessageDelayed(0, Math.max(this.A09 - (SystemClock.elapsedRealtime() - this.A08), 0L));
            }
            InterfaceC73023Pd interfaceC73023Pd = this.A0B;
            if (interfaceC73023Pd != null) {
                interfaceC73023Pd.DPX(new C73083Pj(bitmap, interfaceC59502nt.BRz().CDP(), c73033Pe.A04, bitmap.getWidth(), bitmap.getHeight()));
            }
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        C14360o3.A0B(canvas, 0);
        if (this.A01 != null) {
            boolean z = this.A0K;
            float f2 = 1.0f;
            if (z) {
                f = AbstractC37303Gc4.A00(this.A0F);
            } else {
                f = 1.0f;
            }
            Bitmap bitmap = this.A01;
            if (bitmap != null) {
                Rect rect = this.A0I;
                A00(bitmap, rect, f);
                canvas.drawBitmap(bitmap, rect, this.A0M, (Paint) null);
            }
            if (this.A02 != null) {
                ValueAnimator valueAnimator = this.A0G;
                if (valueAnimator.isStarted()) {
                    Paint paint = this.A0L;
                    paint.setAlpha(AbstractC25230BEn.A0D(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int"));
                    if (z) {
                        f2 = AbstractC37303Gc4.A00(this.A0H);
                    }
                    Bitmap bitmap2 = this.A02;
                    if (bitmap2 != null) {
                        Rect rect2 = this.A0J;
                        A00(bitmap2, rect2, f2);
                        canvas.drawBitmap(bitmap2, rect2, this.A0M, paint);
                    }
                }
            }
        }
    }

    public final void setSource(String str) {
        C14360o3.A0B(str, 0);
        this.A0C = str;
    }

    public final void setUrls(List list) {
        C14360o3.A0B(list, 0);
        A04(list, false);
    }

    public static final void A02(TransitionCarouselImageView transitionCarouselImageView) {
        if (!transitionCarouselImageView.A0D && transitionCarouselImageView.A03 != null) {
            A01(transitionCarouselImageView);
            transitionCarouselImageView.A0D = true;
        }
    }

    public static final void A03(TransitionCarouselImageView transitionCarouselImageView) {
        if (transitionCarouselImageView.A0D) {
            transitionCarouselImageView.A0A.removeMessages(0);
            transitionCarouselImageView.A0G.cancel();
            transitionCarouselImageView.A0F.cancel();
            transitionCarouselImageView.A0H.cancel();
            transitionCarouselImageView.A0D = false;
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        InterfaceC73023Pd interfaceC73023Pd = this.A0B;
        if (interfaceC73023Pd != null) {
            interfaceC73023Pd.DFp();
        }
    }

    public final void setOnLoadListener(InterfaceC73023Pd interfaceC73023Pd) {
        this.A0B = interfaceC73023Pd;
    }

    public /* synthetic */ TransitionCarouselImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    private final void A00(Bitmap bitmap, Rect rect, float f) {
        float f2;
        float f3;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f4 = width;
        float f5 = this.A04;
        float f6 = height;
        if (f4 * f5 < f6) {
            f2 = f4 / f;
            f3 = f5 * f2;
        } else {
            float f7 = f6 / f;
            f2 = f7 / f5;
            f3 = f7;
        }
        float f8 = (f4 - f2) / 2.0f;
        float f9 = (f6 - f3) / 2.0f;
        rect.set((int) f8, (int) f9, (int) (f2 + f8), (int) (f3 + f9));
    }

    public static final void A01(TransitionCarouselImageView transitionCarouselImageView) {
        ImageUrl imageUrl;
        transitionCarouselImageView.A08 = SystemClock.elapsedRealtime();
        C25821No A00 = C25821No.A00();
        List list = transitionCarouselImageView.A03;
        if (list != null && (imageUrl = (ImageUrl) list.get(transitionCarouselImageView.A00)) != null) {
            String str = transitionCarouselImageView.A0C;
            if (str == null) {
                C14360o3.A0F(CacheBehaviorLogger.SOURCE);
                throw C00O.createAndThrow();
            }
            C1OG A0J = A00.A0J(imageUrl, str);
            A0J.A0I = false;
            A0J.A0L = transitionCarouselImageView.A0E;
            A0J.A02(transitionCarouselImageView);
            A0J.A01();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1405122271);
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            A02(this);
        }
        C0f9.A0D(1302733278, A06);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(285830448);
        super.onDetachedFromWindow();
        A03(this);
        C0f9.A0D(773365920, A06);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (getVisibility() == 0) {
            A02(this);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-1217109100);
        this.A0M.set(0, 0, getWidth(), getHeight());
        this.A04 = r3.height() / r3.width();
        C0f9.A0D(-210138676, A06);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        A03(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
    
        if (r9.A05 != 1.0f) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TransitionCarouselImageView(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r2 = 1
            X.C14360o3.A0B(r10, r2)
            r9.<init>(r10, r11, r12)
            android.graphics.Paint r0 = X.AbstractC166987dD.A0R()
            r9.A0L = r0
            android.graphics.Rect r0 = X.AbstractC166987dD.A0U()
            r9.A0I = r0
            android.graphics.Rect r0 = X.AbstractC166987dD.A0U()
            r9.A0J = r0
            android.graphics.Rect r0 = X.AbstractC166987dD.A0U()
            r9.A0M = r0
            r3 = 1065353216(0x3f800000, float:1.0)
            r9.A04 = r3
            if (r11 != 0) goto Laa
            r0 = 800(0x320, double:3.953E-321)
            r9.A07 = r0
            r0 = 3000(0xbb8, double:1.482E-320)
            r9.A09 = r0
            r9.A06 = r3
            r9.A05 = r3
        L31:
            r0 = 11
            X.LMA r6 = new X.LMA
            r6.<init>(r9, r0)
            float r4 = r9.A06
            r5 = 0
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 != 0) goto L46
            float r0 = r9.A05
            int r1 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r0 = 0
            if (r1 == 0) goto L47
        L46:
            r0 = 1
        L47:
            r9.A0K = r0
            r7 = 2
            float[] r1 = new float[r7]
            r1[r5] = r4
            float r0 = r9.A05
            r1[r2] = r0
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofFloat(r1)
            r9.A0F = r8
            X.AbstractC43593JPy.A18(r8)
            long r0 = r9.A09
            long r3 = r9.A07
            long r0 = r0 + r3
            r8.setDuration(r0)
            r8.addUpdateListener(r6)
            float[] r1 = new float[r7]
            float r0 = r9.A06
            r1[r5] = r0
            float r0 = r9.A05
            r1[r2] = r0
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r1)
            r9.A0H = r4
            X.AbstractC43593JPy.A18(r4)
            long r2 = r9.A09
            long r0 = r9.A07
            long r2 = r2 + r0
            r4.setDuration(r2)
            r4.addUpdateListener(r6)
            int[] r0 = new int[r7]
            r0 = {x00de: FILL_ARRAY_DATA , data: [0, 255} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r0)
            r9.A0G = r2
            X.AbstractC43593JPy.A18(r2)
            long r0 = r9.A07
            r2.setDuration(r0)
            r2.addUpdateListener(r6)
            r0 = 5
            X.JX2.A00(r2, r9, r0)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            X.JjK r0 = new X.JjK
            r0.<init>(r1, r9, r5)
            r9.A0A = r0
            return
        Laa:
            android.content.Context r1 = r9.getContext()
            int[] r0 = X.AbstractC55922hc.A2N
            android.content.res.TypedArray r4 = r1.obtainStyledAttributes(r11, r0)
            X.C14360o3.A07(r4)
            r1 = 0
            r0 = 800(0x320, float:1.121E-42)
            int r0 = r4.getInt(r1, r0)
            long r0 = (long) r0
            r9.A07 = r0
            r0 = 3000(0xbb8, float:4.204E-42)
            int r0 = r4.getInt(r2, r0)
            long r0 = (long) r0
            r9.A09 = r0
            r0 = 3
            float r0 = r4.getFloat(r0, r3)
            r9.A06 = r0
            r0 = 2
            float r0 = r4.getFloat(r0, r3)
            r9.A05 = r0
            r4.recycle()
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.imageview.TransitionCarouselImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransitionCarouselImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransitionCarouselImageView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
