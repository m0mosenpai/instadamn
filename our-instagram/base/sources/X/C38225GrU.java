package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GrU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38225GrU implements InterfaceC120995dr {
    public final C38661Gz2 A00;
    public final EnumC129395t1 A01 = EnumC129395t1.A0B;
    public final C38321qM A02;
    public final String A03;
    public final List A04;

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
    public final /* synthetic */ List AmB() {
        return null;
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
        return null;
    }

    @Override // X.InterfaceC120995dr
    public final C38321qM BQN() {
        return this.A02;
    }

    @Override // X.InterfaceC120995dr
    public final List C7s() {
        return this.A04;
    }

    @Override // X.InterfaceC120995dr
    public final EnumC129395t1 CBb() {
        return this.A01;
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
        return String.valueOf(this.A00.A09);
    }

    @Override // X.InterfaceC120995dr
    public final String getOrganicTrackingToken() {
        return this.A03;
    }

    public C38225GrU(C38661Gz2 c38661Gz2) {
        this.A00 = c38661Gz2;
        this.A02 = c38661Gz2.A01;
        this.A03 = c38661Gz2.A0E;
        this.A04 = c38661Gz2.A0G;
    }
}
