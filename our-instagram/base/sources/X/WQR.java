package X;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* loaded from: classes11.dex */
public final class WQR implements C04F {
    public int A00;
    public boolean A01 = false;
    public final /* synthetic */ ActionBarContextView A02;

    @Override // X.C04F
    public final void CwU(View view) {
        this.A01 = true;
    }

    public WQR(ActionBarContextView actionBarContextView) {
        this.A02 = actionBarContextView;
    }

    @Override // X.C04F
    public final void CwY(View view) {
        if (!this.A01) {
            ActionBarContextView actionBarContextView = this.A02;
            actionBarContextView.A03 = null;
            super/*android.view.View*/.setVisibility(this.A00);
        }
    }

    @Override // X.C04F
    public final void Cwg(View view) {
        super/*android.view.View*/.setVisibility(0);
        this.A01 = false;
    }
}
