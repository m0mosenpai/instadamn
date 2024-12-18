package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RgK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61159RgK {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC61159RgK[] A02;
    public static final EnumC61159RgK A03;
    public static final EnumC61159RgK A04;
    public static final EnumC61159RgK A05;
    public static final EnumC61159RgK A06;
    public static final EnumC61159RgK A07;
    public final int A00;

    public static EnumC61159RgK valueOf(String str) {
        return (EnumC61159RgK) Enum.valueOf(EnumC61159RgK.class, str);
    }

    public static EnumC61159RgK[] values() {
        return (EnumC61159RgK[]) A02.clone();
    }

    static {
        EnumC61159RgK enumC61159RgK = new EnumC61159RgK("PERF_MARKERS", 0, 0);
        A06 = enumC61159RgK;
        EnumC61159RgK enumC61159RgK2 = new EnumC61159RgK("DISPATCH_UI", 1, 1);
        A03 = enumC61159RgK2;
        EnumC61159RgK enumC61159RgK3 = new EnumC61159RgK("NATIVE_ANIMATED_MODULE", 2, 2);
        A05 = enumC61159RgK3;
        EnumC61159RgK enumC61159RgK4 = new EnumC61159RgK("TIMERS_EVENTS", 3, 3);
        A07 = enumC61159RgK4;
        EnumC61159RgK enumC61159RgK5 = new EnumC61159RgK("IDLE_EVENT", 4, 4);
        A04 = enumC61159RgK5;
        EnumC61159RgK[] enumC61159RgKArr = {enumC61159RgK, enumC61159RgK2, enumC61159RgK3, enumC61159RgK4, enumC61159RgK5};
        A02 = enumC61159RgKArr;
        A01 = AbstractC12190kN.A00(enumC61159RgKArr);
    }

    public EnumC61159RgK(String str, int i, int i2) {
        this.A00 = i2;
    }
}
