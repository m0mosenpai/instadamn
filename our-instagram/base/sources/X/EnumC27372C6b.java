package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27372C6b {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27372C6b[] A01;
    public static final EnumC27372C6b A02;
    public static final EnumC27372C6b A03;
    public static final EnumC27372C6b A04;

    public static EnumC27372C6b valueOf(String str) {
        return (EnumC27372C6b) Enum.valueOf(EnumC27372C6b.class, str);
    }

    public static EnumC27372C6b[] values() {
        return (EnumC27372C6b[]) A01.clone();
    }

    static {
        EnumC27372C6b enumC27372C6b = new EnumC27372C6b("VScrollDynamicSizeGrid", 0);
        A03 = enumC27372C6b;
        EnumC27372C6b enumC27372C6b2 = new EnumC27372C6b("VScrollFixedSizeGrid", 1);
        A04 = enumC27372C6b2;
        EnumC27372C6b enumC27372C6b3 = new EnumC27372C6b("HScroll", 2);
        A02 = enumC27372C6b3;
        EnumC27372C6b[] enumC27372C6bArr = {enumC27372C6b, enumC27372C6b2, enumC27372C6b3};
        A01 = enumC27372C6bArr;
        A00 = AbstractC12190kN.A00(enumC27372C6bArr);
    }

    public EnumC27372C6b(String str, int i) {
    }
}
