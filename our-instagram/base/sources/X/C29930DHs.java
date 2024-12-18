package X;

import java.util.List;

/* renamed from: X.DHs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29930DHs extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C26080Bg9 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29930DHs(C26080Bg9 c26080Bg9, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i, boolean z) {
        super(1);
        this.A05 = z;
        this.A01 = c26080Bg9;
        this.A03 = interfaceC16660sJ;
        this.A02 = str;
        this.A00 = i;
        this.A04 = interfaceC16660sJ2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C6Nu A0T = AbstractC25228BEl.A0T(obj);
        A0T.CgH(null, C5UA.A03(new C30524Dc7(this.A02, this.A04, this.A00), -1628983248));
        boolean z = this.A05;
        C26080Bg9 c26080Bg9 = this.A01;
        C51740MtP c51740MtP = (C51740MtP) c26080Bg9.A04;
        InterfaceC16660sJ interfaceC16660sJ = this.A03;
        if (c51740MtP.A01) {
            A0T.CgH(null, AbstractC27795CNk.A00);
            A0T.CgH(null, AbstractC27795CNk.A01);
            AbstractC25227BEk.A14(A0T, new C30535DcI(6, c51740MtP, interfaceC16660sJ, z), null, 162258395);
            AbstractC25227BEk.A14(A0T, new C30535DcI(7, c51740MtP, interfaceC16660sJ, z), null, -1989224740);
            AbstractC25227BEk.A14(A0T, new C30535DcI(8, c51740MtP, interfaceC16660sJ, z), null, 154259421);
        }
        C51758Mth c51758Mth = (C51758Mth) c26080Bg9.A02;
        if (c51758Mth.A01) {
            CI6.A00(A0T, new C26199BiP((List) c51758Mth.A00), (C6R) c26080Bg9.A03, 2131957085);
        }
        return C0eB.A00;
    }
}
