package X;

import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ak9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23974Ak9 implements InterfaceC2056098k {
    public final EnumC92794Ds A00;
    public final MsysThreadSubtype A01;
    public final List A02;

    public C23974Ak9(EnumC92794Ds enumC92794Ds, MsysThreadSubtype msysThreadSubtype, List list) {
        C14360o3.A0B(list, 1);
        this.A02 = list;
        this.A01 = msysThreadSubtype;
        this.A00 = enumC92794Ds;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C23974Ak9)) {
            return false;
        }
        C23974Ak9 c23974Ak9 = (C23974Ak9) obj;
        if (this.A00 != c23974Ak9.A00) {
            return false;
        }
        List list = this.A02;
        List list2 = c23974Ak9.A02;
        return list.containsAll(list2) && list2.containsAll(list);
    }

    @Override // X.InterfaceC2056098k
    public final EnumC92794Ds CAo() {
        return this.A00;
    }

    public final int hashCode() {
        Iterator it = this.A02.iterator();
        int i = 0;
        while (it.hasNext()) {
            i ^= it.next().hashCode();
        }
        return AbstractC166987dD.A0I(this.A00, i * 31);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C23974Ak9(EnumC92794Ds enumC92794Ds, List list) {
        this(enumC92794Ds, MsysThreadSubtype.Standard.A00, list);
        C14360o3.A0B(list, 1);
    }
}
