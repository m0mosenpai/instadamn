package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.4px, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105864px implements C1NI {
    public String A00;
    public List A01;
    public boolean A02;
    public final C38721r4 A03;
    public final String A04;

    public C105864px(C38721r4 c38721r4) {
        this.A03 = c38721r4;
        String str = c38721r4.A04;
        this.A04 = str == null ? "" : str;
        List list = c38721r4.A09;
        this.A01 = list == null ? C16930sl.A00 : list;
        this.A00 = c38721r4.A05;
        this.A02 = C14360o3.A0K(c38721r4.A00, true);
    }

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        return null;
    }

    @Override // X.C1NI
    public final boolean CdW() {
        return false;
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return false;
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return false;
    }

    @Override // X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        return String.valueOf(this.A03.A02);
    }
}
