package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DWJ extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ C7B A03;
    public final /* synthetic */ C6X A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ InterfaceC16610sE A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWJ(ImageUrl imageUrl, C7B c7b, C6X c6x, String str, String str2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16610sE interfaceC16610sE, int i, int i2, boolean z) {
        super(2);
        this.A05 = str;
        this.A06 = str2;
        this.A02 = imageUrl;
        this.A04 = c6x;
        this.A03 = c7b;
        this.A09 = z;
        this.A07 = interfaceC16660sJ;
        this.A08 = interfaceC16610sE;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A05;
        String str2 = this.A06;
        ImageUrl imageUrl = this.A02;
        C6X c6x = this.A04;
        CKX.A00(A0S, imageUrl, this.A03, c6x, str, str2, this.A07, this.A08, AbstractC25225BEi.A04(this.A00), this.A01, this.A09);
        return C0eB.A00;
    }
}
