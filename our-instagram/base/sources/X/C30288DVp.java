package X;

import androidx.compose.ui.Modifier;
import com.instagram.schools.management.data.SchoolInfo;

/* renamed from: X.DVp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30288DVp extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30288DVp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A06 = obj;
        this.A05 = obj2;
        this.A07 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A02 = obj6;
        this.A08 = z;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                AbstractC28386Cfp.A00((C6GN) this.A06, A0S, (C167607eG) this.A05, (C167627eI) this.A07, (InterfaceC16820sZ) this.A03, (InterfaceC16660sJ) this.A04, (C5Hc) this.A02, AbstractC25225BEi.A04(this.A01), this.A08);
                break;
            case 1:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A06;
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A05;
                InterfaceC16820sZ interfaceC16820sZ3 = (InterfaceC16820sZ) this.A04;
                boolean z = this.A08;
                C74 c74 = (C74) this.A07;
                AbstractC28507Ci0.A04(A0S2, (Modifier) this.A03, (InterfaceC11380iw) this.A02, c74, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, AbstractC25225BEi.A04(this.A01), z);
                break;
            case 2:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16820sZ interfaceC16820sZ4 = (InterfaceC16820sZ) this.A03;
                InterfaceC16820sZ interfaceC16820sZ5 = (InterfaceC16820sZ) this.A02;
                InterfaceC16820sZ interfaceC16820sZ6 = (InterfaceC16820sZ) this.A04;
                AbstractC28330CeI.A01(A0S3, (SchoolInfo) this.A05, (Integer) this.A06, (Integer) this.A07, interfaceC16820sZ4, interfaceC16820sZ5, interfaceC16820sZ6, AbstractC25225BEi.A04(this.A01), this.A08);
                break;
            default:
                C5Tl A0S4 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16820sZ interfaceC16820sZ7 = (InterfaceC16820sZ) this.A06;
                InterfaceC16820sZ interfaceC16820sZ8 = (InterfaceC16820sZ) this.A04;
                InterfaceC16820sZ interfaceC16820sZ9 = (InterfaceC16820sZ) this.A02;
                InterfaceC16820sZ interfaceC16820sZ10 = (InterfaceC16820sZ) this.A03;
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A05;
                AbstractC28508Ci2.A08(A0S4, (C51635MrS) this.A07, interfaceC16820sZ7, interfaceC16820sZ8, interfaceC16820sZ9, interfaceC16820sZ10, interfaceC16620sF, AbstractC25225BEi.A04(this.A01), this.A08);
                break;
        }
        return C0eB.A00;
    }
}
