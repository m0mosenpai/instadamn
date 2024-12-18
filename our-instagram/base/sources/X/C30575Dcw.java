package X;

import android.view.View;
import androidx.compose.ui.Modifier;

/* renamed from: X.Dcw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30575Dcw extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ InterfaceC74953Yl A04;
    public final /* synthetic */ InterfaceC74953Yl A05;
    public final /* synthetic */ C64770TTe A06;
    public final /* synthetic */ AbstractC35044FcH A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30575Dcw(View view, InterfaceC74953Yl interfaceC74953Yl, InterfaceC74953Yl interfaceC74953Yl2, C64770TTe c64770TTe, AbstractC35044FcH abstractC35044FcH, int i, int i2, long j, boolean z) {
        super(3);
        this.A07 = abstractC35044FcH;
        this.A05 = interfaceC74953Yl;
        this.A04 = interfaceC74953Yl2;
        this.A06 = c64770TTe;
        this.A03 = view;
        this.A08 = z;
        this.A02 = j;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl = (C5Tl) obj2;
        boolean A1X = AbstractC25231BEo.A1X(obj3, obj);
        if (C0fH.A02()) {
            C0fH.A01(-818634847, "com.instagram.direct.fragment.sharesheet.view.ExternalShareRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExternalShareRow.kt:89)");
        }
        C1130158n c1130158n = Modifier.A00;
        C5XO c5xo = (C5XO) AbstractC25234BEr.A0Y(c5Tl, -1605345530);
        C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, A1X);
        Modifier A00 = C5XR.A00(new C5XM(1500.0f, 1500.0f), c5xo, c1130158n, AbstractC25225BEi.A0W(A1X ? 1 : 0), null, new MEB(18, this.A04, this.A05, this.A06, this.A03, this.A07), true);
        InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
        boolean z = this.A08;
        long j = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        InterfaceC1127857k A0Z = AbstractC25226BEj.A0Z(c5Tl, interfaceC118245Wl);
        int A002 = C5X2.A00(c5Tl);
        C59P A04 = C117505Tk.A04(A0K);
        Modifier A01 = C5X3.A01(c5Tl, A00);
        InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
        AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
        InterfaceC16620sF interfaceC16620sF = C5X8.A03;
        InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0Z, A04, interfaceC16620sF);
        InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
        if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
        }
        InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
        int i3 = 56;
        if (z) {
            i3 = 64;
        }
        Modifier A012 = C6L3.A01(AbstractC118185Wd.A0C(c1130158n, i3), C5WF.A00, j);
        InterfaceC1127857k A0a = AbstractC25226BEj.A0a(A1X);
        int A003 = C5X2.A00(c5Tl);
        C59P A042 = C117505Tk.A04(A0K);
        Modifier A013 = C5X3.A01(c5Tl, A012);
        AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
        C5XJ.A00(c5Tl, A0a, interfaceC16620sF);
        if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
        }
        C5XJ.A00(c5Tl, A013, A1K);
        C5YS.A05(c5Tl, AbstractC118185Wd.A04(c1130158n), C5Y7.A00(c5Tl, i2, A1X ? 1 : 0), AbstractC25226BEj.A0G(c5Tl));
        c5Tl.ASW();
        String A004 = AbstractC136736Hc.A00(c5Tl, i);
        float f = 12.0f;
        if (z) {
            f = 8.0f;
        }
        C5WR.A0L(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, f, 0.0f, 0.0f), null, A004, 3072, 32752, AbstractC25226BEj.A0G(c5Tl), AbstractC118155Vz.A01(12));
        if (AbstractC25227BEk.A1R(c5Tl)) {
            C0fH.A00(-1261734396);
        }
        return C0eB.A00;
    }
}
