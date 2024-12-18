package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;

/* renamed from: X.DWw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30321DWw extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30321DWw(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A00 = i3;
        this.A06 = obj;
        this.A0A = z;
        this.A07 = str;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A09 = z2;
        this.A08 = z3;
        this.A03 = obj4;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                String str = this.A07;
                boolean z = this.A0A;
                LineType lineType = (LineType) this.A06;
                CEI.A00(A0S, (Modifier) this.A03, lineType, str, (InterfaceC16660sJ) this.A04, (InterfaceC16660sJ) this.A05, AbstractC25225BEi.A04(this.A01), this.A02, z, this.A09, this.A08);
                break;
            case 1:
                LineType lineType2 = (LineType) this.A06;
                boolean z2 = this.A0A;
                CEN.A00(A0S, (Modifier) this.A03, lineType2, this.A07, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A05, AbstractC25225BEi.A04(this.A01), this.A02, z2, this.A09, this.A08);
                break;
            default:
                String str2 = this.A07;
                InterfaceC30801Dgc interfaceC30801Dgc = (InterfaceC30801Dgc) this.A06;
                boolean z3 = this.A09;
                Modifier modifier = (Modifier) this.A05;
                boolean z4 = this.A08;
                boolean z5 = this.A0A;
                AbstractC28505Chy.A07(A0S, modifier, interfaceC30801Dgc, (Integer) this.A04, str2, (InterfaceC16620sF) this.A03, this.A02, AbstractC25225BEi.A04(this.A01), z3, z4, z5);
                break;
        }
        return C0eB.A00;
    }
}
