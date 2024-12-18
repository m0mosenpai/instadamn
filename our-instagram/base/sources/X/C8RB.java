package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.8RB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8RB extends FrameLayout {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public BDJ A09;
    public C8R8 A0A;
    public C23689AeO A0B;
    public boolean A0C;
    public boolean A0D;
    public C56164OwW A0E;
    public List A0F;
    public boolean A0G;
    public final Path A0H;
    public final RectF A0I;
    public final C8RE A0J;
    public final Paint A0K;
    public final Rect A0L;
    public final Rect A0M;
    public final GestureDetector A0N;
    public final C5SZ A0O;
    public final Map A0P;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        canvas.save();
        int i = this.A08;
        if (i == -1) {
            i = getWidth();
        }
        int i2 = this.A04;
        float f = this.A00;
        float f2 = i2 - f;
        float f3 = (i2 + i) - f;
        float f4 = this.A06;
        RectF rectF = this.A0I;
        if (rectF.left != f2 || rectF.right != f3 || rectF.bottom != f4) {
            Path path = this.A0H;
            path.reset();
            rectF.set(f2, 0.0f, f3, f4);
            float f5 = this.A03;
            path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        }
        canvas.clipPath(this.A0H);
        canvas.translate(0.0f, 0.0f);
        C56164OwW c56164OwW = this.A0E;
        if (c56164OwW != null) {
            c56164OwW.A01 = this.A00 - this.A04;
        }
        BDJ bdj = this.A09;
        if (bdj != null) {
            bdj.DCI(canvas, i, this.A06);
        }
        if (this.A0D) {
            Rect rect = this.A0L;
            rect.set(0, 0, ((int) (this.A05 * this.A01)) + this.A04, getHeight());
            Rect rect2 = this.A0M;
            rect2.set(((int) (this.A05 * this.A02)) + this.A04, 0, getWidth(), getHeight());
            Paint paint = this.A0K;
            canvas.drawRect(rect, paint);
            canvas.drawRect(rect2, paint);
        }
        Iterator it = this.A0F.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("getStart");
        }
        canvas.restore();
    }

    public final void setGeneratedVideoTimelineBitmaps(C51683MsE c51683MsE) {
        C14360o3.A0B(c51683MsE, 0);
        C56164OwW c56164OwW = this.A0E;
        if (c56164OwW == null) {
            Context context = getContext();
            C14360o3.A07(context);
            c56164OwW = new C56164OwW(context, null);
            this.A0E = c56164OwW;
        }
        c56164OwW.A06 = c51683MsE;
        this.A09 = c56164OwW;
        this.A07 = c51683MsE.A01;
        this.A06 = c51683MsE.A00;
        invalidate();
    }

    public final void setOverlaySegments(List list) {
        C14360o3.A0B(list, 0);
        this.A0F = list;
        final C25133BAd c25133BAd = C25133BAd.A00;
        Collections.sort(list, new Comparator(c25133BAd) { // from class: X.B0T
            public final /* synthetic */ InterfaceC16620sF A00;

            {
                C14360o3.A0B(c25133BAd, 1);
                this.A00 = c25133BAd;
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return AbstractC166987dD.A0H(this.A00.invoke(obj, obj2));
            }
        });
        invalidate();
    }

    public static final void A01(C8RB c8rb) {
        C8R8 c8r8;
        InterfaceC184998Io interfaceC184998Io;
        boolean z = c8rb.A0G;
        boolean z2 = c8rb.A0J.A06;
        c8rb.A0G = z2;
        if (z && !z2 && (c8r8 = c8rb.A0A) != null && (interfaceC184998Io = ((C8R7) c8r8).A00.A00) != null) {
            interfaceC184998Io.DuJ(true);
        }
    }

    public static final void A02(C8RB c8rb, float f, boolean z) {
        C8R8 c8r8;
        if (z && !c8rb.A0G && (c8r8 = c8rb.A0A) != null) {
            c8rb.A0G = true;
            InterfaceC184998Io interfaceC184998Io = ((C8R7) c8r8).A00.A00;
            if (interfaceC184998Io != null) {
                interfaceC184998Io.DuL(true);
            }
        }
        c8rb.A00 = f;
        C8R8 c8r82 = c8rb.A0A;
        if (c8r82 != null) {
            float scrollXPercent = c8rb.getScrollXPercent();
            InterfaceC184998Io interfaceC184998Io2 = ((C8R7) c8r82).A00.A00;
            if (interfaceC184998Io2 != null) {
                interfaceC184998Io2.E2A(scrollXPercent);
            }
        }
        C23689AeO c23689AeO = c8rb.A0B;
        if (c23689AeO != null && c23689AeO.equals(c8rb.A09)) {
            C23689AeO c23689AeO2 = c8rb.A0B;
            if (c23689AeO2 != null) {
                float f2 = c8rb.A00 - c8rb.A04;
                c23689AeO2.A00 = f2;
                TextureView textureView = c23689AeO2.A05;
                if (textureView != null) {
                    textureView.setTranslationX(-f2);
                    return;
                }
                return;
            }
            return;
        }
        c8rb.invalidate();
    }

    public static final boolean A03(C8RB c8rb, float f, boolean z) {
        if (c8rb.A0C) {
            float f2 = c8rb.A08 - c8rb.A05;
            float min = Math.min(Math.max(0.0f, f2), Math.max(Math.min(0.0f, f2), f));
            if (min != c8rb.A00) {
                A02(c8rb, min, z);
                return true;
            }
        }
        return false;
    }

    private final int getFilmstripWidth() {
        int i = this.A08;
        if (i == -1) {
            return getWidth();
        }
        return i;
    }

    private final float getMaxScrollDistance() {
        return this.A08 - this.A05;
    }

    public final float getScrollXPercent() {
        int i = this.A08;
        if (i == 0) {
            return 0.0f;
        }
        return this.A00 / i;
    }

    public final int getTargetFrameHeight() {
        return this.A06;
    }

    public final int getTargetFrameWidth() {
        return this.A07;
    }

    public final float getWidthScrollXPercent() {
        int i = this.A08;
        if (i == 0) {
            return 0.0f;
        }
        return this.A05 / i;
    }

    public final void setCornerRadius(int i) {
        this.A03 = i;
        invalidate();
    }

    public final void setDimmerColor(int i) {
        this.A0K.setColor(i);
        postInvalidate();
    }

    public C8RB(Context context) {
        super(context);
        this.A0F = new ArrayList();
        this.A0K = new Paint();
        this.A0L = new Rect();
        this.A0M = new Rect();
        this.A0I = new RectF();
        this.A0P = new HashMap();
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A08 = -1;
        C5SZ c5sz = new C5SZ() { // from class: X.8RC
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                C8RB c8rb = C8RB.this;
                C8RE c8re = c8rb.A0J;
                if (c8re.A06) {
                    c8re.A01();
                }
                return c8rb.A0C;
            }

            @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C8RB c8rb = C8RB.this;
                float f3 = c8rb.A08 - c8rb.A05;
                if (c8rb.A0C) {
                    float f4 = c8rb.A00;
                    if (f4 < f3) {
                        C8RE c8re = c8rb.A0J;
                        ((AbstractC65716Tsp) c8re).A00 = f3;
                        c8re.A03 = f4;
                        c8re.A07 = true;
                        c8re.A04 = -f;
                        c8re.A02();
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C8RB c8rb = C8RB.this;
                return C8RB.A03(c8rb, c8rb.A00 + f, true);
            }
        };
        this.A0O = c5sz;
        this.A0N = new GestureDetector(context, c5sz, new Handler(Looper.getMainLooper()));
        C8RE c8re = new C8RE(new VK3() { // from class: X.8RD
            @Override // X.VK3
            public final /* bridge */ /* synthetic */ float A00(Object obj) {
                return C8RB.this.A00;
            }

            @Override // X.VK3
            public final /* bridge */ /* synthetic */ void A01(Object obj, float f) {
                C8RB.A02(C8RB.this, f, true);
            }
        }, this);
        c8re.A00.A00 = 0.8f * (-4.2f);
        c8re.A01 = 0.0f;
        c8re.A05(new C3M6() { // from class: X.8RG
            @Override // X.C3M6
            public final void Cwa(AbstractC65716Tsp abstractC65716Tsp, float f, float f2, boolean z) {
                C8RB.A01(C8RB.this);
            }
        });
        this.A0J = c8re;
        this.A0H = new Path();
        setWillNotDraw(false);
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getNumberOfFittingFrames() {
        return (getFilmstripWidth() / this.A07) + 1;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-485680685);
        super.onSizeChanged(i, i2, i3, i4);
        BDJ bdj = this.A09;
        if (bdj == this.A0B && bdj != null) {
            bdj.FCa(getNumberOfFittingFrames(), this.A07, this.A06);
        }
        invalidate();
        C0f9.A0D(1395048176, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = C0f9.A05(1936231160);
        C14360o3.A0B(motionEvent, 0);
        if (this.A0N.onTouchEvent(motionEvent)) {
            i = -1978485432;
        } else {
            int action = motionEvent.getAction();
            if (action != 1 && action != 3) {
                C0f9.A0C(898534048, A05);
                return false;
            }
            A01(this);
            i = -93490861;
        }
        C0f9.A0C(i, A05);
        return true;
    }

    public final void setListener(C8R8 c8r8) {
        this.A0A = c8r8;
    }

    public final void setMaxSelectedWidth(int i) {
        this.A05 = i;
    }

    public final void setScrollXMargin(int i) {
        this.A04 = i;
    }

    public final void setTotalFilmstripWidth(int i) {
        this.A08 = i;
    }
}
