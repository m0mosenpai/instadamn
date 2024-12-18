package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36663GEj implements GYB {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (r5.length() == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r2.length() == 0) goto L6;
     */
    @Override // X.GYB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CJ8(android.net.Uri r12, android.os.Bundle r13) {
        /*
            r11 = this;
            r7 = 0
            X.C14360o3.A0B(r12, r7)
            java.lang.String r0 = "target_user_ids"
            java.lang.String r2 = r12.getQueryParameter(r0)
            r0 = 5466(0x155a, float:7.66E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.String r5 = r12.getQueryParameter(r0)
            r10 = 1
            if (r2 == 0) goto L1e
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L1f
        L1e:
            r0 = 1
        L1f:
            r8 = 0
            if (r0 == 0) goto L34
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "SecretConversationGroupThreadActionHandler:Unable to extract target_user_ids from URI::"
            java.lang.String r2 = X.AbstractC167017dG.A0n(r12, r0, r1)
            com.instagram.common.session.UserSession r1 = r11.A02
            java.lang.Integer r0 = X.C05F.A1F
            X.AbstractC31546DtW.A00(r1, r0, r2, r8)
            return
        L34:
            java.util.ArrayList r9 = X.AbstractC166987dD.A1E()
            java.lang.String r0 = ","
            java.util.List r2 = X.AbstractC31175DnJ.A0h(r2, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L84
            int r0 = r2.size()
            java.util.ListIterator r1 = r2.listIterator(r0)
        L4c:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L84
            int r0 = X.AbstractC31176DnK.A02(r1)
            if (r0 == 0) goto L4c
            java.util.List r0 = X.AbstractC31177DnL.A0k(r2, r1)
        L5c:
            java.lang.String[] r6 = X.AbstractC31173DnH.A1b(r0, r7)
            int r4 = r6.length
            r3 = 0
        L62:
            if (r3 >= r4) goto L87
            r1 = r6[r3]
            com.instagram.common.session.UserSession r2 = r11.A02
            com.instagram.user.model.User r0 = X.AbstractC31174DnI.A0k(r2, r1)
            if (r0 != 0) goto L7a
            java.lang.String r0 = "SecretConversationGroupThreadActionHandler:Unable to fetch user from UserCache with id:"
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r1)
            java.lang.Integer r0 = X.C05F.A1F
            X.AbstractC31546DtW.A00(r2, r0, r1, r8)
            return
        L7a:
            com.instagram.model.direct.threadkey.impl.MsysPendingRecipient r0 = X.AbstractC34821FVx.A00(r0)
            r9.add(r0)
            int r3 = r3 + 1
            goto L62
        L84:
            X.0sl r0 = X.C16930sl.A00
            goto L5c
        L87:
            com.instagram.direct.msys.subtype.MsysThreadSubtype$Standard r1 = com.instagram.direct.msys.subtype.MsysThreadSubtype.Standard.A00
            X.4Ds r0 = X.EnumC92794Ds.A04
            X.Ak9 r4 = new X.Ak9
            r4.<init>(r0, r1, r9)
            if (r5 == 0) goto L99
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto L9a
        L99:
            r0 = 1
        L9a:
            java.lang.String r6 = "inbox_new_message"
            if (r0 == 0) goto Lae
            androidx.fragment.app.FragmentActivity r2 = r11.A00
            com.instagram.common.session.UserSession r1 = r11.A02
            X.0iw r0 = r11.A01
            X.1nl r0 = X.C36881nl.A01(r2, r0, r1, r6)
            r0.A0B = r4
        Laa:
            X.AbstractC31174DnI.A1P(r0)
            return
        Lae:
            com.instagram.common.session.UserSession r3 = r11.A02
            java.lang.Class<X.Fbr> r1 = X.C35018Fbr.class
            r0 = 7
            java.lang.Object r0 = X.C31651DvH.A00(r3, r1, r0)
            X.Fbr r0 = (X.C35018Fbr) r0
            java.lang.Integer r0 = r0.A01
            int r2 = r0.intValue()
            int r0 = X.AbstractC167007dF.A0A(r5)
            if (r0 <= r2) goto Ld8
            X.C14360o3.A0A(r5)
            int r2 = r2 - r10
            java.lang.String r1 = "..."
            int r0 = r1.length()
            int r2 = r2 - r0
            java.lang.String r0 = X.AbstractC25227BEk.A0w(r5, r7, r2)
            java.lang.String r5 = X.AnonymousClass001.A0R(r0, r1)
        Ld8:
            androidx.fragment.app.FragmentActivity r1 = r11.A00
            X.0iw r0 = r11.A01
            X.1nl r0 = X.C36881nl.A01(r1, r0, r3, r6)
            r0.A0B = r4
            r0.A0h = r5
            goto Laa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36663GEj.CJ8(android.net.Uri, android.os.Bundle):void");
    }

    public C36663GEj(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }
}
