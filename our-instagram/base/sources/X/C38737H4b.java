package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.H4b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38737H4b extends C0T6 implements InterfaceC1347767n {
    public final String A00;

    public C38737H4b(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // X.InterfaceC1347767n
    public final C38737H4b EyA() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38737H4b) && C14360o3.A0K(this.A00, ((C38737H4b) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC1347767n
    public final String Bfe() {
        return this.A00;
    }

    @Override // X.InterfaceC1347767n
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        String str = this.A00;
        if (str != null) {
            A0X.put("presence_id", str);
        }
        return AbstractC37300Gc1.A05("XDTPresenceNoteResponseInfo", AbstractC06930Yk.A0B(A0X));
    }
}
