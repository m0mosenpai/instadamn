package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DT1 extends C0YY implements InterfaceC16620sF {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DT1(Object obj, String str, float f, int i, int i2) {
        super(2);
        this.A01 = i2;
        this.A03 = obj;
        this.A00 = f;
        this.A04 = str;
        this.A02 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A01;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (i != 0) {
            AbstractC27708CKb.A00(A0S, (ImageUrl) this.A03, this.A04, this.A00, AbstractC25225BEi.A04(this.A02));
        } else {
            AbstractC28475ChT.A04(A0S, (C2DC) this.A03, this.A04, this.A00, AbstractC25225BEi.A04(this.A02));
        }
        return C0eB.A00;
    }
}
