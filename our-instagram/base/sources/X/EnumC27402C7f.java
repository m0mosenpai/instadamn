package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C7f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27402C7f {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC27402C7f[] A04;
    public static final EnumC27402C7f A05;
    public static final EnumC27402C7f A06;
    public static final EnumC27402C7f A07;
    public static final EnumC27402C7f A08;
    public static final EnumC27402C7f A09;
    public static final EnumC27402C7f A0A;
    public static final EnumC27402C7f A0B;
    public static final EnumC27402C7f A0C;
    public final int A00;
    public final EnumC166067ba A01;
    public final Integer A02;

    public static EnumC27402C7f valueOf(String str) {
        return (EnumC27402C7f) Enum.valueOf(EnumC27402C7f.class, str);
    }

    public static EnumC27402C7f[] values() {
        return (EnumC27402C7f[]) A04.clone();
    }

    static {
        EnumC166067ba enumC166067ba = EnumC166067ba.A04;
        Integer num = C05F.A00;
        EnumC27402C7f enumC27402C7f = new EnumC27402C7f(enumC166067ba, num, "TOP_COMMENTS", 0, 2131975698);
        A0B = enumC27402C7f;
        EnumC27402C7f enumC27402C7f2 = new EnumC27402C7f(enumC166067ba, num, "TOP_REPLIES", 1, 2131975701);
        A0C = enumC27402C7f2;
        EnumC27402C7f enumC27402C7f3 = new EnumC27402C7f(enumC166067ba, num, "FOR_YOU", 2, 2131962784);
        A05 = enumC27402C7f3;
        Integer num2 = C05F.A01;
        EnumC27402C7f enumC27402C7f4 = new EnumC27402C7f(enumC166067ba, num2, "NEWEST_FIRST", 3, 2131968491);
        A08 = enumC27402C7f4;
        EnumC27402C7f enumC27402C7f5 = new EnumC27402C7f(enumC166067ba, num2, "MOST_RECENT", 4, 2131966908);
        A07 = enumC27402C7f5;
        EnumC27402C7f enumC27402C7f6 = new EnumC27402C7f(enumC166067ba, C05F.A0C, "META_VERIFIED", 5, 2131966622);
        A06 = enumC27402C7f6;
        EnumC27402C7f enumC27402C7f7 = new EnumC27402C7f(EnumC166067ba.A05, num, "SUBSCRIBERS_ONLY", 6, 2131974823);
        A0A = enumC27402C7f7;
        EnumC27402C7f enumC27402C7f8 = new EnumC27402C7f(enumC166067ba, C05F.A0u, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 7, -1);
        A09 = enumC27402C7f8;
        EnumC27402C7f[] enumC27402C7fArr = {enumC27402C7f, enumC27402C7f2, enumC27402C7f3, enumC27402C7f4, enumC27402C7f5, enumC27402C7f6, enumC27402C7f7, enumC27402C7f8};
        A04 = enumC27402C7fArr;
        A03 = AbstractC12190kN.A00(enumC27402C7fArr);
    }

    public EnumC27402C7f(EnumC166067ba enumC166067ba, Integer num, String str, int i, int i2) {
        this.A00 = i2;
        this.A01 = enumC166067ba;
        this.A02 = num;
    }
}
