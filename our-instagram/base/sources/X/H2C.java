package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.REPETITION_UI_TYPE;
import java.util.List;

/* loaded from: classes7.dex */
public final class H2C extends C0T6 implements C5FS {
    public final InterfaceC106354qp A00;
    public final REPETITION_UI_TYPE A01;
    public final String A02;
    public final String A03;
    public final List A04;

    @Override // X.C5FS
    public final H2C Eqi() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2C) {
                H2C h2c = (H2C) obj;
                if (!C14360o3.A0K(this.A02, h2c.A02) || !C14360o3.A0K(this.A04, h2c.A04) || this.A01 != h2c.A01 || !C14360o3.A0K(this.A03, h2c.A03) || !C14360o3.A0K(this.A00, h2c.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C5FS
    public final String AyP() {
        return this.A02;
    }

    @Override // X.C5FS
    public final List Bjh() {
        return this.A04;
    }

    @Override // X.C5FS
    public final REPETITION_UI_TYPE Bme() {
        return this.A01;
    }

    @Override // X.C5FS
    public final String Bmy() {
        return this.A03;
    }

    @Override // X.C5FS
    public final InterfaceC106354qp CCS() {
        return this.A00;
    }

    @Override // X.C5FS
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTAfiFeedRepetitionInfo", AbstractC39736Hk6.A00(this));
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public H2C(InterfaceC106354qp interfaceC106354qp, REPETITION_UI_TYPE repetition_ui_type, String str, String str2, List list) {
        this.A02 = str;
        this.A04 = list;
        this.A01 = repetition_ui_type;
        this.A03 = str2;
        this.A00 = interfaceC106354qp;
    }
}
