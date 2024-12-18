package X;

import android.content.Context;

/* renamed from: X.6jj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147076jj implements C31R {
    public W5F A00;
    public final InterfaceC145606hJ A01;

    public C147076jj(Context context, InterfaceC145606hJ interfaceC145606hJ) {
        C14360o3.A0B(interfaceC145606hJ, 2);
        this.A01 = interfaceC145606hJ;
        if (C17280tP.A4E.A01(context).A0U()) {
            this.A00 = new W5F(context, this, new C145806hd());
        }
    }

    @Override // X.C31R
    public final void F7s(boolean z) {
        InterfaceC145606hJ interfaceC145606hJ = this.A01;
        if (z) {
            interfaceC145606hJ.D9O();
        } else {
            interfaceC145606hJ.D9N();
        }
    }
}
