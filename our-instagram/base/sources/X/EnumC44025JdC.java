package X;

import com.facebook.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.JdC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC44025JdC {
    public static final Map A06;
    public static final /* synthetic */ EnumEntries A07;
    public static final /* synthetic */ EnumC44025JdC[] A08;
    public static final EnumC44025JdC A09;
    public static final EnumC44025JdC A0A;
    public static final EnumC44025JdC A0B;
    public static final EnumC44025JdC A0C;
    public static final EnumC44025JdC A0D;
    public static final EnumC44025JdC A0E;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;
    public final boolean A05;

    static {
        EnumC44025JdC enumC44025JdC = new EnumC44025JdC("DEFAULT", 0, 0, 0, 0, 0, false, false);
        A09 = enumC44025JdC;
        EnumC44025JdC enumC44025JdC2 = new EnumC44025JdC("NEW_THREADS_THROTTLED_BANNER", 1, 1, R.drawable.instagram_warning_pano_outline_24, 2131968486, 2, true, true);
        A0D = enumC44025JdC2;
        EnumC44025JdC enumC44025JdC3 = new EnumC44025JdC("NEW_THREADS_THROTTLED_LIGHT_BANNER", 2, 2, 0, 2131968489, 2, false, false);
        A0E = enumC44025JdC3;
        EnumC44025JdC enumC44025JdC4 = new EnumC44025JdC("GENERAL_FOLDER_HMPS_BANNER", 3, 3, R.drawable.instagram_error_pano_outline_24, 2131963641, 4, true, true);
        A0A = enumC44025JdC4;
        EnumC44025JdC enumC44025JdC5 = new EnumC44025JdC("GENERAL_FOLDER_HMPS_LIGHT_BANNER", 4, 4, 0, 2131963643, 4, false, false);
        A0B = enumC44025JdC5;
        EnumC44025JdC enumC44025JdC6 = new EnumC44025JdC("GENERAL_FOLDER_RECOVERED_BANNER", 5, 5, R.drawable.instagram_info_pano_outline_24, 2131963645, 0, true, true);
        A0C = enumC44025JdC6;
        EnumC44025JdC[] enumC44025JdCArr = {enumC44025JdC, enumC44025JdC2, enumC44025JdC3, enumC44025JdC4, enumC44025JdC5, enumC44025JdC6};
        A08 = enumC44025JdCArr;
        A07 = AbstractC12190kN.A00(enumC44025JdCArr);
        EnumC44025JdC[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC44025JdC enumC44025JdC7 : values) {
            A18.put(Integer.valueOf(enumC44025JdC7.A02), enumC44025JdC7);
        }
        A06 = A18;
    }

    public static EnumC44025JdC valueOf(String str) {
        return (EnumC44025JdC) Enum.valueOf(EnumC44025JdC.class, str);
    }

    public static EnumC44025JdC[] values() {
        return (EnumC44025JdC[]) A08.clone();
    }

    public EnumC44025JdC(String str, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        this.A02 = i2;
        this.A04 = z;
        this.A01 = i3;
        this.A00 = i4;
        this.A05 = z2;
        this.A03 = i5;
    }
}
