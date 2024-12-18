package X;

import android.app.Application;
import com.meta.metaai.imagine.creation.impl.data.EmuFlashRepository;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.OJq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54797OJq {
    public final Application A01;
    public final EmuFlashRepository A02;
    public final ConcurrentLinkedQueue A04;
    public final C19L A05;
    public final C05A A06;
    public final C0UO A07;
    public final C28283CdV A08;
    public final ImagineNetworkService A09;
    public final O9T A03 = new O9T();
    public int A00 = C17s.A04(AbstractC50712Us.A00, C17s.A0C(0, Integer.MAX_VALUE));

    public final void A00() {
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.A04;
            if (AbstractC25226BEj.A1b(concurrentLinkedQueue)) {
                ((AnonymousClass195) concurrentLinkedQueue.remove()).AGH(null);
            } else {
                this.A00 = C17s.A04(AbstractC50712Us.A00, C17s.A0C(0, Integer.MAX_VALUE));
                this.A06.Egh(null);
                this.A02.A02.A00.evictAll();
                return;
            }
        }
    }

    public C54797OJq(Application application, C28283CdV c28283CdV, C7N c7n, ImagineNetworkService imagineNetworkService, C19L c19l) {
        this.A01 = application;
        this.A09 = imagineNetworkService;
        this.A05 = c19l;
        this.A08 = c28283CdV;
        this.A02 = new EmuFlashRepository(application, c28283CdV, c7n, imagineNetworkService);
        C008002u A00 = C10E.A00(null);
        this.A06 = A00;
        this.A07 = A00;
        this.A04 = new ConcurrentLinkedQueue();
    }
}
