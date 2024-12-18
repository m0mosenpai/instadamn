package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kdv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46263Kdv implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC46263Kdv[] A01;
    public static final EnumC46263Kdv A02;
    public final String A00 = "SUGGESTED_AUDIO_PILL";

    static {
        EnumC46263Kdv enumC46263Kdv = new EnumC46263Kdv();
        A02 = enumC46263Kdv;
        A01 = new EnumC46263Kdv[]{enumC46263Kdv};
    }

    public static EnumC46263Kdv valueOf(String str) {
        return (EnumC46263Kdv) Enum.valueOf(EnumC46263Kdv.class, str);
    }

    public static EnumC46263Kdv[] values() {
        return (EnumC46263Kdv[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
