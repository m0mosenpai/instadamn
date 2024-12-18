package X;

import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.model.mediatype.ProductType;
import java.util.List;

/* renamed from: X.OUl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54999OUl {
    public static final C75363a3 A00(C51600Mqs c51600Mqs, ProductType productType, String str, String str2) {
        List list;
        MVC mvc = c51600Mqs.A02;
        boolean z = false;
        if (mvc != null) {
            list = AbstractC166987dD.A1J(new VideoUrlImpl(mvc.A03, mvc.A01, mvc.A00, AbstractC31177DnL.A03((Number) mvc.A02), str));
        } else {
            list = null;
        }
        String str3 = c51600Mqs.A03;
        boolean A1W = AbstractC167007dF.A1W(str3);
        Integer num = C05F.A00;
        C14360o3.A0B(str, 2);
        Integer valueOf = Integer.valueOf(A1W ? 1 : 0);
        if ((list != null && !list.isEmpty()) || (str3 != null && str3.length() != 0)) {
            z = true;
        }
        return new C75363a3(null, productType, null, null, null, num, valueOf, str, str2, null, str3, null, null, null, null, null, list, null, null, -1, -1, -1L, false, false, false, false, false, false, z, false);
    }

    public final C75363a3 A01(InterfaceC58104PpT interfaceC58104PpT) {
        String str;
        ProductType productType;
        if (interfaceC58104PpT instanceof C51768MuY) {
            C51768MuY c51768MuY = (C51768MuY) interfaceC58104PpT;
            C51600Mqs c51600Mqs = c51768MuY.A02;
            if (c51600Mqs != null) {
                String str2 = c51768MuY.A05;
                int intValue = c51768MuY.A03.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                if (intValue == 4) {
                                    productType = null;
                                } else {
                                    throw B4Z.A00();
                                }
                            } else {
                                productType = ProductType.SIDECAR;
                            }
                        } else {
                            productType = ProductType.IGTV;
                        }
                    } else if (c51768MuY.A04 == C05F.A01) {
                        productType = ProductType.CLIPS;
                    }
                    return A00(c51600Mqs, productType, str2, null);
                }
                productType = ProductType.FEED;
                return A00(c51600Mqs, productType, str2, null);
            }
            throw AbstractC166987dD.A12("Video source cannot be created for non-video content");
        }
        if (interfaceC58104PpT instanceof C51767MuX) {
            C51767MuX c51767MuX = (C51767MuX) interfaceC58104PpT;
            String str3 = c51767MuX.A02;
            C51600Mqs c51600Mqs2 = c51767MuX.A01;
            ProductType productType2 = ProductType.FACEBOOK_VIDEO;
            QIj qIj = (QIj) AbstractC001800i.A0J(c51767MuX.A05);
            if (qIj != null) {
                str = qIj.A02;
            } else {
                str = null;
            }
            return A00(c51600Mqs2, productType2, str3, str);
        }
        if (interfaceC58104PpT instanceof C51766MuW) {
            C51766MuW c51766MuW = (C51766MuW) interfaceC58104PpT;
            String str4 = c51766MuW.A04;
            C51600Mqs c51600Mqs3 = c51766MuW.A00;
            C14360o3.A0A(c51600Mqs3);
            return A00(c51600Mqs3, null, str4, null);
        }
        throw AbstractC166987dD.A12("Unsupported content type");
    }
}
