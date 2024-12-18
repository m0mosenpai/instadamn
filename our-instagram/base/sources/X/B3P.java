package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;

/* loaded from: classes4.dex */
public final /* synthetic */ class B3P implements InterfaceC16820sZ {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C8LZ A01;
    public final /* synthetic */ AH3 A02;
    public final /* synthetic */ Integer A03;

    public /* synthetic */ B3P(Bitmap bitmap, C8LZ c8lz, AH3 ah3, Integer num) {
        this.A01 = c8lz;
        this.A02 = ah3;
        this.A03 = num;
        this.A00 = bitmap;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        Bitmap bitmap;
        C8LZ c8lz = this.A01;
        AH3 ah3 = this.A02;
        Integer num = this.A03;
        Bitmap bitmap2 = this.A00;
        if (!ah3.A01()) {
            return null;
        }
        if (num != C05F.A00 && num != C05F.A0N) {
            AH4 ah4 = (AH4) AH4.A02.getValue();
            Bitmap bitmap3 = ah4.A00;
            ah4.A00 = null;
            return bitmap3;
        }
        try {
            C81N c81n = c8lz.A0E;
            int A07 = (int) (AbstractC166987dD.A07(c81n.A05()) * 0.25f);
            int A08 = (int) (0.25f * AbstractC166987dD.A08(c81n.A05()));
            MultiListenerTextureView multiListenerTextureView = c81n.A0D;
            if (multiListenerTextureView != null) {
                bitmap = multiListenerTextureView.getBitmap(A07, A08);
            } else {
                bitmap = null;
            }
            if (bitmap == null) {
                AbstractC12120kG.A01("PhotoViewController#getScaledMediaScreenshot_mediaScreen_is_null", "Could not obtain bitmap from TextureView");
                return null;
            }
            return C8LZ.A00(bitmap, bitmap2, null, c8lz);
        } catch (OutOfMemoryError e) {
            AbstractC12120kG.A0H("PhotoViewController#getScaledMediaScreenshot_OOM", e);
            throw e;
        }
    }
}
