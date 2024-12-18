package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrlBase;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class BNM {
    public static final ImageUrlBase A00(Context context, C38321qM c38321qM) {
        List BzD;
        C14360o3.A0B(c38321qM, 0);
        ImageInfo BGx = c38321qM.A0C.BGx();
        if (BGx != null && (BzD = BGx.BzD()) != null && AbstractC166987dD.A1b(BzD)) {
            return AbstractC47069KrQ.A00((ExtendedImageUrl) BzD.get(0));
        }
        ExtendedImageUrl A1q = c38321qM.A1q(context);
        if (A1q != null) {
            return A1q;
        }
        return c38321qM.A1n();
    }
}
