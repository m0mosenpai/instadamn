package X;

import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;

/* loaded from: classes5.dex */
public final class DWM extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final boolean A08;
    public final boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWM(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A00 = i3;
        this.A04 = obj;
        this.A02 = i;
        this.A01 = i2;
        this.A07 = obj2;
        this.A03 = obj3;
        this.A05 = obj4;
        this.A06 = obj5;
        this.A09 = z;
        this.A08 = z2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A00 != 0) {
            C5Tl c5Tl = (C5Tl) obj;
            if (AbstractC25228BEl.A0C(obj2) == 2 && c5Tl.Bxj()) {
                c5Tl.Em9();
            } else {
                if (C0fH.A02()) {
                    C0fH.A01(467450878, "com.instagram.creation.genai.magicmod.common.ui.MagicModBackdropSegmentedImage.<anonymous>.<anonymous> (MagicModBackdropSegmentedImage.kt:67)");
                }
                CHL.A00(c5Tl, (MagicModPostCaptureTransform) this.A04, C5UA.A01(c5Tl, new C30284DVl(this.A07, this.A03, this.A05, this.A06, this.A02, this.A01, 3, this.A09, this.A08), 853939522), 56);
                if (C0fH.A02()) {
                    C0fH.A00(287973068);
                }
            }
        } else {
            CH5.A00(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16620sF) this.A05, (InterfaceC16620sF) this.A06, (InterfaceC16620sF) this.A04, (InterfaceC16620sF) this.A03, (InterfaceC16620sF) this.A07, AbstractC25225BEi.A04(this.A01), this.A02, this.A09, this.A08);
        }
        return C0eB.A00;
    }
}
