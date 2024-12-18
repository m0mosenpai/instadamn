package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Gqs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC38187Gqs {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC38187Gqs[] A03;
    public static final EnumC38187Gqs A04;
    public static final EnumC38187Gqs A05;
    public static final EnumC38187Gqs A06;
    public static final EnumC38187Gqs A07;
    public static final EnumC38187Gqs A08;
    public static final EnumC38187Gqs A09;
    public static final EnumC38187Gqs A0A;
    public final String A00;

    static {
        EnumC38187Gqs enumC38187Gqs = new EnumC38187Gqs("NOT_INVALIDATE", 0, "not_invalidate");
        A07 = enumC38187Gqs;
        EnumC38187Gqs enumC38187Gqs2 = new EnumC38187Gqs("SEEN_STATE", 1, "seen");
        A08 = enumC38187Gqs2;
        EnumC38187Gqs enumC38187Gqs3 = new EnumC38187Gqs("APP_INSTALL", 2, "app_install");
        A06 = enumC38187Gqs3;
        EnumC38187Gqs enumC38187Gqs4 = new EnumC38187Gqs("X_OUT", 3, "x-out");
        A0A = enumC38187Gqs4;
        EnumC38187Gqs enumC38187Gqs5 = new EnumC38187Gqs("ADS_INSERTED", 4, "ads_inserted");
        A04 = enumC38187Gqs5;
        EnumC38187Gqs enumC38187Gqs6 = new EnumC38187Gqs("ADS_POOL", 5, "ads_pool");
        A05 = enumC38187Gqs6;
        EnumC38187Gqs enumC38187Gqs7 = new EnumC38187Gqs("UNKNOWN", 6, "unknown");
        A09 = enumC38187Gqs7;
        EnumC38187Gqs[] enumC38187GqsArr = {enumC38187Gqs, enumC38187Gqs2, enumC38187Gqs3, enumC38187Gqs4, enumC38187Gqs5, enumC38187Gqs6, enumC38187Gqs7};
        A03 = enumC38187GqsArr;
        A02 = AbstractC12190kN.A00(enumC38187GqsArr);
        EnumC38187Gqs[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC38187Gqs enumC38187Gqs8 : values) {
            A18.put(enumC38187Gqs8.A00, enumC38187Gqs8);
        }
        A01 = A18;
    }

    public static EnumC38187Gqs valueOf(String str) {
        return (EnumC38187Gqs) Enum.valueOf(EnumC38187Gqs.class, str);
    }

    public static EnumC38187Gqs[] values() {
        return (EnumC38187Gqs[]) A03.clone();
    }

    public EnumC38187Gqs(String str, int i, String str2) {
        this.A00 = str2;
    }
}
