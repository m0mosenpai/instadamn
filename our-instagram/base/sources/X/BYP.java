package X;

import android.content.Context;
import android.os.CountDownTimer;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes5.dex */
public final class BYP extends CountDownTimer {
    public final /* synthetic */ CSK A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BYP(CSK csk, long j) {
        super(j, 35L);
        this.A00 = csk;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        RecyclerView A00;
        int A02;
        C2Z8 c2z8;
        RecyclerView recyclerView;
        CSK csk = this.A00;
        C5E c5e = csk.A03;
        AbstractC25227BEk.A1D(c5e.A08, 1.0f);
        C2XI c2xi = ((AbstractC25398BLp) c5e).A02;
        int i = 1;
        int A0B = AbstractC25230BEn.A0B(c2xi) + 1;
        int A03 = c5e.A03();
        C168127f7 c168127f7 = csk.A00;
        if (c168127f7 != null && (A00 = c168127f7.A00()) != null && A00.getScrollState() == 0) {
            if (A0B < A03) {
                boolean z = c5e instanceof C5C;
                Context context = ((AbstractC25398BLp) c5e).A06;
                boolean A022 = AbstractC13620mo.A02(context);
                if (z) {
                    if (A022) {
                        i = -1;
                    }
                    A02 = c5e.A02() * 2;
                } else {
                    if (A022) {
                        i = -1;
                    }
                    A02 = c5e.A02();
                }
                int A01 = i * AbstractC13690mv.A01(context, A02 + 12);
                C169987iD c169987iD = ((C168127f7) c5e.A06.getValue()).A01;
                if (c169987iD != null && (c2z8 = c169987iD.A01) != null && (recyclerView = c2z8.A04) != null) {
                    recyclerView.A0t(A01, 0);
                }
                BYP byp = new BYP(csk, csk.A02);
                byp.start();
                AbstractC25227BEk.A1E(c2xi, A0B);
                csk.A01 = byp;
                return;
            }
            AbstractC25227BEk.A1F(c5e.A04, true);
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        CSK csk = this.A00;
        C2XI c2xi = csk.A03.A08;
        long j2 = csk.A02;
        AbstractC25227BEk.A1D(c2xi, ((float) (j2 - j)) / ((float) j2));
    }
}
