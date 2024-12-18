package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53175NfW {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53175NfW[] A01;
    public static final EnumC53175NfW A02;
    public static final EnumC53175NfW A03;
    public static final EnumC53175NfW A04;
    public static final EnumC53175NfW A05;
    public static final EnumC53175NfW A06;
    public static final EnumC53175NfW A07;

    static {
        EnumC53175NfW enumC53175NfW = new EnumC53175NfW(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A04 = enumC53175NfW;
        EnumC53175NfW enumC53175NfW2 = new EnumC53175NfW("RETURNING_FROM_COBROADCAST", 1);
        A06 = enumC53175NfW2;
        EnumC53175NfW enumC53175NfW3 = new EnumC53175NfW("LOADING", 2);
        A03 = enumC53175NfW3;
        EnumC53175NfW enumC53175NfW4 = new EnumC53175NfW("PAUSED", 3);
        A05 = enumC53175NfW4;
        EnumC53175NfW enumC53175NfW5 = new EnumC53175NfW("UNABLE_TO_LOAD", 4);
        A07 = enumC53175NfW5;
        EnumC53175NfW enumC53175NfW6 = new EnumC53175NfW("ENDED_FOR_SSI_CHECKPOINT", 5);
        A02 = enumC53175NfW6;
        EnumC53175NfW[] enumC53175NfWArr = {enumC53175NfW, enumC53175NfW2, enumC53175NfW3, enumC53175NfW4, enumC53175NfW5, enumC53175NfW6, new EnumC53175NfW("ENDED_NORMAL", 6)};
        A01 = enumC53175NfWArr;
        A00 = AbstractC12190kN.A00(enumC53175NfWArr);
    }

    public static EnumC53175NfW valueOf(String str) {
        return (EnumC53175NfW) Enum.valueOf(EnumC53175NfW.class, str);
    }

    public static EnumC53175NfW[] values() {
        return (EnumC53175NfW[]) A01.clone();
    }

    public EnumC53175NfW(String str, int i) {
    }
}
