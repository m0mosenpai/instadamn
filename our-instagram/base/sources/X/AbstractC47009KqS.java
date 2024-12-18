package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.KqS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47009KqS {
    /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
    public static CharSequence A00(Context context, UserSession userSession, C160787Im c160787Im) {
        int i;
        Long l;
        Long l2;
        ?? A1a = AbstractC167017dG.A1a(userSession, context);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        if (!c83403nh.A2F) {
            return "";
        }
        String str = c83403nh.A1b;
        if (str != null && c83403nh.A1Z != null) {
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC31177DnL.A0b(context, str, 2131959414));
            AnonymousClass773.A04(A0H, new C46062KaJ(AbstractC31174DnI.A02(context), A1a == true ? 1 : 0), str);
            return A0H;
        }
        String str2 = c83403nh.A1V;
        if (c83403nh.A1R() && str2 != null) {
            return str2;
        }
        Integer num = c83403nh.A1E;
        if (num != null && num.intValue() >= A1a) {
            String A0g = c83403nh.A0g();
            Integer num2 = c83403nh.A1E;
            long A07 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36596102069356870L);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "mwb_igd_highly_forwarded_message");
            if (A0f.isSampled()) {
                A0f.AAP("mid", A0g);
                A0f.A9K("limit", Long.valueOf(A07));
                if (num2 != null) {
                    l2 = AbstractC25229BEm.A0n(num2);
                } else {
                    l2 = null;
                }
                A0f.A9K("forward_depth", l2);
                A0f.Cht();
            }
        }
        if (c83403nh.A2S && C18U.A06(C06090Tz.A06, userSession, 36314627092777717L)) {
            String A0g2 = c83403nh.A0g();
            Integer num3 = c83403nh.A1E;
            long A072 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36596102069356870L);
            InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "mwb_igd_highly_forwarded_indicator_shown");
            if (A0f2.isSampled()) {
                A0f2.AAP("mid", A0g2);
                A0f2.A9K("limit", Long.valueOf(A072));
                if (num3 != null) {
                    l = AbstractC25229BEm.A0n(num3);
                } else {
                    l = null;
                }
                A0f2.A9K("forward_depth", l);
                A0f2.Cht();
            }
            i = 2131959567;
        } else if (c83403nh.A1j(AbstractC166997dE.A0Y(userSession))) {
            i = 2131959417;
        } else {
            User user = c160787Im.A0K;
            C7TT c7tt = c160787Im.A0G;
            if (c7tt.A0r && user != null) {
                C206379Bu c206379Bu = (C206379Bu) c7tt.A0f.get(user.getId());
                String A08 = AbstractC101904i3.A08(user);
                C14360o3.A07(A08);
                if (c206379Bu == null) {
                    return AbstractC31177DnL.A0b(context, A08, 2131959416);
                }
                SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(AbstractC31177DnL.A0b(context, AbstractC166987dD.A19(AbstractC25225BEi.A0H(A08).append((CharSequence) " ").append((CharSequence) c206379Bu.A03)), 2131959416));
                JVZ.A00(context, A0H2, c206379Bu, A08.length() + 1);
                return A0H2;
            }
            i = 2131959415;
        }
        return AbstractC25227BEk.A0u(context, i);
    }
}
