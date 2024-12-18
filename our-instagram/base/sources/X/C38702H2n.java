package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.H2n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38702H2n extends C0T6 implements InterfaceC43504JJq {
    public final String A00;

    public C38702H2n(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // X.InterfaceC43504JJq
    public final C38702H2n Es8() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38702H2n) && C14360o3.A0K(this.A00, ((C38702H2n) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC43504JJq
    public final String BWl() {
        return this.A00;
    }

    @Override // X.InterfaceC43504JJq
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        String str = this.A00;
        if (str != null) {
            A0X.put("new_text", str);
        }
        return AbstractC37300Gc1.A05("XDTClipsSpinSwappedText", AbstractC06930Yk.A0B(A0X));
    }
}
