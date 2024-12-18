package X;

import android.widget.TextView;
import java.util.List;

/* renamed from: X.3sp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86183sp implements InterfaceC80343iO {
    public boolean A00 = true;
    public final C86013sY A01;

    public C86183sp(C86013sY c86013sY) {
        this.A01 = c86013sY;
    }

    @Override // X.InterfaceC80343iO
    public final void setEnabled(boolean z) {
        this.A00 = false;
    }

    @Override // X.InterfaceC80343iO
    public final TextView C3j() {
        return (TextView) this.A01.A03.A01();
    }

    @Override // X.InterfaceC80343iO
    public final void ESX(List list) {
        AbstractC86533tR.A02(this.A01, list, this.A00);
    }

    @Override // X.InterfaceC80343iO
    public final void EhE(boolean z) {
        if (z && this.A00) {
            AbstractC86533tR.A01(this.A01);
        } else {
            AbstractC86533tR.A00(this.A01);
        }
    }
}
