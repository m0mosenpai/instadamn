package X;

import android.graphics.Bitmap;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DWT extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final String A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWT(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, String str, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A08 = obj;
        this.A09 = str;
        this.A02 = obj2;
        this.A06 = obj3;
        this.A07 = obj4;
        this.A05 = obj5;
        this.A04 = obj6;
        this.A03 = obj7;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A00 != 0) {
            C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
            String str = this.A09;
            ImageUrl imageUrl = (ImageUrl) this.A02;
            CY6.A00((Bitmap) this.A03, A0S, (C5AH) this.A04, imageUrl, str, (InterfaceC16820sZ) this.A06, (InterfaceC16820sZ) this.A08, (InterfaceC16820sZ) this.A05, (InterfaceC16820sZ) this.A07, AbstractC25225BEi.A04(this.A01));
        } else {
            C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
            C51734MtH c51734MtH = (C51734MtH) this.A08;
            String str2 = this.A09;
            C28370CfW c28370CfW = (C28370CfW) this.A02;
            InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A06;
            InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A07;
            AbstractC28473ChR.A02(A0S2, c51734MtH, c28370CfW, str2, (InterfaceC16820sZ) this.A05, (InterfaceC16820sZ) this.A03, interfaceC16660sJ, interfaceC16660sJ2, (InterfaceC16620sF) this.A04, AbstractC25225BEi.A04(this.A01));
        }
        return C0eB.A00;
    }
}
