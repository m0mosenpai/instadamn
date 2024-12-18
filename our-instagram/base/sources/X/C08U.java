package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.08U, reason: invalid class name */
/* loaded from: classes.dex */
public final class C08U {
    public Bundle A00;
    public boolean A01;
    public boolean A03;
    public AUX A04;
    public final C58336PtW A05 = new C58336PtW();
    public boolean A02 = true;

    public final Bundle A00(String str) {
        C14360o3.A0B(str, 0);
        if (this.A03) {
            Bundle bundle = this.A00;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.A00;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.A00;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.A00 = null;
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final void A03(C08T c08t, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c08t, 1);
        if (this.A05.A07(str, c08t) == null) {
        } else {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void A04(Class cls) {
        if (this.A02) {
            AUX aux = this.A04;
            if (aux == null) {
                aux = new AUX(this);
            }
            this.A04 = aux;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                AUX aux2 = this.A04;
                if (aux2 != null) {
                    String name = cls.getName();
                    C14360o3.A07(name);
                    aux2.A00(name);
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException(AnonymousClass001.A0g("Class ", cls.getSimpleName(), " must have default constructor in order to be automatically recreated"), e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public final C08T A01(String str) {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C14360o3.A05(entry);
            Object key = entry.getKey();
            C08T c08t = (C08T) entry.getValue();
            if (C14360o3.A0K(key, str)) {
                return c08t;
            }
        }
        return null;
    }

    public final void A02(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.A00;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C211611s A05 = this.A05.A05();
        while (A05.hasNext()) {
            Map.Entry entry = (Map.Entry) A05.next();
            bundle2.putBundle((String) entry.getKey(), ((C08T) entry.getValue()).ELr());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
