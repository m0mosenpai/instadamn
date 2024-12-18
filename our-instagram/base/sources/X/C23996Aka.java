package X;

import android.content.Context;

/* renamed from: X.Aka, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23996Aka implements C5OV {
    public final Context A00;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        Context context = this.A00;
        C14360o3.A07(context.getSharedPreferences(context.getPackageName(), 0));
        return !r1.getBoolean("APPIRATER_DECLINED_TO_RATE", false);
    }

    public C23996Aka(Context context) {
        this.A00 = context;
    }
}
