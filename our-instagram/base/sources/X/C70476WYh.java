package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.WYh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70476WYh implements XC9 {
    public static final C1VS A00 = new C70416WUu(1);

    @Override // X.XC9
    public final C1VO ChT(Context context, android.net.Uri uri) {
        Bitmap createBitmap = Bitmap.createBitmap(4, 4, Bitmap.Config.ARGB_8888);
        return C1VO.A00(C1VO.A05, A00, createBitmap);
    }

    @Override // X.XC9
    public final C1VO ChU(Context context, android.net.Uri uri, CallerContext callerContext) {
        return ChT(context, uri);
    }
}
