package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wz3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71696Wz3 implements InterfaceC19960yQ {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ C15370ps A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public C71696Wz3(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, C15370ps c15370ps, boolean z, boolean z2, boolean z3) {
        this.A06 = c15370ps;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = str;
        this.A04 = str2;
        this.A07 = z;
        this.A09 = z2;
        this.A08 = z3;
        this.A02 = str3;
        this.A05 = str4;
    }

    @Override // X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C1Y6 A00 = AbstractC69888VxF.A00();
        C15370ps c15370ps = this.A06;
        String str = (String) c15370ps.A00;
        UserSession userSession = this.A01;
        C69667Vt8 c69667Vt8 = new C69667Vt8(this.A00, new Wf0(c15370ps), userSession, (C38321qM) obj, str);
        c69667Vt8.A06 = this.A03;
        c69667Vt8.A08 = this.A04;
        c69667Vt8.A0C = this.A07;
        c69667Vt8.A0E = this.A09;
        c69667Vt8.A0D = this.A08;
        c69667Vt8.A05 = this.A02;
        c69667Vt8.A09 = this.A05;
        c69667Vt8.A0F = true;
        c69667Vt8.A0B = true;
        A00.A0C(c69667Vt8);
        return C0eB.A00;
    }
}
