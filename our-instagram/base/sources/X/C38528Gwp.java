package X;

import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.Gwp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38528Gwp extends AbstractC65852TvD {
    public final /* synthetic */ IntentAwareAdPivotState A00;
    public final /* synthetic */ C38394GuV A01;
    public final /* synthetic */ C42713Iv8 A02;

    public C38528Gwp(IntentAwareAdPivotState intentAwareAdPivotState, C38394GuV c38394GuV, C42713Iv8 c42713Iv8) {
        this.A00 = intentAwareAdPivotState;
        this.A02 = c42713Iv8;
        this.A01 = c38394GuV;
    }

    @Override // X.AbstractC65852TvD
    public final void A00(int i) {
        if (i == 0) {
            this.A00.A01 = this.A02.A03.A00;
        }
    }

    @Override // X.AbstractC65852TvD
    public final void A01(int i) {
        C41L c41l = this.A01.A00;
        if (c41l != null) {
            c41l.setCurrentPage(i);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
