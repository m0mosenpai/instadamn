package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DVR extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ LineType A03;
    public final /* synthetic */ ImageUrl A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVR(Modifier modifier, LineType lineType, ImageUrl imageUrl, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z) {
        super(2);
        this.A06 = str;
        this.A05 = str2;
        this.A04 = imageUrl;
        this.A03 = lineType;
        this.A08 = z;
        this.A02 = modifier;
        this.A07 = interfaceC16820sZ;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A06;
        String str2 = this.A05;
        ImageUrl imageUrl = this.A04;
        AbstractC28295Cdh.A00(A0S, this.A02, this.A03, imageUrl, str, str2, this.A07, AbstractC25225BEi.A04(this.A00), this.A01, this.A08);
        return C0eB.A00;
    }
}
