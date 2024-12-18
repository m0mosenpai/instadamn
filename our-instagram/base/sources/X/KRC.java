package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KRC extends AbstractC46524KiP {
    public C189478aR A00;
    public boolean A01;
    public final long A02;
    public final Activity A03;
    public final C41761wQ A04;
    public final UserSession A05;
    public final LA7 A06;
    public final EnumC46188KcQ A07;
    public final EnumC46205Kch A08;
    public final Long A09;
    public final Long A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final C7TQ A0O;

    public KRC(Activity activity, C41761wQ c41761wQ, UserSession userSession, LA7 la7, EnumC46188KcQ enumC46188KcQ, EnumC46205Kch enumC46205Kch, C7TQ c7tq, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j) {
        C14360o3.A0B(enumC46205Kch, 7);
        C14360o3.A0B(la7, 22);
        C14360o3.A0B(c41761wQ, 23);
        this.A03 = activity;
        this.A05 = userSession;
        this.A02 = j;
        this.A0L = str;
        this.A0N = str2;
        this.A0M = str3;
        this.A08 = enumC46205Kch;
        this.A09 = l;
        this.A0B = str4;
        this.A0C = str5;
        this.A0A = l2;
        this.A0D = str6;
        this.A0E = str7;
        this.A0G = str8;
        this.A0F = str9;
        this.A0I = str10;
        this.A0H = str11;
        this.A0J = str12;
        this.A0K = str13;
        this.A07 = enumC46188KcQ;
        this.A0O = c7tq;
        this.A06 = la7;
        this.A04 = c41761wQ;
    }

    public static final void A00(KRC krc) {
        LEB.A01.A03(krc.A05, krc.A02);
        krc.A04.A02(krc.A06.A02(krc.A08), C49760LyT.A00);
        krc.A01 = false;
    }
}
