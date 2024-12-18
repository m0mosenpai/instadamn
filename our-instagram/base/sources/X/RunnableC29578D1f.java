package X;

import android.graphics.Bitmap;

/* renamed from: X.D1f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC29578D1f implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    public RunnableC29578D1f(Bitmap bitmap, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
        this.A00 = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC16660sJ interfaceC16660sJ = this.A01;
        Bitmap bitmap = this.A00;
        C14360o3.A0A(bitmap);
        interfaceC16660sJ.invoke(bitmap);
    }
}
