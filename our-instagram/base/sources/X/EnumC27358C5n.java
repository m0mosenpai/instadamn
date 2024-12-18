package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C5n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27358C5n {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27358C5n[] A01;
    public static final EnumC27358C5n A02;
    public static final EnumC27358C5n A03;

    static {
        EnumC27358C5n enumC27358C5n = new EnumC27358C5n("CREATE_WITH_AI", 0);
        A02 = enumC27358C5n;
        EnumC27358C5n enumC27358C5n2 = new EnumC27358C5n("SELECTED_AI_THEME", 1);
        A03 = enumC27358C5n2;
        EnumC27358C5n[] enumC27358C5nArr = {enumC27358C5n, enumC27358C5n2};
        A01 = enumC27358C5nArr;
        A00 = AbstractC12190kN.A00(enumC27358C5nArr);
    }

    public static EnumC27358C5n valueOf(String str) {
        return (EnumC27358C5n) Enum.valueOf(EnumC27358C5n.class, str);
    }

    public static EnumC27358C5n[] values() {
        return (EnumC27358C5n[]) A01.clone();
    }

    public EnumC27358C5n(String str, int i) {
    }
}
