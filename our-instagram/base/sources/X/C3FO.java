package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.3FO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FO extends C3FP implements C3FR {
    public final RecyclerView A00;
    public final RefreshableNestedScrollingParent A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3FO(RecyclerView recyclerView, RefreshableNestedScrollingParent refreshableNestedScrollingParent) {
        super(recyclerView);
        C14360o3.A0B(recyclerView, 1);
        C14360o3.A0B(refreshableNestedScrollingParent, 2);
        this.A00 = recyclerView;
        this.A01 = refreshableNestedScrollingParent;
    }

    @Override // X.C3FR
    public final void ETR(boolean z) {
    }

    @Override // X.C3FR
    public final void ETT(int i) {
        AbstractC13880nE.A0d(this.A01, 0);
    }

    @Override // X.C3FR
    public final void EgS(InterfaceC43398JFn interfaceC43398JFn, C71094Wnq c71094Wnq) {
        C14360o3.A0B(c71094Wnq, 0);
        this.A01.setPTRSpinnerListener(c71094Wnq);
        c71094Wnq.A00.A0D = interfaceC43398JFn;
    }

    @Override // X.C3FR
    public final void setUpPTRSpinner(C71094Wnq c71094Wnq) {
        C14360o3.A0B(c71094Wnq, 0);
        EgS(new C42081Iko(this), c71094Wnq);
    }

    @Override // X.C3FR
    public final void APU() {
        this.A01.setEnabled(false);
    }

    @Override // X.C3FR
    public final void ARj() {
        this.A01.setEnabled(true);
    }

    @Override // X.C3FR
    public final View CGT() {
        return this.A00;
    }

    @Override // X.C3FR
    public final boolean CbL() {
        return this.A01.isEnabled();
    }

    @Override // X.C3FR
    public final boolean Cbj() {
        return this.A01.A0B;
    }

    @Override // X.C3FR
    public final void EWc(boolean z) {
        this.A01.setRefreshing(z);
    }

    @Override // X.C3FR
    public final void Ebv(InterfaceC61462r9 interfaceC61462r9) {
        this.A01.A06 = interfaceC61462r9;
    }

    @Override // X.C3FR
    public final void Ehc(final Runnable runnable) {
        this.A01.A07 = new InterfaceC71293Hq() { // from class: X.3Hp
            @Override // X.InterfaceC71293Hq
            public final void DeM() {
                runnable.run();
            }
        };
    }

    @Override // X.C3FR
    public final void ElT() {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A01;
        refreshableNestedScrollingParent.A04 = this.A00;
        RefreshableNestedScrollingParent.A00(refreshableNestedScrollingParent, true, true);
    }

    @Override // X.C3FR
    public final void setIsLoading(boolean z) {
        this.A01.setRefreshing(z);
    }
}
