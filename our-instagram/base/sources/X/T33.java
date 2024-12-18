package X;

import android.content.Context;

/* loaded from: classes10.dex */
public abstract class T33 implements InterfaceC65381TjE {
    public final int A00;
    public final InterfaceC65381TjE A01;

    @Override // X.InterfaceC65381TjE
    public final Context getContext() {
        Context context = this.A01.getContext();
        C14360o3.A07(context);
        return context;
    }

    public T33(InterfaceC65381TjE interfaceC65381TjE, int i) {
        this.A01 = interfaceC65381TjE;
        this.A00 = i;
    }
}
