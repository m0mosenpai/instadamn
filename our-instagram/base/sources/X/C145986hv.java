package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6hv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145986hv {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final InterfaceC1118853a A02;

    public C145986hv(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC1118853a interfaceC1118853a) {
        C14360o3.A0B(userSession, 2);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = interfaceC1118853a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.InterfaceC11380iw r7, X.C41181vS r8) {
        /*
            r6 = this;
            r5 = 0
            X.1vY r0 = r8.A0e
            int r1 = r0.ordinal()
            if (r1 == r5) goto L3a
            r0 = 1
            if (r1 != r0) goto L50
            X.1qM r0 = r8.A0b
            r0.getClass()
            java.lang.String r4 = r0.A2q()
        L15:
            if (r4 == 0) goto L50
            X.53a r0 = r6.A02
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.6kc r0 = r0.mVideoPlayer
            int r3 = r0.getCurrentPositionMs()
            com.instagram.common.session.UserSession r2 = r6.A01
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.A26
            X.5Qr r1 = new X.5Qr
            r1.<init>(r0, r2)
            r1.A1D = r4
            r1.A05 = r3
            java.lang.String r0 = r7.getModuleName()
            r1.A0q = r0
            androidx.fragment.app.FragmentActivity r0 = r6.A00
            X.AbstractC41751IeQ.A01(r0, r1, r2, r5)
            return
        L3a:
            X.4ps r0 = r8.A0d
            r0.getClass()
            X.47Z r0 = r0.A00
            java.util.List r0 = r0.A4Z
            if (r0 == 0) goto L50
            java.lang.Object r0 = r0.get(r5)
            com.instagram.feed.media.ReelCTAIntf r0 = (com.instagram.feed.media.ReelCTAIntf) r0
            java.lang.String r4 = X.C6T4.A01(r0)
            goto L15
        L50:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145986hv.A00(X.0iw, X.1vS):void");
    }

    public final void A01(String str, InterfaceC11380iw interfaceC11380iw) {
        int currentPositionMs = ((ReelViewerFragment) this.A02).mVideoPlayer.getCurrentPositionMs();
        UserSession userSession = this.A01;
        C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A26, userSession);
        c116875Qr.A1D = str;
        c116875Qr.A05 = currentPositionMs;
        c116875Qr.A0q = interfaceC11380iw.getModuleName();
        AbstractC41751IeQ.A01(this.A00, c116875Qr, userSession, false);
    }
}
