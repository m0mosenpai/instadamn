package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DUx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30270DUx extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ ImageUrl A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30270DUx(Modifier modifier, ImageUrl imageUrl, String str, String str2, float f, float f2, int i, int i2) {
        super(2);
        this.A04 = modifier;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = imageUrl;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i;
        this.A03 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AbstractC27706CJz.A00(AbstractC25226BEj.A0S(obj, obj2), this.A04, this.A05, this.A07, this.A06, this.A00, this.A01, AbstractC25225BEi.A04(this.A02), this.A03);
        return C0eB.A00;
    }
}
