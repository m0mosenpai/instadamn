package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DXt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30344DXt extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ C26079Bg8 A04;
    public final /* synthetic */ C26079Bg8 A05;
    public final /* synthetic */ C26079Bg8 A06;
    public final /* synthetic */ ImageUrl A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ InterfaceC16820sZ A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30344DXt(View view, C26079Bg8 c26079Bg8, C26079Bg8 c26079Bg82, C26079Bg8 c26079Bg83, ImageUrl imageUrl, Integer num, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A0B = interfaceC16820sZ;
        this.A0A = str;
        this.A09 = str2;
        this.A04 = c26079Bg8;
        this.A05 = c26079Bg82;
        this.A06 = c26079Bg83;
        this.A03 = view;
        this.A0C = z;
        this.A0D = z2;
        this.A0E = z3;
        this.A07 = imageUrl;
        this.A08 = num;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        InterfaceC16820sZ interfaceC16820sZ = this.A0B;
        String str = this.A0A;
        String str2 = this.A09;
        C26079Bg8 c26079Bg8 = this.A04;
        C26079Bg8 c26079Bg82 = this.A05;
        C26079Bg8 c26079Bg83 = this.A06;
        AbstractC28433Cgh.A00(this.A03, A0S, c26079Bg8, c26079Bg82, c26079Bg83, this.A07, this.A08, str, str2, interfaceC16820sZ, AbstractC25225BEi.A04(this.A00), AbstractC128295qy.A00(this.A01), this.A02, this.A0C, this.A0D, this.A0E);
        return C0eB.A00;
    }
}
