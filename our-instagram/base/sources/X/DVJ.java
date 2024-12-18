package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DVJ extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVJ(Object obj, Object obj2, Object obj3, String str, String str2, String str3, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A07 = str;
        this.A03 = obj;
        this.A06 = str2;
        this.A05 = str3;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (i != 0) {
            AbstractC27622CGt.A00(A0S, this.A07, this.A06, this.A05, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A04, AbstractC25225BEi.A04(this.A01));
        } else {
            String str = this.A07;
            AbstractC28451Ch0.A01(A0S, (EnumC27374C6d) this.A02, (ImageUrl) this.A03, str, this.A06, this.A05, (InterfaceC16620sF) this.A04, AbstractC25225BEi.A04(this.A01));
        }
        return C0eB.A00;
    }
}
