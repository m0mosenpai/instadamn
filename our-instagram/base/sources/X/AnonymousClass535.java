package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.535, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass535 extends C0T6 implements AnonymousClass536 {
    public final Boolean A00;
    public final String A01;
    public final List A02;

    @Override // X.AnonymousClass536
    public final AnonymousClass535 EvR() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass535) {
                AnonymousClass535 anonymousClass535 = (AnonymousClass535) obj;
                if (!C14360o3.A0K(this.A01, anonymousClass535.A01) || !C14360o3.A0K(this.A00, anonymousClass535.A00) || !C14360o3.A0K(this.A02, anonymousClass535.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.A00;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.A02;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // X.AnonymousClass536
    public final String B7l() {
        return this.A01;
    }

    @Override // X.AnonymousClass536
    public final List BiX() {
        return this.A02;
    }

    @Override // X.AnonymousClass536
    public final Boolean CQI() {
        return this.A00;
    }

    @Override // X.AnonymousClass536
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGPromoAdsAutofillPostClickDataExtensionDict", AbstractC40016Hox.A00(this));
    }

    public AnonymousClass535(Boolean bool, String str, List list) {
        this.A01 = str;
        this.A00 = bool;
        this.A02 = list;
    }
}
