package X;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: X.StC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63756StC implements InterfaceC65632Tpt {
    public final InterfaceC65632Tpt A00;

    @Override // X.InterfaceC65617To8
    public final void FAj(MessageDigest messageDigest) {
        this.A00.FAj(messageDigest);
    }

    @Override // X.InterfaceC65617To8
    public final boolean equals(Object obj) {
        if (obj instanceof C63756StC) {
            return this.A00.equals(((C63756StC) obj).A00);
        }
        return false;
    }

    @Override // X.InterfaceC65617To8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C63756StC(InterfaceC65632Tpt interfaceC65632Tpt) {
        Rs8.A00(interfaceC65632Tpt);
        this.A00 = interfaceC65632Tpt;
    }

    @Override // X.InterfaceC65632Tpt
    public final InterfaceC65558Tme F8G(Context context, InterfaceC65558Tme interfaceC65558Tme, int i, int i2) {
        Q2P q2p = (Q2P) interfaceC65558Tme.get();
        InterfaceC65571Tn4 interfaceC65571Tn4 = ComponentCallbacks2C63416Sju.A00(context).A01;
        C62976SZw c62976SZw = q2p.A09.A00;
        C63791Stl c63791Stl = new C63791Stl(c62976SZw.A03, interfaceC65571Tn4);
        InterfaceC65632Tpt interfaceC65632Tpt = this.A00;
        InterfaceC65558Tme F8G = interfaceC65632Tpt.F8G(context, c63791Stl, i, i2);
        if (!c63791Stl.equals(F8G)) {
            c63791Stl.recycle();
        }
        c62976SZw.A01((Bitmap) F8G.get(), interfaceC65632Tpt);
        return interfaceC65558Tme;
    }
}
