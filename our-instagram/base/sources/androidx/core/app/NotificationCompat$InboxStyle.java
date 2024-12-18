package androidx.core.app;

import X.AbstractC166987dD;
import X.AbstractC72869Xpo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes12.dex */
public final class NotificationCompat$InboxStyle extends AbstractC72869Xpo {
    public ArrayList A00 = AbstractC166987dD.A1E();

    @Override // X.AbstractC72869Xpo
    public final void A01(Bundle bundle) {
        super.A01(bundle);
        bundle.remove("android.textLines");
    }

    @Override // X.AbstractC72869Xpo
    public final void A04(Bundle bundle) {
        super.A04(bundle);
        ArrayList arrayList = this.A00;
        arrayList.clear();
        if (bundle.containsKey("android.textLines")) {
            Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
        }
    }
}
