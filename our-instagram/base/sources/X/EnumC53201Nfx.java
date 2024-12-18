package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nfx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53201Nfx {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53201Nfx[] A03;
    public static final EnumC53201Nfx A04;
    public final String A00 = "0";

    static {
        EnumC53201Nfx enumC53201Nfx = new EnumC53201Nfx();
        A04 = enumC53201Nfx;
        EnumC53201Nfx[] enumC53201NfxArr = {enumC53201Nfx};
        A03 = enumC53201NfxArr;
        A02 = AbstractC12190kN.A00(enumC53201NfxArr);
        EnumC53201Nfx[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC53201Nfx enumC53201Nfx2 : values) {
            A18.put(enumC53201Nfx2.A00, enumC53201Nfx2);
        }
        A01 = A18;
    }

    public static EnumC53201Nfx valueOf(String str) {
        return (EnumC53201Nfx) Enum.valueOf(EnumC53201Nfx.class, str);
    }

    public static EnumC53201Nfx[] values() {
        return (EnumC53201Nfx[]) A03.clone();
    }
}
