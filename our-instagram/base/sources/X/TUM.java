package X;

import com.instagram.analytics.analytics2.IgAnalytics2TaskBasedUploader;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class TUM implements Callable {
    public final /* synthetic */ C89103yC A00;
    public final /* synthetic */ C89093yB A01;
    public final /* synthetic */ IgAnalytics2TaskBasedUploader A02;

    public TUM(C89103yC c89103yC, C89093yB c89093yB, IgAnalytics2TaskBasedUploader igAnalytics2TaskBasedUploader) {
        this.A02 = igAnalytics2TaskBasedUploader;
        this.A01 = c89093yB;
        this.A00 = c89103yC;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        try {
            AtomicInteger atomicInteger = IgAnalytics2TaskBasedUploader.A01;
            int i = atomicInteger.get();
            AtomicInteger atomicInteger2 = IgAnalytics2TaskBasedUploader.A02;
            if (i <= atomicInteger2.get()) {
                return this.A02.A00(this.A01, 0, 0);
            }
            C0K8.A0P("IgAnalytics2TaskBasedUploader", "Rejecting upload callback. %d requests started out of %d", Integer.valueOf(atomicInteger.get()), Integer.valueOf(atomicInteger2.get()));
            throw MSW.A0y("Too many concurrent requests");
        } catch (IOException e) {
            this.A00.A00(e);
            throw e;
        }
    }
}
