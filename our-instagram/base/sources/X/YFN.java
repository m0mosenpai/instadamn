package X;

import android.content.Context;

/* loaded from: classes12.dex */
public final class YFN implements C5OV {
    public final Context A00;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        return new C23821Ep(this.A00).A00.areNotificationsEnabled();
    }

    public YFN(Context context) {
        this.A00 = context;
    }
}
