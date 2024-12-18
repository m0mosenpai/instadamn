package X;

import android.app.Activity;
import android.view.View;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.io.File;

/* renamed from: X.8HV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8HV {
    public final /* synthetic */ C8HI A00;

    public final void A01(Y1s y1s, int i, boolean z, boolean z2) {
        String str;
        BackgroundGradientColors A02;
        C8HI c8hi = this.A00;
        C6WQ c6wq = c8hi.A0F;
        if (c6wq != null) {
            c6wq.dismiss();
            c8hi.A0F = null;
        }
        if (!z) {
            C8HI.A08(c8hi);
            AbstractC183338Bg.A00(c8hi.A0f).A0N("Boomerang failed", AnonymousClass001.A0R("camera_destination ", ((C55U) c8hi.A0g.A08.A00).A02));
            return;
        }
        C8IE c8ie = c8hi.A0m;
        y1s.getClass();
        c8ie.A00 = y1s;
        C1821786b c1821786b = c8hi.A0v;
        c1821786b.A0K = false;
        C1821786b.A06(c1821786b);
        C8FG c8fg = c8hi.A14;
        if (c8fg != null) {
            C88X A0D = c8fg.A0D();
            if (A0D == null) {
                C8HI.A0F(C8HI.__redex_internal_original_name, "BurstFramesCaptureListener.onFinish() dialElement is null");
            } else {
                C88Z c88z = A0D.A04;
                if (c88z == null) {
                    c88z = C88Z.A0G;
                }
                if (c88z == C88Z.A04) {
                    c8hi.A13.A0C(true);
                }
            }
        }
        Integer A0N = c8hi.A0N();
        if (A0N != null && 1 == A0N.intValue()) {
            str = "front";
        } else {
            str = "back";
        }
        c8hi.A0w.A02.A08(C05F.A00);
        long currentTimeMillis = System.currentTimeMillis();
        int intValue = y1s.A00(Y1s.A0L).intValue();
        int intValue2 = y1s.A00(Y1s.A0K).intValue();
        int intValue3 = y1s.A00(Y1s.A0M).intValue();
        Object A01 = y1s.A01(Y1s.A0S);
        A01.getClass();
        C195868lW c195868lW = new C195868lW(new File((String) A01), null, str, intValue, intValue2, intValue3, currentTimeMillis, currentTimeMillis, false, false, false);
        UserSession userSession = c8hi.A0f;
        C1810981l c1810981l = c8hi.A0g;
        if (C9O6.A00(userSession, (C55U) c1810981l.A08.A00)) {
            C1126256q c1126256q = new C1126256q();
            C1125856m c1125856m = new C1125856m(EnumC1125356h.VIDEO);
            c1125856m.A02(new C1125656k(new File(c195868lW.A0k)).A00());
            c1126256q.A04(new C1125956n(c1125856m));
            c195868lW.A0O = new MediaComposition(c1126256q);
        }
        if (c1810981l.A0W(C81W.A0B)) {
            c195868lW.A1I = true;
            c195868lW.A0l = c8hi.A08.A0T.A00;
            c195868lW.A13 = true;
            c195868lW.A1A = z2;
            c195868lW.A0c = Integer.valueOf(i);
            c195868lW.A07 = 6000;
        }
        c195868lW.A01 = y1s.A00(Y1s.A0J).intValue();
        if (c8hi.A1W) {
            c8ie.A07(c195868lW);
        }
        if (C1828689h.A00(c8hi.A0i, "boomerang_capture")) {
            A02 = new BackgroundGradientColors(-16711936, -65281);
        } else {
            A02 = AbstractC209669Pc.A02(new File(c195868lW.A0k));
        }
        c195868lW.A0U = AbstractC14620oa.A01(A02, c195868lW.A09);
        C183348Bh A00 = AbstractC183338Bg.A00(userSession);
        A00.A05 = A00.A0K.A02(17636574, A00.A05);
        c8hi.A0B.A06(c195868lW);
    }

    public C8HV(C8HI c8hi) {
        this.A00 = c8hi;
    }

    public final void A00(float f) {
        C8HI c8hi = this.A00;
        if (c8hi.A0Y() && c8hi.A0g.A0W(C81W.A0B)) {
            c8hi.A1I.setVideoRecordingProgress(f);
        }
    }

    public final void A02(boolean z) {
        C8HI c8hi = this.A00;
        C184658Hg c184658Hg = c8hi.A0n;
        c184658Hg.A09(0);
        c8hi.A1I.Dp4("burst_capture_completed");
        View view = c184658Hg.A0A;
        view.animate().cancel();
        view.setVisibility(8);
        if (!z) {
            C8HI.A08(c8hi);
            AbstractC183338Bg.A00(c8hi.A0f).A0N("Boomerang capture failed", AnonymousClass001.A0R("camera_destination ", ((C55U) c8hi.A0g.A08.A00).A02));
            return;
        }
        C6WQ c6wq = c8hi.A0F;
        if (c6wq != null) {
            c6wq.dismiss();
            c8hi.A0F = null;
        }
        Activity activity = c8hi.A0P;
        C6WQ c6wq2 = new C6WQ(activity);
        c8hi.A0F = c6wq2;
        c6wq2.A00(activity.getString(2131969964));
        C0fJ.A00(c8hi.A0F);
    }
}
