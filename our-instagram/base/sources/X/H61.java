package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class H61 extends C0T6 implements InterfaceC43490JJc {
    public final String A00;

    @Override // X.InterfaceC43490JJc
    public final H61 F1i() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H61) && C14360o3.A0K(this.A00, ((H61) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public H61(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC43490JJc
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        String str = this.A00;
        if (str != null) {
            AbstractC37300Gc1.A12(str, A0X);
        }
        return AbstractC37300Gc1.A05("XDTStorySellerCollectionStickerTappableData", AbstractC06930Yk.A0B(A0X));
    }
}