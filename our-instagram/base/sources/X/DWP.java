package X;

import com.instagram.feed.tifu.TifuViewModel;
import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public final class DWP extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWP(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A06 = obj;
        this.A08 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A02 = obj5;
        this.A04 = obj6;
        this.A07 = obj7;
        this.A09 = z;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                C3A0 c3a0 = (C3A0) this.A06;
                TifuViewModel tifuViewModel = (TifuViewModel) this.A08;
                InterfaceC132365yF interfaceC132365yF = (InterfaceC132365yF) this.A05;
                C5yI c5yI = (C5yI) this.A03;
                C132345yD c132345yD = (C132345yD) this.A02;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A04;
                C3A0.A00(A0S, c5yI, interfaceC132365yF, c132345yD, c3a0, tifuViewModel, (User) this.A07, interfaceC16660sJ, AbstractC25225BEi.A04(this.A01), this.A09);
                break;
            case 1:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A07;
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A08;
                InterfaceC16820sZ interfaceC16820sZ3 = (InterfaceC16820sZ) this.A03;
                InterfaceC16820sZ interfaceC16820sZ4 = (InterfaceC16820sZ) this.A06;
                boolean z = this.A09;
                C26014Bf2 c26014Bf2 = (C26014Bf2) this.A02;
                AbstractC28469ChL.A02(A0S, (EnumC39642HiX) this.A05, (C29138Ct5) this.A04, c26014Bf2, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, AbstractC25225BEi.A04(this.A01), z);
                break;
            default:
                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A07;
                InterfaceC16660sJ interfaceC16660sJ3 = (InterfaceC16660sJ) this.A05;
                InterfaceC16660sJ interfaceC16660sJ4 = (InterfaceC16660sJ) this.A03;
                InterfaceC16660sJ interfaceC16660sJ5 = (InterfaceC16660sJ) this.A04;
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A06;
                AbstractC28508Ci2.A0F(A0S, (InterfaceC16820sZ) this.A02, interfaceC16660sJ2, interfaceC16660sJ3, interfaceC16660sJ4, interfaceC16660sJ5, interfaceC16620sF, (C5Hc) this.A08, AbstractC25225BEi.A04(this.A01), this.A09);
                break;
        }
        return C0eB.A00;
    }
}
