package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KbY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46134KbY {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46134KbY[] A01;
    public static final EnumC46134KbY A02;
    public static final EnumC46134KbY A03;

    static {
        EnumC46134KbY enumC46134KbY = new EnumC46134KbY("USER_MODEL_URL", 0);
        A03 = enumC46134KbY;
        EnumC46134KbY enumC46134KbY2 = new EnumC46134KbY("RENDER_CONFIG_HASH", 1);
        A02 = enumC46134KbY2;
        EnumC46134KbY[] enumC46134KbYArr = {enumC46134KbY, enumC46134KbY2};
        A01 = enumC46134KbYArr;
        A00 = AbstractC12190kN.A00(enumC46134KbYArr);
    }

    public static EnumC46134KbY valueOf(String str) {
        return (EnumC46134KbY) Enum.valueOf(EnumC46134KbY.class, str);
    }

    public static EnumC46134KbY[] values() {
        return (EnumC46134KbY[]) A01.clone();
    }

    public EnumC46134KbY(String str, int i) {
    }
}
