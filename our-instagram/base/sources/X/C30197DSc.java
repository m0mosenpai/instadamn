package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DSc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30197DSc extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ InterfaceC30909DiM A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ C59J A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30197DSc(InterfaceC30909DiM interfaceC30909DiM, Modifier modifier, C59J c59j, long j, boolean z) {
        super(2);
        this.A03 = c59j;
        this.A00 = j;
        this.A04 = z;
        this.A02 = modifier;
        this.A01 = interfaceC30909DiM;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-873381943, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:82)");
            }
            C117685Ud A02 = C5V2.A0D.A02(this.A03);
            long j = this.A00;
            boolean z = this.A04;
            AbstractC25230BEn.A17(c5Tl, A02, new DSD(this.A01, this.A02, j, z), -1426434671);
            if (C0fH.A02()) {
                C0fH.A00(-1157394781);
            }
        }
        return C0eB.A00;
    }
}
