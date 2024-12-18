package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.P3s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56431P3s implements InterfaceC57951Pmx, InterfaceC57827Pkt {
    public static final C56431P3s A00 = new Object();

    @Override // X.InterfaceC57951Pmx
    public final Fragment B8N(Object obj) {
        C14360o3.A0B(obj, 0);
        C52550NMw c52550NMw = (C52550NMw) obj;
        C52124N4x c52124N4x = new C52124N4x();
        InterfaceC58087PpC interfaceC58087PpC = c52550NMw.A00;
        C14360o3.A0B(interfaceC58087PpC, 0);
        c52124N4x.A01 = interfaceC58087PpC;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable("prior_surface", EnumC53233NgW.A08);
        A0b.putStringArrayList("upcoming_event_ids", AbstractC166987dD.A1F(c52550NMw.A01));
        c52124N4x.setArguments(A0b);
        return c52124N4x;
    }
}
