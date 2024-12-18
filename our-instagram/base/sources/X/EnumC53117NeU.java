package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53117NeU {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53117NeU[] A01;
    public static final EnumC53117NeU A02;
    public static final EnumC53117NeU A03;

    static {
        EnumC53117NeU enumC53117NeU = new EnumC53117NeU("CLIPS", 0);
        A02 = enumC53117NeU;
        EnumC53117NeU enumC53117NeU2 = new EnumC53117NeU("FEED", 1);
        A03 = enumC53117NeU2;
        EnumC53117NeU[] enumC53117NeUArr = {enumC53117NeU, enumC53117NeU2};
        A01 = enumC53117NeUArr;
        A00 = AbstractC12190kN.A00(enumC53117NeUArr);
    }

    public static EnumC53117NeU valueOf(String str) {
        return (EnumC53117NeU) Enum.valueOf(EnumC53117NeU.class, str);
    }

    public static EnumC53117NeU[] values() {
        return (EnumC53117NeU[]) A01.clone();
    }

    public EnumC53117NeU(String str, int i) {
    }
}
