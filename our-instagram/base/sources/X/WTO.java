package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class WTO implements InterfaceC51602Yi {
    public final /* synthetic */ int A00;

    public WTO(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC51602Yi
    public final int BeY(View view, int i) {
        return Math.min(i, this.A00);
    }
}
