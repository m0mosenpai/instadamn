package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36664GEk implements GYB {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r2.length() == 0) goto L6;
     */
    @Override // X.GYB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CJ8(android.net.Uri r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            java.lang.String r0 = "target_user_id"
            java.lang.String r2 = r6.getQueryParameter(r0)
            if (r2 == 0) goto L13
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L14
        L13:
            r0 = 1
        L14:
            r3 = 0
            if (r0 == 0) goto L2e
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "SecretConverstationUserThreadActionHandler"
            r1.append(r0)
            java.lang.String r0 = ":Unable to extract target_user_id from URI: "
            java.lang.String r2 = X.AbstractC167017dG.A0n(r6, r0, r1)
            com.instagram.common.session.UserSession r1 = r5.A02
            java.lang.Integer r0 = X.C05F.A1F
            X.AbstractC31546DtW.A00(r1, r0, r2, r3)
            return
        L2e:
            com.instagram.common.session.UserSession r4 = r5.A02
            com.instagram.user.model.User r0 = X.AbstractC31174DnI.A0k(r4, r2)
            if (r0 != 0) goto L44
            java.lang.String r1 = "SecretConverstationUserThreadActionHandler"
            java.lang.String r0 = ":Unable to fetch user with id: "
            java.lang.String r1 = X.AnonymousClass001.A0g(r1, r0, r2)
            java.lang.Integer r0 = X.C05F.A1F
            X.AbstractC31546DtW.A00(r4, r0, r1, r3)
            return
        L44:
            com.instagram.model.direct.threadkey.impl.MsysPendingRecipient r0 = X.AbstractC34821FVx.A00(r0)
            java.util.List r2 = X.AbstractC166987dD.A1J(r0)
            com.instagram.direct.msys.subtype.MsysThreadSubtype$Standard r1 = com.instagram.direct.msys.subtype.MsysThreadSubtype.Standard.A00
            X.4Ds r0 = X.EnumC92794Ds.A04
            X.Ak9 r3 = new X.Ak9
            r3.<init>(r0, r1, r2)
            androidx.fragment.app.FragmentActivity r2 = r5.A00
            X.0iw r1 = r5.A01
            java.lang.String r0 = "thread_details"
            X.1nl r0 = X.C36881nl.A01(r2, r1, r4, r0)
            r0.A0B = r3
            X.AbstractC31174DnI.A1P(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36664GEk.CJ8(android.net.Uri, android.os.Bundle):void");
    }

    public C36664GEk(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }
}
