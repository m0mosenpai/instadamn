package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nip, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53339Nip implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC53339Nip[] A01;
    public static final EnumC53339Nip A02;
    public final String A00 = "impression";

    static {
        EnumC53339Nip enumC53339Nip = new EnumC53339Nip();
        A02 = enumC53339Nip;
        A01 = new EnumC53339Nip[]{enumC53339Nip};
    }

    public static EnumC53339Nip valueOf(String str) {
        return (EnumC53339Nip) Enum.valueOf(EnumC53339Nip.class, str);
    }

    public static EnumC53339Nip[] values() {
        return (EnumC53339Nip[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
