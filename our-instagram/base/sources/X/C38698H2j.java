package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.H2j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38698H2j extends C0T6 implements InterfaceC43503JJp {
    public final String A00;

    public C38698H2j(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // X.InterfaceC43503JJp
    public final C38698H2j Es4() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38698H2j) && C14360o3.A0K(this.A00, ((C38698H2j) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC43503JJp
    public final String getEffectId() {
        return this.A00;
    }

    @Override // X.InterfaceC43503JJp
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        String str = this.A00;
        if (str != null) {
            A0X.put("effect_id", str);
        }
        return AbstractC37300Gc1.A05("XDTClipsSmartTemplateInfo", AbstractC06930Yk.A0B(A0X));
    }
}
