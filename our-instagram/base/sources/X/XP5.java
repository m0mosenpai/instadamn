package X;

import java.util.concurrent.Future;

/* loaded from: classes12.dex */
public final class XP5 implements YNm {
    public final Future A00;

    @Override // X.YNm
    public final boolean cancel() {
        return this.A00.cancel(true);
    }

    public XP5(Future future) {
        this.A00 = future;
    }
}
