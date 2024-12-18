package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class TUN implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C53532cb A02;
    public final /* synthetic */ String A03;

    public TUN(Context context, C53532cb c53532cb, String str, int i) {
        this.A03 = str;
        this.A01 = context;
        this.A02 = c53532cb;
        this.A00 = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return SV1.A00(this.A01, this.A02, this.A03, this.A00);
    }
}
