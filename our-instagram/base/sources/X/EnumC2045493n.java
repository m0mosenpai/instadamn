package X;

import java.util.regex.Pattern;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.93n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2045493n {
    public static final Pattern A01;
    public static final Pattern A02;
    public static final Pattern A03;
    public static final Pattern A04;
    public static final Pattern A05;
    public static final Pattern A06;
    public static final /* synthetic */ EnumEntries A07;
    public static final /* synthetic */ EnumC2045493n[] A08;
    public static final EnumC2045493n A09;
    public static final EnumC2045493n A0A;
    public static final EnumC2045493n A0B;
    public static final EnumC2045493n A0C;
    public static final EnumC2045493n A0D;
    public static final EnumC2045493n A0E;
    public final String A00;

    static {
        EnumC2045493n enumC2045493n = new EnumC2045493n("PROFILE_FEED", 0, "profile_feed");
        A0B = enumC2045493n;
        EnumC2045493n enumC2045493n2 = new EnumC2045493n("GRAPHQL_PROFILE_FEED", 1, "graphql_profile_feed");
        A09 = enumC2045493n2;
        EnumC2045493n enumC2045493n3 = new EnumC2045493n("USER_INFO", 2, "user_info");
        A0D = enumC2045493n3;
        EnumC2045493n enumC2045493n4 = new EnumC2045493n("GRAPHQL_USER_INFO", 3, "graphql_user_info");
        A0A = enumC2045493n4;
        EnumC2045493n enumC2045493n5 = new EnumC2045493n("STORY_HIGHLIGHTS", 4, "story_highlights");
        A0C = enumC2045493n5;
        EnumC2045493n enumC2045493n6 = new EnumC2045493n("USER_STORY", 5, "user_story");
        A0E = enumC2045493n6;
        EnumC2045493n[] enumC2045493nArr = {enumC2045493n, enumC2045493n2, enumC2045493n3, enumC2045493n4, enumC2045493n5, enumC2045493n6};
        A08 = enumC2045493nArr;
        A07 = AbstractC12190kN.A00(enumC2045493nArr);
        A03 = Pattern.compile(AnonymousClass001.A0C("profile_feed", '$'));
        A01 = Pattern.compile(AnonymousClass001.A0C("graphql_profile_feed", '$'));
        A05 = Pattern.compile(AnonymousClass001.A0C("user_info", '$'));
        A02 = Pattern.compile(AnonymousClass001.A0C("graphql_user_info", '$'));
        A04 = Pattern.compile(AnonymousClass001.A0C("story_highlights", '$'));
        A06 = Pattern.compile(AnonymousClass001.A0C("user_story", '$'));
    }

    public static EnumC2045493n valueOf(String str) {
        return (EnumC2045493n) Enum.valueOf(EnumC2045493n.class, str);
    }

    public static EnumC2045493n[] values() {
        return (EnumC2045493n[]) A08.clone();
    }

    public EnumC2045493n(String str, int i, String str2) {
        this.A00 = str2;
    }
}
