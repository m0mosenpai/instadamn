package X;

import com.instagram.common.notifications.push.intf.PushChannelType;
import java.util.List;

/* loaded from: classes8.dex */
public final class JQO {
    public static final C43608JQp A0R = new Object();
    public static final C50B A0S = new C50B(0, 0);
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final EnumC46274Ke6 A05;
    public final PushChannelType A06;
    public final Integer A07;
    public final Long A08;
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
    public final List A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;

    public JQO(C43606JQm c43606JQm) {
        String str = c43606JQm.A0F;
        this.A0F = str == null ? "empty-or-null-ig4a" : str;
        String str2 = c43606JQm.A0G;
        this.A0G = str2 == null ? "empty-or-null-ig4a" : str2;
        String str3 = c43606JQm.A0C;
        this.A0C = str3 == null ? "empty-or-null-ig4a" : str3;
        String str4 = c43606JQm.A0M;
        this.A0M = str4 == null ? "empty-or-null-ig4a" : str4;
        String str5 = c43606JQm.A0E;
        this.A0E = str5 != null ? str5 : "empty-or-null-ig4a";
        PushChannelType pushChannelType = c43606JQm.A02;
        this.A06 = pushChannelType == null ? PushChannelType.A0D : pushChannelType;
        this.A03 = AbstractC25232BEp.A0t(c43606JQm.A09);
        this.A0O = c43606JQm.A0O;
        String str6 = c43606JQm.A0D;
        this.A0D = str6 == null ? "" : str6;
        String str7 = c43606JQm.A0K;
        this.A0K = str7 == null ? "" : str7;
        this.A05 = c43606JQm.A01;
        this.A08 = c43606JQm.A05;
        this.A0A = c43606JQm.A0A;
        this.A07 = c43606JQm.A03;
        this.A04 = c43606JQm.A00;
        this.A0Q = c43606JQm.A0Q;
        this.A02 = AbstractC25232BEp.A0t(c43606JQm.A08);
        this.A0B = c43606JQm.A0B;
        this.A0H = c43606JQm.A0H;
        this.A0N = c43606JQm.A0N;
        String str8 = c43606JQm.A0L;
        this.A0L = str8 == null ? "" : str8;
        String str9 = c43606JQm.A0J;
        this.A0J = str9 != null ? str9 : "";
        this.A00 = AbstractC25232BEp.A0t(c43606JQm.A04);
        Long l = c43606JQm.A07;
        this.A01 = l != null ? l.longValue() : 0L;
        this.A0P = c43606JQm.A0P;
        this.A09 = c43606JQm.A06;
        this.A0I = c43606JQm.A0I;
    }

    public JQO(PushChannelType pushChannelType, Integer num, Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, long j, boolean z, boolean z2, boolean z3) {
        String str12 = str2;
        String str13 = str3;
        String str14 = str10;
        String str15 = str11;
        String str16 = str6;
        this.A0F = str5 == null ? "empty-or-null-ig4a" : str5;
        this.A0G = str6 == null ? "empty-or-null-ig4a" : str16;
        this.A0C = str2 == null ? "empty-or-null-ig4a" : str12;
        this.A0M = str11 == null ? "empty-or-null-ig4a" : str15;
        this.A0E = str4 != null ? str4 : "empty-or-null-ig4a";
        this.A06 = pushChannelType == null ? PushChannelType.A0D : pushChannelType;
        this.A03 = AbstractC25232BEp.A0t(l3);
        this.A0O = z;
        this.A0D = str3 == null ? "" : str13;
        this.A0K = "";
        this.A05 = null;
        this.A08 = null;
        this.A0A = l4;
        this.A07 = num;
        this.A04 = j;
        this.A0Q = z3;
        this.A02 = AbstractC25232BEp.A0t(l2);
        this.A0B = str;
        this.A0H = str7;
        this.A0N = list;
        this.A0L = str10 == null ? "" : str14;
        this.A0J = str9 != null ? str9 : "";
        this.A00 = 0L;
        this.A01 = 0L;
        this.A0P = z2;
        this.A09 = l;
        this.A0I = str8;
    }
}
