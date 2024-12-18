package X;

import androidx.compose.ui.Modifier;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.DUl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30258DUl extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ GifUrlImpl A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30258DUl(Modifier modifier, GifUrlImpl gifUrlImpl, String str, String str2, float f, int i, int i2, int i3) {
        super(2);
        this.A07 = str;
        this.A05 = gifUrlImpl;
        this.A00 = f;
        this.A06 = str2;
        this.A04 = modifier;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A07;
        GifUrlImpl gifUrlImpl = this.A05;
        float f = this.A00;
        CGR.A00(A0S, this.A04, gifUrlImpl, str, this.A06, f, this.A03, AbstractC25225BEi.A04(this.A01), this.A02);
        return C0eB.A00;
    }
}
