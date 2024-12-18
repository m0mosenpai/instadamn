package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.facebook.R;
import com.instagram.common.clips.model.LayoutTransform;

/* renamed from: X.McW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50809McW extends FrameLayout implements InterfaceGestureDetectorOnGestureListenerC149756oS {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public InterfaceC57808Pka A0L;
    public boolean A0M;
    public boolean A0N;
    public float A0O;
    public float A0P;
    public int A0Q;
    public Paint A0R;
    public Paint A0S;
    public Drawable A0T;
    public Drawable A0U;
    public Drawable A0V;
    public C8RI A0W;
    public C8RI A0X;
    public InterfaceC16610sE A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public final C56164OwW A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final float A0j;
    public final float A0k;
    public final float A0l;
    public final int A0m;
    public final int A0n;
    public final int A0o;
    public final int A0p;
    public final Path A0q;
    public final RectF A0r;
    public final RectF A0s;
    public final C008102v A0t;
    public final PT8 A0u;
    public final PSG A0v;
    public final PSH A0w;
    public final InterfaceC09390do A0x;
    public final boolean A0y;
    public final boolean A0z;
    public final boolean A10;
    public final boolean A11;
    public final boolean A12;
    public final boolean A13;
    public final int[] A14;

    public C50809McW(Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        super(context);
        C54388O1u c54388O1u;
        this.A0q = new Path();
        this.A0u = new PT8(this);
        this.A0v = new PSG(this);
        this.A0w = new PSH(this);
        this.A14 = new int[2];
        this.A0r = AbstractC166987dD.A0X();
        this.A0s = AbstractC166987dD.A0X();
        this.A0E = 10;
        this.A03 = 1.0f;
        this.A0K = 3;
        this.A0B = 2;
        this.A0a = true;
        this.A0Z = true;
        this.A0x = AbstractC09440dt.A00(EnumC09460dv.A02, new J7Q(context, 47));
        setWillNotDraw(false);
        Context A0L = AbstractC166997dE.A0L(this);
        if (z8) {
            c54388O1u = new C54388O1u(this);
        } else {
            c54388O1u = null;
        }
        this.A0e = new C56164OwW(A0L, c54388O1u);
        Resources resources = getResources();
        this.A0o = AbstractC166997dE.A07(resources);
        this.A0p = resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float f = displayMetrics.density;
        this.A0l = f;
        float f2 = displayMetrics.widthPixels;
        this.A0m = (int) (f2 * 0.15f);
        this.A0n = (int) (f2 * 0.85f);
        this.A0J = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A0I = AbstractC166997dE.A08(resources);
        this.A06 = 0;
        this.A0V = context.getDrawable(R.drawable.filmstrip_timeline_trimmer_handle);
        this.A0T = context.getDrawable(R.drawable.filmstrip_timeline_trimmer_handle_left);
        this.A0U = context.getDrawable(R.drawable.filmstrip_timeline_trimmer_handle_right);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        int i = this.A0J;
        Drawable drawable = this.A0V;
        C8RI c8ri = new C8RI(-1, dimensionPixelSize2, dimensionPixelSize, 0);
        if (i > 0) {
            C8RL c8rl = new C8RL(i, -1);
            c8rl.A00(drawable, 0);
            c8ri.A08(c8rl);
            C8RL c8rl2 = new C8RL(i, -1);
            c8rl2.A00(drawable, dimensionPixelSize);
            c8ri.A09(c8rl2);
        }
        c8ri.A06(0);
        this.A0X = c8ri;
        C8RI c8ri2 = new C8RI(context.getResources().getColor(R.color.clips_gradient_redesign_color_0, null), resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material), resources.getDimensionPixelSize(R.dimen.abc_control_corner_material), 0);
        c8ri2.A06(0);
        this.A0W = c8ri2;
        this.A12 = z9;
        this.A11 = true;
        this.A0z = z4;
        this.A10 = z5;
        this.A0g = z3;
        this.A0i = z7;
        this.A0y = z;
        this.A0f = z2;
        this.A0t = new C008102v(context, this);
        this.A0h = z6;
        this.A0j = 10.0f * f;
        this.A0k = f * 5.0f;
        this.A13 = true;
    }

    public static final boolean A05(C50809McW c50809McW, float f) {
        if (A06(c50809McW, f, true)) {
            c50809McW.A0b = false;
            c50809McW.invalidate();
            return true;
        }
        if (!c50809McW.A0b) {
            c50809McW.A0b = true;
            c50809McW.invalidate();
            C2UY.A01.A05(20L);
        }
        return false;
    }

    public static /* synthetic */ void getDraggingState$annotations() {
    }

    public static /* synthetic */ void getTrimmingState$annotations() {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        C8RI c8ri = this.A0X;
        if (c8ri != null) {
            int i = this.A0K;
            InterfaceC57808Pka interfaceC57808Pka = this.A0L;
            if (i != 3) {
                if (interfaceC57808Pka != null) {
                    ((C56165OwX) interfaceC57808Pka).A00.A02.Du4(motionEvent, c8ri.A0A(motionEvent.getX(), this.A0I), c8ri.A0B(motionEvent.getX(), this.A0I));
                }
            } else if (interfaceC57808Pka != null) {
                ((C56165OwX) interfaceC57808Pka).A00.A02.Du4(motionEvent, false, false);
                return false;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        Integer num;
        C14360o3.A0B(motionEvent2, 1);
        if (this.A0c) {
            PSH psh = this.A0w;
            psh.A01 = false;
            psh.A02.removeCallbacks(psh);
            if (motionEvent != null) {
                f3 = motionEvent.getRawX();
            } else {
                f3 = 0.0f;
            }
            if (f3 - motionEvent2.getRawX() <= 0.0f) {
                num = C05F.A01;
            } else {
                num = C05F.A00;
            }
            PSG psg = this.A0v;
            C50809McW c50809McW = psg.A02;
            c50809McW.A0A = c50809McW.A0H;
            c50809McW.A08 = c50809McW.A0G;
            psg.A00 = num;
            psg.A01.fling((int) c50809McW.A00, 0, (int) f, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            c50809McW.postOnAnimation(psg);
            requestDisallowInterceptTouchEvent(true);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        PT8 pt8 = this.A0u;
        pt8.A02 = false;
        pt8.A03.removeCallbacks(pt8);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        int i = this.A0K;
        int i2 = 3;
        if (i != 3 && i != 0) {
            InterfaceC57808Pka interfaceC57808Pka = this.A0L;
            if (interfaceC57808Pka != null) {
                AbstractC51365MmQ abstractC51365MmQ = ((C56165OwX) interfaceC57808Pka).A00;
                abstractC51365MmQ.A02.DQX(motionEvent, abstractC51365MmQ.getBindingAdapterPosition());
                return;
            }
            return;
        }
        boolean z = this.A0g;
        boolean z2 = this.A0i;
        if (z) {
            if (z2) {
                i2 = 1;
            }
        } else {
            i2 = 0;
            if (z2) {
                i2 = 4;
            }
        }
        this.A0B = i2;
        float rawX = motionEvent.getRawX();
        this.A02 = rawX;
        this.A01 = rawX;
        this.A0O = motionEvent.getRawY();
        this.A00 = this.A02;
        this.A0A = this.A0H;
        this.A08 = this.A0G;
        this.A05 = 0;
        requestDisallowInterceptTouchEvent(true);
        int i3 = this.A0B;
        if (i3 == 0 || i3 == 2) {
            return;
        }
        InterfaceC57808Pka interfaceC57808Pka2 = this.A0L;
        if (interfaceC57808Pka2 != null) {
            AbstractC51365MmQ abstractC51365MmQ2 = ((C56165OwX) interfaceC57808Pka2).A00;
            abstractC51365MmQ2.A02.DQW(abstractC51365MmQ2.getBindingAdapterPosition());
        }
        if (!this.A10) {
            return;
        }
        C2UY.A01.A05(20L);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final void setGeneratedVideoTimelineBitmaps(C51683MsE c51683MsE) {
        C14360o3.A0B(c51683MsE, 0);
        this.A0e.A06 = c51683MsE;
    }

    public final void setOnDrawOverride(InterfaceC16610sE interfaceC16610sE) {
        C14360o3.A0B(interfaceC16610sE, 0);
        this.A0Y = interfaceC16610sE;
    }

    public final void setupTrimmer(AbstractC22994ABt abstractC22994ABt) {
        C14360o3.A0B(abstractC22994ABt, 0);
        this.A0J = abstractC22994ABt.A03;
        this.A04 = abstractC22994ABt.A00;
        Drawable drawable = abstractC22994ABt.A06;
        if (drawable == null) {
            drawable = this.A0V;
        }
        this.A0V = drawable;
        Drawable drawable2 = abstractC22994ABt.A09;
        if (drawable2 == null) {
            drawable2 = this.A0T;
        }
        this.A0T = drawable2;
        Drawable drawable3 = abstractC22994ABt.A07;
        if (drawable3 == null) {
            drawable3 = this.A0U;
        }
        this.A0U = drawable3;
        this.A0a = true;
        this.A0X = abstractC22994ABt.A00();
        invalidate();
    }

    private final int A00(float f) {
        if (this.A11) {
            Context A0L = AbstractC166997dE.A0L(this);
            float f2 = this.A03;
            if (Float.valueOf(f2) != null) {
                return (int) ((f * f2) / AbstractC50522MSa.A00(A0L, OZQ.A00));
            }
            return (int) (f / AbstractC50522MSa.A00(A0L, OZQ.A00));
        }
        return (int) ((((int) f) / AbstractC54341Nzz.A00) / this.A0l);
    }

    private final int A01(int i) {
        if (this.A11) {
            return AbstractC53880NsC.A00(AbstractC166997dE.A0L(this), i);
        }
        return (int) (AbstractC54341Nzz.A00 * i * this.A0l);
    }

    private final boolean A03() {
        if (this.A0K != 3 && !this.A0c && !this.A0M) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A06(X.C50809McW r9, float r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50809McW.A06(X.McW, float, boolean):boolean");
    }

    private final C41097IHo getDurationTextUtil() {
        return (C41097IHo) this.A0x.getValue();
    }

    public final int A07() {
        int i;
        int i2;
        if (!this.A0c) {
            i = this.A0G - this.A0H;
        } else {
            i = this.A0C;
        }
        int A01 = A01(i);
        if (this.A11) {
            C56164OwW c56164OwW = this.A0e;
            c56164OwW.A02 = this.A0C;
            c56164OwW.A0C = true;
        }
        if (A03()) {
            i2 = (this.A0J + this.A04) * 2;
        } else {
            i2 = 0;
        }
        return A01 + i2;
    }

    public final void A08() {
        C8RI c8ri;
        Drawable drawable;
        Drawable drawable2;
        if (this.A0a && (c8ri = this.A0X) != null) {
            if (this.A0H > this.A0F) {
                drawable = this.A0T;
            } else {
                drawable = this.A0V;
            }
            C8RL c8rl = c8ri.A06;
            if (c8rl != null) {
                c8rl.A00(drawable, 0);
            }
            if (this.A0G < this.A0C) {
                drawable2 = this.A0U;
            } else {
                drawable2 = this.A0V;
            }
            C8RL c8rl2 = c8ri.A07;
            if (c8rl2 != null) {
                c8rl2.A00(drawable2, c8ri.A0D);
            }
        }
    }

    public final boolean A0A() {
        int i = this.A0K;
        if (i == 2 || i == 1) {
            return true;
        }
        return false;
    }

    public final Path getClipPath() {
        return this.A0q;
    }

    public final boolean getEnableTouch() {
        return this.A0Z;
    }

    public final int getTrimDurationMs() {
        return this.A0G - this.A0H;
    }

    public final int getTrimEndTimeMs() {
        return this.A0G;
    }

    public final int getTrimStartTimeMs() {
        return this.A0H;
    }

    public final int getTrimmerHandleWidthPx() {
        return this.A0J;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r30) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50809McW.onDraw(android.graphics.Canvas):void");
    }

    public final void setDimView(boolean z) {
        setAlpha(z ? 0.4f : 1.0f);
    }

    public final void setEnableTrim(boolean z) {
        int i;
        if (!z && this.A0K == 0) {
            this.A0N = true;
        }
        if (z) {
            i = this.A0J + this.A04;
        } else {
            i = 0;
        }
        setPadding(i, 0, i, 0);
        int i2 = 3;
        if (z) {
            i2 = 0;
        }
        this.A0K = i2;
        requestLayout();
    }

    public final void setFetchBitmapDelegate(InterfaceC16620sF interfaceC16620sF) {
        C56164OwW c56164OwW = this.A0e;
        PLT plt = new PLT(this);
        c56164OwW.A0A = interfaceC16620sF;
        c56164OwW.A08 = plt;
    }

    public final void setFetchBitmapDelegateV2(InterfaceC16610sE interfaceC16610sE) {
        C56164OwW c56164OwW = this.A0e;
        PLU plu = new PLU(this);
        c56164OwW.A0B = interfaceC16610sE;
        c56164OwW.A08 = plu;
    }

    public final void setIsInVideoAdjustMode(boolean z) {
        int i;
        this.A0c = z;
        this.A0d = false;
        C8RI c8ri = this.A0X;
        if (c8ri != null) {
            int A01 = A01(this.A0H);
            int A012 = A01(this.A0C - this.A0G);
            c8ri.A08 = z;
            c8ri.A03 = A01;
            c8ri.A02 = A012;
            c8ri.A04();
        }
        C8RI c8ri2 = this.A0X;
        if (c8ri2 != null) {
            if (z) {
                i = Color.argb(155, 0, 0, 0);
            } else {
                i = 0;
            }
            c8ri2.A06(i);
        }
        if (z) {
            this.A0K = 0;
        }
        requestLayout();
    }

    public final void setIsPhoto(boolean z) {
        this.A0e.A0D = z;
    }

    public final void setLayoutTransform(LayoutTransform layoutTransform) {
        this.A0e.A05 = layoutTransform;
    }

    public final void setMinStartTimeMs(int i) {
        this.A0F = i;
        A08();
    }

    public final void setTargetBitmapAspectRatio(Float f) {
        this.A0e.A07 = f;
    }

    public final void setThumbnailSampleRateMs(int i) {
        this.A0e.A03 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C50809McW r9, float r10, float r11) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50809McW.A02(X.McW, float, float):void");
    }

    private final boolean A04(MotionEvent motionEvent) {
        boolean z;
        int i;
        Integer num;
        Integer num2;
        if (A0A()) {
            if (this.A0K == 1) {
                num2 = C05F.A00;
            } else {
                num2 = C05F.A01;
            }
            this.A0K = 0;
            InterfaceC57808Pka interfaceC57808Pka = this.A0L;
            if (interfaceC57808Pka != null) {
                AbstractC51365MmQ abstractC51365MmQ = ((C56165OwX) interfaceC57808Pka).A00;
                InterfaceC58200Pr6 interfaceC58200Pr6 = abstractC51365MmQ.A02;
                C50809McW c50809McW = abstractC51365MmQ.A01;
                interfaceC58200Pr6.Dvp(num2, c50809McW.A0H, c50809McW.A0G);
            }
        } else {
            boolean z2 = this.A0g;
            if ((!z2 || (i = this.A0B) != 3) && ((!(z = this.A0i) || (i = this.A0B) != 4) && (!z2 || !z || (i = this.A0B) != 1))) {
                if (this.A0d) {
                    this.A0d = false;
                    invalidate();
                    InterfaceC57808Pka interfaceC57808Pka2 = this.A0L;
                    if (interfaceC57808Pka2 != null) {
                        AbstractC51365MmQ abstractC51365MmQ2 = ((C56165OwX) interfaceC57808Pka2).A00;
                        InterfaceC58200Pr6 interfaceC58200Pr62 = abstractC51365MmQ2.A02;
                        C50809McW c50809McW2 = abstractC51365MmQ2.A01;
                        interfaceC58200Pr62.Dn4(c50809McW2.A0H, c50809McW2.A0G);
                        return true;
                    }
                } else {
                    InterfaceC57808Pka interfaceC57808Pka3 = this.A0L;
                    if (interfaceC57808Pka3 != null) {
                        ((C56165OwX) interfaceC57808Pka3).A00.A02.DsH(motionEvent);
                        return true;
                    }
                }
            } else {
                if (i != 3) {
                    if (i == 4 && motionEvent.getAction() != 1) {
                        num = C05F.A0C;
                    } else {
                        num = C05F.A00;
                    }
                } else {
                    num = C05F.A01;
                }
                this.A0B = 0;
                InterfaceC57808Pka interfaceC57808Pka4 = this.A0L;
                if (interfaceC57808Pka4 != null) {
                    AbstractC51365MmQ abstractC51365MmQ3 = ((C56165OwX) interfaceC57808Pka4).A00;
                    InterfaceC58200Pr6 interfaceC58200Pr63 = abstractC51365MmQ3.A02;
                    C50809McW c50809McW3 = abstractC51365MmQ3.A01;
                    interfaceC58200Pr63.DQc(num, c50809McW3.A0H, c50809McW3.A0G);
                    return true;
                }
            }
        }
        return true;
    }

    public final void A09(int i, int i2) {
        Paint A0P = AbstractC166997dE.A0P();
        this.A0S = A0P;
        A0P.setStyle(Paint.Style.STROKE);
        Paint paint = this.A0S;
        if (paint != null) {
            paint.setStrokeWidth(i2);
        }
        Paint paint2 = this.A0S;
        if (paint2 != null) {
            paint2.setColor(i);
        }
    }

    public final int getDurationWidth() {
        return A07();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r4.A0c != false) goto L15;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            super.onMeasure(r5, r6)
            int r1 = r4.A07()
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            r4.setMeasuredDimension(r1, r0)
            boolean r0 = r4.A03()
            if (r0 == 0) goto L5c
            int r1 = r4.A0J
            int r0 = r4.A04
            int r1 = r1 + r0
            int r3 = -r1
            int r0 = r4.A0Q
            int r3 = r3 + r0
        L1d:
            boolean r0 = r4.A03()
            if (r0 == 0) goto L4a
            int r1 = r4.A0J
            int r0 = r4.A04
            int r1 = r1 + r0
            int r2 = -r1
            int r0 = r4.A0Q
            int r2 = r2 + r0
        L2c:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L3a
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0 = 0
            r1.setMargins(r3, r0, r2, r0)
        L3a:
            int r1 = r4.A0K
            r0 = 3
            if (r1 != r0) goto L44
            boolean r0 = r4.A0c
            r1 = 0
            if (r0 == 0) goto L46
        L44:
            r1 = 1065353216(0x3f800000, float:1.0)
        L46:
            r4.setZ(r1)
            return
        L4a:
            boolean r0 = r4.A0c
            if (r0 == 0) goto L59
            int r1 = r4.A0C
            int r0 = r4.A0G
            int r1 = r1 - r0
            int r0 = r4.A01(r1)
            int r2 = -r0
            goto L2c
        L59:
            int r2 = r4.A0Q
            goto L2c
        L5c:
            boolean r0 = r4.A0c
            if (r0 == 0) goto L68
            int r0 = r4.A0H
            int r0 = r4.A01(r0)
            int r3 = -r0
            goto L1d
        L68:
            int r3 = r4.A0Q
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50809McW.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1325674820);
        super.onSizeChanged(i, i2, i3, i4);
        C8RI c8ri = this.A0X;
        if (c8ri != null) {
            c8ri.setBounds(0, 0, i, i2);
        }
        C8RI c8ri2 = this.A0W;
        if (c8ri2 != null) {
            c8ri2.setBounds(0, 0, i, i2);
        }
        C0f9.A0D(-114162438, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        Integer num;
        boolean z;
        boolean z2;
        int A05 = C0f9.A05(1952898520);
        boolean z3 = false;
        C14360o3.A0B(motionEvent, 0);
        if (!this.A0Z) {
            i = 1271724784;
        } else {
            InterfaceC57808Pka interfaceC57808Pka = this.A0L;
            if (interfaceC57808Pka != null) {
                if ((this.A0z || this.A0g || this.A0i || this.A0y) && this.A0t.A00.onTouchEvent(motionEvent)) {
                    i2 = 2113825134;
                } else {
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 1) {
                            int i3 = 3;
                            if (action != 2) {
                                if (action != 3) {
                                    i = 629130880;
                                } else {
                                    z3 = A04(motionEvent);
                                    i = -1973495964;
                                }
                            } else if (A0A()) {
                                float rawX = motionEvent.getRawX();
                                this.A00 = rawX;
                                A02(this, rawX - this.A02, rawX);
                                this.A02 = rawX;
                                i2 = 615117217;
                            } else {
                                int i4 = this.A0B;
                                if (i4 == 1) {
                                    this.A00 = motionEvent.getRawX();
                                    float rawY = motionEvent.getRawY();
                                    float f = this.A00;
                                    float A01 = AbstractC166987dD.A01(f, this.A01);
                                    float A012 = AbstractC166987dD.A01(rawY, this.A0O);
                                    if (A01 > this.A0j || A012 > this.A0k) {
                                        if (A01 <= A012) {
                                            i3 = 4;
                                        }
                                        this.A0B = i3;
                                    }
                                    this.A02 = f;
                                    i2 = -98549614;
                                } else if (i4 == 3) {
                                    float rawX2 = motionEvent.getRawX();
                                    this.A00 = rawX2;
                                    A06(this, rawX2 - this.A02, false);
                                    this.A02 = rawX2;
                                    i2 = -930599029;
                                } else if (i4 == 4) {
                                    ((C56165OwX) interfaceC57808Pka).A00.A02.DQe(motionEvent);
                                    i2 = -1373031961;
                                } else if (this.A0d) {
                                    float rawX3 = motionEvent.getRawX();
                                    this.A00 = rawX3;
                                    if (this.A0y) {
                                        PSH psh = this.A0w;
                                        if (!psh.A01) {
                                            psh.A00 = this.A02 - rawX3;
                                            psh.A01 = true;
                                            psh.A02.postOnAnimation(psh);
                                        }
                                    } else {
                                        A05(this, this.A02 - rawX3);
                                    }
                                    this.A02 = rawX3;
                                    i2 = 1979715218;
                                } else {
                                    i = -1707557864;
                                }
                            }
                        } else if (!A0A() && ((!(z = this.A0g) || this.A0B != 3) && ((!(z2 = this.A0i) || this.A0B != 4) && ((!z || !z2 || this.A0B != 1) && !this.A0d && AbstractC166987dD.A01(motionEvent.getRawX(), this.A02) < 10.0f)))) {
                            i2 = -1831957693;
                        } else {
                            z3 = A04(motionEvent);
                            i = 1540582070;
                        }
                    } else {
                        float rawX4 = motionEvent.getRawX();
                        this.A02 = rawX4;
                        if (this.A0K != 3) {
                            this.A01 = rawX4;
                            this.A00 = rawX4;
                            this.A0A = this.A0H;
                            this.A08 = this.A0G;
                            this.A05 = 0;
                            this.A09 = A00(0.0f + rawX4) - this.A0H;
                            this.A07 = A00(this.A05 + this.A01) - this.A0G;
                            float x = motionEvent.getX();
                            if (this.A0c) {
                                PSG psg = this.A0v;
                                Scroller scroller = psg.A01;
                                if (!scroller.isFinished()) {
                                    scroller.forceFinished(true);
                                    psg.A02.removeCallbacks(psg);
                                }
                                this.A0d = true;
                                requestDisallowInterceptTouchEvent(true);
                                ((C56165OwX) interfaceC57808Pka).A00.A02.Dn5();
                            } else {
                                C8RI c8ri = this.A0X;
                                if (c8ri != null) {
                                    if (c8ri.A0A(x, this.A0I)) {
                                        this.A0K = 1;
                                    } else if (c8ri.A0B(x, this.A0I)) {
                                        this.A0K = 2;
                                    }
                                    if (this.A0f) {
                                        C2UY.A01.A05(20L);
                                    }
                                }
                                if (A0A()) {
                                    if (this.A0K == 1) {
                                        num = C05F.A00;
                                    } else {
                                        num = C05F.A01;
                                    }
                                    ((C56165OwX) interfaceC57808Pka).A00.A02.Dvt(num);
                                    requestDisallowInterceptTouchEvent(true);
                                }
                            }
                            i2 = -2002261797;
                        } else {
                            i2 = -2078984244;
                        }
                    }
                }
                C0f9.A0C(i2, A05);
                return true;
            }
            z3 = super.onTouchEvent(motionEvent);
            i = 1656379121;
        }
        C0f9.A0C(i, A05);
        return z3;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Paint A0P = AbstractC166997dE.A0P();
        this.A0R = A0P;
        A0P.setStyle(Paint.Style.FILL);
        Paint paint = this.A0R;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public final void setBitmapVerticalPadding(int i) {
        this.A06 = i;
    }

    public final void setDefaultMarginPx(int i) {
        this.A0Q = i;
    }

    public final void setEnableHighlight(boolean z) {
        this.A0M = z;
    }

    public final void setEnableTouch(boolean z) {
        this.A0Z = z;
    }

    public final void setHightlightEnabled(boolean z) {
        this.A0M = z;
    }

    public final void setListener(InterfaceC57808Pka interfaceC57808Pka) {
        this.A0L = interfaceC57808Pka;
    }

    public final void setMinAllowedDurationMs(int i) {
        this.A0E = i;
    }

    public final void setTrimSpeedScaleFactor(float f) {
        this.A03 = f;
    }

    public final void setTrimmerHandleTouchPadding(int i) {
        this.A0I = i;
    }
}
