package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.User;

/* renamed from: X.L5m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47725L5m {
    public final C129565tL A00(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
        AbstractC46453KhD abstractC46453KhD;
        String str;
        C101594hU c101594hU;
        boolean z;
        C101594hU c101594hU2;
        AbstractC167027dH.A0a(0, context, userSession, c7im, anonymousClass988);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        C9BR A00 = AbstractC46827KnM.A00(c83403nh.A1j(AbstractC166997dE.A0Y(userSession)), c83403nh.A1l(AbstractC166997dE.A0Y(userSession)));
        Object obj = c83403nh.A1T;
        boolean z2 = false;
        String str2 = null;
        if (obj instanceof C7Q5) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.model.direct.DirectPendingVisualMedia");
            C7Q5 c7q5 = (C7Q5) obj;
            str = c7q5.A03;
            abstractC46453KhD = new KVL(str, c7q5.A04);
        } else {
            C101584hT c101584hT = c83403nh.A0e;
            if (c101584hT != null && (c101594hU = c101584hT.A04) != null) {
                ExtendedImageUrl A002 = c101594hU.A00(context);
                ImageInfo imageInfo = c101594hU.A06;
                if (A002 != null) {
                    abstractC46453KhD = new KVM(A002, imageInfo, c101594hU.A02, AbstractC167007dF.A1W(imageInfo));
                    str = null;
                }
            }
            abstractC46453KhD = null;
            str = null;
        }
        User user = c160787Im.A0K;
        if (user != null) {
            String A05 = AbstractC101904i3.A05(user);
            C14360o3.A07(A05);
            Object obj2 = c83403nh.A1T;
            if (obj2 instanceof C38321qM) {
                C38321qM c38321qM = (C38321qM) obj2;
                z = c38321qM.Cff();
                z2 = c38321qM.A5x();
            } else if (obj2 instanceof C101584hT) {
                C101594hU c101594hU3 = ((C101584hT) obj2).A04;
                if (c101594hU3 != null) {
                    z = c101594hU3.A0V;
                    z2 = c101594hU3.A0T;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            boolean A01 = C4GU.A01(c83403nh.A1F);
            PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = null;
            if (z2) {
                C101584hT c101584hT2 = c83403nh.A0e;
                if (c101584hT2 != null && (c101594hU2 = c101584hT2.A04) != null) {
                    str2 = c101594hU2.A0K;
                }
                C1575675q c1575675q = new C1575675q(userSession, c83403nh, str2);
                if (c1575675q.A06()) {
                    privacyMediaOverlayViewModel = c1575675q.A04(context, false);
                }
            } else if (A01 && AbstractC47014KqX.A00(userSession, c83403nh, str) && JUW.A01(userSession)) {
                privacyMediaOverlayViewModel = JQ0.A0W(context, AbstractC47014KqX.A00(userSession, c83403nh, str) ? 1 : 0);
            }
            return new C129565tL(A00, AbstractC43592JPx.A0d(context, userSession, anonymousClass988, c160787Im, c83403nh), AbstractC43594JPz.A0Y(userSession, anonymousClass988, c160787Im, c7im, c83403nh), abstractC46453KhD, JQ0.A0V(c160787Im, c83403nh, c83403nh.A1c() ? 1 : 0), privacyMediaOverlayViewModel, A05, false, c83403nh.A1l(AbstractC166997dE.A0Y(userSession)), z, z2, c83403nh.A1S());
        }
        throw AbstractC166997dE.A0g();
    }
}
