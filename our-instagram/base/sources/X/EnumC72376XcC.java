package X;

import android.util.SparseArray;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.XcC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72376XcC {
    public static final SparseArray A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC72376XcC[] A03;
    public static final EnumC72376XcC A04;
    public static final EnumC72376XcC A05;
    public static final EnumC72376XcC A06;
    public static final EnumC72376XcC A07;
    public static final EnumC72376XcC A08;
    public static final EnumC72376XcC A09;
    public static final EnumC72376XcC A0A;
    public static final EnumC72376XcC A0B;
    public static final EnumC72376XcC A0C;
    public static final EnumC72376XcC A0D;
    public final int A00;

    static {
        EnumC72376XcC enumC72376XcC = new EnumC72376XcC(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, 0);
        A07 = enumC72376XcC;
        EnumC72376XcC enumC72376XcC2 = new EnumC72376XcC("BOLD", 1, 1);
        A04 = enumC72376XcC2;
        EnumC72376XcC enumC72376XcC3 = new EnumC72376XcC("ITALIC", 2, 2);
        A06 = enumC72376XcC3;
        EnumC72376XcC enumC72376XcC4 = new EnumC72376XcC("UNDERLINE", 3, 3);
        A0D = enumC72376XcC4;
        EnumC72376XcC enumC72376XcC5 = new EnumC72376XcC("CODE", 4, 8);
        A05 = enumC72376XcC5;
        EnumC72376XcC enumC72376XcC6 = new EnumC72376XcC("STRIKETHROUGH", 5, 16);
        A0A = enumC72376XcC6;
        EnumC72376XcC enumC72376XcC7 = new EnumC72376XcC("SUBSCRIPT", 6, 32);
        A0B = enumC72376XcC7;
        EnumC72376XcC enumC72376XcC8 = new EnumC72376XcC("SUPERSCRIPT", 7, 64);
        A0C = enumC72376XcC8;
        EnumC72376XcC enumC72376XcC9 = new EnumC72376XcC("QUOTE", 8, 128);
        A08 = enumC72376XcC9;
        EnumC72376XcC enumC72376XcC10 = new EnumC72376XcC("SEMIBOLD", 9, C3OO.FLAG_MOVED);
        A09 = enumC72376XcC10;
        EnumC72376XcC[] enumC72376XcCArr = {enumC72376XcC, enumC72376XcC2, enumC72376XcC3, enumC72376XcC4, enumC72376XcC5, enumC72376XcC6, enumC72376XcC7, enumC72376XcC8, enumC72376XcC9, enumC72376XcC10};
        A03 = enumC72376XcCArr;
        A02 = AbstractC12190kN.A00(enumC72376XcCArr);
        A01 = new SparseArray();
        for (EnumC72376XcC enumC72376XcC11 : values()) {
            A01.put(enumC72376XcC11.A00, enumC72376XcC11);
        }
    }

    public static EnumC72376XcC valueOf(String str) {
        return (EnumC72376XcC) Enum.valueOf(EnumC72376XcC.class, str);
    }

    public static EnumC72376XcC[] values() {
        return (EnumC72376XcC[]) A03.clone();
    }

    public EnumC72376XcC(String str, int i, int i2) {
        this.A00 = i2;
    }
}
