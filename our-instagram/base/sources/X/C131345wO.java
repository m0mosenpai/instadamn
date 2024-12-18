package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5wO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131345wO implements InterfaceC11380iw, InterfaceC12850lX, InterfaceC13000lm {
    public static final long A02 = TimeUnit.HOURS.toMillis(2);
    public static final String __redex_internal_original_name = "QPSurveyController";
    public MTZ A00;
    public final UserSession A01;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2fr, java.lang.Object] */
    private final void A00(Activity activity) {
        if (activity != null) {
            MTZ mtz = this.A00;
            if (mtz != null && activity == mtz.A00) {
                return;
            }
            if (!(activity instanceof FragmentActivity)) {
                this.A00 = null;
                C0w9.A03("IG-QP", "Activity is not fragment activity");
            } else {
                UserSession userSession = this.A01;
                QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A1A;
                AbstractC54912fq.A00();
                this.A00 = AbstractC54912fq.A00().A01((FragmentActivity) activity, this, userSession, new Object().A00(), quickPromotionSlot);
            }
        }
    }

    @Override // X.InterfaceC12850lX
    public final void Cuw(Activity activity) {
        C14360o3.A0B(activity, 0);
        A00(activity);
    }

    @Override // X.InterfaceC12850lX
    public final void Cux(Activity activity) {
        C14360o3.A0B(activity, 0);
        A00(activity);
    }

    @Override // X.InterfaceC12850lX
    public final void Cuy(Activity activity) {
        C14360o3.A0B(activity, 0);
        MTZ mtz = this.A00;
        if (mtz != null && activity == mtz.A00) {
            this.A00 = null;
        }
    }

    @Override // X.InterfaceC12850lX
    public final void Cv0(Activity activity) {
        C14360o3.A0B(activity, 0);
    }

    @Override // X.InterfaceC12850lX
    public final void Cv5(Activity activity) {
        C14360o3.A0B(activity, 0);
        A00(activity);
    }

    @Override // X.InterfaceC12850lX
    public final void Cv6(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv7(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv8(Activity activity, boolean z) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "quick_promotion_survey_controller";
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x002d, code lost:
    
        if ((((X.C131355wP) r3.A01(X.C131355wP.class, new X.C57239PbN(r3, 5))).A00.getLong(X.AnonymousClass001.A0R("id_request_time_millis_", r7), -1) + X.C131345wO.A02) <= java.lang.System.currentTimeMillis()) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(android.app.Activity r6, java.lang.String r7, java.util.Map r8, boolean r9) {
        /*
            r5 = this;
            if (r9 != 0) goto L2f
            com.instagram.common.session.UserSession r3 = r5.A01
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            java.lang.Class<X.5wP> r2 = X.C131355wP.class
            r1 = 5
            X.PbN r0 = new X.PbN
            r0.<init>(r3, r1)
            java.lang.Object r0 = r3.A01(r2, r0)
            X.5wP r0 = (X.C131355wP) r0
            X.0xq r3 = r0.A00
            java.lang.String r0 = "id_request_time_millis_"
            java.lang.String r2 = X.AnonymousClass001.A0R(r0, r7)
            r0 = -1
            long r3 = r3.getLong(r2, r0)
            long r0 = X.C131345wO.A02
            long r3 = r3 + r0
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L3d
        L2f:
            r5.A00(r6)
            X.MTZ r3 = r5.A00
            if (r3 != 0) goto L41
            java.lang.String r1 = "IG-QP"
            java.lang.String r0 = "survey requested but delegate is null."
            X.C0w9.A03(r1, r0)
        L3d:
            X.AbstractC116275Og.A00()
            return
        L41:
            if (r8 != 0) goto L48
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
        L48:
            java.lang.String r0 = "integration_point_id"
            r8.put(r0, r7)
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A27
            java.util.EnumSet r2 = java.util.EnumSet.of(r0)
            X.C14360o3.A07(r2)
            X.2gX r1 = r3.A09
            java.lang.String r0 = "ad_hoc_trigger"
            r1.AWE(r0, r2)
            boolean r0 = X.AbstractC55352ga.A00(r3, r8, r2, r9)
            if (r0 == 0) goto L3d
            com.instagram.common.session.UserSession r3 = r5.A01
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            java.lang.Class<X.5wP> r2 = X.C131355wP.class
            r1 = 5
            X.PbN r0 = new X.PbN
            r0.<init>(r3, r1)
            java.lang.Object r0 = r3.A01(r2, r0)
            X.5wP r0 = (X.C131355wP) r0
            long r1 = java.lang.System.currentTimeMillis()
            X.0xq r0 = r0.A00
            X.0xo r3 = r0.ARD()
            java.lang.String r0 = "id_request_time_millis_"
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r7)
            r3.E7G(r0, r1)
            r3.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131345wO.A01(android.app.Activity, java.lang.String, java.util.Map, boolean):void");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(C131345wO.class);
        AbstractC12860lY.A08(this);
    }

    public C131345wO(UserSession userSession) {
        this.A01 = userSession;
        AbstractC12860lY.A07(this);
    }
}
