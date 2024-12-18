package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DcU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30547DcU extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        switch (this.A00) {
            case 0:
                C5Tl c5Tl = (C5Tl) obj2;
                if (AbstractC25229BEm.A1X(obj3)) {
                    C0fH.A01(13352484, "com.instagram.rtc.presentation.aianimations.AIConnectingCallAnimation.<anonymous> (AIConnectingCallAnimation.kt:308)");
                }
                Modifier A0V = AbstractC25228BEl.A0V();
                C26006Beu c26006Beu = (C26006Beu) this.A01;
                AbstractC27706CJz.A00(c5Tl, AbstractC118175Wb.A0A(A0V, c26006Beu.A00, c26006Beu.A01), (ImageUrl) this.A02, this.A03, this.A04, c26006Beu.A03, c26006Beu.A04, 0, 0);
                if (C0fH.A02()) {
                    i = -711018489;
                    C0fH.A00(i);
                    break;
                }
                break;
            case 1:
                C5Tl c5Tl2 = (C5Tl) obj2;
                if (AbstractC25229BEm.A1X(obj3)) {
                    C0fH.A01(-90424682, "com.instagram.rtc.presentation.connecting.RtcCallConnectingViewHolder.inflateAiConnectingComposeView.<anonymous>.<anonymous>.<anonymous> (RtcCallConnectingViewHolder.kt:171)");
                }
                CK0.A00(c5Tl2, (ImageUrl) this.A01, this.A03, this.A04, 3510, true, !((C51894Mwc) this.A02).A05);
                if (C0fH.A02()) {
                    i = 1424172999;
                    C0fH.A00(i);
                    break;
                }
                break;
            default:
                C5Tl c5Tl3 = (C5Tl) obj2;
                if (AbstractC25229BEm.A1X(obj3)) {
                    C0fH.A01(1883273276, "com.instagram.rtc.presentation.connecting.RtcCallConnectingViewHolder.inflateAiConnectingComposeView.<anonymous>.<anonymous>.<anonymous> (RtcCallConnectingViewHolder.kt:184)");
                }
                CK0.A00(c5Tl3, (ImageUrl) this.A01, this.A03, this.A04, 3510, false, !((C51894Mwc) this.A02).A05);
                if (C0fH.A02()) {
                    i = -1095067679;
                    C0fH.A00(i);
                    break;
                }
                break;
        }
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30547DcU(Object obj, Object obj2, String str, String str2, int i) {
        super(3);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = obj2;
    }
}
