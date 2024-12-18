package X;

import com.instagram.wonderwall.model.WallPostItem;

/* loaded from: classes5.dex */
public final class DTP extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ WallPostItem A03;
    public final /* synthetic */ InterfaceC31065Dl7 A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTP(WallPostItem wallPostItem, InterfaceC31065Dl7 interfaceC31065Dl7, float f, int i, int i2, boolean z) {
        super(2);
        this.A03 = wallPostItem;
        this.A00 = f;
        this.A04 = interfaceC31065Dl7;
        this.A05 = z;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        WallPostItem wallPostItem = this.A03;
        float f = this.A00;
        AbstractC28404CgA.A03(A0S, wallPostItem, this.A04, f, AbstractC25225BEi.A04(this.A01), this.A02, this.A05);
        return C0eB.A00;
    }
}
