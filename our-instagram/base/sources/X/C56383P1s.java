package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import java.util.List;

/* renamed from: X.P1s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56383P1s implements InterfaceC37292Gbt, InterfaceC57945Pmr {
    public final Context A00;
    public final UserSession A01;
    public final UserStoryTarget A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final IngestSessionShim A06;
    public final List A07;

    public C56383P1s(Context context, UserSession userSession, IngestSessionShim ingestSessionShim, UserStoryTarget userStoryTarget, String str, String str2, boolean z) {
        AbstractC167027dH.A0a(1, context, userSession, userStoryTarget, ingestSessionShim);
        this.A01 = userSession;
        this.A02 = userStoryTarget;
        this.A06 = ingestSessionShim;
        this.A05 = z;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = AbstractC166987dD.A0O(context);
        this.A07 = C16930sl.A00;
    }

    @Override // X.InterfaceC37292Gbt
    public final boolean CLv(DirectShareTarget directShareTarget) {
        return false;
    }

    @Override // X.InterfaceC37292Gbt
    public final List Axe() {
        return this.A07;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000f A[ORIG_RETURN, RETURN] */
    @Override // X.InterfaceC57945Pmr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Bu9() {
        /*
            r2 = this;
            com.instagram.pendingmedia.model.UserStoryTarget r0 = r2.A02
            java.lang.String r1 = r0.CBn()
            if (r1 == 0) goto L34
            int r0 = r1.hashCode()
            switch(r0) {
                case -798727403: goto L11;
                case -195511486: goto L14;
                case 64897: goto L17;
                case 702693113: goto L1f;
                case 1279756998: goto L22;
                case 1702038030: goto L2a;
                default: goto Lf;
            }
        Lf:
            r1 = -1
        L10:
            return r1
        L11:
            java.lang.String r0 = "CLOSE_FRIENDS_WITH_BLACKLIST"
            goto L2c
        L14:
            java.lang.String r0 = "ALL_WITH_BLACKLIST"
            goto L19
        L17:
            java.lang.String r0 = "ALL"
        L19:
            boolean r0 = r1.equals(r0)
            r1 = 1
            goto L31
        L1f:
            java.lang.String r0 = "PRIVATE_STORY"
            goto L2c
        L22:
            java.lang.String r0 = "FACEBOOK"
            boolean r0 = r1.equals(r0)
            r1 = 5
            goto L31
        L2a:
            java.lang.String r0 = "CLOSE_FRIENDS"
        L2c:
            boolean r0 = r1.equals(r0)
            r1 = 2
        L31:
            if (r0 != 0) goto L10
            goto Lf
        L34:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56383P1s.Bu9():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r6.A5w != true) goto L9;
     */
    @Override // X.InterfaceC37292Gbt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ENk() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56383P1s.ENk():void");
    }
}
