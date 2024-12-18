package X;

import android.os.Bundle;
import java.util.Map;

/* renamed from: X.2Zl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC51872Zl {
    public static final InterfaceC51892Zn A01 = new InterfaceC51892Zn() { // from class: X.2Zm
    };
    public static final InterfaceC51892Zn A02 = new InterfaceC51892Zn() { // from class: X.2Zo
    };
    public static final InterfaceC51892Zn A00 = new InterfaceC51892Zn() { // from class: X.2Zp
    };

    public static final C152406tQ A00(AbstractC52972be abstractC52972be) {
        C51932Zs c51932Zs;
        Bundle bundle;
        InterfaceC08430c6 interfaceC08430c6 = (InterfaceC08430c6) abstractC52972be.A00(A01);
        if (interfaceC08430c6 != null) {
            InterfaceC018407e interfaceC018407e = (InterfaceC018407e) abstractC52972be.A00(A02);
            if (interfaceC018407e != null) {
                Bundle bundle2 = (Bundle) abstractC52972be.A00(A00);
                String str = (String) abstractC52972be.A00(C53442cS.A01);
                if (str != null) {
                    C08T A012 = interfaceC08430c6.getSavedStateRegistry().A01("androidx.lifecycle.internal.SavedStateHandlesProvider");
                    if ((A012 instanceof C51932Zs) && (c51932Zs = (C51932Zs) A012) != null) {
                        Map map = ((C53462cU) new C52942bb(new C53422cQ(), interfaceC018407e).A01(C53462cU.class, "androidx.lifecycle.internal.SavedStateHandlesVM")).A00;
                        C152406tQ c152406tQ = (C152406tQ) map.get(str);
                        if (c152406tQ == null) {
                            c51932Zs.A00();
                            Bundle bundle3 = c51932Zs.A00;
                            if (bundle3 != null) {
                                bundle = bundle3.getBundle(str);
                            } else {
                                bundle = null;
                            }
                            Bundle bundle4 = c51932Zs.A00;
                            if (bundle4 != null) {
                                bundle4.remove(str);
                            }
                            Bundle bundle5 = c51932Zs.A00;
                            if (bundle5 != null && bundle5.isEmpty()) {
                                c51932Zs.A00 = null;
                            }
                            C152406tQ A002 = RrA.A00(bundle, bundle2);
                            map.put(str, A002);
                            return A002;
                        }
                        return c152406tQ;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final void A01(InterfaceC08430c6 interfaceC08430c6) {
        C07S A07 = interfaceC08430c6.getLifecycle().A07();
        if (A07 != C07S.INITIALIZED && A07 != C07S.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC08430c6.getSavedStateRegistry().A01("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            final C51932Zs c51932Zs = new C51932Zs((InterfaceC018407e) interfaceC08430c6, interfaceC08430c6.getSavedStateRegistry());
            interfaceC08430c6.getSavedStateRegistry().A03(c51932Zs, "androidx.lifecycle.internal.SavedStateHandlesProvider");
            interfaceC08430c6.getLifecycle().A09(new InterfaceC09670ek(c51932Zs) { // from class: X.2Zt
                public final C51932Zs A00;

                @Override // X.InterfaceC09670ek
                public final void DoQ(C07R c07r, C07X c07x) {
                    C14360o3.A0B(c07x, 0);
                    C14360o3.A0B(c07r, 1);
                    if (c07r == C07R.ON_CREATE) {
                        c07x.getLifecycle().A0A(this);
                        this.A00.A00();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Next event must be ON_CREATE, it was ");
                        sb.append(c07r);
                        throw new IllegalStateException(sb.toString());
                    }
                }

                {
                    this.A00 = c51932Zs;
                }
            });
        }
    }
}
