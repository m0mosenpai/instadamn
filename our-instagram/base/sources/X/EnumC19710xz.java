package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.0xz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC19710xz {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC19710xz[] A04;
    public static final EnumC19710xz A05;
    public final InterfaceC16660sJ A00;
    public final C55549Olj A01;
    public final InterfaceC16820sZ A02;

    static {
        C0LM c0lm = C0LM.A00;
        EnumC19710xz enumC19710xz = new EnumC19710xz(new C55549Olj(C0LC.A00), C0LL.A00, c0lm);
        A05 = enumC19710xz;
        EnumC19710xz[] enumC19710xzArr = {enumC19710xz};
        A04 = enumC19710xzArr;
        A03 = AbstractC12190kN.A00(enumC19710xzArr);
    }

    public EnumC19710xz(C55549Olj c55549Olj, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
        this.A02 = interfaceC16820sZ;
        this.A01 = c55549Olj;
    }

    public static EnumC19710xz valueOf(String str) {
        return (EnumC19710xz) Enum.valueOf(EnumC19710xz.class, str);
    }

    public static EnumC19710xz[] values() {
        return (EnumC19710xz[]) A04.clone();
    }

    public final C55549Olj A00() {
        return this.A01;
    }
}
