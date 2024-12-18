package X;

import com.fbpay.ptt.impl.javacpp.PttImpl;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class SMG {
    public final /* synthetic */ InterfaceC65388TjL A00;
    public final /* synthetic */ SZ5 A01;
    public final /* synthetic */ PttImpl A02;
    public final /* synthetic */ Executor A03;

    public final void A00(Throwable th, Map map) {
        Executor executor;
        Runnable tr4;
        if (th == null) {
            executor = this.A01.A01;
            tr4 = new TOM(this, map);
        } else {
            SZ5 sz5 = this.A01;
            InterfaceC65388TjL interfaceC65388TjL = this.A00;
            executor = this.A03;
            tr4 = new TR4(interfaceC65388TjL, sz5, null, null, th);
        }
        executor.execute(tr4);
    }

    public SMG(InterfaceC65388TjL interfaceC65388TjL, SZ5 sz5, PttImpl pttImpl, Executor executor) {
        this.A01 = sz5;
        this.A02 = pttImpl;
        this.A00 = interfaceC65388TjL;
        this.A03 = executor;
    }
}
