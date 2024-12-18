package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class H7Z extends C0T6 implements InterfaceC43565JLz {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    @Override // X.InterfaceC43565JLz
    public final H7Z F5K() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7Z) {
                H7Z h7z = (H7Z) obj;
                if (!C14360o3.A0K(this.A04, h7z.A04) || !C14360o3.A0K(this.A01, h7z.A01) || !C14360o3.A0K(this.A02, h7z.A02) || !C14360o3.A0K(this.A00, h7z.A00) || !C14360o3.A0K(this.A03, h7z.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43565JLz
    public final List Ac6() {
        return this.A04;
    }

    @Override // X.InterfaceC43565JLz
    public final String BjI() {
        return this.A01;
    }

    @Override // X.InterfaceC43565JLz
    public final Integer C9w() {
        return this.A00;
    }

    @Override // X.InterfaceC43565JLz
    public final String CBn() {
        return this.A03;
    }

    @Override // X.InterfaceC43565JLz
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTSurveyQuestion", I2Z.A00(this));
    }

    @Override // X.InterfaceC43565JLz
    public final String getTitle() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, (AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC167017dG.A0M(this.A04) * 31)) + AbstractC166997dE.A0I(this.A00)) * 31);
    }

    public H7Z(Integer num, String str, String str2, String str3, List list) {
        AbstractC167017dG.A1R(str, str2);
        C14360o3.A0B(str3, 5);
        this.A04 = list;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
        this.A03 = str3;
    }
}
