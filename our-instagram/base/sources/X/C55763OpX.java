package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.OpX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55763OpX implements XC9 {
    public final /* synthetic */ OFH A00;

    public C55763OpX(OFH ofh) {
        this.A00 = ofh;
    }

    @Override // X.XC9
    public final C1VO ChT(Context context, android.net.Uri uri) {
        Bitmap bitmap = this.A00.A04;
        C1VO A00 = C1VO.A00(C1VO.A05, C55635OnK.A00, bitmap);
        C14360o3.A07(A00);
        return A00;
    }

    @Override // X.XC9
    public final C1VO ChU(Context context, android.net.Uri uri, CallerContext callerContext) {
        Bitmap bitmap = this.A00.A04;
        C1VO A00 = C1VO.A00(C1VO.A05, C55636OnL.A00, bitmap);
        C14360o3.A07(A00);
        return A00;
    }
}
