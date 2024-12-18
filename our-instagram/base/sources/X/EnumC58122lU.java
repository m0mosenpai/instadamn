package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2lU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC58122lU {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC58122lU[] A02;
    public static final EnumC58122lU A03;
    public static final EnumC58122lU A04;
    public static final EnumC58122lU A05;
    public static final EnumC58122lU A06;
    public static final EnumC58122lU A07;
    public static final EnumC58122lU A08;
    public final String A00;

    static {
        EnumC58122lU enumC58122lU = new EnumC58122lU("NUMBERED", 0, "numbered");
        A05 = enumC58122lU;
        EnumC58122lU enumC58122lU2 = new EnumC58122lU("DOT", 1, "dot_badge");
        A03 = enumC58122lU2;
        EnumC58122lU enumC58122lU3 = new EnumC58122lU("SMALL_DOT", 2, "small_dot_badge");
        A07 = enumC58122lU3;
        EnumC58122lU enumC58122lU4 = new EnumC58122lU("TOAST", 3, "toast");
        A08 = enumC58122lU4;
        EnumC58122lU enumC58122lU5 = new EnumC58122lU("LIST_ITEM", 4, "list_item");
        A04 = enumC58122lU5;
        EnumC58122lU enumC58122lU6 = new EnumC58122lU("OS_SYSTEM_CAPPED", 5, "os_system_capped");
        A06 = enumC58122lU6;
        EnumC58122lU[] enumC58122lUArr = {enumC58122lU, enumC58122lU2, enumC58122lU3, enumC58122lU4, enumC58122lU5, enumC58122lU6, new EnumC58122lU("DESCRIPTION", 6, DevServerEntity.COLUMN_DESCRIPTION)};
        A02 = enumC58122lUArr;
        A01 = AbstractC12190kN.A00(enumC58122lUArr);
    }

    public static EnumC58122lU valueOf(String str) {
        return (EnumC58122lU) Enum.valueOf(EnumC58122lU.class, str);
    }

    public static EnumC58122lU[] values() {
        return (EnumC58122lU[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC58122lU(String str, int i, String str2) {
        this.A00 = str2;
    }
}
