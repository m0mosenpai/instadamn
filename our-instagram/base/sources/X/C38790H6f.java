package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.H6f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38790H6f extends C0T6 implements InterfaceC43496JJi {
    public final String A00;

    @Override // X.InterfaceC43496JJi
    public final C38790H6f F2z() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38790H6f) && C14360o3.A0K(this.A00, ((C38790H6f) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public C38790H6f(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC43496JJi
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        String str = this.A00;
        if (str != null) {
            AbstractC37300Gc1.A12(str, A0X);
        }
        return AbstractC37300Gc1.A05("XDTTextAppTagFragment", AbstractC06930Yk.A0B(A0X));
    }
}
