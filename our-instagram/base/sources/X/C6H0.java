package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.6H0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6H0 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ double A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ C118125Vw A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6H0(Modifier modifier, C118125Vw c118125Vw, String str, double d, int i, int i2) {
        super(2);
        this.A00 = d;
        this.A05 = str;
        this.A03 = modifier;
        this.A04 = c118125Vw;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        double d = this.A00;
        AbstractC136706Gz.A00((C5Tl) obj, this.A03, this.A04, this.A05, d, AbstractC128295qy.A00(this.A01 | 1), this.A02);
        return C0eB.A00;
    }
}
