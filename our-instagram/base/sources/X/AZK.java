package X;

import android.os.Looper;

/* loaded from: classes4.dex */
public final class AZK implements InterfaceC1809280u {
    public final int A00;
    public final Object A01;

    public AZK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC1809280u
    public final void DIE() {
        if (this.A00 != 0) {
            C209159Mx c209159Mx = (C209159Mx) this.A01;
            if (C209159Mx.A00(c209159Mx).getHandler().getLooper() == Looper.myLooper()) {
                c209159Mx.A0D.run();
            }
            C209159Mx.A00(c209159Mx).getHandler().post(c209159Mx.A0D);
            return;
        }
        ((AKN) this.A01).A0F.DIE();
    }
}
