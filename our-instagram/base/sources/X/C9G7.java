package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.9G7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9G7 extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A00 != 0) {
            ((Number) obj2).intValue();
            C2DC c2dc = (C2DC) this.A06;
            String str = this.A07;
            C5YT.A00((C5Tl) obj, (Modifier) this.A05, c2dc, (C5YL) this.A04, str, AbstractC128295qy.A00(this.A01 | 1), this.A02, this.A03);
        } else {
            ((Number) obj2).intValue();
            C2DC c2dc2 = (C2DC) this.A06;
            String str2 = this.A07;
            C5YS.A07((C5Tl) obj, (Modifier) this.A05, c2dc2, (C5YL) this.A04, str2, AbstractC128295qy.A00(this.A01 | 1), this.A02, this.A03);
        }
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9G7(Modifier modifier, C2DC c2dc, C5YL c5yl, String str, int i, int i2, int i3, long j) {
        super(2);
        this.A00 = i3;
        this.A06 = c2dc;
        this.A07 = str;
        this.A05 = modifier;
        this.A03 = j;
        this.A04 = c5yl;
        this.A01 = i;
        this.A02 = i2;
    }
}
