package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.L7c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47756L7c {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final String A03;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (X.AbstractC43805JYs.A01(r6) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r9 = this;
            com.instagram.common.session.UserSession r6 = r9.A02
            boolean r2 = X.AbstractC43805JYs.A02(r6)
            boolean r0 = X.AbstractC43805JYs.A00(r6)
            if (r0 != 0) goto L13
            boolean r0 = X.AbstractC43805JYs.A01(r6)
            r8 = 0
            if (r0 == 0) goto L14
        L13:
            r8 = 1
        L14:
            java.lang.String r1 = "source"
            r0 = 62
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            X.0e4 r7 = X.AbstractC166987dD.A1L(r1, r0)
            java.lang.String r0 = "is_hw_predefined_list_on"
            java.lang.String r5 = "True"
            X.0e4 r4 = X.AbstractC166987dD.A1L(r0, r5)
            java.lang.String r3 = "False"
            r1 = r3
            if (r2 == 0) goto L2e
            r1 = r5
        L2e:
            java.lang.String r0 = "hw_predefined_list_state_changes"
            X.0e4 r2 = X.AbstractC166987dD.A1L(r0, r1)
            java.lang.String r0 = "is_hw_custom_list_on"
            X.0e4 r1 = X.AbstractC166987dD.A1L(r0, r5)
            if (r8 != 0) goto L3d
            r5 = r3
        L3d:
            java.lang.String r0 = "hw_custom_list_state_changes"
            X.0e4 r0 = X.AbstractC166987dD.A1L(r0, r5)
            X.0e4[] r0 = new X.C09530e4[]{r7, r4, r2, r1, r0}
            java.util.HashMap r1 = X.AbstractC06930Yk.A02(r0)
            java.lang.String r0 = "com.instagram.hidden_words.secure_consent_bottom_sheet.action"
            X.8gL r2 = X.C192108fB.A05(r6, r0, r1)
            r1 = 2
            X.KDv r0 = new X.KDv
            r0.<init>(r9, r1)
            r2.A00(r0)
            X.C1GJ.A03(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47756L7c.A00():void");
    }

    public C47756L7c(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = interfaceC11380iw;
        this.A03 = str;
    }
}
