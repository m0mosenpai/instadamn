package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Dbz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30516Dbz extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final long A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30516Dbz(long j, int i) {
        super(3);
        this.A00 = i;
        this.A01 = j;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.A00 != 0) {
            C5Tl A0S = AbstractC25226BEj.A0S(obj2, obj3);
            if (AbstractC25227BEk.A1U(A0S, 1080576764)) {
                C0fH.A01(56370921, "com.meta.compose.material.bottomsheet.bottomSheetHandle.<anonymous> (BottomSheetHandle.kt:21)");
            }
            C1130158n c1130158n = Modifier.A00;
            A0S.Eno(-1753126204);
            long j = this.A01;
            boolean AH3 = A0S.AH3(j);
            Object EEc = A0S.EEc();
            if (AH3 || EEc == C5UI.A00) {
                EEc = new JXD(j, 17);
                A0S.FBy(EEc);
            }
            C117505Tk A0J = AbstractC25225BEi.A0J(A0S);
            Modifier A0J2 = AbstractC25227BEk.A0J(AbstractC119675bQ.A00(c1130158n, (InterfaceC16660sJ) EEc), 16.0f);
            if (C0fH.A02()) {
                C0fH.A00(-1677443038);
            }
            C117505Tk.A0I(A0J);
            return A0J2;
        }
        C5Tl c5Tl = (C5Tl) obj2;
        if (AbstractC25228BEl.A0E(obj3) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-918178173, "com.instagram.comments.mvvm.view.compose.CommentListContent.<anonymous>.<anonymous> (CommentList.kt:251)");
            }
            long EqJ = ((InterfaceC1128957x) c5Tl.AJX(C5V2.A01)).EqJ(this.A01);
            AbstractC119685bS.A00(c5Tl, AbstractC118185Wd.A0G(Modifier.A00, AbstractC25231BEo.A00(EqJ), AbstractC25232BEp.A00(EqJ)));
            if (C0fH.A02()) {
                C0fH.A00(271917606);
            }
        }
        return C0eB.A00;
    }
}
