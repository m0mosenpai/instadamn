package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DcL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30538DcL extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (2 - this.A00 != 0) {
            String str = (String) obj;
            String str2 = (String) obj2;
            C51729Mt8 c51729Mt8 = (C51729Mt8) obj3;
            AbstractC167027dH.A12(str, str2, c51729Mt8);
            ((C5yI) this.A01).DRL(c51729Mt8, null, str, str2, this.A03, this.A02);
        } else {
            C5Tl c5Tl = (C5Tl) obj2;
            boolean A1X = AbstractC25231BEo.A1X(obj3, obj);
            if (C0fH.A02()) {
                C0fH.A01(155539075, "com.instagram.rtc.presentation.connecting.RtcCallConnectingViewHolder.inflateAiConnectingComposeView.<anonymous>.<anonymous>.<anonymous> (RtcCallConnectingViewHolder.kt:197)");
            }
            AbstractC27706CJz.A00(c5Tl, AbstractC25226BEj.A0X(AbstractC25228BEl.A0V(), C5XL.A00(c5Tl).A0c), (ImageUrl) this.A01, this.A02, this.A03, 240.0f, 100.0f, 224688, A1X ? 1 : 0);
            if (C0fH.A02()) {
                C0fH.A00(-1864721163);
            }
        }
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30538DcL(Object obj, String str, String str2, int i) {
        super(3);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
    }
}
