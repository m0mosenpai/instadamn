package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C5o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27359C5o {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27359C5o[] A01;
    public static final EnumC27359C5o A02;
    public static final EnumC27359C5o A03;

    static {
        EnumC27359C5o enumC27359C5o = new EnumC27359C5o("EDIT", 0);
        A02 = enumC27359C5o;
        EnumC27359C5o enumC27359C5o2 = new EnumC27359C5o("VIEW", 1);
        A03 = enumC27359C5o2;
        EnumC27359C5o[] enumC27359C5oArr = {enumC27359C5o, enumC27359C5o2};
        A01 = enumC27359C5oArr;
        A00 = AbstractC12190kN.A00(enumC27359C5oArr);
    }

    public static EnumC27359C5o valueOf(String str) {
        return (EnumC27359C5o) Enum.valueOf(EnumC27359C5o.class, str);
    }

    public static EnumC27359C5o[] values() {
        return (EnumC27359C5o[]) A01.clone();
    }

    public EnumC27359C5o(String str, int i) {
    }
}
