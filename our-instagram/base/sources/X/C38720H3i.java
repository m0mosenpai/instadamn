package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.H3i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38720H3i extends C0T6 implements C5FY {
    public final String A00;

    @Override // X.C5FY
    public final C38720H3i Ev9() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38720H3i) && C14360o3.A0K(this.A00, ((C38720H3i) obj).A00));
    }

    @Override // X.C5FY
    public final String BTF() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public C38720H3i(String str) {
        this.A00 = str;
    }

    @Override // X.C5FY
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        String str = this.A00;
        if (str != null) {
            A0X.put("metaCheckoutExperienceType", str);
        }
        return AbstractC37300Gc1.A05("XDTIGMetaCheckoutIABPostClickDataExtensionDict", AbstractC06930Yk.A0B(A0X));
    }
}
