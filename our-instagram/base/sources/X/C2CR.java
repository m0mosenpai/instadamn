package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.2CR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CR {
    public int A00;
    public long A01;
    public String A02;
    public final C2CS A03;
    public final String A04;

    public C2CR(UserSession userSession, String str) {
        String str2 = C46492Bm.A09.A02;
        C14360o3.A07(str2);
        C2CS c2cs = new C2CS(userSession, str2);
        this.A04 = str;
        this.A03 = c2cs;
        this.A00 = -1;
    }

    public final void A00(C4AN c4an, C19260xA c19260xA, Integer num, String str, int i) {
        String str2;
        C2CS c2cs = this.A03;
        String str3 = this.A04;
        String str4 = this.A02;
        int i2 = this.A00;
        long j = this.A01;
        this.A01 = 1 + j;
        String str5 = null;
        C19280xC A01 = C19280xC.A01(str, null);
        A01.A0C("video_id", str3);
        if (c4an != null) {
            str2 = c4an.A0A;
        } else {
            str2 = null;
        }
        A01.A0C("player_origin", str2);
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str5 = "STORIES_VOD";
                    break;
                case 2:
                    str5 = "DIRECT_VOD";
                    break;
                case 3:
                    str5 = "LIVE";
                    break;
                case 4:
                    str5 = "LIVE_VOD";
                    break;
                case 5:
                    str5 = "LIVE_ARCHIVE";
                    break;
                case 6:
                    str5 = "DIRECT_AUDIO";
                    break;
                case 7:
                    str5 = "MUSIC";
                    break;
                case 8:
                    str5 = "LOCAL";
                    break;
                case 9:
                    str5 = "COWATCH_LOCAL";
                    break;
                default:
                    str5 = "VOD";
                    break;
            }
        }
        A01.A0C("player", str5);
        A01.A08(Integer.valueOf(i), "video_time_position_ms");
        String substring = str.substring(11);
        C14360o3.A07(substring);
        String upperCase = substring.toUpperCase(Locale.ROOT);
        C14360o3.A07(upperCase);
        A01.A0C("event_name", upperCase);
        A01.A0C("stream_id", str4);
        A01.A08(Integer.valueOf(i2), TraceFieldType.StreamType);
        A01.A0C(CacheBehaviorLogger.SOURCE, c2cs.A01);
        A01.A0C("trace_id", "0");
        A01.A0B("event_id", Long.valueOf(j));
        A01.A0B("event_creation_time", Long.valueOf(System.currentTimeMillis()));
        if (c19260xA != null) {
            A01.A05(c19260xA, "metadata");
        }
        A01.A0C("event_severity", "INFO");
        AbstractC11060iN.A00(c2cs.A00).EHW(A01);
    }

    public final void A01(C4AN c4an, Integer num, int i, int i2, int i3) {
        C19260xA c19260xA;
        if (i2 > 0) {
            c19260xA = new C19260xA();
            C19260xA.A00(c19260xA, Integer.valueOf(i2), "stall_count");
            C19260xA.A00(c19260xA, Integer.valueOf(i3), "stall_time");
        } else {
            c19260xA = null;
        }
        A00(c4an, c19260xA, num, "live_video_finished_playing", i);
    }
}
