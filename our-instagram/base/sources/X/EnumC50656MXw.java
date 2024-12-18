package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.MXw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC50656MXw {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC50656MXw[] A03;
    public static final EnumC50656MXw A04;
    public static final EnumC50656MXw A05;
    public final int A00;

    public static EnumC50656MXw valueOf(String str) {
        return (EnumC50656MXw) Enum.valueOf(EnumC50656MXw.class, str);
    }

    public static EnumC50656MXw[] values() {
        return (EnumC50656MXw[]) A03.clone();
    }

    static {
        EnumC50656MXw enumC50656MXw = new EnumC50656MXw("PHOTO", 0, 1);
        A04 = enumC50656MXw;
        EnumC50656MXw enumC50656MXw2 = new EnumC50656MXw("VIDEO", 1, 2);
        A05 = enumC50656MXw2;
        EnumC50656MXw[] enumC50656MXwArr = {enumC50656MXw, enumC50656MXw2, new EnumC50656MXw("CAROUSEL", 2, 8)};
        A03 = enumC50656MXwArr;
        A02 = AbstractC12190kN.A00(enumC50656MXwArr);
        EnumC50656MXw[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC50656MXw enumC50656MXw3 : values) {
            A18.put(Integer.valueOf(enumC50656MXw3.A00), enumC50656MXw3);
        }
        A01 = A18;
    }

    public EnumC50656MXw(String str, int i, int i2) {
        this.A00 = i2;
    }
}
