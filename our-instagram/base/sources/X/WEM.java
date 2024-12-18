package X;

import android.util.ArrayMap;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public abstract class WEM {
    public static final WDD A00;
    public static final C006802i A01;
    public static final UserSession A02 = AbstractC68221VIh.A00;
    public static final C18240vB A03;
    public static volatile boolean A04;

    public static final void A01(ArrayMap arrayMap, String str, String str2) {
        C14360o3.A0B(str2, 1);
        if (A04) {
            WDD wdd = A00;
            wdd.A03(new RunnableC71593Wwp(arrayMap, wdd, str, str2));
        }
    }

    static {
        C0o0 A002 = AbstractC14350nz.A00();
        A002.A01 = "BaymaxExecutor";
        C18240vB c18240vB = new C18240vB(A002);
        A03 = c18240vB;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        A01 = c006802i;
        A00 = new WDD(c006802i, c18240vB);
    }

    public static final Integer A00(long j, long j2) {
        if (j == 0) {
            return C05F.A00;
        }
        if (j2 <= 0 && j > 0) {
            return C05F.A01;
        }
        if (j > j2) {
            return C05F.A0C;
        }
        if (j == j2) {
            return C05F.A0N;
        }
        return C05F.A0Y;
    }

    public static final void A02(C4AP c4ap, HeroPlayerSetting heroPlayerSetting) {
        if (A04) {
            long currentMonotonicTimestamp = A01.currentMonotonicTimestamp();
            C4AN c4an = c4ap.A0D;
            int A002 = AbstractC63056Sbd.A00(c4an.A0G, String.valueOf(c4ap.A0L));
            WDD wdd = A00;
            C14360o3.A06("");
            wdd.A03(new RunnableC71595Wwr(wdd, A002, currentMonotonicTimestamp));
            A03.ATO(new C68014V6g(c4ap, c4an, heroPlayerSetting, A002));
        }
    }
}
