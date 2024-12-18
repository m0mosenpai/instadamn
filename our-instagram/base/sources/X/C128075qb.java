package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.5qb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128075qb implements InterfaceC120995dr {
    public final C38321qM A00;
    public final C40971v4 A01;
    public final EnumC129395t1 A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public C128075qb(C38321qM c38321qM, C40971v4 c40971v4) {
        C14360o3.A0B(c38321qM, 1);
        this.A00 = c38321qM;
        this.A01 = c40971v4;
        this.A02 = EnumC129395t1.A0G;
        this.A04 = c38321qM.A0C.getOrganicTrackingToken();
        this.A03 = this.A00.A0C.BHD();
        this.A05 = this.A00.A0C.AmB();
    }

    @Override // X.InterfaceC120995dr
    public final /* synthetic */ String Ayl(UserSession userSession) {
        return AbstractC128095qd.A01(this, userSession);
    }

    @Override // X.InterfaceC120995dr
    public final /* synthetic */ EnumC40111tc BRp() {
        return AbstractC128095qd.A00(this);
    }

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        return null;
    }

    @Override // X.InterfaceC120995dr
    public final /* synthetic */ boolean CKk() {
        return AbstractC128095qd.A02(this);
    }

    @Override // X.C1NI
    public final boolean CdW() {
        return false;
    }

    @Override // X.InterfaceC120995dr
    public final List AmB() {
        return this.A05;
    }

    @Override // X.InterfaceC120995dr
    public final /* synthetic */ InterfaceC87893vx AmK() {
        return null;
    }

    @Override // X.InterfaceC120995dr
    public final /* synthetic */ AdFormatType B82() {
        return null;
    }

    @Override // X.InterfaceC120995dr
    public final String BHD() {
        return this.A03;
    }

    @Override // X.InterfaceC120995dr
    public final C38321qM BQN() {
        return this.A00;
    }

    @Override // X.InterfaceC120995dr
    public final /* synthetic */ List C7s() {
        return null;
    }

    @Override // X.InterfaceC120995dr
    public final EnumC129395t1 CBb() {
        return this.A02;
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return true;
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return true;
    }

    @Override // X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        String id = this.A00.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC120995dr
    public final String getOrganicTrackingToken() {
        return this.A04;
    }
}
