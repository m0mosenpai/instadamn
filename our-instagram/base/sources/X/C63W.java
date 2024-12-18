package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.63W, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C63W implements ComponentCallbacks2, InterfaceC10270gj {
    public final java.util.Set A00;

    @Override // X.InterfaceC18130ux
    public final void Cvs(C0TY c0ty) {
        C14360o3.A0B(c0ty, 0);
        if (c0ty == C0TY.RED) {
            A00();
        }
    }

    @Override // X.InterfaceC18490vb
    public final void DO4(C0TY c0ty) {
        C14360o3.A0B(c0ty, 0);
        if (c0ty == C0TY.RED) {
            A00();
        }
    }

    @Override // X.InterfaceC18530vf
    public final void Drh(C0TY c0ty) {
        C14360o3.A0B(c0ty, 0);
        if (c0ty == C0TY.RED) {
            A00();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    private final void A00() {
        Iterator it = AbstractC001800i.A0a(this.A00).iterator();
        while (it.hasNext()) {
            ((C6DR) it.next()).D8j();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 80) {
            A00();
        }
    }

    public C63W(Context context, C0TX c0tx) {
        java.util.Set synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        C14360o3.A07(synchronizedSet);
        this.A00 = synchronizedSet;
        context.getApplicationContext().registerComponentCallbacks(this);
        if (c0tx != null) {
            c0tx.A93(this);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        A00();
    }
}
