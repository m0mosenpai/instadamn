package com.instagram.rtc.presentation.arsidebar;

import X.AbstractC13600mm;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25228BEl;
import X.AbstractC55206OeJ;
import X.AbstractC56862jK;
import X.C0f9;
import X.C14360o3;
import X.C1H4;
import X.C50826MdJ;
import X.C51901Mwj;
import X.C54465O4t;
import X.C56704PEw;
import X.InterfaceC57859PlP;
import X.MSX;
import X.NTW;
import X.PCS;
import X.PEU;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class RtcCallArSidebarTouchUpSlider extends View {
    public float A00;
    public InterfaceC57859PlP A01;
    public boolean A02;
    public float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Paint A07;
    public final Paint A08;
    public final Path A09;
    public final RectF A0A;
    public final VelocityTracker A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcCallArSidebarTouchUpSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC167007dF.A1D(context, 1, attributeSet);
        Paint paint = new Paint(1);
        this.A08 = paint;
        Paint paint2 = new Paint(1);
        this.A07 = paint2;
        this.A0A = AbstractC166987dD.A0X();
        this.A09 = new Path();
        this.A0B = VelocityTracker.obtain();
        this.A05 = 1;
        this.A04 = 99;
        Resources A0M = AbstractC25228BEl.A0M(this);
        paint2.setColor(-1);
        paint.setColor(Integer.MIN_VALUE);
        this.A06 = A0M.getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
        setSeekValue(1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        RectF rectF = this.A0A;
        rectF.set(0.0f, 0.0f, AbstractC166987dD.A07(this), AbstractC166987dD.A08(this));
        Path path = this.A09;
        path.reset();
        float f = this.A06;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        rectF.bottom = AbstractC166987dD.A08(this) * this.A03;
        canvas.drawRect(rectF, this.A08);
        rectF.top = AbstractC166987dD.A08(this) * this.A03;
        rectF.bottom = AbstractC166987dD.A08(this);
        canvas.drawRect(rectF, this.A07);
        super.onDraw(canvas);
    }

    private final void A00(boolean z, float f) {
        InterfaceC57859PlP interfaceC57859PlP;
        Integer num;
        AccessibilityManager accessibilityManager;
        int i = this.A04;
        float f2 = i;
        int i2 = this.A05;
        float f3 = i - i2;
        int A03 = AbstractC13600mm.A03(C1H4.A01(f2 - (f * f3)), i2, i);
        if ((!z || A03 != AbstractC13600mm.A03(C1H4.A01(f2 - (this.A03 * f3)), i2, i)) && (interfaceC57859PlP = this.A01) != null) {
            PCS pcs = ((PEU) interfaceC57859PlP).A00;
            NTW ntw = pcs.A05().A00;
            if (ntw.A01.A0F) {
                ntw.A0D.A03(new C56704PEw(A03 / 100.0f, false, true));
            }
            C50826MdJ c50826MdJ = (C50826MdJ) pcs.A0K.getValue();
            int i3 = 0;
            if (A03 >= 0) {
                if (A03 >= 2) {
                    if (24 <= A03) {
                        if (A03 < 27) {
                            i3 = 25;
                        } else if (49 <= A03) {
                            if (A03 < 52) {
                                i3 = 50;
                            } else if (74 <= A03) {
                                if (A03 < 77) {
                                    i3 = 75;
                                } else if (99 <= A03 && A03 < 101) {
                                    i3 = 100;
                                }
                            }
                        }
                    }
                }
                num = Integer.valueOf(i3);
                if (!C14360o3.A0K(c50826MdJ.A01, num) && num != null) {
                    accessibilityManager = c50826MdJ.A00;
                    if (AbstractC56862jK.A02(accessibilityManager, true) && accessibilityManager != null) {
                        accessibilityManager.interrupt();
                    }
                    RtcCallArSidebarTouchUpSlider rtcCallArSidebarTouchUpSlider = c50826MdJ.A02;
                    rtcCallArSidebarTouchUpSlider.announceForAccessibility(AbstractC167007dF.A0f(rtcCallArSidebarTouchUpSlider.getContext(), num, 2131976671));
                }
                c50826MdJ.A01 = num;
            }
            num = null;
            if (!C14360o3.A0K(c50826MdJ.A01, num)) {
                accessibilityManager = c50826MdJ.A00;
                if (AbstractC56862jK.A02(accessibilityManager, true)) {
                    accessibilityManager.interrupt();
                }
                RtcCallArSidebarTouchUpSlider rtcCallArSidebarTouchUpSlider2 = c50826MdJ.A02;
                rtcCallArSidebarTouchUpSlider2.announceForAccessibility(AbstractC167007dF.A0f(rtcCallArSidebarTouchUpSlider2.getContext(), num, 2131976671));
            }
            c50826MdJ.A01 = num;
        }
        this.A03 = f;
        invalidate();
    }

    private final int getSeekSnapValue() {
        return (this.A04 + this.A05) / 2;
    }

    private final int getSeekValueRange() {
        return this.A04 - this.A05;
    }

    public final void setSeekValue(int i) {
        int i2 = this.A05;
        int i3 = this.A04;
        A00(false, 1.0f - ((AbstractC13600mm.A03(i, i2, i3) - i2) / (i3 - i2)));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        C51901Mwj c51901Mwj;
        int A05 = C0f9.A05(-956921185);
        C14360o3.A0B(motionEvent, 0);
        getParent().requestDisallowInterceptTouchEvent(true);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    C0f9.A0C(1735322030, A05);
                    return false;
                }
                VelocityTracker velocityTracker = this.A0B;
                velocityTracker.addMovement(motionEvent);
                velocityTracker.computeCurrentVelocity(1000);
                float y = motionEvent.getY();
                if (this.A02) {
                    if (AbstractC166987dD.A01(y, this.A00) > 14.0f) {
                        this.A02 = false;
                    }
                    i = 68515888;
                }
                float abs = Math.abs(velocityTracker.getYVelocity());
                float y2 = motionEvent.getY();
                float A00 = AbstractC13600mm.A00(MSX.A00(y2, this), 0.0f, 1.0f);
                int i2 = this.A04;
                int i3 = this.A05;
                if (AbstractC13600mm.A03(C1H4.A01(i2 - ((i2 - i3) * A00)), i3, i2) == (i2 + i3) / 2 && abs <= 180.0f) {
                    this.A00 = y2;
                    this.A02 = true;
                }
                A00(true, A00);
                i = 68515888;
            } else {
                InterfaceC57859PlP interfaceC57859PlP = this.A01;
                if (interfaceC57859PlP != null) {
                    PCS pcs = ((PEU) interfaceC57859PlP).A00;
                    C54465O4t A052 = pcs.A05();
                    if (!AbstractC166997dE.A1Z(Boolean.valueOf(AbstractC56862jK.A02(((C50826MdJ) pcs.A0K.getValue()).A00, true)), true)) {
                        NTW ntw = A052.A00;
                        C51901Mwj c51901Mwj2 = (C51901Mwj) ((AbstractC55206OeJ) ntw).A01;
                        if (c51901Mwj2 != null) {
                            boolean z = c51901Mwj2.A0X;
                            boolean z2 = c51901Mwj2.A0E;
                            boolean z3 = c51901Mwj2.A0P;
                            boolean z4 = c51901Mwj2.A0I;
                            int i4 = c51901Mwj2.A00;
                            boolean z5 = c51901Mwj2.A07;
                            boolean z6 = c51901Mwj2.A0A;
                            boolean z7 = c51901Mwj2.A08;
                            boolean z8 = c51901Mwj2.A0B;
                            boolean z9 = c51901Mwj2.A05;
                            boolean z10 = c51901Mwj2.A04;
                            boolean z11 = c51901Mwj2.A0N;
                            boolean z12 = c51901Mwj2.A0S;
                            boolean z13 = c51901Mwj2.A0T;
                            boolean z14 = c51901Mwj2.A0O;
                            boolean z15 = c51901Mwj2.A0Q;
                            boolean z16 = c51901Mwj2.A0K;
                            boolean z17 = c51901Mwj2.A0G;
                            boolean z18 = c51901Mwj2.A0F;
                            boolean z19 = c51901Mwj2.A0U;
                            boolean z20 = c51901Mwj2.A0R;
                            boolean z21 = c51901Mwj2.A0L;
                            boolean z22 = c51901Mwj2.A0M;
                            boolean z23 = c51901Mwj2.A0W;
                            boolean z24 = c51901Mwj2.A0C;
                            boolean z25 = c51901Mwj2.A09;
                            c51901Mwj = new C51901Mwj(c51901Mwj2.A02, c51901Mwj2.A03, i4, c51901Mwj2.A01, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, false, z20, z21, z22, z23, z24, z25, c51901Mwj2.A0J, c51901Mwj2.A06, c51901Mwj2.A0H, c51901Mwj2.A0D);
                        } else {
                            c51901Mwj = null;
                        }
                        ntw.A0J(c51901Mwj);
                    }
                }
                i = -1415825399;
            }
        } else {
            this.A0B.clear();
            this.A02 = false;
            i = -807284431;
        }
        C0f9.A0C(i, A05);
        return true;
    }

    public final void setListener(InterfaceC57859PlP interfaceC57859PlP) {
        this.A01 = interfaceC57859PlP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcCallArSidebarTouchUpSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC167007dF.A1D(context, 1, attributeSet);
        Paint paint = new Paint(1);
        this.A08 = paint;
        Paint paint2 = new Paint(1);
        this.A07 = paint2;
        this.A0A = AbstractC166987dD.A0X();
        this.A09 = new Path();
        this.A0B = VelocityTracker.obtain();
        this.A05 = 1;
        this.A04 = 99;
        Resources A0M = AbstractC25228BEl.A0M(this);
        paint2.setColor(-1);
        paint.setColor(Integer.MIN_VALUE);
        this.A06 = A0M.getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
        setSeekValue(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcCallArSidebarTouchUpSlider(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        Paint paint = new Paint(1);
        this.A08 = paint;
        Paint paint2 = new Paint(1);
        this.A07 = paint2;
        this.A0A = AbstractC166987dD.A0X();
        this.A09 = new Path();
        this.A0B = VelocityTracker.obtain();
        this.A05 = 1;
        this.A04 = 99;
        Resources A0M = AbstractC25228BEl.A0M(this);
        paint2.setColor(-1);
        paint.setColor(Integer.MIN_VALUE);
        this.A06 = A0M.getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
        setSeekValue(1);
    }
}
