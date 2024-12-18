package X;

import com.facebook.graphql.enums.EnumHelper;

/* renamed from: X.8dU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191258dU {
    public static final C191268dV A03;
    public static final C191258dU A04;
    public static final C191258dU A05;
    public static final C191258dU A06;
    public static final C191258dU A07;
    public static final C191258dU A08;
    public static final C191258dU A09;
    public static final C191258dU A0A;
    public static final C191258dU A0B;
    public static final C191258dU A0C;
    public static final C191258dU A0D;
    public static final C191258dU A0E;
    public static final C191258dU A0F;
    public static final C191258dU A0G;
    public static final C191258dU A0H;
    public static final C191258dU A0I;
    public static final C191258dU A0J;
    public static final C191258dU A0K;
    public static final C191258dU A0L;
    public static final C191258dU A0M;
    public final C85A A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C14360o3.A0K(getClass(), obj.getClass())) {
                C191258dU c191258dU = (C191258dU) obj;
                if (!C14360o3.A0K(this.A01, c191258dU.A01) || !C14360o3.A0K(this.A02, c191258dU.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.8dV, java.lang.Object] */
    static {
        ?? obj = new Object();
        A03 = obj;
        C85A c85a = C85A.STORIES;
        A0I = C191268dV.A00(c85a);
        A0L = obj.A01(c85a, "FOR_YOU");
        A0H = obj.A01(c85a, "EFFECT_BY_ID");
        C85A c85a2 = C85A.REELS;
        A09 = C191268dV.A00(c85a2);
        A0K = obj.A01(c85a2, "FOR_YOU");
        A08 = obj.A01(c85a2, "EFFECT_BY_ID");
        C85A c85a3 = C85A.LIVE;
        A07 = C191268dV.A00(c85a3);
        A06 = obj.A01(c85a3, "FOR_YOU");
        C85A c85a4 = C85A.DIRECT_RTC;
        A0F = C191268dV.A00(c85a4);
        A0D = obj.A01(c85a4, "FOR_YOU");
        A0E = obj.A01(c85a4, "MULTIPEER");
        A0A = obj.A01(c85a4, "AVATAR_SDK_PRESETS");
        A0B = obj.A01(c85a4, "BACKGROUNDS");
        A0G = obj.A01(c85a4, "SOLO_BACKGROUNDS");
        A0C = obj.A01(c85a4, "EFFECT_BY_ID");
        C85A c85a5 = C85A.DIRECT;
        A05 = C191268dV.A00(c85a5);
        A04 = obj.A01(c85a5, "FOR_YOU");
        C85A c85a6 = (C85A) EnumHelper.A00("DIRECT_THREAD", C85A.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        C14360o3.A07(c85a6);
        C14360o3.A0B("EFFECT_BY_ID", 1);
        A0J = new C191258dU(c85a6, "EFFECT_BY_ID");
        A0M = obj.A01(C85A.THREADS, "FOR_YOU");
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A02.hashCode();
    }

    public C191258dU(C85A c85a, String str) {
        this.A00 = c85a;
        this.A01 = str;
        this.A02 = c85a.name();
    }
}
