package X;

import android.content.Context;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Iby, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41666Iby {
    public static final C31349DqE A00(Context context, InterfaceC58152PqH interfaceC58152PqH, C41730Ie1 c41730Ie1) {
        ExtendedImageUrl extendedImageUrl;
        ImageInfo imageInfo;
        C14360o3.A0B(c41730Ie1, 1);
        C146106i8 A0K = AbstractC31171DnF.A0K();
        AbstractC25226BEj.A1N(context, A0K, 2131952461);
        A0K.A0L = true;
        A0K.A01 = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
        AbstractC31175DnJ.A0l(context, A0K, 2131974039);
        A0K.A0A = interfaceC58152PqH;
        Product A04 = c41730Ie1.A04();
        if (A04 != null && (imageInfo = A04.A08) != null) {
            extendedImageUrl = AbstractC40161tk.A02(imageInfo);
        } else {
            extendedImageUrl = null;
        }
        if (!AbstractC81033jX.A03(extendedImageUrl)) {
            A0K.A09 = extendedImageUrl;
            A0K.A03();
        }
        C31349DqE A00 = A0K.A00();
        AbstractC166997dE.A1O(C41451vu.A01, A00);
        return A00;
    }

    public static final void A01(Context context) {
        A02(AbstractC166997dE.A0p(context, 2131952365), 0, "add_to_cart_network_error");
    }

    public static final void A02(String str, int i, String str2) {
        AbstractC167017dG.A1O(str, str2);
        C146106i8 A0K = AbstractC31171DnF.A0K();
        A0K.A05();
        A0K.A0H = str2;
        A0K.A0D = str;
        A0K.A02 = i;
        AbstractC31178DnM.A1S(A0K);
    }
}
