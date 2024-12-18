package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.7le, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172097le {
    public final InterfaceC08830cm A00;

    public C172097le(InterfaceC08830cm interfaceC08830cm) {
        C14360o3.A0B(interfaceC08830cm, 1);
        this.A00 = interfaceC08830cm;
    }

    public final C129265so A00() {
        InterfaceC11380iw interfaceC11380iw;
        InterfaceC08430c6 interfaceC08430c6;
        int size;
        ComponentCallbacks2 componentCallbacks2 = (Activity) this.A00.get();
        if (componentCallbacks2 == null) {
            return null;
        }
        if (componentCallbacks2 instanceof FragmentActivity) {
            C129245sm c129245sm = C129245sm.A00;
            List A04 = ((FragmentActivity) componentCallbacks2).getSupportFragmentManager().A0U.A04();
            C14360o3.A07(A04);
            if (!A04.isEmpty() && A04.size() - 1 >= 0) {
                while (true) {
                    int i = size - 1;
                    Fragment fragment = (Fragment) A04.get(size);
                    if (fragment != null && fragment.isResumed() && fragment.mUserVisibleHint && !fragment.isHidden()) {
                        interfaceC08430c6 = C129245sm.A00(fragment, c129245sm);
                        break;
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
            interfaceC08430c6 = null;
            if (interfaceC08430c6 instanceof InterfaceC11380iw) {
                interfaceC11380iw = (InterfaceC11380iw) interfaceC08430c6;
                return AbstractC129255sn.A00(interfaceC11380iw);
            }
        }
        if (!(componentCallbacks2 instanceof InterfaceC11380iw)) {
            return null;
        }
        interfaceC11380iw = (InterfaceC11380iw) componentCallbacks2;
        return AbstractC129255sn.A00(interfaceC11380iw);
    }
}
