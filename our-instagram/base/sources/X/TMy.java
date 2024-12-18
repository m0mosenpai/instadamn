package X;

import java.io.InputStream;

/* loaded from: classes10.dex */
public final class TMy implements Runnable {
    public final /* synthetic */ C58681Pzu A00;
    public final /* synthetic */ InputStream A01;

    public TMy(C58681Pzu c58681Pzu, InputStream inputStream) {
        this.A00 = c58681Pzu;
        this.A01 = inputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00(new Q07(), AbstractC38581qm.A00(AbstractC58320PtC.A0h(this.A01)), C16930sl.A00);
    }
}
