package X;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes9.dex */
public final class OT6 {
    public static final OT6 A01 = new OT6();
    public final InterfaceC19630xq A00;

    public OT6() {
        Context context = AbstractC12290kX.A00;
        SharedPreferences sharedPreferences = context.getSharedPreferences(AnonymousClass001.A0R(context.getPackageName(), "_preferences"), 0);
        C14360o3.A07(sharedPreferences);
        this.A00 = new C17320tT(sharedPreferences, "IgPapayaSharedPreferences");
    }
}
