package X;

import android.os.CountDownTimer;
import android.view.View;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Gse, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CountDownTimerC38295Gse extends CountDownTimer {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C148146lk A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC38295Gse(View view, C148146lk c148146lk, long j) {
        super(j, 1000L);
        this.A01 = c148146lk;
        this.A00 = view;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        C148146lk c148146lk = this.A01;
        this.A00.setVisibility(8);
        C148116lh c148116lh = c148146lk.A0Y;
        C148116lh.A01(c148116lh, c148116lh.A01);
        if (c148116lh.A06) {
            C148116lh.A01(c148116lh, c148116lh.A02);
        }
        c148146lk.A01 = 0;
        C141596ac c141596ac = c148146lk.A0D;
        if (c141596ac != null) {
            c141596ac.A0K = 0;
        }
        c148146lk.A0a.A00(c148146lk.A0B, C05F.A0u, "unknown", 0, c148146lk.A0J);
        C23031Ai A00 = AbstractC23021Ah.A00(c148146lk.A0X.A03.A02);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(A00);
        A0w.E7G(AbstractC111324zv.A00(463), currentTimeMillis);
        A0w.apply();
        C148146lk.A02(c148146lk);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        C148146lk c148146lk = this.A01;
        int A01 = C1H4.A01(((float) j) / 1000.0f);
        c148146lk.A01 = A01;
        C141596ac c141596ac = c148146lk.A0D;
        if (c141596ac != null) {
            c141596ac.A0K = A01;
        }
        IgTextView igTextView = c148146lk.A09;
        if (igTextView != null) {
            AbstractC31177DnL.A0r(c148146lk.A0T, igTextView, Integer.valueOf(A01), 2131974603);
        }
    }
}
