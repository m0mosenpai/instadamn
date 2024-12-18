package X;

import android.graphics.Bitmap;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.IpN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42361IpN implements InterfaceC59142nF {
    public final /* synthetic */ JM0 A00;

    public C42361IpN(JM0 jm0) {
        this.A00 = jm0;
    }

    @Override // X.InterfaceC59142nF
    public final Bitmap renderImage(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        try {
            JM0 jm0 = this.A00;
            Integer Bzt = jm0.Bzt();
            if (Bzt != null) {
                int intValue = Bzt.intValue();
                Integer Bzv = jm0.Bzv();
                if (Bzv != null) {
                    int intValue2 = Bzv.intValue();
                    Integer CHg = jm0.CHg();
                    if (CHg != null) {
                        int intValue3 = CHg.intValue();
                        Integer BDS = jm0.BDS();
                        if (BDS != null) {
                            int intValue4 = BDS.intValue();
                            C0fK.A03(bitmap);
                            return Bitmap.createBitmap(bitmap, intValue, intValue2, intValue3, intValue4);
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        } catch (IllegalArgumentException unused) {
            JM0 jm02 = this.A00;
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Passed Arguments: %d, %d, %d, %d, %d, %d.", jm02.Bzt(), jm02.Bzv(), jm02.CHg(), jm02.BDS(), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
            C14360o3.A07(formatStrLocaleSafe);
            C0w9.A03("StoryImageCropOptimization#createBitmapWithCroppingValues", formatStrLocaleSafe);
            return bitmap;
        }
    }
}
