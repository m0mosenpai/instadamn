package X;

import com.facebook.advancedcryptotransport.MNSStreamThread;

/* loaded from: classes4.dex */
public final class B4d extends Thread {
    public final /* synthetic */ long A00;
    public final /* synthetic */ MNSStreamThread A01;

    public B4d(MNSStreamThread mNSStreamThread, long j) {
        this.A01 = mNSStreamThread;
        this.A00 = j;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        MNSStreamThread.nativeMNSStreamThreadRun(this.A00);
    }
}
