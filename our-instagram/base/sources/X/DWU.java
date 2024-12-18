package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class DWU extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWU(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i, int i2, int i3, long j) {
        super(2);
        this.A00 = i3;
        this.A08 = str;
        this.A07 = obj;
        this.A06 = obj2;
        this.A05 = obj3;
        this.A09 = str2;
        this.A03 = j;
        this.A04 = obj4;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (i != 0) {
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A06;
            int i2 = this.A02;
            long j = this.A03;
            String str = this.A08;
            String str2 = this.A09;
            UserSession userSession = (UserSession) this.A07;
            AbstractC27687CJg.A00(A0S, (Modifier) this.A05, (InterfaceC11380iw) this.A04, userSession, str, str2, interfaceC16820sZ, i2, AbstractC25225BEi.A04(this.A01), j);
        } else {
            String str3 = this.A08;
            InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A07;
            CGX.A00(A0S, (Modifier) this.A06, (C1132359l) this.A04, (C2DC) this.A05, str3, this.A09, interfaceC16820sZ2, AbstractC25225BEi.A04(this.A01), this.A02, this.A03);
        }
        return C0eB.A00;
    }
}
