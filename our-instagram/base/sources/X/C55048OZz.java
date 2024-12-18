package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallAudience;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.RtcThreadKey;
import com.instagram.rtc.activity.RtcCallIntentHandlerActivity;
import com.instagram.rtc.activity.RtcIncomingParams;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import org.json.JSONArray;

/* renamed from: X.OZz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55048OZz {
    public static final C55048OZz A00 = new Object();

    public final Intent A01(Context context, InterfaceC58275PsT interfaceC58275PsT, UserSession userSession, AbstractC27671Vv abstractC27671Vv, RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity) {
        C14360o3.A0B(rtcCallConnectionEntity, 3);
        C3ES A002 = abstractC27671Vv.A00(context, userSession);
        String A003 = OPw.A00(rtcCallConnectionEntity);
        EnumC53137Neq enumC53137Neq = rtcCallConnectionEntity.A01;
        String A004 = rtcCallConnectionEntity.A00();
        if (A004 == null) {
            A004 = "";
        }
        RtcCallSource rtcCallSource = new RtcCallSource(null, C7T3.A0Q, new RtcThreadKey(A004, null, null, null, null));
        C36731nW c36731nW = C3EG.A00().A00;
        String str = rtcCallConnectionEntity.A0D;
        if (str == null) {
            str = "";
        }
        boolean z = rtcCallConnectionEntity.A0N;
        String str2 = rtcCallConnectionEntity.A0A;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = rtcCallConnectionEntity.A0C;
        if (str3 == null) {
            str3 = "";
        }
        RtcCallAudience A01 = c36731nW.A01(str, str2, str3, rtcCallConnectionEntity.A0B, z);
        boolean z2 = rtcCallConnectionEntity.A0L;
        String A012 = OPw.A01(rtcCallConnectionEntity);
        AbstractC167017dG.A1N(A003, enumC53137Neq);
        RtcCallKey rtcCallKey = rtcCallConnectionEntity.A03;
        C3ES.A03(rtcCallKey, rtcCallSource, A002);
        UserSession userSession2 = A002.A06;
        Context context2 = A002.A04;
        C56139Ovz A005 = MWJ.A00(context2, userSession2);
        RtcIncomingParams rtcIncomingParams = new RtcIncomingParams(rtcCallKey.A00, null, z, z2);
        String str4 = rtcCallSource.A02.A02;
        String str5 = A01.A02;
        String str6 = A01.A01;
        String A0w = AbstractC43592JPx.A0w(A01.A00);
        AbstractC167017dG.A1O(str4, str5);
        C55135Oc3 c55135Oc3 = A005.A09.A0K;
        Integer num = C05F.A01;
        C51678Ms9 c51678Ms9 = new C51678Ms9(interfaceC58275PsT, enumC53137Neq, rtcCallConnectionEntity, num, str4, str5, str6, A0w, A012, z2, z);
        if (C18U.A06(C06090Tz.A05, c55135Oc3.A08, 36327988735851547L)) {
            c55135Oc3.A03 = c51678Ms9;
        }
        if (!((C51881MwP) c55135Oc3.A00.A00).A00()) {
            c55135Oc3.A02 = null;
            c55135Oc3.A04 = null;
            boolean z3 = false;
            c55135Oc3.A06 = false;
            c55135Oc3.A03 = c51678Ms9;
            if (c51678Ms9.A02 != EnumC53137Neq.A03) {
                z3 = true;
            }
            c55135Oc3.A06 = z3;
            RtcCallKey rtcCallKey2 = c51678Ms9.A03.A03;
            C55135Oc3.A02(new C51759Mti(new C51881MwP(rtcCallKey2, num, num), C05F.A00), c55135Oc3);
        }
        Intent A08 = MSW.A08(context2, RtcCallIntentHandlerActivity.class);
        A08.setAction("rtc_call_activity_intent_action_incoming_call");
        AbstractC31173DnH.A18(A08, userSession2);
        A08.putExtra("rtc_call_activity_arguments_key_notification_trace_id", Long.valueOf(interfaceC58275PsT.CA4()));
        Parcel obtain = Parcel.obtain();
        C14360o3.A07(obtain);
        rtcIncomingParams.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        A08.putExtra("rtc_call_activity_arguments_key_incoming_param", marshall);
        A08.addFlags(Constants.LOAD_RESULT_PGO_ATTEMPTED);
        return A08;
    }

    public static final String A00(String str) {
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            C14360o3.A07(string);
            strArr[i] = string;
        }
        return AbstractC009903n.A07(", ", "", "", C57704Pit.A00, strArr);
    }
}
