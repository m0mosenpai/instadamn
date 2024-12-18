package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nin, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53337Nin implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC53337Nin[] A01;
    public static final EnumC53337Nin A02;
    public final String A00 = "ig_feed_composer_share_to_threads_toggle_enable";

    static {
        EnumC53337Nin enumC53337Nin = new EnumC53337Nin();
        A02 = enumC53337Nin;
        A01 = new EnumC53337Nin[]{enumC53337Nin};
    }

    public static EnumC53337Nin valueOf(String str) {
        return (EnumC53337Nin) Enum.valueOf(EnumC53337Nin.class, str);
    }

    public static EnumC53337Nin[] values() {
        return (EnumC53337Nin[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
