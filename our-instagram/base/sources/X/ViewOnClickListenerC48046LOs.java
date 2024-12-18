package X;

import android.view.View;

/* renamed from: X.LOs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC48046LOs implements View.OnClickListener {
    public final /* synthetic */ C3O0 A00;
    public final /* synthetic */ C47981LJa A01;

    public ViewOnClickListenerC48046LOs(C3O0 c3o0, C47981LJa c47981LJa) {
        this.A01 = c47981LJa;
        this.A00 = c3o0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C3O0 c3o0;
        View view2;
        int A05 = C0f9.A05(-1877066287);
        C47981LJa c47981LJa = this.A01;
        if (c47981LJa != null) {
            View.OnClickListener onClickListener = c47981LJa.A02;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            if (c47981LJa.A05 != null && (view2 = (c3o0 = this.A00).A04) != null) {
                view2.post(c3o0.A0H);
            }
        }
        C0f9.A0C(1547394134, A05);
    }
}
