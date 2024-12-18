package X;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes9.dex */
public final class O2L {
    public final Bundle A00;

    public O2L(Context context) {
        Bundle A0b = AbstractC166987dD.A0b();
        this.A00 = A0b;
        A0b.putBoolean("isCrop", true);
        A0b.putParcelable("output", android.net.Uri.fromFile(AbstractC13530mf.A04(context)));
    }
}
