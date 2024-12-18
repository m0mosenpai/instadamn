package X;

import android.os.Bundle;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public final class AUX implements C08T {
    public final java.util.Set A00 = new LinkedHashSet();

    public final void A00(String str) {
        this.A00.add(str);
    }

    public AUX(C08U c08u) {
        c08u.A03(this, "androidx.savedstate.Restarter");
    }

    @Override // X.C08T
    public final Bundle ELr() {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putStringArrayList("classes_to_restore", AbstractC166987dD.A1F(this.A00));
        return A0b;
    }
}
