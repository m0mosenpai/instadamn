package X;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.08W, reason: invalid class name */
/* loaded from: classes.dex */
public final class C08W {
    public boolean A00;
    public final C08U A01 = new C08U();
    public final InterfaceC08430c6 A02;

    public final void A00() {
        final InterfaceC08430c6 interfaceC08430c6 = this.A02;
        C07T lifecycle = interfaceC08430c6.getLifecycle();
        if (lifecycle.A07() == C07S.INITIALIZED) {
            lifecycle.A09(new InterfaceC09670ek(interfaceC08430c6) { // from class: X.2Zk
                public final InterfaceC08430c6 A00;

                @Override // X.InterfaceC09670ek
                public final void DoQ(C07R c07r, C07X c07x) {
                    C14360o3.A0B(c07x, 0);
                    C14360o3.A0B(c07r, 1);
                    if (c07r == C07R.ON_CREATE) {
                        c07x.getLifecycle().A0A(this);
                        InterfaceC08430c6 interfaceC08430c62 = this.A00;
                        Bundle A00 = interfaceC08430c62.getSavedStateRegistry().A00("androidx.savedstate.Restarter");
                        if (A00 != null) {
                            ArrayList<String> stringArrayList = A00.getStringArrayList("classes_to_restore");
                            if (stringArrayList != null) {
                                Iterator<String> it = stringArrayList.iterator();
                                while (it.hasNext()) {
                                    String next = it.next();
                                    try {
                                        Class<? extends U> asSubclass = Class.forName(next, false, C51862Zk.class.getClassLoader()).asSubclass(C08R.class);
                                        C14360o3.A07(asSubclass);
                                        try {
                                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                            declaredConstructor.setAccessible(true);
                                            try {
                                                C14360o3.A07(declaredConstructor.newInstance(new Object[0]));
                                                if (interfaceC08430c62 instanceof InterfaceC018407e) {
                                                    C018307d viewModelStore = ((InterfaceC018407e) interfaceC08430c62).getViewModelStore();
                                                    C08U savedStateRegistry = interfaceC08430c62.getSavedStateRegistry();
                                                    Map map = viewModelStore.A00;
                                                    Iterator it2 = new HashSet(map.keySet()).iterator();
                                                    while (it2.hasNext()) {
                                                        Object next2 = it2.next();
                                                        C14360o3.A0B(next2, 0);
                                                        AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) map.get(next2);
                                                        C14360o3.A0A(abstractC52922bZ);
                                                        C89U.A00(interfaceC08430c62.getLifecycle(), abstractC52922bZ, savedStateRegistry);
                                                    }
                                                    if (!new HashSet(map.keySet()).isEmpty()) {
                                                        savedStateRegistry.A04(AUW.class);
                                                    }
                                                } else {
                                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                                }
                                            } catch (Exception e) {
                                                throw new RuntimeException(AnonymousClass001.A0R("Failed to instantiate ", next), e);
                                            }
                                        } catch (NoSuchMethodException e2) {
                                            throw new IllegalStateException(AnonymousClass001.A0g("Class ", asSubclass.getSimpleName(), " must have default constructor in order to be automatically recreated"), e2);
                                        }
                                    } catch (ClassNotFoundException e3) {
                                        throw new RuntimeException(AnonymousClass001.A0g("Class ", next, " wasn't found"), e3);
                                    }
                                }
                                return;
                            }
                            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                        }
                        return;
                    }
                    throw new AssertionError("Next event must be ON_CREATE");
                }

                {
                    this.A00 = interfaceC08430c6;
                }
            });
            final C08U c08u = this.A01;
            if (!c08u.A01) {
                lifecycle.A09(new InterfaceC09670ek() { // from class: X.0il
                    @Override // X.InterfaceC09670ek
                    public final void DoQ(C07R c07r, C07X c07x) {
                        C08U c08u2 = C08U.this;
                        C14360o3.A0B(c08u2, 0);
                        C14360o3.A0B(c07r, 2);
                        if (c07r == C07R.ON_START) {
                            c08u2.A02 = true;
                        } else {
                            if (c07r != C07R.ON_STOP) {
                                return;
                            }
                            c08u2.A02 = false;
                        }
                    }
                });
                c08u.A01 = true;
                this.A00 = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public final void A01(Bundle bundle) {
        Bundle bundle2;
        if (!this.A00) {
            A00();
        }
        C07T lifecycle = this.A02.getLifecycle();
        if (!lifecycle.A07().A00(C07S.STARTED)) {
            C08U c08u = this.A01;
            if (c08u.A01) {
                if (!c08u.A03) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    c08u.A00 = bundle2;
                    c08u.A03 = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.");
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("performRestore cannot be called when owner is ");
        sb.append(lifecycle.A07());
        throw new IllegalStateException(sb.toString());
    }

    public C08W(InterfaceC08430c6 interfaceC08430c6) {
        this.A02 = interfaceC08430c6;
    }
}
