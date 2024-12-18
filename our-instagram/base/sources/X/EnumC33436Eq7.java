package X;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eq7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33436Eq7 {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC33436Eq7[] A03;
    public static final EnumC33436Eq7 A04;
    public final String A00;

    static {
        EnumC33436Eq7 enumC33436Eq7 = new EnumC33436Eq7("FIRST_PARTY", 0, "first_party");
        A04 = enumC33436Eq7;
        EnumC33436Eq7[] enumC33436Eq7Arr = {enumC33436Eq7, new EnumC33436Eq7("WEB", 1, "web")};
        A03 = enumC33436Eq7Arr;
        A02 = AbstractC12190kN.A00(enumC33436Eq7Arr);
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        for (EnumC33436Eq7 enumC33436Eq72 : values()) {
            builder.put(enumC33436Eq72.A00, enumC33436Eq72);
        }
        A01 = builder.build();
    }

    public static EnumC33436Eq7 valueOf(String str) {
        return (EnumC33436Eq7) Enum.valueOf(EnumC33436Eq7.class, str);
    }

    public static EnumC33436Eq7[] values() {
        return (EnumC33436Eq7[]) A03.clone();
    }

    public EnumC33436Eq7(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
