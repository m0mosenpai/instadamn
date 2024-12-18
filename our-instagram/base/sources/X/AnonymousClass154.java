package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.154, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass154 {
    public static AnonymousClass154 A01;
    public final Handler A00;

    public AnonymousClass154(final Looper looper, final AnonymousClass157 anonymousClass157, final AnonymousClass155 anonymousClass155) {
        this.A00 = new Handler(looper, anonymousClass157, anonymousClass155) { // from class: X.158
            public AnonymousClass155 A00;
            public final AnonymousClass157 A01;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                AnonymousClass157 anonymousClass1572;
                Object obj = message.obj;
                if (obj instanceof InterfaceC219914z) {
                    InterfaceC219914z interfaceC219914z = (InterfaceC219914z) obj;
                    try {
                        if (interfaceC219914z.EE7(true) && (anonymousClass1572 = this.A01) != null) {
                            anonymousClass1572.A00(interfaceC219914z, message.arg1, message.arg2, true);
                        }
                    } catch (Error | Exception e) {
                        this.A00.A04(interfaceC219914z, e);
                    }
                }
            }

            {
                this.A00 = anonymousClass155;
                this.A01 = anonymousClass157;
            }
        };
    }
}
