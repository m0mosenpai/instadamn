package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27393C6w {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27393C6w[] A01;
    public static final EnumC27393C6w A02;
    public static final EnumC27393C6w A03;
    public static final EnumC27393C6w A04;
    public static final EnumC27393C6w A05;
    public static final EnumC27393C6w A06;

    static {
        EnumC27393C6w enumC27393C6w = new EnumC27393C6w("ARROW", 0);
        A02 = enumC27393C6w;
        EnumC27393C6w enumC27393C6w2 = new EnumC27393C6w("SPARKLE", 1);
        A06 = enumC27393C6w2;
        EnumC27393C6w enumC27393C6w3 = new EnumC27393C6w("CLEAR", 2);
        A03 = enumC27393C6w3;
        EnumC27393C6w enumC27393C6w4 = new EnumC27393C6w("RE_GENERATE", 3);
        A04 = enumC27393C6w4;
        EnumC27393C6w enumC27393C6w5 = new EnumC27393C6w("RE_GENERATE_OUTLINE_ONLY", 4);
        A05 = enumC27393C6w5;
        EnumC27393C6w[] enumC27393C6wArr = {enumC27393C6w, enumC27393C6w2, enumC27393C6w3, enumC27393C6w4, enumC27393C6w5};
        A01 = enumC27393C6wArr;
        A00 = AbstractC12190kN.A00(enumC27393C6wArr);
    }

    public static EnumC27393C6w valueOf(String str) {
        return (EnumC27393C6w) Enum.valueOf(EnumC27393C6w.class, str);
    }

    public static EnumC27393C6w[] values() {
        return (EnumC27393C6w[]) A01.clone();
    }

    public EnumC27393C6w(String str, int i) {
    }
}
