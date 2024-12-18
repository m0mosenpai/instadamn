package X;

import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes11.dex */
public final class WZV implements XCA {
    public MediaFormat A00;
    public ArrayList A02;
    public LinkedBlockingQueue A04;
    public volatile boolean A07;
    public CountDownLatch A03 = new CountDownLatch(1);
    public C66029TyR A01 = null;
    public volatile boolean A08 = true;
    public LinkedBlockingQueue A05 = new LinkedBlockingQueue();
    public LinkedBlockingQueue A06 = new LinkedBlockingQueue();

    @Override // X.XCA
    public final InterfaceC71997XEl AM0() {
        this.A04 = new LinkedBlockingQueue();
        return new WZR(this);
    }

    @Override // X.XCA
    public final InterfaceC72004XEs AM8() {
        return new WZT(this);
    }
}
