package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ner, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53138Ner {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53138Ner[] A01;
    public static final EnumC53138Ner A02;
    public static final EnumC53138Ner A03;
    public static final EnumC53138Ner A04;

    static {
        EnumC53138Ner enumC53138Ner = new EnumC53138Ner("TEST", 0);
        A04 = enumC53138Ner;
        EnumC53138Ner enumC53138Ner2 = new EnumC53138Ner("CONTROL", 1);
        A02 = enumC53138Ner2;
        EnumC53138Ner enumC53138Ner3 = new EnumC53138Ner("NOT_SET", 2);
        A03 = enumC53138Ner3;
        EnumC53138Ner[] enumC53138NerArr = {enumC53138Ner, enumC53138Ner2, enumC53138Ner3};
        A01 = enumC53138NerArr;
        A00 = AbstractC12190kN.A00(enumC53138NerArr);
    }

    public static EnumC53138Ner valueOf(String str) {
        return (EnumC53138Ner) Enum.valueOf(EnumC53138Ner.class, str);
    }

    public static EnumC53138Ner[] values() {
        return (EnumC53138Ner[]) A01.clone();
    }

    public EnumC53138Ner(String str, int i) {
    }
}
