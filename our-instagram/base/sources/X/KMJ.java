package X;

import android.content.Context;
import com.instagram.creation.capture.MediaCaptureFragment;

/* loaded from: classes8.dex */
public final class KMJ extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C196748n4 A01;
    public final /* synthetic */ MediaCaptureFragment A02;
    public final /* synthetic */ byte[] A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMJ(Context context, C196748n4 c196748n4, MediaCaptureFragment mediaCaptureFragment, byte[] bArr) {
        super(76, 4, false, false);
        this.A02 = mediaCaptureFragment;
        this.A00 = context;
        this.A03 = bArr;
        this.A01 = c196748n4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C50692MZl c50692MZl = this.A02.A02;
        if (c50692MZl != null) {
            c50692MZl.A00(this.A00, this.A01, this.A03);
        }
    }
}
