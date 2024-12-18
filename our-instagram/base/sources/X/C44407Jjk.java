package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Jjk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44407Jjk extends GestureDetector.SimpleOnGestureListener {
    public View A00;
    public boolean A01;
    public final /* synthetic */ C76223bS A02;
    public final /* synthetic */ C77123cy A03;
    public final /* synthetic */ C26557BoG A04;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View view;
        C81543kP A0g;
        String str;
        C14360o3.A0B(motionEvent, 0);
        if (!this.A01 && (view = this.A00) != null) {
            C26557BoG c26557BoG = this.A04;
            C77123cy c77123cy = this.A03;
            C76223bS c76223bS = this.A02;
            view.performHapticFeedback(0);
            C26557BoG.A03(view, c77123cy);
            Jn5 jn5 = c26557BoG.A03;
            C167297di c167297di = c26557BoG.A00;
            Integer num = c167297di.A0G;
            int i = 0;
            if (num != null && num.intValue() > 0) {
                i = 16;
            }
            Rect A0U = AbstractC166987dD.A0U();
            view.getGlobalVisibleRect(A0U);
            A0U.bottom += AbstractC25232BEp.A0l(c76223bS, i);
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            C05A c05a = jn5.A0D;
            String str2 = c167297di.A0K;
            String str3 = c167297di.A0N;
            c05a.Egh(new K2I(new PointF(rawX, rawY), A0U, c167297di.A05, c167297di.A0C, str2, str3, c167297di.A0S, c167297di.A0Z, jn5.A03.A0f));
            jn5.A05.A0Q(str2, str3, true);
            LKh lKh = jn5.A08;
            boolean z = c167297di.A0V;
            C2EC A00 = LKh.A00(lKh);
            if (A00 != null && (A0g = AbstractC31172DnG.A0g(A00)) != null) {
                C09530e4 A02 = LKh.A02(lKh);
                C09530e4 A03 = LKh.A03(lKh, A0g, A00);
                if (z) {
                    str = "True";
                } else {
                    str = "False";
                }
                AbstractC31172DnG.A0d(lKh.A04).A0W("comment_options_menu_rendered", "tap", "comment_row", "comments_view", A00.C7I(), A00.C7q(), AbstractC06930Yk.A07(AbstractC167007dF.A1b("is_reply", str, A02, A03)), A00.AdZ());
            }
            this.A01 = true;
        }
    }

    public C44407Jjk(C76223bS c76223bS, C77123cy c77123cy, C26557BoG c26557BoG) {
        this.A04 = c26557BoG;
        this.A02 = c76223bS;
        this.A03 = c77123cy;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C81543kP A0g;
        String str;
        C26557BoG c26557BoG = this.A04;
        String str2 = c26557BoG.A02.A05;
        if (str2 == null || str2.length() == 0) {
            C167297di c167297di = c26557BoG.A00;
            if (!c167297di.A0S) {
                View view = this.A00;
                if (view != null) {
                    view.performHapticFeedback(0);
                }
                Jn5 jn5 = c26557BoG.A03;
                AbstractC77363dM.A00(this.A02);
                String str3 = c167297di.A0K;
                String str4 = c167297di.A0N;
                Jn5.A03(jn5, str3, str4, c167297di.A0C.getId(), false);
                LKh lKh = jn5.A08;
                boolean A1W = AbstractC167007dF.A1W(str4);
                C2EC A00 = LKh.A00(lKh);
                if (A00 != null && (A0g = AbstractC31172DnG.A0g(A00)) != null) {
                    C09530e4 A02 = LKh.A02(lKh);
                    C09530e4 A03 = LKh.A03(lKh, A0g, A00);
                    if (A1W) {
                        str = "True";
                    } else {
                        str = "False";
                    }
                    AbstractC31172DnG.A0d(lKh.A04).A0W("like_comment", "tap", "comment_row", "comments_view", A00.C7I(), A00.C7q(), AbstractC06930Yk.A07(AbstractC167007dF.A1b("is_reply", str, A02, A03)), A00.AdZ());
                }
                this.A01 = true;
                return true;
            }
            return false;
        }
        return false;
    }

    public C44407Jjk() {
    }
}
