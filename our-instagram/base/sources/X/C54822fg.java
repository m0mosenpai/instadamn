package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2fg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54822fg {
    public float A00;
    public float A01;
    public boolean A03;
    public final C54132eL A04;
    public String A02 = NetInfoModule.CONNECTION_TYPE_NONE;
    public final List A05 = new CopyOnWriteArrayList();

    public final void A00(InterfaceC53912dV interfaceC53912dV) {
        this.A05.add(new WeakReference(interfaceC53912dV));
    }

    public final void A01(InterfaceC53912dV interfaceC53912dV) {
        List<Reference> list = this.A05;
        for (Reference reference : list) {
            Object obj = reference.get();
            if (obj == null || obj == interfaceC53912dV) {
                list.remove(reference);
            }
        }
    }

    public C54822fg(C54132eL c54132eL) {
        this.A04 = c54132eL;
    }
}
