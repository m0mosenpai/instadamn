package X;

import java.net.Proxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes10.dex */
public final class SHW {
    public Proxy A00;
    public final ExecutorService A02 = Executors.newFixedThreadPool(2);
    public final SSLSocketFactory A03 = (SSLSocketFactory) SSLSocketFactory.getDefault();
    public final SBV A01 = new SBV(new Object());
}
