package X;

import android.app.Activity;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.api.schemas.ReelsMediaInteractivityType;
import com.instagram.common.session.UserSession;

/* renamed from: X.C5a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27345C5a extends ScaleGestureDetectorOnScaleGestureListenerC65851TvC {
    public final C120985dq A00;
    public final C37616GhB A01;
    public final InterfaceC16820sZ A02;
    public final Activity A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final SPM A06;
    public final AbstractC25398BLp A07;
    public final String A08;
    public final boolean A09;

    @Override // X.ScaleGestureDetectorOnScaleGestureListenerC65851TvC
    public final void A00(MotionEvent motionEvent) {
        super.A00(motionEvent);
        A02(motionEvent, ReelsMediaInteractivityType.A05);
        AbstractC25398BLp abstractC25398BLp = this.A07;
        if (!AbstractC25397BLo.A00(abstractC25398BLp.A0D)) {
            if (!C1LE.A0D(this.A05) || !abstractC25398BLp.A05) {
                BWT bwt = abstractC25398BLp.A04;
                if (bwt != null) {
                    bwt.A01();
                }
                abstractC25398BLp.A05 = false;
            }
        }
    }

    @Override // X.ScaleGestureDetectorOnScaleGestureListenerC65851TvC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        super.onLongPress(motionEvent);
        AbstractC25398BLp abstractC25398BLp = this.A07;
        if (AbstractC25397BLo.A00(abstractC25398BLp.A0D)) {
            abstractC25398BLp.A08();
            return;
        }
        BWT bwt = abstractC25398BLp.A04;
        if (bwt == null) {
            return;
        }
        bwt.A00();
    }

    @Override // X.ScaleGestureDetectorOnScaleGestureListenerC65851TvC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        boolean z = false;
        C14360o3.A0B(motionEvent, 0);
        A02(motionEvent, ReelsMediaInteractivityType.A06);
        AbstractC25398BLp abstractC25398BLp = this.A07;
        if (abstractC25398BLp.A0D.A0F()) {
            UserSession userSession = this.A05;
            if (C1LE.A07(userSession) && C1LE.A0D(userSession)) {
                boolean z2 = abstractC25398BLp.A05;
                BWT bwt = abstractC25398BLp.A04;
                if (z2) {
                    if (bwt != null) {
                        bwt.A01();
                    }
                } else {
                    if (bwt != null) {
                        bwt.A00();
                    }
                    z = true;
                }
                abstractC25398BLp.A05 = z;
            }
        }
        return super.onSingleTapConfirmed(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27345C5a(Activity activity, C65850TvB c65850TvB, C120985dq c120985dq, JPb jPb, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SPM spm, InterfaceC31137Dmc interfaceC31137Dmc, AbstractC25398BLp abstractC25398BLp, C37616GhB c37616GhB, C54650OCc c54650OCc, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        super(abstractC25398BLp.A06, c65850TvB, abstractC25398BLp.A0D, jPb, abstractC25398BLp.A0H, interfaceC31137Dmc, c54650OCc);
        AbstractC167027dH.A13(interfaceC31137Dmc, jPb, abstractC25398BLp);
        AbstractC25233BEq.A0y(7, c37616GhB, userSession, interfaceC11380iw);
        C14360o3.A0B(c120985dq, 10);
        this.A07 = abstractC25398BLp;
        this.A09 = z;
        this.A08 = str;
        this.A02 = interfaceC16820sZ;
        this.A01 = c37616GhB;
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
        this.A00 = c120985dq;
        this.A03 = activity;
        this.A06 = spm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [X.CPi, java.lang.Object] */
    public final void A02(MotionEvent motionEvent, ReelsMediaInteractivityType reelsMediaInteractivityType) {
        InterfaceC31130DmD Bm3;
        AbstractC25398BLp abstractC25398BLp = this.A07;
        int A0B = AbstractC25230BEn.A0B(abstractC25398BLp.A0A);
        C38321qM c38321qM = (C38321qM) abstractC25398BLp.A09.A00;
        if (c38321qM != null && (Bm3 = c38321qM.A0C.Bm3()) != null) {
            String BNT = c38321qM.A0C.BNT();
            if (BNT == null) {
                BNT = this.A08;
            }
            PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            View view = super.A00;
            if (view != null) {
                BFI bfi = new BFI(A0B, 45, this, view);
                ?? obj = new Object();
                C25419BMk c25419BMk = C25419BMk.A00;
                C120985dq c120985dq = this.A00;
                C37616GhB c37616GhB = this.A01;
                C40971v4 A06 = abstractC25398BLp.A0D.A06();
                C75113Zb c75113Zb = abstractC25398BLp.A0I;
                c25419BMk.A02(this.A03, pointF, view, reelsMediaInteractivityType, Bm3, c120985dq, this.A04, this.A05, c75113Zb, A06, this.A06, obj, c37616GhB, BNT, bfi, false, false);
                abstractC25398BLp.A08();
            }
        }
    }
}
