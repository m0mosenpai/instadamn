package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DWo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30313DWo extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30313DWo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A00 = i3;
        this.A03 = obj;
        this.A06 = obj2;
        this.A05 = obj3;
        this.A08 = z;
        this.A0A = z2;
        this.A07 = obj4;
        this.A09 = z3;
        this.A04 = obj5;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (i != 0) {
            ImageUrl imageUrl = (ImageUrl) this.A03;
            ImageUrl imageUrl2 = (ImageUrl) this.A04;
            C5YV c5yv = (C5YV) this.A05;
            boolean z = this.A08;
            boolean z2 = this.A0A;
            boolean z3 = this.A09;
            BG8.A0B(A0S, c5yv, (C9C9) this.A06, imageUrl, imageUrl2, (InterfaceC16660sJ) this.A07, AbstractC25225BEi.A04(this.A01), this.A02, z, z2, z3);
        } else {
            InterfaceC109864xE interfaceC109864xE = (InterfaceC109864xE) this.A03;
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A06;
            InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A05;
            boolean z4 = this.A08;
            boolean z5 = this.A0A;
            AbstractC28297Cdj.A00(A0S, (Modifier) this.A04, interfaceC109864xE, (LineType) this.A07, interfaceC16820sZ, interfaceC16660sJ, AbstractC25225BEi.A04(this.A01), this.A02, z4, z5, this.A09);
        }
        return C0eB.A00;
    }
}
