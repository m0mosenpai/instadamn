package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public final class V6S extends AbstractRunnableC14200nk {
    public final /* synthetic */ C69018Vfu A00;
    public final /* synthetic */ C70907WkA A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6S(C69018Vfu c69018Vfu, C70907WkA c70907WkA) {
        super(153, 4, false, false);
        this.A01 = c70907WkA;
        this.A00 = c69018Vfu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A01.A00.A00.A00.edit().putString("operations", AbstractC69964Vyf.A00(this.A00)).commit();
        } catch (IOException e) {
            C0w9.A07("ViewStateModStore", e);
        }
    }
}
