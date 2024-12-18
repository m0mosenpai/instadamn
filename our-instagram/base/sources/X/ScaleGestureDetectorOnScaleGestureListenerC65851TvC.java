package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.TvC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class ScaleGestureDetectorOnScaleGestureListenerC65851TvC extends GestureDetector.SimpleOnGestureListener implements ScaleGestureDetector.OnScaleGestureListener {
    public View A00;
    public Integer A01;
    public Runnable A02;
    public C09530e4 A03;
    public final C120985dq A04;
    public final JPb A05;
    public final XEZ A06;
    public final Handler A07;
    public final Handler A08;
    public final GestureDetector A09;
    public final ScaleGestureDetector A0A;
    public final C65850TvB A0B;
    public final UserSession A0C;
    public final C54650OCc A0D;

    public ScaleGestureDetectorOnScaleGestureListenerC65851TvC(Context context, C65850TvB c65850TvB, C120985dq c120985dq, JPb jPb, UserSession userSession, XEZ xez, C54650OCc c54650OCc) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(xez, 3);
        C14360o3.A0B(c120985dq, 4);
        C14360o3.A0B(jPb, 5);
        this.A0C = userSession;
        this.A06 = xez;
        this.A04 = c120985dq;
        this.A05 = jPb;
        this.A0D = c54650OCc;
        this.A0B = c65850TvB;
        this.A00 = null;
        this.A01 = C05F.A0C;
        Handler handler = new Handler(Looper.getMainLooper());
        this.A08 = handler;
        this.A07 = new Handler(Looper.getMainLooper());
        GestureDetector gestureDetector = new GestureDetector(context, new GestureDetectorOnGestureListenerC58552mE(this), handler);
        this.A09 = gestureDetector;
        this.A0A = new ScaleGestureDetector(context, this, handler);
        gestureDetector.setIsLongpressEnabled(true);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        Integer num;
        Integer num2;
        C14360o3.A0B(motionEvent, 0);
        View view = this.A00;
        C37905Gm2 c37905Gm2 = null;
        if (view != null) {
            num = Integer.valueOf(view.getWidth());
        } else {
            num = null;
        }
        View view2 = this.A00;
        if (view2 != null) {
            num2 = Integer.valueOf(view2.getHeight());
        } else {
            num2 = null;
        }
        if (num != null && num2 != null) {
            c37905Gm2 = new C37905Gm2(num.intValue(), num2.intValue(), motionEvent.getX(), motionEvent.getY());
        }
        XEZ xez = this.A06;
        C120985dq c120985dq = this.A04;
        xez.DBQ(c120985dq, this.A05.C09(c120985dq), c37905Gm2);
        this.A01 = C05F.A01;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        Integer num = this.A01;
        if (num == C05F.A01) {
            this.A01 = C05F.A0C;
        } else {
            if (num != C05F.A0C) {
                return;
            }
            this.A01 = C05F.A00;
            XEZ xez = this.A06;
            C120985dq c120985dq = this.A04;
            xez.DQg(c120985dq, this.A05.C09(c120985dq), motionEvent.getX(), motionEvent.getY());
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C14360o3.A0B(scaleGestureDetector, 0);
        this.A03 = new C09530e4(Float.valueOf(scaleGestureDetector.getFocusX()), Float.valueOf(scaleGestureDetector.getFocusY()));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        XEZ xez = this.A06;
        C120985dq c120985dq = this.A04;
        xez.Dmd(this.A00, c120985dq, this.A05.C09(c120985dq), Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (C2V3.isEndToEndTestRun) {
            return onSingleTapConfirmed(motionEvent);
        }
        return false;
    }

    public void A00(MotionEvent motionEvent) {
        XEZ xez = this.A06;
        C120985dq c120985dq = this.A04;
        xez.DQh(c120985dq, this.A05.C09(c120985dq), motionEvent.getX(), motionEvent.getY());
    }

    public final boolean A01(View view, MotionEvent motionEvent) {
        boolean z;
        boolean A01;
        Runnable runnable;
        this.A00 = view;
        this.A02 = new RunnableC65874Tvd(motionEvent, this);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.A07.removeCallbacksAndMessages(null);
            if (this.A01 == C05F.A00 || this.A06.CYD()) {
                A00(motionEvent);
            }
            this.A01 = C05F.A0C;
        }
        if (motionEvent.getAction() == 0) {
            UserSession userSession = this.A0C;
            C06090Tz A0U = AbstractC166997dE.A0U(userSession);
            if (C18U.A06(A0U, userSession, 36322899200191208L)) {
                XEZ xez = this.A06;
                C120985dq c120985dq = this.A04;
                if (xez.CUN(c120985dq, this.A05.C09(c120985dq), motionEvent.getX(), motionEvent.getY()) && (runnable = this.A02) != null) {
                    this.A07.postDelayed(runnable, C18U.A01(A0U, userSession, 36604374176961602L));
                }
            }
        }
        if (motionEvent.getAction() == 2) {
            XEZ xez2 = this.A06;
            C120985dq c120985dq2 = this.A04;
            xez2.Cuj(c120985dq2, this.A05.C09(c120985dq2), motionEvent.getX(), motionEvent.getY());
        }
        boolean onTouchEvent = this.A09.onTouchEvent(motionEvent);
        ScaleGestureDetector scaleGestureDetector = this.A0A;
        if (scaleGestureDetector != null) {
            z = scaleGestureDetector.onTouchEvent(motionEvent);
        } else {
            z = false;
        }
        UserSession userSession2 = this.A0C;
        if (C18U.A06(AbstractC166997dE.A0U(userSession2), userSession2, 36326519857035191L)) {
            C65850TvB c65850TvB = this.A0B;
            if (c65850TvB != null) {
                A01 = c65850TvB.A00(motionEvent);
            }
            A01 = false;
        } else {
            C54650OCc c54650OCc = this.A0D;
            if (c54650OCc != null) {
                A01 = c54650OCc.A00.A01(motionEvent);
            }
            A01 = false;
        }
        if (onTouchEvent || z || A01) {
            return true;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C09530e4 c09530e4 = this.A03;
        if (c09530e4 != null) {
            XEZ xez = this.A06;
            C120985dq c120985dq = this.A04;
            xez.DYl(c120985dq, this.A05.C09(c120985dq), ((Number) c09530e4.A00).floatValue(), ((Number) c09530e4.A01).floatValue());
        }
        this.A03 = null;
    }
}
