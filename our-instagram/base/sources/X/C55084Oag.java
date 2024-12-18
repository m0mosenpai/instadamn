package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Oag, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55084Oag {
    public final Context A00;
    public final C25671My A01;
    public final UserSession A02;
    public final C38321qM A03;
    public final C41181vS A04;
    public final AbstractC10360h2 A05;

    public final void A02(DialogInterface.OnDismissListener onDismissListener, C54696ODy c54696ODy, boolean z, boolean z2) {
        String str;
        if (c54696ODy != null) {
            str = c54696ODy.A01;
        } else {
            str = "";
        }
        C25621Ms A0c = AbstractC167017dG.A0c(this.A02);
        C38321qM c38321qM = this.A03;
        AbstractC31173DnH.A1Q(A0c, "media/%s/delete/?media_type=%s", new Object[]{c38321qM.getId(), c38321qM.BRp()});
        MSY.A1C(A0c, c38321qM);
        A0c.A9s("deep_delete_waterfall", str);
        A0c.A0R(N35.class, C54890OPl.class);
        A0c.A0R = true;
        if (z) {
            A0c.A9s("delete_fb_story", "true");
        }
        C1ON A0N = A0c.A0N();
        A0N.A00 = new C37351Gct(1, this, c54696ODy, new C54809OKh(onDismissListener, this.A05, C05F.A00), z, z2);
        C1GJ.A03(A0N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r8.A02, 36319909902753603L) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C54696ODy r6, X.N35 r7, X.C55084Oag r8, boolean r9, boolean r10) {
        /*
            boolean r0 = r7.A00
            r2 = 1
            if (r0 != 0) goto L79
            boolean r0 = r7.isOk()
            if (r0 == 0) goto L1a
            com.instagram.common.session.UserSession r4 = r8.A02
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36319909902753603(0x8108c400071f43, double:3.032195498815277E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)
            if (r0 != 0) goto L79
        L1a:
            r1 = 1
        L1b:
            if (r9 == 0) goto L7b
            boolean r0 = r7.A01
            if (r0 != 0) goto L7b
            boolean r0 = r7.A02
            r0 = r0 ^ 1
            if (r1 == 0) goto L6b
            if (r0 == 0) goto L5f
            r0 = 2131957610(0x7f13176a, float:1.9551809E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "deep_delete_failed_instagram_and_facebook"
            java.lang.String r5 = "ig_deletion_failure_fb_deletion_failure"
        L34:
            android.content.Context r4 = r8.A00
            int r3 = r1.intValue()
            X.C9GR.A01(r4, r0, r3, r2)
            if (r10 == 0) goto L48
            if (r6 == 0) goto L48
            java.lang.String r1 = "view"
            java.lang.String r0 = "failure_toast"
            X.AbstractC54123NwL.A00(r6, r1, r0, r5, r9)
        L48:
            com.instagram.common.session.UserSession r2 = r8.A02
            X.OMa r1 = X.AbstractC54126NwO.A00(r2)
            java.lang.String r0 = "failure_reason"
            r1.A03(r0, r5)
            X.OMa r1 = X.AbstractC54126NwO.A00(r2)
            java.lang.String r0 = r4.getString(r3)
            r1.A04(r5, r0)
            return
        L5f:
            r0 = 2131957611(0x7f13176b, float:1.955181E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "deep_delete_failed_instagram_only"
            java.lang.String r5 = "ig_deletion_failure_fb_deletion_success"
            goto L34
        L6b:
            if (r0 == 0) goto L81
            r0 = 2131957609(0x7f131769, float:1.9551807E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "deep_delete_failed_facebook_only"
            java.lang.String r5 = "ig_deletion_success_fb_deletion_failure"
            goto L34
        L79:
            r1 = 0
            goto L1b
        L7b:
            if (r1 == 0) goto L81
            A01(r6, r8, r9, r10, r2)
            return
        L81:
            com.instagram.common.session.UserSession r0 = r8.A02
            X.OMa r0 = X.AbstractC54126NwO.A00(r0)
            X.1QT r2 = r0.A01
            long r0 = r0.A00
            r2.flowEndSuccess(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55084Oag.A00(X.ODy, X.N35, X.Oag, boolean, boolean):void");
    }

    public static final void A01(C54696ODy c54696ODy, C55084Oag c55084Oag, boolean z, boolean z2, boolean z3) {
        int i;
        String str;
        if (c55084Oag.A03.Cff()) {
            i = 2131957682;
            str = "delete_media_video_failed";
        } else {
            i = 2131957679;
            str = "delete_media_photo_failed";
        }
        if (z3) {
            C9GR.A0F(c55084Oag.A00, str, i);
        }
        UserSession userSession = c55084Oag.A02;
        AbstractC54126NwO.A00(userSession).A03(TraceFieldType.FailureReason, "soft_deletion_failure");
        AbstractC54126NwO.A00(userSession).A04("soft_deletion_failure", c55084Oag.A00.getString(i));
        if (z2 && c54696ODy != null) {
            AbstractC54123NwL.A00(c54696ODy, "view", "failure_toast", "ig_generic_failure", z);
        }
    }

    public final void A03(DialogInterface.OnDismissListener onDismissListener, String str) {
        C25621Ms A0c = AbstractC167017dG.A0c(this.A02);
        A0c.A0B("stories/prompt_stickers/delete_story_template/");
        A0c.A9s("prompt_id", str);
        C1ON A0J = AbstractC31178DnM.A0J(A0c, N35.class, C54890OPl.class);
        MWM.A00(A0J, new C54809OKh(onDismissListener, this.A05, C05F.A00), this, 14);
        C1GJ.A03(A0J);
    }

    public C55084Oag(Context context, AbstractC10360h2 abstractC10360h2, UserSession userSession, C41181vS c41181vS) {
        AbstractC43594JPz.A1P(abstractC10360h2, userSession);
        this.A00 = context;
        this.A05 = abstractC10360h2;
        this.A04 = c41181vS;
        this.A02 = userSession;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            this.A03 = c38321qM;
            this.A01 = AbstractC25651Mw.A00(userSession);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
