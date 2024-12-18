package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DVa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30273DVa extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ C6KV A05;
    public final /* synthetic */ Modifier A06;
    public final /* synthetic */ C5AH A07;
    public final /* synthetic */ InterfaceC16620sF A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30273DVa(C6KV c6kv, Modifier modifier, C5AH c5ah, InterfaceC16620sF interfaceC16620sF, float f, int i, int i2, long j, long j2) {
        super(2);
        this.A06 = modifier;
        this.A07 = c5ah;
        this.A03 = j;
        this.A04 = j2;
        this.A05 = c6kv;
        this.A00 = f;
        this.A08 = interfaceC16620sF;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        Modifier modifier = this.A06;
        C5AH c5ah = this.A07;
        long j = this.A03;
        long j2 = this.A04;
        C6L8.A01(this.A05, A0S, modifier, c5ah, this.A08, this.A00, AbstractC25225BEi.A04(this.A01), this.A02, j, j2);
        return C0eB.A00;
    }
}
