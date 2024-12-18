package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.RadioButton;
import com.facebook.R;
import java.lang.ref.WeakReference;

/* renamed from: X.Jky, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44437Jky extends RadioButton implements InterfaceC57932Pmc {
    public int A00;
    public InterfaceC50490MQs A01;
    public AbstractC44335Jia A02;
    public EnumC46217Kct A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public int A0E;
    public Context A0F;
    public Paint A0G;
    public Drawable A0H;
    public String A0I;
    public final Rect A0J;
    public final LO4 A0K;
    public final Runnable A0L;
    public final int[] A0M;
    public final int A0N;
    public final Paint A0O;
    public final Rect A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public static int A00(C44437Jky c44437Jky) {
        InterfaceC50490MQs interfaceC50490MQs = c44437Jky.A01;
        C14360o3.A07(interfaceC50490MQs);
        return interfaceC50490MQs.BF3();
    }

    public static void A02(C44437Jky c44437Jky) {
        boolean z = c44437Jky.A09;
        String str = c44437Jky.A04;
        if (z) {
            str = TextUtils.ellipsize(str, new TextPaint(c44437Jky.A0O), c44437Jky.A00, TextUtils.TruncateAt.END).toString();
        }
        c44437Jky.A0I = str;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        if (z && this.A0H == null && this.A06) {
            Context context = getContext();
            Drawable drawable = context.getDrawable(R.drawable.instagram_sliders_pano_outline_24);
            this.A0H = drawable;
            AbstractC25231BEo.A0x(context, drawable, AbstractC53242c7.A0E(this.A0F));
            A01(this);
        }
        super.setChecked(z);
    }

    @Override // android.widget.RadioButton, android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        if (this.A0Q) {
            super.toggle();
        }
    }

    public C44437Jky(Context context, EnumC46217Kct enumC46217Kct, boolean z) {
        super(context);
        this.A07 = false;
        this.A0P = AbstractC166987dD.A0U();
        this.A0J = AbstractC166987dD.A0U();
        this.A0M = new int[2];
        this.A0L = new Runnable() { // from class: X.PLf
            @Override // java.lang.Runnable
            public final void run() {
                WeakReference weakReference;
                C44437Jky c44437Jky = C44437Jky.this;
                OXL oxl = AbstractC54340Nzy.A00;
                if (!oxl.A06() && (weakReference = oxl.A01) != null && weakReference.get() != null) {
                    Rect A0U = AbstractC166987dD.A0U();
                    Point point = new Point();
                    c44437Jky.getGlobalVisibleRect(A0U, point);
                    A0U.top = point.y;
                    A0U.left = point.x;
                    Object parent = c44437Jky.getParent();
                    parent.getClass();
                    oxl.A04(new AbstractC54808OKe((View) parent, A0U.left, A0U.top));
                }
            }
        };
        this.A03 = enumC46217Kct;
        this.A0F = context;
        this.A0N = AbstractC166997dE.A06(getResources());
        this.A0Q = z;
        setBackground(null);
        setClickable(true);
        setFocusable(true);
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A0O = A0S;
        A0S.setTextAlign(Paint.Align.CENTER);
        A0S.setTypeface(Typeface.DEFAULT);
        A0S.setFakeBoldText(true);
        Paint A0S2 = AbstractC166987dD.A0S(1);
        this.A0G = A0S2;
        Context context2 = getContext();
        AbstractC166987dD.A1N(context2, A0S2, AbstractC53242c7.A0H(this.A0F, R.attr.igds_color_secondary_button_on_media));
        this.A0K = new LO4(this);
        this.A0R = AbstractC167007dF.A1X(AbstractC43841Ja4.A01(context2), C05F.A0N);
        setImportantForAccessibility(2);
    }

    public static void A01(C44437Jky c44437Jky) {
        Resources resources;
        int dimensionPixelOffset;
        float f;
        EnumC46217Kct enumC46217Kct;
        if (c44437Jky.getMeasuredWidth() != 0) {
            int i = c44437Jky.A00;
            int i2 = c44437Jky.A0N;
            int i3 = i2 * 2;
            int i4 = i - i3;
            int i5 = c44437Jky.A03.A02;
            if (i5 > 0) {
                resources = c44437Jky.getResources();
                dimensionPixelOffset = Math.max(i4 / i5, resources.getDimensionPixelOffset(R.dimen.autocomplete_dropdown_header_text_size));
            } else {
                resources = c44437Jky.getResources();
                boolean z = c44437Jky.A0R;
                int i6 = R.dimen.add_payment_bottom_sheet_row_subtitle_size;
                if (z) {
                    i6 = R.dimen.autocomplete_dropdown_header_text_size;
                }
                dimensionPixelOffset = resources.getDimensionPixelOffset(i6);
            }
            if (dimensionPixelOffset != c44437Jky.A0E) {
                c44437Jky.A0E = dimensionPixelOffset;
                A02(c44437Jky);
            }
            Paint paint = c44437Jky.A0O;
            paint.setTextSize(c44437Jky.A0E);
            float f2 = paint.getFontMetrics().ascent;
            float f3 = dimensionPixelOffset - f2;
            int i7 = i3 * 3;
            int i8 = 0;
            if (c44437Jky.A0R && ((enumC46217Kct = c44437Jky.A03) == EnumC46217Kct.A08 || enumC46217Kct == EnumC46217Kct.A09)) {
                i8 = AbstractC166997dE.A0D(resources) * 2;
            }
            int measuredHeight = (int) ((((c44437Jky.getMeasuredHeight() - i7) - i4) + f2) - i8);
            float f4 = measuredHeight;
            if (measuredHeight <= 0) {
                f = f4 / 3.0f;
            } else {
                f = f4 / 2.0f;
            }
            int round = Math.round(f);
            int measuredHeight2 = ((c44437Jky.getMeasuredHeight() - i3) - round) - i8;
            int measuredHeight3 = (((c44437Jky.getMeasuredHeight() - i3) - round) - i4) - i8;
            float f5 = (i3 + round) - f2;
            c44437Jky.A0D = f5;
            if (c44437Jky.A08) {
                measuredHeight2 = (int) (measuredHeight2 - f3);
                measuredHeight3 = (int) (measuredHeight3 - f3);
                c44437Jky.A0D = f5 + AbstractC166997dE.A07(resources) + i4;
            }
            c44437Jky.A02.setBounds(i2, measuredHeight3, i2 + i4, measuredHeight2);
            c44437Jky.A0C = i2 + (i4 / 2.0f);
            Drawable drawable = c44437Jky.A0H;
            if (drawable != null) {
                int A05 = AbstractC166997dE.A05(resources);
                int A08 = AbstractC166997dE.A08(resources);
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                int A082 = AbstractC166997dE.A08(resources);
                int measuredHeight4 = (((c44437Jky.getMeasuredHeight() - i3) - round) - i8) - A082;
                if (c44437Jky.A08) {
                    measuredHeight4 = (int) (measuredHeight4 - f3);
                }
                int i9 = i2 + A082;
                int i10 = dimensionPixelSize / 2;
                c44437Jky.A0A = i9 + i10;
                c44437Jky.A0B = measuredHeight4 - i10;
                int i11 = measuredHeight4 - A08;
                int i12 = i9 + A08;
                drawable.setBounds(i12, i11 - A05, A05 + i12, i11);
            }
        }
    }

    @Override // X.InterfaceC57932Pmc
    public final void Czq(int i, Bitmap bitmap) {
        C8FY c8fy = new C8FY(getResources(), bitmap);
        c8fy.A02(this.A0F.getResources().getDimension(R.dimen.abc_button_padding_horizontal_material));
        this.A02 = this.A01.AWq(getContext(), c8fy, this.A03);
        A01(this);
        postInvalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0176  */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44437Jky.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int A06 = C0f9.A06(175091133);
        setMeasuredDimension(this.A00, View.MeasureSpec.getSize(i2));
        A01(this);
        C0f9.A0D(-1410889874, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r1 != 3) goto L9;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            r0 = 618321778(0x24dad772, float:9.490741E-17)
            int r3 = X.C0f9.A05(r0)
            int[] r0 = r9.A0M
            r9.getLocationOnScreen(r0)
            android.graphics.Rect r8 = r9.A0J
            r5 = 0
            r7 = r0[r5]
            r6 = 1
            r4 = r0[r6]
            int r2 = r9.getWidth()
            int r2 = r2 + r7
            r1 = r0[r6]
            int r0 = r9.getHeight()
            int r1 = r1 + r0
            r8.set(r7, r4, r2, r1)
            float r0 = r10.getRawX()
            int r1 = (int) r0
            float r0 = r10.getRawY()
            int r0 = (int) r0
            boolean r4 = r8.contains(r1, r0)
            int r1 = r10.getAction()
            if (r1 == 0) goto L74
            if (r1 == r6) goto L46
            r0 = 2
            if (r1 == r0) goto L7f
            r0 = 3
            if (r1 == r0) goto L54
        L3f:
            r0 = 1387886027(0x52b975cb, float:3.982726E11)
            X.C0f9.A0C(r0, r3)
            return r6
        L46:
            if (r4 == 0) goto L54
            android.view.ViewParent r0 = r9.getParent()
            r0.getClass()
            android.view.View r0 = (android.view.View) r0
            r0.performClick()
        L54:
            java.lang.Runnable r0 = r9.A0L
            r9.removeCallbacks(r0)
            X.LO4 r2 = r9.A0K
            float r0 = r2.A01
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L70
            r2.A01 = r1
            float r0 = r2.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L70
            android.view.Choreographer r0 = r2.A03
            r0.postFrameCallback(r2)
        L70:
            r9.setPressed(r5)
            goto L3f
        L74:
            boolean r0 = r9.A05
            if (r0 == 0) goto L7f
            java.lang.Runnable r2 = r9.A0L
            r0 = 500(0x1f4, double:2.47E-321)
            r9.postDelayed(r2, r0)
        L7f:
            if (r4 == 0) goto L9b
            X.LO4 r2 = r9.A0K
            float r0 = r2.A01
            r1 = 0
        L86:
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L97
            r2.A01 = r1
            float r0 = r2.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L97
            android.view.Choreographer r0 = r2.A03
            r0.postFrameCallback(r2)
        L97:
            r9.setPressed(r4)
            goto L3f
        L9b:
            java.lang.Runnable r0 = r9.A0L
            r9.removeCallbacks(r0)
            X.LO4 r2 = r9.A0K
            float r0 = r2.A01
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44437Jky.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
