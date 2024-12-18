package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Dcm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30565Dcm extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30565Dcm(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z, boolean z2) {
        super(3);
        this.A03 = interfaceC16820sZ;
        this.A05 = z;
        this.A06 = z2;
        this.A00 = i;
        this.A02 = interfaceC16820sZ2;
        this.A01 = interfaceC16820sZ3;
        this.A04 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long A02;
        Modifier modifier = (Modifier) obj;
        C5Tl c5Tl = (C5Tl) obj2;
        boolean A1X = AbstractC25231BEo.A1X(obj3, modifier);
        if (AbstractC25227BEk.A1U(c5Tl, 1486911365)) {
            C0fH.A01(-229445544, "com.instagram.barcelona.feed.post.video.videoProgressIndicator.<anonymous> (VideoProgressIndicator.kt:45)");
        }
        long j = C5XL.A00(c5Tl).A0x;
        A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (r0 & 63)], C1132359l.A03(r0), C1132359l.A02(r0), C1132359l.A01(C5XL.A00(c5Tl).A0x), 0.3f);
        InterfaceC74963Ym A03 = AbstractC28454Ch4.A03(c5Tl, AbstractC166987dD.A09(this.A03.invoke()));
        Object A0q = AbstractC25227BEk.A0q(c5Tl, 1700103299);
        Object obj4 = C5UI.A00;
        if (A0q == obj4) {
            A0q = AbstractC25232BEp.A0w(c5Tl, AbstractC118385Xa.A00(4.0f));
        }
        InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0q;
        C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, A1X);
        InterfaceC74953Yl A0M = AbstractC25225BEi.A0M(A0K, AbstractC25234BEr.A0a(c5Tl, obj4, 1700106181, A1X), A1X);
        C19L c19l = ((C137536Kz) AbstractC25234BEr.A0b(c5Tl, c5Tl.EEc(), obj4)).A00;
        C28211Cc9 A00 = CBX.A00(c5Tl);
        C118125Vw c118125Vw = (C118125Vw) c5Tl.AJX(C5WR.A00);
        boolean A1W = AbstractC25226BEj.A1W(c5Tl, j, AbstractC25226BEj.A1W(c5Tl, A02, AbstractC25227BEk.A1Y(c5Tl, A03, 1700113289)));
        boolean z = this.A05;
        boolean A1Y = AbstractC25226BEj.A1Y(c5Tl, z, A1W);
        boolean z2 = this.A06;
        boolean A1V = AbstractC25228BEl.A1V(c5Tl, A00, A1Y, c5Tl.AH5(z2));
        int i = this.A00;
        boolean A1V2 = AbstractC25228BEl.A1V(c5Tl, c118125Vw, A1V, c5Tl.AH2(i));
        Object EEc = c5Tl.EEc();
        if (A1V2 || EEc == obj4) {
            EEc = new DIP(interfaceC74953Yl, A0M, A03, A00, c118125Vw, i, A02, j, z, z2);
            c5Tl.FBy(EEc);
        }
        Modifier A0W = AbstractC25230BEn.A0W(A0K, modifier, EEc, A1X);
        C0eB c0eB = C0eB.A00;
        boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c19l, 1700149567);
        InterfaceC16820sZ interfaceC16820sZ = this.A02;
        boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, interfaceC16820sZ, A1Z);
        InterfaceC16820sZ interfaceC16820sZ2 = this.A01;
        boolean A1X3 = AbstractC25225BEi.A1X(c5Tl, interfaceC16820sZ2, A1X2);
        InterfaceC16660sJ interfaceC16660sJ = this.A04;
        boolean A1X4 = AbstractC25225BEi.A1X(c5Tl, interfaceC16660sJ, A1X3);
        Object EEc2 = c5Tl.EEc();
        if (A1X4 || EEc2 == obj4) {
            EEc2 = new C57170PZo(c19l, interfaceC16660sJ, A0M, interfaceC74953Yl, interfaceC16820sZ2, interfaceC16820sZ, (InterfaceC23621Ds) null, 5);
            c5Tl.FBy(EEc2);
        }
        Modifier A0U = AbstractC25229BEm.A0U(A0K, A0W, EEc2, c0eB, A1X);
        boolean A1b = AbstractC25234BEr.A1b(c5Tl, interfaceC16820sZ, interfaceC16660sJ, interfaceC16820sZ2, 1700166360);
        Object EEc3 = c5Tl.EEc();
        if (A1b || EEc3 == obj4) {
            EEc3 = new MCP(interfaceC16820sZ2, interfaceC16660sJ, interfaceC16820sZ, (InterfaceC23621Ds) null, 21);
            c5Tl.FBy(EEc3);
        }
        Modifier A0U2 = AbstractC25229BEm.A0U(A0K, A0U, EEc3, c0eB, A1X);
        if (C0fH.A02()) {
            C0fH.A00(-630004298);
        }
        C117505Tk.A0L(A0K, A1X);
        return A0U2;
    }
}
