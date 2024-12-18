package X;

import com.facebook.rsys.networkinfo.gen.NetworkInfoCallback;
import java.util.HashMap;
import java.util.TimerTask;

/* loaded from: classes12.dex */
public final class YKS extends TimerTask {
    public final /* synthetic */ YA4 A00;

    public YKS(YA4 ya4) {
        this.A00 = ya4;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        YA4 ya4 = this.A00;
        NetworkInfoCallback networkInfoCallback = ya4.A06;
        if (networkInfoCallback != null) {
            synchronized (ya4) {
                HashMap hashMap = ya4.A0C;
                hashMap.clear();
                if (ya4.A0E && YA4.A02(ya4, hashMap)) {
                    networkInfoCallback.onUpdateRadioSignals(1, hashMap);
                }
            }
        }
    }
}
