package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hdp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39579Hdp {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39579Hdp[] A03;
    public static final EnumC39579Hdp A04;
    public static final EnumC39579Hdp A05;
    public static final EnumC39579Hdp A06;
    public static final EnumC39579Hdp A07;
    public static final EnumC39579Hdp A08;
    public static final EnumC39579Hdp A09;
    public final String A00;

    static {
        EnumC39579Hdp enumC39579Hdp = new EnumC39579Hdp("HEARTBEAT", 0, "HEARTBEAT");
        A05 = enumC39579Hdp;
        EnumC39579Hdp enumC39579Hdp2 = new EnumC39579Hdp("STARTED", 1, "STARTED");
        A09 = enumC39579Hdp2;
        EnumC39579Hdp enumC39579Hdp3 = new EnumC39579Hdp("ENDED", 2, "ENDED");
        A04 = enumC39579Hdp3;
        EnumC39579Hdp enumC39579Hdp4 = new EnumC39579Hdp("JOINED", 3, "JOINED");
        A06 = enumC39579Hdp4;
        EnumC39579Hdp enumC39579Hdp5 = new EnumC39579Hdp("LEFT", 4, "LEFT");
        A07 = enumC39579Hdp5;
        EnumC39579Hdp enumC39579Hdp6 = new EnumC39579Hdp("QUESTION_ACTIVATED", 5, "QUESTION_ACTIVATED");
        A08 = enumC39579Hdp6;
        EnumC39579Hdp[] enumC39579HdpArr = {enumC39579Hdp, enumC39579Hdp2, enumC39579Hdp3, enumC39579Hdp4, enumC39579Hdp5, enumC39579Hdp6, new EnumC39579Hdp("QUESTION_DEACTIVATED", 6, "QUESTION_DEACTIVATED")};
        A03 = enumC39579HdpArr;
        A02 = AbstractC12190kN.A00(enumC39579HdpArr);
        EnumC39579Hdp[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39579Hdp enumC39579Hdp7 : values) {
            A18.put(enumC39579Hdp7.A00, enumC39579Hdp7);
        }
        A01 = A18;
    }

    public static EnumC39579Hdp valueOf(String str) {
        return (EnumC39579Hdp) Enum.valueOf(EnumC39579Hdp.class, str);
    }

    public static EnumC39579Hdp[] values() {
        return (EnumC39579Hdp[]) A03.clone();
    }

    public EnumC39579Hdp(String str, int i, String str2) {
        this.A00 = str2;
    }
}
