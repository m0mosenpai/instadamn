package X;

import android.graphics.Bitmap;

/* renamed from: X.Lse, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49406Lse implements InterfaceC80653iu {
    public final /* synthetic */ C147326kI A00;

    public C49406Lse(C147326kI c147326kI) {
        this.A00 = c147326kI;
    }

    @Override // X.InterfaceC80653iu
    public final /* synthetic */ void DFp() {
    }

    @Override // X.InterfaceC80653iu
    public final void DPX(C73083Pj c73083Pj) {
        C14360o3.A0B(c73083Pj, 0);
        Bitmap bitmap = c73083Pj.A02;
        C147326kI c147326kI = this.A00;
        if (bitmap == null) {
            c147326kI.A00();
            return;
        }
        Runnable runnable = c147326kI.A06;
        if (runnable == null) {
            return;
        }
        runnable.run();
        c147326kI.A06 = null;
    }
}
