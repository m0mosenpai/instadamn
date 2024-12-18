package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.MXx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC50657MXx {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC50657MXx[] A03;
    public static final EnumC50657MXx A04;
    public static final EnumC50657MXx A05;
    public final int A00;

    static {
        EnumC50657MXx enumC50657MXx = new EnumC50657MXx("PHOTO", 0, 1);
        A04 = enumC50657MXx;
        EnumC50657MXx enumC50657MXx2 = new EnumC50657MXx("VIDEO", 1, 2);
        A05 = enumC50657MXx2;
        EnumC50657MXx[] enumC50657MXxArr = {enumC50657MXx, enumC50657MXx2, new EnumC50657MXx("CAROUSEL", 2, 8)};
        A03 = enumC50657MXxArr;
        A02 = AbstractC12190kN.A00(enumC50657MXxArr);
        EnumC50657MXx[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC50657MXx enumC50657MXx3 : values) {
            A18.put(Integer.valueOf(enumC50657MXx3.A00), enumC50657MXx3);
        }
        A01 = A18;
    }

    public static EnumC50657MXx valueOf(String str) {
        return (EnumC50657MXx) Enum.valueOf(EnumC50657MXx.class, str);
    }

    public static EnumC50657MXx[] values() {
        return (EnumC50657MXx[]) A03.clone();
    }

    public EnumC50657MXx(String str, int i, int i2) {
        this.A00 = i2;
    }
}
