package X;

import android.os.Bundle;
import java.util.Map;

/* renamed from: X.2Zs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51932Zs implements C08T {
    public Bundle A00;
    public boolean A01;
    public final InterfaceC09390do A02;
    public final C08U A03;

    public C51932Zs(InterfaceC018407e interfaceC018407e, C08U c08u) {
        C14360o3.A0B(c08u, 1);
        C14360o3.A0B(interfaceC018407e, 2);
        this.A03 = c08u;
        this.A02 = AbstractC09440dt.A01(new C9EV(interfaceC018407e, 40));
    }

    public final void A00() {
        if (!this.A01) {
            Bundle A00 = this.A03.A00("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.A00;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (A00 != null) {
                bundle.putAll(A00);
            }
            this.A00 = bundle;
            this.A01 = true;
            this.A02.getValue();
        }
    }

    @Override // X.C08T
    public final Bundle ELr() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.A00;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((C53462cU) this.A02.getValue()).A00.entrySet()) {
            String str = (String) entry.getKey();
            Bundle ELr = ((C152406tQ) entry.getValue()).A00.ELr();
            if (!C14360o3.A0K(ELr, Bundle.EMPTY)) {
                bundle.putBundle(str, ELr);
            }
        }
        this.A01 = false;
        return bundle;
    }
}
