package X;

import android.content.Context;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: X.ADh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23025ADh {
    public static final Callable A00(Context context, Medium medium, UserSession userSession, CameraSpec cameraSpec, C49602Pt c49602Pt, String str, boolean z) {
        C18950wb c18950wb;
        String str2;
        if (medium.Cff()) {
            return new CallableC209459Oe(context, medium, userSession, false);
        }
        if (!medium.A05()) {
            return null;
        }
        if (c49602Pt == null) {
            c18950wb = C18950wb.A01;
            str2 = "ClipsVideoImportUtil clipsDirectoryProvider is null when importing photo media";
        } else if (str == null) {
            c18950wb = C18950wb.A01;
            str2 = "ClipsVideoImportUtil sessionId is null when importing photo media";
        } else if (cameraSpec == null) {
            c18950wb = C18950wb.A01;
            str2 = "ClipsVideoImportUtil cameraSpec is null when importing photo media";
        } else {
            try {
                String canonicalPath = AMc.A03(c49602Pt, str, ".mp4", "photo_import").getCanonicalPath();
                C14360o3.A07(canonicalPath);
                return new PUS(medium, userSession, cameraSpec, canonicalPath, 2, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, false, z);
            } catch (IOException unused) {
                c18950wb = C18950wb.A01;
                str2 = "ClipsVideoImportUtil IOException -- source video file creation failed for photo media";
            } catch (IllegalStateException unused2) {
                c18950wb = C18950wb.A01;
                str2 = "ClipsVideoImportUtil IllegalStateException -- source video file creation failed for photo media";
            }
        }
        AbstractC166987dD.A1T(c18950wb, str2, 817897258);
        return null;
    }

    public static final void A01(Context context, Medium medium, UserSession userSession, C2AH c2ah, CameraSpec cameraSpec, C49602Pt c49602Pt, String str, boolean z) {
        C14360o3.A0B(medium, 0);
        Callable A00 = A00(context, medium, userSession, cameraSpec, c49602Pt, str, z);
        if (A00 == null) {
            c2ah.onFail(new Exception());
            return;
        }
        C121275eQ c121275eQ = new C121275eQ(A00, 459);
        c121275eQ.A00 = c2ah;
        C1GJ.A03(c121275eQ);
    }
}
