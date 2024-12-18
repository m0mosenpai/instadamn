package X;

/* loaded from: classes5.dex */
public final class DSP extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ PC6 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DSP(PC6 pc6, String str, boolean z, boolean z2) {
        super(2);
        this.A03 = z;
        this.A01 = str;
        this.A02 = z2;
        this.A00 = pc6;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1010262005, "com.instagram.rtc.presentation.aistatus.RtcCallAiStatusViewHolder.inflateView.<anonymous>.<anonymous> (RtcCallAiStatusViewHolder.kt:40)");
            }
            if (this.A03) {
                CK2.A00(c5Tl, this.A01, this.A00.A03, 0, this.A02);
            }
            if (C0fH.A02()) {
                C0fH.A00(-1111697692);
            }
        }
        return C0eB.A00;
    }
}
