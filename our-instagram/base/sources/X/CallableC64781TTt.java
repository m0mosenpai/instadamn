package X;

import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import java.util.concurrent.Callable;

/* renamed from: X.TTt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC64781TTt implements Callable {
    public final /* synthetic */ C63Q A00;

    public CallableC64781TTt(C63Q c63q) {
        this.A00 = c63q;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C63Q c63q = this.A00;
        try {
            C1LN.A01(AnonymousClass001.A0T("BloksComponentQueryDiskCache", QuickExperimentDumperPlugin.CLEAR_CMD, ':'));
            c63q.A01.A00.removeAll();
            C63Q.A00(c63q, AbstractC06930Yk.A0E());
            C1LN.A00();
            return C0eB.A00;
        } catch (Throwable th) {
            C1LN.A00();
            throw th;
        }
    }
}
