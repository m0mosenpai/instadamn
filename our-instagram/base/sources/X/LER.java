package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class LER {
    public final AtomicBoolean A00 = AbstractC166997dE.A17();
    public final /* synthetic */ L7A A01;
    public final /* synthetic */ Integer A02;

    public LER(L7A l7a, Integer num) {
        this.A01 = l7a;
        this.A02 = num;
    }

    public static final void A00(LER ler, String str) {
        String str2;
        if (!ler.A00.getAndSet(true)) {
            C006802i c006802i = ler.A01.A01;
            if (ler.A02.intValue() != 0) {
                str2 = "assets_download";
            } else {
                str2 = "artefacts_request";
            }
            c006802i.markerPoint(1064965959, AnonymousClass001.A0R(str2, "_end"), AbstractC25228BEl.A1A(str));
        }
    }
}
