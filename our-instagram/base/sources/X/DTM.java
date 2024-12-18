package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DTM extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ImageUrl A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTM(ImageUrl imageUrl, String str, String str2, int i, boolean z, boolean z2) {
        super(2);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = imageUrl;
        this.A05 = z;
        this.A04 = z2;
        this.A00 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A02;
        String str2 = this.A03;
        CK0.A00(A0S, this.A01, str, str2, AbstractC25225BEi.A04(this.A00), this.A05, this.A04);
        return C0eB.A00;
    }
}
