package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Pbs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57270Pbs extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57270Pbs(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A05 = str;
        this.A04 = str2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                ((C0s9) this.A01).invoke(this.A03, this.A02, null, null, null, this.A04, this.A05);
                break;
            case 1:
                C148456mF c148456mF = (C148456mF) this.A03;
                C148456mF.A00((C9CN) this.A02, (C38321qM) this.A01, c148456mF, this.A04, this.A05);
                ((C141806ax) c148456mF.A0A.getValue()).A01();
                C148456mF.A01(C56526P7y.A00, c148456mF);
                break;
            default:
                Activity activity = (Activity) this.A01;
                UserSession userSession = (UserSession) this.A03;
                C38321qM c38321qM = (C38321qM) this.A02;
                String str = this.A05;
                String str2 = this.A04;
                long j = AbstractC27782CMx.A00;
                C3DN A0r = AbstractC31172DnG.A0r(activity);
                if (A0r != null) {
                    ((C3DP) A0r).A0n = true;
                }
                JQ0.A1O(activity, userSession, c38321qM, str, str2);
                AbstractC27704CJx.A00(activity, userSession, c38321qM, str2, str);
                break;
        }
        return C0eB.A00;
    }
}
