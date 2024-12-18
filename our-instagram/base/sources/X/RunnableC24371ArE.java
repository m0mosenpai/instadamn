package X;

import android.content.Context;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.ArE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24371ArE implements Runnable {
    public final /* synthetic */ C8JN A00;

    public RunnableC24371ArE(C8JN c8jn) {
        this.A00 = c8jn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8HI c8hi = this.A00.A09;
        ShutterButton shutterButton = c8hi.A1I;
        shutterButton.setHandsFreeRecordingEnabled(true);
        C1821786b c1821786b = c8hi.A0v;
        c1821786b.A0B = true;
        C1821786b.A06(c1821786b);
        c8hi.A0p.setEnabled(false);
        if (AbstractC27671Vv.A00 != null) {
            if (C3ER.A00().A02(c8hi.A0P, c8hi.A0f)) {
                c8hi.A0m.A05();
                shutterButton.A04(CancelReason.SYSTEM_CANCELLED, "Single Tap in Video Call");
                return;
            }
        }
        if (c8hi.A1U) {
            UserSession userSession = c8hi.A0f;
            C14360o3.A0B(userSession, 0);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36320468248371733L) && ((!c8hi.A1Q || !C18U.A06(c06090Tz, userSession, 36321722382427927L)) && !C1H6.A03())) {
                Context context = AbstractC12290kX.A00;
                shutterButton.setShutterButtonSingularColor(context.getColor(AbstractC53242c7.A04(context)));
            }
        }
        c8hi.A16.A03 = true;
        shutterButton.A0i.A01("start_handsfree_recording");
        c8hi.A1F.A00().A00();
    }
}
