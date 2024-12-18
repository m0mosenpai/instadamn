package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class H2K extends C0T6 implements InterfaceC43500JJm {
    public final List A00;

    public H2K(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // X.InterfaceC43500JJm
    public final H2K Er2() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H2K) && C14360o3.A0K(this.A00, ((H2K) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC43500JJm
    public final List Bgx() {
        return this.A00;
    }

    @Override // X.InterfaceC43500JJm
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTAudioGoDarkEventSchema", AbstractC39754HkQ.A00(this));
    }
}
