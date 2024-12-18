package X;

import android.os.Bundle;
import com.facebook.react.bridge.Callback;
import com.instagram.react.modules.product.IgReactCountryCodeRoute;

/* loaded from: classes10.dex */
public final class TPB implements Runnable {
    public final /* synthetic */ Callback A00;
    public final /* synthetic */ IgReactCountryCodeRoute A01;

    public TPB(Callback callback, IgReactCountryCodeRoute igReactCountryCodeRoute) {
        this.A01 = igReactCountryCodeRoute;
        this.A00 = callback;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0SG, androidx.fragment.app.Fragment, X.EHO] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? c0sg = new C0SG();
        Bundle A0b = AbstractC166987dD.A0b();
        IgReactCountryCodeRoute igReactCountryCodeRoute = this.A01;
        AbstractC03240Dh.A00(A0b, igReactCountryCodeRoute.mSession);
        c0sg.setArguments(A0b);
        c0sg.A01 = new C64496TGi(this.A00);
        AbstractC59962oe A00 = AbstractC62820SSs.A00(AbstractC58321PtD.A0b(igReactCountryCodeRoute).A01());
        if (A00 != null && (A00 instanceof Rb1)) {
            c0sg.A0B(A00.mFragmentManager, null);
        }
    }
}
