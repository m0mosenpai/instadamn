package X;

import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.model.reels.Reel;

/* renamed from: X.Oqu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55844Oqu implements InterfaceC57920PmQ {
    public final /* synthetic */ InlineAddHighlightFragment A00;

    public C55844Oqu(InlineAddHighlightFragment inlineAddHighlightFragment) {
        this.A00 = inlineAddHighlightFragment;
    }

    @Override // X.InterfaceC57920PmQ
    public final int BXj() {
        InlineAddHighlightFragment inlineAddHighlightFragment = this.A00;
        Reel A0M = C1OU.A04(inlineAddHighlightFragment.A00).A0M(inlineAddHighlightFragment.A02);
        if (A0M == null) {
            C0w9.A03("InlineAddHighlightFragment", "No reel found for getNumMediaSelected");
            return 0;
        }
        return AbstractC25227BEk.A06(A0M.A0e, 0);
    }
}
