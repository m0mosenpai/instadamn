package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9tN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC223309tN implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC223309tN[] A01;
    public static final EnumC223309tN A02;
    public final String A00 = "IN_THREAD_HEADERS";

    static {
        EnumC223309tN enumC223309tN = new EnumC223309tN();
        A02 = enumC223309tN;
        A01 = new EnumC223309tN[]{enumC223309tN};
    }

    public static EnumC223309tN valueOf(String str) {
        return (EnumC223309tN) Enum.valueOf(EnumC223309tN.class, str);
    }

    public static EnumC223309tN[] values() {
        return (EnumC223309tN[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
