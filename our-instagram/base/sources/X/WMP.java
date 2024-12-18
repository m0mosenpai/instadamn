package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class WMP implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C69025Vg1 A01;

    public WMP(View view, C69025Vg1 c69025Vg1) {
        this.A01 = c69025Vg1;
        this.A00 = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1906170772);
        C69025Vg1 c69025Vg1 = this.A01;
        c69025Vg1.A00.A0H(c69025Vg1.A01, false);
        View view2 = this.A00;
        AbstractC43594JPz.A0G(view2).setDuration(200L).withEndAction(new RunnableC71365Wsa(view2));
        C0f9.A0C(-692156956, A05);
    }
}
