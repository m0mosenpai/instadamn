package X;

import android.app.Activity;
import android.graphics.Bitmap;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.75X, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75X extends AbstractRunnableC14200nk {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C75W A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75X(Activity activity, C75W c75w, String str) {
        super(693);
        this.A02 = str;
        this.A00 = activity;
        this.A01 = c75w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25821No A00 = C25821No.A00();
        int i = 0;
        do {
            final String str = this.A02;
            final Bitmap A0H = A00.A0H(new SimpleImageUrl(str), "directThreadThemes");
            if (A0H != null && A0H.getByteCount() > 0) {
                Activity activity = this.A00;
                final C75W c75w = this.A01;
                activity.runOnUiThread(new Runnable() { // from class: X.M5O
                    @Override // java.lang.Runnable
                    public final void run() {
                        c75w.Dsl(A0H, str);
                    }
                });
                return;
            }
            i++;
        } while (i < 3);
    }
}
