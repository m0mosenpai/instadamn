package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rfb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61121Rfb {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61121Rfb[] A01;
    public static final EnumC61121Rfb A02;
    public static final EnumC61121Rfb A03;
    public static final EnumC61121Rfb A04;
    public static final EnumC61121Rfb A05;

    static {
        EnumC61121Rfb enumC61121Rfb = new EnumC61121Rfb("InvalidInput", 0);
        A03 = enumC61121Rfb;
        EnumC61121Rfb enumC61121Rfb2 = new EnumC61121Rfb("ValidInput", 1);
        A05 = enumC61121Rfb2;
        EnumC61121Rfb enumC61121Rfb3 = new EnumC61121Rfb("OperationInProgress", 2);
        A04 = enumC61121Rfb3;
        EnumC61121Rfb enumC61121Rfb4 = new EnumC61121Rfb("Error", 3);
        A02 = enumC61121Rfb4;
        EnumC61121Rfb[] enumC61121RfbArr = {enumC61121Rfb, enumC61121Rfb2, enumC61121Rfb3, enumC61121Rfb4};
        A01 = enumC61121RfbArr;
        A00 = AbstractC12190kN.A00(enumC61121RfbArr);
    }

    public static EnumC61121Rfb valueOf(String str) {
        return (EnumC61121Rfb) Enum.valueOf(EnumC61121Rfb.class, str);
    }

    public static EnumC61121Rfb[] values() {
        return (EnumC61121Rfb[]) A01.clone();
    }

    public EnumC61121Rfb(String str, int i) {
    }
}
