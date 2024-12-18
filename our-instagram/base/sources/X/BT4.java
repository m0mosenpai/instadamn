package X;

import android.view.View;

/* loaded from: classes5.dex */
public final class BT4 implements InterfaceC31017DkG {
    public View.OnClickListener A00;

    @Override // X.InterfaceC31017DkG
    public final void DvZ(View view) {
        View.OnClickListener onClickListener = this.A00;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // X.InterfaceC31017DkG
    public final void Ea2(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }
}
