package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Im6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42158Im6 implements InterfaceC120995dr {
    public C38321qM A00;
    public final IKS A01;
    public final EnumC129395t1 A02 = EnumC129395t1.A05;
    public final String A03;

    @Override // X.InterfaceC120995dr
    public final /* synthetic */ String Ayl(UserSession userSession) {
        return AbstractC128095qd.A01(this, userSession);
    }

    @Override // X.InterfaceC120995dr
    public final /* synthetic */ EnumC40111tc BRp() {
        return AbstractC128095qd.A00(this);
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
        return this.A00;
    }

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        return this.A01.A08;
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
        return this.A01.A06;
    }

    @Override // X.InterfaceC120995dr
    public final String getOrganicTrackingToken() {
        return this.A03;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.1rF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.1rF, java.lang.Object] */
    public C42158Im6(IKS iks) {
        this.A01 = iks;
        C38801rC c38801rC = C38321qM.A0h;
        this.A00 = new C38321qM(new C37761pD(null), new Object());
        String str = iks.A08;
        this.A03 = str == null ? "" : str;
        C38321qM c38321qM = new C38321qM(new C37761pD(null), new Object());
        c38321qM.A4P(iks.A06);
        this.A00 = c38321qM;
    }
}
