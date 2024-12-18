package X;

import com.instagram.genai.imageutils.MaskUtilsKt;

/* renamed from: X.Pgi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57570Pgi extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ int[] A04;
    public final /* synthetic */ int[] A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57570Pgi(int[] iArr, int[] iArr2, int i, int i2, int i3, boolean z) {
        super(1);
        this.A00 = i;
        this.A02 = i2;
        this.A05 = iArr;
        this.A01 = i3;
        this.A04 = iArr2;
        this.A03 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        int A0H = AbstractC166987dD.A0H(obj);
        for (int i2 = 0; i2 < this.A00; i2++) {
            int i3 = (this.A02 * i2) + A0H;
            if (this.A05[i3] == this.A01) {
                int[] iArr = this.A04;
                if (this.A03) {
                    i = MaskUtilsKt.A00;
                } else {
                    i = MaskUtilsKt.A01;
                }
                iArr[i3] = i;
            }
        }
        return C0eB.A00;
    }
}
