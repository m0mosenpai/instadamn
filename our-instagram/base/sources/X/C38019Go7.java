package X;

import android.view.View;
import android.widget.AbsListView;
import com.instagram.ui.widget.refresh.RefreshableListView;

/* renamed from: X.Go7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38019Go7 extends JWK implements C3FR {
    public final AbsListView A00;

    @Override // X.C3FR
    public final void ETR(boolean z) {
        ((RefreshableListView) ((C3HG) this.A00)).A07 = false;
    }

    @Override // X.C3FR
    public final void ETT(int i) {
        ((RefreshableListView) ((C3HG) this.A00)).A00 = 0;
    }

    @Override // X.C3FR
    public final void EgS(InterfaceC43398JFn interfaceC43398JFn, C71094Wnq c71094Wnq) {
    }

    @Override // X.C3FR
    public final void APU() {
        ((C3HG) this.A00).APU();
    }

    @Override // X.C3FR
    public final void ARj() {
        ((C3HG) this.A00).ARj();
    }

    @Override // X.C3FR
    public final View CGT() {
        return this.A00;
    }

    @Override // X.C3FR
    public final boolean CbL() {
        return ((RefreshableListView) ((C3HG) this.A00)).A08;
    }

    @Override // X.C3FR
    public final boolean Cbj() {
        return ((C3HG) this.A00).Cbj();
    }

    @Override // X.C3FR
    public final void EWc(boolean z) {
        ((C3HG) this.A00).setIsLoading(z);
    }

    @Override // X.C3FR
    public final void Ebv(InterfaceC61462r9 interfaceC61462r9) {
        ((RefreshableListView) ((C3HG) this.A00)).A04 = interfaceC61462r9;
    }

    @Override // X.C3FR
    public final void Ehc(Runnable runnable) {
        ((C3HG) this.A00).setupAndEnableRefresh(new ViewOnClickListenerC42034Ik3(26, this, runnable));
    }

    @Override // X.C3FR
    public final void ElT() {
        ((C3HG) this.A00).AWT();
    }

    @Override // X.C3FR
    public final void setIsLoading(boolean z) {
        ((C3HG) this.A00).setIsLoading(z);
    }

    @Override // X.C3FR
    public final void setUpPTRSpinner(C71094Wnq c71094Wnq) {
        ((C3HG) this.A00).setUpPTRSpinner(c71094Wnq);
    }

    public C38019Go7(AbsListView absListView) {
        super(absListView);
        this.A00 = absListView;
    }
}
