package X;

/* renamed from: X.Gex, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37479Gex {
    public static final EnumC39597He7 A00(String str) {
        if (str != null && str.length() != 0) {
            if (str.equalsIgnoreCase("not_boosted")) {
                return EnumC39597He7.A07;
            }
            if (str.equalsIgnoreCase("pending")) {
                return EnumC39597He7.A0A;
            }
            if (str.equalsIgnoreCase("boosted")) {
                return EnumC39597He7.A02;
            }
            if (str.equalsIgnoreCase("boosted_eligible")) {
                return EnumC39597He7.A03;
            }
            if (str.equalsIgnoreCase("not_approved")) {
                return EnumC39597He7.A06;
            }
            if (str.equalsIgnoreCase("finished")) {
                return EnumC39597He7.A05;
            }
            if (str.equalsIgnoreCase("unavailable")) {
                return EnumC39597He7.A0C;
            }
            if (str.equalsIgnoreCase("draft")) {
                return EnumC39597He7.A04;
            }
            if (str.equalsIgnoreCase("paused")) {
                return EnumC39597He7.A09;
            }
            if (str.equalsIgnoreCase("not_delivering")) {
                return EnumC39597He7.A08;
            }
            if (str.equalsIgnoreCase(MSV.A00(562))) {
                return EnumC39597He7.A0B;
            }
        }
        return EnumC39597He7.A0D;
    }
}
