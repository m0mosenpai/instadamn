package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DW9 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ C5YL A04;
    public final /* synthetic */ ImageUrl A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ InterfaceC16820sZ A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DW9(Modifier modifier, C5YL c5yl, ImageUrl imageUrl, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, float f, int i, int i2) {
        super(2);
        this.A06 = str;
        this.A05 = imageUrl;
        this.A07 = str2;
        this.A08 = str3;
        this.A03 = modifier;
        this.A09 = interfaceC16820sZ;
        this.A00 = f;
        this.A04 = c5yl;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A06;
        ImageUrl imageUrl = this.A05;
        String str2 = this.A07;
        String str3 = this.A08;
        AbstractC28299Cdl.A00(A0S, this.A03, this.A04, imageUrl, str, str2, str3, this.A09, this.A00, AbstractC25225BEi.A04(this.A01), this.A02);
        return C0eB.A00;
    }
}