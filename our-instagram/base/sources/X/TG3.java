package X;

import com.instagram.analytics.analytics2.IgAnalytics2TaskBasedUploader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class TG3 implements InterfaceC25601Mq {
    public final /* synthetic */ C89103yC A00;

    public TG3(C89103yC c89103yC) {
        this.A00 = c89103yC;
    }

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        C14360o3.A0B(obj, 0);
        try {
            try {
                AtomicInteger atomicInteger = IgAnalytics2TaskBasedUploader.A01;
                atomicInteger.incrementAndGet();
                C3JY c3jy = (C3JY) new C26561Ql(null).then(obj);
                atomicInteger.decrementAndGet();
                return c3jy;
            } catch (IOException e) {
                this.A00.A00(e);
                throw e;
            }
        } catch (Throwable th) {
            IgAnalytics2TaskBasedUploader.A01.decrementAndGet();
            throw th;
        }
    }
}
