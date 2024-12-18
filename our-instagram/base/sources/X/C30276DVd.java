package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* renamed from: X.DVd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30276DVd extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Alignment A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ C118125Vw A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC16620sF A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30276DVd(Alignment alignment, Modifier modifier, C118125Vw c118125Vw, String str, InterfaceC16620sF interfaceC16620sF, int i, int i2, long j, boolean z) {
        super(2);
        this.A08 = z;
        this.A02 = j;
        this.A05 = c118125Vw;
        this.A06 = str;
        this.A04 = modifier;
        this.A03 = alignment;
        this.A07 = interfaceC16620sF;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        boolean z = this.A08;
        long j = this.A02;
        C118125Vw c118125Vw = this.A05;
        String str = this.A06;
        AbstractC28443Cgr.A00(A0S, this.A03, this.A04, c118125Vw, str, this.A07, AbstractC25225BEi.A04(this.A00), this.A01, j, z);
        return C0eB.A00;
    }
}
