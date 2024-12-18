package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.JdY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC44047JdY {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC44047JdY[] A02;
    public static final EnumC44047JdY A03;
    public static final EnumC44047JdY A04;
    public final int A00;

    static {
        EnumC44047JdY enumC44047JdY = new EnumC44047JdY("SENDER", 0, 1);
        A04 = enumC44047JdY;
        EnumC44047JdY enumC44047JdY2 = new EnumC44047JdY("RECEIVER", 1, 2);
        A03 = enumC44047JdY2;
        EnumC44047JdY[] enumC44047JdYArr = {enumC44047JdY, enumC44047JdY2};
        A02 = enumC44047JdYArr;
        A01 = AbstractC12190kN.A00(enumC44047JdYArr);
    }

    public static EnumC44047JdY valueOf(String str) {
        return (EnumC44047JdY) Enum.valueOf(EnumC44047JdY.class, str);
    }

    public static EnumC44047JdY[] values() {
        return (EnumC44047JdY[]) A02.clone();
    }

    public EnumC44047JdY(String str, int i, int i2) {
        this.A00 = i2;
    }
}
