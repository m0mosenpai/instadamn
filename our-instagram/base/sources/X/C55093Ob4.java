package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import com.facebook.rsys.call.gen.CallModel;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallAudience;
import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.RtcJoinCallArgs;
import com.instagram.model.rtc.RtcThreadKey;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;

/* renamed from: X.Ob4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55093Ob4 {
    public final Context A00;
    public final UserSession A01;
    public final AbstractC27671Vv A02;

    public static final RtcConnectionEntity.RtcCallConnectionEntity A00(C55093Ob4 c55093Ob4, String str) {
        RtcConnectionEntity rtcConnectionEntity;
        if (str != null) {
            C55051Oa2 c55051Oa2 = C55051Oa2.A00;
            rtcConnectionEntity = C55051Oa2.A00(AbstractC37301Gc2.A0p(c55093Ob4.A01.userId, str));
        } else {
            rtcConnectionEntity = null;
        }
        if (rtcConnectionEntity instanceof RtcConnectionEntity.RtcCallConnectionEntity) {
            return (RtcConnectionEntity.RtcCallConnectionEntity) rtcConnectionEntity;
        }
        return null;
    }

    public static final boolean A01(C55093Ob4 c55093Ob4) {
        if (Build.VERSION.SDK_INT >= 34 && !AbstractC25231BEo.A1b(c55093Ob4.A03().A00) && MSZ.A0F(c55093Ob4.A00).isBackgroundRestricted()) {
            return false;
        }
        return true;
    }

    public final Intent A02(Context context, String str) {
        RtcConnectionEntity.RtcCallConnectionEntity A00 = A00(this, str);
        if (A00 == null) {
            OXE.A00.A04("IgRtcNotificationConfig", AnonymousClass001.A0R("Accept call | No connection entity for call with server info data: ", str), null);
            return AbstractC31171DnF.A04();
        }
        UserSession userSession = this.A01;
        EnumC53137Neq enumC53137Neq = A00.A01;
        C36731nW c36731nW = C3EG.A00().A00;
        String str2 = A00.A0D;
        if (str2 == null) {
            str2 = "";
        }
        boolean z = A00.A0N;
        String str3 = A00.A0A;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = A00.A0C;
        if (str4 == null) {
            str4 = "";
        }
        RtcCallAudience A01 = c36731nW.A01(str2, str3, str4, A00.A0B, z);
        C7T3 c7t3 = C7T3.A0O;
        String A002 = A00.A00();
        if (A002 == null) {
            A002 = "";
        }
        return AbstractC54147Nwj.A00(context, userSession, new RtcJoinCallArgs(enumC53137Neq, A00.A02, A01, null, A00.A03, new RtcCallSource(null, c7t3, new RtcThreadKey(A002, null, null, null, null)), null, A00.A0G, OPw.A01(A00), 64278, !A00.A0L));
    }

    public final C51704MsZ A03() {
        UserSession userSession = this.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        return new C51704MsZ(MSW.A1F(this, 3), new C57549PgN(this, 25), 124909, C18U.A06(c06090Tz, userSession, 36323887042014891L), C18U.A06(c06090Tz, userSession, 2342168193336095581L));
    }

    public final String A04(CallModel callModel) {
        Resources resources;
        int i;
        int i2 = callModel.inCallState;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4 && i2 != 5 && i2 != 7) {
                    return "";
                }
            } else {
                if (!AbstractC53734NpR.A00(callModel) && !callModel.inviteRequestedVideo) {
                    resources = this.A00.getResources();
                    i = 2131954465;
                } else {
                    resources = this.A00.getResources();
                    i = 2131954480;
                }
                return AbstractC166997dE.A0q(resources, i);
            }
        }
        return AbstractC166997dE.A0q(this.A00.getResources(), 2131954503);
    }

    public final String A05(CallModel callModel) {
        Resources resources;
        int i;
        RtcConnectionEntity.RtcCallConnectionEntity A00;
        String str;
        String str2 = callModel.sharedCallId;
        if (str2 == null || (A00 = A00(this, str2)) == null || (str = A00.A0C) == null || str.length() == 0) {
            if (!AbstractC53734NpR.A00(callModel) && !callModel.inviteRequestedVideo) {
                resources = this.A00.getResources();
                i = 2131954465;
            } else {
                resources = this.A00.getResources();
                i = 2131954480;
            }
            return AbstractC166997dE.A0q(resources, i);
        }
        return str;
    }

    public /* synthetic */ C55093Ob4(Context context, UserSession userSession) {
        AbstractC27671Vv A00 = C3ER.A00();
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = A00;
    }
}
