package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* loaded from: classes6.dex */
public final class G36 implements InterfaceC37156GYt {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final E70 A02;
    public final Context A03;
    public final Capabilities A04;
    public final C23031Ai A05;

    public G36(Context context, FragmentActivity fragmentActivity, UserSession userSession, Capabilities capabilities, E70 e70, C23031Ai c23031Ai) {
        AbstractC25229BEm.A1I(userSession, 3, c23031Ai);
        this.A00 = fragmentActivity;
        this.A03 = context;
        this.A01 = userSession;
        this.A02 = e70;
        this.A04 = capabilities;
        this.A05 = c23031Ai;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r4.A22() == false) goto L10;
     */
    @Override // X.InterfaceC37156GYt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List getItems() {
        /*
            r7 = this;
            X.E70 r2 = r7.A02
            X.3o9 r1 = r2.A08()
            com.instagram.model.direct.DirectThreadKey r0 = X.JRE.A02(r1)
            if (r0 == 0) goto L77
            java.lang.String r6 = X.AbstractC31172DnG.A15(r1)
        L10:
            if (r6 == 0) goto L84
            boolean r5 = r2.A0g
            X.1Ai r4 = r7.A05
            X.0ry r2 = r4.A63
            X.0YR[] r1 = X.C23031Ai.A8c
            r0 = 200(0xc8, float:2.8E-43)
            boolean r0 = X.AbstractC167017dG.A1b(r4, r2, r1, r0)
            r3 = 0
            if (r0 == 0) goto L2a
            boolean r0 = r4.A22()
            r2 = 1
            if (r0 != 0) goto L2b
        L2a:
            r2 = 0
        L2b:
            r1 = 2131959160(0x7f131d78, float:1.9554953E38)
            if (r2 == 0) goto L33
            if (r5 == 0) goto L33
            r3 = 1
        L33:
            X.FqH r0 = new X.FqH
            r0.<init>(r7, r6, r2)
            X.GHa r6 = X.C36731GHa.A02(r0, r1, r3)
            android.content.Context r1 = r7.A03
            r0 = 2131959159(0x7f131d77, float:1.955495E38)
            android.text.SpannableStringBuilder r5 = X.AbstractC31175DnJ.A05(r1, r0)
            r0 = 1
            r6.A0C = r0
            r0 = 2131965052(0x7f13347c, float:1.9566903E38)
            java.lang.String r1 = X.AbstractC166997dE.A0p(r1, r0)
            java.lang.String r0 = " "
            r5.append(r0)
            int r4 = r5.length()
            android.text.SpannableStringBuilder r3 = r5.append(r1)
            androidx.fragment.app.FragmentActivity r0 = r7.A00
            int r0 = X.AbstractC53242c7.A06(r0)
            X.Em1 r2 = new X.Em1
            r2.<init>(r7, r0)
            int r1 = r5.length()
            r0 = 33
            r3.setSpan(r2, r4, r1, r0)
            r6.A0A = r5
            java.util.List r0 = X.AbstractC166987dD.A1J(r6)
            return r0
        L77:
            boolean r0 = r1 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 == 0) goto L84
            com.instagram.model.direct.threadkey.impl.MsysThreadId r1 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r1
            long r0 = r1.A00
            java.lang.String r6 = java.lang.String.valueOf(r0)
            goto L10
        L84:
            java.lang.String r0 = "Expected threadId"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G36.getItems():java.util.List");
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        String valueOf;
        C34654FOn c34654FOn = AbstractC36357G2j.A00;
        UserSession userSession = this.A01;
        E70 e70 = this.A02;
        Capabilities capabilities = this.A04;
        if (c34654FOn.A00(userSession, capabilities, e70) && F33.A00(userSession, capabilities, e70)) {
            C3o9 A08 = e70.A08();
            if (JRE.A02(A08) != null) {
                valueOf = AbstractC31172DnG.A15(A08);
            } else if (A08 instanceof MsysThreadId) {
                valueOf = String.valueOf(((MsysThreadId) A08).A00);
            }
            if (valueOf != null) {
                return true;
            }
        }
        return false;
    }
}
