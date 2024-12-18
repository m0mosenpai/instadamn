package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.6I8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6I8 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6I8(Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A02 = i;
        this.A05 = z;
        this.A06 = z2;
        this.A03 = modifier;
        this.A04 = interfaceC16820sZ;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC136716Ha.A04((C5Tl) obj, this.A03, this.A04, this.A02, AbstractC128295qy.A00(this.A00 | 1), this.A01, this.A05, this.A06);
        return C0eB.A00;
    }
}
