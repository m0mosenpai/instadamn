package X;

import android.content.Context;

/* loaded from: classes8.dex */
public final class KMA extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C2n2 A01;
    public final /* synthetic */ C44272JhO A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMA(Context context, C2n2 c2n2, C44272JhO c44272JhO) {
        super(600);
        this.A02 = c44272JhO;
        this.A00 = context;
        this.A01 = c2n2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00;
        C2n2 c2n2 = this.A01;
        boolean z = true;
        if (context.getExternalFilesDir(null) == null) {
            z = false;
        }
        c2n2.apply(Boolean.valueOf(z));
    }
}
