package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ngo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53250Ngo {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53250Ngo[] A03;
    public static final EnumC53250Ngo A04;
    public static final EnumC53250Ngo A05;
    public final int A00;
    public final int A01;

    public static EnumC53250Ngo valueOf(String str) {
        return (EnumC53250Ngo) Enum.valueOf(EnumC53250Ngo.class, str);
    }

    public static EnumC53250Ngo[] values() {
        return (EnumC53250Ngo[]) A03.clone();
    }

    static {
        EnumC53250Ngo enumC53250Ngo = new EnumC53250Ngo("UNTAG", 0, 2131976407, 2131976401);
        A05 = enumC53250Ngo;
        EnumC53250Ngo enumC53250Ngo2 = new EnumC53250Ngo("GENERIC", 1, 2131976408, 2131976402);
        A04 = enumC53250Ngo2;
        EnumC53250Ngo[] enumC53250NgoArr = {enumC53250Ngo, enumC53250Ngo2};
        A03 = enumC53250NgoArr;
        A02 = AbstractC12190kN.A00(enumC53250NgoArr);
    }

    public EnumC53250Ngo(String str, int i, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
    }
}
