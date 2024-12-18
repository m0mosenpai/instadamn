package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.JUi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43698JUi {
    public static final C7SX A00(Context context, UserSession userSession, C7QL c7ql, AnonymousClass988 anonymousClass988, C160787Im c160787Im) {
        C4G2 c4g2;
        String str;
        String str2;
        Integer num;
        C38321qM c38321qM;
        int i;
        List list;
        EnumC92794Ds enumC92794Ds;
        String str3;
        C14360o3.A0B(context, 0);
        AbstractC43594JPz.A1P(userSession, anonymousClass988);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        C2EY c2ey = c83403nh.A10;
        if (c2ey != C2EY.A0p && c2ey != C2EY.A0z) {
            Object obj = c83403nh.A1T;
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectVoiceMedia");
            c4g2 = (C4G2) obj;
        } else {
            c4g2 = c83403nh.A0g;
        }
        User user = c160787Im.A0K;
        if (c4g2 != null) {
            str = c4g2.A02();
        } else {
            str = null;
        }
        DirectMessageIdentifier A0V = c83403nh.A0V();
        if (user != null) {
            str2 = user.getUsername();
        } else {
            str2 = null;
        }
        if (c4g2 != null) {
            num = c4g2.A00();
        } else {
            num = null;
        }
        int A0H = AbstractC166987dD.A0H(AbstractC43691JUa.A00(num, 0, "playbackDurationMs"));
        if (c4g2 != null) {
            c38321qM = c4g2.A02;
            i = c4g2.A00;
            list = c4g2.A03();
        } else {
            c38321qM = null;
            i = 0;
            list = null;
        }
        C7QX A0d = AbstractC43592JPx.A0d(context, userSession, anonymousClass988, c160787Im, c83403nh);
        InterfaceC83733oI interfaceC83733oI = c160787Im.A0G.A0P;
        if (interfaceC83733oI == null || (enumC92794Ds = AbstractC1345466e.A00(interfaceC83733oI)) == null) {
            enumC92794Ds = EnumC92794Ds.A04;
        }
        boolean A1S = c83403nh.A1S();
        Long l = c83403nh.A1K;
        boolean z = c83403nh.A2P;
        Integer num2 = C05F.A00;
        Integer num3 = C05F.A0C;
        InterfaceC83733oI interfaceC83733oI2 = c160787Im.A0G.A0P;
        if (interfaceC83733oI2 != null) {
            str3 = AbstractC31171DnF.A0c(interfaceC83733oI2);
        } else {
            str3 = null;
        }
        return new C7SX(c83403nh.A0G, A0d, c7ql, enumC92794Ds, c38321qM, A0V, num2, num3, null, l, str, str2, str3, list, A0H, i, A1S, z, false);
    }
}
