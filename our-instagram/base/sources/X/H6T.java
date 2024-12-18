package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class H6T extends C0T6 implements InterfaceC43515JKb {
    public final String A00;
    public final String A01;

    @Override // X.InterfaceC43515JKb
    public final H6T F2i() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6T) {
                H6T h6t = (H6T) obj;
                if (!C14360o3.A0K(this.A00, h6t.A00) || !C14360o3.A0K(this.A01, h6t.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43515JKb
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (getTitle() != null) {
            AbstractC37300Gc1.A17(getTitle(), A1I);
        }
        if (getUrl() != null) {
            AbstractC37300Gc1.A13(getUrl(), A1I);
        }
        return AbstractC37300Gc1.A05("XDTSurveyCallToAction", AbstractC06930Yk.A0B(A1I));
    }

    @Override // X.InterfaceC43515JKb
    public final String getTitle() {
        return this.A00;
    }

    @Override // X.InterfaceC43515JKb
    public final String getUrl() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public H6T(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
