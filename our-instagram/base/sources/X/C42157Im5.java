package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Im5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42157Im5 implements InterfaceC120995dr {
    public final JK0 A00;
    public final EnumC129395t1 A01 = EnumC129395t1.A0K;

    public C42157Im5(Object obj) {
        this.A00 = (JK0) obj;
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
        return null;
    }

    @Override // X.InterfaceC120995dr
    public final /* synthetic */ List C7s() {
        return null;
    }

    @Override // X.InterfaceC120995dr
    public final EnumC129395t1 CBb() {
        return this.A01;
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
        return this.A01.toString();
    }

    @Override // X.InterfaceC120995dr
    public final String getOrganicTrackingToken() {
        return null;
    }
}
