package com.facebook.tigon.tigonhuc;

import X.C14360o3;
import java.util.concurrent.Future;

/* loaded from: classes10.dex */
public final class HucRequestToken {
    public final Future future;

    public HucRequestToken(Future future) {
        C14360o3.A0B(future, 1);
        this.future = future;
    }

    public final void cancel() {
        this.future.cancel(true);
    }
}
