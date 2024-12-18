package X;

import android.graphics.Color;

/* loaded from: classes11.dex */
public final class WEU {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public static boolean A02(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            AbstractC63374Sil.A06("SsaStyle", AnonymousClass001.A0g("Failed to parse boolean value: '", str, "'"), e);
            return false;
        }
    }

    public static Integer A01(String str) {
        long parseLong;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            WDn.A01(AbstractC31175DnJ.A1S((parseLong > 4294967295L ? 1 : (parseLong == 4294967295L ? 0 : -1))));
            int A01 = AbstractC38301qK.A01(((parseLong >> 24) & 255) ^ 255);
            int A012 = AbstractC38301qK.A01((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(A01, AbstractC38301qK.A01(parseLong & 255), AbstractC38301qK.A01((parseLong >> 8) & 255), A012));
        } catch (IllegalArgumentException e) {
            AbstractC63374Sil.A06("SsaStyle", AnonymousClass001.A0g("Failed to parse color expression: '", str, "'"), e);
            return null;
        }
    }

    public WEU(Integer num, Integer num2, String str, float f, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A05 = str;
        this.A01 = i;
        this.A04 = num;
        this.A03 = num2;
        this.A00 = f;
        this.A06 = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A08 = z4;
        this.A02 = i2;
    }

    public static int A00(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC63374Sil.A04("SsaStyle", AnonymousClass001.A0R("Ignoring unknown alignment: ", str));
        return -1;
    }
}
