package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2iQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC56332iQ {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC56332iQ[] A02;
    public static final EnumC56332iQ A03;
    public static final EnumC56332iQ A04;
    public static final EnumC56332iQ A05;
    public final int A00;

    static {
        EnumC56332iQ enumC56332iQ = new EnumC56332iQ(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, 0);
        A05 = enumC56332iQ;
        EnumC56332iQ enumC56332iQ2 = new EnumC56332iQ("CENTER_WITH_PADDING", 1, 1);
        A03 = enumC56332iQ2;
        EnumC56332iQ enumC56332iQ3 = new EnumC56332iQ("CENTER_WITH_PADDING_MAX", 2, 2);
        A04 = enumC56332iQ3;
        EnumC56332iQ[] enumC56332iQArr = {enumC56332iQ, enumC56332iQ2, enumC56332iQ3, new EnumC56332iQ("CENTER_MAX", 3, 3)};
        A02 = enumC56332iQArr;
        A01 = AbstractC12190kN.A00(enumC56332iQArr);
    }

    public static EnumC56332iQ valueOf(String str) {
        return (EnumC56332iQ) Enum.valueOf(EnumC56332iQ.class, str);
    }

    public static EnumC56332iQ[] values() {
        return (EnumC56332iQ[]) A02.clone();
    }

    public EnumC56332iQ(String str, int i, int i2) {
        this.A00 = i2;
    }
}
