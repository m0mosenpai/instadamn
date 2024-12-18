package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class P43 implements InterfaceC57955Pn1 {
    public final /* synthetic */ NMX A00;

    public P43(NMX nmx) {
        this.A00 = nmx;
    }

    @Override // X.InterfaceC57955Pn1
    public final void Dhe() {
        OBy oBy = this.A00.A0G;
        if (oBy != null) {
            UserSession userSession = oBy.A01;
            C55782hJ A00 = C55772hI.A00(userSession);
            AbstractC59962oe abstractC59962oe = oBy.A00;
            A00.A06(abstractC59962oe.getActivity());
            IGTVUploadViewModel iGTVUploadViewModel = oBy.A02;
            C47Z c47z = iGTVUploadViewModel.A02().A02;
            if (c47z.A33 == null) {
                String str = iGTVUploadViewModel.A0M.A0J;
                if (str == null) {
                    str = iGTVUploadViewModel.A02().A00.A0a;
                }
                c47z.A33 = str;
            }
            Context context = abstractC59962oe.getContext();
            if (context != null) {
                C55104ObH c55104ObH = new C55104ObH(context, EnumC53319Nhv.A07);
                String str2 = iGTVUploadViewModel.A02().A00.A0X;
                C14360o3.A0B(str2, 1);
                String str3 = c47z.A35;
                ImageUrl A002 = AbstractC55159OdN.A00(c47z);
                EnumC40111tc enumC40111tc = c47z.A1G;
                ArrayList arrayList = c47z.A40;
                List list = c47z.A48;
                ArrayList arrayList2 = c47z.A41;
                ArrayList arrayList3 = c47z.A43;
                ArrayList A04 = AbstractC55159OdN.A04(c47z);
                MediaTaggingInfo mediaTaggingInfo = new MediaTaggingInfo(A002, enumC40111tc, c47z.A1N, str3, str2, c47z.A2d, null, arrayList, arrayList2, arrayList3, A04, list, c47z.A4L, null, null);
                float f = c47z.A02;
                if (f > 0.0f) {
                    mediaTaggingInfo.A00 = f;
                    mediaTaggingInfo.A0H = true;
                }
                c55104ObH.A01 = mediaTaggingInfo;
                c55104ObH.A09 = null;
                c55104ObH.A03 = null;
                c55104ObH.A0D = iGTVUploadViewModel.A0M.A0U;
                c55104ObH.A03(userSession);
                C12260kU.A06(abstractC59962oe, c55104ObH.A02(), 1000);
            }
        }
    }
}
