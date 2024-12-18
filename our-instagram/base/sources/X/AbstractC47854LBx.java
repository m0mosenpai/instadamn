package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.LBx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47854LBx {
    public static final C45948KUz A00(C9CL c9cl, UserSession userSession, C38321qM c38321qM, String str, String str2) {
        int i;
        String str3;
        AbstractC167027dH.A0a(0, userSession, str2, c9cl, c38321qM);
        User A2E = c38321qM.A2E(userSession);
        C45948KUz c45948KUz = null;
        if (A2E != null) {
            if (c38321qM.A5F() && (str3 = c9cl.A02) != null) {
                i = c38321qM.A17(str3);
            } else {
                i = -1;
            }
            String id = c38321qM.getId();
            if (id != null) {
                c45948KUz = new C45948KUz(c38321qM.BRp(), id, c38321qM.A0C.B3P(), str, A2E.getId(), str2, i, AbstractC167007dF.A1X(c38321qM.A1y(), C3YU.A04));
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return c45948KUz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r0.A06 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        if (r0.A06 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        r10 = r0.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        if (r10 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
    
        r10 = X.AbstractC46826KnL.A00(r34, r10, r9.A0e, r14.A01, r12, r12, r12, r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
    
        if (r10 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d6, code lost:
    
        r8 = new X.C51760Mtj(r10, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C163157Sa A01(android.content.Context r33, com.instagram.common.session.UserSession r34, X.AnonymousClass988 r35, X.C160787Im r36, X.C7IM r37) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC47854LBx.A01(android.content.Context, com.instagram.common.session.UserSession, X.988, X.7Im, X.7IM):X.7Sa");
    }
}
