package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DXc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30327DXc extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ C26145BhW A03;
    public final /* synthetic */ C25660BVw A04;
    public final /* synthetic */ C28357CfH A05;
    public final /* synthetic */ C136946Hx A06;
    public final /* synthetic */ C136936Hw A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ InterfaceC16660sJ A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30327DXc(Modifier modifier, C26145BhW c26145BhW, C25660BVw c25660BVw, C28357CfH c28357CfH, C136946Hx c136946Hx, C136936Hw c136936Hw, String str, InterfaceC16660sJ interfaceC16660sJ, float f, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2);
        this.A03 = c26145BhW;
        this.A0D = z;
        this.A0A = z2;
        this.A0C = z3;
        this.A0B = z4;
        this.A04 = c25660BVw;
        this.A05 = c28357CfH;
        this.A06 = c136946Hx;
        this.A07 = c136936Hw;
        this.A00 = f;
        this.A08 = str;
        this.A01 = i;
        this.A09 = interfaceC16660sJ;
        this.A02 = modifier;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1067145733, "com.instagram.barcelona.feed.mediaviewer.ui.VideoMediaBox.<anonymous>.<anonymous> (VideoMediaBox.kt:87)");
            }
            C26145BhW c26145BhW = this.A03;
            MUD mud = (MUD) c26145BhW.A05;
            boolean z = this.A0D;
            boolean z2 = this.A0A;
            boolean z3 = this.A0C;
            boolean z4 = this.A0B;
            C25660BVw c25660BVw = this.A04;
            C28357CfH c28357CfH = this.A05;
            C136946Hx c136946Hx = this.A06;
            C136936Hw c136936Hw = this.A07;
            float f = this.A00;
            String str = this.A08;
            int i = this.A01;
            AbstractC28296Cdi.A00(c5Tl, this.A02, mud, c26145BhW, c25660BVw, c28357CfH, c136946Hx, c136936Hw, str, this.A09, f, i, 0, 0, z, z2, z3, z4);
            if (C0fH.A02()) {
                C0fH.A00(521086540);
            }
        }
        return C0eB.A00;
    }
}
