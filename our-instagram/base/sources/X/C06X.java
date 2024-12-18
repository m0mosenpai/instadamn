package X;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.06X, reason: invalid class name */
/* loaded from: classes.dex */
public final class C06X extends AbstractC52922bZ {
    public static final InterfaceC52932ba A06 = new InterfaceC52932ba() { // from class: X.06W
        @Override // X.InterfaceC52932ba
        public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
            return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
        }

        @Override // X.InterfaceC52932ba
        public final AbstractC52922bZ create(Class cls) {
            return new C06X(true);
        }

        @Override // X.InterfaceC52932ba
        public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
            C14360o3.A0B(cls, 1);
            return create(cls);
        }
    };
    public final boolean A05;
    public final HashMap A03 = new HashMap();
    public final HashMap A02 = new HashMap();
    public final HashMap A04 = new HashMap();
    public boolean A00 = false;
    public boolean A01 = false;

    public final void A02(String str, boolean z) {
        AbstractC10360h2.A0H(3);
        A00(this, str, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C06X c06x = (C06X) obj;
            if (!this.A03.equals(c06x.A03) || !this.A02.equals(c06x.A02) || !this.A04.equals(c06x.A04)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        AbstractC10360h2.A0H(3);
        this.A00 = true;
    }

    public static void A00(C06X c06x, String str, boolean z) {
        HashMap hashMap = c06x.A02;
        C06X c06x2 = (C06X) hashMap.get(str);
        if (c06x2 != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c06x2.A02.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c06x2.A02((String) it.next(), true);
                }
            }
            c06x2.onCleared();
            hashMap.remove(str);
        }
        HashMap hashMap2 = c06x.A04;
        C018307d c018307d = (C018307d) hashMap2.get(str);
        if (c018307d != null) {
            c018307d.A00();
            hashMap2.remove(str);
        }
    }

    public final void A01(Fragment fragment) {
        if (this.A01 || this.A03.remove(fragment.mWho) != null) {
            AbstractC10360h2.A0H(2);
        }
    }

    public final int hashCode() {
        return (((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A04.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.A03.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.A02.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.A04.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public C06X(boolean z) {
        this.A05 = z;
    }
}
