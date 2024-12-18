package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DTc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30223DTc extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30223DTc(Object obj, Object obj2, String str, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A04 = str;
        this.A05 = z;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                AbstractC28040CXs.A01(A0S, (EnumC166167bk) this.A02, this.A04, (InterfaceC16620sF) this.A03, AbstractC25225BEi.A04(this.A01), this.A05);
                break;
            case 1:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A02;
                boolean z = this.A05;
                AbstractC28300Cdm.A02(A0S, this.A04, interfaceC16820sZ, (InterfaceC16660sJ) this.A03, AbstractC25225BEi.A04(this.A01), z);
                break;
            default:
                AbstractC28308Cdu.A01(A0S, (ImageUrl) this.A03, this.A04, (InterfaceC16820sZ) this.A02, AbstractC25225BEi.A04(this.A01), this.A05);
                break;
        }
        return C0eB.A00;
    }
}
