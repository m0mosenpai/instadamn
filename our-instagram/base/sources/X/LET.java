package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class LET {
    public final AtomicBoolean A00 = AbstractC166997dE.A17();
    public final /* synthetic */ C7UY A01;
    public final /* synthetic */ Integer A02;

    public LET(C7UY c7uy, Integer num) {
        this.A01 = c7uy;
        this.A02 = num;
    }

    public static final void A00(LET let, String str) {
        String str2;
        if (!let.A00.getAndSet(true)) {
            C006802i c006802i = let.A01.A01;
            if (let.A02.intValue() != 0) {
                str2 = "assets_download";
            } else {
                str2 = "artefacts_request";
            }
            c006802i.markerPoint(125763585, AnonymousClass001.A0R(str2, "_end"), AbstractC25228BEl.A1A(str));
        }
    }
}
