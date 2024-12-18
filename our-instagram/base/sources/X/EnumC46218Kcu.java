package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kcu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46218Kcu {
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ EnumC46218Kcu[] A05;
    public static final EnumC46218Kcu A06;
    public static final EnumC46218Kcu A07;
    public static final EnumC46218Kcu A08;
    public static final EnumC46218Kcu A09;
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public static EnumC46218Kcu valueOf(String str) {
        return (EnumC46218Kcu) Enum.valueOf(EnumC46218Kcu.class, str);
    }

    public static EnumC46218Kcu[] values() {
        return (EnumC46218Kcu[]) A05.clone();
    }

    static {
        EnumC46218Kcu enumC46218Kcu = new EnumC46218Kcu("RUPERT", "RUPERT", "🦴", 0, R.drawable.instapal_instapal_rupert, R.drawable.drawable_instapal_rupert);
        A08 = enumC46218Kcu;
        EnumC46218Kcu enumC46218Kcu2 = new EnumC46218Kcu("HUGO", "HUGO", "🥎", 1, R.drawable.instapal_instapal_hugo, R.drawable.drawable_instapal_hugo);
        A06 = enumC46218Kcu2;
        EnumC46218Kcu enumC46218Kcu3 = new EnumC46218Kcu("LUNA", "LUNA", "🧶", 2, R.drawable.instapal_instapal_luna, R.drawable.drawable_instapal_luna);
        A07 = enumC46218Kcu3;
        EnumC46218Kcu enumC46218Kcu4 = new EnumC46218Kcu("ZIGGY", "ZIGGY", "🌈", 3, R.drawable.instapal_instapal_ziggy, R.drawable.drawable_instapal_ziggy);
        A09 = enumC46218Kcu4;
        EnumC46218Kcu[] enumC46218KcuArr = {enumC46218Kcu, enumC46218Kcu2, enumC46218Kcu3, enumC46218Kcu4};
        A05 = enumC46218KcuArr;
        A04 = AbstractC12190kN.A00(enumC46218KcuArr);
    }

    public EnumC46218Kcu(String str, String str2, String str3, int i, int i2, int i3) {
        this.A02 = str2;
        this.A03 = str3;
        this.A01 = i2;
        this.A00 = i3;
    }
}
