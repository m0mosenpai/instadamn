package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Xc6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72370Xc6 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC72370Xc6[] A02;
    public static final EnumC72370Xc6 A03;
    public static final EnumC72370Xc6 A04;
    public static final EnumC72370Xc6 A05;
    public final Integer A00;

    static {
        EnumC72370Xc6 enumC72370Xc6 = new EnumC72370Xc6("IMPRESSION", 0, C05F.A00);
        A03 = enumC72370Xc6;
        EnumC72370Xc6 enumC72370Xc62 = new EnumC72370Xc6("PRIMARY_ACTION", 1, C05F.A01);
        A04 = enumC72370Xc62;
        EnumC72370Xc6 enumC72370Xc63 = new EnumC72370Xc6("SECONDARY_ACTION", 2, C05F.A0C);
        A05 = enumC72370Xc63;
        EnumC72370Xc6[] enumC72370Xc6Arr = {enumC72370Xc6, enumC72370Xc62, enumC72370Xc63, new EnumC72370Xc6("DISMISS_ACTION", 3, C05F.A0N)};
        A02 = enumC72370Xc6Arr;
        A01 = AbstractC12190kN.A00(enumC72370Xc6Arr);
    }

    public static EnumC72370Xc6 valueOf(String str) {
        return (EnumC72370Xc6) Enum.valueOf(EnumC72370Xc6.class, str);
    }

    public static EnumC72370Xc6[] values() {
        return (EnumC72370Xc6[]) A02.clone();
    }

    public EnumC72370Xc6(String str, int i, Integer num) {
        this.A00 = num;
    }
}
