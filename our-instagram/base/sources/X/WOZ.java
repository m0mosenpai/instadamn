package X;

import android.webkit.ValueCallback;

/* loaded from: classes11.dex */
public final class WOZ implements ValueCallback {
    public final /* synthetic */ C70090W2m A00;
    public final /* synthetic */ C68899Vdw A01;

    public WOZ(C70090W2m c70090W2m, C68899Vdw c68899Vdw) {
        this.A01 = c68899Vdw;
        this.A00 = c70090W2m;
    }

    @Override // android.webkit.ValueCallback
    public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
        this.A01.A00.put(this.A00.A04, obj);
    }
}
