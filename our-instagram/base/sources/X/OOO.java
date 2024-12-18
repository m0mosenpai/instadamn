package X;

import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.model.mediatype.ProductType;
import java.util.List;

/* loaded from: classes9.dex */
public final class OOO {
    public static final C75363a3 A00(C51600Mqs c51600Mqs, ProductType productType, String str, String str2, boolean z) {
        List list;
        Integer num;
        VideoUrlImpl videoUrlImpl;
        MVC mvc = c51600Mqs.A02;
        String str3 = null;
        boolean z2 = false;
        if (mvc != null) {
            list = AbstractC166987dD.A1J(new VideoUrlImpl(mvc.A03, mvc.A01, mvc.A00, AbstractC31177DnL.A03((Number) mvc.A02), str));
        } else {
            list = null;
        }
        String str4 = c51600Mqs.A03;
        boolean A1W = AbstractC167007dF.A1W(str4);
        if (z) {
            num = C05F.A0N;
            if (list != null && (videoUrlImpl = (VideoUrlImpl) AbstractC001800i.A0J(list)) != null) {
                str3 = videoUrlImpl.A06;
            }
        } else {
            num = C05F.A00;
        }
        C14360o3.A0B(str, 2);
        Integer valueOf = Integer.valueOf(A1W ? 1 : 0);
        if ((str3 != null && str3.length() != 0) || ((list != null && !list.isEmpty()) || (str4 != null && str4.length() != 0))) {
            z2 = true;
        }
        return new C75363a3(null, productType, null, null, null, num, valueOf, str, str2, str3, str4, null, null, null, null, null, list, null, null, -1, -1, -1L, false, false, false, false, false, false, z2, false);
    }
}
