package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public final class BYn extends GestureDetector.SimpleOnGestureListener {
    public View A00;
    public final Context A01;
    public final GestureDetector A02;
    public final UserSession A03;
    public final C120985dq A04;
    public final C37644Ghd A05;
    public final InterfaceC31010Dk9 A06;
    public final C37616GhB A07;
    public final boolean A08;

    public BYn(Context context, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC31010Dk9 interfaceC31010Dk9, C37616GhB c37616GhB, boolean z) {
        C14360o3.A0B(c37644Ghd, 3);
        AbstractC167017dG.A1T(interfaceC31010Dk9, c37616GhB);
        this.A01 = context;
        this.A04 = c120985dq;
        this.A05 = c37644Ghd;
        this.A03 = userSession;
        this.A06 = interfaceC31010Dk9;
        this.A07 = c37616GhB;
        this.A08 = z;
        this.A02 = new GestureDetector(context, this, AbstractC167007dF.A0J());
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        Float f;
        Float f2;
        C14360o3.A0B(motionEvent, 0);
        InterfaceC31010Dk9 interfaceC31010Dk9 = this.A06;
        C120985dq c120985dq = this.A04;
        C37644Ghd c37644Ghd = this.A05;
        UserSession userSession = this.A03;
        User A09 = c120985dq.A09(userSession);
        C65 A01 = C76493bt.A01(c120985dq);
        View view = this.A00;
        String str = "header_expanded_tap_area";
        if (view != null) {
            StringBuilder sb = new StringBuilder("header_expanded_tap_area");
            float x = motionEvent.getX();
            Context context = this.A01;
            C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 0);
            if (x <= AbstractC13880nE.A00(context, AbstractC25225BEi.A00(A0j, userSession, 37170931902251547L))) {
                sb.append("_start");
            }
            float x2 = motionEvent.getX();
            float A07 = AbstractC166987dD.A07(view);
            C14360o3.A0B(userSession, 0);
            if (x2 >= A07 - AbstractC13880nE.A00(context, AbstractC25225BEi.A00(A0j, userSession, 37170931902317084L))) {
                sb.append("_end");
            }
            if (motionEvent.getY() <= AbstractC13880nE.A00(context, AbstractC25225BEi.A00(A0j, userSession, 37170931902382621L))) {
                sb.append("_top");
            }
            if (motionEvent.getY() >= AbstractC166987dD.A08(view) - AbstractC13880nE.A00(context, AbstractC25225BEi.A00(A0j, userSession, 37170931902448158L))) {
                sb.append("_bottom");
            }
            str = AbstractC166987dD.A19(sb);
        }
        Float valueOf = Float.valueOf(motionEvent.getX());
        Float valueOf2 = Float.valueOf(motionEvent.getY());
        boolean z = this.A08;
        View view2 = this.A00;
        if (view2 != null) {
            f = Float.valueOf(motionEvent.getX() / AbstractC166987dD.A07(view2));
        } else {
            f = null;
        }
        View view3 = this.A00;
        if (view3 != null) {
            f2 = Float.valueOf(motionEvent.getY() / AbstractC166987dD.A08(view3));
        } else {
            f2 = null;
        }
        interfaceC31010Dk9.Dbc(null, c120985dq, c37644Ghd, A01, A09, null, null, valueOf, valueOf2, f, f2, str, null, null, null, false, z);
        View view4 = this.A00;
        if (view4 != null) {
            this.A07.A06(view4, null, null);
            return true;
        }
        return true;
    }
}
