package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.instagram.common.session.UserSession;

/* renamed from: X.BYo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25728BYo extends GestureDetector.SimpleOnGestureListener {
    public MotionEvent A00;
    public View A01;
    public View A02;
    public Integer A03;
    public String A04;
    public final Context A05;
    public final GestureDetector A06;
    public final C2XI A07;
    public final C2XI A08;
    public final C51762Yz A09;
    public final C120985dq A0A;
    public final C37644Ghd A0B;
    public final UserSession A0C;
    public final InterfaceC60442pS A0D;
    public final C40971v4 A0E;
    public final CZK A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final EnumC71343Hv A0I;
    public final InterfaceC30930Dik A0J;
    public final C27910CRv A0K;
    public final C37616GhB A0L;
    public final boolean A0M;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        this.A03 = C05F.A00;
        InterfaceC60442pS interfaceC60442pS = this.A0D;
        UserSession userSession = this.A0C;
        C40971v4 c40971v4 = this.A0E;
        C120985dq c120985dq = this.A0A;
        C37644Ghd c37644Ghd = this.A0B;
        C27910CRv c27910CRv = this.A0K;
        InterfaceC30930Dik interfaceC30930Dik = this.A0J;
        EnumC71343Hv enumC71343Hv = this.A0I;
        C37616GhB c37616GhB = this.A0L;
        View view = this.A01;
        View view2 = this.A02;
        String str = this.A04;
        C51762Yz c51762Yz = this.A09;
        C14360o3.A0B(interfaceC60442pS, 1);
        AbstractC25234BEr.A1R(userSession, c40971v4, c120985dq, c37644Ghd, c27910CRv);
        AbstractC25229BEm.A1M(c37616GhB, 9, c51762Yz);
        if (view != null) {
            view.setPressed(false);
        }
        if (str != null && view2 != null && view != null) {
            CZK.A00(motionEvent, view2, enumC71343Hv, c51762Yz, interfaceC30930Dik, c120985dq, c37644Ghd, userSession, interfaceC60442pS, c40971v4, c27910CRv, c37616GhB, "double_tap", str, false);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent2, 1);
        if (motionEvent == null || ((!this.A0G || f > -350.0f) && (!this.A0H || f < 350.0f))) {
            return false;
        }
        A00(motionEvent2, this);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        Integer num = this.A03;
        if (num == C05F.A00) {
            this.A03 = C05F.A0N;
            return;
        }
        if (num != C05F.A0N) {
            return;
        }
        this.A03 = C05F.A01;
        InterfaceC60442pS interfaceC60442pS = this.A0D;
        UserSession userSession = this.A0C;
        C40971v4 c40971v4 = this.A0E;
        C120985dq c120985dq = this.A0A;
        C37644Ghd c37644Ghd = this.A0B;
        C27910CRv c27910CRv = this.A0K;
        InterfaceC30930Dik interfaceC30930Dik = this.A0J;
        EnumC71343Hv enumC71343Hv = this.A0I;
        C37616GhB c37616GhB = this.A0L;
        View view = this.A01;
        View view2 = this.A02;
        String str = this.A04;
        C51762Yz c51762Yz = this.A09;
        boolean z = this.A0M;
        C14360o3.A0B(interfaceC60442pS, 1);
        AbstractC25234BEr.A1R(userSession, c40971v4, c120985dq, c37644Ghd, c27910CRv);
        AbstractC25229BEm.A1M(c37616GhB, 9, c51762Yz);
        if (view != null) {
            view.setPressed(true);
        }
        if (str == null || view2 == null || view == null) {
            return;
        }
        CZK.A00(motionEvent, view2, enumC71343Hv, c51762Yz, interfaceC30930Dik, c120985dq, c37644Ghd, userSession, interfaceC60442pS, c40971v4, c27910CRv, c37616GhB, "long_press", str, z);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        C2XI c2xi;
        Float valueOf;
        C14360o3.A0B(motionEvent2, 1);
        if (motionEvent == null || (!(z = this.A0H) && !this.A0G)) {
            return false;
        }
        if (AbstractC166987dD.A01(motionEvent2.getRawY(), motionEvent.getRawY()) > 40.0f) {
            A01(this, false);
        }
        this.A00 = motionEvent;
        this.A03 = C05F.A0C;
        float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
        if ((!this.A0G && rawX < 0.0f) || (!z && rawX > 0.0f)) {
            c2xi = this.A08;
            valueOf = Float.valueOf(0.0f);
        } else {
            c2xi = this.A08;
            valueOf = Float.valueOf(rawX);
        }
        c2xi.A00(valueOf);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        InterfaceC60442pS interfaceC60442pS = this.A0D;
        UserSession userSession = this.A0C;
        C40971v4 c40971v4 = this.A0E;
        C120985dq c120985dq = this.A0A;
        C37644Ghd c37644Ghd = this.A0B;
        C27910CRv c27910CRv = this.A0K;
        InterfaceC30930Dik interfaceC30930Dik = this.A0J;
        EnumC71343Hv enumC71343Hv = this.A0I;
        C37616GhB c37616GhB = this.A0L;
        View view = this.A01;
        View view2 = this.A02;
        String str = this.A04;
        C51762Yz c51762Yz = this.A09;
        C14360o3.A0B(interfaceC60442pS, 1);
        AbstractC25234BEr.A1R(userSession, c40971v4, c120985dq, c37644Ghd, c27910CRv);
        AbstractC25229BEm.A1M(c37616GhB, 9, c51762Yz);
        if (view != null) {
            view.setPressed(false);
        }
        if (str != null && view2 != null && view != null) {
            CZK.A00(motionEvent, view2, enumC71343Hv, c51762Yz, interfaceC30930Dik, c120985dq, c37644Ghd, userSession, interfaceC60442pS, c40971v4, c27910CRv, c37616GhB, "single_tap", str, false);
        }
        return true;
    }

    public static final void A00(MotionEvent motionEvent, C25728BYo c25728BYo) {
        MotionEvent motionEvent2 = c25728BYo.A00;
        if (motionEvent2 != null) {
            int A01 = AbstractC13890nF.A01(c25728BYo.A05);
            if (A01 < 1) {
                A01 = 1;
            }
            C2XI c2xi = c25728BYo.A08;
            float A09 = AbstractC166987dD.A09(c2xi.A00);
            float[] fArr = new float[2];
            fArr[0] = AbstractC166987dD.A09(c2xi.A00);
            float f = A01;
            if (A09 < 0.0f) {
                f = -f;
            }
            fArr[1] = f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.setDuration((500.0f * Math.abs(AbstractC166987dD.A09(c2xi.A00))) / f);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new BFF(c25728BYo, 24));
            ofFloat.addListener(new C28514Ci8(5, c25728BYo, motionEvent, motionEvent2));
            ofFloat.start();
        }
    }

    public static void A01(C25728BYo c25728BYo, boolean z) {
        ViewParent parent;
        View view = c25728BYo.A02;
        if (view != null && (parent = view.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.A01;
        if (view != null && this.A03 != C05F.A00) {
            C2XI c2xi = this.A07;
            boolean z = this.A0M;
            C14360o3.A0B(c2xi, 1);
            if (z) {
                AbstractC25227BEk.A1D(c2xi, 0.97f);
            }
            view.setPressed(true);
            return false;
        }
        return true;
    }

    public C25728BYo(Context context, EnumC71343Hv enumC71343Hv, C2XI c2xi, C2XI c2xi2, C51762Yz c51762Yz, InterfaceC30930Dik interfaceC30930Dik, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C40971v4 c40971v4, C27910CRv c27910CRv, CZK czk, C37616GhB c37616GhB, boolean z, boolean z2, boolean z3) {
        AbstractC25234BEr.A1R(userSession, interfaceC60442pS, c120985dq, c37644Ghd, c40971v4);
        AbstractC167007dF.A1J(c27910CRv, 7, c51762Yz);
        C14360o3.A0B(c37616GhB, 11);
        AbstractC25233BEq.A0z(12, czk, c2xi, c2xi2);
        this.A05 = context;
        this.A0C = userSession;
        this.A0D = interfaceC60442pS;
        this.A0A = c120985dq;
        this.A0B = c37644Ghd;
        this.A0E = c40971v4;
        this.A0K = c27910CRv;
        this.A0J = interfaceC30930Dik;
        this.A09 = c51762Yz;
        this.A0I = enumC71343Hv;
        this.A0L = c37616GhB;
        this.A0F = czk;
        this.A0M = z;
        this.A0H = z2;
        this.A0G = z3;
        this.A07 = c2xi;
        this.A08 = c2xi2;
        this.A03 = C05F.A0N;
        this.A06 = new GestureDetector(context, new GestureDetectorOnGestureListenerC58552mE(this), AbstractC167007dF.A0J());
    }
}
