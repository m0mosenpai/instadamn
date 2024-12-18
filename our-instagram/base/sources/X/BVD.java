package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes5.dex */
public final class BVD extends C0T6 implements InterfaceC31130DmD {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    @Override // X.InterfaceC31130DmD
    public final BVD Ez8() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BVD) {
                BVD bvd = (BVD) obj;
                if (!C14360o3.A0K(this.A01, bvd.A01) || !C14360o3.A0K(this.A00, bvd.A00) || !C14360o3.A0K(this.A02, bvd.A02) || this.A04 != bvd.A04 || !C14360o3.A0K(this.A03, bvd.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31130DmD
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTReelsTappableTooltip", CDU.A00(this));
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A04, ((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public BVD(Integer num, String str, String str2, List list, boolean z) {
        this.A01 = str;
        this.A00 = num;
        this.A02 = str2;
        this.A04 = z;
        this.A03 = list;
    }

    @Override // X.InterfaceC31130DmD
    public final String Aye() {
        return this.A01;
    }

    @Override // X.InterfaceC31130DmD
    public final Integer Azi() {
        return this.A00;
    }

    @Override // X.InterfaceC31130DmD
    public final String BDM() {
        return this.A02;
    }

    @Override // X.InterfaceC31130DmD
    public final List BR8() {
        return this.A03;
    }

    @Override // X.InterfaceC31130DmD
    public final boolean CTZ() {
        return this.A04;
    }
}
