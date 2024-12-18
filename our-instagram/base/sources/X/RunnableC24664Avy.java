package X;

import android.graphics.Bitmap;

/* renamed from: X.Avy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24664Avy implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ InterfaceC25187BCk A01;

    public RunnableC24664Avy(Bitmap bitmap, InterfaceC25187BCk interfaceC25187BCk) {
        this.A00 = bitmap;
        this.A01 = interfaceC25187BCk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap = this.A00;
        InterfaceC25187BCk interfaceC25187BCk = this.A01;
        if (bitmap != null) {
            interfaceC25187BCk.DIS(bitmap);
        } else {
            interfaceC25187BCk.DIT();
        }
    }
}
