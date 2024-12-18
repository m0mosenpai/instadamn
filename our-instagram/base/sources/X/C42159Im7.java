package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Im7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42159Im7 implements InterfaceC120995dr {
    public final int A00;
    public final C9C2 A01;
    public final C40971v4 A02;
    public final EnumC129395t1 A03 = EnumC129395t1.A0A;
    public final C38321qM A04;
    public final String A05;
    public final boolean A06;

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
        return true;
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
        return this.A05;
    }

    @Override // X.InterfaceC120995dr
    public final C38321qM BQN() {
        return this.A04;
    }

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        return this.A02.A0j;
    }

    @Override // X.InterfaceC120995dr
    public final /* synthetic */ List C7s() {
        return null;
    }

    @Override // X.InterfaceC120995dr
    public final EnumC129395t1 CBb() {
        return this.A03;
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return this.A06;
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return false;
    }

    @Override // X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        return this.A01.A02;
    }

    @Override // X.InterfaceC120995dr
    public final String getOrganicTrackingToken() {
        return null;
    }

    public C42159Im7(C9C2 c9c2, C40971v4 c40971v4) {
        this.A01 = c9c2;
        this.A02 = c40971v4;
        this.A06 = c40971v4.A0u;
        this.A04 = c40971v4.A0K;
        this.A05 = c40971v4.A0j;
        this.A00 = AbstractC37302Gc3.A02(((IntentAwareAdsInfoIntf) c9c2.A01).BVJ());
    }

    public static IntentAwareAdsInfoIntf A00(C120985dq c120985dq) {
        return (IntentAwareAdsInfoIntf) c120985dq.A03().A01.A01;
    }

    public static List A01(C120985dq c120985dq) {
        return (List) c120985dq.A03().A01.A00;
    }
}
