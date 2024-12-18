package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.XPc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class HandlerC72130XPc extends Handler {
    public final /* synthetic */ Y9I A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC72130XPc(Looper looper, Y9I y9i) {
        super(looper);
        this.A00 = y9i;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.3xs, java.lang.Object] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) message.obj;
            Y9I y9i = this.A00;
            XRZ xrz = new XRZ(y9i.A03, byteArrayOutputStream);
            InterfaceC38001pk interfaceC38001pk = y9i.A05;
            Integer num = y9i.A04.A04;
            Iterator it = Collections.singletonList(xrz).iterator();
            C88923xt c88923xt = new C88923xt(new Object(), interfaceC38001pk, y9i.A06, y9i.A07, num, it);
            while (c88923xt.A00.hasNext()) {
                c88923xt.A00();
            }
            return;
        }
        throw AbstractC25230BEn.A0n("Unknown what=", i);
    }
}
