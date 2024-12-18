package X;

import android.content.Context;

/* loaded from: classes10.dex */
public final class TE4 implements InterfaceC65438TkA {
    public final int A00;
    public final Object A01;

    public TE4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC65438TkA
    public final Object get() {
        SWI swi;
        if (this.A00 != 0) {
            Context context = (Context) this.A01;
            synchronized (SWI.class) {
                swi = SWI.A02;
                if (swi == null) {
                    swi = new SWI(context);
                    SWI.A02 = swi;
                }
            }
            return swi;
        }
        return this.A01;
    }
}
