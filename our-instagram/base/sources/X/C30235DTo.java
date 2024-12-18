package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DTo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30235DTo extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30235DTo(ImageUrl imageUrl, String str, InterfaceC16820sZ interfaceC16820sZ, int i, long j, boolean z, boolean z2) {
        super(2);
        this.A03 = str;
        this.A02 = imageUrl;
        this.A04 = interfaceC16820sZ;
        this.A01 = j;
        this.A05 = z;
        this.A06 = z2;
        this.A00 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A03;
        AbstractC28386Cfp.A02(A0S, this.A02, str, this.A04, AbstractC25225BEi.A04(this.A00), this.A01, this.A05, this.A06);
        return C0eB.A00;
    }
}
