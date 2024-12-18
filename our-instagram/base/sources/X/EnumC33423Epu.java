package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Epu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33423Epu {
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ EnumC33423Epu[] A05;
    public static final EnumC33423Epu A06;
    public static final EnumC33423Epu A07;
    public static final EnumC33423Epu A08;
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;

    public static EnumC33423Epu valueOf(String str) {
        return (EnumC33423Epu) Enum.valueOf(EnumC33423Epu.class, str);
    }

    public static EnumC33423Epu[] values() {
        return (EnumC33423Epu[]) A05.clone();
    }

    static {
        EnumC33423Epu enumC33423Epu = new EnumC33423Epu("SHOUTOUT", "story_shoutout", 0, 0, 2131954976, 2131954975);
        A08 = enumC33423Epu;
        EnumC33423Epu enumC33423Epu2 = new EnumC33423Epu("MESSAGE", "direct_message", 1, 1, 2131954974, 2131954973);
        A07 = enumC33423Epu2;
        EnumC33423Epu enumC33423Epu3 = new EnumC33423Epu("CUSTOM", null, 2, 2, 2131954972, 2131954972);
        A06 = enumC33423Epu3;
        EnumC33423Epu[] enumC33423EpuArr = {enumC33423Epu, enumC33423Epu2, enumC33423Epu3};
        A05 = enumC33423EpuArr;
        A04 = AbstractC12190kN.A00(enumC33423EpuArr);
    }

    public EnumC33423Epu(String str, String str2, int i, int i2, int i3, int i4) {
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A03 = str2;
    }
}
