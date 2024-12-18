package X;

import android.view.View;

/* renamed from: X.Lws, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49661Lws implements InterfaceC57999Pnj {
    public final int A00;
    public final Object A01;

    public C49661Lws(C66359UCf c66359UCf, int i) {
        this.A00 = i;
        this.A01 = c66359UCf;
    }

    @Override // X.InterfaceC57999Pnj
    public final void D2t(View view, boolean z) {
        int i = this.A00;
        C66359UCf c66359UCf = (C66359UCf) this.A01;
        if (i == 0) {
            c66359UCf.A04(false);
        }
        c66359UCf.A03(z);
    }
}
