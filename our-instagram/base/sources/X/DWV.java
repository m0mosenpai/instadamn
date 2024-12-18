package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DWV extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ ImageUrl A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ InterfaceC16820sZ A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWV(ImageUrl imageUrl, String str, String str2, String str3, String str4, InterfaceC16820sZ interfaceC16820sZ, float f, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A03 = imageUrl;
        this.A07 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A0A = z;
        this.A08 = interfaceC16820sZ;
        this.A00 = f;
        this.A09 = z2;
        this.A04 = str4;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        ImageUrl imageUrl = this.A03;
        String str = this.A07;
        String str2 = this.A05;
        String str3 = this.A06;
        boolean z = this.A0A;
        AbstractC27526CCw.A00(A0S, imageUrl, str, str2, str3, this.A04, this.A08, this.A00, AbstractC25225BEi.A04(this.A01), this.A02, z, this.A09);
        return C0eB.A00;
    }
}
