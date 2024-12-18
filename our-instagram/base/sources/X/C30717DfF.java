package X;

import androidx.compose.foundation.layout.FillElement;

/* renamed from: X.DfF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30717DfF extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ C26692BqZ A00;
    public final /* synthetic */ boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30717DfF(C26692BqZ c26692BqZ, boolean z) {
        super(4);
        this.A01 = z;
        this.A00 = c26692BqZ;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long j;
        boolean A1a = AbstractC166987dD.A1a(obj2);
        C5Tl c5Tl = (C5Tl) obj3;
        boolean A1X = AbstractC25231BEo.A1X(obj4, obj);
        if (C0fH.A02()) {
            C0fH.A01(1617839575, "com.instagram.archive.updateshub.ContentCalendarPog.<anonymous>.<anonymous> (ArchiveCalendarStrip.kt:214)");
        }
        if (this.A01) {
            j = AbstractC25227BEk.A0g(c5Tl, 2138910063).A0p;
        } else {
            j = AbstractC25227BEk.A0g(c5Tl, 2138911306).A0t;
        }
        C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, A1X);
        if (A1a) {
            BGY.A02(c5Tl, AbstractC25225BEi.A0N(c5Tl, 1881785533).Eq3(new FillElement(C05F.A0C, 0.5f)), 2.0f, 390, A1X ? 1 : 0, j);
        } else {
            c5Tl.Eno(1881990133);
            C5WR.A0u(c5Tl, AbstractC25226BEj.A0h(c5Tl), String.valueOf(this.A00.A00), j);
        }
        if (AbstractC25227BEk.A1b(A0K, A1X)) {
            C0fH.A00(-1093838459);
        }
        return C0eB.A00;
    }
}
