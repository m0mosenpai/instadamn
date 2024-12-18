package X;

import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.3d9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77233d9 {
    public final C25671My A00;
    public final UserSession A01;
    public final C57332k8 A02;
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C206939Dy(this, 15));

    public final int A00(C38321qM c38321qM) {
        Object[] objArr;
        C14360o3.A0B(c38321qM, 0);
        boolean A00 = C77153d1.A00(this.A01, c38321qM);
        if (A00 && c38321qM.A0w() > 0) {
            objArr = new Object[]{Boolean.valueOf(A00)};
        } else {
            objArr = new Object[]{Integer.valueOf(c38321qM.A0w()), Boolean.valueOf(A00)};
        }
        return Arrays.hashCode(objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
    
        if (r37 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f2, code lost:
    
        if ((!r0.isEmpty()) != true) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C87183ub A01(X.C38321qM r34, X.InterfaceC60442pS r35, X.C75113Zb r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77233d9.A01(X.1qM, X.2pS, X.3Zb, boolean):X.3ub");
    }

    public C77233d9(UserSession userSession, C57332k8 c57332k8) {
        this.A01 = userSession;
        this.A02 = c57332k8;
        this.A00 = AbstractC25651Mw.A00(userSession);
    }
}
