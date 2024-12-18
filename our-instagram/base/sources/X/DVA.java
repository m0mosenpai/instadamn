package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;

/* loaded from: classes5.dex */
public final class DVA extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVA(Object obj, Object obj2, String str, int i, int i2, int i3, long j, boolean z) {
        super(2);
        this.A00 = i3;
        this.A05 = obj;
        this.A06 = str;
        this.A07 = z;
        this.A03 = j;
        this.A04 = obj2;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A00 != 0) {
            C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
            C6L1 c6l1 = (C6L1) this.A05;
            String str = this.A06;
            boolean z = this.A07;
            AbstractC28045CXx.A00(c6l1, A0S, str, (InterfaceC16820sZ) this.A04, AbstractC25225BEi.A04(this.A01), this.A02, this.A03, z);
        } else {
            C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
            String str2 = this.A06;
            LineType lineType = (LineType) this.A05;
            boolean z2 = this.A07;
            CEY.A00(A0S2, (Modifier) this.A04, lineType, str2, AbstractC25225BEi.A04(this.A01), this.A02, this.A03, z2);
        }
        return C0eB.A00;
    }
}
