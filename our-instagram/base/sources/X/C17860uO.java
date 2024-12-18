package X;

import android.os.Handler;

/* renamed from: X.0uO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17860uO implements InterfaceC17710u8 {
    public InterfaceC17700u7 A00;
    public final Handler A01;
    public final Runnable A02 = new Runnable() { // from class: X.0rX
        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC17700u7 interfaceC17700u7 = C17860uO.this.A00;
            if (interfaceC17700u7 != null) {
                interfaceC17700u7.E28(3);
            }
        }
    };

    @Override // X.InterfaceC17710u8
    public final void AWP() {
        InterfaceC17700u7 interfaceC17700u7 = this.A00;
        if (interfaceC17700u7 != null) {
            interfaceC17700u7.E28(3);
        }
    }

    @Override // X.InterfaceC17710u8
    public final void EfQ(InterfaceC17700u7 interfaceC17700u7) {
        this.A00 = interfaceC17700u7;
    }

    public C17860uO(Handler handler) {
        this.A01 = handler;
    }

    @Override // X.InterfaceC17710u8
    public final void EIx() {
        throw C00O.createAndThrow();
    }
}
