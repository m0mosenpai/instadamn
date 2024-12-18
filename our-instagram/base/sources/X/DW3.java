package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DW3 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ InterfaceC74963Ym A03;
    public final /* synthetic */ MUD A04;
    public final /* synthetic */ ImageUrl A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ InterfaceC16820sZ A08;
    public final /* synthetic */ InterfaceC16660sJ A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DW3(InterfaceC74963Ym interfaceC74963Ym, MUD mud, ImageUrl imageUrl, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, float f, int i, int i2) {
        super(2);
        this.A07 = str;
        this.A00 = f;
        this.A05 = imageUrl;
        this.A06 = str2;
        this.A04 = mud;
        this.A03 = interfaceC74963Ym;
        this.A09 = interfaceC16660sJ;
        this.A08 = interfaceC16820sZ;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A07;
        float f = this.A00;
        ImageUrl imageUrl = this.A05;
        String str2 = this.A06;
        MUD mud = this.A04;
        CXZ.A00(A0S, this.A03, mud, imageUrl, str, str2, this.A08, this.A09, f, AbstractC25225BEi.A04(this.A01), this.A02);
        return C0eB.A00;
    }
}
