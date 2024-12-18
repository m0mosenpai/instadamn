package X;

import java.io.File;

/* renamed from: X.M2y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49931M2y implements Runnable {
    public final /* synthetic */ C214899fR A00;
    public final /* synthetic */ File A01;

    public RunnableC49931M2y(C214899fR c214899fR, File file) {
        this.A00 = c214899fR;
        this.A01 = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C214899fR.A00(this.A00, this.A01, "image");
    }
}
