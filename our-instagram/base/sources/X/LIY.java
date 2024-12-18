package X;

import android.content.Context;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* loaded from: classes8.dex */
public final class LIY {
    public static LIY A01;
    public static final C47728L5p A02 = new Object();
    public final C2DO A00;

    public final void A00(C116155Nu c116155Nu, UserSession userSession) {
        InterfaceC83713oG c83693oE;
        C45122Jxr c45122Jxr;
        C14360o3.A0B(userSession, 0);
        C3J1.A00().A08(c116155Nu, PushChannelType.A0B, null);
        C2DK c2dk = (C2DK) userSession.A01(C2DK.class, new C37058GUs(userSession, 34));
        String str = c116155Nu.A0g;
        if (str == null) {
            str = "";
        }
        android.net.Uri A0B = AbstractC25227BEk.A0B(str);
        String str2 = c116155Nu.A0X;
        C14360o3.A07(str2);
        String A00 = AbstractC162167Oa.A00(A0B, str2);
        if (c2dk.A01(A00)) {
            if (A00 != null) {
                Context context = AbstractC12290kX.A00;
                C14360o3.A07(context);
                String A022 = AbstractC162167Oa.A02(userSession.userId, A00, null);
                if (A0B.getBooleanQueryParameter("is_vanish_mode", false) || ((c45122Jxr = c116155Nu.A05) != null && c45122Jxr.A00())) {
                    c83693oE = new C83693oE(A00);
                } else {
                    c83693oE = new MsysThreadId(EnumC92794Ds.A04, null, Long.parseLong(A00));
                }
                InterfaceC83713oG interfaceC83713oG = c83693oE;
                String str3 = c116155Nu.A1I;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = c116155Nu.A0r;
                C14360o3.A07(str4);
                String str5 = c116155Nu.A11;
                String A023 = AbstractC43609JQq.A02(c116155Nu);
                ImageUrl imageUrl = c116155Nu.A0C;
                ImageUrl imageUrl2 = c116155Nu.A0D;
                boolean z = c116155Nu.A1U;
                PushChannelType pushChannelType = c116155Nu.A0B;
                C14360o3.A07(pushChannelType);
                Long l = c116155Nu.A0L;
                String str6 = c116155Nu.A12;
                C14360o3.A07(str6);
                C2DO.A00(context, null, pushChannelType, userSession, imageUrl, imageUrl2, interfaceC83713oG, l, A022, A00, str3, str4, "message_recieved", str5, null, A023, str6, null, null, 0L, false, false, false, z);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public LIY(C2DO c2do) {
        this.A00 = c2do;
    }

    public LIY() {
    }
}
