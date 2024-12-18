package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.V6k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68018V6k extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ XCU A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68018V6k(Context context, ImageUrl imageUrl, XCU xcu, String str, int i, boolean z) {
        super(68, 1, false, true);
        this.A01 = context;
        this.A02 = imageUrl;
        this.A00 = i;
        this.A05 = z;
        this.A04 = str;
        this.A03 = xcu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        Context context = this.A01;
        DisplayMetrics A0K = AbstractC167007dF.A0K(context);
        int i = A0K.widthPixels / 2;
        int i2 = A0K.heightPixels / 2;
        ImageUrl imageUrl = this.A02;
        if (imageUrl != null) {
            bitmap = C25821No.A00().A0G(imageUrl);
        } else {
            bitmap = null;
        }
        AbstractC70197WGf.A08(AbstractC70197WGf.A01(context, bitmap, i, i2, this.A00, this.A05), this.A03, AbstractC70197WGf.A03(this.A04));
    }
}
