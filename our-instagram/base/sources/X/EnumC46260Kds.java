package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kds, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46260Kds implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC46260Kds[] A01;
    public static final EnumC46260Kds A02;
    public final String A00 = "BARCELONA_LINK_PROTECTION_INTERSTITIAL";

    static {
        EnumC46260Kds enumC46260Kds = new EnumC46260Kds();
        A02 = enumC46260Kds;
        A01 = new EnumC46260Kds[]{enumC46260Kds};
    }

    public static EnumC46260Kds valueOf(String str) {
        return (EnumC46260Kds) Enum.valueOf(EnumC46260Kds.class, str);
    }

    public static EnumC46260Kds[] values() {
        return (EnumC46260Kds[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
