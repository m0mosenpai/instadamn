package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.NativeInfoCardTextAlignment;

/* loaded from: classes7.dex */
public final class H4N extends C0T6 implements InterfaceC43559JLt {
    public final NativeInfoCardTextAlignment A00;
    public final Float A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    @Override // X.InterfaceC43559JLt
    public final H4N ExC() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4N) {
                H4N h4n = (H4N) obj;
                if (this.A00 != h4n.A00 || !C14360o3.A0K(this.A01, h4n.A01) || !C14360o3.A0K(this.A02, h4n.A02) || !C14360o3.A0K(this.A03, h4n.A03) || !C14360o3.A0K(this.A04, h4n.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43559JLt
    public final NativeInfoCardTextAlignment Aat() {
        return this.A00;
    }

    @Override // X.InterfaceC43559JLt
    public final Float B7g() {
        return this.A01;
    }

    @Override // X.InterfaceC43559JLt
    public final Integer BPy() {
        return this.A02;
    }

    @Override // X.InterfaceC43559JLt
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTNativeInfoCardStyledText", AbstractC40103HqV.A00(this));
    }

    @Override // X.InterfaceC43559JLt
    public final String getText() {
        return this.A03;
    }

    @Override // X.InterfaceC43559JLt
    public final String getTextColor() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public H4N(NativeInfoCardTextAlignment nativeInfoCardTextAlignment, Float f, Integer num, String str, String str2) {
        this.A00 = nativeInfoCardTextAlignment;
        this.A01 = f;
        this.A02 = num;
        this.A03 = str;
        this.A04 = str2;
    }
}
