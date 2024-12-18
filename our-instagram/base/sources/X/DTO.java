package X;

import com.instagram.wonderwall.model.WallImage;

/* loaded from: classes5.dex */
public final class DTO extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ WallImage A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTO(WallImage wallImage, String str, float f, int i, int i2, long j) {
        super(2);
        this.A04 = wallImage;
        this.A03 = j;
        this.A05 = str;
        this.A00 = f;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AbstractC28470ChM.A05(AbstractC25226BEj.A0S(obj, obj2), this.A04, this.A05, this.A00, AbstractC25225BEi.A04(this.A01), this.A02, this.A03);
        return C0eB.A00;
    }
}
