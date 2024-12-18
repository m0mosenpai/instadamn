package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DTe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30225DTe extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30225DTe(Object obj, Object obj2, String str, String str2, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A03 = obj;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = obj2;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                AbstractC28451Ch0.A03(A0S, (ImageUrl) this.A02, this.A05, this.A04, (InterfaceC16620sF) this.A03, AbstractC25225BEi.A04(this.A01));
                break;
            case 1:
                AbstractC27623CGu.A00(A0S, this.A05, this.A04, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            default:
                AbstractC28441Cgp.A03(A0S, (EnumC27380C6j) this.A03, this.A04, this.A05, (C0s9) this.A02, AbstractC25225BEi.A04(this.A01));
                break;
        }
        return C0eB.A00;
    }
}
