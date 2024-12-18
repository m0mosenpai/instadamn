package X;

import android.content.Context;

/* loaded from: classes12.dex */
public final class YFQ implements C5OV {
    public final Context A00;
    public final boolean A01;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        return AbstractC167007dF.A1P(new C23821Ep(this.A00).A00.areNotificationsEnabled() ? 1 : 0, this.A01 ? 1 : 0);
    }

    public YFQ(Context context, boolean z) {
        this.A00 = context;
        this.A01 = z;
    }
}
