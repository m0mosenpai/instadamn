package X;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes10.dex */
public final /* synthetic */ class TVC implements ThreadFactory {
    public final /* synthetic */ String A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ TVC(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.A00;
        boolean z = this.A01;
        byte[] bArr = AbstractC63404SjZ.A07;
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }
}
