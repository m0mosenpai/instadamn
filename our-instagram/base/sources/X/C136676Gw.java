package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* renamed from: X.6Gw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136676Gw extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ Alignment A05;
    public final /* synthetic */ Modifier A06;
    public final /* synthetic */ C5YV A07;
    public final /* synthetic */ C5YL A08;
    public final /* synthetic */ C69P A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ InterfaceC16820sZ A0B;
    public final /* synthetic */ InterfaceC16820sZ A0C;
    public final /* synthetic */ InterfaceC16820sZ A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C136676Gw(Alignment alignment, Modifier modifier, C5YV c5yv, C5YL c5yl, C69P c69p, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, float f, int i, int i2, int i3, long j) {
        super(2);
        this.A09 = c69p;
        this.A0A = str;
        this.A06 = modifier;
        this.A0C = interfaceC16820sZ;
        this.A0D = interfaceC16820sZ2;
        this.A0B = interfaceC16820sZ3;
        this.A05 = alignment;
        this.A08 = c5yl;
        this.A00 = f;
        this.A07 = c5yv;
        this.A04 = j;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C69P c69p = this.A09;
        String str = this.A0A;
        Modifier modifier = this.A06;
        InterfaceC16820sZ interfaceC16820sZ = this.A0C;
        InterfaceC16820sZ interfaceC16820sZ2 = this.A0D;
        InterfaceC16820sZ interfaceC16820sZ3 = this.A0B;
        Alignment alignment = this.A05;
        C5YL c5yl = this.A08;
        float f = this.A00;
        AbstractC136656Gu.A00((C5Tl) obj, alignment, modifier, this.A07, c5yl, c69p, str, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, f, AbstractC128295qy.A00(this.A01 | 1), AbstractC128295qy.A00(this.A02), this.A03, this.A04);
        return C0eB.A00;
    }
}
