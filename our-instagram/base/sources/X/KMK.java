package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes8.dex */
public final class KMK extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC50449MPd A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ int[] A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMK(Context context, InterfaceC50449MPd interfaceC50449MPd, Integer num, int[] iArr) {
        super(89, 3, false, false);
        this.A00 = context;
        this.A02 = num;
        this.A03 = iArr;
        this.A01 = interfaceC50449MPd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00;
        int A01 = AbstractC188878Yd.A01(context);
        int A00 = AbstractC188878Yd.A00(context);
        String A0e = AnonymousClass001.A0e("share_sticker_", ".jpg", System.currentTimeMillis());
        String A02 = C50472Tr.A02(context, false);
        AbstractC166987dD.A11(A02).mkdirs();
        File file = new File(A02, A0e);
        Bitmap A0F = AbstractC167007dF.A0F(A01, A00);
        Canvas A06 = AbstractC43592JPx.A06(A0F);
        Paint A0S = AbstractC166987dD.A0S(4);
        Integer num = this.A02;
        int[] iArr = this.A03;
        float f = A00;
        float f2 = 0.0f;
        if (num.intValue() != 0) {
            f2 = A01;
        }
        A0S.setShader(new LinearGradient(0.0f, 0.0f, f2, f, iArr, (float[]) null, Shader.TileMode.CLAMP));
        A06.drawPaint(A0S);
        try {
            AbstractC50673MYr.A00(Bitmap.CompressFormat.JPEG, A0F, new FileOutputStream(file));
            this.A01.Dq9(file);
        } catch (Exception e) {
            AbstractC12120kG.A0I("unable to create sticker background input file", e, AbstractC06930Yk.A0E());
            C11T.A02(new M3S(this.A01, e));
        }
    }
}
