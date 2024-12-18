package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public final class DSF extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DSF(String str, int i, long j, boolean z) {
        super(2);
        this.A00 = i;
        this.A02 = str;
        this.A03 = z;
        this.A01 = j;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1846457773, "com.instagram.barcelona.feed.post.ui.PostIcon.<anonymous> (PostDenseUfi.kt:342)");
            }
            C2DC A00 = C5Y7.A00(c5Tl, this.A00, 0);
            String str = this.A02;
            C1130158n A0N = AbstractC25225BEi.A0N(c5Tl, -514014661);
            Modifier A0C = AbstractC118185Wd.A0C(A0N, 18.0f);
            boolean z = this.A03;
            long j = this.A01;
            if (z) {
                A0C = A0C.Eq3(AbstractC27562CEh.A00(c5Tl, A0N, 6, j));
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C5YS.A07(c5Tl, A0C, A00, C5YJ.A05, str, DalvikInternals.IOPRIO_BACKGROUND, 0, j);
            if (C0fH.A02()) {
                C0fH.A00(1628346057);
            }
        }
        return C0eB.A00;
    }
}
