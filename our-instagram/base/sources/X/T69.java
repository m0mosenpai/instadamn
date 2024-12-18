package X;

import android.content.Context;

/* loaded from: classes10.dex */
public final class T69 implements InterfaceC65260Tgq {
    public InterfaceC65438TkA A00;
    public final AbstractC61298RlI A01;
    public final InterfaceC65438TkA A02;

    public T69(Context context, AbstractC61298RlI abstractC61298RlI) {
        this.A01 = abstractC61298RlI;
        T42 t42 = T42.A01;
        T43.A01(context);
        final T40 A02 = T43.A00().A02(t42);
        if (T42.A03.contains(new SOM("json"))) {
            this.A00 = new TE8(new InterfaceC65438TkA() { // from class: X.TDx
                @Override // X.InterfaceC65438TkA
                public final Object get() {
                    return InterfaceC65395TjS.this.CAn(new SOM("json"), C64205T3u.A00, byte[].class, "FIREBASE_ML_SDK");
                }
            });
        }
        this.A02 = new TE8(new InterfaceC65438TkA() { // from class: X.TDy
            @Override // X.InterfaceC65438TkA
            public final Object get() {
                return InterfaceC65395TjS.this.CAn(new SOM("proto"), C64204T3t.A00, byte[].class, "FIREBASE_ML_SDK");
            }
        });
    }
}
