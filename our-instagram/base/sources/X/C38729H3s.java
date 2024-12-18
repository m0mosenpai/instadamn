package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;

/* renamed from: X.H3s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38729H3s extends C0T6 implements JJQ {
    public final String A00;

    @Override // X.JJQ
    public final C38729H3s EvJ() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38729H3s) && C14360o3.A0K(this.A00, ((C38729H3s) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public C38729H3s(String str) {
        this.A00 = str;
    }

    @Override // X.JJQ
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        String str = this.A00;
        if (str != null) {
            A0X.put(DevServerEntity.COLUMN_DESCRIPTION, str);
        }
        return AbstractC37300Gc1.A05("XDTIGOffsiteLeadAdsProfileCardDict", AbstractC06930Yk.A0B(A0X));
    }
}
