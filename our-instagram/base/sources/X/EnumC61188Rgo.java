package X;

import java.util.regex.Pattern;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rgo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61188Rgo {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC61188Rgo[] A04;
    public static final EnumC61188Rgo A05;
    public static final EnumC61188Rgo A06;
    public static final EnumC61188Rgo A07;
    public static final EnumC61188Rgo A08;
    public static final EnumC61188Rgo A09;
    public static final EnumC61188Rgo A0A;
    public static final EnumC61188Rgo A0B;
    public final int A00;
    public final String A01;
    public final Pattern A02;

    static {
        Pattern compile = Pattern.compile("");
        C14360o3.A07(compile);
        A0A = new EnumC61188Rgo("UNKNOWN", "unknown", compile, 0, 16);
        Pattern compile2 = Pattern.compile("^3[47]");
        C14360o3.A07(compile2);
        A05 = new EnumC61188Rgo("AMEX", "american_express", compile2, 1, 15);
        Pattern compile3 = Pattern.compile("^(6011|6520|6521[0-4]|6531[5-9]|653[2-9]|64[4-9]|622([2-8]|1[3-9]|12[6-9]|9[0-1]|92[0-5]))");
        C14360o3.A07(compile3);
        A06 = new EnumC61188Rgo("DISCOVER", "discover", compile3, 2, 16);
        Pattern compile4 = Pattern.compile("^35(2[8-9]|[3-8])");
        C14360o3.A07(compile4);
        A07 = new EnumC61188Rgo("JCB", "jcb", compile4, 3, 16);
        Pattern compile5 = Pattern.compile("((^5[1-5])|(^2(?:2(?:2[1-9]|[3-9])|[3-6]|7(?:[01]|20))))");
        C14360o3.A07(compile5);
        A08 = new EnumC61188Rgo("MASTER_CARD", "master_card", compile5, 4, 16);
        Pattern compile6 = Pattern.compile("^(508[5-9]|6521[5-9]|652[2-9]|6530|6531[0-4]|60[6-8])");
        C14360o3.A07(compile6);
        A09 = new EnumC61188Rgo("RUPAY", "rupay", compile6, 5, 16);
        Pattern compile7 = Pattern.compile("^4");
        C14360o3.A07(compile7);
        EnumC61188Rgo enumC61188Rgo = new EnumC61188Rgo("VISA", "visa", compile7, 6, 16);
        A0B = enumC61188Rgo;
        EnumC61188Rgo[] enumC61188RgoArr = {A0A, A05, A06, A07, A08, A09, enumC61188Rgo};
        A04 = enumC61188RgoArr;
        A03 = AbstractC12190kN.A00(enumC61188RgoArr);
    }

    public static EnumC61188Rgo valueOf(String str) {
        return (EnumC61188Rgo) Enum.valueOf(EnumC61188Rgo.class, str);
    }

    public static EnumC61188Rgo[] values() {
        return (EnumC61188Rgo[]) A04.clone();
    }

    public EnumC61188Rgo(String str, String str2, Pattern pattern, int i, int i2) {
        this.A02 = pattern;
        this.A00 = i2;
        this.A01 = str2;
    }
}
