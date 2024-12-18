package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nio, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53338Nio implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC53338Nio[] A01;
    public static final EnumC53338Nio A02;
    public final String A00 = "learn_more";

    static {
        EnumC53338Nio enumC53338Nio = new EnumC53338Nio();
        A02 = enumC53338Nio;
        A01 = new EnumC53338Nio[]{enumC53338Nio};
    }

    public static EnumC53338Nio valueOf(String str) {
        return (EnumC53338Nio) Enum.valueOf(EnumC53338Nio.class, str);
    }

    public static EnumC53338Nio[] values() {
        return (EnumC53338Nio[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
