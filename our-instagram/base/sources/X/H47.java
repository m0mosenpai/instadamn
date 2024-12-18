package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class H47 extends C0T6 implements InterfaceC43508JJu {
    public final List A00;

    public H47(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // X.InterfaceC43508JJu
    public final H47 Ew9() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H47) && C14360o3.A0K(this.A00, ((H47) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC43508JJu
    public final List BxK() {
        return this.A00;
    }

    @Override // X.InterfaceC43508JJu
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTLumenLoggingInfo", AbstractC40053Hpf.A00(this));
    }
}
