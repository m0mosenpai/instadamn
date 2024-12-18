package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes11.dex */
public final class UR7 extends C0T6 implements XGD {
    public final XG4 A00;
    public final XGA A01;
    public final InterfaceC72036XFy A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    @Override // X.XGD
    public final UR7 Ex8() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UR7) {
                UR7 ur7 = (UR7) obj;
                if (!C14360o3.A0K(this.A00, ur7.A00) || !C14360o3.A0K(this.A03, ur7.A03) || !C14360o3.A0K(this.A06, ur7.A06) || !C14360o3.A0K(this.A04, ur7.A04) || !C14360o3.A0K(this.A05, ur7.A05) || !C14360o3.A0K(this.A02, ur7.A02) || !C14360o3.A0K(this.A01, ur7.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XGD
    public final XG4 Aet() {
        return this.A00;
    }

    @Override // X.XGD
    public final List BTT() {
        return this.A06;
    }

    @Override // X.XGD
    public final String BtP() {
        return this.A04;
    }

    @Override // X.XGD
    public final InterfaceC72036XFy C7x() {
        return this.A02;
    }

    @Override // X.XGD
    public final XGA C8l() {
        return this.A01;
    }

    @Override // X.XGD
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardMetadataPayloadV1", AbstractC68374VOi.A00(this));
    }

    @Override // X.XGD
    public final String getDescription() {
        return this.A03;
    }

    @Override // X.XGD
    public final String getTextColor() {
        return this.A05;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31;
        XGA xga = this.A01;
        if (xga != null) {
            i = xga.hashCode();
        }
        return A0M + i;
    }

    public UR7(XG4 xg4, XGA xga, InterfaceC72036XFy interfaceC72036XFy, String str, String str2, String str3, List list) {
        this.A00 = xg4;
        this.A03 = str;
        this.A06 = list;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = interfaceC72036XFy;
        this.A01 = xga;
    }
}
