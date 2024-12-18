package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;

/* loaded from: classes10.dex */
public final class T34 implements InterfaceC65381TjE {
    public LayoutInflater A00;
    public final VTA A01 = C2FP.A09();
    public final Context A02;

    @Override // X.InterfaceC65381TjE
    public final Context getContext() {
        return this.A02;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0ps, java.lang.Object] */
    public T34(Context context, int i) {
        ?? obj = new Object();
        obj.A00 = context;
        obj.A00 = new ContextThemeWrapper(context, i);
        Q1z q1z = new Q1z(this, obj);
        this.A02 = q1z;
        this.A00 = LayoutInflater.from(q1z);
    }
}
