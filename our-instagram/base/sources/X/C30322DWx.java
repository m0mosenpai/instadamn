package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DWx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30322DWx extends C0YY implements InterfaceC16620sF {
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
    public final boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30322DWx(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, String str, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A07 = obj;
        this.A06 = obj2;
        this.A05 = obj3;
        this.A04 = obj4;
        this.A08 = obj5;
        this.A0A = z;
        this.A09 = str;
        this.A02 = obj6;
        this.A03 = obj7;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (i != 0) {
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A07;
            InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A06;
            InterfaceC16820sZ interfaceC16820sZ3 = (InterfaceC16820sZ) this.A05;
            InterfaceC16820sZ interfaceC16820sZ4 = (InterfaceC16820sZ) this.A04;
            C69 c69 = (C69) this.A08;
            boolean z = this.A0A;
            String str = this.A09;
            AbstractC28322CeA.A02(A0S, (Modifier) this.A03, (InterfaceC11380iw) this.A02, c69, str, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, AbstractC25225BEi.A04(this.A01), z);
        } else {
            InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A07;
            InterfaceC16820sZ interfaceC16820sZ5 = (InterfaceC16820sZ) this.A04;
            InterfaceC16820sZ interfaceC16820sZ6 = (InterfaceC16820sZ) this.A06;
            String str2 = this.A09;
            ImageUrl imageUrl = (ImageUrl) this.A08;
            C51745MtU c51745MtU = (C51745MtU) this.A05;
            boolean z2 = this.A0A;
            AbstractC28507Ci0.A02(A0S, (Modifier) this.A03, c51745MtU, (InterfaceC11380iw) this.A02, imageUrl, str2, interfaceC16820sZ5, interfaceC16820sZ6, interfaceC16620sF, AbstractC25225BEi.A04(this.A01), z2);
        }
        return C0eB.A00;
    }
}
