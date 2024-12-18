package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.rtc.RtcCallAudience;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1nW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36731nW {
    public final RtcCallAudience A00(Context context, UserSession userSession, Integer num, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        C81663kb A0N;
        C14360o3.A0B(num, 4);
        C14360o3.A0B(str4, 8);
        if (!z && C18U.A06(C06090Tz.A05, userSession, 36327142627293503L)) {
            User A01 = C17060sy.A01.A01(userSession);
            SimpleImageUrl simpleImageUrl = new SimpleImageUrl(str2);
            A01.getUsername();
            A01.getId();
            C14360o3.A07(Collections.singletonList(str4));
            List singletonList = Collections.singletonList(simpleImageUrl);
            C14360o3.A07(singletonList);
            String username = A01.getUsername();
            ImageUrl Bhu = A01.Bhu();
            String id = A01.getId();
            List singletonList2 = Collections.singletonList(str4);
            C14360o3.A07(singletonList2);
            return new RtcCallAudience(Bhu, str3, username, id, singletonList, singletonList2, z);
        }
        C08730cb c08730cb = C17060sy.A01;
        User A012 = c08730cb.A01(userSession);
        C2DS A00 = C2JD.A00(userSession);
        A00.CoS("CreateCallBackAudience");
        if (str != null && (A0N = ((C2DU) A00).A0N(str)) != null) {
            ArrayList A04 = AbstractC81683kd.A04(c08730cb.A01(userSession), A0N.BSH());
            String A07 = C4GQ.A07(context, userSession, A0N);
            C14360o3.A07(A07);
            List BSF = A0N.BSF();
            boolean CVQ = A0N.CVQ();
            String username2 = A012.getUsername();
            ImageUrl Bhu2 = A012.Bhu();
            String id2 = A012.getId();
            C14360o3.A0A(BSF);
            return new RtcCallAudience(Bhu2, A07, username2, id2, A04, BSF, CVQ);
        }
        if (str == null) {
            str5 = " because ig thread id is null";
        } else {
            str5 = " because store can't get extended thread";
        }
        new OLI(C18950wb.A01).A00(AnonymousClass001.A0R("Unable to show missed call notification as call back intent can't be created", str5));
        C0K8.A0E("RtcCallAudienceFactoryImpl", "Cannot find direct thread");
        return null;
    }

    public final RtcCallAudience A01(String str, String str2, String str3, String str4, boolean z) {
        C14360o3.A0B(str4, 5);
        SimpleImageUrl simpleImageUrl = new SimpleImageUrl(str);
        List singletonList = Collections.singletonList(simpleImageUrl);
        C14360o3.A07(singletonList);
        return new RtcCallAudience(simpleImageUrl, str2, str3, str4, singletonList, C16930sl.A00, z);
    }
}
