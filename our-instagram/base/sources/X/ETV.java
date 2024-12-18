package X;

import com.instagram.common.session.UserSession;
import com.instagram.urlhandlers.permissionsinvitation.PermissionsInvitationUrlHandlerActivity;

/* loaded from: classes6.dex */
public final class ETV extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public ETV(Object obj, Object obj2, Object obj3, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A06 = str;
        this.A05 = str2;
        this.A01 = obj;
        this.A04 = str3;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-262668353);
            PermissionsInvitationUrlHandlerActivity permissionsInvitationUrlHandlerActivity = (PermissionsInvitationUrlHandlerActivity) this.A03;
            UserSession userSession = (UserSession) this.A02;
            C35158Ff0.A00.A02((C26069Bfx) this.A01, userSession, this.A04, "invite_is_invalid");
            permissionsInvitationUrlHandlerActivity.A00.postDelayed(new RunnableC36877GMy(AbstractC35176FfT.A01(permissionsInvitationUrlHandlerActivity, "invite_is_invalid")), 1000L);
            permissionsInvitationUrlHandlerActivity.finish();
            i = 1435788229;
        } else {
            A03 = C0f9.A03(-244256302);
            C31250DoY c31250DoY = (C31250DoY) this.A01;
            C162337Ov.A0S(c31250DoY.A08, c31250DoY.A0A, "open_thread_error", AbstractC31171DnF.A0g(this.A02), this.A04, "Activity Feed - Failed to fetch media object.");
            i = -646514538;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x010d, code lost:
    
        if (r4 != null) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.content.Context] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ETV.onSuccess(java.lang.Object):void");
    }
}
