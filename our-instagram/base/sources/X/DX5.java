package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DX5 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ EnumC168517fl A03;
    public final /* synthetic */ ImageUrl A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ InterfaceC16660sJ A08;
    public final /* synthetic */ InterfaceC16600sD A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DX5(Modifier modifier, EnumC168517fl enumC168517fl, ImageUrl imageUrl, String str, String str2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16600sD interfaceC16600sD, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A06 = str;
        this.A05 = str2;
        this.A0A = z;
        this.A04 = imageUrl;
        this.A08 = interfaceC16660sJ;
        this.A0B = z2;
        this.A07 = interfaceC16660sJ2;
        this.A09 = interfaceC16600sD;
        this.A03 = enumC168517fl;
        this.A02 = modifier;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A06;
        String str2 = this.A05;
        boolean z = this.A0A;
        ImageUrl imageUrl = this.A04;
        InterfaceC16660sJ interfaceC16660sJ = this.A08;
        boolean z2 = this.A0B;
        InterfaceC16660sJ interfaceC16660sJ2 = this.A07;
        InterfaceC16600sD interfaceC16600sD = this.A09;
        AbstractC27585CFe.A00(A0S, this.A02, this.A03, imageUrl, str, str2, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16600sD, AbstractC25225BEi.A04(this.A00), this.A01, z, z2);
        return C0eB.A00;
    }
}
