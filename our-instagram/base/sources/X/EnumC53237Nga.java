package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nga, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53237Nga {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53237Nga[] A02;
    public static final EnumC53237Nga A03;
    public static final EnumC53237Nga A04;
    public static final EnumC53237Nga A05;
    public static final EnumC53237Nga A06;
    public static final EnumC53237Nga A07;
    public static final EnumC53237Nga A08;
    public static final EnumC53237Nga A09;
    public final Integer A00;

    static {
        Integer num = C05F.A00;
        EnumC53237Nga enumC53237Nga = new EnumC53237Nga("TYPE_UNKNOWN", 0, num);
        A09 = enumC53237Nga;
        EnumC53237Nga enumC53237Nga2 = new EnumC53237Nga("TYPE_SWITCH", 1, C05F.A04);
        A08 = enumC53237Nga2;
        EnumC53237Nga enumC53237Nga3 = new EnumC53237Nga("TYPE_RADIO", 2, C05F.A02);
        A07 = enumC53237Nga3;
        EnumC53237Nga enumC53237Nga4 = new EnumC53237Nga("TYPE_CHECKBOX", 3, C05F.A0C);
        A03 = enumC53237Nga4;
        EnumC53237Nga enumC53237Nga5 = new EnumC53237Nga("TYPE_CHEVRON", 4, num);
        A04 = enumC53237Nga5;
        EnumC53237Nga enumC53237Nga6 = new EnumC53237Nga("TYPE_PROGRESS", 5, C05F.A0A);
        A06 = enumC53237Nga6;
        EnumC53237Nga enumC53237Nga7 = new EnumC53237Nga("TYPE_DISMISS", 6, C05F.A01);
        A05 = enumC53237Nga7;
        EnumC53237Nga[] enumC53237NgaArr = {enumC53237Nga, enumC53237Nga2, enumC53237Nga3, enumC53237Nga4, enumC53237Nga5, enumC53237Nga6, enumC53237Nga7};
        A02 = enumC53237NgaArr;
        A01 = AbstractC12190kN.A00(enumC53237NgaArr);
    }

    public static EnumC53237Nga valueOf(String str) {
        return (EnumC53237Nga) Enum.valueOf(EnumC53237Nga.class, str);
    }

    public static EnumC53237Nga[] values() {
        return (EnumC53237Nga[]) A02.clone();
    }

    public EnumC53237Nga(String str, int i, Integer num) {
        this.A00 = num;
    }
}
