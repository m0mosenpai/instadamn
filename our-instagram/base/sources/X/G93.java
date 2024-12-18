package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class G93 implements InterfaceC58152PqH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC58140Pq5 A01;
    public final /* synthetic */ RunnableC36962GQf A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ C31338Dq3 A04;
    public final /* synthetic */ C5HW A05;
    public final /* synthetic */ java.util.Set A06;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public G93(InterfaceC58140Pq5 interfaceC58140Pq5, RunnableC36962GQf runnableC36962GQf, C38321qM c38321qM, C31338Dq3 c31338Dq3, C5HW c5hw, java.util.Set set, int i) {
        this.A04 = c31338Dq3;
        this.A05 = c5hw;
        this.A00 = i;
        this.A02 = runnableC36962GQf;
        this.A03 = c38321qM;
        this.A06 = set;
        this.A01 = interfaceC58140Pq5;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        C31338Dq3 c31338Dq3 = this.A04;
        C5HW c5hw = this.A05;
        int i = this.A00;
        C31338Dq3.A04(c31338Dq3, c5hw, "delete_comment_undo_clicked", i);
        c31338Dq3.A06.COe(c5hw, i);
        RunnableC36962GQf runnableC36962GQf = this.A02;
        if (!runnableC36962GQf.A01) {
            runnableC36962GQf.A00 = true;
            C55217Oeg.A00.removeCallbacks(runnableC36962GQf);
        }
        C38321qM c38321qM = this.A03;
        if (c38321qM != null) {
            java.util.Set set = this.A06;
            InterfaceC58140Pq5 interfaceC58140Pq5 = this.A01;
            AbstractC167007dF.A1E(set, 1, c31338Dq3.A03);
            C55217Oeg.A07(interfaceC58140Pq5, c38321qM, set, true);
        }
    }
}
