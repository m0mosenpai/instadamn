package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;

/* loaded from: classes5.dex */
public final class DVB extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVB(Object obj, Object obj2, String str, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A00 = i3;
        this.A05 = str;
        this.A04 = obj;
        this.A07 = z;
        this.A03 = obj2;
        this.A06 = z2;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                String str = this.A05;
                LineType lineType = (LineType) this.A04;
                boolean z = this.A07;
                CEQ.A00(A0S, (Modifier) this.A03, lineType, str, AbstractC25225BEi.A04(this.A01), this.A02, z, this.A06);
                break;
            case 1:
                boolean z2 = this.A06;
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A04;
                String str2 = this.A05;
                AbstractC28436Cgk.A02(A0S, (EnumC27393C6w) this.A03, str2, interfaceC16820sZ, AbstractC25225BEi.A04(this.A01), this.A02, z2, this.A07);
                break;
            default:
                boolean z3 = this.A06;
                AbstractC28436Cgk.A04(A0S, this.A05, (InterfaceC16820sZ) this.A04, (C19L) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, z3, this.A07);
                break;
        }
        return C0eB.A00;
    }
}
