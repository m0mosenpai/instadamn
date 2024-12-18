package X;

import com.instagram.nux.fragment.OneTapLoginLandingFragment;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EPa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32399EPa extends C7E1 {
    public final ERG A00;
    public final List A01;

    public final void A0C(List list) {
        List list2 = this.A01;
        list2.clear();
        list2.addAll(list);
        Collections.sort(list2, FEL.A00);
        A06();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            A08(this.A00, it.next());
        }
        A07();
    }

    public C32399EPa(InterfaceC11380iw interfaceC11380iw, OneTapLoginLandingFragment oneTapLoginLandingFragment) {
        ERG erg = new ERG(interfaceC11380iw, oneTapLoginLandingFragment);
        this.A00 = erg;
        this.A01 = AbstractC166987dD.A1E();
        A0B(erg);
    }
}
