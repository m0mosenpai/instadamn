package X;

import android.content.Context;
import android.provider.MediaStore;

/* renamed from: X.8Z7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8Z7 extends AbstractRunnableC14200nk {
    public final /* synthetic */ C189088Yy A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8Z7(C189088Yy c189088Yy) {
        super(519843181, 2, false, false);
        this.A00 = c189088Yy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C189088Yy c189088Yy = this.A00;
        C189088Yy.A00(c189088Yy);
        Context context = c189088Yy.A06;
        context.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, false, c189088Yy.A07);
        context.getContentResolver().registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, false, c189088Yy.A08);
        c189088Yy.A05 = true;
    }
}
