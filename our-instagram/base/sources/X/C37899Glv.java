package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Glv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37899Glv implements InterfaceC120995dr {
    public final C40971v4 A00;
    public final EnumC129395t1 A01;

    @Override // X.InterfaceC120995dr
    public final String Ayl(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return this.A00.A03(userSession);
    }

    @Override // X.C1NI
    public final boolean CdW() {
        return true;
    }

    @Override // X.InterfaceC120995dr
    public final String getOrganicTrackingToken() {
        return null;
    }

    @Override // X.InterfaceC120995dr
    public final List AmB() {
        return this.A00.A01();
    }

    @Override // X.InterfaceC120995dr
    public final InterfaceC87893vx AmK() {
        return this.A00.A05;
    }

    @Override // X.InterfaceC120995dr
    public final AdFormatType B82() {
        return this.A00.A01;
    }

    @Override // X.InterfaceC120995dr
    public final String BHD() {
        return this.A00.A0j;
    }

    @Override // X.InterfaceC120995dr
    public final C38321qM BQN() {
        return this.A00.A0K;
    }

    @Override // X.InterfaceC120995dr
    public final EnumC40111tc BRp() {
        C40971v4 c40971v4 = this.A00;
        EnumC40111tc enumC40111tc = c40971v4.A0M;
        if (enumC40111tc == null) {
            return c40971v4.A0K.BRp();
        }
        return enumC40111tc;
    }

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        return this.A00.A0j;
    }

    @Override // X.InterfaceC120995dr
    public final /* synthetic */ List C7s() {
        return null;
    }

    @Override // X.InterfaceC120995dr
    public final EnumC129395t1 CBb() {
        return this.A01;
    }

    @Override // X.InterfaceC120995dr
    public final boolean CKk() {
        C40971v4 c40971v4 = this.A00;
        if (!c40971v4.A0J.A4g()) {
            InterfaceC104924o5 interfaceC104924o5 = c40971v4.A0I;
            if (interfaceC104924o5 != null && interfaceC104924o5.BVT() != null) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return this.A00.A0u;
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return false;
    }

    @Override // X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        return this.A00.A0S;
    }

    public C37899Glv(EnumC129395t1 enumC129395t1, C40971v4 c40971v4) {
        this.A00 = c40971v4;
        this.A01 = enumC129395t1;
    }
}
