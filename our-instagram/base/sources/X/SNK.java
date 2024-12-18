package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* loaded from: classes10.dex */
public abstract class SNK {
    public final InterfaceC08830cm A00;

    public abstract Fragment A01(Bundle bundle, String str);

    public Fragment A00(Bundle bundle, String str) {
        InterfaceC08830cm interfaceC08830cm = this.A00;
        interfaceC08830cm.getClass();
        Fragment fragment = (Fragment) interfaceC08830cm.get();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBundle("CHILD_FRAGMENT_BUNDLE", bundle);
        A0b.putString("CHILD_FRAGMENT_IDENTIFIER", str);
        fragment.setArguments(A0b);
        return fragment;
    }

    public SNK(InterfaceC08830cm interfaceC08830cm) {
        this.A00 = interfaceC08830cm;
    }
}
