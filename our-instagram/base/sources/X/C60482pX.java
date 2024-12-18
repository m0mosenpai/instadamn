package X;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2pX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60482pX implements InterfaceC60012oj {
    public final List A00 = new ArrayList();

    @Override // X.InterfaceC60012oj
    public final void addFragmentVisibilityListener(InterfaceC71183He interfaceC71183He) {
        C14360o3.A0B(interfaceC71183He, 0);
        List list = this.A00;
        if (!list.contains(interfaceC71183He)) {
            list.add(interfaceC71183He);
        }
    }

    @Override // X.InterfaceC60012oj
    public final void removeFragmentVisibilityListener(InterfaceC71183He interfaceC71183He) {
        C14360o3.A0B(interfaceC71183He, 0);
        this.A00.remove(interfaceC71183He);
    }

    public final void A00(Fragment fragment, boolean z) {
        List list = this.A00;
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            InterfaceC71183He interfaceC71183He = (InterfaceC71183He) list.get(size);
            if (z) {
                interfaceC71183He.DID(fragment);
            } else {
                interfaceC71183He.DI9(fragment);
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }
}
