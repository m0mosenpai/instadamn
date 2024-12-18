package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.util.Random;

/* renamed from: X.Oah, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55085Oah {
    public long A00;
    public Integer A01;
    public final UserSession A02;
    public final String A03;
    public final Context A04;
    public final InterfaceC11380iw A05;
    public volatile String A06;
    public static final Random A08 = new Random();
    public static final C13920nI A07 = C13920nI.A00;

    public C55085Oah(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A05 = interfaceC11380iw;
        this.A04 = context;
        this.A03 = AbstractC12880la.A04(context);
        this.A01 = C05F.A00;
    }

    public final void A01(Integer num) {
        String str;
        C14360o3.A0B(num, 0);
        Integer num2 = this.A01;
        if (num2 != C05F.A0N && num2 != C05F.A0u) {
            return;
        }
        C19260xA c19260xA = new C19260xA();
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 2) {
                str = "";
            } else {
                str = "rtc";
            }
        } else {
            str = "rtmp";
        }
        C19260xA.A00(c19260xA, str, "t");
        this.A01 = C05F.A0j;
        A00(c19260xA, this, "SESSION_END", "INFO", "BROADCASTER");
    }

    public final void A02(Integer num) {
        String str;
        C19260xA c19260xA;
        String str2;
        C14360o3.A0B(num, 0);
        if (this.A01 == C05F.A01 && this.A06 != null) {
            long j = this.A00;
            if (j < 0) {
                this.A01 = C05F.A0C;
                c19260xA = null;
                str2 = "BEGIN";
            } else {
                long currentTimeMillis = System.currentTimeMillis() - j;
                c19260xA = new C19260xA();
                C19260xA.A00(c19260xA, AnonymousClass001.A0Q("", currentTimeMillis), "dur");
                this.A01 = C05F.A0Y;
                this.A00 = -1L;
                str2 = "RESUME";
            }
            A00(c19260xA, this, str2, "INFO", "BROADCASTER");
        }
        C19260xA c19260xA2 = new C19260xA();
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 2) {
                str = "";
            } else {
                str = "rtc";
            }
        } else {
            str = "rtmp";
        }
        C19260xA.A00(c19260xA2, str, "t");
        this.A01 = C05F.A0N;
        A00(c19260xA2, this, "SESSION_BEGIN", "INFO", "BROADCASTER");
    }

    public static final void A00(C19260xA c19260xA, C55085Oah c55085Oah, String str, String str2, String str3) {
        C19280xC A00 = C19280xC.A00(c55085Oah.A05, "facecast_trace_id_embedded");
        String str4 = c55085Oah.A06;
        if (str4 != null) {
            A00.A0C("stream_id", str4);
        }
        Integer A0p = AbstractC25227BEk.A0p();
        A00.A08(A0p, TraceFieldType.StreamType);
        A00.A08(A0p, "trace_id");
        A00.A0C(CacheBehaviorLogger.SOURCE, str3);
        A00.A0A("event_id", Double.valueOf(A08.nextLong() - (-9.223372036854776E18d)));
        A00.A0B("event_creation_time", AbstractC31173DnH.A0g());
        A00.A0C("event_severity", str2);
        A00.A0C("event_name", str);
        A00.A0C("parent_source", "");
        if (c19260xA != null) {
            A00.A05(c19260xA, "metadata");
        }
        AbstractC31173DnH.A1S(A00, c55085Oah.A02);
    }
}
