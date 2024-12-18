package X;

import com.instagram.common.session.UserSession;
import com.meta.foa.accountswitcher.UserAccountInfo;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.BoO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26565BoO extends AbstractC51572Yf {
    public final UserAccountInfo A00;
    public final InterfaceC16660sJ A01;
    public final FoaUserSession A02;
    public final String A03;
    public final InterfaceC16820sZ A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C26565BoO(UserAccountInfo userAccountInfo, FoaUserSession foaUserSession, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(foaUserSession, 1);
        AbstractC167007dF.A1I(interfaceC16660sJ, 7, str);
        this.A02 = foaUserSession;
        this.A00 = userAccountInfo;
        this.A05 = z;
        this.A07 = z2;
        this.A04 = interfaceC16820sZ;
        this.A06 = z3;
        this.A01 = interfaceC16660sJ;
        this.A03 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r24.A05 != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019a  */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r25) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26565BoO.A0Y(X.3bS):X.2Vc");
    }

    private final boolean A03(UserAccountInfo userAccountInfo) {
        FoaUserSession foaUserSession = this.A02;
        String str = userAccountInfo.A07;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        C14360o3.A0B(foaUserSession, 0);
        UserSession A00 = AbstractC28057CYl.A00(foaUserSession);
        C14360o3.A0B(A00, 0);
        if (str2.length() != 0 && !AbstractC54472f1.A06(A00, 36326743195465796L) && AbstractC54472f1.A06(A00, 36326743195400259L) && str != null && str.length() != 0) {
            return true;
        }
        return false;
    }
}
