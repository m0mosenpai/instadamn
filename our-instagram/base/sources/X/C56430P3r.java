package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.P3r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56430P3r implements InterfaceC57951Pmx, InterfaceC57827Pkt {
    public static final C56430P3r A00 = new Object();

    @Override // X.InterfaceC57951Pmx
    public final Fragment B8N(Object obj) {
        C14360o3.A0B(obj, 0);
        C52549NMv c52549NMv = (C52549NMv) obj;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable("prior_surface", EnumC53233NgW.A08);
        A0b.putParcelable("initial_upcoming_event", c52549NMv.A01);
        N6R n6r = new N6R();
        n6r.setArguments(A0b);
        n6r.A06 = c52549NMv.A00;
        return n6r;
    }
}
