package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.NtL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53948NtL {
    public static final String A00(Bitmap bitmap, UserSession userSession, File file, int i) {
        File A01;
        AbstractC916948n.A0F();
        if (file != null) {
            A01 = MSW.A0w(file, AnonymousClass001.A0e("cover_photo_", ".jpeg", System.currentTimeMillis()));
        } else {
            A01 = AbstractC916948n.A01();
            C14360o3.A0A(A01);
        }
        try {
            FileOutputStream A0x = MSW.A0x(A01);
            try {
                int A07 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36609287619614589L);
                if (A07 == 0) {
                    A07 = C55187Ods.A00(i);
                }
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                C0fK.A01(compressFormat, bitmap, A07);
                if (!bitmap.compress(compressFormat, A07, A0x)) {
                    C0f5 AEp = C18950wb.A01.AEp("bitmap_compress_failed", 817901174);
                    AEp.ABW("format", compressFormat.toString());
                    AEp.ABU("imageQuality", A07);
                    AEp.report();
                }
                String A0i = MSX.A0i(A01);
                A0x.close();
                return A0i;
            } finally {
            }
        } catch (IOException e) {
            C0K8.A0G("VideoCoverFileUtil", "io error", e);
            throw new RuntimeException(e);
        }
    }
}
