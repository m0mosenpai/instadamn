package X;

import android.app.Activity;
import android.content.Context;

/* renamed from: X.FLn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34578FLn {
    public final Activity A00;
    public final C6FQ A01;
    public final InterfaceC103384lE A02;
    public final Context A03;

    public C34578FLn(Context context, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE) {
        Activity activity;
        this.A03 = context;
        this.A02 = interfaceC103384lE;
        this.A01 = c6fq;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        this.A00 = activity;
    }
}
