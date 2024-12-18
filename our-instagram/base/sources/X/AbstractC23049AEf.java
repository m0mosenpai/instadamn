package X;

import android.media.MediaMetadataRetriever;
import android.opengl.Matrix;
import com.facebook.common.math.matrix.Matrix4;

/* renamed from: X.AEf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23049AEf {
    public static final void A00(C199758sR c199758sR, C199758sR c199758sR2, Matrix4 matrix4, C5NO c5no) {
        AbstractC167007dF.A1E(c5no, 0, matrix4);
        Matrix.setIdentityM(matrix4.A01, 0);
        float f = (c5no.A0A / c5no.A08) / (c5no.A02 / c5no.A07);
        float f2 = c199758sR2.A01 / c199758sR2.A00;
        if (AbstractC166987dD.A01(f, f2) > 0.01f) {
            matrix4.A01(-c5no.A09);
            matrix4.A02(1.0f, f2 / f);
            matrix4.A01(c5no.A09);
        }
        matrix4.A02(1.0f, -1.0f);
        matrix4.A03((c5no.A03 * 2.0f) - 1.0f, (c5no.A05 * 2.0f) - 1.0f, 0.0f);
        float f3 = c199758sR.A00 / c199758sR.A01;
        matrix4.A02(f3, 1.0f);
        matrix4.A01(c5no.A09);
        matrix4.A02(1.0f / f3, 1.0f);
        matrix4.A02(c5no.A08, c5no.A07);
    }

    public static final void A01(C199758sR c199758sR, Matrix4 matrix4, C210399Se c210399Se) {
        C14360o3.A0B(c210399Se, 0);
        EnumC222939sY enumC222939sY = c210399Se.A04;
        boolean z = true;
        boolean A1X = AbstractC167007dF.A1X(enumC222939sY, EnumC222939sY.A05);
        if (enumC222939sY != EnumC222939sY.A08) {
            z = false;
        }
        if (A1X || z) {
            String str = c210399Se.A0B.A0X;
            C14360o3.A0B(str, 0);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            if (extractMetadata != null) {
                int parseInt = Integer.parseInt(extractMetadata);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                if (extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata2);
                    mediaMetadataRetriever.release();
                    int i = c199758sR.A01;
                    int i2 = c199758sR.A00;
                    if (z) {
                        i2 /= 2;
                    }
                    float f = parseInt;
                    float f2 = parseInt2;
                    float f3 = f / f2;
                    float f4 = i;
                    float f5 = i2;
                    float f6 = f4 / f5;
                    if (f3 > f6) {
                        matrix4.A02((f3 * f5) / f4, 1.0f);
                        return;
                    } else {
                        if (f3 >= f6) {
                            return;
                        }
                        matrix4.A02(1.0f, ((f2 / f) * f4) / f5);
                        return;
                    }
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }
}
