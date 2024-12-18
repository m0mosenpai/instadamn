package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rfq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61136Rfq {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61136Rfq[] A01;
    public static final EnumC61136Rfq A02;
    public static final EnumC61136Rfq A03;
    public static final EnumC61136Rfq A04;
    public static final EnumC61136Rfq A05;
    public static final EnumC61136Rfq A06;
    public static final EnumC61136Rfq A07;

    static {
        EnumC61136Rfq enumC61136Rfq = new EnumC61136Rfq("STORAGE", 0);
        A05 = enumC61136Rfq;
        EnumC61136Rfq enumC61136Rfq2 = new EnumC61136Rfq("IMAGE", 1);
        A03 = enumC61136Rfq2;
        EnumC61136Rfq enumC61136Rfq3 = new EnumC61136Rfq("AUDIO", 2);
        A02 = enumC61136Rfq3;
        EnumC61136Rfq enumC61136Rfq4 = new EnumC61136Rfq("VIDEO", 3);
        A07 = enumC61136Rfq4;
        EnumC61136Rfq enumC61136Rfq5 = new EnumC61136Rfq("LOCATION", 4);
        A04 = enumC61136Rfq5;
        EnumC61136Rfq enumC61136Rfq6 = new EnumC61136Rfq("UNSPECIFIED", 5);
        A06 = enumC61136Rfq6;
        EnumC61136Rfq[] enumC61136RfqArr = {enumC61136Rfq, enumC61136Rfq2, enumC61136Rfq3, enumC61136Rfq4, enumC61136Rfq5, enumC61136Rfq6};
        A01 = enumC61136RfqArr;
        A00 = AbstractC12190kN.A00(enumC61136RfqArr);
    }

    public static EnumC61136Rfq valueOf(String str) {
        return (EnumC61136Rfq) Enum.valueOf(EnumC61136Rfq.class, str);
    }

    public static EnumC61136Rfq[] values() {
        return (EnumC61136Rfq[]) A01.clone();
    }

    public EnumC61136Rfq(String str, int i) {
    }
}
