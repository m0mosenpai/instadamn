package X;

import android.os.Handler;
import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.JZk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43822JZk implements InterfaceC13000lm {
    public long A00;
    public LJ0 A01;
    public boolean A02;
    public final C012504o A03;
    public final C24Q A04;
    public final UserSession A05;
    public final Handler A06;
    public final Runnable A07;

    public C43822JZk(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A05 = userSession;
        hashCode();
        this.A06 = AbstractC167007dF.A0J();
        this.A03 = new C012504o(0);
        this.A00 = 585177486L;
        this.A01 = LJ0.A04;
        this.A04 = new C24Q(C218914p.A08, userSession, new C43819JZh(), new C43820JZi());
        this.A07 = new M07(this);
    }

    public final void A06(EnumC114925Hg enumC114925Hg, C22P c22p) {
        C14360o3.A0B(c22p, 0);
        this.A04.A0D("falco_start_camera_session", this.A00, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c22p.toString(), "camera_destination", enumC114925Hg.toString());
    }

    public final void A08(String str) {
        String str2 = str;
        C0J8.A01();
        C24Q c24q = this.A04;
        long j = this.A00;
        if (str == null) {
            str2 = "reshare_failed";
        }
        this.A00 = c24q.A07(str2, "", 585177486, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r2.contains("draft_list_view_created") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C43822JZk r6) {
        /*
            X.24Q r5 = r6.A04
            long r0 = r6.A00
            r4 = 585177486(0x22e1198e, float:6.101343E-18)
            boolean r0 = r5.A0E(r4, r0)
            if (r0 == 0) goto L6b
            X.04o r2 = r6.A03
            X.C0J8.A01()
            java.lang.String r0 = "qcc_fully_visible"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "direct_gallery_visible"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "draft_list_view_created"
            boolean r0 = r2.contains(r0)
            r1 = 0
            if (r0 == 0) goto L2c
        L2b:
            r1 = 1
        L2c:
            java.lang.String r0 = "gallery_items_loaded"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "first_frame_rendered"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "post_capture_media_ready"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "draft_list_items_loaded"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L6b
        L4c:
            if (r1 == 0) goto L6b
            long r2 = r6.A00
            com.instagram.common.session.UserSession r0 = r6.A05
            X.22C r0 = X.AnonymousClass229.A01(r0)
            X.5Hg r0 = r0.A0J()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "camera_destination"
            r5.A09(r2, r0, r1)
            long r0 = r6.A00
            long r0 = r5.A02(r4, r0)
            r6.A00 = r0
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43822JZk.A00(X.JZk):void");
    }

    public static final void A01(C43822JZk c43822JZk, String str) {
        C24Q c24q = c43822JZk.A04;
        if (c24q.A0E(585177486, c43822JZk.A00)) {
            c43822JZk.A00 = c24q.A06(CancelReason.USER_CANCELLED, str, 585177486, c43822JZk.A00);
        }
    }

    public final void A03() {
        C24Q c24q = this.A04;
        if (c24q.A0E(585177486, this.A00)) {
            c24q.A09(this.A00, "is_cold_start", "true");
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        LJ0 lj0 = LJ0.A03;
        this.A01.A00 = "d_";
        this.A01 = lj0;
        this.A02 = false;
        A01(this, "logout");
    }

    public final void A02() {
        C0J8.A01();
        C24Q c24q = this.A04;
        if (c24q.A0E(585177486, this.A00)) {
            c24q.A0C("gallery_items_loaded", this.A00);
            this.A03.add("gallery_items_loaded");
        }
        A00(this);
    }

    public final void A04(float f) {
        C0J8.A01();
        if (f > 0.95d) {
            this.A06.postDelayed(this.A07, 200L);
        } else {
            if (f <= 0.99f) {
                return;
            }
            Handler handler = this.A06;
            Runnable runnable = this.A07;
            handler.removeCallbacksAndMessages(runnable);
            handler.post(runnable);
        }
    }

    public final void A05(long j) {
        C0J8.A01();
        System.nanoTime();
        C24Q c24q = this.A04;
        if (c24q.A0E(585177486, this.A00)) {
            long j2 = this.A00;
            PointEditor markPointWithEditor = c24q.A00.markPointWithEditor(j2, "first_frame_rendered", C24Q.A00(c24q, "", j2, false));
            markPointWithEditor.pointCustomTimestamp(j / 1000000);
            markPointWithEditor.markerEditingCompleted();
            this.A03.add("first_frame_rendered");
        }
        A00(this);
    }

    public final void A07(C22P c22p, boolean z) {
        long j;
        C0J8.A01();
        if (!this.A02) {
            LJ0 lj0 = new LJ0(c22p);
            this.A02 = true;
            String str = "d_";
            this.A01.A00 = "d_";
            this.A01 = lj0;
            boolean z2 = !z;
            C0J8.A01();
            C24Q c24q = this.A04;
            if (c22p == C22P.A5C) {
                j = 3600000;
            } else {
                j = 10000;
            }
            long A03 = c24q.A03(585177486, j);
            this.A00 = A03;
            LJ0 lj02 = this.A01;
            if (!C14360o3.A0K(lj02.A00, "d_")) {
                str = lj02.A02;
            }
            c24q.A0A(A03, "extended_creation_session_id", str);
            c24q.A0A(this.A00, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c22p.toString());
            c24q.A09(this.A00, "is_cold_start", String.valueOf(z2));
            this.A03.clear();
        }
    }
}
