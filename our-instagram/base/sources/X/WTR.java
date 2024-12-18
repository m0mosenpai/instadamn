package X;

import android.os.Bundle;

/* loaded from: classes11.dex */
public final class WTR implements InterfaceC71942XBr {
    public final C66246U5q A00;
    public final Integer A01 = C05F.A00;

    @Override // X.InterfaceC71942XBr
    public final Integer CBp() {
        return this.A01;
    }

    @Override // X.InterfaceC71942XBr
    public final void EqA(String str, Bundle bundle) {
        bundle.putInt(str, AbstractC66261U6f.A00(this.A00));
    }

    public WTR(C66246U5q c66246U5q) {
        this.A00 = c66246U5q;
    }
}
