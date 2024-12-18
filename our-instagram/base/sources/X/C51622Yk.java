package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.facebook.R;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.tooltippopup.MaskingFrameLayout;
import java.lang.ref.WeakReference;

@Deprecated
/* renamed from: X.2Yk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51622Yk extends PopupWindow {
    public static volatile boolean A0M;
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC147206jw A03;
    public WeakReference A04;
    public WeakReference A05;
    public boolean A06;
    public boolean A07;
    public final Rect A08;
    public final Rect A09;
    public final Rect A0A;
    public final GestureDetector A0B;
    public final FrameLayout A0C;
    public final C55982hj A0D;
    public final InterfaceC12850lX A0E;
    public final UserSession A0F;
    public final JXE A0G;
    public final C42259Inj A0H;
    public final L5J A0I;
    public final Integer A0J;
    public final Integer A0K;
    public final boolean A0L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.widget.LinearLayout, android.view.View, android.view.ViewGroup, X.JXE] */
    public C51622Yk(L5J l5j) {
        super(-2, -2);
        UserSession userSession = l5j.A09;
        View view = l5j.A08;
        Context context = view.getContext();
        int intValue = ((Number) l5j.A02.A00(new C49669Lx0(l5j), null)).intValue();
        ?? linearLayout = new LinearLayout(context);
        View.inflate(context, R.layout.bubble_view_layout, linearLayout);
        linearLayout.setOrientation(1);
        linearLayout.setWillNotDraw(false);
        linearLayout.A02 = (MaskingFrameLayout) linearLayout.requireViewById(R.id.box);
        linearLayout.A03 = (MaskingFrameLayout) linearLayout.requireViewById(R.id.lower_nub);
        linearLayout.A04 = (MaskingFrameLayout) linearLayout.requireViewById(R.id.upper_nub);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, AbstractC55922hc.A08);
        ViewStub viewStub = (ViewStub) linearLayout.requireViewById(R.id.content_stub);
        if (intValue == -1) {
            if (obtainStyledAttributes != null) {
                intValue = obtainStyledAttributes.getResourceId(1, -1);
            } else {
                throw new UnsupportedOperationException("Content not found");
            }
        }
        viewStub.setLayoutResource(intValue);
        viewStub.inflate();
        Context context2 = linearLayout.getContext();
        ColorFilter A00 = C3DY.A00(context2.getColor(R.color.gradient_dark));
        Drawable background = linearLayout.A02.getBackground();
        background.getClass();
        background.mutate().setColorFilter(A00);
        Drawable drawable = context2.getDrawable(R.drawable.tooltip_shadow);
        linearLayout.A01 = drawable;
        drawable.mutate().setColorFilter(A00);
        linearLayout.A01.mutate().setAlpha(90);
        Rect rect = new Rect();
        linearLayout.A00 = rect;
        linearLayout.A01.getPadding(rect);
        Drawable background2 = linearLayout.A04.getBackground();
        background2.getClass();
        Drawable background3 = linearLayout.A03.getBackground();
        background3.getClass();
        Rect rect2 = linearLayout.A00;
        int i = rect2.left;
        int max = Math.max(0, rect2.top - background2.getIntrinsicHeight());
        Rect rect3 = linearLayout.A00;
        linearLayout.setPadding(i, max, rect3.right, Math.max(0, rect3.bottom - background3.getIntrinsicHeight()));
        if (obtainStyledAttributes != null) {
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            linearLayout.A03.setVisibility(z ? 4 : 0);
            linearLayout.A04.setVisibility(z ? 0 : 4);
            background3.mutate().setColorFilter(A00);
            background2.mutate().setColorFilter(A00);
            obtainStyledAttributes.recycle();
        }
        Integer num = l5j.A0A;
        Integer num2 = l5j.A0B;
        this.A03 = null;
        this.A0H = new C42259Inj(this);
        this.A01 = -1;
        this.A00 = 0;
        this.A0E = new HHL(this);
        this.A0F = userSession;
        this.A0I = l5j;
        this.A0L = l5j.A06;
        FrameLayout frameLayout = new FrameLayout(context);
        this.A0C = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        this.A0G = linearLayout;
        Integer num3 = l5j.A03;
        if (num3 != null) {
            ColorFilter A002 = C3DY.A00(context2.getColor(num3.intValue()));
            Drawable background4 = linearLayout.A02.getBackground();
            background4.getClass();
            background4.mutate().setColorFilter(A002);
            Drawable background5 = linearLayout.A03.getBackground();
            background5.getClass();
            background5.mutate().setColorFilter(A002);
            Drawable background6 = linearLayout.A04.getBackground();
            background6.getClass();
            background6.mutate().setColorFilter(A002);
        }
        Integer num4 = l5j.A04;
        if (num4 != null) {
            int intValue2 = num4.intValue();
            Drawable drawable2 = linearLayout.A01;
            if (drawable2 != null) {
                drawable2.mutate().setColorFilter(C3DY.A00(context2.getColor(intValue2)));
            }
        }
        frameLayout.addView((View) linearLayout, layoutParams);
        setContentView(frameLayout);
        this.A0J = num;
        this.A0K = num2;
        this.A0A = new Rect();
        this.A05 = new WeakReference(view);
        Rect rect4 = this.A0A;
        view.getGlobalVisibleRect(rect4);
        update(rect4.left, rect4.top, rect4.width(), rect4.height());
        this.A08 = new Rect();
        setBackgroundDrawable(new ColorDrawable(0));
        this.A0B = new GestureDetector(context, new C44404Jjh(this));
        this.A09 = new Rect();
        if (!l5j.A07) {
            linearLayout.A01 = null;
        }
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A05(1.0d);
        A02.A0A(new JXF(this));
        this.A0D = A02;
    }

    public final void A01(Bitmap bitmap, float f) {
        JXE jxe = this.A0G;
        MaskingFrameLayout maskingFrameLayout = jxe.A02;
        maskingFrameLayout.A01 = bitmap;
        maskingFrameLayout.A00 = f;
        maskingFrameLayout.invalidate();
        MaskingFrameLayout maskingFrameLayout2 = jxe.A03;
        maskingFrameLayout2.A01 = bitmap;
        maskingFrameLayout2.A00 = f;
        maskingFrameLayout2.invalidate();
        MaskingFrameLayout maskingFrameLayout3 = jxe.A04;
        maskingFrameLayout3.A01 = bitmap;
        maskingFrameLayout3.A00 = f;
        maskingFrameLayout3.invalidate();
    }

    public final void A03(boolean z) {
        float height;
        JXE jxe = this.A0G;
        if (jxe.getVisibility() == 0) {
            AbstractC12860lY.A08(this.A0E);
            AbstractC25651Mw.A00(this.A0I.A09).A02(this.A0H, C38013Gnz.class);
            if (!z) {
                dismiss();
                return;
            }
            if (this.A06) {
                return;
            }
            this.A06 = true;
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le A01 = AbstractC125325le.A01(jxe, 0);
            A01.A0G();
            A01.A0U(jxe.getScaleX(), 0.0f, this.A02);
            float scaleY = jxe.getScaleY();
            if (this.A07) {
                height = 0.0f;
            } else {
                height = jxe.getHeight();
            }
            A01.A0V(scaleY, 0.0f, height);
            A01.A0M(jxe.getAlpha(), 0.0f);
            A01.A06 = new InterfaceC150976qx() { // from class: X.Lw0
                @Override // X.InterfaceC150976qx
                public final void Dbl(AbstractC125325le abstractC125325le, float f) {
                    C51622Yk.this.A0G.A00();
                }
            };
            A01.A05 = new InterfaceC125355lh() { // from class: X.J0I
                @Override // X.InterfaceC125355lh
                public final void onFinish() {
                    C51622Yk.this.A03(false);
                }
            };
            A01.A0H();
        }
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        this.A00++;
        InterfaceC147206jw interfaceC147206jw = this.A03;
        if (interfaceC147206jw != null) {
            interfaceC147206jw.DZe();
        }
        JXE jxe = this.A0G;
        boolean z = false;
        if (jxe.getVisibility() != 0) {
            z = true;
        }
        boolean z2 = this.A06;
        C55942hf c55942hf = C150956qv.A02;
        AbstractC125325le.A01(jxe, 0).A0G();
        this.A06 = false;
        jxe.setVisibility(4);
        if (this.A0C.isAttachedToWindow()) {
            super.dismiss();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Message: ");
        sb.append("");
        sb.append(" , Animation running: ");
        sb.append(z2);
        sb.append(" , Dismiss: ");
        sb.append(this.A00);
        sb.append(" , Lifecycle: ");
        sb.append(this.A01);
        sb.append(" , Hidden: ");
        sb.append(z);
        C0w9.A03("tooltip_detached_window", sb.toString());
    }

    public final void A02(View view, int i, int i2, boolean z) {
        WeakReference weakReference;
        View view2;
        if ((!isShowing() || this.A0G.getVisibility() != 0) && (weakReference = this.A05) != null && (view2 = (View) weakReference.get()) != null) {
            L5J l5j = this.A0I;
            l5j.A02.A00(new C49668Lwz(this), null);
            this.A04 = new WeakReference(view);
            Rect rect = this.A08;
            view.getGlobalVisibleRect(rect);
            int centerX = rect.centerX() + i;
            int centerY = rect.centerY() + i2;
            this.A07 = z;
            this.A0G.getViewTreeObserver().addOnPreDrawListener(new LR3(this, centerX, centerY, z));
            Rect rect2 = this.A0A;
            showAtLocation(view2, 0, rect2.left, rect2.top);
            AbstractC12860lY.A07(this.A0E);
            AbstractC25651Mw.A00(l5j.A09).A01(this.A0H, C38013Gnz.class);
            setOutsideTouchable(true);
            setTouchable(true);
            setFocusable(false);
            setTouchInterceptor(new View.OnTouchListener() { // from class: X.LQU
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    View view4;
                    C51622Yk c51622Yk = C51622Yk.this;
                    if (C51622Yk.A0M) {
                        C1KM.A03(motionEvent);
                    }
                    View.OnTouchListener onTouchListener = c51622Yk.A0I.A00;
                    if (onTouchListener != null && onTouchListener.onTouch(view3, motionEvent)) {
                        return true;
                    }
                    JXE jxe = c51622Yk.A0G;
                    Rect rect3 = c51622Yk.A09;
                    jxe.getGlobalVisibleRect(rect3);
                    boolean z2 = false;
                    if (AbstractC43594JPz.A1V(rect3, motionEvent)) {
                        z2 = c51622Yk.A0B.onTouchEvent(motionEvent);
                    } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                        c51622Yk.A0D.A03();
                        if (c51622Yk.A0L) {
                            c51622Yk.A03(false);
                        }
                    }
                    WeakReference weakReference2 = c51622Yk.A05;
                    if (weakReference2 == null || (view4 = (View) weakReference2.get()) == null || view4.getWindowToken() == null || z2) {
                        return z2;
                    }
                    motionEvent.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
                    return view4.getRootView().dispatchTouchEvent(motionEvent);
                }
            });
            if (l5j.A05) {
                view2.postDelayed(new Runnable() { // from class: X.J3i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C51622Yk.this.A03(true);
                    }
                }, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            }
            System.currentTimeMillis();
        }
    }
}
