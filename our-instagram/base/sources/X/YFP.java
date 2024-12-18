package X;

import android.content.Context;

/* loaded from: classes12.dex */
public final class YFP implements C5OV {
    public final Context A00;
    public final boolean A01;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        W3x w3x = W3x.A00;
        Context context = this.A00;
        if (w3x.A00(context) || new C23821Ep(context).A00.areNotificationsEnabled() != this.A01) {
            return false;
        }
        return true;
    }

    public YFP(Context context, boolean z) {
        this.A00 = context;
        this.A01 = z;
    }
}
