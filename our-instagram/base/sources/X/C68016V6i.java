package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;

/* renamed from: X.V6i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68016V6i extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Bitmap A02;
    public final /* synthetic */ XCU A03;
    public final /* synthetic */ String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68016V6i(Context context, Bitmap bitmap, XCU xcu, String str, int i) {
        super(68, 1, false, true);
        this.A01 = context;
        this.A02 = bitmap;
        this.A00 = i;
        this.A04 = str;
        this.A03 = xcu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A01;
        DisplayMetrics A0K = AbstractC167007dF.A0K(context);
        AbstractC70197WGf.A08(AbstractC70197WGf.A01(context, this.A02, A0K.widthPixels / 2, A0K.heightPixels / 2, this.A00, false), this.A03, AbstractC70197WGf.A03(this.A04));
    }
}
