package X;

import android.widget.AbsListView;
import android.widget.Adapter;

/* renamed from: X.Fq1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35727Fq1 implements AbsListView.OnScrollListener {
    public final C38K A00;
    public final C3A9 A01;

    public C35727Fq1(Adapter adapter, C38K c38k, C31363DqS c31363DqS, C31434Dre c31434Dre) {
        AbstractC25233BEq.A0w(2, adapter, c31434Dre, c31363DqS);
        this.A00 = c38k;
        this.A01 = new C3A9(adapter, c38k, new C32960Eer(c31363DqS, c31434Dre));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4;
        int A03 = C0f9.A03(-98425266);
        if (!this.A00.isResumed()) {
            i4 = 1448969323;
        } else {
            this.A01.A01();
            i4 = 420727211;
        }
        C0f9.A0A(i4, A03);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C0f9.A0A(1417899034, C0f9.A03(-97645421));
    }
}
