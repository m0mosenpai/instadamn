package X;

import android.os.Handler;
import android.os.Process;

/* loaded from: classes8.dex */
public final class JQB implements Runnable {
    public final /* synthetic */ JQ6 A00;

    public JQB(JQ6 jq6) {
        this.A00 = jq6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JQ6 jq6 = this.A00;
        Process.setThreadPriority(jq6.A02);
        jq6.A00 = true;
        ((Handler) jq6.A04.getValue()).postDelayed(this, jq6.A03);
    }
}
