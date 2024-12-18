package X;

import android.graphics.Bitmap;

/* renamed from: X.9in, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216929in extends AbstractRunnableC14200nk {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C8HO A01;

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            this.A01.A00.A1B.A00().FB2(bitmap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C216929in(Bitmap bitmap, C8HO c8ho) {
        super(1073762952);
        this.A01 = c8ho;
        this.A00 = bitmap;
    }
}
