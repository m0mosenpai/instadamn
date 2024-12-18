package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C5y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27369C5y {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27369C5y[] A01;
    public static final EnumC27369C5y A02;
    public static final EnumC27369C5y A03;

    static {
        EnumC27369C5y enumC27369C5y = new EnumC27369C5y("TRIGGER_MUTE", 0);
        A03 = enumC27369C5y;
        EnumC27369C5y enumC27369C5y2 = new EnumC27369C5y("CANCEL", 1);
        A02 = enumC27369C5y2;
        EnumC27369C5y[] enumC27369C5yArr = {enumC27369C5y, enumC27369C5y2};
        A01 = enumC27369C5yArr;
        A00 = AbstractC12190kN.A00(enumC27369C5yArr);
    }

    public static EnumC27369C5y valueOf(String str) {
        return (EnumC27369C5y) Enum.valueOf(EnumC27369C5y.class, str);
    }

    public static EnumC27369C5y[] values() {
        return (EnumC27369C5y[]) A01.clone();
    }

    public EnumC27369C5y(String str, int i) {
    }
}
