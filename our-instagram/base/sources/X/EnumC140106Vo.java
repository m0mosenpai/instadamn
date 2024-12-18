package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6Vo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC140106Vo {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC140106Vo[] A01;
    public static final EnumC140106Vo A02;
    public static final EnumC140106Vo A03;
    public static final EnumC140106Vo A04;

    static {
        EnumC140106Vo enumC140106Vo = new EnumC140106Vo("SIGNAL_ARGS", 0);
        A04 = enumC140106Vo;
        EnumC140106Vo enumC140106Vo2 = new EnumC140106Vo("DEPENDENCIES", 1);
        A02 = enumC140106Vo2;
        EnumC140106Vo enumC140106Vo3 = new EnumC140106Vo("LAYOUT_CONTEXT", 2);
        A03 = enumC140106Vo3;
        EnumC140106Vo[] enumC140106VoArr = {enumC140106Vo, enumC140106Vo2, enumC140106Vo3, new EnumC140106Vo("CURRENT_SIGNAL", 3)};
        A01 = enumC140106VoArr;
        A00 = AbstractC12190kN.A00(enumC140106VoArr);
    }

    public static EnumC140106Vo valueOf(String str) {
        return (EnumC140106Vo) Enum.valueOf(EnumC140106Vo.class, str);
    }

    public static EnumC140106Vo[] values() {
        return (EnumC140106Vo[]) A01.clone();
    }

    public EnumC140106Vo(String str, int i) {
    }
}
