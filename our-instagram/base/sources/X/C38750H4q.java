package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.H4q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38750H4q extends C0T6 implements JJX {
    public final String A00;

    @Override // X.JJX
    public final C38750H4q Eyn() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38750H4q) && C14360o3.A0K(this.A00, ((C38750H4q) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public C38750H4q(String str) {
        this.A00 = str;
    }

    @Override // X.JJX
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        String str = this.A00;
        if (str != null) {
            A0X.put("collection_id", str);
        }
        return AbstractC37300Gc1.A05("XDTPublicCollectionTappableData", AbstractC06930Yk.A0B(A0X));
    }
}
