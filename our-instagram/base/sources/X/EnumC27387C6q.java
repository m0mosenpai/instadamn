package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27387C6q {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27387C6q[] A01;
    public static final EnumC27387C6q A02;
    public static final EnumC27387C6q A03;
    public static final EnumC27387C6q A04;
    public static final EnumC27387C6q A05;

    static {
        EnumC27387C6q enumC27387C6q = new EnumC27387C6q("IMAGINE", 0);
        A02 = enumC27387C6q;
        EnumC27387C6q enumC27387C6q2 = new EnumC27387C6q("WRITE_WITH_AI", 1);
        A04 = enumC27387C6q2;
        EnumC27387C6q enumC27387C6q3 = new EnumC27387C6q("WRITE_WITH_AI_MMLLM", 2);
        A05 = enumC27387C6q3;
        EnumC27387C6q enumC27387C6q4 = new EnumC27387C6q("IMAGINE_EDIT", 3);
        A03 = enumC27387C6q4;
        EnumC27387C6q[] enumC27387C6qArr = {enumC27387C6q, enumC27387C6q2, enumC27387C6q3, enumC27387C6q4};
        A01 = enumC27387C6qArr;
        A00 = AbstractC12190kN.A00(enumC27387C6qArr);
    }

    public static EnumC27387C6q valueOf(String str) {
        return (EnumC27387C6q) Enum.valueOf(EnumC27387C6q.class, str);
    }

    public static EnumC27387C6q[] values() {
        return (EnumC27387C6q[]) A01.clone();
    }

    public EnumC27387C6q(String str, int i) {
    }
}
