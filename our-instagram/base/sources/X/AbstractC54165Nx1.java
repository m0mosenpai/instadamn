package X;

import android.app.PendingIntent;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallAudience;
import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.RtcJoinCallArgs;
import com.instagram.model.rtc.RtcThreadKey;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;

/* renamed from: X.Nx1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54165Nx1 {
    public static final PendingIntent A00(Context context, UserSession userSession, RtcConnectionEntity rtcConnectionEntity) {
        RtcConnectionEntity.LiveInviteConnectionEntity liveInviteConnectionEntity;
        String str;
        RtcJoinCallArgs rtcJoinCallArgs;
        C14360o3.A0B(context, 1);
        if (rtcConnectionEntity instanceof RtcConnectionEntity.RtcCallConnectionEntity) {
            RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity = (RtcConnectionEntity.RtcCallConnectionEntity) rtcConnectionEntity;
            EnumC53137Neq enumC53137Neq = rtcCallConnectionEntity.A01;
            C36731nW c36731nW = C3EG.A00().A00;
            String str2 = rtcCallConnectionEntity.A0D;
            if (str2 == null) {
                str2 = "";
            }
            boolean z = rtcCallConnectionEntity.A0N;
            String str3 = rtcCallConnectionEntity.A0A;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = rtcCallConnectionEntity.A0C;
            if (str4 == null) {
                str4 = "";
            }
            RtcCallAudience A01 = c36731nW.A01(str2, str3, str4, rtcCallConnectionEntity.A0B, z);
            C7T3 c7t3 = C7T3.A0O;
            String A00 = rtcCallConnectionEntity.A00();
            if (A00 == null) {
                A00 = "";
            }
            rtcJoinCallArgs = new RtcJoinCallArgs(enumC53137Neq, rtcCallConnectionEntity.A02, A01, null, rtcCallConnectionEntity.A03, new RtcCallSource(null, c7t3, new RtcThreadKey(A00, null, null, null, null)), null, rtcCallConnectionEntity.A0G, OPw.A01(rtcCallConnectionEntity), 1910377639, !rtcCallConnectionEntity.A0L);
        } else {
            EnumC53137Neq enumC53137Neq2 = EnumC53137Neq.A03;
            C36731nW c36731nW2 = C3EG.A00().A00;
            if (rtcConnectionEntity instanceof RtcConnectionEntity.LiveInviteConnectionEntity) {
                liveInviteConnectionEntity = (RtcConnectionEntity.LiveInviteConnectionEntity) rtcConnectionEntity;
            } else {
                liveInviteConnectionEntity = null;
            }
            if (liveInviteConnectionEntity == null || (str = liveInviteConnectionEntity.A06) == null) {
                str = "";
            }
            RtcCallAudience A012 = c36731nW2.A01("", "", "", str, false);
            C7T3 c7t32 = C7T3.A0O;
            String C7I = rtcConnectionEntity.C7I();
            if (C7I == null) {
                C7I = "";
            }
            rtcJoinCallArgs = new RtcJoinCallArgs(enumC53137Neq2, EnumC53138Ner.A03, A012, null, rtcConnectionEntity.Ajm(), new RtcCallSource(null, c7t32, new RtcThreadKey(C7I, null, null, null, null)), rtcConnectionEntity.Bpo(), rtcConnectionEntity.Bl4(), OPw.A01(rtcConnectionEntity), 1910377639, false);
        }
        return MSZ.A0R(context, AbstractC54147Nwj.A00(context, userSession, rtcJoinCallArgs)).A01(context, 0, 134217728);
    }
}
