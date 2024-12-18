package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.H6c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38787H6c extends C0T6 implements InterfaceC43495JJh {
    public final String A00;

    @Override // X.InterfaceC43495JJh
    public final C38787H6c F2t() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38787H6c) && C14360o3.A0K(this.A00, ((C38787H6c) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public C38787H6c(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC43495JJh
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        String str = this.A00;
        if (str != null) {
            A0X.put(AbstractC111324zv.A00(417), str);
        }
        return AbstractC37300Gc1.A05("XDTTextAppFediverseUserMentionTextFragment", AbstractC06930Yk.A0B(A0X));
    }
}
