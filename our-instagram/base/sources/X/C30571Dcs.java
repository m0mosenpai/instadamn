package X;

import com.instagram.wonderwall.model.WallText;

/* renamed from: X.Dcs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30571Dcs extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ WallText A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30571Dcs(WallText wallText, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(3);
        this.A06 = z;
        this.A07 = z2;
        this.A05 = z3;
        this.A03 = z4;
        this.A04 = z5;
        this.A00 = wallText;
        this.A01 = interfaceC16820sZ;
        this.A02 = interfaceC16820sZ2;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) obj;
        C5Tl c5Tl = (C5Tl) obj2;
        int A0p = AbstractC25232BEp.A0p(obj3, interfaceC16620sF);
        if ((A0p & 6) == 0) {
            A0p |= AbstractC25232BEp.A0H(c5Tl, interfaceC16620sF);
        }
        if ((A0p & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1655126806, "com.instagram.wonderwall.ui.compose.screens.WallPostReplyEditor.<anonymous> (WallPostPreviewScreen.kt:186)");
            }
            AbstractC28405CgB.A02(c5Tl, this.A00, this.A01, this.A02, interfaceC16620sF, 3670016 & (A0p << 18), this.A06, this.A07, this.A05, this.A03, this.A04);
            if (C0fH.A02()) {
                C0fH.A00(1964755160);
            }
        }
        return C0eB.A00;
    }
}
