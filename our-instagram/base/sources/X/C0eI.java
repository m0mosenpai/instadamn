package X;

import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.0eI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0eI implements C0XN {
    public final InterfaceC07540aT A00;

    public static void A00(ObjectOutputStream objectOutputStream, LinkedHashMap linkedHashMap) {
        if (linkedHashMap == null) {
            objectOutputStream.writeShort(0);
            return;
        }
        objectOutputStream.writeShort(linkedHashMap.size());
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            objectOutputStream.writeUTF((String) it.next());
        }
    }

    @Override // X.C0XN
    public final int AVP(int i, String str) {
        LinkedHashMap linkedHashMap;
        Number number;
        C0ZG c0zg = (C0ZG) this.A00.get(i);
        if (c0zg == null || (linkedHashMap = c0zg.A00) == null || (number = (Number) linkedHashMap.get(str)) == null) {
            return -1;
        }
        return number.intValue();
    }

    @Override // X.C0XN
    public final boolean CY2(int i) {
        if (this.A00.get(i) == null) {
            return false;
        }
        return true;
    }

    public C0eI(InterfaceC07540aT interfaceC07540aT) {
        this.A00 = interfaceC07540aT;
    }
}
