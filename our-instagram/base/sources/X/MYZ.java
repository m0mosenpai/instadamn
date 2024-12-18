package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes9.dex */
public final class MYZ {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public final C1QT A0A;
    public final C24Q A0B;
    public final InterfaceC11380iw A0C;
    public final C18920wW A0D;
    public final UserSession A0E;
    public final C8JY A0F;

    public MYZ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A0E = userSession;
        C19270xB A0D = AbstractC31171DnF.A0D("feed_creation");
        this.A0C = A0D;
        this.A0D = AbstractC12220kQ.A01(A0D, userSession);
        this.A0B = new C24Q(userSession);
        this.A0A = C1QS.A00(userSession);
        this.A0F = C8JX.A00(userSession);
        this.A04 = 288429634L;
        this.A02 = 288425357L;
        this.A09 = 288429169L;
        this.A06 = 288436299L;
        this.A03 = 288439403L;
        this.A08 = 288428278L;
        this.A01 = 288435480L;
        this.A05 = 288435925L;
        this.A00 = 288430453L;
    }

    public final void A00() {
        this.A09 = this.A0B.A02(288429169, this.A09);
    }

    public final void A01() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0D, "ig_camera_nux");
        MSW.A1R(A0f, "FEED_POST_CAP_MUSIC_TRAY_ADD_FILTER");
        A0f.AAP("nux_step", "OPEN");
        AbstractC50522MSa.A1E(A0f, "camera_session_id", AbstractC193278h7.A00(this.A0E).A00());
        AbstractC31175DnJ.A14(A0f, this.A0C);
        MSX.A1C(A0f);
        A0f.Cht();
    }

    public final void A02() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0D, "ig_camera_nux");
        MSW.A1R(A0f, "FEED_POST_CAP_MUSIC_TRAY_ADD_MUSIC");
        A0f.AAP("nux_step", "OPEN");
        AbstractC50522MSa.A1E(A0f, "camera_session_id", AbstractC193278h7.A00(this.A0E).A00());
        AbstractC31175DnJ.A14(A0f, this.A0C);
        MSX.A1C(A0f);
        A0f.Cht();
    }

    public final void A03(C22P c22p) {
        C24Q c24q = this.A0B;
        long A03 = c24q.A03(288435480, this.A01);
        this.A01 = A03;
        c24q.A0A(A03, "camera_destination", "feed");
        if (c22p != null) {
            c24q.A0A(this.A01, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c22p.name());
        }
    }

    public final void A04(C22P c22p) {
        C24Q c24q = this.A0B;
        long A03 = c24q.A03(288430453, this.A00);
        this.A00 = A03;
        c24q.A0A(A03, "camera_destination", "feed");
        if (c22p != null) {
            c24q.A0A(this.A00, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c22p.name());
        }
    }

    public final void A05(C22P c22p) {
        C24Q c24q = this.A0B;
        long A03 = c24q.A03(288429169, 15000L);
        this.A09 = A03;
        c24q.A0A(A03, "camera_destination", "feed");
        if (c22p != null) {
            c24q.A0A(this.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c22p.name());
        }
    }

    public final void A06(C22P c22p, int i, boolean z) {
        C24Q c24q = this.A0B;
        long A03 = c24q.A03(288436299, 10000L);
        this.A06 = A03;
        c24q.A0A(A03, "camera_destination", "feed");
        if (c22p != null) {
            c24q.A0A(this.A06, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c22p.name());
        }
        c24q.A0A(this.A06, "from_draft", String.valueOf(z));
        c24q.A0A(this.A06, "number_of_media", String.valueOf(i));
    }

    public final void A07(String str) {
        this.A02 = this.A0B.A07(String.valueOf(str), "", 288425357, this.A02);
    }

    public final void A08(String str) {
        this.A09 = this.A0B.A07(String.valueOf(str), "", 288429169, this.A09);
    }

    public final void A09(String str) {
        this.A04 = this.A0B.A07(String.valueOf(str), "", 288429634, this.A04);
    }

    public final void A0A(boolean z, String str) {
        long A07;
        UserSession userSession = this.A0E;
        if (z) {
            AbstractC208269Jl.A00(userSession).A02();
            A07 = this.A0B.A02(288439403, this.A03);
        } else {
            C43822JZk A00 = AbstractC208269Jl.A00(userSession);
            String str2 = str;
            C0J8.A01();
            C24Q c24q = A00.A04;
            long j = A00.A00;
            if (str == null) {
                str2 = AbstractC43591JPw.A00(1006);
            }
            A00.A00 = c24q.A07(str2, "", 585177486, j);
            A07 = this.A0B.A07(String.valueOf(str), "", 288439403, this.A03);
        }
        this.A03 = A07;
    }

    public final void A0B(boolean z, String str) {
        long j = this.A06;
        if (j != 288436299) {
            C24Q c24q = this.A0B;
            if (z) {
                this.A06 = c24q.A02(288436299, j);
                C8JY c8jy = this.A0F;
                long j2 = c8jy.A00;
                if (j2 != 0) {
                    c8jy.A02.flowMarkPoint(j2, "FEED_POST_CAPTURE_ENTERED");
                    return;
                }
                return;
            }
            this.A06 = c24q.A07(String.valueOf(str), "", 288436299, j);
            this.A0F.A01(String.valueOf(str));
        }
    }

    public final void A0C(boolean z, String str) {
        long A07;
        if (z) {
            A07 = this.A0B.A02(288428278, this.A08);
        } else {
            A07 = this.A0B.A07(String.valueOf(str), "", 288428278, this.A08);
        }
        this.A08 = A07;
    }
}
