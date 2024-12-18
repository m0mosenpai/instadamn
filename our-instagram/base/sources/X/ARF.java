package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class ARF implements View.OnClickListener {
    public final /* synthetic */ EMP A00;

    public ARF(EMP emp) {
        this.A00 = emp;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(942005367);
        EMP emp = this.A00;
        if (emp.getActivity() != null) {
            A2D.A00(emp.requireActivity(), C22P.A2z, AbstractC166987dD.A0r(emp.A0D), (C217859kI) emp.A0B.getValue());
        }
        C0f9.A0C(556763999, A05);
    }
}
