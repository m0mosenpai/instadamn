package X;

import android.content.Context;

/* renamed from: X.TPe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64673TPe implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C63380Siu A01;
    public final /* synthetic */ Integer A02;

    public RunnableC64673TPe(Context context, C63380Siu c63380Siu, Integer num) {
        this.A01 = c63380Siu;
        this.A00 = context;
        this.A02 = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C63380Siu c63380Siu = this.A01;
        C07X A00 = C63380Siu.A00(c63380Siu);
        if (c63380Siu.A01 != null && A00 != null) {
            C62694SMi c62694SMi = c63380Siu.A08;
            if (c62694SMi == null) {
                c62694SMi = new C62694SMi(this.A00, A00, c63380Siu.A0Q);
                c63380Siu.A08 = c62694SMi;
            }
            C2GS A002 = c62694SMi.A00();
            A002.A08(c63380Siu.A01);
            A002.A06(A00, c63380Siu.A01);
            c63380Siu.A0Q.A02.A02(this.A02, null, "setViewModelCardObserverEnd", 772805399);
        }
    }
}
