package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DSt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30214DSt extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30214DSt(Object obj, int i, int i2, int i3, int i4) {
        super(2);
        this.A00 = i4;
        this.A02 = i;
        this.A03 = i2;
        this.A04 = obj;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        switch (this.A00) {
            case 0:
                AbstractC28291Cdd.A02(AbstractC25226BEj.A0S(obj, obj2), (C5Hc) this.A04, this.A03, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 1:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                int i2 = this.A03;
                Modifier modifier = (Modifier) this.A04;
                int A04 = AbstractC25225BEi.A04(this.A01);
                int i3 = this.A02;
                A0S.Enr(255748072);
                if ((i3 & 1) != 0) {
                    i = A04 | 6;
                } else if ((A04 & 6) == 0) {
                    i = AbstractC25232BEp.A08(A0S, i2) | A04;
                } else {
                    i = A04;
                }
                int i4 = i3 & 2;
                if (i4 != 0) {
                    i |= 48;
                } else if ((A04 & 48) == 0) {
                    i |= AbstractC25232BEp.A0S(A0S, modifier);
                }
                if ((i & 19) == 18 && A0S.Bxj()) {
                    A0S.Em9();
                } else {
                    if (i4 != 0) {
                        modifier = Modifier.A00;
                    }
                    if (C0fH.A02()) {
                        C0fH.A01(-393163822, "com.instagram.barcelona.common.ui.toast.BdsToastIgIcon (BdsToastMessage.kt:150)");
                    }
                    C5YS.A06(A0S, AbstractC118185Wd.A03(AbstractC118185Wd.A02(C118195Wf.A09, AbstractC118185Wd.A04(modifier))), AbstractC25226BEj.A0Y(A0S, i, i2), ((C1132359l) A0S.AJX(C6L9.A00)).A00);
                    if (C0fH.A02()) {
                        C0fH.A00(120500206);
                    }
                }
                C5UU ASZ = A0S.ASZ();
                if (ASZ != null) {
                    ASZ.A06 = new C30214DSt(modifier, i3, i2, A04, 1);
                    break;
                }
                break;
            case 2:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                AbstractC28505Chy.A00(this.A02, (Modifier) this.A04, A0S2, this.A03, AbstractC25225BEi.A04(this.A01));
                break;
            default:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                CGU.A00(this.A03, (Modifier) this.A04, A0S3, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
        }
        return C0eB.A00;
    }
}
