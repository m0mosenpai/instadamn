package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Xdh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72437Xdh implements InterfaceC30922DiZ {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC72437Xdh[] A02;
    public static final EnumC72437Xdh A03;
    public static final EnumC72437Xdh A04;
    public static final EnumC72437Xdh A05;
    public static final EnumC72437Xdh A06;
    public static final EnumC72437Xdh A07;
    public static final EnumC72437Xdh A08;
    public static final EnumC72437Xdh A09;
    public static final EnumC72437Xdh A0A;
    public static final EnumC72437Xdh A0B;
    public final String A00;

    static {
        EnumC72437Xdh enumC72437Xdh = new EnumC72437Xdh("OPTIMISTIC_DISPLAY_APP", 0, "Optimistic Display App");
        A03 = enumC72437Xdh;
        EnumC72437Xdh enumC72437Xdh2 = new EnumC72437Xdh("OPTIMISTIC_DISPLAY_APP_MEDIUM", 1, "Optimistic Display App Medium");
        A04 = enumC72437Xdh2;
        EnumC72437Xdh enumC72437Xdh3 = new EnumC72437Xdh("OPTIMISTIC_TEXT_APP", 2, "Optimistic Text App Regular");
        A05 = enumC72437Xdh3;
        EnumC72437Xdh enumC72437Xdh4 = new EnumC72437Xdh("OPTIMISTIC_TEXT_APP_REGULAR", 3, "Optimistic Text App Regular");
        A08 = enumC72437Xdh4;
        EnumC72437Xdh enumC72437Xdh5 = new EnumC72437Xdh("OPTIMISTIC_TEXT_APP_MEDIUM", 4, "Optimistic Text App Medium");
        A07 = enumC72437Xdh5;
        EnumC72437Xdh enumC72437Xdh6 = new EnumC72437Xdh("OPTIMISTIC_TEXT_APP_BOLD", 5, "Optimistic Text App Bold");
        A06 = enumC72437Xdh6;
        EnumC72437Xdh enumC72437Xdh7 = new EnumC72437Xdh("OPTIMISTIC_VF_APP_LITE", 6, "Optimistic VF App Lite");
        A09 = enumC72437Xdh7;
        EnumC72437Xdh enumC72437Xdh8 = new EnumC72437Xdh("SANS_SERIF", 7, "sans-serif");
        A0A = enumC72437Xdh8;
        EnumC72437Xdh enumC72437Xdh9 = new EnumC72437Xdh("SANS_SERIF_MEDIUM", 8, "sans-serif-medium");
        A0B = enumC72437Xdh9;
        EnumC72437Xdh[] enumC72437XdhArr = {enumC72437Xdh, enumC72437Xdh2, enumC72437Xdh3, enumC72437Xdh4, enumC72437Xdh5, enumC72437Xdh6, enumC72437Xdh7, enumC72437Xdh8, enumC72437Xdh9};
        A02 = enumC72437XdhArr;
        A01 = AbstractC12190kN.A00(enumC72437XdhArr);
    }

    public static EnumC72437Xdh valueOf(String str) {
        return (EnumC72437Xdh) Enum.valueOf(EnumC72437Xdh.class, str);
    }

    public static EnumC72437Xdh[] values() {
        return (EnumC72437Xdh[]) A02.clone();
    }

    public EnumC72437Xdh(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // X.InterfaceC30922DiZ
    public final String getValue() {
        return this.A00;
    }
}
