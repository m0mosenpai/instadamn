package X;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: X.3Nh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72603Nh {
    public int A00;
    public LinkedList A01 = new LinkedList();

    public static final boolean A01(InterfaceC11380iw interfaceC11380iw, Map map) {
        if (map.get("instance_id") == null || map.get("module") == null) {
            return false;
        }
        if (!C14360o3.A0K(map.get("instance_id"), String.valueOf(System.identityHashCode(interfaceC11380iw))) && !C14360o3.A0K(map.get("module"), interfaceC11380iw.getModuleName())) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.A01.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            C14360o3.A07(next);
            StringBuilder sb = new StringBuilder();
            sb.append(next);
            sb.append("\n");
            stringBuffer.append(sb.toString());
        }
        String obj = stringBuffer.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static final void A00(InterfaceC11380iw interfaceC11380iw, String str, Map map) {
        C11520jB E6b;
        interfaceC11380iw.getModuleName();
        map.put("instance_id", String.valueOf(System.identityHashCode(interfaceC11380iw)));
        map.put("module", interfaceC11380iw.getModuleName());
        if (str != null) {
            map.put("source_module", str);
        }
        if ((interfaceC11380iw instanceof InterfaceC11480j6) && (E6b = ((InterfaceC11480j6) interfaceC11380iw).E6b()) != null) {
            map.putAll(E6b.A02());
        }
    }
}
