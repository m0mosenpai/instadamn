package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1EN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1EN {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C1EN[] A02;
    public static final C1EN A03;
    public static final C1EN A04;
    public static final C1EN A05;
    public static final C1EN A06;
    public static final C1EN A07;
    public static final C1EN A08;
    public static final C1EN A09;
    public static final C1EN A0A;
    public static final C1EN A0B;
    public static final C1EN A0C;
    public static final C1EN A0D;
    public static final C1EN A0E;
    public static final C1EN A0F;
    public static final C1EN A0G;
    public static final C1EN A0H;
    public static final C1EN A0I;
    public static final C1EN A0J;
    public static final C1EN A0K;
    public static final C1EN A0L;
    public static final C1EN A0M;
    public static final C1EN A0N;
    public final String A00;

    static {
        C1EN c1en = new C1EN(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, NetInfoModule.CONNECTION_TYPE_NONE);
        A0G = c1en;
        C1EN c1en2 = new C1EN("COLD_START", 1, "cold_start_fetch");
        A06 = c1en2;
        C1EN c1en3 = new C1EN("WARM_START", 2, "warm_start_fetch");
        A0N = c1en3;
        C1EN c1en4 = new C1EN("PULL_TO_REFRESH", 3, "pull_to_refresh");
        A0K = c1en4;
        C1EN c1en5 = new C1EN("NEW_FOLLOW", 4, "new_follow");
        A0F = c1en5;
        C1EN c1en6 = new C1EN("FIND_NEW_FRIENDS", 5, "find_new_friends");
        A0C = c1en6;
        C1EN c1en7 = new C1EN("PAGINATION", 6, "pagination");
        A0H = c1en7;
        C1EN c1en8 = new C1EN("CHECKPOINT_SHOWN", 7, "checkpoint_shown");
        A05 = c1en8;
        C1EN c1en9 = new C1EN("PILL_REFRESH", 8, "pill_refresh");
        A0I = c1en9;
        C1EN c1en10 = new C1EN("FOLLOWING_COLD_START", 9, "following_cold_start");
        A0D = c1en10;
        C1EN c1en11 = new C1EN("FAVORITES_COLD_START", 10, "favorites_cold_start");
        A0A = c1en11;
        C1EN c1en12 = new C1EN("FAN_CLUB_COLD_START", 11, "fan_club_cold_start");
        A08 = c1en12;
        C1EN c1en13 = new C1EN("FOLLOWING_WARM_START", 12, "following_warm_start");
        A0E = c1en13;
        C1EN c1en14 = new C1EN("FAVORITES_WARM_START", 13, "favorites_warm_start");
        A0B = c1en14;
        C1EN c1en15 = new C1EN("FAN_CLUB_WARM_START", 14, "fan_club_warm_start");
        A09 = c1en15;
        C1EN c1en16 = new C1EN("AUTO_REFRESH", 15, "auto_refresh");
        A03 = c1en16;
        C1EN c1en17 = new C1EN("BACKGROUND_PREFETCH", 16, "background_prefetch");
        A04 = c1en17;
        C1EN c1en18 = new C1EN("REFRESH_HL_CACHE", 17, "refresh_hl_cache");
        A0M = c1en18;
        C1EN c1en19 = new C1EN("PRIMING", 18, "main_feed_priming");
        A0J = c1en19;
        C1EN c1en20 = new C1EN("REFRESH_FOR_PUSH_NOTIFICATION_MEDIA", 19, "refresh_for_push_notification_media");
        A0L = c1en20;
        C1EN c1en21 = new C1EN("DIGITAL_RESET", 20, "digital_reset");
        A07 = c1en21;
        C1EN[] c1enArr = {c1en, c1en2, c1en3, c1en4, c1en5, c1en6, c1en7, c1en8, c1en9, c1en10, c1en11, c1en12, c1en13, c1en14, c1en15, c1en16, c1en17, c1en18, c1en19, c1en20, c1en21};
        A02 = c1enArr;
        A01 = AbstractC12190kN.A00(c1enArr);
    }

    public static C1EN valueOf(String str) {
        return (C1EN) Enum.valueOf(C1EN.class, str);
    }

    public static C1EN[] values() {
        return (C1EN[]) A02.clone();
    }

    public final boolean A00() {
        if (this != A0K && this != A0I && this != A03) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public C1EN(String str, int i, String str2) {
        this.A00 = str2;
    }
}
