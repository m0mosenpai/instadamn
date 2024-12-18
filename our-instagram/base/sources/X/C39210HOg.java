package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.androidlink.ImmutablePandoAndroidLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HOg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39210HOg extends C17T implements InterfaceC43533JKt {
    @Override // X.InterfaceC43533JKt
    public final List Abm() {
        return A08(-683992599, ImmutablePandoAndroidLink.class);
    }

    @Override // X.InterfaceC43533JKt
    public final List BJY() {
        return A08(1180716295, ImmutablePandoAndroidLink.class);
    }

    @Override // X.InterfaceC43533JKt
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39906Hmt.A00(this));
    }

    @Override // X.InterfaceC43533JKt
    public final String B01() {
        return A0j(986649031);
    }

    @Override // X.InterfaceC43533JKt
    public final H39 EtA() {
        ArrayList arrayList;
        List Abm = Abm();
        ArrayList arrayList2 = null;
        if (Abm != null) {
            arrayList = AbstractC167007dF.A0i(Abm);
            Iterator it = Abm.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1V(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        String A0j = A0j(986649031);
        List BJY = BJY();
        if (BJY != null) {
            arrayList2 = AbstractC167007dF.A0i(BJY);
            Iterator it2 = BJY.iterator();
            while (it2.hasNext()) {
                AbstractC37303Gc4.A1V(arrayList2, it2);
            }
        }
        return new H39(arrayList, arrayList2, A0j);
    }
}
