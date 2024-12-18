package X;

import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ggc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37581Ggc extends AbstractC60592pi {
    public final List A00 = AbstractC166987dD.A1E();

    public final void A00(AbstractC37623GhI abstractC37623GhI) {
        C14360o3.A0B(abstractC37623GhI, 0);
        this.A00.add(abstractC37623GhI);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((AbstractC37623GhI) it.next()).onViewCreated(view, bundle);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((AbstractC37623GhI) it.next()).onDestroyView();
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((AbstractC37623GhI) it.next()).onPause();
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((AbstractC37623GhI) it.next()).onResume();
        }
    }
}
