package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.drawee.backends.pipeline.Fresco;

/* renamed from: X.WYg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70475WYg implements XC9 {
    @Override // X.XC9
    public final C1VO ChT(Context context, android.net.Uri uri) {
        boolean A1W;
        android.net.Uri A03 = AbstractC08820cl.A03(uri.toString());
        A03.getClass();
        AbstractC47962LHi.A01(A03);
        AbstractC46556Kiv.A00(A03);
        AbstractC47962LHi.A00(A03);
        if (context != null) {
            synchronized (C70084W2f.class) {
                A1W = AbstractC167007dF.A1W(C70084W2f.A04);
            }
            if (!A1W) {
                C70084W2f.A00(context);
            }
        }
        Fresco.getImagePipeline();
        throw new NullPointerException("fetchDecodedImage");
    }

    @Override // X.XC9
    public final C1VO ChU(Context context, android.net.Uri uri, CallerContext callerContext) {
        boolean A1W;
        android.net.Uri A03 = AbstractC08820cl.A03(uri.toString());
        A03.getClass();
        AbstractC47962LHi.A01(A03);
        AbstractC46556Kiv.A00(A03);
        AbstractC47962LHi.A00(A03);
        if (context != null) {
            synchronized (C70084W2f.class) {
                A1W = AbstractC167007dF.A1W(C70084W2f.A04);
            }
            if (!A1W) {
                C70084W2f.A00(context);
            }
        }
        Fresco.getImagePipeline();
        throw new NullPointerException("fetchDecodedImage");
    }
}
