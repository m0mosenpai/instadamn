package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5An, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C113505An implements Iterable, InterfaceC113515Ao, InterfaceC15590qF {
    public boolean A00;
    public boolean A01;
    public final Map A02 = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C113505An) {
                C113505An c113505An = (C113505An) obj;
                if (!C14360o3.A0K(this.A02, c113505An.A02) || this.A01 != c113505An.A01 || this.A00 != c113505An.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final Object A00(C113565At c113565At) {
        Object obj = this.A02.get(c113565At);
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Key not present: ");
        sb.append(c113565At);
        sb.append(" - consider getOrElse or getOrNull");
        throw new IllegalStateException(sb.toString());
    }

    @Override // X.InterfaceC113515Ao
    public final void EOx(C113565At c113565At, Object obj) {
        if (obj instanceof C120895dg) {
            Map map = this.A02;
            if (map.containsKey(c113565At)) {
                Object obj2 = map.get(c113565At);
                C14360o3.A0C(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                C120895dg c120895dg = (C120895dg) obj2;
                C120895dg c120895dg2 = (C120895dg) obj;
                String str = c120895dg2.A00;
                if (str == null) {
                    str = c120895dg.A00;
                }
                InterfaceC09250da interfaceC09250da = c120895dg2.A01;
                if (interfaceC09250da == null) {
                    interfaceC09250da = c120895dg.A01;
                }
                map.put(c113565At, new C120895dg(str, interfaceC09250da));
                return;
            }
        }
        this.A02.put(c113565At, obj);
    }

    public final int hashCode() {
        int hashCode = this.A02.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A00) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.A02.entrySet().iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.A01) {
            sb.append("");
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.A00) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.A02.entrySet()) {
            C113565At c113565At = (C113565At) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(c113565At.A01);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC61621Rql.A00(this));
        sb2.append("{ ");
        sb2.append((Object) sb);
        sb2.append(" }");
        return sb2.toString();
    }
}
