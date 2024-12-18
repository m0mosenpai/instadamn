package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;

/* renamed from: X.DuM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31594DuM {
    public final UserSession A00;
    public final C26141Ov A01;
    public final C31595DuN A02;
    public final User A03;
    public final C2DS A04;
    public final String A05;

    public final boolean A00(Fragment fragment, InterfaceC37121GXg interfaceC37121GXg, DirectThreadKey directThreadKey, String str) {
        C14360o3.A0B(directThreadKey, 2);
        C81663kb A03 = C2DU.A03((C2DU) this.A04, directThreadKey);
        User A05 = C4GQ.A05(A03);
        if (A03 != null && A05 != null) {
            boolean isPending = A03.isPending();
            boolean CVQ = A03.CVQ();
            boolean contains = A03.Aa2().contains(this.A00.userId);
            boolean A01 = AbstractC31224Do7.A01(A03);
            return A01(fragment, interfaceC37121GXg, A05, str, JRE.A06(directThreadKey), A03.C7g(), false, isPending, CVQ, contains, A01);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(androidx.fragment.app.Fragment r26, X.InterfaceC37121GXg r27, X.AnonymousClass172 r28, java.lang.String r29, java.lang.String r30, int r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31594DuM.A01(androidx.fragment.app.Fragment, X.GXg, X.172, java.lang.String, java.lang.String, int, boolean, boolean, boolean, boolean, boolean):boolean");
    }

    public C31594DuM(UserSession userSession, C26141Ov c26141Ov, C2DS c2ds, C31595DuN c31595DuN, User user, String str) {
        AbstractC167017dG.A1R(str, c2ds);
        this.A00 = userSession;
        this.A05 = str;
        this.A04 = c2ds;
        this.A01 = c26141Ov;
        this.A02 = c31595DuN;
        this.A03 = user;
    }
}
