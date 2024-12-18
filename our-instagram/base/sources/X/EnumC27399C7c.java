package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C7c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27399C7c {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC27399C7c[] A03;
    public static final EnumC27399C7c A04;
    public static final EnumC27399C7c A05;
    public final float A00;
    public final float A01;

    static {
        EnumC27399C7c enumC27399C7c = new EnumC27399C7c("MEDIUM", 12.0f, 8.0f, 0);
        A05 = enumC27399C7c;
        EnumC27399C7c enumC27399C7c2 = new EnumC27399C7c("LARGE", 16.0f, 14.0f, 1);
        A04 = enumC27399C7c2;
        EnumC27399C7c[] enumC27399C7cArr = {enumC27399C7c, enumC27399C7c2};
        A03 = enumC27399C7cArr;
        A02 = AbstractC12190kN.A00(enumC27399C7cArr);
    }

    public static EnumC27399C7c valueOf(String str) {
        return (EnumC27399C7c) Enum.valueOf(EnumC27399C7c.class, str);
    }

    public static EnumC27399C7c[] values() {
        return (EnumC27399C7c[]) A03.clone();
    }

    public EnumC27399C7c(String str, float f, float f2, int i) {
        this.A00 = f;
        this.A01 = f2;
    }
}
