package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nfr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53195Nfr {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53195Nfr[] A02;
    public static final EnumC53195Nfr A03;
    public final EnumC58132lV A00;

    static {
        EnumC53195Nfr enumC53195Nfr = new EnumC53195Nfr(EnumC58132lV.A04);
        A03 = enumC53195Nfr;
        EnumC53195Nfr[] enumC53195NfrArr = {enumC53195Nfr};
        A02 = enumC53195NfrArr;
        A01 = AbstractC12190kN.A00(enumC53195NfrArr);
    }

    public EnumC53195Nfr(EnumC58132lV enumC58132lV) {
        this.A00 = enumC58132lV;
    }

    public static EnumC53195Nfr valueOf(String str) {
        return (EnumC53195Nfr) Enum.valueOf(EnumC53195Nfr.class, str);
    }

    public static EnumC53195Nfr[] values() {
        return (EnumC53195Nfr[]) A02.clone();
    }
}
