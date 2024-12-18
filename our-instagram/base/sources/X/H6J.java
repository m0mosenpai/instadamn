package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class H6J extends C0T6 implements InterfaceC43492JJe {
    public final String A00;

    @Override // X.InterfaceC43492JJe
    public final H6J F2Q() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H6J) && C14360o3.A0K(this.A00, ((H6J) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public H6J(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC43492JJe
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        String str = this.A00;
        if (str != null) {
            AbstractC37300Gc1.A12(str, A0X);
        }
        return AbstractC37300Gc1.A05("XDTStoryVotingInfoCenterStickerTappableData", AbstractC06930Yk.A0B(A0X));
    }
}
