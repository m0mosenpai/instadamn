package X;

import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wef, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70659Wef implements XCQ {
    public final /* synthetic */ BaseFragmentActivity A00;
    public final /* synthetic */ VG4 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public C70659Wef(BaseFragmentActivity baseFragmentActivity, VG4 vg4, UserSession userSession, String str) {
        this.A02 = userSession;
        this.A03 = str;
        this.A01 = vg4;
        this.A00 = baseFragmentActivity;
    }

    @Override // X.XCQ
    public final void Dwe() {
        W8S.A00(this.A01, this.A02, this.A03);
        C9GR.A04(this.A00);
    }

    @Override // X.XCQ
    public final void E65(String str) {
        UserSession userSession = this.A02;
        C70399WUb A00 = C70399WUb.A00(userSession);
        String str2 = this.A03;
        A00.A0T(str2, this.A01.toString());
        VRN.A00(this.A00, userSession, str2);
    }
}
