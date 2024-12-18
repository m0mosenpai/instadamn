package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class MED extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MED(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z, boolean z2) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
        this.A05 = z;
        this.A06 = z2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        if (this.A00 != 0) {
            InterfaceC169497hP interfaceC169497hP = (InterfaceC169497hP) this.A02;
            OL1 ol1 = (OL1) this.A04;
            XB8 xb8 = (XB8) ol1.A06.getValue();
            return new C65960TxC(W14.A00, (XB6) ol1.A04.getValue(), xb8, new C71013WmU((UserSession) this.A03, (List) this.A01, this.A05, this.A06), interfaceC169497hP, 3, false);
        }
        boolean z = this.A06;
        L90 l90 = (L90) this.A04;
        if (z) {
            l90.A00();
        } else {
            FragmentActivity fragmentActivity = l90.A00;
            UserSession userSession = l90.A02;
            boolean z2 = this.A05;
            EnumC46298KeU enumC46298KeU = (EnumC46298KeU) this.A01;
            C45044JwZ A0P = l90.A03.A0P();
            if (A0P != null) {
                str = A0P.A04;
            } else {
                str = null;
            }
            AbstractC47030Kqn.A00(fragmentActivity, enumC46298KeU, userSession, str, new C30536DcJ(22, this.A03, l90, this.A02), z2);
        }
        return C0eB.A00;
    }
}
