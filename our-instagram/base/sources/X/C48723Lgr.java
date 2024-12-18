package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Lgr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48723Lgr implements InterfaceC50460MPo {
    public final UserSession A00;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0111, code lost:
    
        if (r5 != 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011f, code lost:
    
        if (r4 != 2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0125  */
    @Override // X.InterfaceC50460MPo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AWu(X.LF7 r39) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48723Lgr.AWu(X.LF7):java.lang.Object");
    }

    @Override // X.InterfaceC50460MPo
    public final C2EY Baf(LF7 lf7) {
        C14360o3.A0B(lf7, 0);
        Map map = AbstractC47159Ksu.A00;
        C2EY c2ey = (C2EY) AbstractC47159Ksu.A00.get(lf7.A0F.getValue());
        if (c2ey == null) {
            return C2EY.A0z;
        }
        return c2ey;
    }

    public C48723Lgr(UserSession userSession) {
        this.A00 = userSession;
    }
}
