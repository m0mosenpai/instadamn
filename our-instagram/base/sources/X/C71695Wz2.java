package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wz2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71695Wz2 implements InterfaceC19960yQ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ C15370ps A05;

    public C71695Wz2(FragmentActivity fragmentActivity, UserSession userSession, String str, C15370ps c15370ps, int i, int i2) {
        this.A05 = c15370ps;
        this.A03 = userSession;
        this.A02 = fragmentActivity;
        this.A04 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C1Y6 A00 = AbstractC69888VxF.A00();
        C15370ps c15370ps = this.A05;
        String str = (String) c15370ps.A00;
        UserSession userSession = this.A03;
        C69667Vt8 c69667Vt8 = new C69667Vt8(this.A02, new C70680Wf1(c15370ps), userSession, (C38321qM) obj, str);
        c69667Vt8.A03 = PromoteLaunchOrigin.A05;
        c69667Vt8.A08 = this.A04;
        c69667Vt8.A00 = this.A00;
        c69667Vt8.A01 = this.A01;
        c69667Vt8.A0F = true;
        c69667Vt8.A0B = true;
        A00.A0C(c69667Vt8);
        return C0eB.A00;
    }
}
