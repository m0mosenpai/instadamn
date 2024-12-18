package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* loaded from: classes11.dex */
public final class UF2 extends C06K {
    public final /* synthetic */ C60552pe A00;

    @Override // X.C06K
    public final void A02(Bundle bundle, Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        C60552pe c60552pe = this.A00;
        int i = C60552pe.A0A;
        Fragment fragment2 = c60552pe.A00;
        if (fragment2 != null) {
            if (fragment.equals(fragment2)) {
                c60552pe.A03 = true;
                c60552pe.getChildFragmentManager().A0p(this);
                InterfaceC16660sJ interfaceC16660sJ = c60552pe.A01;
                if (interfaceC16660sJ != null) {
                    Fragment fragment3 = c60552pe.A00;
                    if (fragment3 != null) {
                        interfaceC16660sJ.invoke(fragment3);
                        c60552pe.A01 = null;
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("wrappedFragment");
        throw C00O.createAndThrow();
    }

    public UF2(C60552pe c60552pe) {
        this.A00 = c60552pe;
    }
}
