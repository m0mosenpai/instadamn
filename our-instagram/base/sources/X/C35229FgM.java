package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.FgM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35229FgM {
    public static String A0I;
    public FK5 A00;
    public C34571FLg A01;
    public WFQ A02;
    public C35029Fc2 A03;
    public C006802i A04;
    public FH7 A05;
    public boolean A06;
    public U56 A07;
    public final Context A08;
    public final Bundle A09;
    public final FragmentActivity A0B;
    public final C07270a1 A0D;
    public final Runnable A0E;
    public final InterfaceC09390do A0G;
    public final boolean A0H;
    public final AtomicBoolean A0F = new AtomicBoolean(false);
    public final Handler A0A = AbstractC167007dF.A0J();
    public final C1OK A0C = new C1OK();

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (X.AbstractC166987dD.A1a(X.AbstractC31179DnN.A0b(r20.A0D, (X.C52342aZ) X.G7F.A01.CES(X.G7F.A00, X.G7F.A02[0]))) == false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C35229FgM r20) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35229FgM.A00(X.FgM):void");
    }

    public static final void A01(C35229FgM c35229FgM) {
        C006802i c006802i = c35229FgM.A04;
        String str = "qpl";
        if (c006802i != null) {
            c006802i.markerAnnotate(896612552, "landing_page", "cds_error");
            c006802i.markerEnd(896612552, (short) 3);
            C34571FLg c34571FLg = c35229FgM.A01;
            c34571FLg.A02.post(new GKV(c34571FLg));
            A03(c35229FgM, false);
            View findViewById = c35229FgM.A0B.findViewById(R.id.layout_container_main);
            C14360o3.A07(findViewById);
            FrameLayout frameLayout = (FrameLayout) findViewById;
            if (c35229FgM.A06) {
                FK5 fk5 = c35229FgM.A00;
                if (fk5 == null) {
                    str = "nativeBackgroundView";
                } else {
                    C14360o3.A0B(frameLayout, 0);
                    fk5.A02.post(new RunnableC71401WtP(frameLayout, fk5));
                }
            }
            U56 u56 = c35229FgM.A07;
            C14360o3.A0B(frameLayout, 0);
            u56.A02.post(new RunnableC71531Wvg(frameLayout, u56, false));
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A02(C35229FgM c35229FgM, String str) {
        C006802i c006802i = c35229FgM.A04;
        if (c006802i == null) {
            C14360o3.A0F("qpl");
            throw C00O.createAndThrow();
        }
        c006802i.markerAnnotate(896612552, AbstractC111324zv.A00(2345), str);
        c006802i.markerPoint(896612552, "launching_login_aymh_entrypoints_screen");
        C07270a1 c07270a1 = c35229FgM.A0D;
        FragmentActivity fragmentActivity = c35229FgM.A0B;
        C14360o3.A0C(fragmentActivity, MSV.A00(9));
        c35229FgM.A0A.post(new GOY(AbstractC31172DnG.A0O(fragmentActivity, (InterfaceC11380iw) fragmentActivity, c07270a1), c35229FgM));
    }

    public static final void A03(C35229FgM c35229FgM, boolean z) {
        FK5 fk5 = c35229FgM.A00;
        if (fk5 != null) {
            if (z) {
                fk5.A02.postDelayed(new GKU(fk5), 1000L);
            } else {
                fk5.A02.post(new GKT(fk5));
            }
        }
    }

    public final void A04() {
        if (C1AD.A06(C06090Tz.A05, 2324147236411611499L)) {
            FBE.A00().A00(this.A08, this.A0D, null);
        }
        if (C1AD.A06(C06090Tz.A06, 18311713325659806L)) {
            C2AU.A08.A00(this.A08, C2AX.A00, this.A0D);
        }
        C07270a1 c07270a1 = this.A0D;
        C18720vz c18720vz = c07270a1.A00;
        Context A06 = c18720vz.A06();
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        A00.ATO(new C32659EZi(A06, this));
        A00.ATO(new C32660EZj(A06, this));
        Bundle bundle = this.A09;
        String string = bundle.getString("destination_id", "");
        if (!C14360o3.A0K(string, "emaillogin") && !C14360o3.A0K(string, "smslogin") && !C14360o3.A0K(bundle.getString("destination_id", ""), "stop_deletions_email_login") && !bundle.getBoolean("bypass", false)) {
            C006802i c006802i = this.A04;
            if (c006802i == null) {
                C14360o3.A0F("qpl");
                throw C00O.createAndThrow();
            }
            c006802i.A0S(896612552, 0, A0I);
            FragmentActivity fragmentActivity = this.A0B;
            Class<?> cls = fragmentActivity.getClass();
            Map map = C0YZ.A03;
            C14360o3.A0B(cls, 1);
            c006802i.markerAnnotate(896612552, "client_entrypoint", AbstractC13230m9.A01(cls));
            C62664SLa A002 = AbstractC61801Rtv.A00(c18720vz.A06());
            if (A002.A01 && A002.A02) {
                HashMap A003 = C36700GFv.A00(this.A08, c07270a1, A0I);
                C65981Txa A01 = C35205Ffx.A01(C35205Ffx.A00(), this, 4);
                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(c07270a1);
                A0C.A0R = "com.bloks.www.caa.login.oxygen_preloads_terms_of_service";
                A0C.A0C = A01;
                A0C.A0n = false;
                C102874kO c102874kO = new C102874kO(13784);
                c102874kO.A0Q(45, "CAA_OXYGEN_PRELOADS_TERMS_OF_SERVICE_SCREEN");
                C66277U6x A012 = C66277U6x.A01("com.bloks.www.caa.login.oxygen_preloads_terms_of_service", AbstractC191768eY.A01(A003));
                A012.A00 = 719983200;
                A012.A06 = "CAA_OXYGEN_PRELOADS_TERMS_OF_SERVICE_SCREEN";
                c102874kO.A0P();
                A012.A03 = c102874kO;
                A012.A06(fragmentActivity, A0C);
                return;
            }
            A00(this);
            return;
        }
        HashMap A1G = AbstractC166987dD.A1G();
        String str = "";
        A1G.put("uid", bundle.getString("uid", ""));
        A1G.put("token", bundle.getString("token", ""));
        A1G.put(CacheBehaviorLogger.SOURCE, bundle.getString(CacheBehaviorLogger.SOURCE, ""));
        Context context = this.A08;
        A1G.put(AbstractC31189DnY.A02(), C16030qx.A00(context));
        A1G.put("guid", AbstractC31172DnG.A10(context));
        String A02 = AbstractC31172DnG.A0P(c07270a1).A02(C19T.A20);
        if (A02 != null) {
            str = A02;
        }
        A1G.put("family_device_id", str);
        A1G.put("offline_experiment_group", "caa_iteration_v3_perf_ig_4");
        A1G.put("auto_send", bundle.getString("auto_send", "false"));
        A1G.put("is_bypass_login", Boolean.valueOf(bundle.getBoolean("bypass", false)));
        A1G.put("is_account_deletion_reactivation_login", Boolean.valueOf(C14360o3.A0K(bundle.getString("destination_id", ""), "stop_deletions_email_login")));
        C65981Txa A013 = C35205Ffx.A01(C35205Ffx.A00(), this, 4);
        IgBloksScreenConfig A0C2 = AbstractC31171DnF.A0C(c07270a1);
        A0C2.A0R = "com.bloks.www.caa.login.one_click_login_loading";
        A0C2.A0C = A013;
        A0C2.A0n = false;
        C66277U6x A014 = C66277U6x.A01("com.bloks.www.caa.login.one_click_login_loading", AbstractC191768eY.A01(A1G));
        A014.A00 = 719983200;
        A014.A06(this.A0B, A0C2);
    }

    public final void A05() {
        C006802i c006802i = this.A04;
        if (c006802i == null) {
            C14360o3.A0F("qpl");
            throw C00O.createAndThrow();
        }
        if (c006802i.isMarkerOn(896612552)) {
            c006802i.markerAnnotate(896612552, "activity_destroyed_but_marker_still_active", true);
        }
        this.A0A.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.Fc2, java.lang.Object] */
    public C35229FgM(Context context, Bundle bundle, FragmentActivity fragmentActivity, C07270a1 c07270a1) {
        this.A0B = fragmentActivity;
        this.A08 = context;
        this.A0D = c07270a1;
        this.A09 = bundle;
        C18720vz c18720vz = c07270a1.A00;
        this.A0H = AbstractC14490oL.A09(c18720vz.A06());
        this.A0E = new GM5(this);
        this.A0G = AbstractC09440dt.A00(EnumC09460dv.A02, GUF.A00);
        A0I = AbstractC166997dE.A0o();
        this.A03 = new Object();
        this.A05 = new FH7(c07270a1);
        this.A02 = new WFQ(AbstractC167007dF.A1Z(this.A0G) || C1AD.A06(C06090Tz.A06, 18309905144361048L));
        if (bundle.containsKey("is_logged_in_switcher")) {
            this.A06 = bundle.getBoolean("is_logged_in_switcher");
        }
        this.A04 = C006802i.A0p;
        GJS gjs = new GJS(this);
        C35776FrE c35776FrE = new C35776FrE(this);
        if (this.A06) {
            this.A00 = new FK5(context);
        }
        this.A01 = new C34571FLg(context, gjs);
        this.A07 = new U56(context, c35776FrE, AbstractC25291Lj.A00.C73(), gjs, new GJU(context));
        C14120nc.A00().ATO(new EZT(c18720vz.A06()));
        C14120nc.A00().ATO(new RcT(context, C19T.A2f, c07270a1));
    }
}
