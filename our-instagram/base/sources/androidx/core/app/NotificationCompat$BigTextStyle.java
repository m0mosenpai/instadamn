package androidx.core.app;

import X.AbstractC72869Xpo;
import X.XN9;
import android.os.Bundle;

/* loaded from: classes12.dex */
public final class NotificationCompat$BigTextStyle extends AbstractC72869Xpo {
    public CharSequence A00;

    @Override // X.AbstractC72869Xpo
    public final void A01(Bundle bundle) {
        super.A01(bundle);
        bundle.remove("android.bigText");
    }

    @Override // X.AbstractC72869Xpo
    public final void A04(Bundle bundle) {
        super.A04(bundle);
        this.A00 = bundle.getCharSequence("android.bigText");
    }

    public final void A06(CharSequence charSequence) {
        this.A00 = XN9.A01(charSequence);
    }
}
