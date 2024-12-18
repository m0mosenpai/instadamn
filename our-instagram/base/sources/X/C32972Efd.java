package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.login.credentialmanager.CredentialManagerSaveHelper;
import com.instagram.user.model.User;

/* renamed from: X.Efd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32972Efd extends C32547EUx {
    public final C83753oK A00;
    public final C07270a1 A01;
    public final String A02;
    public final C6FQ A03;

    @Override // X.C32547EUx
    public final void A03(UserSession userSession, User user) {
        Fragment fragment;
        boolean A1R = AbstractC167007dF.A1R(0, userSession, user);
        C6FQ c6fq = this.A03;
        if (c6fq != null) {
            fragment = C6BQ.A02(c6fq);
        } else {
            fragment = null;
        }
        String username = user.getUsername();
        ImageUrl Bhu = user.Bhu();
        G9Y g9y = new G9Y(0, this, userSession, user);
        String str = AbstractC31710DwF.A01;
        if (str != null && str.length() != 0) {
            C31712DwH c31712DwH = C31712DwH.A00;
            if (c31712DwH.A01(userSession)) {
                String str2 = AbstractC31710DwF.A01;
                if (str2 != null) {
                    AbstractC31710DwF.A02(fragment, userSession, Bhu, g9y, null, username, str2, A1R);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            if (fragment == null || fragment.getContext() == null || !c31712DwH.A00(userSession)) {
                return;
            }
            Context context = fragment.getContext();
            if (context != null) {
                CredentialManagerSaveHelper credentialManagerSaveHelper = new CredentialManagerSaveHelper(context);
                String str3 = AbstractC31710DwF.A01;
                if (str3 != null) {
                    FH5 fh5 = new FH5(g9y);
                    AbstractC166987dD.A1Z(new C50125MBz(credentialManagerSaveHelper, fh5, username, str3, null, 14), credentialManagerSaveHelper.A00);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        g9y.D6d(A1R, "SmartLock account used for successful login; no need to save");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C32972Efd(X.C83753oK r14, X.C6FQ r15, X.C07270a1 r16, java.lang.String r17) {
        /*
            r13 = this;
            r4 = r16
            r9 = r17
            X.AbstractC167017dG.A1Q(r4, r9)
            androidx.fragment.app.FragmentActivity r1 = X.C6BQ.A04(r15)
            X.DwI r7 = X.EnumC31713DwI.A0z
            X.0iw r3 = X.C6BQ.A08(r15)
            java.lang.Integer r8 = X.C05F.A0j
            androidx.fragment.app.FragmentActivity r0 = X.C6BQ.A04(r15)
            android.net.Uri r2 = X.AbstractC31525Dt9.A00(r0)
            r5 = 0
            r0 = r13
            r6 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A01 = r4
            r13.A03 = r15
            r13.A02 = r9
            r13.A00 = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32972Efd.<init>(X.3oK, X.6FQ, X.0a1, java.lang.String):void");
    }

    public final void A05(UserSession userSession, User user) {
        super.A03(userSession, user);
    }
}
