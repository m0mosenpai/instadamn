package X;

import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nhu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53318Nhu {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53318Nhu[] A03;
    public static final EnumC53318Nhu A04;
    public static final EnumC53318Nhu A05;
    public static final EnumC53318Nhu A06;
    public static final EnumC53318Nhu A07;
    public final String A00;

    static {
        EnumC53318Nhu enumC53318Nhu = new EnumC53318Nhu("LIVE", 0, "live_viewer");
        A04 = enumC53318Nhu;
        EnumC53318Nhu enumC53318Nhu2 = new EnumC53318Nhu("STORY", 1, "story");
        A05 = enumC53318Nhu2;
        EnumC53318Nhu enumC53318Nhu3 = new EnumC53318Nhu("STORY_AND_LIVE", 2, "story_and_live");
        A06 = enumC53318Nhu3;
        EnumC53318Nhu enumC53318Nhu4 = new EnumC53318Nhu("UNKNOWN", 3, "unknown");
        A07 = enumC53318Nhu4;
        EnumC53318Nhu[] enumC53318NhuArr = {enumC53318Nhu, enumC53318Nhu2, enumC53318Nhu3, enumC53318Nhu4};
        A03 = enumC53318NhuArr;
        A02 = AbstractC12190kN.A00(enumC53318NhuArr);
        A01 = AbstractC25232BEp.A1F("story_and_live", enumC53318Nhu3, AbstractC166987dD.A1L("live_viewer", enumC53318Nhu), AbstractC166987dD.A1L("story", enumC53318Nhu2));
    }

    public static EnumC53318Nhu valueOf(String str) {
        return (EnumC53318Nhu) Enum.valueOf(EnumC53318Nhu.class, str);
    }

    public static EnumC53318Nhu[] values() {
        return (EnumC53318Nhu[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return AnonymousClass001.A0R("QuestionSource: ", this.A00);
    }

    public EnumC53318Nhu(String str, int i, String str2) {
        this.A00 = str2;
    }
}
