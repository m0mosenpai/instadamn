package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class UES extends AbstractC17900uT {
    public final /* synthetic */ LayoutInflaterFactory2C52042a4 A00;

    public UES(LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4) {
        this.A00 = layoutInflaterFactory2C52042a4;
    }

    @Override // X.C04F
    public final void CwY(View view) {
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = this.A00;
        layoutInflaterFactory2C52042a4.A0M.setAlpha(1.0f);
        layoutInflaterFactory2C52042a4.A0O.A07(null);
        layoutInflaterFactory2C52042a4.A0O = null;
    }

    @Override // X.AbstractC17900uT, X.C04F
    public final void Cwg(View view) {
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = this.A00;
        layoutInflaterFactory2C52042a4.A0M.setVisibility(0);
        if (layoutInflaterFactory2C52042a4.A0M.getParent() instanceof View) {
            ((View) layoutInflaterFactory2C52042a4.A0M.getParent()).requestApplyInsets();
        }
    }
}
