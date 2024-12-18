package X;

import androidx.compose.ui.Modifier;
import java.util.List;

/* renamed from: X.DfM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30724DfM extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C6MK A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ InterfaceC16620sF A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30724DfM(C6MK c6mk, String str, List list, InterfaceC16620sF interfaceC16620sF, int i) {
        super(4);
        this.A03 = list;
        this.A00 = i;
        this.A02 = str;
        this.A04 = interfaceC16620sF;
        this.A01 = c6mk;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int A0H = AbstractC166987dD.A0H(obj2);
        C5Tl c5Tl = (C5Tl) obj3;
        int A0H2 = AbstractC166987dD.A0H(obj4);
        if ((A0H2 & 6) == 0) {
            i = A0H2 | AbstractC25232BEp.A0R(c5Tl, obj);
        } else {
            i = A0H2;
        }
        if ((A0H2 & 48) == 0) {
            i |= AbstractC25232BEp.A09(c5Tl, A0H);
        }
        if ((i & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-796046804, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
            }
            Object obj5 = this.A03.get(A0H);
            int A01 = AbstractC25225BEi.A01(i);
            String str = (String) obj5;
            c5Tl.Eno(-24934737);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1663371760);
            Object obj6 = C5UI.A00;
            if (A0q == obj6) {
                A0q = AbstractC25232BEp.A0w(c5Tl, this.A01.get(A0H));
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0q;
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            boolean z = false;
            String A00 = C5YD.A00(c5Tl, 2131952772);
            Modifier A07 = AbstractC118175Wb.A07(Modifier.A00);
            InterfaceC30801Dgc interfaceC30801Dgc = (InterfaceC30801Dgc) interfaceC74953Yl.getValue();
            c5Tl.Eno(-1663360376);
            int i2 = this.A00;
            boolean AH2 = c5Tl.AH2(i2);
            String str2 = this.A02;
            boolean A1X = AbstractC25225BEi.A1X(c5Tl, str2, AH2);
            InterfaceC16620sF interfaceC16620sF = this.A04;
            boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, interfaceC16620sF, A1X);
            if ((((A01 & 112) ^ 48) > 32 && c5Tl.AH2(A0H)) || (A01 & 48) == 32) {
                z = true;
            }
            boolean z2 = A1X2 | z;
            Object EEc = c5Tl.EEc();
            if (z2 || EEc == obj6) {
                EEc = new MIM(interfaceC16620sF, interfaceC74953Yl, str2, i2, A0H, 1);
                c5Tl.FBy(EEc);
            }
            AbstractC28505Chy.A06(c5Tl, A07, interfaceC30801Dgc, Integer.valueOf(i2), str, A00, AbstractC25225BEi.A1B(c117505Tk, EEc, false), 1, Integer.MAX_VALUE, ((A01 >> 6) & 14) | 1772544);
            if (AbstractC25227BEk.A1b(c117505Tk, false)) {
                C0fH.A00(-1109218279);
            }
        }
        return C0eB.A00;
    }
}
