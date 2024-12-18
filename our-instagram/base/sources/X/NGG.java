package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.instagram.common.session.UserSession;
import com.instagram.pdqhashing.PDQHashingBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class NGG extends AbstractRunnableC14200nk {
    public final /* synthetic */ OU8 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NGG(OU8 ou8) {
        super(441, 3, false, false);
        this.A00 = ou8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        String str;
        Bitmap decodeFile;
        OU8 ou8 = this.A00;
        C18920wW c18920wW = ou8.A00;
        C47Z c47z = ou8.A03;
        String str2 = c47z.A3t;
        UserSession userSession = ou8.A01;
        String str3 = userSession.userId;
        Integer num = C05F.A0u;
        Integer num2 = C05F.A00;
        AbstractC54089Nvn.A00(c18920wW, num, num2, str2, str3, null);
        String str4 = c47z.A3K;
        if (str4 == null && (str = c47z.A3L) != null && (decodeFile = BitmapFactory.decodeFile(str)) != null) {
            file = MSW.A0w(AbstractC916948n.A06(), AnonymousClass001.A0e("original_frame_capture_", ".jpeg", System.currentTimeMillis()));
            try {
                FileOutputStream A0x = MSW.A0x(file);
                try {
                    AbstractC50673MYr.A00(Bitmap.CompressFormat.JPEG, decodeFile, A0x);
                    str4 = file.getCanonicalPath();
                    A0x.close();
                } finally {
                }
            } catch (IOException unused) {
            }
        } else {
            file = null;
        }
        if (str4 != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            try {
                C54073NvX c54073NvX = PDQHashingBridge.Companion;
                PDQHashingBridge pDQHashingBridge = new PDQHashingBridge("pdqhashing");
                C54599OAa c54599OAa = new C54599OAa(0L, str4);
                c54599OAa.A00 = pDQHashingBridge.getHashWithQuality(c54599OAa.A02, 0, null);
                A1E.add(c54599OAa);
                AbstractC54089Nvn.A00(c18920wW, C05F.A1F, num2, c47z.A3t, userSession.userId, null);
                OU8.A00(ou8, A1E, AbstractC166987dD.A1E());
            } catch (Exception | OutOfMemoryError e) {
                AbstractC54089Nvn.A00(c18920wW, C05F.A0C, num2, c47z.A3t, userSession.userId, "hash_calc_error");
                C0w9.A07("video_pdq_report_hash_calculation_error", e);
            }
        } else {
            AbstractC54089Nvn.A00(c18920wW, C05F.A0N, num2, c47z.A3t, userSession.userId, "null_image_file");
        }
        C0w9.A03("video_pdq_report_null_image_file_error", "null_image_file");
        if (file != null) {
            file.delete();
        }
    }
}
