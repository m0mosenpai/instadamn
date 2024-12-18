package X;

import java.util.Map;

/* renamed from: X.Wwu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71598Wwu implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C70498WZf A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;

    public RunnableC71598Wwu(C70498WZf c70498WZf, String str, Map map, int i) {
        this.A01 = c70498WZf;
        this.A02 = str;
        this.A00 = i;
        this.A03 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A00.D6j(this.A02, this.A00, this.A03);
    }
}
