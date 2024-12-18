package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes10.dex */
public final class QBZ extends AbstractC63880SvE {
    public static final Handler A01 = new Handler(Looper.getMainLooper(), new WIX(0));
    public final Sv5 A00;

    @Override // X.InterfaceC65634Tpv
    public final void DPb(Drawable drawable) {
    }

    @Override // X.InterfaceC65634Tpv
    public final void Dgc(InterfaceC65328Ti9 interfaceC65328Ti9, Object obj) {
        InterfaceC65582TnL interfaceC65582TnL = super.A00;
        if (interfaceC65582TnL != null && interfaceC65582TnL.isComplete()) {
            AbstractC58318PtA.A1F(A01, this, 1);
        }
    }

    public QBZ(Sv5 sv5) {
        this.A00 = sv5;
    }
}
