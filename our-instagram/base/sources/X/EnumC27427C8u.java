package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C8u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27427C8u implements InterfaceC31110Dls {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC27427C8u[] A02;
    public static final EnumC27427C8u A03;
    public static final EnumC27427C8u A04;
    public static final EnumC27427C8u A05;
    public final String A00;

    static {
        EnumC27427C8u enumC27427C8u = new EnumC27427C8u("CLIPS", 0, "clips");
        A05 = enumC27427C8u;
        EnumC27427C8u enumC27427C8u2 = new EnumC27427C8u("AUDIO", 1, "audios");
        A04 = enumC27427C8u2;
        EnumC27427C8u enumC27427C8u3 = new EnumC27427C8u("ACCOUNTS", 2, "accounts");
        A03 = enumC27427C8u3;
        EnumC27427C8u[] enumC27427C8uArr = {enumC27427C8u, enumC27427C8u2, enumC27427C8u3};
        A02 = enumC27427C8uArr;
        A01 = AbstractC12190kN.A00(enumC27427C8uArr);
    }

    public static EnumC27427C8u valueOf(String str) {
        return (EnumC27427C8u) Enum.valueOf(EnumC27427C8u.class, str);
    }

    public static EnumC27427C8u[] values() {
        return (EnumC27427C8u[]) A02.clone();
    }

    public EnumC27427C8u(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // X.InterfaceC31110Dls
    public final String BdD() {
        return this.A00;
    }
}
