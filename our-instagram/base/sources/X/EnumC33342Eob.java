package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eob, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33342Eob {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33342Eob[] A01;
    public static final EnumC33342Eob A02;
    public static final EnumC33342Eob A03;
    public static final EnumC33342Eob A04;

    static {
        EnumC33342Eob enumC33342Eob = new EnumC33342Eob("STORY_COMMENTS_AUDIENCE_CONTROL_EVERYONE", 0);
        A03 = enumC33342Eob;
        EnumC33342Eob enumC33342Eob2 = new EnumC33342Eob("STORY_COMMENTS_AUDIENCE_CONTROL_MUTUALS", 1);
        A04 = enumC33342Eob2;
        EnumC33342Eob enumC33342Eob3 = new EnumC33342Eob("STORY_COMMENTS_AUDIENCE_CONTROL_DISABLED", 2);
        A02 = enumC33342Eob3;
        EnumC33342Eob[] enumC33342EobArr = {enumC33342Eob, enumC33342Eob2, enumC33342Eob3};
        A01 = enumC33342EobArr;
        A00 = AbstractC12190kN.A00(enumC33342EobArr);
    }

    public static EnumC33342Eob valueOf(String str) {
        return (EnumC33342Eob) Enum.valueOf(EnumC33342Eob.class, str);
    }

    public static EnumC33342Eob[] values() {
        return (EnumC33342Eob[]) A01.clone();
    }

    public EnumC33342Eob(String str, int i) {
    }
}
