package X;

import android.view.View;
import java.util.List;

/* loaded from: classes8.dex */
public final class JXX implements View.OnClickListener {
    public final int A00;
    public final C31446Drq A01;
    public final MRS A02;
    public final C3o9 A03;
    public final List A04;

    public JXX(C31446Drq c31446Drq, MRS mrs, C3o9 c3o9, List list, int i) {
        C14360o3.A0B(list, 4);
        this.A03 = c3o9;
        this.A02 = mrs;
        this.A01 = c31446Drq;
        this.A04 = list;
        this.A00 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-2092482525);
        this.A02.DT6(this.A01, this.A03, this.A04, this.A00);
        C0f9.A0C(1813217830, A05);
    }
}
