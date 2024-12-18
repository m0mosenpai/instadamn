package X;

import android.view.KeyEvent;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.2q0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60762q0 implements InterfaceC60022ok {
    public final HashSet A00 = new HashSet();

    public final void A00(InterfaceC60022ok interfaceC60022ok) {
        C14360o3.A0B(interfaceC60022ok, 0);
        HashSet hashSet = this.A00;
        if (!(hashSet instanceof Collection) || !hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (((Reference) it.next()).get() == interfaceC60022ok) {
                    return;
                }
            }
        }
        hashSet.add(new WeakReference(interfaceC60022ok));
    }

    @Override // X.InterfaceC60022ok
    public final boolean onVolumeKeyPressed(EnumC37329GcX enumC37329GcX, KeyEvent keyEvent) {
        C14360o3.A0B(enumC37329GcX, 0);
        C14360o3.A0B(keyEvent, 1);
        HashSet hashSet = this.A00;
        Iterator it = hashSet.iterator();
        C14360o3.A07(it);
        boolean z = false;
        HashSet hashSet2 = null;
        while (it.hasNext()) {
            Object next = it.next();
            C14360o3.A07(next);
            Reference reference = (Reference) next;
            InterfaceC60022ok interfaceC60022ok = (InterfaceC60022ok) reference.get();
            if (interfaceC60022ok != null) {
                z = interfaceC60022ok.onVolumeKeyPressed(enumC37329GcX, keyEvent);
                if (z) {
                    break;
                }
            } else {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet();
                }
                hashSet2.add(reference);
            }
        }
        if (hashSet2 != null) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                hashSet.remove(it2.next());
            }
        }
        return z;
    }
}
