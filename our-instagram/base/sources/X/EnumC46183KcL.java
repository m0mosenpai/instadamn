package X;

import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46183KcL {
    public static final Map A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC46183KcL[] A02;
    public static final EnumC46183KcL A03;
    public static final EnumC46183KcL A04;
    public static final EnumC46183KcL A05;
    public static final EnumC46183KcL A06;
    public static final EnumC46183KcL A07;
    public static final EnumC46183KcL A08;
    public static final EnumC46183KcL A09;

    static {
        EnumC46183KcL enumC46183KcL = new EnumC46183KcL("INTRO", 0);
        A04 = enumC46183KcL;
        EnumC46183KcL enumC46183KcL2 = new EnumC46183KcL("LOTS_OF_HEART", 1);
        A06 = enumC46183KcL2;
        EnumC46183KcL enumC46183KcL3 = new EnumC46183KcL("MOST_TAGGED", 2);
        A07 = enumC46183KcL3;
        EnumC46183KcL enumC46183KcL4 = new EnumC46183KcL("LONGEST_FOLLOWER", 3);
        A05 = enumC46183KcL4;
        EnumC46183KcL enumC46183KcL5 = new EnumC46183KcL("TOP_POST", 4);
        A09 = enumC46183KcL5;
        EnumC46183KcL enumC46183KcL6 = new EnumC46183KcL("TOP_CREATOR", 5);
        A08 = enumC46183KcL6;
        EnumC46183KcL enumC46183KcL7 = new EnumC46183KcL("END_SUMMARY", 6);
        A03 = enumC46183KcL7;
        EnumC46183KcL[] enumC46183KcLArr = {enumC46183KcL, enumC46183KcL2, enumC46183KcL3, enumC46183KcL4, enumC46183KcL5, enumC46183KcL6, enumC46183KcL7};
        A02 = enumC46183KcLArr;
        A01 = AbstractC12190kN.A00(enumC46183KcLArr);
        A00 = AbstractC06930Yk.A06(AbstractC166987dD.A1L("intro", enumC46183KcL), AbstractC166987dD.A1L("supportive_superstar", enumC46183KcL2), AbstractC166987dD.A1L("most_tagged", enumC46183KcL3), AbstractC166987dD.A1L("longest_follower", enumC46183KcL4), AbstractC166987dD.A1L("most_liked_post", enumC46183KcL5), AbstractC166987dD.A1L("top_creator", enumC46183KcL6), AbstractC166987dD.A1L("end", enumC46183KcL7));
    }

    public static EnumC46183KcL valueOf(String str) {
        return (EnumC46183KcL) Enum.valueOf(EnumC46183KcL.class, str);
    }

    public static EnumC46183KcL[] values() {
        return (EnumC46183KcL[]) A02.clone();
    }

    public EnumC46183KcL(String str, int i) {
    }
}
