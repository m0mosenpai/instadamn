package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4xh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110124xh extends C0T6 implements InterfaceC110134xi {
    public final Long A00;
    public final List A01;

    @Override // X.InterfaceC110134xi
    public final C110124xh EsB() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C110124xh) {
                C110124xh c110124xh = (C110124xh) obj;
                if (!C14360o3.A0K(this.A00, c110124xh.A00) || !C14360o3.A0K(this.A01, c110124xh.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Long l = this.A00;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.A01;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // X.InterfaceC110134xi
    public final Long BaN() {
        return this.A00;
    }

    @Override // X.InterfaceC110134xi
    public final List BsM() {
        return this.A01;
    }

    @Override // X.InterfaceC110134xi
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsTemplateEffectsInfo", AbstractC39827Hlb.A00(this));
    }

    public C110124xh(Long l, List list) {
        this.A00 = l;
        this.A01 = list;
    }
}
