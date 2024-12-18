package X;

import com.facebook.react.uimanager.ViewManager;
import com.fbpay.ptt.impl.javacpp.ServerCertsVerifierImpl;
import java.util.Collections;
import java.util.Locale;

/* renamed from: X.TVb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64812TVb implements InterfaceC08830cm {
    public final int A00;

    public C64812TVb(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.A00) {
            case 0:
                return Locale.getDefault();
            case 1:
                return new C5F7(Collections.emptyList());
            case 2:
                return new ViewManager(null);
            default:
                return new ServerCertsVerifierImpl();
        }
    }
}
