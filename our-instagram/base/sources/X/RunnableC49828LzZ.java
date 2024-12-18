package X;

import android.os.Process;

/* renamed from: X.LzZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49828LzZ implements Runnable {
    public final /* synthetic */ JQ6 A00;

    public RunnableC49828LzZ(JQ6 jq6) {
        this.A00 = jq6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JQ6 jq6 = this.A00;
        Process.setThreadPriority(jq6.A01);
        jq6.A00 = false;
    }
}
