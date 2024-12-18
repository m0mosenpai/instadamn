package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SuD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63819SuD implements InterfaceC65477Tku {
    public final C02Q A00;
    public final List A01;

    @Override // X.InterfaceC65477Tku
    public final SFV AEj(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        SFV AEj;
        List list = this.A01;
        int size = list.size();
        ArrayList A17 = AbstractC25225BEi.A17(size);
        InterfaceC65617To8 interfaceC65617To8 = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC65477Tku interfaceC65477Tku = (InterfaceC65477Tku) list.get(i3);
            if (interfaceC65477Tku.CKb(obj) && (AEj = interfaceC65477Tku.AEj(c63729Ssj, obj, i, i2)) != null) {
                interfaceC65617To8 = AEj.A00;
                A17.add(AEj.A01);
            }
        }
        if (A17.isEmpty() || interfaceC65617To8 == null) {
            return null;
        }
        return new SFV(interfaceC65617To8, new C63773StT(this.A00, A17));
    }

    @Override // X.InterfaceC65477Tku
    public final boolean CKb(Object obj) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            if (((InterfaceC65477Tku) it.next()).CKb(obj)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return AnonymousClass001.A0S("MultiModelLoader{modelLoaders=", Arrays.toString(this.A01.toArray()), '}');
    }

    public C63819SuD(C02Q c02q, List list) {
        this.A01 = list;
        this.A00 = c02q;
    }
}
