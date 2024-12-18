package com.instagram.creation.base.ui.filterview;

import X.AbstractC13320mI;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC43594JPz;
import X.AnonymousClass841;
import X.C06090Tz;
import X.C0f9;
import X.C14360o3;
import X.C18U;
import X.C57992lC;
import X.HandlerC44381JjK;
import X.InterfaceC189608af;
import X.InterfaceC57811Pkd;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes8.dex */
public final class FilterViewContainer extends MediaFrameLayout implements GestureDetector.OnGestureListener {
    public View A00;
    public ImageView A01;
    public UserSession A02;
    public InterfaceC57811Pkd A03;
    public AnonymousClass841 A04;
    public boolean A05;
    public boolean A06;
    public GestureDetector A07;
    public final Handler A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterViewContainer(Context context) {
        super(context, null, 0);
        C14360o3.A0B(context, 1);
        this.A08 = new HandlerC44381JjK(Looper.getMainLooper(), this, 2);
        A00();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
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

    public final UserSession getUserSession() {
        return this.A02;
    }

    @Override // com.instagram.ui.widget.framelayout.MediaFrameLayout, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        UserSession userSession = this.A02;
        if (userSession != null && C57992lC.A03()) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36327718152977208L)) {
                i2 = View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(i2) - C57992lC.A00()) * (1.0f - ((float) Double.valueOf(C18U.A00(c06090Tz, this.A02, 37172143083225659L)).doubleValue()))), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
    }

    public final void setCropToggleButtonEnabled(boolean z) {
        this.A05 = z;
    }

    public final void setListener(InterfaceC57811Pkd interfaceC57811Pkd) {
        this.A03 = interfaceC57811Pkd;
    }

    public final void setUserSession(UserSession userSession) {
        this.A02 = userSession;
    }

    private final void A00() {
        Context context = getContext();
        this.A04 = AbstractC43594JPz.A0Q(AbstractC13320mI.A01(context, InterfaceC189608af.class));
        this.A07 = new GestureDetector(context, this);
    }

    @Override // X.AbstractC43201yn, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(898253361);
        super.onDetachedFromWindow();
        this.A08.removeCallbacksAndMessages(null);
        C0f9.A0D(-1430928286, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        if (r2 == X.EnumC69983Ch.A03) goto L16;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFinishInflate() {
        /*
            r5 = this;
            r0 = 1639287623(0x61b58b47, float:4.186121E20)
            int r3 = X.C0f9.A06(r0)
            super.onFinishInflate()
            r0 = 2131435673(0x7f0b2099, float:1.8493195E38)
            android.widget.ImageView r0 = X.AbstractC31173DnH.A0I(r5, r0)     // Catch: java.lang.IllegalArgumentException -> L8d
            r5.A01 = r0     // Catch: java.lang.IllegalArgumentException -> L8d
            r0 = 2131432810(0x7f0b156a, float:1.8487388E38)
            android.view.View r4 = X.AbstractC166997dE.A0S(r5, r0)     // Catch: java.lang.IllegalArgumentException -> L8d
            r5.A00 = r4     // Catch: java.lang.IllegalArgumentException -> L8d
            java.lang.Integer r0 = X.C05F.A06     // Catch: java.lang.IllegalArgumentException -> L8d
            X.AbstractC56952jT.A04(r4, r0)     // Catch: java.lang.IllegalArgumentException -> L8d
            X.841 r0 = r5.A04     // Catch: java.lang.IllegalArgumentException -> L8d
            r2 = 0
            if (r0 == 0) goto L37
            X.5L6 r0 = r0.ANZ()     // Catch: java.lang.IllegalArgumentException -> L8d
            android.content.res.Resources r1 = r5.getResources()     // Catch: java.lang.IllegalArgumentException -> L8d
            int r0 = r0.A02     // Catch: java.lang.IllegalArgumentException -> L8d
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.IllegalArgumentException -> L8d
            X.AbstractC010103p.A0G(r4, r0)     // Catch: java.lang.IllegalArgumentException -> L8d
        L37:
            android.view.View r1 = X.AbstractC43594JPz.A0E(r4)     // Catch: java.lang.IllegalArgumentException -> L8d
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            X.AbstractC13880nE.A0o(r4, r1, r0)     // Catch: java.lang.IllegalArgumentException -> L8d
            r1 = 29
            X.OkJ r0 = new X.OkJ     // Catch: java.lang.IllegalArgumentException -> L8d
            r0.<init>(r1, r5, r4)     // Catch: java.lang.IllegalArgumentException -> L8d
            r4.setOnClickListener(r0)     // Catch: java.lang.IllegalArgumentException -> L8d
            X.841 r0 = r5.A04     // Catch: java.lang.IllegalArgumentException -> L8d
            if (r0 == 0) goto L8b
            X.3Ch r1 = r0.AGq()     // Catch: java.lang.IllegalArgumentException -> L8d
        L53:
            X.3Ch r0 = X.EnumC69983Ch.A05     // Catch: java.lang.IllegalArgumentException -> L8d
            if (r1 == r0) goto L63
            X.841 r0 = r5.A04     // Catch: java.lang.IllegalArgumentException -> L8d
            if (r0 == 0) goto L5f
            X.3Ch r2 = r0.AGq()     // Catch: java.lang.IllegalArgumentException -> L8d
        L5f:
            X.3Ch r0 = X.EnumC69983Ch.A03     // Catch: java.lang.IllegalArgumentException -> L8d
            if (r2 != r0) goto L95
        L63:
            r0 = 2131428472(0x7f0b0478, float:1.847859E38)
            android.view.ViewStub r0 = X.AbstractC167007dF.A0M(r5, r0)     // Catch: java.lang.IllegalArgumentException -> L8d
            android.view.View r2 = r0.inflate()     // Catch: java.lang.IllegalArgumentException -> L8d
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.PunchedOverlayView"
            X.C14360o3.A0C(r2, r0)     // Catch: java.lang.IllegalArgumentException -> L8d
            com.instagram.common.ui.widget.imageview.PunchedOverlayView r2 = (com.instagram.common.ui.widget.imageview.PunchedOverlayView) r2     // Catch: java.lang.IllegalArgumentException -> L8d
            android.content.Context r1 = r5.getContext()     // Catch: java.lang.IllegalArgumentException -> L8d
            r0 = 2130970866(0x7f0408f2, float:1.7550454E38)
            int r0 = X.AbstractC167007dF.A09(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L8d
            r2.A01 = r0     // Catch: java.lang.IllegalArgumentException -> L8d
            X.Lzy r0 = new X.Lzy     // Catch: java.lang.IllegalArgumentException -> L8d
            r0.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L8d
            r2.post(r0)     // Catch: java.lang.IllegalArgumentException -> L8d
            goto L95
        L8b:
            r1 = r2
            goto L53
        L8d:
            r2 = move-exception
            java.lang.String r1 = "FilterViewContainer"
            java.lang.String r0 = "Unable to set button views due to missing view ids, this is not necessarily an issue"
            X.C0K8.A0G(r1, r0, r2)
        L95:
            r0 = 934044002(0x37ac6162, float:2.0549345E-5)
            X.C0f9.A0D(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.base.ui.filterview.FilterViewContainer.onFinishInflate():void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(1564346410);
        C14360o3.A0B(motionEvent, 0);
        GestureDetector gestureDetector = this.A07;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                motionEvent.getActionMasked();
                this.A08.removeMessages(0);
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                    if (this.A06 && this.A03 != null) {
                        this.A06 = false;
                    }
                    View view = this.A00;
                    if (this.A05 && view != null) {
                        view.setVisibility(0);
                    }
                } else {
                    IllegalStateException A0g = AbstractC166997dE.A0g();
                    C0f9.A0C(-671123914, A05);
                    throw A0g;
                }
            }
        } else {
            if (this.A03 != null) {
                this.A08.sendEmptyMessageDelayed(0, 300L);
            }
            View view2 = this.A00;
            if (this.A05) {
                AbstractC167007dF.A0x(view2);
            }
        }
        C0f9.A0C(-1904290176, A05);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A08 = new HandlerC44381JjK(Looper.getMainLooper(), this, 2);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
        this.A08 = new HandlerC44381JjK(Looper.getMainLooper(), this, 2);
        A00();
    }
}
