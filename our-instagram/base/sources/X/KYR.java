package X;

import android.view.View;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController;
import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes8.dex */
public final class KYR extends C33H {
    public final int A00;
    public final Object A01;

    public KYR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C5SW A00(C5SU c5su, Object obj, int i) {
        c5su.A04 = new KYR(obj, i);
        return c5su.A00();
    }

    @Override // X.C33H, X.C33I
    public final void Dto(C5SW c5sw) {
        switch (this.A00) {
            case 1:
                ((C25814BbV) this.A01).A03 = false;
                return;
            case 2:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            default:
                super.Dto(c5sw);
                return;
            case 3:
                C14360o3.A0B(c5sw, 0);
                C50868Mdz c50868Mdz = ((ClipsTimelineActionBarViewController) this.A01).A05.A0A;
                if (c50868Mdz == null) {
                    return;
                }
                c50868Mdz.A09 = false;
                C50868Mdz.A01(c50868Mdz.A0F.A0E(), c50868Mdz);
                return;
            case 4:
                AlbumEditFragment albumEditFragment = (AlbumEditFragment) this.A01;
                AbstractC23021Ah.A00(albumEditFragment.A0L()).A1V(true);
                AbstractC167007dF.A0J().post(new M0C(albumEditFragment));
                return;
            case 6:
                C50724MaP c50724MaP = (C50724MaP) this.A01;
                AbstractC23021Ah.A00(c50724MaP.A0C()).A1V(true);
                if (c50724MaP.getActivity() == null || !c50724MaP.isVisible()) {
                    return;
                }
                InterfaceC58286Pse interfaceC58286Pse = c50724MaP.A0P;
                if (interfaceC58286Pse == null) {
                    C14360o3.A0F("provider");
                    throw C00O.createAndThrow();
                }
                View findViewById = interfaceC58286Pse.BQj().findViewById(R.id.feed_creation_filter_button);
                findViewById.post(new RunnableC49934M3b(findViewById, c50724MaP));
                return;
            case 11:
                InterfaceC19630xq A0x = AbstractC166987dD.A0x(((C47428KxJ) this.A01).A00);
                AbstractC167007dF.A18(A0x, "camera_reply_tooltip_impression_count", AbstractC31172DnG.A01(A0x, "camera_reply_tooltip_impression_count") + 1);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C38Z c38z = (C38Z) this.A01;
                InterfaceC145156ga interfaceC145156ga = c38z.A01;
                if (interfaceC145156ga != null) {
                    interfaceC145156ga.Dtn();
                }
                c38z.A02 = false;
                return;
            case 14:
                C47677L3k c47677L3k = ((M62) this.A01).A01;
                C47423KxE c47423KxE = c47677L3k.A00;
                if (c47423KxE != null) {
                    c47423KxE.A00.A0X("resume");
                }
                c47677L3k.A01 = null;
                c47677L3k.A02 = null;
                return;
            case Process.SIGTERM /* 15 */:
                M7G m7g = (M7G) this.A01;
                C148796mo c148796mo = m7g.A07;
                c148796mo.A00 = null;
                View view = m7g.A01;
                Runnable runnable = c148796mo.A02;
                if (runnable != null) {
                    view.removeCallbacks(runnable);
                }
                c148796mo.A02 = null;
                InterfaceC145156ga interfaceC145156ga2 = c148796mo.A01;
                if (interfaceC145156ga2 == null) {
                    return;
                }
                interfaceC145156ga2.Dtn();
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C33H, X.C33I
    public final void Dtt(C5SW c5sw) {
        String str;
        int A01;
        InterfaceC19610xo ARD;
        long currentTimeMillis;
        String str2;
        UserSession A0L;
        UserSession A0L2;
        int A012;
        switch (this.A00) {
            case 0:
                C23031Ai A00 = AbstractC23021Ah.A00(((LO8) this.A01).A0I);
                AbstractC167007dF.A1L(A00, A00.A45, C23031Ai.A8c, 104, true);
                return;
            case 1:
                InterfaceC19630xq A0x = AbstractC166987dD.A0x(((C25814BbV) this.A01).A0E);
                str = "clips_visual_reply_creation_exposure_count";
                A01 = AbstractC31172DnG.A01(A0x, "clips_visual_reply_creation_exposure_count");
                ARD = A0x.ARD();
                A012 = A01 + 1;
                ARD.E7D(str, A012);
                ARD.apply();
                return;
            case 2:
                C23031Ai A002 = AbstractC23021Ah.A00(((C43851JaF) this.A01).A04);
                currentTimeMillis = System.currentTimeMillis();
                ARD = AbstractC166987dD.A0w(A002);
                str2 = "smart_albums_tooltip_impression_count";
                ARD.E7G(str2, currentTimeMillis);
                ARD.apply();
                return;
            case 3:
                C14360o3.A0B(c5sw, 0);
                ((ClipsTimelineActionBarViewController) this.A01).A04.A07 = true;
                return;
            case 4:
                C14360o3.A0B(c5sw, 0);
                A0L = ((AlbumEditFragment) this.A01).A0L();
                MX1.A01(A0L).A02();
                return;
            case 5:
                C14360o3.A0B(c5sw, 0);
                A0L2 = ((AlbumEditFragment) this.A01).A0L();
                MX1.A01(A0L2).A01();
                return;
            case 6:
                C14360o3.A0B(c5sw, 0);
                A0L = ((C50724MaP) this.A01).A0C();
                MX1.A01(A0L).A02();
                return;
            case 7:
                C14360o3.A0B(c5sw, 0);
                A0L2 = ((C50724MaP) this.A01).A0C();
                MX1.A01(A0L2).A01();
                return;
            case 8:
                AbstractC23021Ah.A00((UserSession) this.A01).A1K(false);
                return;
            case 9:
                ARD = AbstractC167017dG.A0g(((C23031Ai) this.A01).A01, AbstractC111324zv.A00(1985));
                currentTimeMillis = System.currentTimeMillis();
                str2 = AbstractC111324zv.A00(1984);
                ARD.E7G(str2, currentTimeMillis);
                ARD.apply();
                return;
            case 10:
                C2056398n A003 = AbstractC2056298m.A00(((JR2) this.A01).A0p());
                currentTimeMillis = AbstractC31177DnL.A06();
                InterfaceC19630xq interfaceC19630xq = A003.A00;
                InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                ARD2.E7G("inbox_pill_impression_count", AbstractC31175DnJ.A03(interfaceC19630xq, "inbox_pill_impression_count") + 1);
                ARD2.apply();
                ARD = interfaceC19630xq.ARD();
                str2 = "inbox_pill_last_impression_timestamp";
                ARD.E7G(str2, currentTimeMillis);
                ARD.apply();
                return;
            case 11:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            default:
                super.Dtt(c5sw);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ARD = ((LLk) this.A01).A0s.A00.ARD();
                ARD.E77("has_seen_pending_inbox_filter_tooltip", true);
                ARD.apply();
                return;
            case 14:
                InterfaceC19630xq A0x2 = AbstractC166987dD.A0x(((M62) this.A01).A01.A04);
                str = "direct_poll_tooltip_impression_count";
                A012 = AbstractC31172DnG.A01(A0x2, "direct_poll_tooltip_impression_count") + 1;
                ARD = A0x2.ARD();
                ARD.E7D(str, A012);
                ARD.apply();
                return;
            case Process.SIGTERM /* 15 */:
                M7G m7g = (M7G) this.A01;
                InterfaceC148826mr interfaceC148826mr = m7g.A06;
                C148796mo c148796mo = m7g.A07;
                interfaceC148826mr.Dtu(m7g.A00, c148796mo.A03, c148796mo.A04, m7g.A03, m7g.A04);
                return;
            case 16:
                InterfaceC19630xq A0x3 = AbstractC166987dD.A0x(((ReelDashboardFragment) this.A01).A06);
                ARD = A0x3.ARD();
                str = "reel_dashboard_add_to_story_nux_seen_count";
                A01 = AbstractC31172DnG.A01(A0x3, "reel_dashboard_add_to_story_nux_seen_count");
                A012 = A01 + 1;
                ARD.E7D(str, A012);
                ARD.apply();
                return;
        }
    }
}
