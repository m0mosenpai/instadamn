package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import java.io.File;

/* renamed from: X.AeJ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23684AeJ implements XCU, BC3 {
    public final C1828789i A00;
    public final Context A01;
    public final ImageInfo A02;

    @Override // X.BC3
    public final void ALh(BE6 be6) {
        Context context = this.A01;
        ExtendedImageUrl A01 = AbstractC40161tk.A01(context, this.A02);
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.model.mediasize.ExtendedImageUrl");
        AbstractC70197WGf.A05(context, A01, this, C50472Tr.A02(context, false), context.getColor(R.color.badge_color), false);
    }

    @Override // X.XCU
    public final void onFailure(Exception exc) {
    }

    @Override // X.XCU
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        File file = (File) obj;
        C14360o3.A0B(file, 0);
        this.A00.A01(C8IU.A03(file, 1, 0));
    }

    public C23684AeJ(Context context, C1828789i c1828789i, ImageInfo imageInfo) {
        AbstractC167017dG.A1Q(context, c1828789i);
        this.A01 = context;
        this.A02 = imageInfo;
        this.A00 = c1828789i;
    }
}
