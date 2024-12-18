package X;

import androidx.compose.ui.Modifier;
import com.instagram.wonderwall.model.WallPostItem;

/* loaded from: classes5.dex */
public final class DV0 extends C0YY implements InterfaceC16620sF {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DV0(Object obj, Object obj2, float f, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A01 = i3;
        this.A05 = obj;
        this.A06 = z;
        this.A07 = z2;
        this.A00 = f;
        this.A04 = obj2;
        this.A02 = i;
        this.A03 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A01;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        Object obj3 = this.A05;
        if (i != 0) {
            boolean z = this.A06;
            boolean z2 = this.A07;
            CKV.A00(A0S, (Modifier) obj3, (InterfaceC16620sF) this.A04, this.A00, AbstractC25225BEi.A04(this.A02), this.A03, z, z2);
        } else {
            AbstractC28403Cg9.A02(A0S, (WallPostItem) obj3, (InterfaceC16660sJ) this.A04, this.A00, AbstractC25225BEi.A04(this.A02), this.A03, this.A07, this.A06);
        }
        return C0eB.A00;
    }
}
